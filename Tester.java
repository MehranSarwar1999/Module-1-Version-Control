public class Tester {

        public static <E extends Value> E greaterThan(E ele1, E ele2) {
                return ele1.value() > ele2.value() ? ele1 : ele2;
        }


public static void main(String args[]) {
	MyInt m1 = new MyInt(5);
	MyInt m2 = new MyInt(8);
	
	MyInt mi = Tester.<MyInt>greaterThan(m1, m2);
	System.out.println(mi.value());
 }
			
}
 
