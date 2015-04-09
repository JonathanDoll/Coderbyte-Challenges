package EasyJava;

/**
 * @author Jonathan Doll
 */
/**
 * Have the function CountingMinutesI(str) take the str parameter being passed
 * which will be two times (each properly formatted with a colon and am or pm)
 * separated by a hyphen and return the total number of minutes between the two
 * times. The time will be in a 12 hour clock format. For example: if str is
 * 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the
 * output should be 1320.
 */
public class CountingMinutesI {

    int CountingMinutesI(String str) {
        String fTime = str.split("-")[0];
        String lTime = str.split("-")[1];
        int fHours = Integer.parseInt(fTime.split(":")[0]);
        int lHours = Integer.parseInt(lTime.split(":")[0]);
        int fMin = Integer.parseInt(fTime.substring(fTime.length()-4, fTime.length()-2));
        int lMin = Integer.parseInt(lTime.substring(lTime.length()-4, lTime.length()-2));
        
        if(fTime.contains("p") && fHours != 12){
            fHours += 12;
        }else if(fTime.contains("a") && fHours == 12){
            fHours -= 12;
        }
        if(lTime.contains("p") && lHours != 12){
            lHours += 12;
        }else if(lTime.contains("a") && lHours == 12){
            lHours -= 12;
        }
        
        int tMin = lMin - fMin;
        int tH = lHours - fHours;
        int total = (tH * 60) + tMin;
        if(total < 0){
            total += (24 * 60);
        }
        return total;
    }

}
