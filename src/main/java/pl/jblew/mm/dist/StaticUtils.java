package pl.jblew.mm.dist;

public class StaticUtils {
	private StaticUtils() {
		
	}
	
	public static <T> T [] array(T... elems) {
		return elems;
	}
	
	public  static<T> T [] join(T []... arrays) {
		int sumLength = 0;
		for(T [] arr : arrays) {
			sumLength += arr.length;
		}
		
		@SuppressWarnings("unchecked")
		T [] out = (T[]) new Object [sumLength];
		int i = 0;
		for(T [] arr : arrays) {
			for(T elem : arr) {
				out[i] = elem;
				i++;
			}
		}
		return out;
	}
}
