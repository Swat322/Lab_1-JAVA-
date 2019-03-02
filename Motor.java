
public class Motor {
	private static int numberOfengine = 2;
	public String name;
	public   int high_voltage = 4;
	public int Power_consumption = 300;
	public String name1;
	public  int high_voltage1 = 5;
	public   int Power_consumption1 = 400;
	private int  priceIndollars = 100 ;
	private int  priceIndollars1 = 150;
	private int weight = 250;
	private int weight1 = 275;
	protected int release_date = 2005 ;
	protected int release_date1 = 2010;
	protected double motor_volume = 1.4 ;
	protected double motor_volume1 = 1.6;
	
	public Motor(int h , int P, int h1 , int P1){
		this.high_voltage = h;
		this.Power_consumption = P;
		this.high_voltage1 = h1;
		this.Power_consumption1  = P1;
		numberOfengine ++;
	}
	public Motor (int high_voltage,int Power_consumption,int high_voltage1,int Power_consumption1,int p , int p1 , int w ,int w1 , int r ,int r1 , double m , double m1 ){
		this( high_voltage,Power_consumption,high_voltage1,Power_consumption1);
		setPriceIndollars(p);
		setPriceIndollars1(p1);
		setWeight(w);
		setWeight1(w1);
		release_date = r;
		release_date1 = r1;
		motor_volume = m;
		motor_volume1 = m1;
	}
	public static int getNumberofEngine() {
	    return numberOfengine;
	}

	public static void setNumberofEngine(int numberOfengine) {
	    Motor.numberOfengine = numberOfengine;
	}
	public static void printStaticnumberOfengine() {
	    System.out.println("numberOfengine:" + numberOfengine);
	}

	public void printnumberOfengine() {
	    System.out.println("numberOfengine:" + numberOfengine);
	}
	public int getPriceIndollars() {
		return priceIndollars;
	}
	public void setPriceIndollars(int priceIndollars) {
		this.priceIndollars = priceIndollars;
	}
	public int getPriceIndollars1() {
		return priceIndollars1;
	}
	public void setPriceIndollars1(int priceIndollars1) {
		this.priceIndollars1 = priceIndollars1;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight1() {
		return weight1;
	}
	public void setWeight1(int weight1) {
		this.weight1 = weight1;
	}
	public void resetValues(String name, int high_voltage, int Power_consumption) {
	    this.name = name;
	    this.high_voltage = high_voltage;
	    this.Power_consumption = Power_consumption;
	   
	}
	public String toString(){
		return name + high_voltage + Power_consumption;
	}
}