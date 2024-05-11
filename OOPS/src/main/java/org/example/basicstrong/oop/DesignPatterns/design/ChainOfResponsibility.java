package org.example.basicstrong.oop.DesignPatterns.design;

public class ChainOfResponsibility {
    public static void main(String[] args) {

        LoanApproval manager = new Managerr();
        LoanApproval director = new Director();
        LoanApproval vp = new VicePresident();

        manager.setNextLoanApproval(director);
        director.setNextLoanApproval(vp);

        manager.approveLoan(new Loan(250000));
    }

}
