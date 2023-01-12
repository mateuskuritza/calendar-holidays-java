import java.util.List;

public class App {
    public static void main(String[] args) {
        String date = "25/12/2023";

        Calendar calendar = new Calendar();
        calendar.findAndShowHoliday(date);

        List<Holiday> holidays = calendar.getHolidays();
        System.out.println("\n ---------- Feriados ---------- \n");
        holidays.forEach(holiday -> {
            System.out.println(holiday.getName() + " -> " + holiday.getDate());
        });
    }
}
