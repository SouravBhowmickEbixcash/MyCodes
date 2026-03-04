package composite_pattern.com.example1;

import java.util.ArrayList;
import java.util.List;

public class SubMenu implements Menu{
	
	private String name;
	private List<Menu> childMenus;
	
	public SubMenu(String name) {
		super();
		this.name = name;
		this.childMenus = new ArrayList<>();
	}

	@Override
	public void display(String indent) {
		System.out.println(indent + "+ " + name + "  --------(" + getItemCount() + ")");
		
		for(Menu menu : childMenus) {
			menu.display(indent + "  ");
		}
		
	}
	
	
	public void addMenu(Menu menu) {
		this.childMenus.add(menu);
	}
	
	public void deleteMenu(Menu menu) {
		this.childMenus.remove(menu);
	}

	@Override
	public int getItemCount() {
		int count = 1;
		for(Menu menu : childMenus) {
			count += menu.getItemCount();
		}
		return count;
	}

}
