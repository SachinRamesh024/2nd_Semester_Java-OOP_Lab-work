public class ArrayElementsSum {
    public
    void ArraySum(int A[])	//Method definition as Array Argument.
    {
        int sum=0;
        System.out.print("The Elements in Array are A={ ");
        for(int i=0; i<6; i++)
        {
            System.out.print(A[i]);
            if(i<5)
                System.out.print(",");
            sum=sum+A[i];
        }
        System.out.println("};");
        System.out.println("The sum of the array Elements is: "+sum);
    }
    public static void main(String[] args) {
        ArrayElementsSum Sum =new ArrayElementsSum();
        int A[]= {1,3,4,5,6,8};	//Array initialized with some elements to find the sum
        Sum.ArraySum(A);		//Method call by using object Sum of ArrayElementsSum class.

    }

}
