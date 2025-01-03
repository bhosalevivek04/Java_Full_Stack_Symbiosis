package com.vivek.patternprinting.pyramid;

public class Pyramids {
	int limit;

	public Pyramids() {
		limit = 0;
	}

	public Pyramids(int limit) {
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

//	   1 
//	   2 3 
//	  4 5 6 
//	 7 8 9 10 

	public void printPyramid1() {
		int number = 1;
		for (int row = 1; row <= limit; row++) {
			for (int space = 1; space <= limit - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(number++ + " ");
			}
			System.out.println();
		}
	}

//	    1 
//	   A B 
//	  2 3 4 
//	 C D E F 
	public void printPyramid2() {
		int number = 1;
		char ch = 'A';
		for (int row = 1; row <= limit; row++) {
			for (int space = 1; space <= limit - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print((row % 2 == 0) ? (ch++ + " ") : (number++ + " "));
			}
			System.out.println();
		}
	}

//	    1 
//	   A 2 
//	  3 B 4 
//	 C 5 D 6 
	public void printPyramid3() {
		int number = 1;
		char ch = 'A';
		for (int row = 1; row <= limit; row++) {
			for (int space = 1; space <= limit - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
//				if (row % 2 == 0) {
//					if (col % 2 == 0) {
//						System.out.print(number++ + " ");
//					} else {
//						System.out.print(ch++ + " ");
//					}
//				} else {
//					if (col % 2 == 0) {
//						System.out.print(ch++ + " ");
//					} else {
//						System.out.print(number++ + " ");
//					}
//				}

				System.out.print((row % 2 == 0) ? ((col % 2 == 0) ? number++ + " " : ch++ + " ")
						: ((col % 2 == 0) ? ch++ + " " : number++ + " "));
			}
			System.out.println();
		}

	}

//	    1 
//	   A 2 B 
//	  3 C 4 D 5 
//	 E 6 F 7 G 8 H 
	public void printPyramid4() {
		int number = 1;
		char ch = 'A';
		for (int row = 1; row <= limit; row++) {
			for (int space = 1; space <= limit - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row * 2 - 1; col++) {
				System.out.print((row % 2 == 0) ? ((col % 2 == 0) ? number++ + " " : ch++ + " ")
						: ((col % 2 == 0) ? ch++ + " " : number++ + " "));
			}
			System.out.println();
		}
	}
}
