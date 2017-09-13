public class Box<T> {

  private T contents;
  private boolean isFull;

  public Box(){

  }

  public Box(T contents){
    this.contents = contents;
  }

  public T getContents(){
    return contents;
  }

  public boolean isFull(){
    return isFull;
  }

  public T empty(){
    T junk = contents;
    contents = null;
    return junk;
  }

  public String toString(){
    if(isFull()){
      return "Box of " + getContents();
    }
    else {
      return "Empty box";
    }
  }

  public static void main(String[] args){
    Box<String> stringBox = new Box<String>();
    Box<Integer> intBox   = new Box<Integer>();

    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
