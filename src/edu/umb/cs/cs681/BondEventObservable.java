package edu.umb.cs.cs681;

import java.util.EventListener;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class BondEventObservable {
	private ReentrantLock lock;
	private CopyOnWriteArrayList<BondEvObserver> bondev_observers;

	public BondEventObservable() {

		bondev_observers = new CopyOnWriteArrayList<BondEvObserver>();
		lock = new ReentrantLock();
	}

	public void addEventListener(EventListener el) {

		
		bondev_observers.add((BondEvObserver) el);
		System.out.println("New BondEvObserver Added.");
	}

	public void notifyObservers(BondEvent be) {

		Object[] arrLocal = null;
		lock.lock();
		try {
			if (true) {
				arrLocal = bondev_observers.toArray();
			}

			for (int i = 0; i < arrLocal.length; i++) {

				((BondEvObserver) arrLocal[i]).updateBond(be);
			}
		} finally {
			lock.unlock();
		}

	}

}
