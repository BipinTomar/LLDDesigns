package org.example.basicstrong.oop.LLD.SplitwiseDesign.Group;

import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.Expense;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.ExpenseSplitType;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.Split.Split;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.User.User;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.ExpenseController;



import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupId;
    String groupName;
    List<User> groupMembers;

    List<Expense> expenseList;

    ExpenseController expenseController;

    Group(){
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    //add member to group
    public void addMember(User member){
        groupMembers.add(member);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser) {

        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, splitType, paidByUser);
        expenseList.add(expense);
        return expense;
    }

}
