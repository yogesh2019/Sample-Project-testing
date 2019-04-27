package main;

public class SampleProject {
	//print  Hello world! in the console
	public static String printHello() {
		String c = "";
		//print Hello world! in the console!
		c = "Hello World!";
		return c;
	}
	public static int add(int a,int b) {
		int c = 0;
		 c = a+b;
		return c;
	}
	public static void main(String args[]) {
		System.out.println(printHello());
		System.out.println(add(23,45));
	}
}