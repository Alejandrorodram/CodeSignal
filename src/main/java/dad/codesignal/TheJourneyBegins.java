package dad.codesignal;

public class TheJourneyBegins {
	
	public int add(int param1, int param2) {
		return param1 + param2;
	}
	
	public int centuryFromYear(int year) {
	    int century = 1;
	    while (year>100 ){
	        century += 1;
	        year -= 100;
	    } 
	    return century;
	}
	
	public boolean checkPalindrome(String inputString) {
	    String stringOnReverse = new StringBuffer(inputString).reverse().toString();
	    if (inputString.equals(stringOnReverse)) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
}
