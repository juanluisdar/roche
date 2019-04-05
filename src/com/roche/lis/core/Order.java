package com.roche.lis.core;

import java.util.ArrayList;
import java.util.List;

import com.roche.lis.test.Test;

public class Order {

    private Container container;
    private List<Test> testSet = new ArrayList<Test>();

    public Order(Container container) {
	super();
	this.container = container;
    }

    public void addTest(Test test) {
    	//test f2. bugfixed 2.0
    	//hotfix 1.1.1
	testSet.add(test);
    }

    public List<Test> getTests() {
	return testSet;
    }

    public Container getContainer() {
	return container;
    }

}
