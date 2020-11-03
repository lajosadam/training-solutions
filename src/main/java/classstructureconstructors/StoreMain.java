package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store vga = new Store("nVidia GeForce RTX 3090");
        Store cpu = new Store("AMD Ryzen 9");

        System.out.println("Alap készlet:");
        System.out.println("Videókártya: "+vga.getProduct()+", Darabszám: "+vga.getStock());
        System.out.println("Processzor: "+cpu.getProduct()+", Darabszám: "+cpu.getStock());

        vga.store(12);
        cpu.store(24);

        System.out.println("Beszállítást követően:");
        System.out.println("Videókártya: "+vga.getProduct()+", Darabszám: "+vga.getStock());
        System.out.println("Processzor: "+cpu.getProduct()+", Darabszám: "+cpu.getStock());

        vga.dispatch(6);
        cpu.dispatch(12);

        System.out.println("Kiszállítást követően:");
        System.out.println("Videókártya: "+vga.getProduct()+", Darabszám: "+vga.getStock());
        System.out.println("Processzor: "+cpu.getProduct()+", Darabszám: "+cpu.getStock());

    }
}
