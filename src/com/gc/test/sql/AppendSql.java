package com.gc.test.sql;

public class AppendSql {
	public static void main(String[] args) {
//		StringBuffer hsql=new StringBuffer(" ");
//		hsql.append(" select ");
//		hsql.append(" to_char(tr.trade_id)");
//		hsql.append(" ,to_char(tr.user_id)");
//		hsql.append(" ,tr.serial_number");
//		hsql.append(" ,prod.product_name");
//		hsql.append(" ,busi.trade_type");
//		hsql.append(" ,f.STAFF_NAME");
//		hsql.append(",'未竣工'");
//		hsql.append(" cur_status,'0' flag ");
//		hsql.append(" from TF_B_TRADE tr");
//		hsql.append(" ,TD_B_PRODUCT prod");
//		hsql.append(" ,TD_s_TRADETYPE busi,TD_M_STAFF f");
//		hsql.append("  where ");
//		hsql.append("  busi.trade_type_code=tr.trade_type_code");
//		hsql.append("  AND busi.NET_TYPE_CODE =tr.NET_TYPE_CODE ");
//		hsql.append("  AND busi.EPARCHY_cODE= tr.EPARCHY_CODE ");
//		hsql.append("  and prod.product_id=tr.product_id");
//		hsql.append("  and f.STAFF_ID = tr.TRADE_STAFF_ID");
//		hsql.append(" and tr.net_type_code in('95','84','83','30','41','94','93','92','91','40','87','86','42','64','85','46','35','71','47','72','45')");
//		hsql.append(" AND tr.TRADE_TYPE_CODE = '10'");
//		hsql.append(" and tr.accept_month=to_number(substr(tr.trade_id,5,2))");
//		hsql.append(" and tr.serial_number=:serialNumber order by tr.TRADE_ID desc");
		
		
//		StringBuffer hsql=new StringBuffer(" ");
//		hsql.append(" select ");
//		hsql.append(" to_char(tr.trade_id)");
//		hsql.append(" ,to_char(tr.user_id)");
//		hsql.append(" ,tr.serial_number");
//		hsql.append(" ,prod.product_name");
//		hsql.append(" ,busi.trade_type");
//		hsql.append(" ,f.STAFF_NAME");
//		hsql.append(" ,(case when tr.SUBSCRIBE_STATE='9' then '已竣工' else '未竣工' end)");
//		hsql.append(" cur_status,'1' flag ");
//		hsql.append(" from TF_BH_TRADE tr");
//		hsql.append(" ,TD_B_PRODUCT prod");
//		hsql.append(" ,TD_s_TRADETYPE busi,TD_M_STAFF f");
//		hsql.append("  where ");
//		hsql.append("  busi.trade_type_code=tr.trade_type_code");
//		hsql.append("  AND busi.NET_TYPE_CODE =tr.NET_TYPE_CODE ");
//		hsql.append("  AND busi.EPARCHY_cODE= tr.EPARCHY_CODE ");
//		hsql.append("  and prod.product_id=tr.product_id");
//		hsql.append("  and f.STAFF_ID = tr.TRADE_STAFF_ID");
//		hsql.append(" and tr.net_type_code in('95','84','83','30','41','94','93','92','91','40','87','86','42','64','85','46','35','71','47','72','45')");
//		hsql.append(" AND tr.TRADE_TYPE_CODE = '10'");
//		hsql.append(" and tr.accept_month=to_number(substr(tr.trade_id,5,2))");
//		hsql.append(" and tr.serial_number=:serialNumber order by tr.TRADE_ID desc");
		
		String sql = "select a.user_id, "+//用户编码
			       " c.state_name,"+//状态
			       " b.res_code,"+//SIM卡号
			       " d.cust_name,"+//集团客户名称
			       " a.cust_id"+//集团客户编码
			       " from Tf_f_user a, tf_f_user_res b, TD_S_SERVICESTATE c, Tf_f_cust_group d "+
			       " where (c.service_id = 10000 and a.user_state_codeset = c.state_code(+)) "+
			       " and a.cust_id = d.cust_id(+) "+
			       " and (b.res_type_code = '1' and sysdate between b.start_date and b.end_date and a.user_id = b.user_id(+)) "+
			       " and a.user_id =:userID and rownum = 1";
		
		System.out.println(sql);
	}
}
