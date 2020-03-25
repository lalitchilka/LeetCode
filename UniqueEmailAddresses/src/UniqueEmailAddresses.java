import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails = new String[] {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
		System.out.println(numUniqueEmails(emails));
	}
	
	private static int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<>();
		for(String email: emails) {
			StringBuilder sb = new StringBuilder();
			String[] temp = email.split("@");
			for(Character c: temp[0].toCharArray()) {
				if(c != '.') {
					if(c == '+') break;
					sb.append(c);
				}
			}
			sb.append("+");
			sb.append(temp[1]);
			set.add(sb.toString());
		}
		return set.size();
	}

}
