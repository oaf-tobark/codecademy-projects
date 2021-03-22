public class Magic {
	public static void main(String[] args) {
    int myNumber = 1;
    // can be any number
    int magicNumber = myNumber * myNumber;
    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;
    System.out.print(magicNumber);
	}
}
