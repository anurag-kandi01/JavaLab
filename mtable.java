class mtable{
	public static void main(String[] args){
		multable t1=new multable(5);
		multable t2=new multable(4);
		t1.start();
		try{
			t1.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
      		t2.start();
		}
	}
class multable extends Thread{
	int num;
	multable(int n){
		this.num=n;
	}
	public void run(){
				
			for(int i=1;i<=10;i++){
				System.out.println(num+"*"+i+"="+(num*i));
				try{
					Thread.sleep(400);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		
	}
}