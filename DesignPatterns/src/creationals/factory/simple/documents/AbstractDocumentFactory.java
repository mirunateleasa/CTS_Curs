package creationals.factory.simple.documents;

public abstract class AbstractDocumentFactory
{
	protected abstract IDocument createDoc (DocTypes documentType);
	
	public IDocument newDocument (DocTypes type, String name)
	{
		IDocument document = createDoc(type);
		
		if(document != null)
		{
			document.setName(name);
		}
		
		return document;
	}
}
