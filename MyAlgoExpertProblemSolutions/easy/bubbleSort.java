import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
    // Write your code here.
		boolean swapped = true;
		while (swapped){
			swapped = false;
			for (int i = 0; i < array.length-1; i++){	
				if (array[i] > array[i+1]){
					bubbleUp(array, i);
					swapped = true;
				}
			}
		}
    return array;
  }
	
	public static void bubbleUp(int[] array, int currentPosition){
		int holder = array[currentPosition];
		array[currentPosition] = array[currentPosition+1];
		array[currentPosition+1] = holder;
	} 
}

