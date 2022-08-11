package com.chen;

import com.chen.config.SpringConfig;
import com.chen.vo.Cat;
import com.chen.vo.Student;
import com.chen.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Mytest
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/11 9:49
 * @Version 1.0
 **/
public class Mytest {

    //xml文件方式
    @Test
    public void test01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);
    }

    //javaconfig对象方式，默认对象是方法名称
    @Test
    public void test02(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student s = (Student) ctx.getBean("createStudent");
        System.out.println(s);
    }

    //@bean标签指定名称
    @Test
    public void test03(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student s = (Student) ctx.getBean("stu");
        System.out.println(s);
    }

    //通过@ImportResource注解引入其他xml配置文件的容器对象
    @Test
    public void test04(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat myCat = (Cat) ctx.getBean("myCat");
        System.out.println(myCat);
    }


    //通过@PropertySource加载属性文件，和@ComponentScan扫描实体类的注解，实体类通过@Component进行注册，通过@Value读取属性文件的值
    @Test
    public void test05(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) ctx.getBean("tiger");//这里的tiger是通过属性文件中获取的数据
        System.out.println(tiger);
    }
}
