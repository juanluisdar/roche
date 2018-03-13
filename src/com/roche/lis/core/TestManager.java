package com.roche.lis.core;

import com.roche.lis.refactored.BioTest;
import com.roche.lis.refactored.BioTest2;
import com.roche.lis.test.BiochemistryTest;
import com.roche.lis.test.CommonTest;
import com.roche.lis.test.Test;

public class TestManager {

    public static void main(String[] args) {

	Sample s = new Sample();
	s.setPropA("prop1");

	Container c = new Container(s, "John Doe");

	Order o = new Order(c);

	o.addTest(new BiochemistryTest());

	// tests original
	doCalculations(o);

	Order o2 = new Order(c);

	Test t = new CommonTest();
	o2.addTest(new BioTest2(new BioTest(t))); // we are adding 2 operations
						  // of Biochemistry type to
						  // common test.

	System.out.println("\nrefactoring: \n");

	doCalculations(o2);
    }

    static public void doCalculations(Order o) {
	Sample s = o.getContainer().getSample();
	for (Test test : o.getTests()) {
	    System.out.println("result calculations: \n\t" + test.test1(s) + "\n\t" + test.test2(s));
	}
    }

}
