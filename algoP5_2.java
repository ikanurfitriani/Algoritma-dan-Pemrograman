import java.util.Scanner;
class algoP5_2 {
	public static void main(String[] args) {
		Scanner masuk=new Scanner(System.in);
		int belanja;
		System.out.print("Masukkan biaya belanja Anda = ");
		belanja=masuk.nextInt();
		if (belanja > 500000) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Anda mendapatkan diskon sebesar 25%");
			float totalbayar, hasil;
			totalbayar=0.25f*belanja;
			hasil=belanja-totalbayar;
			System.out.println("	TOTAL BAYAR BELANJA ANDA ADALAH "+hasil);
			System.out.println("================================================================================");
		} else if (belanja > 300000) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Anda mendapatkan diskon sebesar 20%");
			float totalbayar, hasil;
			totalbayar=0.2f*belanja;
			hasil=belanja-totalbayar;
			System.out.println("	TOTAL BAYAR BELANJA ANDA ADALAH "+hasil);
			System.out.println("================================================================================");
		} else if (belanja > 200000) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Anda mendapatkan diskon sebesar 10%");
			float totalbayar, hasil;
			totalbayar=0.1f*belanja;
			hasil=belanja-totalbayar;
			System.out.println("	TOTAL BAYAR BELANJA ANDA ADALAH "+hasil);
			System.out.println("================================================================================");
		} else if (belanja > 100000) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Anda mendapatkan diskon sebesar 5%");
			float totalbayar, hasil;
			totalbayar=0.05f*belanja;
			hasil=belanja-totalbayar;
			System.out.println("	TOTAL BAYAR BELANJA ANDA ADALAH "+hasil);
			System.out.println("================================================================================");
		} else if (belanja <= 100000) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Anda tidak mendapatkan diskon");
				System.out.println("	TOTAL BAYAR BELANJA ANDA TETAP YAITU "+belanja);
				System.out.println("================================================================================");
		}
	}
}