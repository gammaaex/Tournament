import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by admin on 2016/10/09.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        SoundPlayer sp = new SoundPlayer("nc85014.wav");
        sp.play();
        try {
            Thread.sleep(6500);
        } catch (InterruptedException e) {
        }

        ArrayList<Integer> memberList = new ArrayList<Integer>();

        Integer figure = Integer.parseInt(args[0]);

        Runtime r = Runtime.getRuntime();

        for (Integer i = 1; i <= figure; i++) {
            memberList.add(i);
        }

        Collections.shuffle(memberList);
        Integer j = 1;
        Integer last = memberList.size();

        for (Integer i : memberList) {
            if (j % 2 != 0) {
                System.out.println();
            } else {
                System.out.printf(" vs ");
                r.exec("say vs");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
            }
            r.exec("say " + i);
            System.out.print(i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
	    if(j % 2 != 0){
		if (j == last) {
		    System.out.printf(" ←seed!");
		    r.exec("say このひとseed!");
		    try {
			Thread.sleep(1500);
		    } catch (InterruptedException e) {
		    }
		}
            }

            j++;
        }

        System.out.println();
        System.out.println();
        System.exit(0);
    }
}
