package com.roche.lis.core;

public class Container {
    Sample sample;
    String label;

    public Container(Sample sample, String label) {
	this.sample = sample;
	this.label = label;
    }

    public Sample getSample() {
	return sample;
    }

}
