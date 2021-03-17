import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ProblemSet13 pst = new ProblemSet13();

        int[] iarr = {};
        ArrayList<Integer> test;
        ArrayList<Integer> idk = new ArrayList<>();
        idk.add(1);
        idk.add(3);
        idk.add(1);
        idk.add(4);

        ArrayList<Integer> idk2 = new ArrayList<>();
        idk.add(2);
        idk.add(4);


        boolean b = false;
        int i = 0;
        String s = "";
        int[] input1 = {5,5,6,1};
        int[] input2 = {2, 3, 4};
        String[] input3 = {"abcdefg"};
        String[] input4 = {};
        int input5 = 0;
        int input6 = 14;

       b = pst.splitOdd10(input1);
        System.out.printf("%s\n", b);
    }
}