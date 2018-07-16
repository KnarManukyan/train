import java.util.ArrayList;

class train{
  private double length;
  private double weight;
  train(double length, double weight){
    this.length = length;
    this.weight = weight;
  }
  private ArrayList<carriage> carriages = new ArrayList<carriage>();
  public double calculatelength(){
    double totallength = this.length;
    for(int i = 0; i< carriages.size(); i++){
        totallength += carriages.get(i).getlength();
    }
    return totallength;
  }
  public double calculateweight(){
    double totalweight = this.weight;
    for(int i = 0; i< carriages.size(); i++){
        totalweight += carriages.get(i).getweight();
    }  
    return totalweight;  
  }
  public void attachcarriage(carriage carriage){
    if(carriages.contains(carriage)){
      System.out.println("This carriage is already attached!");
    } else{
      carriages.add(carriage);
    }
  }
  public void detachcarriage(carriage carriage){
    if(carriages.contains(carriage)){
      for(int i = 0; i< carriages.size(); i++){
        if(carriages.get(i) == carriage){
          carriages.remove(carriage);
          break;
        }
      }
    } else {
      System.out.println("This carriage is not attached to the train!");
    }
  }
}
class carriage{
  private double length;
  private double weight;
  carriage(double length, double weight){
    this.length = length;
    this.weight = weight;
  }
  public double getlength(){
    return length;
  }
  public double getweight(){
    return weight;
  }
}
class Main {
  public static void main(String[] args) {
    double trainLength = 200;
    double trainWeight = 200;
    double carriageLength = 200;
    double carriageWeight = 200;
    train train = new train(trainLength,trainWeight);
    carriage carriage1 = new carriage(carriageLength,carriageWeight);
    train.attachcarriage(carriage1);
    carriage carriage2 = new carriage(carriageLength,carriageWeight);
    train.attachcarriage(carriage2);
    train.attachcarriage(carriage2);
    carriage carriage3 = new carriage(carriageLength,carriageWeight);
    train.attachcarriage(carriage3);
    train.detachcarriage(carriage3);
    carriage carriage4 = new carriage(carriageLength,carriageWeight);
    train.detachcarriage(carriage4);
    System.out.println("the length of the train is " + train.calculatelength());
    System.out.println("the weight of the train is " +train.calculateweight());
  }
}
