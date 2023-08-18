package cn.fs;

import cn.fs.entity.Order;
import cn.fs.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 王戈
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.fs");
		User user = (User) context.getBean("user");
		Order order = (Order) context.getBean("order");
		user.test();
		order.test();
	}
}