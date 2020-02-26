package com.epam.CleanCode;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class interest_calculator {
	public static Logger LOGGER=LogManager.getLogger(App.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		LOGGER.info("\nPrinciple_amount?rate?time\n");
		double principle_amount=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		interest Interest=new interest(principle_amount,rate,time);
		LOGGER.info("-----------------Simple Interest------------------");
		LOGGER.info(Interest.simple_interest());
		LOGGER.info("------------Compound Interest----------------");
		LOGGER.info("number_of_times_interest_compounded?");
		double num=sc.nextDouble();
		LOGGER.info(Interest.compound_interest(num));
		sc.close();
	}

}
