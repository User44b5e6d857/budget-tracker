public class BudgetCategory {
    private String category;
    private double limit;
    private double spent;

    public BudgetCategory(String category, double limit, double spent)
    {
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    public getCategory()
    {
        return category;
    }

    public getLimit()
    {
        return limit;
    }

    public getSpent()
    {
        return spent;
    }

    public String toString()
    {
        
    }
    
}