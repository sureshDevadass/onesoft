package com.onesoft.day5;

public class ToFind {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 10, 40, 20, 30, 10, 10, 20 };

		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {

			int count = 1;

			for (int j = i + 1; j < a.length; j++) {

				int visited = -1;

				if (a[i] == a[j]) {

					count++;
					a[j] = visited;
				}

			}
			b[i] = count;

		}
		for (int i = 0; i < b.length; i++) {

			if (a[i] != -1) {
				System.out.println(a[i] + "----" + b[i] + "Times");
			}

		}

	}

}
