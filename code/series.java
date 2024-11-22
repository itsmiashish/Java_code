// print this serise 1,3,9,27,81.

import java.util.*;
public class series {
	public static void main(String[] args) {
		int n;
		n = 1;
        int i;
		System.out.print(n);
		for ( i = 1; i < 5; i++) {
			n = n * 3;
			System.out.print(","+n);
		}
        System.out.println();
//Find the next term in the series: 2, 5, 8, 11, 14, __?
System.out.println("the next term in the series: 2, 5, 8, 11, 14, __?");
int k;
k=2;

System.out.print(k);
for(i=0;i<5;i++)
{
k=k+3;
System.out.print(","+k);
}
System.out.println();
 //Calculate the 10th term of the series: 3, 7, 11, 15, 19, __?
 System.err.println("Calculate the 10th term of the series: 3, 7, 11, 15, 19, __?");
 int next;
 next=1;
 System.out.print(next);
 for(i=1;i<=5;i++)
 {
    next=(i*4)-1;
    System.out.print(","+next);
 }
 next=(4*10)-1;
 System.out.print(","+next);

System.out.println();
// What is the next term in the series: 2, 6, 18, 54, __?
System.out.println("What is the next term in the series: 2, 6, 18, 54, __?");
int term=2;
System.out.print(term);
for(i=1;i<=5;i++)
{
term = term*3;
System.out.print(","+term);

}
System.out.println();
System.out.println("Continue the series: 0, 1, 1, 2, 3, 5, 8, __?");
int p=0;
int j=1;
System.out.print(p+","+j);
for(i=1;i<=5;i++)
{
   int z=p+j;
System.out.print(","+z);
p=j;
j=z;
}
}
}
