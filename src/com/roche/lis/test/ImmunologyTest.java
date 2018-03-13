package com.roche.lis.test;

import com.roche.lis.core.Sample;

public class ImmunologyTest extends CommonTest {

    long immProp1;
    long immProp2;

    @Override
    public String test2(Sample sample) {

	return "test 2 changed by ImmunologyTest";
    }

}
