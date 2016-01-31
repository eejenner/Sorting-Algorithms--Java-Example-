
public class Insertion extends Sort{
	
	void timerType(){
		System.out.println("\nInsertion sort timer");
	}
	
	void sort(int[] array){
		insertionSort(array);
	}

	public void insertionSort(int[] array){
		int key; 
		int location;                                   
		int loc;  
		for(location = 1; location < array.length; location++){
			key = array[location];
			loc = location - 1; 
			while((loc >= 0) && (array[loc] > key))   {
					array[loc + 1] = array[loc];
					loc--;
			}	
			array[loc + 1] = key;
		}
		
	}
}
