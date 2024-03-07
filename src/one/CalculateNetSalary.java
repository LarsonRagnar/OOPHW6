package one;
public class CalculateNetSalary {
    private int baseSalary;
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
}
}
