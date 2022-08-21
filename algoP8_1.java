import java.util.Scanner;
public class algoP8_1{
	public static void main (String arg[]){
		Scanner in=new Scanner(System.in);
		Scanner masuk=new Scanner(System.in);
		String merek, merk, model, mdel, model1, mdel1;
		int pil, harga, hrg, Harga1, Hrg1, price1, Harga, Hrg, price, price2;
		System.out.println("	Melihat Harga mobil/motor	");
		System.out.println("Pilih 1 untuk melihat harga mobil");
		System.out.println("Pilih 2 untuk melihat harga motor");
		System.out.print("Masukkan pilihan Anda : ");
		pil=in.nextInt();
		if (pil == 1)
		{
			System.out.print("Honda/Suzuki : ");
			merek=masuk.nextLine();
			if (merek.equals("Honda"))
			{
				System.out.print("Jazz/Brio/Mobilio : ");
				model=masuk.nextLine();
				harga=170000000;
				hrg=120000000;
				if (model.equals("Jazz"))
				System.out.println("Harga Mobil Honda Jazz : Rp "+harga);
				else if (model.equals("Brio"))
				System.out.println("Harga Mobil Honda Brio : Rp "+hrg);
				else if (model.equals("Mobilio"))
				System.out.println("Harga Mobil Honda Mobilio : Rp "+harga);
				else
				System.out.println("Salah masukkan model mobil");
			} else if (merek.equals("Suzuki"))
			{
				System.out.print("APV/Swift/Ertiga : ");
				mdel=masuk.nextLine();
				Harga1=180000000;
				Hrg1=155000000;
				price1=160000000;
				if (mdel.equals("APV"))
				System.out.println("Harga Mobil Suzuki APV : Rp "+Harga1);
				else if (mdel.equals("Swift"))
				System.out.println("Harga Mobil Suzuki Swift : Rp "+Hrg1);
				else if (mdel.equals("Ertiga"))
				System.out.println("Harga Mobil Suzuki Ertiga : Rp "+price1);
				else
				System.out.println("Salah masukkan model mobil");
				}
				else
				{
					System.out.println("Salah masukkan merek mobil");
			}
		}
		else if (pil == 2)
		{
			System.out.print("Honda/Yamaha : ");
			merk=masuk.nextLine();
			if (merk.equals("Honda"))
			{
				System.out.print("Vario/Supra : ");
				model1=masuk.nextLine();
				Harga=15000000;
				Hrg=12000000;
				if (model1.equals("Vario"))
				System.out.println("Harga Motor Honda Vario : Rp "+Harga);
				else if (model1.equals("Supra"))
				System.out.println("Harga Motor Honda Supra : Rp "+Hrg);
				else
				System.out.println("Salah masukkan model motor");
			} else if (merk.equals("Yamaha"))
			{
				System.out.print("Mio/Vixion : ");
				mdel1=masuk.nextLine();
				price=14000000;
				price2=20000000;
				if (mdel1.equals("Mio"))
				System.out.println("Harga Motor Yamaha Mio : Rp "+price);
				else if (mdel1.equals("Vixion"))
				System.out.println("Harga Motor Yamaha Vixion : Rp "+price2);
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
}