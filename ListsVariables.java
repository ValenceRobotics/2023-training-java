import java.util.ArrayList;

public class ListsVariables {
  public static void main(String args[]) {
    int num = 4;
    String name = "John";
    boolean poop = true;
    double pi = 3.14;
    char letter = 'a';

    System.out.println(num);
    System.out.println(name);
    System.out.println(poop);
    System.out.println(pi);
    System.out.println(letter);

    // arrays
    int[] nums = {1, 2, 3, 4, 5};
    System.out.println(nums); // WHATTT this prints jibberish: [I@15db9742

    // to print out an array
    System.out.print("[");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + ", ");
    }
    System.out.print("]");

    System.out.println();

    // arraylist
    ArrayList<Integer> nums2 = new ArrayList<Integer>();
    nums2.add(1);
    nums2.add(2);
    nums2.add(3);

    System.out.println(nums2); // prints [1, 2, 3]

    System.out.println();
  }  
}
