Actividad: Crear un documento Markdown
=

a) La definición de 'lenguaje de marcas'.
-

Un **lenguaje de marcas** es un lenguaje que anota el texto de modo que el ordenador puede manipularlo. La mayoría de los lenguajes de marcas son legibles debido a que las anotaciones están escritas de forma tal que se puedan distinguir de los textos. Por ejemplo, con HTML, XML y XHTML, las etiquetas de formato son ‹ y ›. El texto que aparece dentro de uno de esos delimitadores se considera parte del lenguaje de marcado y no parte del texto anotado. Por ejemplo, ‹ p › este es un párrafo de texto escrito en HTML ‹ /p ›.

Al dar formato al texto que se desea imprimir (o visualizar en un ordenador o TV), es necesario distinguir entre el texto en sí y las instrucciones para imprimir el texto. Las marcas son las instrucciones para mostrar o imprimir el texto.

El marcado no tiene que ser legible por ordenador. Las anotaciones hechas en un texto en papel o en un libro son también marcas. Por ejemplo, muchos estudiantes para poner de relieve algunas frases de sus libros de texto. 

Esto indica que el texto en negrita es más importante que el texto que lo rodea. El color más destacado es el marcado.

El marcado se convierte en un lenguaje cuando las reglas están codificadas en torno a cómo escribir y usar el marcado. Ese mismo alumno puede tener su propio "lenguaje de marcado al tomar notas" si las reglas codificadas son como por ejemplo "marcador morado es para las definiciones, resaltador amarillo es para los detalles del examen, y notas a lápiz en los márgenes 
para recursos adicionales." Pero la mayoría de los lenguajes de marcas se definen por una autoridad externa para permitir su uso por muchas personas diferentes.

[Información original](http://www.um.es/docencia/barzana/DIVULGACION/INFORMATICA/Que-son-lenguajes-marcado.html).

b) Caracterísiticas, ventajas o inconvenientes de su uso.
-

Libera al creador del documento de preocupaciones específicas del formato del documento tales como:

  * Especificación de la fuente.
  * Línea espaciamiento.
  * Disposición de página requerida por Script. 

Usando GML, un documento está marcado con las etiquetas que definen cuáles son el texto, en términos de párrafos,listas, tablas, y así sucesivamente. El documento se puede entonces ajustar al formatoauto amáticamente para varios dispositivos simplemente especificando un perfil para el dispositivo. Por ejemplo, es posible ajustar a formato un documento para una impresora laser o para unapantalla simplemente especificando un perfil para el dispositivo sin cambiar el documento.

Bibliografia:


c) Una clasificación de los tipos de lenguajes de marcas.
-

Tipos de lenguajes de marcas:
	
* Orientados a la presentación: En ellos al texto común se añaden palabras encerradas en símbolos especiales que contienen indicaciones de formato que permiten a los traductores de este tipo de documentos generar un documento final en el que el texto aparece con el formato indicado. Es el caso de HTML en el que se indica cómo debe presentarse el texto (y no por 
ejemplo lo que significa el mismo) también se considera así los archivos generados por los procesadores de texto tradicionales en los que al texto del documento se le acompaña de indicaciones de formato (como negrita, cursiva,...).

###La imágen incrustada: animación HTML. 
![Lenguaje XML](http://www.formacarm.es/joomla/images/stories/html.png)

* Orientados a la descripción: En ellos las marcas especiales permiten dar significado al texto pero no indican cómo se debe presentar en pantalla elmismo. Sería el caso de XML (o de SGML) y JSON en el que la presentación nunca se indica en el documento; simplemente se indica una semántica de contenido que lo hace ideal para almacenar datos (por ejemplo si el texto es un nombre de persona o un número de identificación fiscal).

###La imágen incrustada: animación XML. 
![Lenguaje XML](http://arquitecturadeaurelianosc.files.wordpress.com/2011/10/xml1.gif)
	
* Orientados a procedimientos: Se trata de documentos en los que hay texto marcado especialmente que en realidad se interpreta como órdenes a seguir y así el archivo en realidad contiene instrucciones a realizar con el texto. Es el caso de LaTeX o PostScript donde por ejemplo se puede indicar una fórmula matemática.

###La imágen incrustada: animación PostScript. 
![Lenguaje XML](http://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/PostScript.svg/200px-PostScript.svg.png)

[Información original](http://www.jorgesanchez.net/web/lmsgi/LMSGI01.pdf).