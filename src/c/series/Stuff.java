package c.series;

public class Stuff {
	private int weight;
	private int value;
	public Stuff(int weight , int value) {
		this.weight = weight;
		this.value = value;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Stuff [weight=" + weight + ", value=" + value + "]";
	}
	

}
