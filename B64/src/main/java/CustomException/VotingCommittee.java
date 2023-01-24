package CustomException;

public class VotingCommittee {
	
	private int age;

	VotingCommittee(int age){
		this.age = age;
	}
	
	void ageChecker() {
		
		if(age < 18) {
			throw new AgeRestrictionException("The age is less than 18, not eligible for voting.");
		}
		else {
			System.out.println("Age is 18 or greater, thus eligible for voting.");
		}
		
		System.out.println("Voting in progress....");
		System.out.println("Finish.");
	}
}
