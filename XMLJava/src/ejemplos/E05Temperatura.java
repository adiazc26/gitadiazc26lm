package ejemplos;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class E05Temperatura {

	public static void main(String[] args) {
		Document doc = E01HolaXML.abrirXML("http://www.aemet.es/xml/municipios/localidad_45102.xml");
		
		//Queremos buscar la lista de autores
		XPathFactory xpFactory = XPathFactory.newInstance();
		XPath xPath = xpFactory.newXPath();
		
		String consultamax = "/root/prediccion/dia[1]/temperatura/maxima/text()";
		String consultamin = "/root/prediccion/dia[1]/temperatura/minima/text()";
		String maxima=null;
		String minima=null;
		
		//Obtener un texto

		try {
			maxima = (String)xPath.evaluate(consultamax, doc, XPathConstants.STRING);
			minima = (String)xPath.evaluate(consultamin, doc, XPathConstants.STRING);
		} catch (XPathExpressionException e) {
			System.out.println("Error en el XPath");
			e.printStackTrace();
		}
		if(maxima!=null){
			System.out.println("La temperatura máxima esperada para mañana es Mocejón es: " + maxima + ".");
			System.out.println("La temperatura mínima esperada para mañana es Mocejón es: " + minima + ".");
			
		}
		

	}

}
