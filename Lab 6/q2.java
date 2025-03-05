public class q2 {
    public static void main(String[] args) {
        MobileRechargePlan prepaidPlan = new PrepaidRecharge("Prepaid Plan 1", 300, 30);
        MobileRechargePlan postpaidPlan = new PostpaidRecharge("Postpaid Plan 1", 500, 30);

        System.out.println("Prepaid Plan Details:");
        prepaidPlan.displayPlanDetails();
        System.out.println("Recharge Amount for 100 minutes talk time: Rs. " + prepaidPlan.calculateRechargeAmount(100));

        System.out.println("\nPostpaid Plan Details:");
        postpaidPlan.displayPlanDetails();
        System.out.println("Recharge Amount for 100 minutes talk time: Rs. " + postpaidPlan.calculateRechargeAmount(100));
    }
}

abstract class MobileRechargePlan {
    String planName;
    double planAmount;
    int validityDays;

    public MobileRechargePlan(String planName, double planAmount, int validityDays) {
        this.planName = planName;
        this.planAmount = planAmount;
        this.validityDays = validityDays;
    }

    abstract void displayPlanDetails();

    abstract double calculateRechargeAmount(double talkTime);
}

class PrepaidRecharge extends MobileRechargePlan {

    public PrepaidRecharge(String planName, double planAmount, int validityDays) {
        super(planName, planAmount, validityDays);
    }

    @Override
    void displayPlanDetails() {
        System.out.println("Prepaid Plan: " + planName);
        System.out.println("Amount: Rs. " + planAmount);
        System.out.println("Validity: " + validityDays + " days");
    }

    @Override
    double calculateRechargeAmount(double talkTime) {
        return planAmount + (talkTime * 0.5);
    }
}

class PostpaidRecharge extends MobileRechargePlan {

    public PostpaidRecharge(String planName, double planAmount, int validityDays) {
        super(planName, planAmount, validityDays);
    }

    @Override
    void displayPlanDetails() {
        System.out.println("Postpaid Plan: " + planName);
        System.out.println("Amount: Rs. " + planAmount);
        System.out.println("Validity: " + validityDays + " days");
    }

    @Override
    double calculateRechargeAmount(double talkTime) {
        return planAmount + (talkTime * 1.0);
    }
}

