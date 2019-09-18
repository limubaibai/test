package com.leyou;

/*import org.mybatis.spring.annotation.MapperScan;*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan; //通用mapper

@SpringBootApplication
@MapperScan("com.leyou.mapper")  //相当于spring时xml配置文件中的映射器 dao接口和mapper映射文件的映射关系
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }

public void test(){

}

public void test3(){

}
}
