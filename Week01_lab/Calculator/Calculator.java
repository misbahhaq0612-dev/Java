public class Calculator{
    
public double add(double x, double y){
    return x+y;
}

public double sub(double x, double y){
    return x-y;
}

public double mul(double x, double y){
    return x*y;
}

public double div(double x, double y){
    if(y == 0){
    throw new ArithmeticException("Denominator can not be 0");
}
   return x/y;
}

public double power(double base, double pow){
    if(pow == 0){
        return 1;
   }
    double result = 1;
    if(pow < 0){
        base = 1/base;
        pow = -pow;
    }
    while(pow!=0){
        result *= base;
        pow--;
    }
    return result;
}

public double mod(double x, double y){
    if (y == 0){
        // Throw an exception if the divisor is 0
        throw new ArithmeticException("Cannot calculate modulus with divisor 0");
    }
    return x%y;
}
// Variable arguments (varargs) allows multiple arguments of the same type to be passed to a method. 
public double minimum(double... numbers){
    if(numbers.length == 0){
        // Throw an exception if no numbers are  provided
        throw new IllegalArgumentException("Cannot find minmum of 0 numbers");
    }

    double min = numbers[0];
    for(double num : numbers){
        if(num < min){
            min = num;
        }
    }
    return min;
}
// Variable arguments (varargs) allowa multiple arguments of the same type to be passed to a method. 
public double maximum(double... numbers){
    if(numbers.length == 0){
        // Throw an exception if no numbers are  provided
        throw new IllegalArgumentException("Cannot find minmum of 0 numbers");
    }

    double max = numbers[0];
    for(double num: numbers){
        if(num > max){
            max = num;
        }
    }
    return max;
}

}