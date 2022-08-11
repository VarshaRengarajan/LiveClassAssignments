package Assign4;

 class synchro {
	void print(int n){
		System.out.println("the method has begun");
		int m=1;

	   synchronized(this){//synchronized block  : this means to current context
	     for(int i=1;i<=n;i++){  
	      m=m*i;  
	      try{  
	         
	         }
	      catch(Exception e){System.out.println(e);}}
	      System.out.println("the factorial is:"+m);
	     }}
	 void sum(int x,int y){
		 int c;
		 synchronized(this){
			 c=x+y;
		     System.out.println("the addition of two numbers:"+c);
	
			 try{  
			       
			    }catch(Exception e){System.out.println(e);}  
			     }
	            }}
             class MyThread1 extends Thread{  
	         synchro t ; 
	         MyThread1(synchro t){  
		     this.t=t;  
	         }  
	         public void run(){  

		     t.print(4);  
	         }  
	  
	         }  
	         class MyThread2 extends Thread{  
	         synchro t;  
	         MyThread2(synchro t){  
		     this.t=t;  
	         }  
	         public void run(){  
		
		     t.print(6);  
	         }  
	         }  
	         class MyThread3 extends Thread{  
		     synchro t;  
		     MyThread3(synchro t){  
			 this.t=t;  
		     }  
		     public void run(){  
			
			 t.sum(4,5);  
		     }  
		     }  
	         class MyThread4 extends Thread{  
		     synchro t;  
		     MyThread4(synchro t){  
			 this.t=t;  
		     }  
		     public void run(){  
			
			 t.sum(5,10);  
		     }  
		}  
  
public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		synchro obj = new synchro();//only one object  
		
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		MyThread3 t3=new MyThread3(obj);  
		MyThread4 t4=new MyThread4(obj); 
		t2.start();  
		t4.start(); 
		t1.start();  
		t3.start();
	}

}
		 
		 
	 
	     	   

