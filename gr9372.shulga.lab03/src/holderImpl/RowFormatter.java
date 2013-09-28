package holderImpl;

import java.util.Collection;

import gr9372.shulga.lab03.holder.Formatter;

public class RowFormatter implements Formatter{

	@Override
	public void out(Collection<Integer> data) {
		System.out.println(data);
		
	}

}
