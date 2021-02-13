package introjunit;

public class LefedettsegMeres {

    public String sayHello(String message){
        if (message == null){
            return "Hello Anonymous!";
        }
        return "Hello " + message;
    }

    public static void main(String[] args) {

        String message1 = new LefedettsegMeres().sayHello("Zolika");
        String message2 = new LefedettsegMeres().sayHello(null);

        System.out.println(message1);
        System.out.println(message2);

    }

}
