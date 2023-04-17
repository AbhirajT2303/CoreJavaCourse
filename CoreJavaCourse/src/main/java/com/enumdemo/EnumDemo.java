package com.enumdemo;

public class EnumDemo {

    public enum WeekDay {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public enum WeekDays {
        SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

        int day;

        WeekDays(int day) {

            this.day = day;
        }


        public static void main(String[] args) {

            WeekDay weekDay = WeekDay.SUNDAY;
            System.out.println("1: "+WeekDay.MONDAY);
            System.out.println("2: "+weekDay);
            System.out.println("3: "+weekDay.ordinal() + ":" + weekDay.name());

            WeekDays weekDays = WeekDays.TUESDAY;
            System.out.println("4: "+weekDays.day);
            System.out.println("5: "+weekDays.ordinal() + ":" + weekDays.name());

            String day = "MONDAY";
            System.out.println("6: "+day);

            WeekDays day1 = weekDays;

            switch (day1) {
                case SUNDAY: {
                    System.out.println("Sunday ");
                    break;
                }
                case MONDAY: {
                    System.out.println("Monday");
                    break;
                }
                case TUESDAY: {
                    System.out.println("Tuesday");
                    break;
                }
                case WEDNESDAY: {
                    System.out.println("Wednesday");
                    break;
                }

            }

        }

    }
}