public class Ex01 {

    public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int answer = i * j;
				if (answer < 10) {
					System.out.print("0"); 
				}
				System.out.print(answer + " ");
			}
			System.out.println();
		}
	}


}
