package com.courseHunter;

import java.util.function.ObjIntConsumer;

import java.awt.*;
public class PassByValVsRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		//
		int y = incrementVal(x);
		System.out.println(x);
		System.out.println(y);
		
		//
		
		Point point = new Point(10,10);
		changePoint(point);
		System.out.println(point);
		
		
	}
	//pass by val example.
	/*static void incrementVal(int val){ copy of x will be send here not refer. of x so any change here in x wont affect the main val of x.
	 * 
		val++;
		System.out.println(val);
	}
	*/
	static int incrementVal(int val) {
		return val + 1;
		
	}
	//pass by reference example
	static void changePoint(Point point) {
		point.x = 0;
		point.y = 0;
	}
}
