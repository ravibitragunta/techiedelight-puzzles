package com.jle.techiedelight.DnC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SqrtBinarySearch implements CommandLineRunner {

	public long getSquareRoot (long number) {
		
		if (number <=2)
			return number;
		
		long start = 1, end = number/2, result = 0;
		System.out.println ("end->"+end);
		while (start < end) {
			long mid = (start + end)/2;
			
			long sqr = mid * mid;
			System.out.println ("mid ->" + mid + "-sqr->"+sqr);
			if (sqr == number)
				return mid;
			if (sqr < number) {
				start = mid + 1;
				result = mid;
			} else {
				end = mid - 1;
			}
		}
		
		return result;
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println (getSquareRoot(1000000000));
	}

}
