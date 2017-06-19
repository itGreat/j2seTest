package com.gc.test.string;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class EqNull {
	public static void main(String[] args) {
	 Object obj = null;
	 System.out.println(String.valueOf(obj).equals("null") );
//	 System.out.println(obj+"");
		
//		String fileUri = "/themes/img/dzqm_ymc.png";//获取签名图片的路径需要动态获取，待修改
//		System.out.println(fileUri.substring(fileUri.lastIndexOf("/") + 1));"E:\picture\19398026_205614550000_2.jpg"
//		int w1 = 650, h1 = 800;
//		BufferedImage bufferedImage;
//		try {
//			bufferedImage = ImageIO.read(new File("E:\\picture\\19398026_205614550000_2.jpg"));
//			int width = bufferedImage.getWidth(); 
//			int height = bufferedImage.getHeight();
//			
//			int w = (width > w1 ? w1 : width)*3/4;
//			int h = (height > h1 ? h1 : height)*3/4;
//			
//			System.out.println(w);
//			System.out.println(h);
//		} catch (IOException e) {
//			
//		}
		
//		System.out.println( (115*3/4)  );
//		System.out.println( (35*3/4)  );
		
	}
	
}
