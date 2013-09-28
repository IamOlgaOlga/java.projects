package lab3.test;

import gr9372.shulga.lab03.holder.Processor;
import holderImpl.ProcessorDiff;

import org.junit.Assert;
import org.junit.Test;

public class TestDiffProcessor {

	@Test
	public void testProcessorDiff() {
		Processor processor = new ProcessorDiff();
		Assert.assertTrue(processor.process(2) == 1);
	}

	@Test
	public void testProcessorNull() {
		Processor processor = new ProcessorDiff();
		Assert.assertEquals(-1, processor.process(0));
	}
}
