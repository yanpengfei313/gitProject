package com.fei.pojo;

public class User {
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
	public void toString(){
		System.out.println("输出");
}
