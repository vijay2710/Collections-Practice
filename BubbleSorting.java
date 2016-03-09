
import java.util.Scanner;
import java.util.Random;


public class BubbleSorting {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the maximum value");
int max = scanner.nextInt();
int num[] = new int[10000];
for ( int k = 0;  k < 10000;  k++ )
{
num [k] = randint(max); 
}
long starttime = System.currentTimeMillis();
BubbleSort(num);
long endtime = System.currentTimeMillis();
System.out.println(endtime - starttime);

  }

public  static int randint (int n) {
Random rand = new Random (); 
int Randomnum = rand.nextInt(n);
return Randomnum;
}



public static void BubbleSort ( int [ ] num )
{
    int j;
    boolean flag = true;   
    int temp;   

    while ( flag )
    {
           flag= false;    
           for( j=0;  j < num.length -1;  j++ )
           {
                  if ( num[ j ] < num[j+1] )   
                  {
                          temp = num[ j ];                
                          num[ j ] = num[ j+1 ];
                          num[ j+1 ] = temp;
                         flag = true;                
                 } 
           } 
     } 
} 
 
}
