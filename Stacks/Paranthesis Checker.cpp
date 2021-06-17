#include<bits/stdc++.h>
using namespace std;
bool isBalanced(string str)
{
	bool flag = 1;
	int i,count =0;
	for(i=0;i<str.length();i++)
	{
		if(str[i]=='(')
		{
			count++;
		}
		else
		{
			count--;
		}
		if(count<0)
		{
			flag = 0;
			return flag;	
		}	
	}
	if(count!=0)
	{
		flag=0;	
	}
	return flag;
}
int main()
{
	string str = "()()()((()))";
	
	if(isBalanced(str))
	{
		printf("Balanced Paranthesis");
	}
	else
	{
		printf("UnBalanced Paranthesis");
	}
}
