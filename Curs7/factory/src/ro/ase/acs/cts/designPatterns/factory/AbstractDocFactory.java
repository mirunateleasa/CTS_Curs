package ro.ase.acs.cts.designPatterns.factory;

import ro.ase.acs.cts.documents.models.AbstractDocument;

public abstract class AbstractDocFactory {
	public abstract AbstractDocument getDocument(DocType docType, String docName);
}
