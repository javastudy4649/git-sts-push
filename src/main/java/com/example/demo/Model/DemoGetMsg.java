package com.example.demo.Model;

public class DemoGetMsg {

	private String msgval;
	private String msgval2;
	
	//Constructor
	public DemoGetMsg(){
		msgval = "今日の天気は晴れです。";
		msgval2 = "今日の気温は12℃です。";
	}
	
	public String getMsg() {
		return msgval;
	}
	
	public String getMsg2I() {
		return msgval2;
	}
}