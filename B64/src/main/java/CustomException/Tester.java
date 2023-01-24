package CustomException;

public class Tester {

	public static void main(String[] args) {
		
		VotingCommittee v = new VotingCommittee(19);
		
		try {
			v.ageChecker();
		}
		catch (AgeRestrictionException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("The program has ended");
		}
	}
}
