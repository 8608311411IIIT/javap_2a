import java.util.*;
public class Acad2a
{
public static void main(String []args){
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number range from 5-10");
n=sc.nextInt();
for(i=0;i<n;i++){
  for(j=0;j<n;j++){
     if(i==j||j==(n-i-1))
        System.out.print("*");
     else
        System.out.print(" ");
  }
  System.out.print("\n");
 }
}
}
