# 关于本项目
本项目是一个简易的hello world欢迎示例，基于spring boot技术


### 使用手册

For further reference, please consider the following sections:

* 访问入口: http://[ip:port]/hello
* 运行方式: `java -jar xxx.jar`, 默认端口80
* 页面信息：hello页面提供访问者ip、服务器ip，和基于session的计数器，方便集群环境中检查和测试！比如nginx负载均衡中可以方便看到实际分发的机器和会话传递情况。

### 技术参考

无特别说明，主要三个文件，具体可查看代码

* pom.xml， 存放springboot坐标
* application程序，springboot入口程序，关键就是那个SpringBootApplication注解
* controller类，前端控制器，也就是映射hello入口，RestController注解

