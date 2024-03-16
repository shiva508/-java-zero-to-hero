package com.comrade.java_9;

public class AutoClenableSimulator {
	public static void main(String[] args) {
		try(Resource resource=new Resource()) {
			resource.data();
		} catch (Exception e) {
			
		}
	}
}
