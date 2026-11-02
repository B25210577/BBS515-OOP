public class Main {
 public static void main(String[] args) {
	 System.out.println("===ARAÇ KİRALAMA SİSTEMİ===");
 Arac arac1 = new Arac("Toyota","Corolla",1500,false);
 Arac arac2 = new Arac("Renault","Clio",1200,false);
 Arac arac3 = new Arac("BMW","320i",3000,true);
 
 	arac1.bilgileriGoster();
 	arac2.bilgileriGoster();
 	arac3.bilgileriGoster();
 // TODO 3: arac1 nesnesini kiralayınız.
 	arac1.kirala();
 // TODO 4: arac1 nesnesini tekrar kiralamayı deneyiniz.
 	arac1.kirala();
 // TODO 5: arac2 için 5 günlük kira bedelini hesaplayınız.
 	
 	
 	System.out.println("5 günlük kiralama bedeli: "+arac2.kiraBedeliHesapla(5)+" TL");
 // TODO 6: arac3 nesnesini teslim alınız.
 	arac3.teslimEt();
 // TODO 7: Üç aracın güncel bilgilerini yazdırınız.
 	
 	System.out.println("=== GÜNCEL ARAÇ DURUMLARI ===");
 	arac1.bilgileriGoster();
 	arac2.bilgileriGoster();
 	arac3.bilgileriGoster();
 	
 }
}