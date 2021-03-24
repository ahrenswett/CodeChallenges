import java.util.*;

class insertionSort {
  public static int[] insertionSort(int[] array) {
    // Write your code here.
		
	
		int position;
		for(int i = 1; i < array.length; i++){
			position = i-1;
			while( position>-1 && array[position] > array[position+1] ){
				System.out.println("heeloo");
				swap(array, position);
				position--;
			}
		}
		
    return array;
  }
	
	public static void swap(int[] array,int curPos){
		int holder = array[curPos];
		array[curPos] = array[curPos+1];
		array[curPos+1] = holder;
	}
}

