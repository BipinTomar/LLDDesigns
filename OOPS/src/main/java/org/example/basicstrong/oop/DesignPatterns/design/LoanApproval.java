package org.example.basicstrong.oop.DesignPatterns.design;

public abstract class LoanApproval {

    protected LoanApproval nextLoanApproval;

    public void setNextLoanApproval(LoanApproval nextLoanApproval) {
        this.nextLoanApproval = nextLoanApproval;
    }
    public abstract void approveLoan(Loan loan);
}
class Managerr extends LoanApproval {
    public void approveLoan(Loan loan) {
        if (loan.getAmount() <= 100000) {
            System.out.println("Approved by manager.");
        } else {
            nextLoanApproval.approveLoan(loan);
        }
    }
}

class Director extends LoanApproval {
    public void approveLoan(Loan loan) {
        if (loan.getAmount() <= 250000) {
            System.out.println("Approved by Director.");
        } else {
            nextLoanApproval.approveLoan(loan);
        }
    }
}

class VicePresident extends LoanApproval {
    public void approveLoan(Loan loan) {
        System.out.println("Approved by VP");
    }
}
