package ro.ase.acs.cts.main;

import ro.ase.acs.cts.designPatterns.factory.DocFactory;
import ro.ase.acs.cts.designPatterns.factory.DocType;
import ro.ase.acs.cts.designPatterns.simpleFactory.DocSimpleFactory;
import ro.ase.acs.cts.documents.DocumentHtmlGeneric;
import ro.ase.acs.cts.documents.DocumentOpenOfficeText;
import ro.ase.acs.cts.documents.DocumentWordText;
import ro.ase.acs.cts.documents.models.AbstractDocument;

public class Main {
	public static void main(String[] args) {
		
		//theese are all upcastings:
//			AbstractDocument htmlDoc = new DocumentHtmlGeneric("index.html", true);
//			AbstractDocument msWordDoc = new DocumentWordText ("course.docx", 12);
//			AbstractDocument openOfficeDoc = new DocumentOpenOfficeText ("assignment.odl");
		
		//with the factory method implemented
		DocFactory docFactory = new DocFactory();
		AbstractDocument msWordDoc = docFactory.getDocument(DocType.WORD, "course.docx");
		
		//with the simple factory implemented
		AbstractDocument msWordDocSimple = DocSimpleFactory.getDocument(DocType.WORD, "course.docx");
	}
}
