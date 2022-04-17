public class TemporaryEmployee extends Employee{


    TemporaryEmployee(){
        super.empType="Temporary";
        super.pay=1000.99;
        super.bonusPercentage=0.0;
    }

    public double computePay() {

//        double payPerHourRate=100;
        //some code

        BonusService ref = new BonusService(this);
        return ref.computeBonus();
    }
}
