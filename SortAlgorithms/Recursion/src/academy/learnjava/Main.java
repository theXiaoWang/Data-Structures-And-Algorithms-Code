package academy.learnjava;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(recursiveFactor(5));


    }

    public static int recursiveFactor(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactor(num-1);
    }
}
