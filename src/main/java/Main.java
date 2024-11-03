public class Main {
	
	public static int Q14(int[] array, int i, int count, int sum) {
	    if (count == i) {
	        return sum;
	    }
	    if (i>array.length || i<0) {
	    	return -1;
	    }
	    return Q14(array, i, count + 1, sum + array[count]);
	}
	public static int Q15(int[] array, int n, int index, int Pcount) {
	    if (index == n) 
	        return Pcount;
	    if (n>array.length || n<0)
	    	return -1;
	    if (array[index]>0)
	    	Pcount++;
	    return Q15(array, n,index+1,Pcount);
	}
	public static int Q16(int[] array, int n,int index) {
	    if (array.length==index)
	    	return -1;
		if (array[index]==n) 
	        return index;
	    return Q16(array,n,index+1);
	}
	public static boolean Q17(int[] array, int index) {
	    if (index == array.length - 1) 
	        return true; 
	    if (array[index] >= array[index + 1])
	        return false;
	    return Q17(array, index + 1);
	}


    public static boolean isPrime(int number, int divisor) {
        if (number < 2 || number % divisor == 0) {
            return false; 
        }
        if (divisor * divisor > number) {
            return true;
        }
        return isPrime(number, divisor + 1);
    }
    public static boolean Q18(int[] array, int index,boolean c){
    	 if (array.length==index)
 	    	return !c;
    	 if (c)
    		 return false;
    	 return Q18(array,index+1,isPrime(array[index],2));
    }
    


	
	public static void main(String[] args) {
		int[] array = {16,24,100,13};
		System.out.println(Q14(array,5,0,0));
		// -1 == error
		System.out.println(Q15(array,-3,0,0));
		// -1 == error
		System.out.println(Q16(array,3,0));
		// -1 == not found
		System.out.println(Q17(array,0));
		System.out.println(Q18(array,0,false));


	}
	
	
	
}
