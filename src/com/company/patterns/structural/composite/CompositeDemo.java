package com.company.patterns.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        var salesDepartment = new SalesDepartment(1, "Sales department");

        var financialDepartment = new FinancialDepartment(2, "Financial department");

        var headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}