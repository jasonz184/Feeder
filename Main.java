public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        System.out.println(f);
        //System.out.println(f.currentFood); is private
        Feeder g = new Feeder(500);
        System.out.println(f.getCurrentFood());
    }
}
