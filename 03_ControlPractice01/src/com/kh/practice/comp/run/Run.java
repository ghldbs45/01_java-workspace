package com.kh.practice.comp.run;

import java.rmi.server.UID;

import com.kh.practice.comp.func.CompExample;
import com.kh.practice.comp.func.RockPaperScissors;
import com.kh.practice.comp.func.UpAndDown;

public class Run {

	public static void main (String[] args) {
		
		CompExample c = new CompExample();
		//c.practice5();
		
		UpAndDown u = new UpAndDown();
		//u.upDown();
		
		RockPaperScissors r = new RockPaperScissors();
				r.rps();
		
		
		
	}
}
