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

        String move = UP;
        String RUBIK;
        switch (move) {
            case u:  RUBIK = "UP";
                     break;
            case D:  RUBIK = "DOWN";
                     break;
            case R:  RUBIK = "RIGHT";
                     break;
            case L:  RUBIK = "Left";
                     break;
            case F:  RUBIK = "Front";
                     break;
            case B:  RUBIK = "Back";
                     break;
        }
		 System.out.println(RUBIK);
    }
}







