package CustomException;

public class AgeRestrictionException extends RuntimeException {
	
	AgeRestrictionException(String str){
		super(str);
	}
}
