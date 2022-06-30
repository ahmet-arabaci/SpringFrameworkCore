package com.bootcamp.spring.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bootcamp.spring.model.Mysql;

public class SpringFrameworkCoreApp {

  public static void main(String[] args) {
	
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	// #1 - Bean Definition Example - Bean Factory Usage
	System.out.println("\n#1 - BeanFactory Definition");
	Mysql mysql = (Mysql) context.getBean("mysql");
	mysql.printConnectionInformations();
	
	// #2 - Constructor Injection Example
	System.out.println("\n#2 - Constructor Injection");
	Mysql mysqlWithConstructor = (Mysql) context.getBean("mysqlWithConstructor");
	mysqlWithConstructor.printConnectionInformations();
	
	// #3 - 'ref' Usage Example
	System.out.println("\n#3 - 'ref' Usage");
	Mysql mysqlRefUsage = (Mysql) context.getBean("mysqlRefUsage");
	mysqlRefUsage.printConnectionInformations();
	
	// #4 - Inner Bean Usage Example
	System.out.println("\n#4 - InnerBean Usage");
	Mysql mysqlInnerBeanUsage = (Mysql) context.getBean("mysqlInnerBeanUsage");
	mysqlInnerBeanUsage.printConnectionInformations();
	
	// #5 - Alias Usage Example
	System.out.println("\n#5 - Alias Usage");
	Mysql mysqlAliasUsage = (Mysql) context.getBean("mysqlAliasUsage");
	mysqlAliasUsage.printConnectionInformations();
	Mysql mysqlAliasUsage1 = (Mysql) context.getBean("mysqlAliasUsage1");
	mysqlAliasUsage1.printConnectionInformations();
	Mysql mysqlAliasUsage2 = (Mysql) context.getBean("mysqlAliasUsage2");
	mysqlAliasUsage2.printConnectionInformations();
	
	// #6 - List Usage Example
	System.out.println("\n#6 - List Usage");
	Mysql mysqlListUsage = (Mysql) context.getBean("mysqlListUsage");
	mysqlListUsage.printConnectionInformations();
	
	// #7 - Autowiring Usage Example
	System.out.println("\n#7 - Autowiring Usage");
	Mysql mysqlAutowireUsage = (Mysql) context.getBean("mysqlAutowireUsage");
	mysqlAutowireUsage.printConnectionInformations();
	
	// #8 - BeanScope Example
	System.out.println("\n#8 - BeanScope Usage");
	Mysql mysqlScopeUsage1 = (Mysql) context.getBean("mysqlScopeUsage");
	mysqlScopeUsage1.setUser("mysql_user5_overrided");
	mysqlScopeUsage1.printConnectionInformations();
	
	Mysql mysqlScopeUsage2 = (Mysql) context.getBean("mysqlScopeUsage");	
	mysqlScopeUsage2.printConnectionInformations();
	
	// #9 - Bean Inheritance
	System.out.println("\n#9 - Bean Inheritance");
	Mysql mysqlInheritanceUsage = (Mysql) context.getBean("mysqlInheritanceUsage");
	mysqlInheritanceUsage.printConnectionInformations();
	
	context.close();
}
}
