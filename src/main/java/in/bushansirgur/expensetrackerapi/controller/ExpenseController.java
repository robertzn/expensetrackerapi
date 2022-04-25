package in.bushansirgur.expensetrackerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.bushansirgur.expensetrackerapi.entity.Expense;
import in.bushansirgur.expensetrackerapi.service.ExpenseService;

@RestController
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public List<Expense> getAllExpenses() {
		return expenseService.getAllExpenses();
	}
	
	@GetMapping("/expenses/{id}")
	public Expense getExpenseById(@PathVariable Long id) {
		return expenseService.getExpenseById(id);
	}
	
	@DeleteMapping("/expenses")
	public void deleteExpenseById(@RequestParam Long id) {
		expenseService.deleteExpenseById(id);
	}

	@PostMapping("/expenses")
	public void saveExpenseDetails(@RequestBody Expense expense){
		System.out.println(" Printing the expense details::"+expense);
	}
}
