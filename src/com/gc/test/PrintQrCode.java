package com.gc.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
 

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
 

import com.gc.test.qrcode.MatrixToImageWriter;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
 
public class PrintQrCode {
    private static final Integer WIDTH=200;
    private static final Integer HEIGHT=200;
 
    private  void print(File file) throws WriterException, IOException, PrintException {
        HashPrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
        DocFlavor flavor = DocFlavor.INPUT_STREAM.PNG;
        PrintService defaultService = PrintServiceLookup
                .lookupDefaultPrintService();
        DocPrintJob job = defaultService.createPrintJob(); // 创建打印作业
        Object fis = new FileInputStream(file); // 构造待打印的文件流
        DocAttributeSet das = new HashDocAttributeSet();
        Doc doc = new SimpleDoc(fis, flavor, das);
        job.print(doc, null);
    }
    /**二维码打印*/
    public Boolean printQRCode(String code,String filePath) {
        try {
            String format = "png";
            Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
            hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
            BitMatrix bitMatrix = new MultiFormatWriter().encode(code,
                    BarcodeFormat.QR_CODE, WIDTH, HEIGHT, hints);
             File outputFile = new File(filePath);
            MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
            print(outputFile);
            return true;
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PrintException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static void main(String[] args) {
    	PrintQrCode p = new PrintQrCode();
    	p.printQRCode("123456", "d://a.png");
    	
	}
}