// Fibonacci series

package exercise.java;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a = 0; 
		int b = 1;
		for(int i=1;i<=10;i++) {
			int c = a+b;
			System.out.println(+c);
			a=b;
			b=c;
		}}}*/
		
		// fibonacci using Array
		
		int limit = 10;
		long series[]=new long [limit];
		     series[0]=0; 
		     series[1]=1;
		for(int i =2;i<limit;i++) {
			 series[i]=series[i-1]+series[i-2];
		}
			System.out.println(" fibonacci series up to "+limit);

		for(int i=0;i<limit;i++) {
		System.out.println(series[i]+"");
		}
			
	}}
		