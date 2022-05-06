package creationals.factory.simple.documents;

public class Main
{
	public static void main (String [] args)
	{
		AbstractDocumentFactory docFactory = null;
		
		docFactory = new OfficeDocFactory();
		
		Document_Word wordDoc = (Document_Word) docFactory.createDoc(DocTypes.TEXT);
		
		System.out.println(wordDoc.toString());
	}
}
