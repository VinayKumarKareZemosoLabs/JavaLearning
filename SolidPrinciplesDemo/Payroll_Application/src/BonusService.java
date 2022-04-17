public class BonusService {

    Employee employee;
    BonusService(Employee employee){
        this.employee=employee;
    }

    public double computeBonus() {

        double totalPay = employee.pay+ employee.bonusPercentage* employee.pay;

        return totalPay;
    }
}
