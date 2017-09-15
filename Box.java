
// The <T> is a generic type
public class Box <T> {

  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box(){
    super();
    this.isFull = false;
  }

  // Make a new box pre-filled with contents
  public Box(T contents){
    super();
    this.isFull = true;
    this.contents = contents;
  }

  /**
   * Check the contents of the box
   * @return whatever is in the box
   */
  public T getContents(){
    return contents;
  }

  /**
   * Tell whether the box is full or not
   */
  public boolean isFull(){
    return isFull;
  }

  /**
   * Empty out the box, and give back hatever was in it
   */
  public T empty(){
    T junk = contents;
    contents = null;
    isFull = false;
    return junk;
  }

  /**
   * Fill with contents and return true or return false if full.
   * @param contents The contents to fill a box with
   * @return False if box is already full or true if successfully filled
   */
  public boolean fill(T contents){
    if (isFull){
      return false;
    }
    this.contents = contents;
    isFull = true;
    return isFull;
  }

  public String toString(){
    if(isFull)
      return "This box contains " + contents + ".";
    else
      return "This box is empty.";
  }

  public static void main(String[] args){

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    //TODO start the second box with contents inside
    Box<Integer> intBox   = new Box<Integer>(21);

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    stringBox.fill("ayy");


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox.getContents() + ", " + intBox.getContents());

    intBox.empty();
    stringBox.empty();

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
