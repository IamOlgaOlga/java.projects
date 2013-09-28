package holderImpl;

import gr9372.shulga.lab03.holder.Processor;

public class ProcessorSquare implements Processor {

	@Override
	public int process(int figure) {
		
		return (figure*figure);
	}

}
