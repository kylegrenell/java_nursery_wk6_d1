import java.util.*;

class Nursery{
  private String name;
  private ArrayList<Garden> garden;
  
  public Nursery(String name) {
    this.name = name;
    this.garden = new ArrayList<Garden>();
  }


  public String getName() {
    return this.name;
  }

// count how many plants are planted in garden
  public int plantCount() {
    return this.garden.size();
  }

// can grow a plant in the garden
  public void grow(Garden plant){
    this.garden.add(plant);
  } 

// remove plants with disease
  public Garden diseased(){
    if (plantCount() > 0){
      return this.garden.remove(0)
    }
    return null
  }

  public void annual(){
    this.garden.clear();
  }

}
