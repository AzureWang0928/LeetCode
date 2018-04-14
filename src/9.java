package LinkList;

public class PalindromeInt {
	public boolean isPalindrome(int x) {
        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) return false;
		int length = get_length(x);
		if (length <= 1)
			return true;
		int half_length = length / 2;
		int divider = (int) Math.pow(10, half_length);
		int front = x / divider;
		int back_rev = x % divider;
		if (get_length(front) != get_length(back_rev)) {
			front = front / 10;
		}
		int back = 0;
		for (int j = 0; back_rev != 0; j++) {
			int r = back_rev % 10;
			back = 10 * back + r;
			back_rev = back_rev / 10;
		}
		return front == back;
	}

	private int get_length(int num) {
		int length = 0;
		for (int i = 0; num != 0; i++) {
			num = num / 10;
			length = i + 1;
		}
		return length;
	}
	
	public static void main(String[] args) {
		PalindromeInt p = new PalindromeInt();
		p.isPalindrome(-2147447412);
	}
}
