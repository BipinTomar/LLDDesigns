package org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense;

import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.Split.EqualExpenseSplit;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.Split.ExpenseSplit;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.Split.PercentageExpenseSplit;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }

}
