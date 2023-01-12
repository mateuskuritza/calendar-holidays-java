import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Holiday> holidays = new ArrayList<>();

    public Calendar(){
        holidays.add(new Holiday("01/01/2023", "Confraternização mundial"));
        holidays.add(new Holiday("21/02/2023", "Carnaval"));
        holidays.add(new Holiday("17/04/2023", "Páscoa"));
        holidays.add(new Holiday("21/04/2023", "Tiradentes"));
        holidays.add(new Holiday("01/05/2023", "Dia do trabalho"));
        holidays.add(new Holiday("08/06/2023", "Corpus Christi"));
        holidays.add(new Holiday("07/09/2023", "Independência do Brasil"));
        holidays.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
        holidays.add(new Holiday("02/11/2023", "Finados"));
        holidays.add(new Holiday("15/11/2023", "Proclamação da República"));
        holidays.add(new Holiday("25/12/2023", "Natal"));
    }

    public void findAndShowHoliday(String date){
        Holiday holiday = holidays.stream()
        .filter(element -> date.equals(element.getDate()))
        .findAny()
        .orElse(null);

        if(holiday != null){
            System.out.println("\n O feriado da data: " + holiday.getDate() + " é " + holiday.getName());
        }else{
            System.out.println("Não existe um feriado para a data: " + date);
        }
    }

    public List<Holiday> getHolidays() {
        return holidays;
    }
}
