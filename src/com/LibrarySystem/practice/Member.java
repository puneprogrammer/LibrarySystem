package com.LibrarySystem.practice;

public class Member {
	enum MemberType{STUDENT, TEACHER};
	String name;
	MemberType type;

	public Member(String name, MemberType type){
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MemberType getType() {
		return type;
	}
	public void setType(MemberType type) {
		this.type = type;
	}
	public String toString(){
		return this.getName() + "(" + this.getType() + ")";
	}
}
