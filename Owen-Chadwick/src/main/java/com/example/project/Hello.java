public class Hello {
	
	
	public int sum(int a, int b){
		//int here
		int c = 0;
		c = a+b;
	return c;
	//should be c
	}
	
	
	public static void main(String[] args) {
		Hello sumOfTheTwoNumbers= new ChapTwo();
		System.out.println(sumOfTheTwoNumbers.sum(4,5));

		
	}
	}