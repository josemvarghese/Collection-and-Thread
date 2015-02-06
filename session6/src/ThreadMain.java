import ThreadExtend.LoopThread;


public class ThreadMain {

	
	
	public static void main(String[] args) {
		
		Thread threadA = new Thread( new ThreadA(),"threadA" );
		Thread threadB = new Thread( new ThreadB(),"threadB" );
		Thread threadC = new Thread( new ThreadC(),"threadC" );
		threadA.setPriority(1);
		threadB.setPriority(10);
		threadC.setPriority(5);
		threadA.start();
		threadB.start();
		threadC.start();
		Thread LoopThread=new LoopThread();
		LoopThread.start();
		while(Thread.currentThread().isAlive() && LoopThread.isAlive())
		{
			try {
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try{
			Thread.currentThread();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
	}

}
