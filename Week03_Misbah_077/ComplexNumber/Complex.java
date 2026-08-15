public class Complex {
    private double real;
    private double imaginary;


    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getters
    public double getReal() {
    return real; 
    }

    public double getImaginary() {
    return imaginary; 
}

    // Leaves a and b untouched, just returns their sum as a new object
    public Complex add(Complex obj) {
        return new Complex(this.real + obj.real, this.imaginary + obj.imaginary);
    }

    // Leaves a and b untouched, just returns their sub as a new object
    public Complex sub(Complex obj) {
        return new Complex(this.real - obj.real, this.imaginary - obj.imaginary);
    }

    //Conjugate only needs 'this'flipping the sign of imaginary doesn't
    // require another Complex to compare against
    public Complex conjugate() {
        return new Complex(this.real,-this.imaginary);

    }

    public String describe() {
    return (this.imaginary == 0) ? "Purely Real" 
         : (this.real == 0) ? "Purely Imaginary" 
         : "Has both real and imaginary parts";
}

   
    public String toString() {
        return "(" + real + ", " + imaginary + ")";
    }
}