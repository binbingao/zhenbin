package com.springinaction.springidol;

public class Stage {
	private Stage(){
		
	}
	private static class StageSingleHolder{
		static Stage instance=new Stage();
	}
	public static Stage getInstance(){
		return StageSingleHolder.instance;
	}
}
