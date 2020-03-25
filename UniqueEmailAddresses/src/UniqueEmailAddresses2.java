import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails = new String[] {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
		System.out.println(numUniqueEmails(emails));
	}

	private static int numUniqueEmails(String[] emails) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		for(String email: emails) {
			String[] parts = email.split("@");
			String[] localParts = parts[0].split("\\+");
			set.add(localParts[0].replace(".", "" + "@" + parts[1]));
		}
		return set.size();
	}

}
