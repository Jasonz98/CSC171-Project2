
public class Putting {
    private int power;
    private int mean;
    private int stddev;
      
    public Putting(int power, int mean, int stddev) {
    	  this.power = power;
    	  this.mean = mean;
    	  this.stddev = stddev;
    }

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMean() {
		return mean;
	}

	public void setMean(int mean) {
		this.mean = mean;
	}

	public int getStddev() {
		return stddev;
	}

	public void setStddev(int stddev) {
		this.stddev = stddev;
	}
      
      
      
}
