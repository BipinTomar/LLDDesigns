package org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense;



import org.example.basicstrong.oop.LLD.SplitwiseDesign.BalanceSheetController;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.Split.ExpenseSplit;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.Split.Split;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.User.User;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.SplitFactory;





import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;
    public ExpenseController(){
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, description,expenseAmount, paidByUser, splitType, splitDetails);

        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;
    }
}


