# Product JOptionPane Project

## Overview
The Product JOptionPane Project is a simple Java application that utilizes the `JOptionPane` class to gather product information from the user, including product name, item cost, and quantity. It calculates the total amount due and displays the information in a dialog box.

## Features
- Input product name, item cost, and quantity using dialog boxes.
- Calculate the total amount due based on user input.
- Display the product details and total amount in a message dialog.

## Prerequisites
- Java Development Kit (JDK) 8 or higher.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a simple text editor.

## Setup

### Running the Application
1. **Clone the Repository** (if applicable):
   ```bash
   git clone https://github.com/HChristopherNaoyuki/product-joptionpane-project-demo.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd product-joptionpane-project
   ```

3. **Compile the Java File**:
   ```bash
   javac product_joptionpane_project/Product_JOptionePane_Project.java
   ```

4. **Run the Application**:
   ```bash
   java product_joptionpane_project.Product_JOptionePane_Project
   ```

## Code Explanation
- **Product_JOptionePane_Project Class**: This class contains the main method where the application execution begins.
  
- **Variables**:
  - `prodName`: Stores the name of the product.
  - `itemCost`: Stores the cost of a single item.
  - `numberItems`: Stores the quantity of items purchased.
  - `amountDue`: Calculates the total amount due.

- **Input via JOptionPane**:
  - Prompts the user to enter the product name, single item cost, and the number of items using dialog boxes.
  - Converts the inputs from strings to appropriate data types (double for cost, int for quantity).

- **Calculation**: Computes the total amount due by multiplying the item cost by the number of items.

- **Output**: Displays a message dialog containing all the product details and the total amount due.

## Example Usage
Upon running the application, the user will see a series of dialog boxes prompting for:
1. Product name
2. Single item cost
3. Number of items

After entering the information, a final dialog will display the total amount due along with the entered details.
