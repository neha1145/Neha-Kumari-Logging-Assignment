package com.epam.CleanCode;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class user_cost {
	public static Logger LOGGER=LogManager.getLogger(App.class);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int material_type;
		Scanner sc=new Scanner(System.in);
		LOGGER.info("\nenter 1 for standard\nenter 2 for above\nenter 3 for high\nenter 4 for automation");
		material_type=sc.nextInt();
		LOGGER.info("enter the area");
		double area=sc.nextDouble();
		construction_of_house construct=new construction_of_house(material_type,area);
		LOGGER.info(construct.cost());
		sc.close();
	}

}
