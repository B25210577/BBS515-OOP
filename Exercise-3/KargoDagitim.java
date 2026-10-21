
public class KargoDagitim {

	public static void main(String[] args) {
		int teslimatNo=1;
		int mesafe=0; 
		double ucret=0, genelToplam=0;
		for (teslimatNo=1;teslimatNo<=10;teslimatNo++) {
			mesafe=teslimatNo*5;
			if(mesafe<=10) {
				ucret=50;
			}
			else if (mesafe<=30)
				ucret=80;
			else 
				ucret=120;
			if (teslimatNo%3==0)
				ucret=ucret+20;
			if (mesafe>=40)
				ucret=ucret*0.9;
			genelToplam=ucret+genelToplam;
			System.out.println(teslimatNo+". Teslimat - Mesafe: "+ mesafe+ " km - Ücret: "+ucret+" TL ");
			
		}
		
		System.out.println("Genel Toplam:"+genelToplam+" TL");
		
	}

}
