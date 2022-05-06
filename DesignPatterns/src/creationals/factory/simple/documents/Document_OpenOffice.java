package creationals.factory.simple.documents;

public class Document_OpenOffice extends IDocument
{
	public Document_OpenOffice(String name) {
		this.setName(name);
	}
	
	@Override
	public String getType() {
		return "OpenOffice Document for text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}
}
