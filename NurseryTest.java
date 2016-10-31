import static org.junit.Assert.assertEquals;
import org.junit.*;

public class NurseryTest {
  Nursery nursery;
  Plant plant;

  @Before
  public void before() {
    nursery = new Nursery("Planty McPlantplants", 70);
    plant = new Plant("Xmas Tree");
  }

  @Test
  public void nurseryName() {
    assertEquals("Planty McPlantplants", nursery.getName() );
  }

}
