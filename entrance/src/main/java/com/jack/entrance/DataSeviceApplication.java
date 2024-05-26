package com.jack.entrance;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @BelongsProject: mydata-service
 * @BelongsPackage: com.jack.entrance
 * @Author: lianchaoqi
 * @CreateTime: 2024-05-26  20:52
 * @Description: ~~~~
 * @Version: jdk1.8
 */

//@MapperScan("com.jack.dao")
@SpringBootApplication
@ComponentScan(value = "com.jack")
public class DataSeviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataSeviceApplication.class, args);
    }

}
