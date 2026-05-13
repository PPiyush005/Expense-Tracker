package com.PPiyush005.Expense_Tracker.Controller;

import com.PPiyush005.Expense_Tracker.Entity.Expense;
import com.PPiyush005.Expense_Tracker.Service.ExpenseService;
import com.PPiyush005.Expense_Tracker.dto.CategoryExpenseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense){
        return expenseService.addExpense(expense);
    }

    @GetMapping
    public List<Expense> getExpense(){
        return expenseService.getExpense();
    }

    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable String id,@RequestBody Expense expense){
        return expenseService.updateExpense(id, expense);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable String id){
        expenseService.deleteExpense(id);
    }

    @GetMapping("/category/{category}")
    public CategoryExpenseResponse getTotalExpenseByCategory(@PathVariable String category){
        return expenseService.totalExpenseByCategory(category);
    }

    @GetMapping("/total")
    public double TotalExpense(){
        return expenseService.totalExpense();
    }
}