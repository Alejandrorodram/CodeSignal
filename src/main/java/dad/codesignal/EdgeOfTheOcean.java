package dad.codesignal;

import java.util.Arrays;

public class EdgeOfTheOcean {

	public int adjacentElementsProduct(int[] inputArray) {
	    int checking;
	    int checking2;
	    int product1;
	    int product2 = 0;
	    int maxNum = 0;
	    
	    while (maxNum < inputArray.length-1){
	        checking = inputArray[maxNum];
	        checking2 = inputArray[maxNum+1];
	        product1 = checking*checking2;
	        if (product2 == 0){
	            product2 = product1;
	        }
	        if (product2<product1){
	            product2 = product1;
	        }
	        maxNum++;
	    }
	    
	    return product2;
	}
	
	public int shapeArea(int n) {
	    return n * ((n - 1) * 2) + 1;
	}
	
	public int makeArrayConsecutive2(int[] statues) {
	    int numberOfStatuesNeeded = 0;
	    
	    Arrays.sort(statues);
	    
	    for(int i = 1; i<statues.length; i++) {
	        numberOfStatuesNeeded += (statues[i] - (statues[i-1]+1));
	    }
	    
	    return numberOfStatuesNeeded;
	}
	
	public boolean almostIncreasingSequence(int[] sequence) {

	    int contador = 0;
	        for (int i = 0; i < sequence.length - 1; i++) {
	            if (sequence[i] - sequence[i+1] >= 0) {
	                    contador ++;
	            if (i - 1 >= 0 && i + 2 <= sequence.length - 1
			       && sequence[i] - sequence[i+2] >= 0
			       && sequence[i-1] - sequence[i+1] >= 0) {
			            return false;
			    }
	        }
	     }
	        return contador <= 1;
	    

	}
	
	public int matrixElementsSum(int[][] matrix) {
	    int i, j;
		int sum = 0;
		    
		for(i=0 ; i < matrix.length; i++){
		    for(j=0; j < matrix[i].length; j++){
		        if(matrix[i][j] == 0){
		            for(int k = i; k < matrix.length; k++ ){
		                    matrix[k][j]=0;
		            }
		        }
		        sum = sum + matrix[i][j];
		    }
		}
		return sum;
	}
}
