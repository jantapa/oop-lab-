public class HelloRunable extends Thread{

	private String name;


	public HelloRunable(String name){
		this.name=name;
	}


    public void run() {
          try {

            while(true)
    	{

        System.out.println("Hello from a thread!");
        System.out.println("Jan");

        Thread.sleep(2000);
        }

}

catch(InterruptedException ex)
{
	System.out.println(""+ex.getMessage());
}
    	
    }

    public static void main(String args[]) {
         HelloRunable th = new HelloRunable("Jan");

         th.run();

         th.start();




    }

}

