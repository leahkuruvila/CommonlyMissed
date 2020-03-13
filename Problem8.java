
/**
 * Write a description of class Problem8 here.
 *
 * @Leah Kuruvila
 */
public class Problem8
{
    public static void main(String [] args) {
    String first = new String("duck");
    String second = new String("duck");
    String third = new String("goose");
    
    if (first == second) {
    System.out.print("A");
    }
    else if (second == third) {
    System.out.print("B");
    }
    else if (first.equals(second)) {
    System.out.print("C");
    }
    else if (second.equals(third)) {
    System.out.print("D");
    }
    else {
    System.out.print("E");
    }
    
    System.out.println("The output is C, therefore making Option C the correct answer.");
  
    }
}

