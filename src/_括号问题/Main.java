package _¿®∫≈Œ Ã‚;

import java.util.Stack;

public class Main {
	
	public static boolean isGoodBracket(String s)
	{
		Stack<Character> a = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(c=='(') a.push(')');
			if(c=='[') a.push(']');
			if(c=='{') a.push('}');
			
			if(c==')' || c==']' || c=='}')
			{
				if(a.isEmpty()) return false;    // ÃÓø’
				if(a.pop() != c) return false;
			}
		}
		
		if(!a.isEmpty()) return false;  // ÃÓø’
		
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println( isGoodBracket("...(..[.)..].{.(..).}..."));
		System.out.println( isGoodBracket("...(..[...].(.).){.(..).}..."));
		System.out.println( isGoodBracket(".....[...].(.).){.(..).}..."));
		System.out.println( isGoodBracket("...(..[...].(.).){.(..)...."));
	}
	
}
