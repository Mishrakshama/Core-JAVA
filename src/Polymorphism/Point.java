package Polymorphism;

public class Point {
	private double xCoordinate;
	private double yCoordinate;
	public Point(double xCoordinate,double yCoordinate) {
		this.xCoordinate= xCoordinate;
		this.yCoordinate=yCoordinate;
	}
	public double calculateDistance(){
	double distance =Math.sqrt((xCoordinate-0)*(xCoordinate-0)+(yCoordinate-0)*(yCoordinate-0));
	return Math.round(distance*100)/100.0;
	}
	public double calculateDistance(Point point) {
		double distance= Math.sqrt((point.xCoordinate-this.xCoordinate)*(point.xCoordinate-this.xCoordinate)+(point.yCoordinate-this.yCoordinate)*(point.yCoordinate-this.yCoordinate));
		return Math.round(distance*100)/100.0;
		
	}
    public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

}
