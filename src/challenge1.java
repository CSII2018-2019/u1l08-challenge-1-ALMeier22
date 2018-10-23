
public class challenge1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array1 = {1,4,8,6,9,2,6,2};

		System.out.print("original array: ");
		for(int i=0; i< array1.length; i++) {
			System.out.print(array1[i]);
		}
		System.out.println();
		
		int a = 0;
		int num = (array1.length);
	
		for(int i = 0; i < array1.length/2; i++ ) {
			num -=1; 
			a = array1[num];
			array1[num] = array1[i];
			array1[i] = a;
		}		
		
		System.out.print("reverse array:  ");
		for(int i=0; i< array1.length; i++) {
			System.out.print(array1[i]);
		}
			
	}
	
}
