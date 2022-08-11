package com.chen.config;

import com.chen.vo.Student;
import org.springframework.context.annotation.*;

/**
 * @ClassName SpringConfig
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/11 9:51
 * @Version 1.0
 * 当前类作为配置文件使用的，就是用来配置容器的
 * springConfig这个类相当于beans.xml文件的作用
 **/
@Configuration
@ImportResource(value = {"classpath:applicationContext.xml","classpath:beans.xml"})//把其他xml的配置文件导入，就可以使用里面的容器对象
@PropertySource(value = "classpath:config.properties")//加载额外的属性文件
@ComponentScan(basePackages = "com.chen.vo") //扫描注解所在的包
public class SpringConfig {

    //创建方法，方法的返回值是对象，在方法的上面加入@Bean
    //返回的对象就注入到容器中
    //@Bean ：把对象注入到spring容器中，作用相当于<bean>,位置在方法的上面
    //@Bean不指定对象的名称，则默认是方法名
    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setName("猪头2");
        student.setAge(19);
        student.setSex("男");
        return student;
    }

    @Bean(name = "stu") //name就是对象的名称，即bean标签的id
    public Student makeStudent(){
        Student student = new Student();
        student.setName("猪头3");
        student.setAge(29);
        student.setSex("男");
        return student;
    }
}
