public class Test {
    public static void main(String[] args) {
        Printer laser=new LaserPrinter("MPV-4","Laser Pro",4000,(short)20,"LP-W",true,true);

        laser.print();
        laser.refill();
    }
}
