
public class Motor {
	private static int numberOfengine = 0;
	public String name;
	public   int high_voltage = 4;
	public int Power_consumption = 300;
	public String name1;
	public  int high_voltage1 = 5;
	public   int Power_consumption1 = 400;
	private int  priceIndollars = 100 ;
	private int  priceIndollars1 = 150;
	
	public Motor(int h , int P, int h1 , int P1){
		this.high_voltage = h;
		this.Power_consumption = P;
		this.high_voltage1 = h1;
		this.Power_consumption1  = P1;
	}
	public Motor (int high_voltage,int Power_consumption,int high_voltage1,int Power_consumption1,int p , int p1){
		this( high_voltage,Power_consumption,high_voltage1,Power_consumption1);
		setPriceIndollars(p);
		setPriceIndollars1(p1);
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
}
