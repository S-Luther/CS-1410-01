
public class Hello{

    static void Print(String printArg) {
        System.out.println(printArg);
    }

    //in this one.

    public static void main(String[] args) {
        Print("Hello World");

        int[][] arr = new int[2][2];

        for (int i = 1; i < 2; i++) {
            arr[][] = i;
            for (int j = 3; j < 4; j++) {
                arr[j - 3][ j - 3] = j;
            }
        }
    /*
        for (int i = 1; i < 2; i++) {
            arr[i - 1][i - 1] = i; 
                for (int j = 3; j < 4; j++) {
            arr[i-1][j - 3] = j;
            }
        }

    */       
    }
}