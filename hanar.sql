-- From the dataset given, write a SQL query to find the ORDER ID
-- of the order with the highest total UnitPrice placed by a 
-- customer with customerid HANAR.

SELECT OrderID
FROM Orders
    JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID
WHERE price = MAX(UnitPrice) AND CustomerID = "HANAR";
