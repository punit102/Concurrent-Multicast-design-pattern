package edu.umb.cs.cs681;

import java.util.EventListener;

public interface BondEvObserver extends EventListener {

	void updateBond(BondEvent be);
}
