package com.vivek.patternprinting.pyramid.main;
import com.vivek.patternprinting.pyramid.*;

public class MainPyramid {
	public static void main(String[] args) {
		Pyramids pyramid=new Pyramids();
		pyramid.setLimit(4);
		pyramid.printPyramid1();
		pyramid.printPyramid2();
		pyramid.printPyramid3();
		pyramid.printPyramid4();
	}
}
