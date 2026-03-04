package composite_pattern.com.example2;

public class TextNode implements HtmlNode{
	
	private String text;

	public TextNode(String text) {
		super();
		this.text = text;
	}

	@Override
	public String render(String indent) {
		return "\n" + indent + text + indent;
	}

}
