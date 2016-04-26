import java.util.ArrayList;

public class DotComTestDriveMiss {

    public static void main (String[] args) {

        DotCom dot = new DotCom();

        ArrayList<String> locations = new ArrayList<String>();

        String[] locs = {"2","3","4"};

        for(int x = 0; x < 3; x++) {

            locations.add(locs[x]);

        }

        dot.setLocationCells(locations);

        String userGuess = "1";

        String result = dot.checkYourself(userGuess);

        String testResult = "Failed";

        if (result.equals("Miss") ) {

            testResult = "Passed";

        }

        System.out.println(result);

        System.out.println(testResult);

    }

}
