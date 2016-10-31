import static org.junit.Assert.assertEquals;
import org.junit.*;

public class NurseryTest {
  Nursery nursery;
  Plant plant;

  @Before
  public void before() {
    nursery = new Nursery("Planty McPlantplants", 70);
    plant = new Plant("Xmas Pine Tree", 25);
  }

  @Test
  public void nurseryName() {
    assertEquals( "Planty McPlantplants", nursery.getName() );
  }

  @Test
  public void plantName() {
    assertEquals( "Xmas Pine Tree", plant.getName() );
  }

  @Test
  public void nurseryPlantAmount() {
    assertEquals( 70, nursery.getAmount() );
  }

  @Test
  public void nurseryIsEmpty(){
    assertEquals( 0, nursery.plantCount() );
  }

  // @Test
  // public void plantCost() {
  //   assertEquals( 25, plant.getCost() );
  // }

}
