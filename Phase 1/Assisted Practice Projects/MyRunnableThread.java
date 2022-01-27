
public class MyRunnableThread {
	public static int mycount=0;
	public MyRunnableThread(){
	}
	public void run()
	{
		while(MyRunnableThread.mycount<=10) {
			try {
				System.out.println("Expl thread:"+(++MyRunnableThread.mycount));
				Thread.sleep(100);
			}catch(InterruptedException iex)
			{
				System.out.println("Exception in thread:"+iex.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
		MyRunnableThread mrt=new MyRunnableThread();
		Thread t=new Thread();
		t.start();
		while(MyRunnableThread.mycount<=10)
		{
			try {
				System.out.println("Main Thread:"+(++MyRunnableThread.mycount));
				Thread.sleep(100);
			} catch(InterruptedException iex) {
				System.out.println("Exception in main thread:"+iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");

	}

}
