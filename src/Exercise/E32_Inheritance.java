package Exercise;

abstract class PublicTrans {
	private String fromPlace, toPlace;
	public PublicTrans(String fromPlace, String toPlace) {
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
	}
	public abstract double computeCost();
	public String toString() {
		return "a trip from " + fromPlace + "to " + toPlace;
	}
}

class OFO extends PublicTrans {
	public OFO(String fromPlace, String toPlace) {
		super(fromPlace, toPlace);
	}
	public double computeCost() {
		return 1;
	}
	public String toString() {
		return super.toString() + " by OFO\n";
	}
}

class Taxi extends PublicTrans {
	final double PRICE = 10; //
	private double distance;
	public Taxi(String fromPlace, String toPlace, double dist) {
		super(fromPlace, toPlace);
		distance = dist;
	}
	public double computeCost() {
		return PRICE * distance;
	}
	public String toString() {
		return super.toString() + "by Taxi\n";
	}
}

public class E32_Inheritance {
	public static void main(String[] args){
		double totalCost = 0;
		PublicTrans[] oneTrip= {new OFO("FoodHall","Campus Gate"),
				new Taxi("Campus Game", "Dinghao Square",3), new OFO("Dinghao Square","Yudi Square")};
		for (PublicTrans p : oneTrip){
			totalCost += p.computeCost();
			System.out.print(p);
		}
		System.out.println("total cost is " + totalCost);
	}	
}
