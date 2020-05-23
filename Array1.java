import java.util.*;
class Array1{

int findMax(int arr[]){
int temp=arr[0];
for(int i:arr){
if(temp<i)
temp=i;}
return temp;
}


int findMin(int arr[]){
int temp=arr[0];
for(int i:arr){
if(temp>i)
temp=i;}
return temp;
}                                   

public static void main (String[] aab){
int b[]={1,2,3,5,0,-1,10,54,22};
Array1 obj=new Array1();
System.out.println(b+"    "+"the max and min of the given array is :"+obj.findMax(b)+" "+obj.findMin(b));
}}