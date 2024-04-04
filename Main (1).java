class Main{
  public static void main(String[]args){
    Giygas mini1 = new Giygas("Heavily Armored Porky", 257);
    Giygas final2 = new Giygas("Giygas", 348);

    mini1.attack();
    final2.attack();

    mini1.setName("Heavily Armored Porky");
    final2.setLevel(257);

    mini1.attack();
  }
}