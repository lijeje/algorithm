package Main;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededtoBuyTickets_2073 {

    public static void main(String[] args) {
//        int[] tickets = {5, 1, 1, 1};
//        int k = 0;

        int[] tickets = {84,49,5,24,70,77,87,8};
        int k = 3;

        TimeNeededtoBuyTickets_2073 timeNeededtoBuyTickets = new TimeNeededtoBuyTickets_2073();
        int answer = timeNeededtoBuyTickets.buyTickets(tickets, k);

        System.out.println("answer : " + answer);
    }

    public int buyTickets(int[] tickets, int k) {
        int ticketCnt = 0;
        int totCnt = 0;
        Queue<Integer> ticketQue = new LinkedList<>();

        for(int i=0; i<tickets.length;i++){
            ticketQue.offer(tickets[i]);
            if(tickets[i]<tickets[k]){
                totCnt += tickets[i];
            }else{
                totCnt +=tickets[k];
            }
        }
        totCnt -= tickets.length-k;

        for(int j=0; totCnt>=1; j++) {
            int stdKey = ticketQue.poll();
            if(stdKey > 1) {
                //뒤로 보내기
                ticketQue.offer(stdKey);
                //전체카운트증가
                ticketCnt +=1;
                totCnt -=1;
            } else {
                //전체카운트 증가, kcnt 감소
                ticketCnt +=1;
                totCnt -=1;
            }

        }
        return ticketCnt;
    }


    public int timeRequiredToBuy(int[] tickets, int k) {
        int timeTaken = 0;
        while(tickets[k] > 0) {
            for(int i = 0; i < tickets.length; i++) {
                if(tickets[i] > 0) {
                    tickets[i]--;
                    timeTaken++;
                }
                if(tickets[k] == 0)  break;
            }
        }

        return timeTaken;
    }

}