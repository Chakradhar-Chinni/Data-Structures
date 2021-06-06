#include<stdio.h>
#include<stdlib.h>

struct node
{    
	int data;
	struct node* link;
};

int main()
{
  struct node* root = NULL;
	struct node* temp;
	struct node* node1;
	struct node* node2;
	struct node* node3;
	 
	temp  = (struct node*)malloc(sizeof(struct node));
	root = temp;
  
	node1 = (struct node*)malloc(sizeof(struct node));
	node2 = (struct node*)malloc(sizeof(struct node));
	node3 = (struct node*)malloc(sizeof(struct node));
  
	root->data = 100;
	root->link = node1;
	
	node1->data = 10;
	node1->link = node2;
	
	node2->data = 20;
	node2->link = node3;
	
	node3->data = 30;
	node3->link = NULL;
	
	if(root==NULL)
	{
		printf("List is empty");
	}
	else
	{
		while(root!=NULL)
		{
			printf("%d\t",root->data);
			root = root->link;
		}
	}
}
