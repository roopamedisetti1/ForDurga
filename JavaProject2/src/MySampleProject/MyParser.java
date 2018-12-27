//STEP 5- PARSE THE XML

package MySampleProject;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;


public class MyParser {
 
	
	
	public GFInbound parseXML(String path) {
		
	 try {
			File file = new File(path);
			System.out.println("path="+file.getAbsolutePath());
			
			JAXBContext jaxbContext = JAXBContext.newInstance(GFInbound.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			GFInbound gfInbound = (GFInbound) jaxbUnmarshaller.unmarshal(file);
			
					
			
		
			return gfInbound;
		
		 } catch (JAXBException e) {
				e.printStackTrace();
				return null;
		 }

	}




		
}
