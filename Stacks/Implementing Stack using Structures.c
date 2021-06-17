#include<stdio.h>
#include<stdlib.h>
struct Stack
{
	int top;
	int maxSize;
	int* array;
};

struct Stack* create(int max)
{
	struct Stack* stack = (struct Stack*)malloc(sizeof(struct Stack));
	stack->top = -1;
	stack->maxSize = max;
	stack->array = (int*)malloc(stack->maxSize* sizeof(int));
	
	return stack;
}
int isfull(struct Stack* stack)
{
	if(stack->top == stack->maxSize-1)
	{
		return 1;
	}
	return 0;
}
int isempty(struct Stack* stack)
{
	if(stack->top == -1)
	{
		return 1;
	}
	return 0;
}
void pop(struct Stack* stack)
{
	if(isempty(stack))
	{
		printf("\nUNDER FLOW\n");
		return;
	}
	stack->array[stack->top--];
}

void push(struct Stack* stack, int element)
{
	if(isfull(stack))
	{
		printf("\nOVER FLOW\n");
		return;
	}
	stack->top++;
	stack->array[stack->top] = element;
}

int peek(struct Stack* stack)
{
	if(isempty(stack))
	{
		printf("UNDER FLOW");
		return 0;
	}
	printf("%d\n",stack->array[stack->top]);
}
void display(struct Stack* stack)
{
	if(isempty(stack))
	{
		printf("\nUNDER FLOW\n");
		return;
	}
	struct Stack* temp_stack = stack;
	int temp_top = stack->top;
	while(temp_top != -1)
	{
		printf("%d ",peek(stack));
		temp_top--;
	}
}
int main()
{
	struct Stack* stack = create(10);
	int element;
	while(1)
	{
		int choice; 
		printf("\n 1.Push\n 2.Pop\n 3.Peek\n 4.Display the Stack\n 5.Exit\n");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1: printf("Enter Stack Value");
					scanf("%d",&element);
					push(stack,element);
					break;
			case 2: pop(stack);
					break;
			case 3: peek(stack);
					break;
			case 4: display(stack);
					break;	
			case 5: exit(0);
					break;
	  	}
	}
}
