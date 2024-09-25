public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        System.out.println(f);
        //System.out.println(f.currentFood); is private
        System.out.println(f.getCurrentFood());
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        System.out.println(Math.random());
        int random = (int)(Math.random() * 50+1);
        System.out.println(random);
        System.out.println(Math.random() < 0.05);
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h.getCurrentFood());
        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);
        Feeder j = new Feeder(500);
        System.out.println(j.simulateManyDays(10, 5));


        System.out.println("Test cases:");
        //Example 1
        Feeder k = new Feeder(500);
        k.simulateOneDay(12);
        System.out.println(k.getCurrentFood());
        //Example 2
        Feeder l = new Feeder(1000);
        l.simulateOneDay(22);
        System.out.println(l.getCurrentFood());
        //Example 3
        Feeder m = new Feeder(100);
        m.simulateOneDay(5);
        System.out.println(m.getCurrentFood());
        //Example 4
        Feeder n = new Feeder(2400);
        System.out.println(n.simulateManyDays(10, 4));
        //Example 5
        Feeder o = new Feeder(250);
        System.out.println(o.simulateManyDays(10, 5));
        //Example 6
        Feeder p = new Feeder(0);
        System.out.println(p.simulateManyDays(5, 10));
    }
}
