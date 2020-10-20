package com.lea.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lzc
 * @create 2020-10-19 11:08
 */
@Controller
public class DownController {

    @RequestMapping("/file")
    public String file() {
        return "file";
    }

    @RequestMapping("/down")
    public ResponseEntity<byte[]> down(HttpSession session) throws IOException {
//        InputStream is = new FileInputStream("img/悬崖上的金鱼姬.png");
        // 获取服务器真实路径,img文件夹的路径
        String realPath = session.getServletContext().getRealPath("img");
        String filePath = realPath + File.separator + "悬崖上的金鱼姬.png";
//        System.out.println(filePath);
        InputStream is = new FileInputStream(filePath);
        int available = is.available();// 获取输入流读取文件的最大字节流数
        byte[] body = new byte[available];
        is.read(body);

        // 设置请求头
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=beauty.png");

        ResponseEntity <byte[]> entity = new ResponseEntity<>(body, headers, HttpStatus.OK);
        return entity;
    }

    @RequestMapping(value = "/up", method = RequestMethod.POST)
    public String up(String desc, MultipartFile uploadFile, HttpSession session) throws IOException {
        String originalFilename = uploadFile.getOriginalFilename();
        // ide工具中，此文件不会自动编译到target目录中，需要手动添加或者，在photo中加入文件，就可以自动编译了
        String realPath = session.getServletContext().getRealPath("photo");
        OutputStream os = new FileOutputStream(realPath + File.separator + originalFilename);
        os.write(uploadFile.getBytes());
        os.close();
        return "success";
    }
}
