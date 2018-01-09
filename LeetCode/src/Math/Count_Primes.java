package Math;

import java.util.Scanner;

public class Count_Primes {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(countPrimes(n));

	}

	public static int countPrimes(int n) {

		if (n <= 1) {
			return 0;
		}

		boolean[] notPrime = new boolean[n];
		notPrime[0] = true;
		notPrime[1] = true;

		for (int i = 2; i * i < n; i++) {
			if (!notPrime[i]) {
				for (int j = 2 * i; j < n; j += i) {
					notPrime[j] = true;
				}
			}
		}

		int result = 0;
		for (boolean b : notPrime) {
			if (!b) {
				result++;
			}
		}

		return result;
	}

	public static int countPrimes1(int n) {
		if (n < 3)
			return 0;
		boolean notprime[] = new boolean[n];

		int count = n / 2;
		for (int i = 3; i * i < n; i+=2) {
			if (notprime[i])
				continue;
			for (int j = i * i; j < n; j += i * 2) {
				if (!notprime[j]) {
					count --;
					notprime[j] = true;
				}
			}
		}
		return count;
	}
}
