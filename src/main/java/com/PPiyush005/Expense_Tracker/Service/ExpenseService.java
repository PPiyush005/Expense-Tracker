package com.PPiyush005.Expense_Tracker.Service;

import com.PPiyush005.Expense_Tracker.Entity.Expense;

import com.PPiyush005.Expense_Tracker.Repository.ExpenseRepository;
import com.PPiyush005.Expense_Tracker.dto.CategoryExpenseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense addExpense(Expense expense){
        return expenseRepository.save(expense);
    }

    public List<Expense> getExpense(){
        return expenseRepository.findAll();
    }

    public Expense updateExpense(String id, Expense newExpense){
        Expense expense = expenseRepository.findById(id).orElseThrow();
        expense.setTitle(newExpense.getTitle());
        expense.setDescription(newExpense.getDescription());
        expense.setAmount(newExpense.getAmount());
        expense.setDate(newExpense.getDate());
        expense.setCategory(newExpense.getCategory());
        return expenseRepository.save(expense);
    }

    public void deleteExpense(String id){
        expenseRepository.deleteById(id);
    }

    public List<Expense> getExpenseByCategory(String category){
        return expenseRepository.findByCategory(category);
    }

    public CategoryExpenseResponse totalExpenseByCategory(String category){
        List<Expense> expenses = expenseRepository.findByCategory(category);

        double total=0;
        for (Expense expense : expenses) {
            total+=expense.getAmount();
        }
        CategoryExpenseResponse response = new CategoryExpenseResponse();

        response.category=category;
        response.expenses=expenses;
        response.total=total;

        return response;
    }

    public double totalExpense(){
        List<Expense> list = expenseRepository.findAll();

        double totalAmount=0;
        for(Expense expense : list){
            totalAmount+=expense.getAmount();
        }
        return totalAmount;
    }
}
