package com.gc.test.string;

public class TestSplit {
	public static void main(String[] args) {
//		String s = "角色添加";
//		String[] split = s.split("-");
//		System.out.println(split.length);
		
//		String s2 = "样品名称 出厂编号 运货人信 铭牌信息 照片 当前检测状态 检测结果 抽样单号 厂家名称 入库时间 检测区域 出库时间";
//		s2.replace(" ", "\t");
//		System.out.println("样品名称 \t 出厂编号\t运货人信\t铭牌信息\t照片\t当前检测状态\t检测结果\t抽样单号\t厂家名称 \t 入库时间 \t 检测区域\t出库时间");
//		System.out.println("设备名称\t出厂编号\t厂家\t入库时间\t出库时间\t计量检定\t技术参数 \t照片\t 产品说明书\t计量证书");
		
		System.out.println("样品名称:".split(":").length);
	}
}
