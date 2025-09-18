public class ClassRoomTest {
  public static void main(String[] args) {
    ClassRoom class1 = new ClassRoom();
    ClassRoom class2 = new ClassRoom();
    ClassRoom class3 = new ClassRoom();

    ClassRoom.AddToTotal();
    ClassRoom.AddToTotal();
    ClassRoom.AddToTotal();
    
    System.out.println(ClassRoom.TotalNumber());
  }

}