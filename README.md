# SudokuValidator
The class Soudo contains 5 methods:
1) Main Method to run the application, where do i call the solveBoard method and give us a message if Sudoku completed correctly or not.
2) Method (isNumberInRow) which returns true if specific number is in a row, otherwise will return false. We iterate through the all rows and columns chechking for a specific number. If number is found than we return true.
3) Method (isNumberInColumn) which returns true if specific number is in a column, otherwise will return false.  We iterate through the all rows and columns chechking for a specific number. If number is found than we return true.  
4) Method (isNumberInBox) which returns true if specific number is in a sub grid, otherwise will return false. We iterate only through sub grid to check for a specific number and not through all rows and columns 
5) Method (solveBoard) which returns true if sudoku completed succesfully.I used HashSet because it doesn't allow duplicates. I iterated over all rows and columns to see if there is duplicates. 
