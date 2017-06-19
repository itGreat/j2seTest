package com.gc.test.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSaveSort {
	
	 public final static String DUTYTYPE_NONE = "0";//无 none
    public final static String DUTYTYPE_DIRECTOR = "1";//主管 director
    public final static String DUTYTYPE_SPECIFIC_RESPONSIBILITY = "2";//专责 specific responsibility
    public final static String DUTYTYPE_MONITOR = "3";//班长 monitor
    public final static String DUTYTYPE_EMPLOYEE = "4";//班员 employee
    public final static String DUTYTYPE_BRANCH_LEADER = "5";//分管领导 branch_leader
	    /**
	     * 职责类型map
	     */
	    //public final static Map<String,String> dutyTypeList = new HashMap<String, String>(5);
	    public final static Map<String,String> dutyTypeMap = new HashMap<String, String>(5);
	    public final static Map<Integer,String> dutyTypeMap2 = new HashMap<Integer, String>(5);
		static {
			dutyTypeMap.put(DUTYTYPE_NONE, "无");
			dutyTypeMap.put(DUTYTYPE_DIRECTOR, "主管");
			dutyTypeMap.put(DUTYTYPE_SPECIFIC_RESPONSIBILITY, "专责");
			dutyTypeMap.put(DUTYTYPE_MONITOR, "班长");
			dutyTypeMap.put(DUTYTYPE_EMPLOYEE, "班员");
			dutyTypeMap.put(DUTYTYPE_BRANCH_LEADER, "分管领导");
			
			dutyTypeMap2.put(6, "无");
			dutyTypeMap2.put(2, "主管");
			dutyTypeMap2.put(5, "专责");
			dutyTypeMap2.put(4, "班长");
			dutyTypeMap2.put(3, "班员");
			dutyTypeMap2.put(1, "分管领导");
		}
	    
		
	
	public static void main(String[] args) {
		Set<Entry<String, String>> set = dutyTypeMap.entrySet();
		for (Entry<String, String> entry : set) {
			System.out.println(entry.getKey());
		}
		System.out.println("------------------");
		
		Set<Entry<Integer, String>> set2 = dutyTypeMap2.entrySet();
		for (Entry<Integer, String> entry : set2) {
			System.out.println(entry.getKey());
		}
	}
}
