public class Main {
  public static void main(String[] args) {
    System.out.println(addressCombinations(1, 1));
    System.out.println(addressCombinations(9, 9));
    System.out.println(addressCombinations(3, 4));
    System.out.println(addressCombinations(8, 2));
  }

  public static int addressCombinations(int numSlots, int numValues) {
    return numSlots * numValues;
  }
}
