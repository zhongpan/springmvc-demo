# springmvc-demo

此示例是happyBKs的[博文](https://my.oschina.net/happyBKs?tab=newest&catalogId=436090)实现代码，感谢其分享。
#### 1. [SpringMVC笔记系列（1）——用一个例子帮你入门](https://my.oschina.net/happyBKs/blog/411547)
静态资源如jpg,html无法访问
[SpringMVC中css,js,图片等静态资源被拦截的解决办法](https://blog.csdn.net/shixin_li/article/details/80576753)
#### 2. [SpringMVC笔记系列（2）——@RequestMapping请求映射物理视图解析](https://my.oschina.net/happyBKs/blog/411861)
要设置base，否则资源路径不对
```
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
    pageContext.setAttribute("basePath",basePath);    
%>
<base href="<%=basePath%>">
```
#### 3. [SpringMVC笔记系列（3）——@RequestMapping请求value和method属性](https://my.oschina.net/happyBKs/blog/412005)
#### 4. [springMVC笔记系列(4)——RequestMapping映射特定params和headers](https://my.oschina.net/happyBKs/blog/412521)
#### 5. [springMVC笔记系列(5)——@RequestMapping请求value的通配符详解](https://my.oschina.net/happyBKs/blog/412714)
第四种情况，以前版本会随机选择，现在版本会直接异常。
```
HTTP ERROR 500 javax.servlet.ServletException: org.springframework.web.util.NestedServletException: Request processing failed; nested exception is java.lang.IllegalStateException: Ambiguous handler methods mapped for '/springmvc-demo/c3/rq8_bm/bbb/mmm': {public java.lang.String com.zp.demo.handlers.RMHandler.handle13_bm(), public java.lang.String com.zp.demo.handlers.RMHandler.handle12_bm()}
```
#### 6. [springMVC笔记系列(6)——映射请求URL中的占位符到控制器方法参数](https://my.oschina.net/happyBKs/blog/412788)
#### 7. [springMVC笔记系列(7)——HiddenHttpMethodFilter过滤器](https://my.oschina.net/happyBKs/blog/416994)
报错:
```
JSPs only permit GET POST or HEAD
```

[JSPs only permit GET POST or HEAD的解决方案（REST风格）](https://blog.csdn.net/tiberroot/article/details/76615727)
#### 8. [springMVC笔记系列(8)——RequestParam注解](https://my.oschina.net/happyBKs/blog/417032)
#### 9. [springMVC笔记系列(9)——RequestHead注解](https://my.oschina.net/happyBKs/blog/417413)
#### 10. [springMVC笔记系列(10)——CookieValue注解](https://my.oschina.net/happyBKs/blog/417431)
#### 11. [springMVC笔记系列(11)——使用 POJO 对象绑定请求参数值](https://my.oschina.net/happyBKs/blog/418865)
#### 12. [springMVC笔记系列(12)——使用Servlet原生API的类型参数](https://my.oschina.net/happyBKs/blog/420271)
缺少servlet-api.jar

[javax.servlet-api 和 servlet-api 区别](https://blog.csdn.net/milaobai/article/details/81347563)
```xml
  <dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>3.1.0</version>
  </dependency>
```
#### 13. [springMVC笔记系列(13)——模型数据处理篇 之 ModelAndVIew对象](https://my.oschina.net/happyBKs/blog/420310)
#### 14. [springMVC笔记系列(14)——模型数据处理篇 之 Map](https://my.oschina.net/happyBKs/blog/420754)
#### 15. [springMVC笔记系列(15)——模型数据处理篇 之 @Session注解](https://my.oschina.net/happyBKs/blog/421103)
#### 16. [springMVC笔记系列(16)——模型数据处理篇 之 @ModelAttribute注解](https://my.oschina.net/happyBKs/blog/422513)
#### 17. [springMVC笔记系列(17 特别篇的开始)——springMVC要点回顾及idea开发环境搭建](https://my.oschina.net/happyBKs/blog/690926)
#### 18. [springMVC笔记系列(18)——配置文件细节详解](https://my.oschina.net/happyBKs/blog/691502)
使用mvc:resources时，必须存在mvc:annotation-driven，否则导致RequestMapping不生效。
```xml
    <!-- 扩充了注解驱动，可以将请求参数绑定到控制器参数 -->
    <mvc:annotation-driven />

    <!-- 静态资源处理， css， js， imgs -->
    <mvc:resources mapping="/resources/**" location="/resources/" />
```
#### 19. [springMVC笔记系列(19)——控制器实现详解（上）](https://my.oschina.net/happyBKs/blog/694088)
[Please initialize the log4j system properly报错解决办法](https://blog.csdn.net/kangkangwanwan/article/details/52370324)

[Java日志框架SLF4J和log4j以及logback的联系和区别](https://www.cnblogs.com/hanszhao/p/9754419.html)

[log4j additivity解说](https://blog.csdn.net/hongweigg/article/details/14169477)
#### 20. [springMVC笔记系列(20)——控制器实现详解（下）](https://my.oschina.net/happyBKs/blog/703563)
[全面解析Spring中@ModelAttribute注解的用法](https://www.cnblogs.com/cobcmw/p/12092591.html)

此例中没有@ModelAttribute也可以。
#### 21. [springMVC笔记系列(21)——springMVC自带的上传文件功能实现](https://my.oschina.net/happyBKs/blog/706547)
#### 22. [springMVC笔记系列(22)——Json各类操作在springMVC中的实现](https://my.oschina.net/happyBKs/blog/707994)
启动时报如下错误，因为jackson版本和spring版本不兼容，升级jackson版本即可。
```
java.lang.NoClassDefFoundError: com/fasterxml/jackson/databind/exc/InvalidDefinitionException
```
[参考](https://blog.csdn.net/an_xiaowu/article/details/84134035)
#### 23. [springMVC笔记系列(23)——拦截器及其在乱码问题和登录问题的应用实现](https://my.oschina.net/happyBKs/blog/710833)
filter的执行顺序跟filter-mapping的位置一致，之前的HiddenHttpMethodFilter要放到后面。

[自定义拦截器和Filter的执行顺序](https://www.cnblogs.com/java-ssl-xy/p/7426524.html)






