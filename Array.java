class Array{

int findMax(int ar[]){
int temp=ar[0];
for (int i:ar)
{
if (temp<i)
temp=i;
}
return temp;}
public static void main(String [] abc){
Array obj=new Array();
int arr[]={1,3,12,7,8,9};
System.out.print(obj.findMax(arr));
}}