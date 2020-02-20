package com.epam.CleanCode;
import java.lang.Math;
public class interest {
	double principle_amount,rate,time;
	interest(double principle_amount,double rate,double time){
		this.principle_amount=principle_amount;
		this.rate=rate;
		this.time=time;
	}
	public double simple_interest(){
		return principle_amount*rate*time; 
	}
	public double compound_interest(double number_of_times_interest_compounded){
		double n=number_of_times_interest_compounded;
		double part=Math.pow(1+(rate/n),n*time);
		return principle_amount*part;
	}
}
