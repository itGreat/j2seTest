package com.gc.test.qrcode;
import com.google.zxing.common.BitMatrix; 
    

 import javax.imageio.ImageIO; 

import org.apache.commons.lang3.StringUtils;

import java.io.File; 
import java.io.OutputStream; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
    
    
 public final class MatrixToImageWriter { 
    
   private static final int BLACK = 0xFF000000; 
   private static final int WHITE = 0xFFFFFFFF; 
    
   private MatrixToImageWriter() {} 
    
      
   public static BufferedImage toBufferedImage(BitMatrix matrix) { 
     int width = matrix.getWidth(); 
     int height = matrix.getHeight(); 
     BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); 
     for (int x = 0; x < width; x++) { 
       for (int y = 0; y < height; y++) { 
         image.setRGB(x, y, matrix.get(x, y) ? BLACK : WHITE); 
       } 
     } 
     return image; 
   } 
    
      
   public static void writeToFile(BitMatrix matrix, String format, File file) 
       throws IOException { 
     BufferedImage image = toBufferedImage(matrix); 
     if (!ImageIO.write(image, format, file)) { 
       throw new IOException("Could not write an image of format " + format + " to " + file); 
     } 
   } 
    
      
   public static void writeToStream(BitMatrix matrix, String format, OutputStream stream) 
       throws IOException { 
     BufferedImage image = toBufferedImage(matrix); 
     if (!ImageIO.write(image, format, stream)) { 
       throw new IOException("Could not write an image of format " + format); 
     } 
   } 
   
   public static String convertImageToCode(BufferedImage img) {
		StringBuffer sb = new StringBuffer();
		long clr = 0, n = 0;
		int b = 0;
		for (int i = 0; i < img.getHeight(); i++) {
			for (int j = 0; j < img.getWidth(); j++) {
				b = b * 2;
				clr = img.getRGB(j, i);
				String s = String.format("%X", clr);

				if (s.substring(s.length() - 6, s.length() - 6 + 6).compareTo(
						"BBBBBB") < 0) {
					b++;
				}
				n++;
				if (j == (img.getWidth() - 1)) {
					if (n < 8) {
						b = b * (2 ^ (8 - (int) n));
						sb.append(StringUtils.leftPad(String.format("%X", b),
								2, "0"));
						// sb.append(String.format("%X", b).PadLeft(2, '0'));
						b = 0;
						n = 0;
					}
				}
				if (n >= 8) {
					sb.append(StringUtils.leftPad(String.format("%X", b), 2,
							"0"));
					// sb.append(String.format("%X", b).PadLeft(2, '0'));
					b = 0;
					n = 0;
				}
			}
			sb.append("\n");
		}
		return sb.toString();

	}
    
 }