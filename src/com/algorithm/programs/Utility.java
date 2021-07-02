package com.algorithm.programs;

import java.util.Arrays;
public class Utility {
	       
	
	        // INSERTIONSORT
	
		/**
		 * sorted integer array in descending order
		 */
	public int[] insertionSortDescending(int[] binaryIntArray) {
			
		for(int i = 1; i < binaryIntArray.length; i++) {
			int key = binaryIntArray[i];
			int j = i - 1;
			while((j > -1) && (binaryIntArray[j] < key)) {				
				binaryIntArray[j+1] = binaryIntArray[j];
				j--;
			}
			binaryIntArray[j+1] = key;
		}
			
		return binaryIntArray;
	}
		
	/**
	 *  binaryStringArray - string array to sort
	 *  sorted string array in descending order
	 */
	public String[] insertionSortDescending(String[] binaryStringArray) {

		for(int i = 1; i < binaryStringArray.length; i++) {
			String key = binaryStringArray[i];
			int j = i - 1;
			while((j > -1) && (binaryStringArray[j].compareTo(key) < 0)) {				
				binaryStringArray[j+1] = binaryStringArray[j];
				j--;
			}
			binaryStringArray[j+1] = key;
		}
			
		return binaryStringArray;
	}
		
		
	/**
	 * binaryStringArray - input string array to sort
	 * array in ascending order
	 */
	public String[] insertionSortAscending(String[] binaryStringArray) {
			
		for(int i = 1; i < binaryStringArray.length; i++) {
			String key = binaryStringArray[i];
			int j = i - 1;
			while((j > -1) && (binaryStringArray[j].compareTo(key) > 0)) {				
				binaryStringArray[j+1] = binaryStringArray[j];
				j--;
			}
			binaryStringArray[j+1] = key;
		}
			
		return binaryStringArray;
	}
		
		         //BUBBLESORT
		
	public int[] bubbleSortAscending(int[] binaryIntArray) {

		int n = binaryIntArray.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n - 1 - i); j++) {
				if(binaryIntArray[j] > binaryIntArray[j+1]) {
					int temp = binaryIntArray[j];
					binaryIntArray[j] = binaryIntArray[j+1];
					binaryIntArray[j+1] = temp;
				}
			}
		}
		return binaryIntArray;
 }
		
				//MERGE-SORT
			
	public String[] mergeSort(String[] array){
		if(array.length == 1){
			return array;
		}
		String first[] = new String[array.length / 2];
		String last[] = new String[array.length - (array.length / 2)];
		for(int i = 0; i < first.length; i++){
			first[i] = array[i];
		}
		int j = 0;
		for(int i = first.length; i < array.length; i++){
			last[j] = array[i];
			j++;
		}
		first = mergeSort(first);
		last = mergeSort(last);
				
		String[] returnArray = new String[array.length];
		int firstPos = 0, lastPos = 0;
		for(int i = 0; i < returnArray.length; i++){
			if(lastPos == last.length){
				returnArray[i] = first[firstPos];
				firstPos++;
			}
			else if(firstPos == first.length){
				returnArray[i] = last[lastPos];
				lastPos++;
			}
			else if(first[firstPos].compareTo(last[lastPos]) > 0){
			returnArray[i] = last[lastPos];
				lastPos++;
			}
			else{
				returnArray[i] = first[firstPos];
				firstPos++;
			}
		}
		return returnArray;
	}

}


