import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.File; 
import java.io.IOException;

public class main {
   public static void main(String[] args) throws IOException {
	  //String inputFile = "origin.pdf";
	  //String outputFile = "new.pdf";
	  String inputFile = args[0];
	  String outputFile = args[1];
      File file = new File(inputFile);
      PDDocument doc = PDDocument.load(file);      
      PDFMergerUtility PDFmerger = new PDFMergerUtility();
      PDFmerger.setDestinationFileName(outputFile);
      PDFmerger.addSource(file);
      PDFmerger.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());
      doc.close();
   }
}