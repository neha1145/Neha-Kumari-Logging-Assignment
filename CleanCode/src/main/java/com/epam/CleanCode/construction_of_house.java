package com.epam.CleanCode;

public class construction_of_house {
	int material;
	Double area_of_house;
	construction_of_house(int material,double area_of_house)
	{
		this.material=material;
		this.area_of_house=area_of_house;
	}
	public double cost() {
		if(material==1)
		{
			//1200INR
			return (1200*area_of_house);
		}
		else if(material==2)
		{
			//1500INR
			return (1500*area_of_house);
		}
		else if(material==3)
		{
			//1800INR
			return (1800*area_of_house);
		}
		else if(material==4)
		{
			//2500INR
			return (2500*area_of_house);
		}
		else {
			return 0;
		}
	}
	
}
