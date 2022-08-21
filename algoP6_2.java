import java.util.Scanner;
class algoP6_2 {
	public static void main(String[] args){
		Scanner masuk=new Scanner(System.in);
		System.out.println("=============================================================================");
		System.out.println("			MENENTUKAN BILANGAN TERBESAR			");
		System.out.println("=============================================================================");
		int bil1, bil2, bil3;
		System.out.print("Masukkan bilangan pertama = ");
		bil1=masuk.nextInt();
		System.out.print("Masukkan bilangan kedua = ");
		bil2=masuk.nextInt();
		System.out.print("Masukkan bilangan ketiga = ");
		bil3=masuk.nextInt();
		if (bil1 < bil3 && bil2 < bil3) {
			System.out.println("============================================================");
			System.out.println("	Bilangan terbesarnya adalah "+bil3);
			System.out.println("============================================================");
		} else if (bil1 < bil2 && bil3 < bil2) {
			System.out.println("============================================================");
			System.out.println("	Bilangan terbesarnya adalah "+bil2);
			System.out.println("============================================================");
		} else if (bil2 < bil1 && bil3 < bil1) {
			System.out.println("============================================================");
			System.out.println("	Bilangan terbesarnya adalah "+bil1);
			System.out.println("============================================================");
		}
	}
}



