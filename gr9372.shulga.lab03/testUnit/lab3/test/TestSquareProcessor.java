package lab3.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import gr9372.shulga.lab03.holder.Processor;
import holderImpl.ProcessorDiff;
import holderImpl.ProcessorSquare;

public class TestSquareProcessor {

	@Test
	public void testProcessorSquare() {
		Processor processor = new ProcessorSquare();
		Assert.assertTrue(processor.process(2) == 4);
	}

	@Test 
	public void testProcessorNull(){
		Processor processor = new ProcessorSquare();
		Assert.assertTrue(processor.process(0)==0);
	}

}
