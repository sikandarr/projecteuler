package solutions;

public class Solution182
{
	public static void main(String[] args)
	{
		long p = 1009, q = 3643, phi = (p - 1) * (q - 1), sum = 0;
		for (long e = 3; e <= phi; e += 4)
			if (e % 3 != 0 && gcd(e - 1, phi) == 2 && gcd(e, phi) == 1)
				sum += e;
		System.out.println(sum);
	}

	static long gcd(long a, long b)
	{
		return b == 0 ? a : gcd(b, a % b);
	}
}
