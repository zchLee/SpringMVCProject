##### springMVC搭建过程
1. 导入jar
2. 在web.xml中配置springMVC核心(前端控制器) DispatcherServlet自动加载配置文件，此时配置文件有默认的位置和名称
    默认位置：WEB-INF下 默认名称：<servlet-name>-servlet.xml
    当加载了配置文件，springMVC就会根据扫描配置文件找到控制层
    <servlet>
        <servlet-name>springMVC</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>springMVC</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
3. 创建一个POJO，在类上加上@Controller注解，springmvc就会将此类作为控制层加载，让其处理响应


### 整合spring时的问题
1.整合spring时，在web.xml中配置监听器，加载配置文件，这里用Spring提供的ContextLoaderListener

2.bean被创建两次的问题：
    在springmvc中只扫描控制层，在spring中，通过包含或排除对扫描包进行指定  
    
3. spring和springMvc的关系：
    spring是父容器
    springMVC是子容器
    规定：子容器能够访问父容器中的bean，父容器不能访问子容器中的bean