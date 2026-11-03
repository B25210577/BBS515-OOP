public class ProductManager {
 public void urunBilgileriniGoster(Product product) {
 // TODO 1: Getter metotlarıyla adı,
 // fiyatı ve stok miktarını yazdırınız.
	 
	 System.out.println("Ürün: "+product.getName());
	 System.out.println("Fiyat: "+product.getPrice());
	 System.out.println("Stok: "+product.getStock());
	 System.out.println("-------------");
	 
 }
 

 public void satisYap(Product product, int adet) {
 // TODO 2: adet pozitif mi kontrol ediniz.
 // Yeterli stok varsa stoktan düşünüz.
 // Değilse uyarı mesajı gösteriniz.
 // İPUCU: product.getStock(), product.setStock(...)
	 if (adet>0) {
		 product.setStock(product.getStock()-adet);
		 System.out.println (adet+ " adet "+ product.getName()+ " satıldı.");
	 }
	 
	 else {
		 
		 System.out.println("Satış miktarı 0'dan büyük olmalıdır.");
		 	 
	 }
 }
 public void stokEkle(Product product, int adet) {
 // TODO 3: adet pozitifse mevcut stoka ekleyiniz.
 // Güncel stok miktarını yazdırınız.
	 if (adet>0) {
		 product.setStock(product.getStock()+adet);
		 System.out.println(adet+ " adet "+ product.getName()+ " stoka eklendi.");	 
	 }
	 else {
		 System.out.println("Adet 0'dan büyük olmalıdır.");
	 }
 }
}

