# springmvc-demo

https://my.oschina.net/happyBKs?tab=newest&catalogId=436090
1. [SpringMVC笔记系列（1）——用一个例子帮你入门](https://my.oschina.net/happyBKs/blog/411547)
静态资源如jpg,html无法访问
2. [SpringMVC笔记系列（2）——@RequestMapping请求映射物理视图解析](https://my.oschina.net/happyBKs/blog/411861)
要设置base，否则资源路径不对
<head>
    <base href="...">
</head>
3. [SpringMVC笔记系列（3）——@RequestMapping请求value和method属性](https://my.oschina.net/happyBKs/blog/412005)
4. [springMVC笔记系列(4)——RequestMapping映射特定params和headers](https://my.oschina.net/happyBKs/blog/412521)
5. [springMVC笔记系列(5)——@RequestMapping请求value的通配符详解](https://my.oschina.net/happyBKs/blog/412714)
第四种情况，以前版本会随机选择，现在版本会直接异常。
```
HTTP ERROR 500 javax.servlet.ServletException: org.springframework.web.util.NestedServletException: Request processing failed; nested exception is java.lang.IllegalStateException: Ambiguous handler methods mapped for '/springmvc-study/c3/rq8_bm/bbb/mmm': {public java.lang.String com.study.zp.handlers.RMHandler.handle13_bm(), public java.lang.String com.study.zp.handlers.RMHandler.handle12_bm()}
```
6. [springMVC笔记系列(6)——映射请求URL中的占位符到控制器方法参数](https://my.oschina.net/happyBKs/blog/412788)
7. [springMVC笔记系列(7)——HiddenHttpMethodFilter过滤器](https://my.oschina.net/happyBKs/blog/416994)
报错:
```
JSPs only permit GET POST or HEAD
```
[JSPs only permit GET POST or HEAD的解决方案（REST风格）](https://blog.csdn.net/tiberroot/article/details/76615727)
8. [springMVC笔记系列(8)——RequestParam注解](https://my.oschina.net/happyBKs/blog/417032)
9. [springMVC笔记系列(9)——RequestHead注解](https://my.oschina.net/happyBKs/blog/417413)
10. [springMVC笔记系列(10)——CookieValue注解](https://my.oschina.net/happyBKs/blog/417431)
11. [springMVC笔记系列(11)——使用 POJO 对象绑定请求参数值](https://my.oschina.net/happyBKs/blog/418865)
12. [springMVC笔记系列(12)——使用Servlet原生API的类型参数](https://my.oschina.net/happyBKs/blog/420271)
缺少servlet-api.jar
[javax.servlet-api 和 servlet-api 区别](https://blog.csdn.net/milaobai/article/details/81347563)
```xml
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.1.0</version>
    </dependency>
```
13. [springMVC笔记系列(13)——模型数据处理篇 之 ModelAndVIew对象](https://my.oschina.net/happyBKs/blog/420310)
14. [springMVC笔记系列(14)——模型数据处理篇 之 Map](https://my.oschina.net/happyBKs/blog/420754)
15. [springMVC笔记系列(15)——模型数据处理篇 之 @Session注解](https://my.oschina.net/happyBKs/blog/421103)
16. [springMVC笔记系列(16)——模型数据处理篇 之 @ModelAttribute注解](https://my.oschina.net/happyBKs/blog/422513)

