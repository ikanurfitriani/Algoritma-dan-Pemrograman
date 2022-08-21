import java.util.Scanner;
public class algoP8{
	public static void main (String arg[]){
		Scanner in=new Scanner(System.in);
		Scanner masuk=new Scanner(System.in);
		String merek, merk, model, mdel, model1, mdel1;
		int pil, harga, hrg, Harga1, Hrg1, price1, Harga, Hrg, price, price2;
		System.out.println("	Melihat Harga mobil/motor	");
		System.out.println("===================================================");
		System.out.println("Pilih 1 untuk melihat harga mobil");
		System.out.println("Pilih 2 untuk melihat harga motor");
		System.out.println("===================================================");
		System.out.print("Masukkan pilihan Anda : ");
		pil=in.nextInt();
		if (pil == 1)
		{
			System.out.print("Honda/Suzuki : ");
			merek=masuk.nextLine();
			System.out.println("---------------------------------------------------");
			if (merek.equals("Honda"))
			{
				System.out.print("Jazz/Brio/Mobilio : ");
				model=masuk.nextLine();
				harga=170000000;
				hrg=120000000;
				System.out.println("---------------------------------------------------");
				if (model.equals("Jazz"))
				System.out.println("Harga Mobil Honda Jazz : Rp "+harga);
				else if (model.equals("Brio"))
				System.out.println("Harga Mobil Honda Brio : Rp "+hrg);
				else if (model.equals("Mobilio"))
				System.out.println("Harga Mobil Honda Mobilio : Rp "+harga);
				else
				System.out.println("Salah masukkan model mobil");
			} else if (model.equals("Suzuki"))
			{
				System.out.print("APV/Swift/Ertiga : ");
				mdel=masuk.nextLine();
				Harga1=180000000;
				Hrg1=155000000;
				price1=160000000;
				System.out.println("---------------------------------------------------");
				if (model.equals("APV"))
				System.out.println("Harga Mobil Suzuki APV : Rp "+Harga1);
				else if (model.equals("Swift"))
				System.out.println("Harga Mobil Suzuki Swift : Rp "+Hrg1);
				else if (model.equals("mobilio"))
				System.out.println("Harga Mobil Suzuki Ertiga : Rp "+price1);
				else
				System.out.println("Salah masukkan model mobil");
				}
				else
				{
					System.out.println("Salah masukkan merek mobil");
				}
			}
		}
		else if (pil == 2)
		{
			System.out.print("Honda/Yamaha : ");
			merk=masuk.nextLine();
			System.out.println("---------------------------------------------------");
			if (merk.equals("Honda"))
			{
				System.out.print("Masukkan model motor (Vario/Supra) : ");
				model1=masuk.nextLine();
				Harga=15000000;
				Hrg=12000000;
				System.out.println("---------------------------------------------------");
				if (mdel.equals("Vario"))
				System.out.println("Harga Motor Honda Vario : Rp "+Harga);
				else if (mdel.equals("Supra"))
				System.out.println("Harga Motor Honda Supra : Rp "+Hrg);
				else
				System.out.println("Salah masukkan model motor");
			} else if (merk.equals("Yamaha"))
			{
				System.out.print("Masukkan model motor (Mio/Vixion) : ");
				mdel1=masuk.nextLine();
				Harga=14000000;
				Hrg=20000000;
				System.out.println("---------------------------------------------------");
				if (mdel.equals("Mio"))
				System.out.println("Harga Motor Yamaha Mio : Rp "+Harga);
				else if (mdel.equals("Supra"))
				System.out.println("Harga Motor Yamaha Vixion : Rp "+Hrg);
				else
				System.out.println("Salah masukkan model motor");
			}
			else
			{
				System.out.println("Salah masukkan merek motor");
			}
		}
		else
		{
			System.out.println("Salah masukkan pilihan");
	}
}
