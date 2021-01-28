class Question {
  String question;
  String[] answers;

  public Question(String q, String[] a) {
    this.question = q;
    this.answers = a;
  }

  public void printQuestion() {
    System.out.println(question);
  }

  public boolean hasAnswer(String s) {
    s = s.toLowerCase();
    for (String i: answers) {
      i = i.toLowerCase();
      if (i.contains(s)) {
        return true;
      }
    }
    return false;
  }
}
