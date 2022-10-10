import java.util.Date;

public class StopWatch {
    Date startTime, endTime;

    private Date getStartTime() {
        return this.startTime;
    }

    private Date getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }
}