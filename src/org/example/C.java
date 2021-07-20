package org.example;

public class C implements A,B {

	@Override
	public void tc1() {
		System.out.println(1);
		
	}

	@Override
	public void tc2() {
		System.out.println("robert");
		
	}

	@Override
	public void tc3() {
		System.out.println(true);
		
	}

	public static void main(String[] args) {
		
		C a=new C();
		a.tc1();
		a.tc2();
		a.tc3();
	}
	private void sysout() {
		System.out.println("git c");
		System.out.println("git c");
		System.out.println("git c");
		System.out.println("git c");
		System.out.println("git d");
		System.out.println("git d");
		System.out.println("git d");
		System.out.println("git d");

	}
}
