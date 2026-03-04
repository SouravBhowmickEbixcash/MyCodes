package composite_pattern.com.example1;

public class MenuClient {

	public static void main(String[] args) {
		
		MenuItem cola = new MenuItem("Cola", 20);
		MenuItem coke = new MenuItem("Coke", 20);
		MenuItem sprit = new MenuItem("Sprit", 30);
		MenuItem burger = new MenuItem("Burger", 217);
		MenuItem pizza = new MenuItem("Pizza", 99);
		
		
		SubMenu drinks = new SubMenu("DRINKS");
		drinks.addMenu(sprit);
		drinks.addMenu(coke);
		drinks.addMenu(cola);
		
		SubMenu meal = new SubMenu("MEALS");
		meal.addMenu(burger);
		meal.addMenu(pizza);
		
		SubMenu mainMenu = new SubMenu("MAIN MENU");
		mainMenu.addMenu(meal);
		mainMenu.addMenu(drinks);
		
		mainMenu.display("");

	}

}
