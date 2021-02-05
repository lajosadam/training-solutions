package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        String s1 = "1" + 2;
        String s2 =  1 + "2";

        System.out.println(s1);
        System.out.println(s2);

        double quotient = 3/4;
        System.out.println(quotient);
        double quotient2 = 3/4d;
        System.out.println(quotient2);

        long big =  3_244_444_444l;
        System.out.println(big);

        String s = "árvíztűrőtükörfúrógép";

        String word = "title".toUpperCase();

        System.out.println(s);
        System.out.println(word);

        String i = Integer.toBinaryString(1);
        System.out.println(i);
        String i2 = Integer.toBinaryString(-1);
        System.out.println(i2);

    }

}
