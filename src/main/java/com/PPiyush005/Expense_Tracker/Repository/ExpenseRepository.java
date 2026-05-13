package com.PPiyush005.Expense_Tracker.Repository;

import com.PPiyush005.Expense_Tracker.Entity.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ExpenseRepository extends MongoRepository<Expense , String> {

    public List<Expense> findByCategory(String category);
}
