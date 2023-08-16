package cn.fs;

import cn.fs.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.fs");
		User user = (User) context.getBean("user");
		user.test();
	}
}