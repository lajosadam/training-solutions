package typeconversion;

public class DataLoss {

    public void dataLoss(long l){
        System.out.println(l);
        System.out.println(Long.toBinaryString(l));
        float f = l;
        System.out.println(f);
        System.out.println(Long.toBinaryString((long)f));
        long l2 = (long)f;
        System.out.println(l2);
        System.out.println(Long.toBinaryString(l2));
        //--------------------//



    }

    public static void main(String[] args) {
        DataLoss dataLoss = new DataLoss();
        dataLoss.dataLoss(1200012);
    }

}
