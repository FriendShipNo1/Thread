package idpc.cn;

/**
 * @author FriendShipNo1
 *
 */
public class Test {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {

			A a = new A();
			Thread ta = new Thread(a);
			ta.start();
			ta.join();

			B b = new B();
			Thread tb = new Thread(b);
			tb.start();
			tb.join();

			C c = new C();
			Thread tc = new Thread(c);
			tc.start();
			tc.join();
		}
	}
}
