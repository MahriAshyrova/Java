package com.class17_2;

public class ClockNestedLoops {

	public static void main(String[] args) {
		// 24hours, 60 minutes

		ClockNestedLoops clock=new ClockNestedLoops();
		clock.clockIt();
		
		
			
		
	}
	void clockIt() {
		
		for (int h=0; h<24; h++)	{
			
			for (int m=0; m<60; m++) {
				if(m<10) { //(m<=9)
					System.out.println(h+":0" +m);
				}else {
					System.out.println(h+ ":" +m);
				
				}	
			}
			
		}
		
	}

}
