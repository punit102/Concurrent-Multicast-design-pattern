package edu.umb.cs.cs681;

import java.util.EventListener;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class StockEventObservable {

	
	private ReentrantLock lock;
	private CopyOnWriteArrayList<StockEvObserver> stockev_observers;

	public StockEventObservable() {

		stockev_observers = new CopyOnWriteArrayList<StockEvObserver>();
		lock = new ReentrantLock();
	}

	public void addEventListener(EventListener el) {
		
		
		stockev_observers.add((StockEvObserver) el);
		System.out.println("New StockEvObserver Added.");
	}

	

	public void notifyObservers(StockEvent se) {

		Object[] arrLocal = null;
		lock.lock();
		try{
			if (true) {
				arrLocal = stockev_observers.toArray();
			}

			for (int i = 0; i < arrLocal.length; i++) {

				((StockEvObserver) arrLocal[i]).updateStock(se);
			}
		}finally{
			lock.unlock();
		}
		
	}

}
