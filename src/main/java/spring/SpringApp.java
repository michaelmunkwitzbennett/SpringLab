package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.Customer;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Customer c1 =context.getBean(Customer.class);

        System.out.println(c1.getEmailAddress());
        System.out.println(c1.getName());
        System.out.println(c1.getUsual());
    }
}
