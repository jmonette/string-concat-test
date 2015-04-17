public class StringConcatTest {
    private static final long ITERATIONS = 10000000;
    public static void main(String[] args) {
	System.out.println("timeConcat: " + timeConcat(ITERATIONS));
	System.out.println("timeLiteralConcat: " + timeLiteralConcat(ITERATIONS));
	System.out.println("timeStringBuilder: " + timeStringBuilder(ITERATIONS));
	System.out.println("timeStringBuffer: " + timeStringBuffer(ITERATIONS));
    }

    private static long timeConcat(long iterations) {
	long start = System.currentTimeMillis();

	String a = "a";

	String b = "b";

	for (long i = 0; i < iterations; i++) {
	    String c = a.concat(b);
	}

	long end = System.currentTimeMillis();

	return end - start;
    }

    private static long timeLiteralConcat(long iterations) {
	long start = System.currentTimeMillis();

	String a = "a";

	String b = "b";

	for (long i = 0; i < iterations; i++) {
	    String c = a + b;
	}

	long end = System.currentTimeMillis();

	return end - start;
    }

    private static long timeStringBuilder(long iterations) {
	long start = System.currentTimeMillis();

	StringBuilder a = new StringBuilder("a");

	String b = "b";

	for (long i = 0; i < iterations; i++) {
	    a.append(b);
	}
	String c = a.toString();

	long end = System.currentTimeMillis();

	return end - start;
    }

    private static long timeStringBuffer(long iterations) {
	long start = System.currentTimeMillis();

	StringBuffer a = new StringBuffer("a");

	String b = "b";

	for (long i = 0; i < iterations; i++) {
	    a.append(b);
	}
	String c = a.toString();

	long end = System.currentTimeMillis();

	return end - start;
    }
}
