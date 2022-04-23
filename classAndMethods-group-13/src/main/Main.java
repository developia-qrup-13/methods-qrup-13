package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// argument parametr
		// static method daxilinde static olmayan method caqira bilmerem
		// static olmayan method daxilinde static method caqira bilerem
       Test test=new Test();
       int sum=sum(5,6);// argument
       System.out.println(sum);
       int product=product(5,6);
       System.out.println(product);
       
       System.out.println(helloWorld());
       System.out.println(helloWorld("Salam"));
       
       System.out.println(test(1,1,2,7));

//       helloWorldVoid("Hello World");//System.out.print-in daxilinde yaza bilmerik ve neyese menimsede bilmerik return istifade ede bilmirik
          
	}
	
	static int test(int b,int... a) {
		   return a.length; 
		}
	
	 static int sum(int a,int b) {// parametrli
		int sum=a+b;
		return sum;
	}
	
	static String helloWorld() {// parametrsiz 
		return "Hello World";
	}
	static String helloWorld(String text) {// overLoading
		return text;
	}
	
	static void helloWorldVoid(String text) {// parametrli void methodu
		System.out.println(text);
	}
	
	static int product(int a,int b) {
		return a*b;
	}

	
}
