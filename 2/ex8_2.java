public class ex8_2{
  public static void main(String[]args){
    Flower cauly = new CauliFlower("Boil before stir fry. Cook me well.",30);
    System.out.println(cauly);
    Flower soapFlower = new CarvedFlower("For room decoration.","Soap.",4);
    System.out.println(soapFlower);
    Flower carrie = new WallFlower();
    System.out.println(carrie);
  }
}