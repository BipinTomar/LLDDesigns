package org.example.basicstrong.oop.LLD.SplitwiseDesign.Expense.Split;

import org.example.basicstrong.oop.LLD.SplitwiseDesign.User.User;
import org.example.basicstrong.oop.LLD.SplitwiseDesign.User.UserController;

public class Split {
    User user;
    double amountOwe;

    public Split(User user, double amountOwe){
        this.user = user;
        this.amountOwe = amountOwe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmountOwe() {
        return amountOwe;
    }

    public void setAmountOwe(double amountOwe) {
        this.amountOwe = amountOwe;
    }

}
