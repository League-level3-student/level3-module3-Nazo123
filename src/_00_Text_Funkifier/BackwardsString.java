package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String s) {
	
		char[] mid = s.toCharArray();
		for(int i = 0; i<mid.length/2;i++) {
			char holder = mid[i];
			mid[i] = mid[mid.length-i-1];
			mid[mid.length-i-1]=holder;
		}
		s = "";
		
		for(int i = 0; i<mid.length;i++) {
			s = s+mid[i];
		}
	
		
		return s;
	}

}
