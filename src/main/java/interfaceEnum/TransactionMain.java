package interfaceEnum;

public class TransactionMain {

    public static void main(String[] args) {

        HasTransactionState hasTransactionState = TransactionState.PENDING;

        System.out.println(hasTransactionState.isCompleted());

    }
}
