
public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(6));
	}
	
	private static int mySqrt(int x) {
        long start = 0;
        long end = x;
        
        while(end - start != 1) {
        	long mid = start + (end - start)/2;
        	if(mid * mid == x) return (int)mid;
        	else if(mid * mid > x) end = mid;
        	else start = mid;
        }
        
        if(end * end == x) return (int)end;
        return (int)start;
    }

}
