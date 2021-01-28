import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Question q1 = new Question("bababooey?", new String[] {
      "yes",
      "correct",
      "yh",
      "yeah"
    });
    Question q2 = new Question("is a bagel bread?", new String[] {
      "yes",
      "correct",
      "yh",
      "yeah"
    });
    Question q3 = new Question("is a water wet?", new String[] {
      "yes",
      "correct",
      "yh",
      "yeah"
    });
    Question q4 = new Question("What has to be broken before you can use it?", new String[] {
      "egg"
    });
    Question q5 = new Question("I’m tall when I’m young, and I’m short when I’m old. What am I?", new String[] {
      "candle"
    });

    Handler g = new Handler();
    g.game(new Question[] {
      q1,
      q2,
      q3,
      q4,
      q5
    });
  }
}
