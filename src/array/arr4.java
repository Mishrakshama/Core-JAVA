package array;

public class arr4 {
	public static int[] findNumbers(int num1, int num2) {
		 if (num1 >= num2) {
		        return new int[0];
		    }
		    int[] numbers = new int[6];
		    int count = 0; 
		    
		    for (int i = num1; i <= num2; i++) {
		        int sumOfDigits = 0;
		        int temp = i;
		        
		      
		        while (temp != 0) {
		            sumOfDigits += temp % 10;
		            temp /= 10;
		        } 
		        if (sumOfDigits % 3 == 0 && i % 5 == 0 && i >= 10 && i <= 99) {
		            numbers[count++] = i; 
		        }
		    }
		    
		    return numbers;
		}
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
