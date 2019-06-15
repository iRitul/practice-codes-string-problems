class Prime{
	public static void main(String args[]){
	int count = 0;
	int num = 2;
	while(count != 100) {
		boolean prime = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}

		}
    if (prime) {
        count++;
        System.out.println(num);
    }
    num++;
}
}
}