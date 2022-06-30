package com.bootcamp.spring.model;

import java.util.List;

public class Config {

	private String url;
	private String user;
	private String password;
	private List<Logger> loggerList;
	private List<String> portList;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
