package com.gc.test.string;

public class ForSql {

	public static void main(String[] args) {
		for (int i = 1; i <= 40; i++) {
			StringBuffer sql = new StringBuffer();
			sql.append("insert into tbl_ledger(id, device_name, spec, product_number, lab_number, tech_parameter, quantity, mfrs, purchase_date, valid_date, correct_date, allocation_area, keeper, note) ");
			sql.append("values (");
			sql.append(i+",");
			sql.append("'000"+i+"',");
			sql.append("'000"+i+"',");
			sql.append("'000"+i+"',");
			sql.append("'000"+i+"',");
			sql.append("'000"+i+"',");
			sql.append("'000"+i+"',");
			sql.append("'000"+i+"',");
			
			sql.append("to_date('2014-05-01','yyyy-mm-dd') ,");
			sql.append("to_date('2014-05-02','yyyy-mm-dd') ,");
			sql.append("to_date('2014-05-03','yyyy-mm-dd') ,");
			
			sql.append("'000"+i+"',");
			sql.append("'000"+i+"',");
			sql.append("'000"+i+"'");
			sql.append(");");
			System.out.println(sql.toString());
		}

	}
	
}
