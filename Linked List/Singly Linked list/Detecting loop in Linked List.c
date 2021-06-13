Naive Approach: Keeping track of visited nodes

#include<stdio.h>
#include<stdlib.h>
struct Node
{
	int data;
	struct Node* next;
};
int main()
{
	struct Node* Node1;
	struct Node* Node2;
	struct Node* Node3;
	struct Node* Node4;
	struct Node* Node5;
	
	Node1 = (struct Node*)malloc(sizeof(struct Node));
	Node2 = (struct Node*)malloc(sizeof(struct Node));
	Node3 = (struct Node*)malloc(sizeof(struct Node));
	Node4 = (struct Node*)malloc(sizeof(struct Node));
	Node5 = (struct Node*)malloc(sizeof(struct Node));
	
	Node1->data = 10;
	Node1-> next = Node2;
	
	Node2->data = 20;
	Node2-> next = Node3;
	
	Node3->data = 30;
	Node3-> next = Node2;
	
	Node4->data = 40;
	Node4-> next = Node5;
	
	Node5->data = 50;
	Node5-> next = NULL;
	
	struct Node* ptr;
	ptr = Node1;
	
	while(ptr!=NULL)
	{
      if(ptr->data == -1)
      {
        printf("Loop is found");
        break;
      }
		//printf("%d ",ptr->data);
		ptr->data = -1;
		ptr = ptr->next;
	}	
}
