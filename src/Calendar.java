import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Holiday> allHolidays = new ArrayList<Holiday>(List.of(
            new Holiday("01/01/2023", "Confraternização mundial"),
            new Holiday("21/02/2023", "Carnaval"),
            new Holiday("17/04/2023", "Páscoa"),
            new Holiday("21/04/2023", "Tiradentes"),
            new Holiday("01/05/2023", "Dia do trabalho"),
            new Holiday("08/06/2023", "Corpus Christi"),
            new Holiday("07/09/2023", "Independência do Brasil"),
            new Holiday("12/10/2023", "Nossa Senhora Aparecida"),
            new Holiday("02/11/2023", "Finados"),
            new Holiday("15/11/2023", "Proclamação da República"),
            new Holiday("25/12/2023", "Natal")));

    public List<Holiday> getCalendar() {
        return allHolidays;
    }

    public void findByDate(String date) {
        for (int i = 0; i < allHolidays.size(); i++) {
            var element = allHolidays.get(i);
            if (element.getDate() == date) {
                System.out.println(element.getTitle());
                return;
            }
        }
        System.out.println("Não existe feriado com tal dada");
    }
}
