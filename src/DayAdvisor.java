class DayAdvisor implements Advisor {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Понеділок: Скласти список завдань на тиждень.");
                break;
            case TUESDAY:
                System.out.println("Вівторок: Сфокусуватися на важливих проектах.");
                break;
            case WEDNESDAY:
                System.out.println("Середа: Провести час для вивчення нових навичкок.");
                break;
            case THURSDAY:
                System.out.println("Четвер: Відзначити свої досягнення за тиждень.");
                break;
            case FRIDAY:
                System.out.println("П'ятниця: Happy Friday!");
                break;
            case SATURDAY:
                System.out.println("Субота: Час для відпочинку! Відвідайте парк.");
                break;
            case SUNDAY:
                System.out.println("Неділя: Час для відпочинку! Відвідайте кіно.");
                break;
            default:
                System.out.println("Невідомий день.");
                break;
        }
    }
}