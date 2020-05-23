import java.util.Scanner;
public class arrayinput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=s.nextInt();
        String x[]=new String[size];
        System.out.println(x.length); System.out.println("Enter elements of array: ");
        s.nextLine();
        for(int i=0; i<x.length; i++){
           x[i]=s.nextLine();
         }
       for(int i=0; i<x.length; i++)
        { //x[i]=s.nextLine();
           System.out.print(" "+x[i]);}
       System.out.println();
       //deletes
         System.out.println("enter the element you want to delete: ");
         String element = s.nextLine();
         for(int i=0; i<x.length; i++) {
            if (x[i].equals(element)) {
                for(int j=i; j<x.length-1; j++){
                    x[j]=x[j+1];            }
    break;}}
        String x2[]=new String[size-1];
        System.arraycopy(x, 0, x2, 0, x2.length);
        for(int i=0; i<x2.length; i++){
                System.out.print(" "+x2[i]);
            }System.out.println();
        System.out.println("Do you want to insert an element? (1/0): ");
        int insert=s.nextInt();
        if(insert==1){
            System.out.println("At what position do you want to insert you element: ");
            int at=s.nextInt();
            s.nextLine();
            System.out.println("enter the element to insert: ");
            String element2=s.nextLine();
            for(int i=at; i<x.length; i++) {
                     x[at+1]=x[at];
                     if(i==x.length-1)
                         break;}
                  x[at]=element2;
            for(int i=0; i<x.length; i++){
                System.out.print(" "+x[i]);}}}}