package org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.Split;

import java.util.List;

public interface ExpenseSplit {

    public void validateSplitRequest(List<Split> splitList, double totalAmount);
}
