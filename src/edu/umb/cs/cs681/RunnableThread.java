package edu.umb.cs.cs681;

import java.util.concurrent.locks.ReentrantLock;

public class RunnableThread implements Runnable {


	private StockEventObservable ss;
	private BondEventObservable beo;
	private ReentrantLock lock;
	
	public RunnableThread(StockEventObservable s,BondEventObservable b ) {

		this.ss = s;
		this.beo = b;
		lock = new ReentrantLock();	
	}

	@Override
	public void run() {
		
				lock.lock();
				try{
					ss.notifyObservers(new StockEvent(ss,"Cisco",31.37f));
					beo.notifyObservers(new BondEvent(beo,"Cisco",31.37f));
					
					ss.notifyObservers(new StockEvent(ss,"Wall-mart",100.0f));
					beo.notifyObservers(new BondEvent(beo,"Wall-mart",100.0f));
					
					ss.notifyObservers(new StockEvent(ss,"Alibaba",100.69f));	
					beo.notifyObservers(new BondEvent(beo,"Alibaba",100.69f));	
					
					ss.notifyObservers(new StockEvent(ss,"Netflix",156.30f));
					beo.notifyObservers(new BondEvent(beo,"Netflix",156.30f));
					
					ss.notifyObservers(new StockEvent(ss,"Fitbit",5.47f));
					beo.notifyObservers(new BondEvent(beo,"Fitbit",5.47f));
		
				}finally{
					lock.unlock();
				}
				
			}
}