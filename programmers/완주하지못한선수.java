package Main.programmers;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 완주하지못한선수 {

    public static void main(String []args){
        완주하지못한선수 notFinishedParticipant = new 완주하지못한선수();
        String [] participant = {
                "leo", "kiki", "eden"
        };

        String[] completion = {
                "kiki", "eden"
        };

        String answer = notFinishedParticipant.solution(participant,completion);
        System.out.println(answer);

    }


    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //create
        HashMap<String, Boolean> completionMap = new HashMap<>();
        for(int i=0; i<completion.length;i++){
            completionMap.put(completion[i],true);
        }

        //find
        for(int j=0; j<participant.length;j++){
            boolean result = completionMap.getOrDefault(participant[j],false);
            if(result == false){
                answer = participant[j];
                return answer;
            } else {
                completionMap.remove(participant[j]);
            }
        }


        return answer;
    }

}
