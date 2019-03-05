
public class Main {
	public static void main(String[] args){
		Motor.printStaticnumberOfengine();
		Motor bmw = new Motor("Diesel" ,400, 4,175 , 350 , 2010 , 1.6 );
		bmw.setPriceInDollars(150);
		bmw.setHighVoltage(4);
		bmw.setName("Diesel");
		bmw.setPowerConsumption(500);
		Motor nissan = new Motor("Gasoline" , 250 , 3 , 150 , 200 , 2003 , 1.4);
		System.out.println(bmw.toString());
		System.out.println(nissan.toString());
		nissan.resetValues("New name", 6, 500 ,200 , 145, 2005 , 1.4 );
		
		
	}

}
