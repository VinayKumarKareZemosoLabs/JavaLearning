public class PermanentEmployee extends Employee{

    PermanentEmployee(){
        super.empType="Permanent";
        super.pay=10000.00;
        super.bonusPercentage=0.2;
    }
    public double computePay() {
        //some code
        BonusService ref = new BonusService(this);

        return ref.computeBonus();
    }

    public void getInsuranceDetails(){
        //Some code
    }




}
