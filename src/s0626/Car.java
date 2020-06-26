package s0626;

public class Car {
	private String name;
	private String carMaker;
	private int cc;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarMaker() {
		return carMaker;
	}
	public void setCarMaker(String carMaker) {
		this.carMaker = carMaker;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", carMaker=" + carMaker + ", cc=" + cc + ", color=" + color + "]"+"\n";
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
