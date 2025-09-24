package adapter;
import java.util.Calendar;

public class CalendarToNewDateAdapter implements NewDateInterface {

    private Calendar calender;

    public CalendarToNewDateAdapter() {
        this.calender = Calendar.getInstance();

    }


    @Override
    public void setDay(int day) {
        calender.set(Calendar.DAY_OF_MONTH, day);

    }

    @Override
    public void setMonth(int month) {
        calender.set(Calendar.MONTH, month - 1 );
    }

    @Override
    public void setYear(int year) {
        calender.set(Calendar.YEAR, year);
    }

    @Override
    public int getDay() {
        return calender.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public int getMonth() {
        return calender.get(Calendar.MONTH) + 1;
    }

    @Override
    public int getYear() {
        return calender.get(Calendar.YEAR);
    }

    @Override
    public void advanceDays(int days) {
        calender.add(Calendar.DAY_OF_MONTH, days);

    }
}
