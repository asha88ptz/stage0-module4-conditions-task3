package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {

    /**
     * Implement the program that will consume salary from method argument as input of an employee
     * and calculate its salary after taxes according to the following:
     * 1. Basic Salary <= 10000: taxes - 15%.
     * 2. 10000 < Basic Salary <= 20000: taxes - 18%
     * 3. Basic Salary > 20000 : taxes - 20%
     * 4. Basic salary < 0 -> "wrong input!"
     * @param salary
     */
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }
        double percent;
        if (salary <= 10000) {
            percent = 15;
        } else if (salary <= 20000) {
            percent = 18;
        } else {
            percent = 20;
        }

        double result = salary * (100 - percent) / 100.0;
        System.out.println(result);
    }
}
