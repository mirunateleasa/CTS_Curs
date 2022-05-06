package creationals.factory.simple.documents;

public class Document_Html extends IDocument
{
	@Override
	public String getType() {
		return "HTML Document";
	}

	@Override
	public void print(String text) {
		System.out.println("<p>"+text+"</p>");
	}
}
