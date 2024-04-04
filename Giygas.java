public class Giygas{
  private String name;
  private int level;
  public Giygas(String Giygas, int level){
    this.name = Giygas;
    this.level = level;
  }
  public String getName(){
    return name;
  }
  public void setName(String Giygas){
    this.name = Giygas;
  }
  public int getLevel(){
    return level;
  }
  public void setLevel(int level){
    this.level = level;
  }
  public void attack(){
    System.out.println(name +" Attacks!, Dealt " + level +" Mortal Damage!");
  }
}