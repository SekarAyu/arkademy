package arka;

public class arka5 {
	public static int count_handshake(int x){
		int hasil=0, temp =1, temp2=1;
		for (int a=1;a<=x ;a++ ) {
			temp = temp*a;
		}

		for (int b=1;b<=(x-2) ;b++ ) {
				temp2 = temp2*b;
		}

		hasil = temp/(temp2*2);
		System.out.println(hasil);
		return hasil;
	}

	public static void main(String[] args) {
		count_handshake(5);
	}
}
