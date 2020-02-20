package com.epam.CleanCode;
import java.util.Scanner;
public class user_cost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int material_type;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for standard\nenter 2 for above\nenter 3 for high\nenter 4 for automation");
		material_type=sc.nextInt();
		System.out.println("enter the area");
		double area=sc.nextDouble();
		construction_of_house construct=new construction_of_house(material_type,area);
		System.out.println(construct.cost());
		sc.close();
	}

}
