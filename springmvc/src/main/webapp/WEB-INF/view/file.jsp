<%--
  Created by IntelliJ IDEA.
  User: liam
  Date: 2020-10-19
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="down"> 下载</a>

    <br/>
    <br/>
    <br/>
    <form action="up" method="post" enctype="multipart/form-data">
        头像：<input type="file" name="uploadFile">
        描述：<input type="text" name="desc">
        <input type="submit" value="上传">
    </form>
</body>
</html>
