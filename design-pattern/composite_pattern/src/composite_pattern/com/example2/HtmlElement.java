package composite_pattern.com.example2;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement implements HtmlNode{
	
	
	private String tagName;
	private List<HtmlNode> elements;
	

	public HtmlElement(String tagName) {
		super();
		this.tagName = tagName;
		this.elements = new ArrayList<>();
	}



	@Override
	public String render(String indent) {
		StringBuilder sb = new StringBuilder();
		sb.append("\n").append(indent).append("<").append(tagName).append(">").append(indent);
		for(HtmlNode node : elements) {
			sb.append(node.render(indent + " "));
		}
		sb.append("\n").append(indent).append("</").append(tagName).append(">").append(indent);
		
		return sb.toString();
	}
	
	
	public void addChild(HtmlNode child) {
		elements.add(child);
	}
	
	public void removeChild(HtmlNode child) {
		elements.remove(child);
	}
	

}
