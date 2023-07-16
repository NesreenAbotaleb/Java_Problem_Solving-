package CH02;

import javax.swing.*;

public class EX02_25_GUI {
    public static void main(String[] args) {
        long totalMiliSeconds = System.currentTimeMillis();
        
        String s = JOptionPane.showInputDialog(null, "Enter the time "
                + "zone offset to GMT");
        
        int GMT = Integer.parseInt(s);
        long currentMiliSeconds = GMT * 60 * 60 * 1000;
        long currentTotalMiliSecods = currentMiliSeconds + totalMiliSeconds;

        if (currentTotalMiliSecods < 0) {
            currentTotalMiliSecods = totalMiliSeconds - currentMiliSeconds;
        }

        long totalSeconds = currentTotalMiliSecods / 1000;
        int currentSecond = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        int currentMinutes = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        int currentHour = (int) (totalHours % 24);
        
        
        JOptionPane.showMessageDialog(null, "The current time is " + currentHour + " : " + 
               currentMinutes + " : " + currentSecond);
    }
}
