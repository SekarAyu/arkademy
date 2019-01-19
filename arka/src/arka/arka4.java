package arka;

public class arka4 {
	public static String print_abc(int x, int y){
		String[] letter ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
			for (int b=0;b<y*x ;b++ ) {
				System.out.print(letter[b]+" ");
				if ((b+1)%x==0) {
					System.out.println(" ");
				}
		}
		return "";
	}
	public static void main(String[] args) {
		print_abc(3,4);
	}
}
