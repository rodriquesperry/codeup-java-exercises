package Interfaces_Abstract_Lecture;

public class Company {

    public static void main(String[] args) {
        //Can use Accountant variableName = new Accountant

        Employee accountantBot = new Accountant("numberBot", "Accounting");
        Employee cleanerBot = new Custodian("CleanerBot", "Maintenance");

//        System.out.println(accountantBot.work());
//        System.out.println(accountantBot.getName());
//        System.out.println(accountantBot.getDepartment());
//
//        System.out.println(cleanerBot.work());
//        System.out.println(cleanerBot.getName());
//        System.out.println(cleanerBot.getDepartment());

        System.out.println(accountantBot.getName() + " is reporting for business for the " + accountantBot.getDepartment());
        System.out.println("accountantBot's morning:' " + accountantBot.morningMeeting());
        System.out.println("cleanerBot's morning: " + cleanerBot.morningMeeting());

        System.out.println("What happens at lunchtime?");
        System.out.println("accountantBot.lunchTime() = " + accountantBot.lunchTime());
        System.out.println("cleanerBot.lunchTime() = " + cleanerBot.lunchTime());

        System.out.println("What kind of work did they do?");
        System.out.println("accountantBot.work() = " + accountantBot.work());
        System.out.println("cleanerBot.work() = " + cleanerBot.work());

        System.out.println("how much did they get paid?");
        System.out.println("accountantBot.dailyPay() = " + accountantBot.dailyPay());
        System.out.println("cleanerBot.dailyPay() = " + cleanerBot.dailyPay());
    }
}
