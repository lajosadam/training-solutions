package stringbasic;

public class PoolHeap {

    public String createStringForHeap(){
        return "Zolika nem érti a feladatot";
    }
    public String createStringForPool(){
        return "Géza nem érti a feladatot";
    }

    public static void main(String[] args) {
        PoolHeap poolHeap = new PoolHeap();

        String message1 = poolHeap.createStringForHeap();

        String message2 = poolHeap.createStringForPool();

        System.out.println(message1);
        System.out.println(message2);
    }
}
