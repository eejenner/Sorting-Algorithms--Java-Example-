import java.util.Arrays;
import java.util.Random;


public class TimeExample {
	Sort[] sorter;
	
	TimeExample(){
		Bubble bs = new Bubble();
		Selection ss = new Selection();
		Insertion is = new Insertion();
		Quicksort qs = new Quicksort();
		sorter = new Sort[4];
		sorter[0] = bs;
		sorter[1] =  ss;
		sorter[2] = is;
		sorter[3] = qs;
	}
	public int[] createArray(int[] array){
		Random random = new Random();
		for(int current = 0; current <= array.length - 1; current++ ){
			array[current] = random.nextInt();
		}
		return array;
	}
	
	void sortTime(){
		int[] array =  new int [200000];
		array = createArray(array);
		for(int j = 0; j <= sorter.length - 1; j++){
			int[] myArray =  array.clone();
			sorter[j].timer(myArray);
		}
	}

}
