
public class SleepWait {
	 private static Object obj = new Object();   
	public static void main(String[] args) throws InterruptedException   {
		Thread.sleep(2000);   
        System.out.println( Thread.currentThread().getName() + " Thread is woken after two second");   
        synchronized (obj)    
        {  
            obj.wait(2000);   
  
            System.out.println(obj + " Object is in waiting state and woken after 2 seconds");

	}

}
}