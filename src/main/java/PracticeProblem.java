public class PracticeProblem {

	public static void main(String args[]) {

	}
    public static int findSmallest(int a, int b, int c) {
		int temp = Math.min(a, b);
        return Math.min(temp, c);
    }

    public static boolean isLeapYear(int year) {

		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0) {
					return true;
                } else {

					return false;
                }
            } else {
				return true;
            }
        } else {
			
			return false;
        }
    }
}
