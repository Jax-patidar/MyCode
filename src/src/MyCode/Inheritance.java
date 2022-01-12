package MyCode;


class Animal
{

}
class Monky extends Animal
{

}


public class Inheritance {
    void getMyName(Animal s1)
    {
        System.out.println("Animal");
    }

    void getMyName(Monky s1)
    {
        System.out.println("Monky");
    }


    public static void main(String[] args) {
        Inheritance n = new Inheritance();
        Animal a = new Animal();
        Monky m = new Monky();
        Animal am = new Monky();
        //Monky ma = (Monky)new Animal();
        n.getMyName(a);
        n.getMyName(m);
        n.getMyName(am);
       // n.getMyName(ma);
    }
}
