import java.util.*;

class Program {
  public static int getNthFib(int n) {
	int previous = 0;
	int current = 1;
	if(n==1) return previous;
	if(n==2) return current;
	int holder;
// 		first 2 sequences are accounted for so decrement n to keep track
	n = n-2;
	while(n != 0)
	{
		holder = current;
		current = previous + current;
		previous = holder;
		n--;
	}
    return current;
  }
}