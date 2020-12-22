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
# docker run -p 8080:8080 --name example toma3610/example:latest -d
#上传到对应的镜像仓库中
# docker push toma3610/example:latest
#从镜像仓库拉取镜像
# docker pull toma3610/example:latest