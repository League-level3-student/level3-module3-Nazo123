package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
	
		
			char[] mid = s.toCharArray();
		
			for(int i = 0; i<mid.length;i++) {
			if(i%2==0) {
		
				System.out.println();
				String holder = ""+mid[i];
				
				holder = holder.toLowerCase();
		
				mid[i] = holder.toCharArray()[0];
			}
			else {
			
				String holder = ""+mid[i];
				
				holder = holder.toUpperCase();
		
				mid[i] = holder.toCharArray()[0];
			}
			}
			s = "";
			
			for(int i = 0; i<mid.length;i++) {
	
				s = s+mid[i];
			}
			
			
			return s;
		
	}

}
