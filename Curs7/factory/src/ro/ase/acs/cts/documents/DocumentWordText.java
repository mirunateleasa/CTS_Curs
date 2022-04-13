package ro.ase.acs.cts.documents;

import ro.ase.acs.cts.documents.models.AbstractDocument;

public class DocumentWordText extends AbstractDocument {
	
	private int version;

	public DocumentWordText(String title, int version) {
		this.setName(title);
		this.version = version;
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
