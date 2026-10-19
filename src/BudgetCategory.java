public class BudgetCategory implements Comparable<BudgetCategory> {
    private String category;
    private double limit;
    private double spent;

    public BudgetCategory(String category, double limit, double spent)
    {
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    public String getCategory()
    {
        return category;
    }

    public double getLimit()
    {
        return limit;
    }

    public double getSpent()
    {
        return spent;
    }

    public double difference()
    {
        return spent - limit;
    }

    public int compareTo(BudgetCategory other)
    {
        if(this.difference() < other.difference())
        {
            return -1;
        }
        
        else if(this.difference() > other.difference())
        {
            return 1;
        }

        else
        {
            return 0;
        }
    }

    public String toString()
    {
        return "Category: " + category + "    Limit: $" + String.format("%.2f", limit)
        + "    Spent: $" + String.format("%.2f", spent);
    }
    
}