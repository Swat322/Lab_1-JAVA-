
public class Main {
	public static void main(String[] args){
		Motor BMW = new Motor(4, 300 ,5 ,400,100,150 , 250, 275);
		System.out.println(BMW.name = "Engine is Diesel");
		System.out.println(BMW.high_voltage);
		System.out.println(BMW.Power_consumption );
		System.out.println(BMW.getPriceIndollars());
		System.out.println(BMW.getWeight());
		Motor Nissan = new Motor(4 , 300 , 5 ,400 , 100,150 , 250, 275 );
		System.out.println(Nissan.name1 = "Engine is Gasoline");
		System.out.println(Nissan.high_voltage1);
		System.out.println(Nissan.Power_consumption1);
		System.out.println(Nissan.getPriceIndollars1());
		System.out.println(Nissan.getWeight1());
		Nissan.resetValues("New name", 6, 500);
		BMW.printnumberOfengine();
	}

}
