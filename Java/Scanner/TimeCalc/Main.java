import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
class Main {
  public static String getTimeString(int H) {
    int hour = H / 3600;
    int hourr = H % 3600;
    int mins = hourr / 60;
    int minss = hourr % 60;
    int sec = minss % 60;
    String time = Math.abs(hour) + " hours, " + Math.abs(mins) + " minutes, " + Math.abs(sec) + " seconds";
    return time;
  }
  public static void clearCanvas(int lines) {
    String test = "";
    for (int i = 0; i < lines; ++i)
    test = System.lineSeparator() + test;
    System.out.println(test);
  }
  static Scanner scan = new Scanner(System. in );
  public static void main(String[] args) {
    Date d = new Date();
    clearCanvas(1000);
    System.out.println("Welcome to the time calculator. Make your choice: " + System.lineSeparator() + "1> Time Since" + System.lineSeparator() + "2> Seconds to Time" + System.lineSeparator() + "3> Time From Now" + System.lineSeparator() + "4> Live Clock");
    int choice = scan.nextInt();
    while (true) {
      int seconds = d.getSeconds();
      int minutes = d.getMinutes();
      int hours = d.getHours();
      System.out.println("The server's time is: " + hours + ":" + minutes + ":" + seconds + " GMT+" + d.getTimezoneOffset() + System.lineSeparator());
      if (choice == 1) {
        scan.reset();
        System.out.println("Enter hour value: ");
        int lasthour = scan.nextInt();
        System.out.println("Enter minutes value: ");
        int lastminutes = scan.nextInt();
        System.out.println("Enter seconds value: ");
        int lastseconds = scan.nextInt();
        int oldtimevalue = (lasthour * 3600) + (lastminutes * 60) + lastseconds;
        int newtimevalue = (hours * 3600) + (minutes * 60) + seconds;
        int difference = (newtimevalue - oldtimevalue);
        clearCanvas(100);
        System.out.println("The server's time is: " + hours + ":" + minutes + ":" + seconds + " GMT+" + d.getTimezoneOffset() + System.lineSeparator() + "You input: " + lasthour + ": " + lastminutes + ": " + lastseconds + System.lineSeparator() + "The time you input was " + getTimeString(difference) + " ago. (" + difference + " seconds)" + System.lineSeparator());
      }
      if (choice == 2) {
        scan.reset();
        System.out.println("Welcome to the time calculator. Enter seconds value to convert to H,M,S format: ");
        int seconds1 = scan.nextInt();
        clearCanvas(100);
        System.out.println(seconds1 + " seconds in time is: " + getTimeString(seconds1));
      }
      if (choice == 3) {
        scan.reset();
        System.out.println("Enter hour value: ");
        int lasthour = scan.nextInt();
        System.out.println("Enter minutes value: ");
        int lastminutes = scan.nextInt();
        System.out.println("Enter seconds value: ");
        int lastseconds = scan.nextInt();
        int oldtimevalue = (lasthour * 3600) + (lastminutes * 60) + lastseconds;
        int newtimevalue = (hours * 3600) + (minutes * 60) + seconds;
        int difference = (oldtimevalue - newtimevalue);
        clearCanvas(100);
        System.out.println("The server's time is: " + hours + ":" + minutes + ":" + seconds + " GMT+" + d.getTimezoneOffset() + System.lineSeparator() + "You input: " + lasthour + ": " + lastminutes + ": " + lastseconds + System.lineSeparator() + "The time you input is " + getTimeString(difference) + " from now. (" + difference + " seconds)" + System.lineSeparator());
      }
      if (choice == 4) {
        clearCanvas(100);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
          public void run() {
            clearCanvas(100);
            Date e = new Date();
            int seconds2 = e.getSeconds();
            int minutes2 = e.getMinutes();
            int hours2 = e.getHours();
            System.out.println(System.lineSeparator() + "The server's time is: " + hours2 + ":" + minutes2 + ":" + seconds2 + " (GMT+" + d.getTimezoneOffset() + ")" + System.lineSeparator());
          }
        },
        1, 1000);
        scan.next();
      }
    }
  }
}
