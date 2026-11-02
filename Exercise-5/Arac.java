public class Arac {
 // Instance Variables
 String marka;
 String model;
 double gunlukUcret;
 boolean kiradaMi;
 void bilgileriGoster() {
	 	System.out.println("Marka: "+marka);
	 	System.out.println("Model: "+model);
	 	System.out.println("Günlük Ücret: "+gunlukUcret);
	 	String durum=(kiradaMi)?"Kirada":"Müsait";
	 	System.out.println("Durum: "+durum);
	 	System.out.println("--------------");
 }
 public Arac(String marka,String model, double gunlukUcret, boolean kiradaMi)
 {
	 this.marka=marka;
	 this.model=model;
	 this.gunlukUcret=gunlukUcret;
	 this.kiradaMi=kiradaMi;
			 
 }
 void kirala() {
 // TODO: Araç müsaitse kiralayınız; değilse uyarınız.
	 if (kiradaMi==false) {
		 System.out.println(this.marka+" "+this.model+" Kiralandı.");
		 kiradaMi=true;
	 }
	 else {
		 System.out.println("Bu araç zaten kiralanmış!");
	 }
 }
 void teslimEt() {
 // TODO: Araç kiradaysa teslim alınız; değilse uyarınız.
	 
	 if (kiradaMi)
	 {
		 System.out.println(this.marka+" "+ this.model + " başarıyla teslim alındı.");
		 kiradaMi=false;
		 
	 }
	 else {
		 System.out.println("Bu araç zaten müsait!");
	 }
		 
	 
 }
 double kiraBedeliHesapla(int gun) {
 // TODO: Gün sayısını kontrol edip bedeli hesaplayınız.
	 
	 double kiraBedeli=gun*this.gunlukUcret;
	 
	 
 return kiraBedeli; // Geçici dönüş değeri; değiştiriniz.
 }
 
}
