package composite_pattern.com.example1;

public class MenuItem implements Menu{
	
	private String name;
	private double price;
	
	
	public MenuItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void display(String indent) {
		System.out.println(indent + "- " + name + " ----->" + price + " Rs");
		
	}

	@Override
	public int getItemCount() {
		return 1;
	}

}
