package com.gc.test.file;

import java.io.File;
import jxl.CellType;
import jxl.Workbook;
import jxl.biff.DisplayFormat;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.Formula;
import jxl.write.Number;
import jxl.write.NumberFormat;
import jxl.write.NumberFormats;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableHyperlink;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.junit.Test;

public class GSTest {
    @Test
    public void testGS(){
        WritableWorkbook workbook = null;
        try{
            workbook = Workbook.createWorkbook(new File("d:/link.xls"));
            WritableSheet sheet1 = workbook.createSheet("sheet1", 0);
            WritableSheet sheet2 = workbook.createSheet("sheet2", 1);

            jxl.write.Number labelNF1 = new jxl.write.Number(0, 2,0.5);
            jxl.write.Number labelNF2 = new jxl.write.Number(0, 3,45678);
            sheet1.addCell(labelNF1);
            sheet1.addCell(labelNF2);
            //将建公式
            Formula f = 
                new Formula(5, 5, "SUM(A3:A4)", getDataCellFormat(CellType.NUMBER_FORMULA));  
            sheet1.addCell(f);             
            
            WritableFont wf = new WritableFont(WritableFont.ARIAL, 10, WritableFont.NO_BOLD, false);
            //数字显示格式为浮点数百分比
            DisplayFormat displayFormat = NumberFormats.PERCENT_FLOAT;         
            WritableCellFormat wcfF = new WritableCellFormat(wf,displayFormat);
            wcfF.setAlignment(Alignment.CENTRE);
            wcfF.setVerticalAlignment(VerticalAlignment.CENTRE);
            wcfF.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);      
            Number number = new jxl.write.Number(5, 0, Double.parseDouble("1"), wcfF);
            sheet1.addCell(number);
            
            //添加超链接
            addHyperlink(5,5,sheet1,sheet2,"link test");
            
//            eu.writeExcel(wwb);
//    		eu.closeWritableWorkbook(wwb);
            
            workbook.write();
            workbook.close();
        }
        catch(Exception e){
            e.printStackTrace();   
        }
    }
    
    /**
     * 
     * @param col  链接所在列
     * @param row  链接所在行
     * @param sheet要将链接添加到哪一个工作表
     * @param destSheet 要连接到哪个工作表
     * @param linkName  链接名称
     */
    public static void addHyperlink(int col,int row,WritableSheet sheet,WritableSheet destSheet,String linkName){
        try {
            WritableHyperlink whl = new WritableHyperlink(col,row,linkName,destSheet,0,0);
            sheet.addHyperlink(whl);
        } catch (RowsExceededException e) {   
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }
    }
    
    /**  
     * 得到数据格式  
     * @return  
     */  
    public WritableCellFormat getDataCellFormat(CellType type){   
        WritableCellFormat wcf = null;   
        try {
            //字体样式   
            if(type == CellType.NUMBER || type == CellType.NUMBER_FORMULA){//数字   
               NumberFormat nf = new NumberFormat("#.00");   
               wcf = new WritableCellFormat(nf);    
            }else if(type == CellType.DATE || type == CellType.DATE_FORMULA){//日期   
                jxl.write.DateFormat df = new jxl.write.DateFormat("yyyy-MM-dd hh:mm:ss");    
                wcf = new jxl.write.WritableCellFormat(df);    
            }else{   
                WritableFont wf = 
                    new WritableFont(WritableFont.TIMES,10, WritableFont.NO_BOLD,false);
                wcf = new WritableCellFormat(wf);   
            }
            //对齐方式   
            wcf.setAlignment(Alignment.CENTRE);   
            wcf.setVerticalAlignment(VerticalAlignment.CENTRE);   
            //边框   
            wcf.setBorder(Border.LEFT,BorderLineStyle.THIN);   
            wcf.setBorder(Border.BOTTOM,BorderLineStyle.THIN);   
            wcf.setBorder(Border.RIGHT,BorderLineStyle.THIN);   
            //背景色   
            wcf.setBackground(Colour.WHITE);   
               
            wcf.setWrap(true);//自动换行   
               
        } catch (WriteException e) {   
         e.printStackTrace();   
        }   
        return wcf;   
    }
    
}
