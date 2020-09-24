package cn.lbc.test;

import cn.lbc.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 时间
 *
 * @date 2020/9/23 16:11
 */

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        EmployeeService es = (EmployeeService) ac.getBean("employeeService");
        es.findAll();
    }
}
