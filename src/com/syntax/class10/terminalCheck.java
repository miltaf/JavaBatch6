package com.syntax.class10;

public class terminalCheck {

	public static void main(String[] args) {
		char[][] dollar= {
				{'$','$','$','$'},
				{'$',' ',' ','$'},
				{'$',' ',' ','$'},
				{'$','$','$','$'}
		};
		
		
				for (int r = 0; r <dollar.length; r++) {
							for (int c=0; c<dollar[r].length; c++) {
					System.out.print(dollar[r][c]+" ");
			  }
							System.out.println();
				}
	}

}
