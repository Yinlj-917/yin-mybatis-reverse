> ##### author lijian.yin@foxmail.com

### 这是一个mybatis逆向工程项目
 
#### 简单实现生成DTO、Mapper、Example注释

### 1、 依赖

```xml
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.mybatis.generator/mybatis-generator-core -->
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.5</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>6.0.6</version>
        </dependency>
    </dependencies>
```

### 2、设置数据库

mybatis-reverse.xml
```xml
 <jdbcConnection driverClass="com.mysql.cj.jdbc.Driver"
                        connectionURL="" userId=""
                        password="">
        </jdbcConnection>
```

### 3、设置需生成文件对应的表

mybatis-reverse.xml
```xml
 <table tableName=""></table>
```


### 4、运行app.java, 生成的文件在src.com....




