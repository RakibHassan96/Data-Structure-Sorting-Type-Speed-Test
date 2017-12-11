import java.io.*;
import java.util.Random;

class ArraySorts{
	
	private int[] N;	  		
	private int nElems;							  
	
	//--------------------------------------------------

	public ArraySorts(int max){
		N = new int[max];
		nElems = 0;
	}
	
	//--------------------------------------------------
	
	public void randomElements(int seed){
		Random r = new Random();
			
		r.setSeed(seed);
		
		for(int i=0; i<N.length; i++){
			N[i] = (int)(r.nextInt(100));
			nElems++;
		}
	}
	
	//--------------------------------------------------
	
	public void bubbleSort(){
		int out, in;
		
		for (out=0; out<nElems; out++){
			for (in = 0; in<nElems-1; in++){
				if(N[in] > N[in+1]){
					swap(in, in+1);
				}
			}
		}
	}
	
	//--------------------------------------------------
	
	public void selectionSort(){
		int out, in, min;
		
		for (out = 0; out<nElems-1; out++){
			min = out;
			for (in = out+1; in<nElems; in++){
				if(N[in] < N[min]){
					min = in;
				}
			swap(out, min);
			}
		}
	}
	
	//--------------------------------------------------
	
	public void insertionSort(){
		int out, in;
		
		for (out=1; out<nElems; out++){
			int temp = N[out];
			in = out;
			while (in>0 && N[in-1] >= temp){
				N[in] = N[in-1];
				--in;
			}
		N[in] = temp;
		}
	}

	//--------------------------------------------------

	private void swap (int one, int two){
		int temp = N[one];
		N[one] = N[two];
		N[two] = temp;
	}

} // end of ArraySorts

//////////////////////////////////////////////////////////////////////////////////////////

class ArrayApp {
	public static void main(String args[]) throws IOException {
		
		//------------------------Utilities to Use File--------------------------------
		
		File file = new File("out.txt");
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw);
		
		//--------------------------Test for Seed 1234----------------------------------
		
		pw.println("Time Elapsed for Seed 1234");
		System.out.println("Time Elapsed for Seed 1234");

		//--------------BubbleSort-------------
		
		ArraySorts arr1a;
		pw.println("Bubble Sort: ");
		System.out.println("Bubble Sort: ");
		
		for (int i=10000; i<=100000; i+=2500){
			arr1a = new ArraySorts(i);
		
			arr1a.randomElements(1234);
		
			long startTime1a = System.currentTimeMillis();
			arr1a.bubbleSort();
			long elapsedTime1a = System.currentTimeMillis() - startTime1a;
			pw.println(i + " elements: " + elapsedTime1a);
			System.out.println(i + " elements: " + elapsedTime1a);
		}
		
		pw.println();
		System.out.println();
		
		//--------------SelectionSort-------------
		
		ArraySorts arr1b;
		pw.println("Selection Sort: ");
		System.out.println("Selection Sort: ");
		
		for (int i=10000; i<=100000; i+=2500){
			arr1b = new ArraySorts(i);
		
			arr1b.randomElements(1234);
		
			long startTime1b = System.currentTimeMillis();
			arr1b.selectionSort();
			long elapsedTime1b = System.currentTimeMillis() - startTime1b;
			pw.println(i + " elements: " + elapsedTime1b);
			System.out.println(i + " elements: " + elapsedTime1b);
		}
		
		pw.println();
		System.out.println();
		
		//--------------InsertionSort-------------
		
		ArraySorts arr1c;
		pw.println("Insertion Sort: ");
		System.out.println("Insertion Sort: ");
		
		for (int i=10000; i<=100000; i+=2500){
			arr1c = new ArraySorts(i);
		
			arr1c.randomElements(1234);
		
			long startTime1c = System.currentTimeMillis();
			arr1c.insertionSort();
			long elapsedTime1c = System.currentTimeMillis() - startTime1c;
			pw.println(i + " elements: " + elapsedTime1c);
			System.out.println(i + " elements: " + elapsedTime1c);
		}
		
		pw.println();
		System.out.println();
		pw.println();
		System.out.println();
		
		//--------------------------Test for Seed 666----------------------------------
		
		pw.println("Time Elapsed for Seed 666");
		System.out.println("Time Elapsed for Seed 666");
		
		//--------------BubbleSort-------------
		
		ArraySorts arr2a;
		pw.println("Bubble Sort: ");
		System.out.println("Bubble Sort: ");
		
		for (int i=10000; i<=100000; i+=2500){
			arr2a = new ArraySorts(i);
		
			arr2a.randomElements(666);
		
			long startTime2a = System.currentTimeMillis();
			arr2a.bubbleSort();
			long elapsedTime2a = System.currentTimeMillis() - startTime2a;
			pw.println(i + " elements: " + elapsedTime2a);
			System.out.println(i + " elements: " + elapsedTime2a);
		}
		
		pw.println();
		System.out.println();
		
		//--------------SelectionSort-------------
		
		ArraySorts arr2b;
		pw.println("Selection Sort: ");
		System.out.println("Selection Sort: ");
		
		for (int i=10000; i<=100000; i+=2500){
			arr2b = new ArraySorts(i);
		
			arr2b.randomElements(666);
		
			long startTime2b = System.currentTimeMillis();
			arr2b.selectionSort();
			long elapsedTime2b = System.currentTimeMillis() - startTime2b;
			pw.println(i + " elements: " + elapsedTime2b);
			System.out.println(i + " elements: " + elapsedTime2b);
		}
		
		pw.println();
		System.out.println();
		
		//--------------InsertionSort-------------
		
		ArraySorts arr2c;
		pw.println("Insertion Sort: ");
		System.out.println("Insertion Sort: ");
		
		for (int i=10000; i<=100000; i+=2500){
			arr2c = new ArraySorts(i);
		
			arr2c.randomElements(666);
		
			long startTime2c = System.currentTimeMillis();
			arr2c.insertionSort();
			long elapsedTime2c = System.currentTimeMillis() - startTime2c;
			pw.println(i + " elements: " + elapsedTime2c);
			System.out.println(i + " elements: " + elapsedTime2c);
		}
		
		pw.println();
		System.out.println();
		pw.println();
		System.out.println();
		
		//--------------------------Test for Seed 42----------------------------------
		
		pw.println("Time Elapsed for Seed 42");
		System.out.println("Time Elapsed for Seed 42");
		
		//--------------BubbleSort-------------
		
		ArraySorts arr3a;
		pw.println("Bubble Sort: ");
		System.out.println("Bubble Sort: ");
		
		for (int i=10000; i<=100000; i+=2500){
			arr3a = new ArraySorts(i);
		
			arr3a.randomElements(42);
		
			long startTime3a = System.currentTimeMillis();
			arr3a.bubbleSort();
			long elapsedTime3a = System.currentTimeMillis() - startTime3a;
			pw.println(i + " elements: " + elapsedTime3a);
			System.out.println(i + " elements: " + elapsedTime3a);
		}
		
		pw.println();
		System.out.println();
		
		//--------------SelectionSort-------------
		
		ArraySorts arr3b;
		pw.println("Selection Sort: ");
		System.out.println("Selection Sort: ");
		
		for (int i=10000; i<=100000; i+=2500){
			arr3b = new ArraySorts(i);
		
			arr3b.randomElements(42);
		
			long startTime3b = System.currentTimeMillis();
			arr3b.selectionSort();
			long elapsedTime3b = System.currentTimeMillis() - startTime3b;
			pw.println(i + " elements: " + elapsedTime3b);
			System.out.println(i + " elements: " + elapsedTime3b);
		}
		
		pw.println();
		System.out.println();
		
		//--------------InsertionSort-------------
		
		ArraySorts arr3c;
		pw.println("Insertion Sort: ");
		System.out.println("Insertion Sort: ");
		
		for (int i=10000; i<=100000; i+=2500){
			arr3c = new ArraySorts(i);
		
			arr3c.randomElements(42);
		
			long startTime3c = System.currentTimeMillis();
			arr3c.insertionSort();
			long elapsedTime3c = System.currentTimeMillis() - startTime3c;
			pw.println(i + " elements: " + elapsedTime3c);
			System.out.println(i + " elements: " + elapsedTime3c);
		}
		
		pw.close();
	}
}