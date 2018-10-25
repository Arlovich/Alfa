public class bsearch {
	public static int Bsearch (int x, int... v) {
		
		for(int i = v.length-1 ;i>-1;--i)
			if(v[i]>x) {
				return i;
				
			}
		
		return -1;
	}
}
