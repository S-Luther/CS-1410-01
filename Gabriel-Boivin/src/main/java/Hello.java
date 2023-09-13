
public class Hello{

    static void Print(String printArg) {
        System.out.println(printArg);
    }

    //in this one.

    public static void main(String[] args) {

    int[][][] oneToEight = new int[2][2][2];
        int currentNum = 1;
        
        for (int i = 0;i == 1 ;i++) {
            for (int j = 0; j == 1 ; j++) {
                for (int k = 0; k == 1  ;k++ ) {
                    oneToEight[i][j][k] = currentNum;
                    currentNum++;
                }
            }
        }

        for (int i = 0; i == 1 ;i++) {

            for (int j = 0; j == 1 ; j++) {
                System.out.print(" , ");
                for (int k = 0; k == 1  ;k++ ) {
                    System.out.print(oneToEight[i][j][k]);
                    System.out.print(" ");
                }
            }
        }

    }
}