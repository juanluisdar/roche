package com.roche.lis.refactored;

import com.roche.lis.core.Sample;
import com.roche.lis.test.Test;

/**
 * It implements
 * 
 * @author juanluis
 *
 */
public abstract class TestDecorator implements Test {

    protected final Test test;

    public TestDecorator(Test test) {
	super();
	this.test = test;
    }

    public String test1(Sample sample) {
	return test.test1(sample);
    }

    public String test2(Sample sample) {
	return test.test2(sample);
    }
}
