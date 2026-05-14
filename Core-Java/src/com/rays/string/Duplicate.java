package com.rays.string;

public class Duplicate {

	public static void main(String[] args) {

		String str = "din dayal sharma";

		int count = 0;

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			count = 1;

			boolean alreadyCounted = false;
			for (int k = 0; k < i; k++) {
				if (ch[k] == ch[i]) {
					alreadyCounted = true;
					break;
				}
			}

			if (alreadyCounted) {
				continue;
			}

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;

				}
			}

			System.out.println(ch[i] + " repeats " + count + " times");

		}
	}

}
