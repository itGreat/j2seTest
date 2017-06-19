package com.gc.test;

import java.io.UnsupportedEncodingException;


public class Test {
	
	/* 帖子状态 */
	public final static Integer SHIELD = Integer.valueOf(0);//屏蔽
	public final static Integer NORMAL = Integer.valueOf(1);//正常
	
	public static String toJsonStr(){
		StringBuffer buf = new StringBuffer();
		String name = "互感器局放检测成套装置";
		buf.append("{");
		buf.append("\"设备名称\"").append(":\"").append(name).append("\",");
			/*map.put("设备名称",""+equipment2.getName()+"");
		 map.put("生产厂家",""+equipment2.getFactoryName()+"");
		 map.put("型号规格",""+equipment2.getFactoryModel()+"");
		 map.put("出厂编号",""+equipment2.getFactoryNo()+"");
		 map.put("放置区域",""+equipment2.getStorageArea()+"");
		 map.put("自编号",""+equipment2.getDefineNo()+"");
		 map.put("购置批次",""+equipment2.getPurchaseBatch()+"");
		 map.put("购进日期",""+equipment2.getPurchaseDate()+"");
		 map.put("数量",""+equipment2.getQuantity()+"");
		 map.put("固定资产卡片号",""+equipment2.getAssetNo()+"");
		 map.put("出入库状态",""+equipment2.getStorageState()+"");
		 map.put("设备状态",""+equipment2.getState()+"");
		 map.put("校准状态",""+equipment2.getCalibState()+"");
		 map.put("当前校准日期",""+equipment2.getCalibDate()+"");
		 map.put("校准有效期",""+equipment2.getCalibValidYears()+"");
		 map.put("校准有效期至",""+equipment2.getCalibValidEnddate()+"");
		 map.put("实际校准时间",""+equipment2.getCalibRealDate()+"");
		 map.put("下次计划校准日期",""+equipment2.getCalibNextDate()+"");
		 map.put("校准单位",""+equipment2.getCalibOrg()+"");
		 map.put("校准费用",""+equipment2.getCalibCost()+"");
		 map.put("校准备注",""+equipment2.getCalibRemark()+"");
		 map.put("备注",""+equipment2.getRemark()+"");*/
		buf.append("}");
		return buf.toString();
	}
	
	
	 /*  public void printCN(String strCN, int x, int y,int h,int w,int b) {
		   String s_prt_buffer = "";
		   String s_prt = "";
           byte[] ch = str2bytes(strCN);
           for (int off = 0; off < ch.length;) {
                 if (((int ) ch[off] & 0x00ff) >= 0xA0) {//ASCII码值"0xa0"表示汉字的开始
                       int qcode = ch[off] & 0xff;
                       int wcode = ch[off + 1] & 0xff;
                       s_prt_buffer = s_prt_buffer
                                  + String.format("^FO%d,%d^XG0000XX,%d,%d^FS\n", x,
                                              y, qcode, wcode,b,b); 
                       s_prt +=  String.format("~DG0000XX,00072,003,\n", qcode, wcode);                                                                  
                                              
                      qcode = (qcode + 128 - 32) & 0x00ff; //区码：或qcode = (qcode - 128 - 32) & 0x00ff;（一般这样用）可达到减去0xA0的效果
                      wcode = (wcode + 128 - 32) & 0x00ff; //位码：或wcode = (wcode - 128 - 32) & 0x00ff;（一般这样用）可达到减去0xA0的效果
                       int offset = ((int) qcode - 16) * 94 * 72 + ((int) wcode - 1)
                                  * 72;//偏移量是指字模首字节距离文件头的相对位置
                       for (int j = 0; j < 72; j += 3) {
                            qcode = ( int) dotfont [j + offset] & 0x00ff;
                            wcode = ( int) dotfont [j + offset + 1] & 0x00ff;
                             int qcode1 = (int) dotfont[j + offset + 2] & 0x00ff;
                             s_prt +=  String.format("XXX\n", qcode, wcode,qcode1); //X  --- 以十六进制显示，不足两位则补零
                      }
                      x = x + 25*b;
                      off = off + 2; //中文包含两个字节
                } else if (((int) ch[off] & 0x00FF) < 0xA0) {
                      printChar(String. format("%c",ch[off]), x, y, h, w);
                      x = x + 15;
                      off++; //英文包含一个字节
                }
          }
    }*/

     public static byte[] str2bytes(String s) {
           if (null == s || "".equals(s)) {
                 return null ;
          }
           byte[] abytes = null;
           try {
                abytes = s.getBytes( "gb2312");
          } catch (UnsupportedEncodingException ex) {
          }
           return abytes;
    }
	public static void main(String[] args) {
		
		System.out.println(toJsonStr());
		
		//System.out.println(CommentState.normal);
		
		//
		/*Boolean flag = Test.NORMAL.equals(null);
		System.out.println(flag);*/
	/*	
		boolean busy = false;
		int i=0;
		while(true){
			if(busy) i++;
			else{
				
			}
		}*/
	}
}
