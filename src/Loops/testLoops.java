package Loops;
import java.util.Scanner;

public class testLoops {

    public static void main(String[] args) {
	    int[] arr = new int[5];
	    Scanner sc = new Scanner(System.in);
	    int sumF = 0;
	    for (int i = 0; i < arr.length; i++){
	        arr[i] = sc.nextInt();
	        sumF += arr[i];
        }
	    System.out.println("Цикл for: " + sumF);

		int sumW = 0;
	    int j = 0;

	    while(j < arr.length){
			arr[j] = sc.nextInt();
			sumW += arr[j];
			j++;
		}
		System.out.println("Цикл while: " + sumW);

	   	int sumDW = 0;
		int k = 0;
	    do{
			arr[k] = sc.nextInt();
			sumDW += arr[k];
			k++;
		}while(k < arr.length);
		System.out.println("Цикл do while: " + sumDW);

		for (String arg : args) {
			System.out.println(arg);
		}

		int row = 0;
		for (int i = 1; i <= 10; i++){
			row = (int) Math.pow(i,i);
			System.out.println("1/" + row);
		}

		System.out.println("до сортировки: ");
		for (int i = 0; i < arr.length; i++){
			arr[i] = (int) (Math.random() * 200);
			System.out.print(arr[i] + " ");
		}
		int buf;
		for (int i = 0; i < arr.length - 1; i++){
			for (int z = i + 1; z < arr.length; z++){
				if(arr[i] > arr[z]){
					buf = arr[i];
					arr[i] = arr[z];
					arr[z] = buf;
				}
			}
		}
		System.out.println("\nпосле сортировки: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nвведите значение факториала: ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
		System.out.print(fact);
    }
}
