import java.util.Scanner;
class algoP5_1_1rvs {
	public static void main(String[] args) {
		Scanner masuk=new Scanner(System.in);
		int kode_pilihan;
		System.out.print("Masukkan pilihan Anda : ");
		kode_pilihan=masuk.nextInt();
		if (kode_pilihan == 1) {
			int bil1, bil2, hasil;
			bil1=36;
			bil2=25;
			hasil=bil1+bil2;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	HASIL PENJUMLAHAN 2 BILANGAN = "+hasil);
			System.out.println("================================================================================");
		} else if (kode_pilihan == 2) {
			int Bil1, Bil2, Hasil;
			Bil1=36;
			Bil2=25;
			Hasil=Bil1*Bil2;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	HASIL PERKALIAN 2 BILANGAN = "+Hasil);
			System.out.println("================================================================================");
		} else {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	SALAH MASUKKAN PILIHAN");
			System.out.println("================================================================================");
		}
	}
}