package kr.ac.kopo.day16.note;


class PriorityThread extends Thread {
	
	public PriorityThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PriorityThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println(getName() + "우선순위: "+ getPriority());
		
		
		for(int i = 1; i < 100; i++) {
			System.out.println(getName() + " : " + i + "번째 작업중...");
		}
		
	}
}


public class PriorityMain {

	public static void main(String[] args) {
		PriorityThread pt = new PriorityThread("우선순위가 5인 스레드 => ");
		pt.setPriority(Thread.NORM_PRIORITY);
		pt.start();
		
		PriorityThread pt2 = new PriorityThread("우선순위가 1인 스레드 => ");
		pt2.setPriority(Thread.MIN_PRIORITY);
		pt2.start();
		
		PriorityThread pt3 = new PriorityThread("우선순위가 10인 스레드 => ");
		pt3.setPriority(Thread.MAX_PRIORITY);
		pt3.start();
	}
}
