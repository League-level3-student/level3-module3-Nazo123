package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	
	}

	@Override
	public String funkifyText(String s) {
		s = s.toLowerCase();;
	char[] mid = s.toCharArray();
	int newer;
	int old = 0;
char superHolder = 0;
	for(int i = 1; i<=mid.length;i++) {
	
		if(isPrime(i)) {
			System.out.println("test");
		newer = i-1;
		if(old!=0) {
			char holder = mid[newer-1];
			String transfer = (holder+"").toUpperCase();
	
			String transfer1 = (mid[newer]+"").toUpperCase();
		
			mid[newer] = transfer.toCharArray()[0];
			mid[old] = transfer1.toCharArray()[0];
			old = newer;
		}
		else {
			old = i-1;
			superHolder = (mid[old]+"").toUpperCase().toCharArray()[0];
			
		}
		}

	}
	mid[old] = superHolder;

	
	s="";
	for(int i = 0; i<mid.length;i++) {
		
		s = s+mid[i];
	}
	
		return s;
	}
	
	
	
	
	public boolean isPrime(int num) {
	
	if(num<=1) {
	return false;
	}
	if(num==2) {
		return true;
	}
	for(int i = 2; i <= num/2;i++) {
		
		if(num%i==0) {
			return false;
		}
		
	}
		
		return true;
	}

}
