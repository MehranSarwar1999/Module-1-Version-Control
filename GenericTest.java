public class GenericTest {

public static void main(String[] args) {

// Create an integer array

Integer intArray[] = new Integer[] { 2, 4, 6, 8 };

// Call generic function to get index position

System.out.println("Value " + 6 + " placed at index " + getPosition(intArray, 4, 6));

// Call greater than function to get greater value

System.out.println("Greater number in (10,5) is " + (greaterThan(10, 5)));

}

public static <E> int getPosition(E[] arr, int len, E ele){

int pos = -1;

for(int i=0; i<len; i++){

if(arr[i].equals(ele)){

pos = i;

}

}

return pos;

}

public static <E extends Comparable<E>> E greaterThan(E ele1, E ele2){

return ele1.compareTo(ele2)>0?ele1:ele2;

}

}



