package sungbok.submit02;

public class sadsda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
		int[] numArray = { 21, 80, 12, 35, 7, 42, 5 };
		int count = 0;
		for (int i : numArray) {
			if (numArray[i] % 2 == 0) {
				count++;
			}

		}
	}
}
