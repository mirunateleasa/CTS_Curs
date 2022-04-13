package ro.ase.acs.cts.designPatterns.factory;

import ro.ase.acs.cts.documents.DocumentHtmlGeneric;
import ro.ase.acs.cts.documents.DocumentOpenOfficeText;
import ro.ase.acs.cts.documents.DocumentWordText;
import ro.ase.acs.cts.documents.models.AbstractDocument;

public class DocFactory extends AbstractDocFactory {
	
	public static final int DEFAULT_WORD_VERSION = 1;
	public static final int DEFAULT_OPEN_VERSION = 9;

	@Override
	public AbstractDocument getDocument(DocType docType, String docName) {
		switch (docType)
		{
		case WORD:
			return new DocumentWordText(docName, DEFAULT_WORD_VERSION);
			
		case HTML:
			return new DocumentHtmlGeneric (docName, false);
		case OPEN_OFFICE: 
			return new DocumentOpenOfficeText (docName, DEFAULT_OPEN_VERSION);
		default:
			throw new UnsupportedOperationException();
		}
	}

}
