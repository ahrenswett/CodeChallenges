import java.util.*;

class selectionSort {

	public static int[] selectionSort(int[] array) {	
		if(array.length == 1){
			return array;
		}
		int pointer;
		for(int sorted = 0; sorted < array.length; sorted++ ){
			pointer = sorted;
			for (int numToSort = sorted+1; numToSort < array.length; numToSort++){
				if(array[pointer] > array[numToSort]){
					pointer = numToSort;
				}
			}
			swap(array, sorted , pointer);
		}
    return array;
  }
	
	public static void swap(int[] array, int i, int pointer){
		int holder = array[i];
		array[i] = array[pointer];
		array[pointer] = holder;
	}
}

