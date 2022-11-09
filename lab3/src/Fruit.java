import java.util.Enumeration;

public abstract class Fruit {
    Integer weight;
    Integer sugar;
    Integer water;
    Color color;

public Fruit(Integer weight,Integer sugar,Integer water,Color color){
    this.weight=weight;
    this.sugar=sugar;
    this.water=water;
    this.color=color;
}

enum Color{
    Red,Blue,Yellow,Green
}
}