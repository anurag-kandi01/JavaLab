class safe{
	public static void main(String args[]){
		reserve obj =new reserve(1);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("First Person");
		t2.setName("Second Person");
		t1.start();
		t2.start();
	}
}
class reserve implements Runnable{
	int available=1;
	int wanted ;
	reserve(int i){
		wanted=i;
	}
	public void run(){
		synchronized(this){
			System.out.println("Number of berths avaliable:"+available);
			if(available>=wanted){
				String name=Thread.currentThread().getName();
				System.out.println(wanted+"berths alloted to:"+name);
				try{
					Thread.sleep(2000);
					available=available-wanted;
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
			else{
				System.out.println("Sorry,no berths available");
			}
		}
	}
}
				 