import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //складывает два числа
    /*public static int add(int a, int b){ return  a + b; }
    public static float add(float a, float b){ return a + b; }
    public static long add(long a, long b){ return a + b; }*/

        /*//Без generics хранили ранее файлы Object
        List listAnimal = new ArrayList();
        listAnimal.add("Cat");
        listAnimal.add("Dog");
        listAnimal.add("Horse");
        String firstAnimal = (String)listAnimal.get(0);
        //String firstAnimal = listAnimal.get(0).toString();
        System.out.println(firstAnimal);

        //c generics
        List <String> listAnimal1 = new ArrayList<>();
        listAnimal1.add("Cat1");
        listAnimal1.add("Dog1");
        listAnimal1.add("Horse1");
        String firstAnimal1 = listAnimal1.get(0);
        System.out.println(firstAnimal1);*/
        Wizard wizard = new Wizard();
        wizard.cast();
        wizard.hit();
        wizard.move();

    }
}
class Wizard implements canCast, canMove, canHit{
    @Override
    public void cast() {
        System.out.println("Wizard casting");
    }

    @Override
    public void move() {
        System.out.println("Wizard moving");
    }

    @Override
    public void hit() {
        System.out.println("Wizard hiting");
    }
}
//ходить
interface canMove{
    void move();
}
//бить
interface canHit{
    void hit();
}
//колдовать
interface canCast{
    void cast();
}