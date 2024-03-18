package M03.W3;

import java.util.*;

public class PSG_공원_산책 {
    public static void main(String[] args) {
        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};

        System.out.println(Arrays.toString(new PSG_공원_산책().solution(park, routes)));
    }

    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();
        int[] now = {-1, -1};
        for (int i=0; i<H; i++) {
            for (int j=0; j<W; j++) {
                if (park[i].charAt(j)=='S') {
                    now[1] = j;
                    now[0] = i;
                    break;
                }
            }
            if (now[1] != -1 && now[0] != -1) {
                break;
            }
        }

        for (String r : routes) {
            String[] route = r.split(" ");
            int distance = Integer.parseInt(route[1]);
            int direction = getDirection(route[0]);

            int moveX = now[1];
            int moveY = now[0];
            for (int i=0; i<distance; i++) {
                moveX += dr[direction];
                moveY += dc[direction];
                if(0<=moveX&&moveX<W && 0<=moveY&&moveY<H && park[moveY].charAt(moveX)!='X') {
                    continue;
                } else {
                    moveX = now[1];
                    moveY = now[0];
                    break;
                }
            }
            now[1] = moveX;
            now[0] = moveY;
        }

        return now;
    }

    public static int getDirection(String route) {
        int direction = -1;
        switch(route) {
            case "W":
                direction = 0;
                break;
            case "S":
                direction = 1;
                break;
            case "E":
                direction = 2;
                break;
            case "N":
                direction = 3;
                break;
        }
        return direction;
    }
}
