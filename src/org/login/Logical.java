package org.login;

public class Logical {

	public static void main(String[] args) {
		for(int i=10;i>0;i--){
			if(i%2==0){
			//System.out.println(i+" = even");
			}else if(i%2==1){
			//System.out.println(i+" = odd");
			}
			}
		
		int a=1564;
		int count=0;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum=sum+rem;
			System.out.print(rem);
			a=a/10;
			count++;
			
		}
		System.out.println("");
		System.out.println(count);
		System.out.println(sum);
	}
	
	
}
