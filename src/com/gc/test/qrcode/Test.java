package com.gc.test.qrcode;
import java.awt.image.BufferedImage;
import java.io.File; 
import java.util.Hashtable; 
   





import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

import com.google.zxing.BarcodeFormat; 
import com.google.zxing.EncodeHintType; 
import com.google.zxing.MultiFormatWriter; 
import com.google.zxing.WriterException; 
import com.google.zxing.common.BitMatrix; 
   
public class Test { 
   
    /**
     * @param args
     * @throws Exception 
     */ 
    public static void main(String[] args) throws Exception { 
       // String text = "{\"attr\":{\"id\":\"2015092109462000000\",\"isStorage\":\"1\",\"businessType\":\"equipment\"},\"info\":{\"设备名称\":\"test201592194615343\",\"生产厂家\":\"Bruel & Kjaer 噪声与振动测量公司\",\"型号规格\":\"test201592194615343\",\"出厂编号\":\"test201592194615343\",\"放置区域\":\"仪器存放室\",\"自编号\":\"test201592194615343\"}}";
    	String text = "{\"link\":{\"详情\":\"/pda/qr/detail.action?businessType=equipment&id=271\"},\"attr\":{\"id\":\"271\",\"isStorage\":\"1\",\"businessType\":\"equipment\"},\"info\":{\"设备名称\":\"温湿度计\",\"生产厂家\":\"Testo AG\",\"型号规格\":\"Testo 608H1\",\"出厂编号\":\"1341360389\",\"放置区域\":\"辅助设备\",\"自编号\":\"FZ-005\",\"设备附件名称\":\"温湿度计#5\",\"责任维护者\":\"卢丽琴\",\"协助责任维护者\":\"黄强\"}}";
        int width = 300; 
        int height = 300; 
        //二维码的图片格式 
        String format = "bmp"; 
        Hashtable hints = new Hashtable(); 
      //margin 边框设置
        hints.put(EncodeHintType.MARGIN, 0);  
        //内容所使用编码 
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8"); 
        BitMatrix bitMatrix = new MultiFormatWriter().encode(text, 
                BarcodeFormat.QR_CODE, width, height, hints); 
        
        BufferedImage img = MatrixToImageWriter.toBufferedImage(bitMatrix);
        
        String codeData = MatrixToImageWriter.convertImageToCode(img);
		String t = ((img.getWidth() / 8 + ((img.getWidth() % 8 == 0) ? 0 : 1)) * img.getHeight()) + "";
		String w = (img.getWidth() / 8 + ((img.getWidth() % 8 == 0) ? 0 : 1)) + "";
		String zpl = "~DGOUTSTR01," + t + "," + w + "," + codeData;
		System.out.println(zpl);
        
		String content = "^FO500,50\n"+
				 "^XGOUTSTR01,1,1^FS\n";
		
		StringBuffer buf = new StringBuffer();
		buf.append(zpl).append("\n")
		.append("^XA").append("\n")
		.append(content)
		.append("^XZ");
		
		String string = buf.toString();
		
		System.out.println(string);
		
		runPrint(buf.toString());
		
        //生成二维码 
//        File outputFile = new File("d:"+File.separator+"new.bmp"); 
//        MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile); 
   
    } 
    
    
    public static void runPrint(String str) throws PrintException {
		PrintService printer = PrintServiceLookup.lookupDefaultPrintService();
		if (printer == null) {
			System.out.println("没有发现条码打印机.");
			return;
		}
		DocPrintJob job = printer.createPrintJob();
		byte[] by = str.getBytes();
		DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
		Doc doc = new SimpleDoc(by, flavor, null);
		job.print(doc, null);
	}
   
}