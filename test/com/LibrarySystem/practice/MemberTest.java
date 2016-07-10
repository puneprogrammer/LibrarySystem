package com.LibrarySystem.practice;

import com.LibrarySystem.practice.Member.MemberType;
import junit.framework.TestCase;

public class MemberTest extends TestCase{

	public void testMember() {
		Member m1 = new Member("Amalkiran", MemberType.STUDENT);
		assertEquals("Amalkiran", m1.getName());
		assertEquals(MemberType.STUDENT, m1.getType());
	}
	public void testToString(){
	Member m1 = new Member("Amalkiran", MemberType.STUDENT);
	assertEquals("Amalkiran(STUDENT)", m1.toString());
	}
}
