package Math;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Roman_to_Integer {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		String s;
		s = input.nextLine();
		int n = romanToInt(s);
		System.out.println(n);

	}

	public static int romanToInt(String s) {
		char[] ss = s.toCharArray();
		int ret = toNumber(ss[0]);
		for (int i = 1; i < s.length(); i++) {
			if ((toNumber(ss[i - 1]) < toNumber(ss[i]))) {
				ret += toNumber(ss[i]) - 2 * toNumber(ss[i - 1]);
				//System.out.printf("ret :%d\n",ret);
			} else {
				ret += toNumber(ss[i]);
				//System.out.printf("ret :%d ss[i]%c\n",ret,ss[i]);
			}
		}
		return ret;
	
	}

	public static int toNumber(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

}
