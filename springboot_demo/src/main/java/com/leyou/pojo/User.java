package com.leyou.pojo;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Component    //不放在容器中也可以在配置类中使用@EnableConfigurationProperties(User.class) 来注入属性
@Data
/*@ConfigurationProperties(prefix = "user") */ //将配置文件中的属性赋值给实例
@Table(name = "tb_user")  /*通用mapper指定表名*/
public class User implements Serializable {
    @Id  //通用mapper指定主键
    @KeySql(useGeneratedKeys = true)  //自增主键回显功能
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private Date created;
    private Date updated;
    private String note;


}
