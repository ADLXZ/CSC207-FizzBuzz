package lab1;

public class Reduce {
    public static void main(String[] args) {

        System.out.println(reduce(100));

    }

    static int reduce(int n) {
        int i = n;
        int c = 0;
        while (i != 0){
            if (i % 2 == 0){
                i = i / 2;
                c++;
            }
            else{
                i--;
                c++;
            }
        }
        return c;
    }
}
