#### Docker` 构建 `SpringBoot` 镜像

> docker的出现让我们的应用的发布、多环境构建变得简单起来 使用一个镜像即可完成以上所有的功能 更加容易部署、减轻运维负担。

##### 构建一个 `SpringBoot` 项目

```java
@RestController
@SpringBootApplication
public class Lab03DockerBuildExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(Lab03DockerBuildExampleApplication.class, args);
    }
    @GetMapping("/syaHello")
    public String sayHello(String param){
        return "syaHello:"+ param;
    }
}
```

> 构建了一个对外的接口

#####  运行效果

```shell
GET http://localhost:8080/syaHello?param=Tomass

HTTP/1.1 200 
Content-Type: text/plain;charset=UTF-8
Content-Length: 15
Date: Tue, 22 Dec 2020 11:37:54 GMT
Keep-Alive: timeout=60
Connection: keep-alive

syaHello:Tomass

Response code: 200; Time: 87ms; Content length: 15 bytes
```

##### 打包应用`Jar` 包

##### 构建 `Dockerfile`

```yaml
# 该镜像需要依赖的基础镜像 采用轻量级的基础镜像
FROM frolvlad/alpine-oraclejre8:latest
# 声明服务运行在8080端口
EXPOSE 8080
#持久化数据信息
VOLUME /tmp
#需将打包好的jar包复制到当前同级目录 进行构建
#将应用jar 复制到 app.jar
ADD lab-03-docker-build-example-0.0.1-SNAPSHOT.jar /app.jar
# 指定docker容器启动时运行jar包
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
# 指定维护者的名字
MAINTAINER toma

#构建镜像 -t 表示指定  镜像仓库名称/镜像名称:镜像标签 . 表示使用当前目录下的Dockerfile
# docker build -t toma3610/example:latest .
# 运行容器
# docker run -p 8080:8080 --name example toma3610/example:latest
#上传到对应的镜像仓库中
# docker push toma3610/example:latest
#从镜像仓库拉取镜像
# docker pull toma3610/example:latest
```

![image-20201222194932739](http://qiniu.toma3610.cn/blog/typora/image-20201222194932739.png)

> 推荐将 jar 与 Dockerfile 放在在同一目录下

##### 构建镜像

> 构建镜像 -t 表示指定  镜像仓库名称/镜像名称:镜像标签 . 表示使用当前目录下的Dockerfile
>
> docker build -t toma3610/example:latest .

![image-20201222195503330](http://qiniu.toma3610.cn/blog/typora/image-20201222195503330.png)

##### 运行镜像

> docker run -p 8080:8080 --name example toma3610/example:latest -d

![image-20201222195713004](http://qiniu.toma3610.cn/blog/typora/image-20201222195713004.png)

##### 测试镜像

```shell
GET http://localhost:8080/syaHello?param=Toma3610

HTTP/1.1 200 
Content-Type: text/plain;charset=UTF-8
Content-Length: 17
Date: Tue, 22 Dec 2020 11:58:06 GMT
Keep-Alive: timeout=60
Connection: keep-alive

syaHello:Toma3610

Response code: 200; Time: 155ms; Content length: 17 bytes
```

> 请求成功 构建镜像完成

##### 拓展

> 到这里构建镜像是完成了的  此时我们可以把它推送到 远程仓库中 以后直接从镜像仓库取就可以了。可以到 [dockerhub](https://hub.docker.com/) 创建一个账号

![image-20201222200209838](http://qiniu.toma3610.cn/blog/typora/image-20201222200209838.png)

##### 推送镜像

> docker push toma3610/example:latest

##### 拉取镜像

> docker pull toma3610/example:latest

##### 总结

> 至此就完成了构建应用镜像到仓库拉取的一整个过程、这一个过程会比较繁琐但是在后面可以使用`maven`插件的方式 简化这些流程。

[源码地址](https://github.com/Toma3610/toma-example/tree/master/toma-learning/lab-03-docker/lab-03-docker-build-example)