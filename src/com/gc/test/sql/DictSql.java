package com.gc.test.sql;

public class DictSql {
	public static void main(String[] args) {
		String sql = "";
		
		String ns = "汕头市广信电气设备有限公司,广州南方电力集团电器有限公司,东莞市梅兰电器有限公司,广东威力电力器材有限公司,东莞市电力线路器材有限公司,江苏宏源电气有限责任公司,广东迪生电力钢构器材有限公司,广州南方电力集团电器有限公司,广东中鹏电气有限公司,广东华达电力集团有限公司,深圳市金宏威技术有限公司,广州南方电力集团电器有限公司,广东科源电气有限公司,北京ABB高压开关设备有限公司,浙江晨光电缆股份有限公司,汇网电气有限公司,平高集团有限公司,广西纵览线缆集团有限公司,厦门ABB电器控制设备有限公司,合荣电气股份有限公司,广东广特电气有限公司,西门子中压开关技术（无锡）有限公司,欧玛嘉宝开关设备有限公司,厦门华电开关有限公司,广东环兴电力器材有限公司,施耐德开关（苏州）有限公司";
		
		int id = 100;
		int seq = 1;
		String[] split = ns.split(",");
		for (String s : split) {
			sql = "insert into a_dictionary (id, parent_id,code,value, valid,note,name,seq)values ("+(++id)+", 1, null,null, 1,null,'"+s+"' ,"+(++seq)+");";
			System.out.println(sql);
		}
		
	}
}
