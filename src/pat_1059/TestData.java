package pat_1059;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub\
		ArrayList<String> list = new ArrayList<>();
		String str = "", str2 = "";
		int n, m;
		int allItemCnt = 0;
		char a[] = {'x','a','b','c','d','e'};
		while(true)
		{
			n = (int) (1+Math.random()*1000);
			if(n <= 1000) break; 
		}
		while(true)
		{
			m = (int) (1+Math.random()*100);
			if(m <= 100) break; 
		}
		m = 100;
		n = 1000;
		list.add(n +" "+ m+System.getProperty("line.separator"));
		for(int i = 0; i < m; i++)
		{
			int grade = (int)(1+Math.random()*5);
			allItemCnt = (int)(2+Math.random()*4);
			int trueItemCnt = (int)(1+Math.random()*allItemCnt);
			int cnt = 0;
			str = grade+" "+allItemCnt+" "+ trueItemCnt;
			str2 = "";
			while(cnt < trueItemCnt)
			{
				
				while(true)
				{
					int x = (int)(1+Math.random()*allItemCnt);
					if(str2.contains(String.valueOf(a[x])))
					{
						continue;
					}
					else
					{
						str2+=a[x];
						break;
					}
				}
				
				cnt++;
//				System.out.println("****************************** x  :"+x);
			}
			char[] tt = str2.toCharArray();
			Arrays.sort(tt);
			str2 = "";
			for(int k = 0; k < tt.length; k++)
			{
				str2 +=" "+tt[k]; 
			}
			str += str2;
			str += System.getProperty("line.separator");
			list.add(str);
		}
		
		for(int i = 0; i < n; i++)
		{
			str = "";
			for(int j = 0; j < m; j++)
			{
				if(j == 0) str += "(";
				else str += " (";
				
				int randNum = (int)(Math.random()*allItemCnt);
				int cnt = 0;
				str2 = ""+randNum;
				while(cnt < randNum)
				{
					while(true)
					{
						int x = (int)(1+Math.random()*allItemCnt);
						if(str2.contains(String.valueOf(a[x])))
						{
							continue;
						}
						else
						{
							str2+=a[x];
							break;
						}
					}
					cnt++;
				}
				
				char[] tt = str2.toCharArray();
				Arrays.sort(tt);
				str2 = "";
				for(int k = 0; k < tt.length; k++)
				{
					str2 +=" "+tt[k]; 
				}
				str2 = str2.trim();
				str += str2;
				str = str.trim();
				str += ")";
			}
			str += System.getProperty("line.separator");
			list.add(str);
		}
		String path = "D:\\Data.txt";
		File file = new File(path);
		
		if(!file.exists())
		{
			file.createNewFile();
			
		}
		else
		{
			file.delete();
			file.createNewFile();
		}
		FileWriter write = new FileWriter(file, true);
		
		for(int i = 0; i < list.size(); i++)
		{
			write.write(list.get(i));
		}
		write.close();
	}

	
}
