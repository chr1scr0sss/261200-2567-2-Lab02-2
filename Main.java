public class Main {
    public static void main(String[] args) {
//        Book book1 = new Book();
//        book1.price = 55.0;

        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();


        hp1Book.updatePrice(-32000.00); //test ราคาติดลบดูการแปลงค่า
        hp1Book.displayDetails();

        hp1Book.applyDiscount(-20); //test ราคาติดลบดู error message
        hp1Book.displayDetails();
        hp1Book.applyDiscount(0); //test ไม่ลดราคาดู error message
        hp1Book.displayDetails();
        hp1Book.applyDiscount(0.5); //test ราคาปรกติดู success reduced price message
        hp1Book.displayDetails();
        hp1Book.applyDiscount(25.00); //test ราคาปรกติดู success reduced price message
        hp1Book.displayDetails();
        hp1Book.applyDiscount(50); //test ราคาปรกติดู success reduced price message
        hp1Book.displayDetails();
        hp1Book.applyDiscount(100.00); //test ราคาเหลือ 0 ดู error message
        hp1Book.displayDetails();
        hp1Book.applyDiscount(150); //test ราคาติดลบดู error message
        hp1Book.displayDetails();
    }
}