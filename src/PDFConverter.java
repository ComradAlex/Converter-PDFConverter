import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.ImageIOUtil;

public class PDFConverter {
        public String pdfFileName;
        public String result_path;

        public static void local_convert (String pdfFileName, String result_path) throws IOException{

            PDDocument document = PDDocument.loadNonSeq(new File(pdfFileName), null);

            List<PDPage> pdPages = document.getDocumentCatalog().getAllPages();

            int page = 0;

            for(PDPage pdPage : pdPages){
                ++page;
                BufferedImage bim = pdPage.convertToImage(BufferedImage.TYPE_INT_RGB, 300);
                ImageIOUtil.writeImage(bim, result_path+page+".jpg", 300);
            }
        }
    }

