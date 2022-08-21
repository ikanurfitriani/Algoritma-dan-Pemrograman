import java.util.Scanner;
public class uas3
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		int bil1, bil2;
		System.out.print("Masukkan batas awal : ");
		bil1 = masuk.nextInt();
		System.out.print("Masukkan batas akhir : ");
		bil2 = masuk.nextInt();
		System.out.print("Deret : ");
		while (bil1<=bil2) {
			if (bil1%2==0 && bil1%4==0)
			System.out.print(bil1+ " ");
			bil1++;
		}
		System.out.println();
	}
}