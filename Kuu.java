public class Kuu extends Thread{

	private String name;

	public Kuu(String name){

		this.name = name;
	}

	public void run(){

		try{
  			while(true){


			System.out.println("kUU");
			Thread.sleep(2000);

		}
}
		catch(InterruptedException ex){

			System.out.println(""+ex.getMessage());
		}

}
		public static void main(String args[]){

			Kuu o = new Kuu("FunFUN");

			o.run();
			o.start();

			
		} 

} 