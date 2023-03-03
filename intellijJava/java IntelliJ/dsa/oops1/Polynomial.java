package dsa.oops1;
import java.util.*;

public class Polynomial {
	int[] arr;
    public Polynomial() {
        arr = new int[10];
    }
    
    public Polynomial(int size) {
        arr = new int[size];
    }
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
		if(degree >= arr.length) {
            int size = degree*2;
            int[] arr1 = new int[size];
            
            for(int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            }
            arr = arr1;
        }
        arr[degree] = coeff;
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) System.out.print(arr[i] + "x" + i + " ");
		}
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		int max = Math.max(arr.length, p.arr.length);
		Polynomial newP = new Polynomial(max);
		
		int i = 0;
		while(i < arr.length && i < p.arr.length) {
			newP.arr[i] = arr[i] + p.arr[i];
			i++;
		}
		while(i < arr.length) newP.arr[i] = arr[i++];
		while(i < p.arr.length) newP.arr[i] = p.arr[i++];
		
		return newP;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		int max = Math.max(arr.length, p.arr.length);
		Polynomial newP = new Polynomial(max);
		
		int i = 0;
		while(i < arr.length && i < p.arr.length) {
			newP.arr[i] = arr[i] - p.arr[i];
			i++;
		}
		while(i < arr.length) newP.arr[i] = arr[i++];
		while(i < p.arr.length) newP.arr[i] = p.arr[i++];
		
		return newP;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		int max = Math.max(arr.length, p.arr.length);
		int size = max*2;
		Polynomial newP = new Polynomial(size);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < p.arr.length; j++) {
				int coeff = arr[i]*p.arr[j];
				int degree = i+j;
				
				if(coeff != 0) {
					newP.arr[degree] += coeff;
				}
			}
		}
		return newP;
	}

}
