package com.springinaction.springidol;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;



public class OneManBand implements Performer {
	public OneManBand(){
		
	}
	private Collection<Instrument> instruments;
	
	public void setInstruments(Collection<Instrument> instruments){
		this.instruments=instruments;
	}
	@Override
	public void perform() throws PerformanceException {
		if(instruments==null){
			System.out.println("instruments is null");
			return;
		}
		for(Instrument instrument:instruments){
		/*String value=(String) instruments.get(key);
			System.out.println(key+" "+value);*/
			instrument.play();
		}
	}

}
