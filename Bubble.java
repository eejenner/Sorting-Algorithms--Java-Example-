
public class Bubble extends Sort{
	void timerType(){
		System.out.println("\nBubble sort timer");
	}
	void sort(int[] array){
		bubbleSort(array);
	}
	public void bubbleSort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
}
