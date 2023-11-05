public class Element {
  private String name;
  private String symbol;
  private int atomicNumber;
  private double atomicMass;
  private int group;
  private String type;

  public Element(String name, String symbol, int atomicNumber, double atomicMass, int group, String type) {
    this.name = name;
    this.symbol = symbol;
    this.atomicNumber = atomicNumber;
    this.atomicMass = atomicMass;
    this.group = group;
    this.type = type;
  }

  public String getName(){
    return name;
  }

  public String getSymbol(){
    return symbol;
  }

  public int getAtomicNumber(){
    return atomicNumber;
  }

  public double getAtomicMass(){
    return atomicMass;
  }

  public int getGroup(){
    return group;
  }

  public String getType(){
    return type;
  }

  public String toString() {
    return name + " (" + symbol + ")\n" + "Atomic Number: " + atomicNumber + "\tAtomic Mass: " + atomicMass + "\nGroup: " + group + "\tType: " + type;
  }
}