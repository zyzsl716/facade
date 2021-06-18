public class Screen {
  private static Screen instance = new Screen();

  public static Screen getInstance() {
    return instance;
  }

  public void up() {
    System.out.println("屏幕升起...");
  }

  public void down() {
    System.out.println("屏幕下降...");
  }

}
