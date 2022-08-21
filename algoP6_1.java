import java.util.Scanner;
class algoP6_1 {
	public static void main(String[] args) {
		Scanner masuk=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("			PERHITUNGAN 2 BILANGAN			");
		System.out.println("================================================================================");
		int kode_pilihan;
		System.out.print("Masukkan pilihan Anda : ");
		kode_pilihan=masuk.nextInt();
		switch (kode_pilihan) {
			case 1:
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("PENJUMLAHAN 2 BILANGAN");
			int bil1, bil2, hasil;
			System.out.print("Masukkan bilangan pertama = ");
			bil1=masuk.nextInt();
			System.out.print("Masukkan bilangan kedua = ");
			bil2=masuk.nextInt();
			hasil=bil1+bil2;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	HASIL PENJUMLAHAN 2 BILANGAN = "+hasil);
			System.out.println("================================================================================");
			break;
				case 2:
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("PENGURANGAN 2 BILANGAN");
				int Bil1, Bil2, Hasil;
				System.out.print("Masukkan bilangan pertama = ");
				Bil1=masuk.nextInt();
				System.out.print("Masukkan bilangan kedua = ");
				Bil2=masuk.nextInt();
				Hasil=Bil1-Bil2;
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("	HASIL PENGURANGAN 2 BILANGAN = "+Hasil);
				System.out.println("================================================================================");
				break;
					case 3:
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("PERKALIAN 2 BILANGAN");
					int Bila1, Bila2, kali;
					System.out.print("Masukkan bilangan pertama = ");
					Bila1=masuk.nextInt();
					System.out.print("Masukkan bilangan kedua = ");
					Bila2=masuk.nextInt();
					kali=Bila1*Bila2;
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("	HASIL PERKALIAN 2 BILANGAN = "+kali);
					System.out.println("================================================================================");
					break;
			default:
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("	SALAH MEMASUKKAN PILIHAN");
				System.out.println("================================================================================");
				break;
		}
	}
}