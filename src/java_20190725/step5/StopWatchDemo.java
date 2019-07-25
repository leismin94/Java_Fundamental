package java_20190725.step5;

public class StopWatchDemo {
	public static void execute(StopMilliWatch sm) {
		sm.execute();
	}

	public static void execute(StopNanoWatch sn) {
		sn.execute();
	}

	public static void main(String[] args) {
		StopNanoWatch s1 = new StopNanoWatch();
		execute(s1);

		StopMilliWatch s2 = new StopMilliWatch();
		execute(s2);

	}
}
