import java.util.Scanner;

class Handler {
  public Handler() {
    System.out.println("Handler Initialized");
  };
  public void game(Question[] q) {
    Scanner sc = new Scanner(System. in );
    for (Question cq: q) {
      cq.printQuestion();
      String r = sc.next();
      if (cq.hasAnswer(r)) {
        System.out.println("Correct.");
      } else {
        System.out.println("Incorrect.");
      }
    }
  }
}
