public class Main {
    public static void main(String[] args) {
        Date date = new Date(11, 24, 1999);

    // advance the date 40 times to see it roll across a month or even a year
        for (int i = 0; i < 40; i++) {
            date.nextDay();
            System.out.println(date);
        }
    }
}