package org.example.basicstrong.oop.LLD.SplitwiseDesign.User;

import org.example.basicstrong.oop.LLD.SplitwiseDesign.UserExpenseBalanceSheet;

    public class User {

        String userId;
        String userName;
        UserExpenseBalanceSheet userExpenseBalanceSheet;

        public User(String id, String userName){
            this.userId = id;
            this.userName = userName;
            userExpenseBalanceSheet = new UserExpenseBalanceSheet();
        }
        public String getUserId() {
            return userId;
        }

        public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
            return userExpenseBalanceSheet;
        }

    }
