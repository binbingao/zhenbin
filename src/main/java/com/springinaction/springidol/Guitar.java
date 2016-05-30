package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springinaction.springidol.qualifiers.StringedInstrument;

//@Qualifier("stringed")
//@StringedInstrument
@Component
public class Guitar implements Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
