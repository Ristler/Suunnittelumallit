package adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();
        date.setDay(10);
        date.setMonth(4);
        date.setYear(1997);

        System.out.println("Days before advancing: "+ date.getDay());
        date.advanceDays(6);

        System.out.println("Days after advancing: "+ date.getDay());
        System.out.println("Current month: "+date.getMonth());

        System.out.println("Changing month to december.. ");
        date.setMonth(12);
        System.out.println("Current month is "+ date.getMonth());
        System.out.println("Current year is: "+date.getYear());
        System.out.println("Current days is: "+date.getDay());
        System.out.println("Increasing days to cross to next year..");
        date.advanceDays(25);
        System.out.println("After advancing 25 days, the year is: "+date.getYear());
    }
}
