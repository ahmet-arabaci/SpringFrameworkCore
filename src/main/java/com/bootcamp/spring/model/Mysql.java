package com.bootcamp.spring.model;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Mysql implements InitializingBean, DisposableBean {

	private String url;
	private String user;
	private String password;
	private Info info;
	private List<Logger> loggerList;
	private List<String> portList;
	
	public Mysql() {		
	}
	
	public Mysql(String url, String user, String password) {		
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	public Mysql(String url, String user, String password, Info info) {		
		this.url = url;
		this.user = user;
		this.password = password;
		this.info = info;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public List<Logger> getLoggerList() {
		return loggerList;
	}
	public void setLoggerList(List<Logger> loggerList) {
		this.loggerList = loggerList;
	}
	public List<String> getPortList() {
		return portList;
	}
	public void setPortList(List<String> portList) {
		this.portList = portList;
	}

	public void printConnectionInformations() {
		System.out.println(
				"\nURL     : " + this.url + 
				"\nUSER    : " + this.user + 
				"\nPASSWORD: " + this.password);
		if (info != null) {
			System.out.println("INFO | DBTYPE: " + this.info.getDbType() + ", " + this.info.getPort());
		}
		if (loggerList != null) {
			System.out.println("LOGGERLIST:");
			for (Logger log : loggerList) {
				System.out.println("Log | " + log.getLog());
			}
		}
		if (portList != null) {
			System.out.println("PORTLIST:");
			for (String port : portList) {
				System.out.println("Port | " + port);
			}
		}
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Mysql - destroy() function has been called.");		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Mysql - afterPropertiesSet() function has been called.");	
	}
	
	public void customDestroy() {
		System.out.println("Mysql - customDestroy() function has been called.");
	}
	
	public void customInit() {
		System.out.println("Mysql - customInit() function has been called.");
	}
	
	public void defaultCustomDestroy() {
		System.out.println("Mysql - defaultCustomDestroy() function has been called.");
	}
	
	public void defaultCustomInit() {
		System.out.println("Mysql - defaultCustomInit() function has been called.");
	}
}
