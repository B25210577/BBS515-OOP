public class Product {
 // Instance variables
 private String name;
 private double price;
 private int stock;
 // Constructor
 public Product(String name, double price, int stock) {
 // TODO 1: Değerleri alanlara atayınız.
	 this.name=name;
	 this.price=price;
	 this.stock=stock;
 }
 // Getter methods
 public String getName() {
 // TODO 2: Ürün adını döndürünüz.
 return this.name;// Geçici dönüş değeri
 }
 public double getPrice() {
 // TODO 3: Ürün fiyatını döndürünüz.
 return this.price; // Geçici dönüş değeri
 }
 public int getStock() {
 // TODO 4: Stok miktarını döndürünüz.
 return this.stock; // Geçici dönüş değeri
 }
 // Setter methods
 public void setPrice(double price) {
 // TODO 5: price > 0 ise güncelleyiniz;
 // aksi durumda uyarı mesajı yazdırınız.
	 if (price>0) {
		 this.price=price;
	 }
	 else {
		 System.out.println("Hata: Fiyat 0'dan büyük olmalıdır!");
	 }
 }
 public void setStock(int stock) {
 // TODO 6: stock >= 0 ise güncelleyiniz;
 // aksi durumda uyarı mesajı yazdırınız.
	 if (stock>=0) {
		 this.stock=stock;
	 }
	 else {
		 System.out.println("Hata: Stok 0 veya 0'dan büyük olmalıdır!");
	 
	 }
 }
}