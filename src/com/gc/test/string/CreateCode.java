package com.gc.test.string;


public class CreateCode {
	public static void main(String[] args) {
		createTemplateCode(3,6);
	}

	private static void createTemplateCode(int begin,int end) {
		for (int i = begin; i <= end; i++) {
			StringBuffer buf = new StringBuffer();
			buf.append("HashMap<String,String> hashMap"+i+" = new HashMap<String, String>();").append("\n");
			buf.append("hashMap"+i+".put(\"R1\", \"coil_gb5"+i+"\");").append("\n");
			buf.append("hashMap"+i+".put(\"R2\", \"calc_result"+i+"\");").append("\n");
			buf.append("list.add(hashMap"+i+");").append("\n");
			System.out.println(buf);
		}
	}
}
