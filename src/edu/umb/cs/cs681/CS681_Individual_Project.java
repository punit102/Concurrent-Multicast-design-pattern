package edu.umb.cs.cs681;
	
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CS681_Individual_Project {

	public static void main(String[] args) {
		
		System.out.println("Individual Project CS681");
		System.out.println("Concurrent Multicast Design Pattern");
		System.out.println("---------------------------------------------------------");
		StockEventObservable ss = new StockEventObservable();
		TableObserver to = new TableObserver();
		PieChartObserver pco = new PieChartObserver();
		ThreeDObserver tdo = new ThreeDObserver();
		ss.addEventListener(tdo);
		ss.addEventListener(pco);
		ss.addEventListener(to);	
		BondEventObservable beo = new BondEventObservable();
		
		System.out.println("---------------------------------------------------------");
		beo.addEventListener(tdo);
		beo.addEventListener(pco);
		beo.addEventListener(to);
		
		System.out.println("---------------------------------------------------------");
		System.out.println();

		RunnableThread runnablethread = new RunnableThread(ss,beo);
		RunnableThread runnablethread1 = new RunnableThread(ss,beo);
		
		// Use Executor Design Pattern
		ExecutorService es1 = Executors.newFixedThreadPool(2);
		es1.execute(runnablethread);
		es1.execute(runnablethread1);
		

		// Shutdown the executor
		es1.shutdown();
	
	}

}
