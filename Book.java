public class Book {
    String title;
    String author;
    double price;

    public Book(){
        //or this("Unknown", "Unknown", 1.0);
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + " thb");
        System.out.println("_________________________________________________________________________");
    }
    public void updatePrice(double newPrice) {
        if(newPrice<0){
            this.price = newPrice*-1; //คำถามพี่ ta ว่าถ้าติดลบให้ทำยังไง -> แก้ค่า auto or แสดง error message แล้วไม่แก้ค่า

            //System.out.println("Warning: ก่อนหน้านี้ราคาที่แสดงด้านล่างนี้ค่าติดลบ ระบบได้ทำการแก้ไขเป็นค่าบวกให้แล้ว");
            System.out.println("Warning: The price shown below were entered as a negative values,\nthe system has now automatically corrected it to a positive values.");
        }else{
            this.price = newPrice;
        }

    }

    public void applyDiscount(double discountPercentage) {
        if(discountPercentage > 0.0 && discountPercentage < 100.0){
            double discountAmount = this.price * (discountPercentage / 100);
            double discountedPrice = this.price - discountAmount;
            this.price = discountedPrice;
            System.out.println("Discounted Applied!");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Discount Percentage: " + discountPercentage + " %");
            System.out.println("Discount Amount: " + discountAmount + " thb");
            System.out.println("Discounted Price: " + discountedPrice + " thb");
            System.out.println("_________________________________________________________________________");
        }else{
            //System.out.println("Error: เปอร์เซ็นต์การลดราคาไม่ถูกต้อง");
            System.out.println("Error: Invalid percentage input\n(The number must be greater than 0 and less than 100)");
            System.out.println("Your Input: " + discountPercentage);
            System.out.println("_________________________________________________________________________");
        }
    }
}
