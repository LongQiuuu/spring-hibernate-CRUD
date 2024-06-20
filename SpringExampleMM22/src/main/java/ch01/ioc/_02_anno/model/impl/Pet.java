package ch01.ioc._02_anno.model.impl;

import ch01.ioc._02_anno.model.IPet;

abstract public class Pet implements IPet {
    private String name;
    
	public Pet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
