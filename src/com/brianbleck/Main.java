package com.brianbleck;

public class Main {

  private static int a = 50;
  private static int b = 75;

  public static void main(String[] args) {
    int xor = (a|b)&(~(a&b));
    int realXOR = a^b;

    System.out.println(xor);
    System.out.println(realXOR);

  }

}
