package com.PPiyush005.Expense_Tracker.dto;

import com.PPiyush005.Expense_Tracker.Entity.Expense;

import java.util.List;

public class CategoryExpenseResponse {
    public String category;
    public double total;
    public List<Expense> expenses;
}
