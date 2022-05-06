package creationals.factory.simple.documents;

public class Document_Word extends IDocument
{
	public Document_Word(String title, int vb) {
		this.setName(title);
	}
	
	@Override
	public String getType() {
		return "MSWord Document for text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}
}
