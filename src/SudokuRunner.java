public class SudokuRunner
{

    /*
    Yeah, this is a pretty blank program. I'd suggest that you...

    Create a 2-d array of integers for your grid:
        0 = blank
        -1 through -9 = printed (original) numbers, not to change!
        +1 through +9 = penciled numbers

    Fill in the array with starting numbers... either hard-coded or from a file, if desired.

    Write a method draw the grid out. Use absolute values (Math.abs) for numbers and spaces for blanks.

    Write a method to determine whether the current grid has conflicts in it. Again, use absolute values. (Optionally,
    just worry about the conflicts associated with a given (r, c).)

    Write a wrapper method to get the solver started.

    Write a recursive method to try to solve the rest of the grid, from a given location forward.
            Base cases? (Is this a negative number already? Have we gotten to the end?)

            Loop through all possibilities (1-9) and see whether there are any ways to make this number (this is the
             recursive spot... try a number and check whether there is a solution in the remainder of the board.

            return whether we found a solution or not. (boolean)
     */

    public static void main(String[] args)
    {
        System.out.println("Sudoku...");
    }
}
