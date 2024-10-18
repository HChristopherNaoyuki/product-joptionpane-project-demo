package product_joptionpane_project;

import javax.swing.JOptionPane;

public class Product_JOptionePane_Project
{
    /**
     * Main method that executes the program.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // 1. Declare variables for storing product details and cost.
        String prodName;     // Variable to store the name of the product.
        double itemCost;     // Variable to store the cost of a single item.
        int numberItems;     // Variable to store the number of items purchased.
        double amountDue;    // Variable to store the total amount due.

        // 2. Use the JOptionPane class to prompt the user for input.
        // Prompt the user for the product name and store the input.
        prodName = JOptionPane.showInputDialog("Enter Product Name:");

        // Prompt the user for the single item cost, convert the input to double, and store it.
        String tempCost = JOptionPane.showInputDialog("Enter Single Item Cost:");
        itemCost = Double.parseDouble(tempCost); // Convert string to double.

        // Prompt the user for the number of items, convert the input to integer, and store it.
        String tempNumber = JOptionPane.showInputDialog("Enter The Number of Items:");
        numberItems = Integer.parseInt(tempNumber); // Convert string to int.

        // 3. Calculate the total amount due by multiplying item cost by the number of items.
        amountDue = itemCost * numberItems;

        // 4. Display the total amount due and other product details in a message dialog.
        JOptionPane.showMessageDialog(null, 
            "Product Name: " + prodName + "\n" + 
            "Single Item Cost: $" + itemCost + "\n" + 
            "Number of Items: " + numberItems + "\n" + 
            "Total Amount Due: $" + amountDue,
            "Total Amount Due",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
