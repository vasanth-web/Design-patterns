package com.ObjectPoolDesignPattern;

public class Main extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception{
		
		ReusablePool pool = ReusablePool.getSingleton();
		
		//Thread 1
		Thread thread = new Thread() {
			public void run() {
				Employee e2 = null;
				try {
					e2 = pool.getInstance();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread "+Thread.currentThread().getName()+" is executing "+e2);
				if(e2 != null) {
					try {
						e2.work();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					pool.releaseInstance(e2);
				}
			}
		};
		thread.start();
		
		//Main Thread
		Employee e1 = pool.getInstance();
		e1.work();
		pool.releaseInstance(e1);
		System.out.println("Thread "+Thread.currentThread().getName()+" is executing "+e1);
		
		//Thread 2
		Thread thread1 = new Thread() {
			public void run() {
				Employee e3 = null;
				try {
					e3 = pool.getInstance();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread "+Thread.currentThread().getName()+" is executing "+e3);
				if(e3 != null) {
					try {
						e3.work();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					pool.releaseInstance(e3);
				}
			}
		};
		thread1.start();
		
		//Thread 2
		Thread thread2 = new Thread() {
			public void run() {
				Employee e3 = null;
				try {
					e3 = pool.getInstance();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread "+Thread.currentThread().getName()+" is executing "+e3);
				if(e3 != null) {
					try {
						e3.work();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					pool.releaseInstance(e3);
				}
			}
		};
		thread2.start();
		
		//Thread 3
		Thread thread3 = new Thread() {
			public void run() {
				Employee e3 = null;
				try {
					e3 = pool.getInstance();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread "+Thread.currentThread().getName()+" is executing "+e3);
				if(e3 != null) {
					try {
						e3.work();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					pool.releaseInstance(e3);
				}
			}
		};
		thread3.start();
		
		//Thread 4
		Thread thread4 = new Thread() {
			public void run() {
				Employee e3 = null;
				try {
					e3 = pool.getInstance();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread "+Thread.currentThread().getName()+" is executing "+e3);
				if(e3 != null) {
					try {
						e3.work();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					pool.releaseInstance(e3);
				}
			}
		};
		thread4.start();
	}

}
