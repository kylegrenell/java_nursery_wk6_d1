class Nursery{
  private String name;
  private int amount;
  private Plant[] plants;
  
  public Nursery(String name, int amount) {
    this.name = name;
    this.amount = amount;
    this.plants = new Plant[amount];
  }

  public String getName() {
    return this.name;
  }

  public int getAmount() {
    return this.amount;
  }

    public int plantCount() {
      int plantCount = 0;

      for (int i = 0; i < amount; i++) {
        if (plants[i] != null) {
          plantCount++;
        }
      }
      return plantCount;
    }

}
