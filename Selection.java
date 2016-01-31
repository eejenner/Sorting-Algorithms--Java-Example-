
public class Selection extends Sort{
	
	void timerType(){
		System.out.println("\nSelection sort timer");
	}
	
	void sort(int[] array){
		selectionSort(array);
	}
	public void selectionSort(int[] array){
		int location;
		int current;
		int temp;
		int key;
		
		for(location = array.length - 1; location > 0; location--){ 
			key = 0; 
			for(current = 1; current <= location; current++){ 
				if(array[current] > array[key]){ 
					key = current;
				}
			}
			temp = array[key]; 
			array[key] = array[location]; 
			array[location] = temp; 
		}
	}
}
