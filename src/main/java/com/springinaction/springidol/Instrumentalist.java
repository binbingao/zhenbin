package com.springinaction.springidol;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springinaction.springidol.qualifiers.StringedInstrument;
@Component("eddie")
public class Instrumentalist implements Performer{
	//@Value("abc")
	private String song;
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	//@Autowired(required=false)
	//@Qualifier("instrument")
	//@StringedInstrument
	//@Inject
	//@Inject
	//@Named
	private Instrument instrument;
	public Instrumentalist(){}
	//@Autowired
	
	public Instrumentalist(Instrument instrument){
		this.instrument=instrument;
	}
	@Override
	public void perform() throws PerformanceException {
		System.out.println("playing "+song+ " : ");
		instrument.play();
	}
	public String screamSong(){
		return song;
	}
	//@Autowired
	public void setInstrument(Instrument instrument){
		this.instrument=instrument;
	}
	//@Autowired
	public void heresYourInstrument(Instrument instrument){
		this.instrument=instrument;
	}
	
}
