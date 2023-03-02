public class Timer {
    private int seconds;
    private int hundredthsOfSeconds;
    
    public Timer(){

    }
    
    public void advance(){
        this.hundredthsOfSeconds += 1;
        if (this.hundredthsOfSeconds == 100){
            this.seconds += 1;
            this.hundredthsOfSeconds = 0;
        }
        if (this.seconds == 60){
            this.seconds = 0;
        }
    }
    
    @Override
    public String toString(){
        if (this.seconds > 9 && this.hundredthsOfSeconds < 10){
            return + this.seconds + ":" + "0" + this.hundredthsOfSeconds;
        }
        if (this.seconds < 10 && this.hundredthsOfSeconds < 10){
            return "0" + this.seconds +  ":" + "0" + this.hundredthsOfSeconds;
        } else if (this.seconds < 10) {
            return "0" + this.seconds + ":"  + this.hundredthsOfSeconds;
        }
        return this.seconds + ":" + this.hundredthsOfSeconds;
    }
}
