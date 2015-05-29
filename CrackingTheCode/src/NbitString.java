import java.util.Arrays;


public class NbitString {

	
	int[] a;
	public NbitString(int n) {

		a=new int[n];
	}
	public void nBits(int n) {
        if (n <= 0) {
            System.out.println(Arrays.toString(a));
        } else {
            a[n - 1] = 0;
            nBits(n - 1);
            a[n - 1] = 1;
            nBits(n - 1);
        }
    }
	 public static void main(String[] args) throws java.lang.Exception {
	        int n = 3;
	        NbitString i = new NbitString(n);
	        i.nBits(n);
	    }
}
