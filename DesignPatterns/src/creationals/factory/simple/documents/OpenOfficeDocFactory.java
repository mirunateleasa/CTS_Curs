package creationals.factory.simple.documents;

public class OpenOfficeDocFactory extends AbstractDocumentFactory
{

	@Override
	protected IDocument createDoc(DocTypes documentType)
	{
		IDocument document = null;
		
		switch(documentType){
		case TEXT:
			document = new Document_Word("",0);
			break;
		case HTML:
			document = new Document_Html();
			break;
		case WORD:
			document = new Document_OpenOffice("NewDocument.writer");
			break;
		}
		
		return document;
	}

}
