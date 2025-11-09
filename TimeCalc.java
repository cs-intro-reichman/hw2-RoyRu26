public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minToAdd = Integer.parseInt(args[1]);
        int totalMin = (hours * 60 + minutes) + minToAdd;
        int totalHours = totalMin / 60;
        int newHours = totalHours % 24;
        int newMin = totalMin - (totalHours * 60);
        String zeroH = "";
        String zeroM = "";
        if(newHours < 10){
            zeroH = "0";
        }
        if(newMin < 10){
            zeroM = "0";
        }
        System.out.println(zeroH + newHours + ":" + zeroM +newMin);
    }
}
