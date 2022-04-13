package ro.ase.acs.cts.documents;

import ro.ase.acs.cts.documents.models.AbstractDocument;

public class DocumentHtmlGeneric extends AbstractDocument{

	boolean hasHeader;
		
	public DocumentHtmlGeneric(String name, boolean hasHeader) {
		this.setName(name);
		this.hasHeader = hasHeader;
	}

	@Override
	public String getType() {
		return "HTML Document";
	}

	@Override
	public void print(String text) {
		System.out.println("<p>"+text+"</p>");
	}

}
