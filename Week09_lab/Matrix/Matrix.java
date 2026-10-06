// We implement Cloneable so that we can use super.clone() later.
public class Matrix implements Cloneable {
    private int rows;       
    private int columns;    
    private int[] data;     // 1D array holding the matrix values in row-major order

    
    public Matrix(int rows, int columns, int[] source) {
        
        // Ensuring that the dimensions make sense.
        if (rows <= 0 || columns <= 0) {
            throw new IllegalArgumentException("Rows and columns must be positive");
        }
        
        // Ensure the source array has the exact number of elements needed to fill the matrix.
        // If rows=2 and columns=3, we need exactly 6 integers.
        if (source == null || source.length != rows * columns) {
            throw new IllegalArgumentException("source.length must equal rows * columns");
        }

        this.rows = rows;
        this.columns = columns;

        // Initialize the data array and copy values from the source array.
        this.data = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            this.data[i] = source[i];
        }
    }

        // Retrieves a value at a specific 2D position (row, column).
    public int get(int row, int column) {
        // Bounds checking: rows go from 0 to rows-1; columns go from 0 to columns-1.
        // If someone asks for an invalid position, we throw an exception immediately.
        if (row < 0 || row >= this.rows || column < 0 || column >= this.columns) {
            throw new IndexOutOfBoundsException("Invalid row or column");
        }

        // index = (row * total_columns) + column
        return this.data[row * this.columns + column];
    }

    // Updates the value at a specific 2D position (row, column).
    public void set(int row, int column, int value) {
        if (row < 0 || row >= this.rows || column < 0 || column >= this.columns) {
            throw new IndexOutOfBoundsException("Invalid row or column");
        }
        
        // Update the 1D array using the same row-major formula.
        this.data[row * this.columns + column] = value;
    }

    //  SHALLOW COPY
    // It creates a new Matrix object and copies the values of all fields:
    @Override
    public Matrix clone() throws CloneNotSupportedException {
        return (Matrix) super.clone();
    }

    // DEEP COPY
    // It creates a new Matrix object and copies the values of all fields,
    // but it also creates a new array for the data, so that changes to the original
    public Matrix deepCopy() throws CloneNotSupportedException {
        Matrix cloned = (Matrix) super.clone(); // First, we do a shallow copy
        cloned.data = new int[this.data.length]; // Create a new array for the data
        for (int i = 0; i < this.data.length; i++) {
            cloned.data[i] = this.data[i]; // Copy each value into the new array
        }
        return cloned; // Return the new, independent Matrix object
        
    }

    
     @Override
    public String toString() {
        String result = "["; 
        // Loop through every row.
        for (int r = 0; r < this.rows; r++) {
            
            // If this is not the first row, add a comma and space before the row bracket.
            if (r > 0) {
                result = result + ", ";
            }
            
            result = result + "["; // Start the inner bracket for this row.
            
            // Loop through every column in this row.
            for (int c = 0; c < this.columns; c++) {
                
                // If this is not the first column, add a comma and space before the number.
                if (c > 0) {
                    result = result + ", ";
                }
                
                // Add the actual number from the 1D data array using the row-major formula.
                result = result + this.data[r * this.columns + c];
            }
            
            result = result + "]"; // End the inner bracket for this row.
        }
        return result = result + "]"; // End the outer bracket for the entire matrix.
    }}