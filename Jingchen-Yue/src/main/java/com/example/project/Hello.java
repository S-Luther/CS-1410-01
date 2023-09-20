package com.example.project;

   //public class Hello{
    //public static void main(String[] args){
       int num = 0;

		int [][][]arr = new int [2][2][2];
		
		for(int k = 0; k < 2; k++) {

		for(int j = 0; j < 2; j++) {

		for(int i = 0; i < 2; i++) {
			
			arr[i][j][k] = num++;
			
					}
				}
			}
		
		int num2 = 0;
		for(int k = 0; k < 2; k++) {

			for(int j = 0; j < 2; j++) {

			for(int i = 0; i < 2; i++) {
				
				System.out.print(arr[i][j][k] + " ");
						num2++;
				}
			}
		}
  //  }
//}

public class EscapeSeqPractice {
    public static void main(String[] args) {

        char move = UP;
        String RUBIK;
        switch (move) {
            case u:  monthString = "UP";
                     break;
            case D:  monthString = "DOWN";
                     break;
            case R:  monthString = "RIGHT";
                     break;
            case L:  monthString = "Left";
                     break;
            case F:  monthString = "Front";
                     break;
            case B:  monthString = "Back";
                     break;
        }
		 System.out.println(RUBIK);
    }
}







