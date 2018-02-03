package ans;
import java.util.*;

public class VoteProcessor {

	public static String calculateElectionWinner(ArrayList<String> votes) {
		int francis = 0;
		int snowden = 0;
		for(int i = 0; i<votes.size(); i++) {
			if(votes.get(i).toLowerCase().equals("pope francis")) {
				francis++;
			}
			if(votes.get(i).toLowerCase().equals("edward snowden")) {
				snowden++;
			}
		}
		System.out.println("pope frances: " + francis + ", edward snowden: " + snowden + "\n");
		if(snowden>francis) {
			return "edward snowden";
		}
		else if(francis>snowden) {
			return "pope francis";
		}
		return "TIE";
	}
}
