public class Main extends User{
  public static void main(String[] args) {
    User user = new User();

    //user.password = "Parth@198"; //error : cannot assign a value to final variable password
    user.changeUserName();

    // changeUserName() in Main cannot override changeUserName() in User overridden method is final
  }
//  @Override
//  public final void changeUserName() {
//    super.changeUserName();
//  }
}
