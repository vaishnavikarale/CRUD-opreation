package com.qsp.bootdemo.dto;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Student {
@Id
int id;
String name;
int age;
int yop;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getYop() {
	return yop;
}
public void setYop(int yop) {
	this.yop = yop;
}
}
