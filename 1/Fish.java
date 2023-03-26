public class Fish{
  private double weight;
  public Fish(double weight){
    this.weight = weight;
  }
  public void swim(){
    System.out.print("I am a "+getWeight()+" kg");
  }
  public double getWeight(){
    return weight;
  }
  public String toString(){
    return " fish.All fish swim.\n";
  }
}