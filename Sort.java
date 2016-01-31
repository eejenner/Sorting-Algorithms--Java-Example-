
public class Sort {
	void sort(int[] array){
		System.out.println("This one doesn't do anything.");
	}
	
	void timerType(){
		System.out.println("None");
	}
	void timer(int[] array){
		timerType();
		double startTime = System.currentTimeMillis();
		sort(array);
		double endTime = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (endTime -  startTime)/1000 + " seconds");
	}
}
