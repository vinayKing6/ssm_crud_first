# ssm_crud

## 环境配置

### 框架

#### 后端

[jdk11](http://www.codebaoku.com/jdk/jdk-oracle-jdk11.html)

Spring+SpringMVC+MyBatis 版本号见pom.xml

#### 前端

vue+axios+jquery

### 数据库

mysql8 (数据库脚本在src/main/webapp/static/sql/database.sql)

### 项目构建

[maven3.8.6](https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.zip)

### 服务器

[tomcat8.5](https://dlcdn.apache.org/tomcat/tomcat-8/v8.5.82/bin/apache-tomcat-8.5.82-windows-x64.zip)

## 构建项目

### 打包war

```shell
cd ssm_crud
mvn clean package
```

### 部署

```shell
mv target/<war包> <your tomcat directory>/webapps
```

### 运行

```shell
cd <your tomcat directory>/bin
./startup.sh
```

### 停止运行

```shell
./shutdown.sh
```

## 项目教程

[尚硅谷ssm整合](https://www.bilibili.com/video/BV17W411g7zP?vd_source=3fc89722c68ab802d6951d68f237eeb9) （教程里全程使用jquery 但是过于繁琐，于是选择了vue)

[尚硅谷vue教程](https://www.bilibili.com/video/BV1Zy4y1K7SH?vd_source=3fc89722c68ab802d6951d68f237eeb9)

## 感想总结

​	这也算是第一次做了一个小小的ssm项目，尽管只有一个增删改查的效果，但是仍然能够加深对框架的理解，可以当作一次对ssm的总计，以及作为正真的网站项目的铺垫。总的来说，尽管看了这么多教程，然而琐碎的前端后端知识仍然需要不断的去复习。学无止尽，一起共勉

