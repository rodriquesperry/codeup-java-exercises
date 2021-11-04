package Interfaces_Abstract_Lecture;

public class Accountant extends Employee {

    public Accountant(String name, String department) {
        super(name, department);
    }


    public String work() {
        return "TPS reports have been drafted!";
    }

    public String morningMeeting() {
        return "Accountants have a meeting with the finance department head.";
    }

    public String lunchTime() {
        return "Anytime during the day at desk";
    }

    public int dailyPay() {
        return 500;
    }
}
