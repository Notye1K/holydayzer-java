public class App {
    public static void main(String[] args) throws Exception {
        var myCalendar = new Calendar();

        System.out.println(myCalendar.getCalendar().size());
        myCalendar.findByDate("21/04/2023");
        myCalendar.findByDate("31/02/2023");
    }
}
