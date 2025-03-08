package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addtest {

Controller obj = new Controller();

@Test
public void testadd() {
	assertEquals(5, obj.addsum(2,3));
}

}