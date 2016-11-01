import static org.junit.Assert.*;
import org.junit.*;

public class NurseryTest {
  Nursery nursery;
  Herb herb;
  Flower flower;

  @Before
  public void before() {
    nursery = new Nursery("Planty McPlantplants");
    herb = new Herb();
    flower = new Flower();
  }

  @Test
  public void nurseryName() {
    assertEquals( "Planty McPlantplants", nursery.getName() );
  }

  @Test
  public void gardenStartsEmpty(){
    assertEquals( 0, nursery.plantCount() );
  }

  @Test
  public void canBeFed(){
    nursery.grow(flower);
    assertEquals( 1, nursery.plantCount() );
  }

  @Test
  public void removeDiseased(){
    nursery.grow(herb);
    Growable plant = nursery.diseased();
    assertNotNull(plant);
  }

  @Test
  public void canRevivePlant(){
    nursery.grow(flower);
    Growable plant = nursery.diseased();
    Flower original = (Flower) plant;
    assertEquals("growing", original.grow() );
  }

  @Test
  public void canFeedPlant(){
    nursery.grow(herb);
    Growable plant = nursery.diseased();
    assertEquals("fed", plant.feed() );
  }

  @Test 
  public void totalGardenHealthRating(){
    nursery.grow(herb);
    nursery.grow(flower);
    assertEquals(16, nursery.healthRating() );
  }

  @Test
  public void nurseryIsEmpty(){
    nursery.grow(herb);
    nursery.grow(flower);
    nursery.annual();
    assertEquals( 0, nursery.plantCount() );
  }

}

























