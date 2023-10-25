public class Friend {
    private boolean happy;
    private String name;

    public Friend(String N){
        name = N;
    }

    public void makeHappy(){
        happy = true;
    }

    public void makeSad(){
        happy = false;
    }

    public String getName(){
        return name;
    }

    public boolean isHappy(){
        return happy;
    }
}
public class Hello{
    public static void main(String[] args){
        Friend first = new Friend("Peter");
        Friend second = new Friend("Maddy");

        first.makeHappy();
        second.makeSad();

        System.out.println(first.getName() + " is happy:" + first.isHappy());
        System.out.println(second.getName() + " is happy:" + second.isHappy());
    }
}