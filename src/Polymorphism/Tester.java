package Polymorphism;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point point1 = new Point(3.5, 1.5);
//		Point point2 = new Point(6, 4);
//                                
//        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
//        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
//        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
//        
		
//		exercise2
		
			Triangle triangle1 = new Triangle();
			Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);
			
			Point point1 = new Point(2, 1);
			Point point2 = new Point(4, 4);
			Point point3 = new Point(9, 1);
			Triangle triangle3 = new Triangle(point1, point2, point3);		
			
			System.out.println("Perimeter of triangle1 is "+triangle1.calculatePerimeter());
			System.out.println("Area of triangle1 is "+triangle1.calculateArea());
			
			System.out.println("Perimeter of triangle2 is "+triangle2.calculatePerimeter());
			System.out.println("Area of triangle2 is "+triangle2.calculateArea());
			
			System.out.println("Perimeter of triangle3 is "+triangle3.calculatePerimeter());
			System.out.println("Area of triangle3 is "+triangle3.calculateArea());
			
			//Create more objects of Triangle class for testing your code      

		}
	}

