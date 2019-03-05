
public class Motor {
	private static int numberOfengine = 2;
	private String name;
	private int powerConsumption;
	private int highVoltage;
	private int priceInDollars;
	private int weight;
	protected int releaseDate;
	protected double motorVolume;

	public Motor() {
		this("Gasoline", 500, 5,200 , 300, 2008, 1.4  );
	}

	public Motor(String name, int powerConsumption, int highVoltage, int priceInDollars) {
		this(name, powerConsumption, highVoltage, priceInDollars, 0, 0, 0);
	}

	public Motor(String name, int powerConsumption, int highVoltage, int priceInDollars, int weight, int releaseDate,
			double motorVolume) {
		this.name = name;
		this.powerConsumption = powerConsumption;
		this.highVoltage = highVoltage;
		this.priceInDollars = priceInDollars;
		this.weight = weight;
		this.releaseDate = releaseDate;
		this.motorVolume = motorVolume;
		numberOfengine ++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getHighVoltage() {
		return highVoltage;
	}

	public void setHighVoltage(int highVoltage) {
		this.highVoltage = highVoltage;
	}

	public int getPriceInDollars() {
		return priceInDollars;
	}

	public void setPriceInDollars(int priceInDollars) {
		this.priceInDollars = priceInDollars;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getMotorVolume() {
		return motorVolume;
	}

	public void setMotorVolume(double motorVolume) {
		this.motorVolume = motorVolume;
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
	
	
	@Override
	public String toString() {
		return "Motor [name=" + name + ", powerConsumption=" + powerConsumption + ", highVoltage=" + highVoltage
				+ ", priceInDollars=" + priceInDollars + ", weight=" + weight + ", releaseDate=" + releaseDate
				+ ", motorVolume=" + motorVolume + "]";
	}

	public void resetValues(String name , int powerConsumption , int highVoltage , int priceInDollars , int weight , int releaseDate , double motorVolume ) {
           this.name = name;
           this.powerConsumption = powerConsumption;
           this.highVoltage = highVoltage;
           this.priceInDollars = priceInDollars;
           this.weight = weight;
           this.releaseDate = releaseDate;
           this.motorVolume = motorVolume;
	}

	

	

}
