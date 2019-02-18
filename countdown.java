package testing;

public class test {

	void countdownFrom(int x)
    {
		
       for (int y = x; y >= 0; y-- ){
       System.out.println(y);
    }
    }


public static void main(String[] args) {

    test run = new test();
    run.countdownFrom(999);
}
}
