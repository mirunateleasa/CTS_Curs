package ro.ase.acs.cts.documents;

import ro.ase.acs.cts.documents.models.AbstractDocument;

public class DocumentOpenOfficeText extends AbstractDocument{

	
	public DocumentOpenOfficeText(String name, int defaultWordVersion) {
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
