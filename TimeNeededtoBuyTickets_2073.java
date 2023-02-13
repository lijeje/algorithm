package Main;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededtoBuyTickets_2073 {

    public static void main(String[] args) {
        int[] tickets = {5, 1, 1, 1};
        int k = 0;

        TimeNeededtoBuyTickets_2073 timeNeededtoBuyTickets = new TimeNeededtoBuyTickets_2073();
        int answer = timeNeededtoBuyTickets.buyTickets(tickets, k);

        System.out.println("answer : " + answer);
    }

    public int buyTickets(int[] tickets, int k) {
        int ticketCnt = 0;
        int kcnt = tickets[k];

        Queue<Integer> ticketQue = new LinkedList<>();

        for(int i=0; kcnt==1; i++) {
            int stdKey = tickets[i];
            if(stdKey > 1) {
                //뒤로 보내기
                //전체카운트증가
            } else {
                //전체카운트 증가
            }
        }
        // 큐길이체크
        System.out.println(ticketQue);



        return ticketCnt;
    }
}