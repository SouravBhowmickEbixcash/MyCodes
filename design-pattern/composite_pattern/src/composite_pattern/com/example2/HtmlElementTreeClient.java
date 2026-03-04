package composite_pattern.com.example2;

public class HtmlElementTreeClient {

	public static void main(String[] args) {
		HtmlElement li1 = new HtmlElement("li");
        li1.addChild(new TextNode("Item 1"));

        HtmlElement li2 = new HtmlElement("li");
        li2.addChild(new TextNode("Item 2"));

        HtmlElement ul = new HtmlElement("ul");
        ul.addChild(li1);
        ul.addChild(li2);

        HtmlElement div = new HtmlElement("div");
        div.addChild(new TextNode("My List:"));
        div.addChild(ul);

        System.out.println(div.render(""));

	}

}
