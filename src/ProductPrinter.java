
public class ProductPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product("Toaster", 29.95);
		System.out.print("The product " + product1.getName() + " costs " + product1.getPrice() + " before discount, ");
		product1.reducePrice(5);
		System.out.println("and costs " + product1.getPrice() + " after discount");
		Product product2 = new Product("Diapers", 36.15);
		System.out.print("The product " + product2.getName() + " costs " + product2.getPrice() + " before discount, ");
		product2.reducePrice(5);
		System.out.println("and costs " + product2.getPrice() + " after discount");
	}

}
