package com.lanqiao.Demo;

public class Factorial {

	public int getFactorial(Integer num) {
		int result = 0; 
        if ( num >= 1 && num <= 10 ){
            result = 1; 
            int i = 1;
            while ( i <= num ){
                result = result * i; 
                i++;
            }    
        }
        return result;//相当于1-num的阶乘
	}
}
