package holderImpl;

import java.util.NoSuchElementException;

public class SelectorOdd extends Decorator {

	private int element;

	@Override
	public boolean hasNext() {
		while (iterator.hasNext()) {
			this.element = iterator.next();
			if (this.element % 2 != 0)
				return true;
		}
		return false;
	}

	@Override
	public Integer next() {
		return this.element;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("метод не определён");
	}

}
