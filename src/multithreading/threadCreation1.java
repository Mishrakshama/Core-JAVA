package multithreading;

public class threadCreation1 extends Thread{
@Override
public void run() {
	System.out.println("inside thread");
}
public static void main(String []args) {
	threadCreation1 th= new threadCreation1();
	th.start();
	
}
}
