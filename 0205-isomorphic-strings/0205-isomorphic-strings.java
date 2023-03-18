import java.util.*;

public class Solution
{
	public final boolean isIsomorphic(String s, String t)
	{
		 HashMap<Character, Character> mp = new HashMap<Character, Character>();
		 HashMap<Character, Character> mp2 = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); ++i)
		{
			if (mp.get(s.charAt(i)) != null && mp.get(s.charAt(i)) != t.charAt(i))
			{
				return false;
			}
			if (mp2.get(t.charAt(i)) != null && mp2.get(t.charAt(i)) != s.charAt(i))
			{
				return false;
			}
			mp.put(s.charAt(i), t.charAt(i));
			mp2.put(t.charAt(i), s.charAt(i));
		}
		return true;
	}
}
