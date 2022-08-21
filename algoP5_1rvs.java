import java.util.Scanner;
class algoP5_1rvs {
	public static void main(String[] args) {
		Scanner masuk=new Scanner(System.in);
		int kode_pilihan;
		System.out.print("Masukkan pilihan Anda : ");
		kode_pilihan=masuk.nextInt();
		if (kode_pilihan == 1) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Menghitung penjumlahan 2 bilangan");
			int bil1, bil2, hasil;
			System.out.print("Masukkan bilangan pertama = ");
			bil1=masuk.nextInt();
			System.out.print("Masukkan bilangan kedua = ");
			bil2=masuk.nextInt();
			hasil=bil1+bil2;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	HASIL PENJUMLAHAN 2 BILANGAN TERSEBUT ADALAH "+hasil);
			System.out.println("================================================================================");
		} else if (kode_pilihan == 2) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Menghitung perkalian 2 bilangan");
			int Bil1, Bil2, Hasil;
			System.out.print("Masukkan bilangan pertama = ");
			Bil1=masuk.nextInt();
			System.out.print("Masukkan bilangan kedua = ");
			Bil2=masuk.nextInt();
			Hasil=Bil1*Bil2;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	HASIL PERKALIAN 2 BILANGAN TERSEBUT ADALAH "+Hasil);
			System.out.println("================================================================================");
		} else {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("	SALAH MASUKKAN PILIHAN");
			System.out.println("================================================================================");
		}
	}
}