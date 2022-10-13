public class HeavyBox {
    private int weight;
    public HeavyBox(){weight = 0;}
    public HeavyBox(int weight){this.weight = weight;}
    @Override
    public String toString() {return "Box weight: " + weight + " ";}
}
