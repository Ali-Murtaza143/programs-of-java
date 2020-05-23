public class Array111
{ 

 int sum(int arr[])
     { 
         int sum = 0; // initialize sum 
     int i;
         // Iterate through all elements and add them to sum 
         for(i=0;i<arr.length;i++ ) 
            sum +=  arr[i]; 
        
         return sum; 
     } 
       
     // Driver method 
     public static void main(String[] args){ 
int arr[] = {12,11,1,2,3,4,8,3,4,2,5}; 
Array111 a= new Array111();
         System.out.println("Sum of given array is " +a.sum(arr)); 
        } 
 }