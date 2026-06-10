package JavaInterviewQ;

import java.util.Arrays;
import java.util.Arrays;
public class MinimumNumberOfRoom18 {

        public static int minMeetingRooms(int[][] meetings) {
            int n = meetings.length;

            int[] start = new int[n];
            int[] end = new int[n];

            for (int i = 0; i < n; i++) {
                start[i] = meetings[i][0];
                end[i] = meetings[i][1];
            }

            Arrays.sort(start);
            Arrays.sort(end);

            int rooms = 0;
            int maxRooms = 0;
            int s = 0, e = 0;

            while (s < n) {
                if (start[s] < end[e]) {
                    rooms++;
                    maxRooms = Math.max(maxRooms, rooms);
                    s++;
                } else {
                    rooms--;
                    e++;
                }
            }

            return maxRooms;
        }

        public static void main(String[] args) {
            int[][] meetings = {
                    {3, 5},
                    {2, 10},
                    {7, 9},
                    {2, 6},
                    {1, 4}
            };

            System.out.println(minMeetingRooms(meetings));
        }
    }

