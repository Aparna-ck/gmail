package city;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		City c= new City();
		System.out.println("enter the City Id");
		c.setCityId(Integer.parseInt(br.readLine()));
		System.out.println("enter the City Name");
		c.setCityName(br.readLine());
		System.out.println("enter the State Name");
		c.setStateName(br.readLine());
	
		System.out.println("enter the City Details");
		System.out.println("City Id:"+c.getCityId());
		System.out.println("City Name:"+c.getCityName());
		System.out.println("State Name:"+c.getStateName());
		
		
	}

}
