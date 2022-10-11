
public class Ex1 {

	public static void main(String[] args) {
		System.out.println(strCheck("cdoer", "coder"));
	}
	
	public static String strCheck(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int count=0;
		int countNew = ch2.length;
		
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<countNew;j++) {
				if(ch1[i]==ch2[j]) {
					count++;
				}
			}
		}
		
		if(count == countNew) {
			return "true";
		}else {
			return "false";
		}
		
	}

}
