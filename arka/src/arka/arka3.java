package arka;

public class arka3 {
	public static String draw_kotak(int x){
		int y = x+1;
		int line1 = y/2;
		int loop = y/2;
		int line2 = y/2-1;
	for (int j=1;j<line1 ;j++ ) {
		for(int a=0;a<line1 ;a++ ) {
				System.out.print("* ");
			}	
		System.out.println("");
		for(int b=0;b<line2 ;b++ ) {
				System.out.print(" *");
		}
		System.out.println("");

		if (j==line1-1) {
			for(int a=0;a<line1 ;a++ ) {
				System.out.print("* ");
			}	
		}
		
	}
		return "";
	}
	

	public static void main(String[] args) {
		draw_kotak(7);
	}
	} 
