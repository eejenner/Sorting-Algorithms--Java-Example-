
public class Quicksort extends Sort{
	int[] myArray = new int [200000];
	
	void timerType(){
		System.out.println("\nQuicksort sort timer");
	}
	
	void sort(int[] array){
		setArray(array);
		qsort();
	}
	
	void setArray(int[] array){
		myArray = array;
	}
	
	void qsort(){
		quicksort(0, myArray.length-1);
	}
	void quicksort(int left, int right){
		if(right - left <= 0){
			return;
		}
		int pivot = myArray[right];
		int half = split(left, right, pivot);
		quicksort(left, half-1);
		quicksort(half+1, right);
	}
		
	int split(int left, int right, int pivot){
		int l = left - 1;
		int r = right;
		while(true){
			while(myArray[++l] < pivot){
			}
			while(myArray[--r] > pivot && r > 0){
			}
			if(l >= r){
				break;
			}
			else{
				swap(l, r);
			}
		}
		swap(l, right);
		return l;
	}
	
	void swap(int left, int right){
		int temp = myArray[left];
		myArray[left] = myArray[right];
		myArray[right] = temp;
	}
}
