package holderImpl;

import java.util.Collection;
import java.util.List;

import gr9372.shulga.lab03.holder.Formatter;

public class ColumnFormatter implements Formatter {

	

	@Override
	public void out(Collection<Integer> data) {
		for (int element:data){
			System.out.println(element);
		}
		
	}

}
