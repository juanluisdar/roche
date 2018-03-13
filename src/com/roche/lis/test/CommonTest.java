package com.roche.lis.test;

import com.roche.lis.core.Sample;

/**
 * This class contains basic or common operations for every test
 * 
 * @author juanluis
 *
 */
public class CommonTest implements Test {

    long propT1;
    long propT2;

    /*
     * (non-Javadoc)
     * 
     * @see com.roche.lis.test.Test#test1(com.roche.lis.Sample)
     */
    @Override
    public String test1(Sample sample) {
	// do operation
	return "test 1.";
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.roche.lis.test.Test#test2(com.roche.lis.Sample)
     */
    @Override
    public String test2(Sample sample) {
	// do operation2
	return "test 2.";
    }

}
