import java.lang.*;

class Watch {
    private double startTime, endTime;

    public Watch() {

        startTime= System.currentTimeMillis();
    }

    private double getStartTime() {
        return startTime;
    }

    private void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    private double getEndTime() {
        return endTime;
    }

    private void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public double start(){
        return this.startTime= System.currentTimeMillis();
    }

    public double stop(){
        return  this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return (this.endTime-this.startTime);
    }
}

public class StopWatch{
    public static void main(String[] args) {
        Watch watch = new Watch();
        double[] array = new double[100000];
        for(int i=0;i<100000;i++){
            array[i]= Math.random()*100000;
        }
        double min = array[0];
        watch.start();
        for(int i=1;i<100000;i++){
            if(min>array[i])
                min=array[i];
        }
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}
