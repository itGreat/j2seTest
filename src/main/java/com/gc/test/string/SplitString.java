package com.gc.test.string;

public class SplitString {
	public static void main(String[] args) {
		//String strs = "方健、马智远、陈国炎、朱青霞、雷超平、罗健斌、崔晓飞、黄裕春";
//		String strs = "苏海博、庞彪、黄强、顾春晖、杨鹏";
//		String strs = "李光茂、刘宇、敖昌民";
//		String strs = "刘建成、余蔓茹、陈彤生、黄飞强、李智宁、吴杰";
//		String strs = "陈凯菲、孔詠、吴国威、叶加骅、黎洪发";
//		String strs = "老洪干、刘婉媚、秦重俭、何昊、杨森、杨珏、王斯斯";
//		String strs = "陈凯文、胡汉辉、黄子忠、柯庆辉、梁绮冬、梁达承、王剑韬、雷超平、杜钢";
//		String strs = "林悦树、罗祖为、钟丽芳、罗道芳、曾植榆、徐水萍、冯文英、潘晓珊";
//		String strs = "林炳坤、翁可欢、何耀荣、韩绮华、黎凯君、黄展帮、谢炳伦、罗小梅、陈展棠、吴晓桂";
//		String strs = "杜学明、陈丽梅、廖智雄、王波";
//		String strs = "董志雯、黄永洪、李嘉礼、李应强、肖天为";
//		String strs = "章新中、廖晨、曲德宇、田妍、范伟男";
//		String strs = "吴焕峰、王伟强、梁莹莹、江秀云、蔡丽红";
//		String strs = "孟祥强、缪国钢、梁俊煦、叶永文、张婉雯";
//		String strs = "张德智、唐寅、裴利强";
//		String strs = "戴月容、宋浩永、林满堂、黄永卫、吴培伟、李聃、陈于晴、何彬彬";
		String strs = "卢青、劳秀萍、练穆森、李助亚、许诗琪";
//		String strs = "";
//		String strs = "";
//		String strs = "";
//		String strs = "";
//		String strs = "";
//		String strs = "";
		
		
		String[] split = strs.split("、");
		for (String string : split) {
			System.out.println(string);
		}
	}
}
