package com.epam.CleanCode;
import java.util.Scanner;

public class interest_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		double principle_amount=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		interest Interest=new interest(principle_amount,rate,time);
		System.out.println("-----------------Simple Interest------------------");
		System.out.println(Interest.simple_interest());
		System.out.println("------------Compound Interest----------------");
		System.out.println("number_of_times_interest_compounded?");
		double num=sc.nextDouble();
		System.out.println(Interest.compound_interest(num));
		sc.close();
	}

}
