class Array123{

public void method(int a[]){
int sum=0;
for (int i:a){
sum+=a[i];}

System.out.println(sum);
}

public static void main (String as[]){

int vb[]=new int [3];
vb[0]=3;
vb[1]=2;
vb[2]=2;
Array123 a = new Array123();
a.method(vb);
}}
