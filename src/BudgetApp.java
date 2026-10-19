import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        // System.out.println(groceries);
        // System.out.println(groceries.getCategory());
        // System.out.println(groceries.getLimit());
        // System.out.println(groceries.getSpent());

        List<BudgetCategory> list = new ArrayList<>();

        while(scan.hasNextLine()) {
            String category = scan.nextLine();
            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            BudgetCategory categories = new BudgetCategory(category, limit, spent);
            list.add(categories);
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("The categories sorted from most spent to least is:");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    
        int diff = budgetDifference(list);
        System.out.println("Budget Difference: $" + diff);

        if(list.size() > 0)
        {
            double average = diff / list.size();
            System.out.println("Average difference for each category: $" + String.format("%.2f", average));
        }
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        int total = 0;
        for(int i = 0; i < categories.size(); i++)
        {
            total = total + (int) categories.get(i).difference();
        }

        return total;
    }
}
