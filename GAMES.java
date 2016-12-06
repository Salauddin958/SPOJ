package com.spoj.primes;

import java.util.Scanner;

public class GAMES {
	
	static long gcd(long a,long b){
		return b==0?a:gcd(b, a%b);
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int testCases=scan.nextInt();
		int t,count,i;
		boolean flag;
		while(testCases-- > 0)
		{
			String avg=scan.next();
			long number=1,frac;
			count=0;
			flag=false;
			for(i=avg.length()-1;i>=0;i--){
				if(avg.charAt(i)=='.'){
					flag=true;
					break;
				}
				count++;
			}
			for(i=0;i<avg.length();i++){
				if(avg.charAt(i)!='.'){
					number=number*10+(avg.charAt(i)-48);
				}
			}
			frac=1;
			if(flag){
				frac=(long) Math.pow(10, count);
			}
			System.out.println(frac/(gcd(number, frac)));
		}
	}

}
