package Sorting;

public class SortingClass {

	public static void bubbleSort(int vector[]) {
		int n = vector.length;
		int k;

		for(int i = n; i >= 0; i--) {
			for(int j = 0; j < n-1; j++) {
				k = j + 1;
				if (vector[j] > vector[k]) {
					swapNumbers(j, k, vector);
				}
			}
		}
	}

	private static void swapNumbers(int i, int j, int[] array) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void bubbleSort(float vector[]) {
		int n = vector.length;
		int k;

		for(int i = n; i >= 0; i--) {
			for(int j = 0; j < n-1; j++) {
				k = j + 1;
				if (vector[j] > vector[k]) {
					swapNumbers(j, k, vector);
				}
			}
		}
	}

	private static void swapNumbers(int i, int j, float[] array) {
		float temp;

		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void selectionSort(int[] arr){

		for (int i = 0; i < arr.length - 1; i++)
		{
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index]) 
					index = j;

			int smallerNumber = arr[index];  
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

	public static void selectionSort(float[] arr){

		for (int i = 0; i < arr.length - 1; i++)
		{
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index]) 
					index = j;

			float smallerNumber = arr[index];  
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

	public static void insertionSort(int[] input){
		int temp;

		for (int i = 1; i < input.length; i++) {
			for(int j = i ; j > 0 ; j--){
				if(input[j] < input[j-1]){
					temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
	}

	public static void insertionSort(float[] input){
		float temp;

		for (int i = 1; i < input.length; i++) {
			for(int j = i ; j > 0 ; j--){
				if(input[j] < input[j-1]){
					temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
	}

}