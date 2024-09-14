package kazanç_vesaire;

import java.util.Scanner;

public class Kuruyemişçi {

	public static void main(String[] args) {

		/*
		 * bir kuruyemişçitoptancıdan 
		 * 12 kilo leblebiyi kilosunu 3.5 
		 * 25 kilo fındık kilosunu 15.7 
		 * 40 kilo badem kilosunu 22 tl den almıştır
		 * 
		 * bu ürünleri satarken, ---> leblebiyi %50 ---> fındığı +40 ---> bademi %60
		 * fazlasına satıyor
		 * 
		 * esnaf bugünki kazancıyla kirayı ödemeyi planlıyor
		 * 
		 * kira=500tl kazandığı para 500den büyükse kirayı ödesin değilse ödeyemesin
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		int kira = 500;
		
		double Leblebi = 12;
		double Fındık = 25;
		double Badem = 40;

		double MaliyetTutar = (Leblebi * 3.5) + (Fındık * 15.7) + (Badem * 22);

		double SatışLeblebi = (Leblebi * 1.5);
		double SatışFındık = (Fındık * 1.4);
		double SatışBadem = (Badem * 1.6);

	    System.out.print("Kaç kilo leblebi sattınız : ");	
	    double satılanleblebi = scanner.nextDouble();
	    
	    System.out.print("kaç kilo fındık satıldı : ");
	    double satılanfındık = scanner.nextDouble();
	    
	    System.out.print("Kaç kilo badem satıldı : ");
	    double satılanbadem = scanner.nextDouble();
	      
	        double SatışTutar = (satılanbadem*SatışBadem) + (satılanfındık*SatışFındık) + (satılanleblebi*SatışLeblebi) ;
	   	 
	   	   	double KarTutar = SatışTutar - MaliyetTutar;

		if (KarTutar >=kira) {
			System.out.println("kirayı ödeyebilirsin. Ödemeden sonra kalan paranız : " + (KarTutar - kira) );
			System.out.println("Kazanç tutarı : " + KarTutar);
		} else {
			System.out.println("Kirayı ödemek için paranız yok ;(");
		}

		System.out.println("maliyet tutarı : " + MaliyetTutar);

		System.out.println("SatışTutar tutarı : " + SatışTutar);
	}
}
