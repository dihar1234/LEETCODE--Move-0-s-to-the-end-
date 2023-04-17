class Solution {
    public void moveZeroes(int[] arr) {
            int count = 0;  
			
 
        for (int i = 0; i < arr.length; i++){
		//the count variable is used to count the total number of elements which are not equal to zero.
            if (arr[i] != 0)
                arr[count++] = arr[i]; 
        }
 
      
        while (count < arr.length)
            arr[count++] = 0;
			//making the values zero after the counting is done .
    
    }
}