import java.util.*;

public class Nursery{
 
  private String name;
  private ArrayList<Growable> garden;
  
  public Nursery(String name) {
    this.name = name;
    this.garden = new ArrayList<Growable>();
  }

  public String getName() {
    return this.name;
  }

// count how many plants are planted in garden
  public int plantCount() {
    return this.garden.size();
  }

// can grow a plant in the garden
  public void grow(Growable plant){
    this.garden.add(plant);
  } 

// remove plants with disease
  public Growable diseased(){
    if (plantCount() > 0){
      return this.garden.remove(0);
    }
    return null;
  }

  public int healthRating(){
    int totalHealth = 0;

    for (Growable plants : garden){
      totalHealth += plants.healthRating();
    }
    return totalHealth;
  }

  public void annual(){
    this.garden.clear();
  }

}
