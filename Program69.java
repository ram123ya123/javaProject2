package project1;

public class Program69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread lowPriorityThread = new Thread(()-> {
		for(int i =1;i<=5;i++) {
			System.out.println("low Priority Thread"+i);
		}
		});
        Thread HighPriorityThread = new Thread(()-> {
        	for(int i=1;i<=5;i++) {
        		System.out.println("High Priority thread");
        	}
        });
        Thread highPriorityThread = new Thread(()->{
        	for(int i =1;i<=5;i++) {
        		System.out.println("High priority Thread"+i);
        	}
        });
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        highPriorityThread.setPriority(Thread.MIN_PRIORITY);
        lowPriorityThread.start();
        highPriorityThread.start();
        HighPriorityThread.start();
}
}
