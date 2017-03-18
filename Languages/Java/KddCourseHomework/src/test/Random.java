package test;

public class Random {

	public static void main(String args[]){
		int array[]=new int[20];
		int array2[]=new int[14];
		for(int i=0;i<20;i++){
			array[i]=i+1;
		}
		for(int i=0;i<14;i++){
			int j=(int) Math.floor(Math.random()*(20-i));
			int temp=array[20-i-1];
			array[20-i-1]=array[j];
			array[j]=temp;
			array2[i]=array[j];
		}
		
	}
}
