package Inheritance;
public class DigitalCamera extends Camera {
	private int memory;

	public DigitalCamera(String brand, double cost) {
	//	this.setBrand(brand);
    //   this.setCost(cost);
		super(brand,cost);//call the parameterized constructor 
		this.memory = 16;
	}
    
    public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
}
