
public class Hello{

    static void Print(String printArg) {
        System.out.println(printArg);
    }

    //in this one.

    public static void main(String[] args) {

    
    char move = "U";

    //does it need the toLower? like could the expression just be move?
    //ive been using chars in the rubiks cube project already so i wanted to stick  with those 
        //fair enough
        
    switch(move) {
        //needs colons
        case 'u':
            System.out.println("Up");
            break;
        case 'd'
            System.out.println("Down");
            break;
        case 'r'
            System.out.println("Right");
            break;
        case 'l'
            System.out.println("Left");
            break;
        case 'f'
            System.out.println("Front");
            break;
        case 'b'
            System.out.println("Back");
            break;
        
        
        }

    }
}