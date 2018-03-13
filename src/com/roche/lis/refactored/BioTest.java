package com.roche.lis.refactored;

import com.roche.lis.core.Sample;
import com.roche.lis.test.Test;

/**
 * Add new operation 1 to Test1 and Test2
 * 
 * @author juanluis
 *
 */
public class BioTest extends TestDecorator {

    public BioTest(Test test) {
	super(test);
    }

    public String doOper1(Sample sample) {
	return " added Oper1.";
    }

    public String doOper2(Sample sample) {
	return " added Oper2.";
    }

    @Override
    public String test1(Sample sample) {
	return test.test1(sample) + this.doOper1(sample);
    }

    @Override
    public String test2(Sample sample) {
	return test.test2(sample) + this.doOper2(sample);
    }

}
