package ejemplos;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;


public class E01HolaXMLViejo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//Crear factory
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		//Crear document builder
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		//Crear el documento
		Document doc = dBuilder.parse("archivos/libros.xml");
		//Imprimir propiedades del documento
		System.out.println("Documento leido");
		System.out.println("\tArchivo: " + doc.getDocumentURI());
		System.out.println("\tCodificación: " + doc.getXmlEncoding());
		System.out.println("\tVersión " + doc.getXmlVersion());
		System.out.println("\traiz: " + doc.getDocumentElement().getNodeName());
		
		
	}

}
