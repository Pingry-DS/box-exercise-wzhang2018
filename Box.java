public class Box {

  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box(){
  }

  // Make a new box pre-filled with contents
  public Box(){
  }

  /**
   * Check the contents of the box
   */
  public getContents(){
  }

  /**
   * Tell whether the box is full or not
   */
  public isFull(){
  }

  /**
   * Empty out the box, and give back hatever was in it
   */
  public empty(){
  }

  public String toString(){
  }

  public static void main(String[] args){

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    //TODO start the second box with contents inside
    Box<Integer> intBox   = new Box<Integer>();

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Add something to a box



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Empty a boxes



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
