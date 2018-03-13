package com.roche.lis.test;

import com.roche.lis.core.Sample;

public class BiochemistryTest extends CommonTest {

    long bioProp1;
    long bioProp2;

    @Override
    public String test1(Sample sample) {

	return "test 1 changed Bio";
    }

}
