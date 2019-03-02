
public class Main {
	public static void main(String[] args){
		Motor.printStaticnumberOfengine();
		Motor BMW = new Motor(4, 300 ,5 ,400,100,150 , 250, 275 ,2005 , 2010 ,1.4,  1.6 );
		System.out.println(BMW.name = "Engine is Diesel");
		System.out.println(BMW.high_voltage);
		System.out.println(BMW.Power_consumption );
		System.out.println(BMW.getPriceIndollars());
		System.out.println(BMW.getWeight());
		System.out.println(BMW.release_date);
		System.out.println(BMW.motor_volume);
		Motor Nissan = new Motor(4 , 300 , 5 ,400 , 100,150 , 250, 275 , 2005  , 2010,1.4, 1.6 );
		System.out.println(Nissan.name1 = "Engine is Gasoline");
		System.out.println(Nissan.high_voltage1);
		System.out.println(Nissan.Power_consumption1);
		System.out.println(Nissan.getPriceIndollars1());
		System.out.println(Nissan.getWeight1());
		System.out.println(Nissan.release_date1);
		System.out.println(Nissan.motor_volume1);
		Nissan.resetValues("New name", 6, 500);
		
	}

}
