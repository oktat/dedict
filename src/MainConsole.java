public class MainConsole {
  public void printMenu() {
    System.out.println("1. Add");
    System.out.println("2. Edit");
    System.out.println("3. Delete");
    System.out.println("4. Display");
    System.out.println("5. Exit");
  }

  public void startMenu() {    
    while(true) {
      printMenu();
      System.out.print("Select an option: ");
      int choice = Integer.parseInt(System.console().readLine());
      switch(choice) {
        case 1:
          System.out.println("Add");
          DataSource ds = new DataSource();
          String hun = input("Hun: ");
          String eng = input("Eng: ");
          ds.add(hun, eng);
          break;
        case 2:
          System.out.println("Edit");
          break;
        case 3:
          System.out.println("Delete");
          break;
        case 4:
          System.out.println("Display");
          break;
        case 5:
          System.out.println("Exit");
          System.exit(0);
          break;
        default:
          System.out.println("Invalid option");
      }
    }
  }

  private String input(String msg) {
    System.out.print(msg);
    return System.console().readLine();
  }  
}
