import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ShaneHolder shane = new ShaneHolder();
        for(int x = 0; x < 10; x++){
            shane.addToBucket(x+"");
            //System.out.print(shane.size() + " ");

        }
        shane.printer();
        System.out.println();
        shane.removePos(4);
        System.out.println("remove 4");
        shane.printer();
        System.out.println();
        shane.addPos(3,"New");
        System.out.println("add before 3");
        shane.printer();
        System.out.println();


    }
}