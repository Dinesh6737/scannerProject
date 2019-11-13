package org.scn;

import java.util.Scanner;

public class Scn {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("empID :");
		int i = s.nextInt();
		System.out.println("Emp ID :"+i);
		
		System.out.println("empName :");
		String s1 = s.next();
		System.out.println("empName :"+s1);
		
		System.out.println("empEmail :");
		String s2 = s.next();
		System.out.println("empEmail :"+s2);
		
		System.out.println("phnNo :");
		long l = s.nextLong();
		System.out.println("phnNO :"+l);
		
		System.out.println("empSalary :");
		long l2 = s.nextLong();
		System.out.println("empSalary :"+l2);
		
		System.out.println("empCity :");
		String s3 = s.next();
		System.out.println("empCity :"+s3);
		
		System.out.println("empGender :");
		String s4 = s.next();
		System.out.println("empGender :"+s4);
		
	}

}
