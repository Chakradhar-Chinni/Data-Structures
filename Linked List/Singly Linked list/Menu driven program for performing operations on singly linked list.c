#include<stdio.h>
#include<stdlib.h>
void create();
void display();
void insert_begin();
void insert_end();
void delete_begin();
void delete_end();
void delete_pos();
struct node
{
	int data;
	struct node* link;
};
struct node* start = NULL;
int main()
{
	int choice;
		
	while(1)
	{
		printf("\n *****MENU*****      \n");
                printf("\n 1.Create");
                printf("\n 2.Display");
                printf("\n 3.Insert at beginning");
                printf("\n 4.Insert at end");
                printf("\n 5.Insert at specified position");
                printf("\n 6.Delete from beginning");
                printf("\n 7.Delete from the end");
                printf("\n 8.Delete from specified position");
                printf("\n 9.Exit");
                printf("\n--------------------------------\n");
                printf("Enter your choice:\t");
                scanf("%d",&choice);
                switch(choice)
                {
                		case 1:create();
                               break;
                        case 2:display();
                               break;   
                        case 3:insert_begin();
                               break;
                        case 4:insert_end();
                               break;
                        case 6:delete_begin();
                               break;
                        case 7:delete_end();
                               break;    
                        case 8:delete_pos();
                               break;
                    /*    case 5:insert_pos();
                               break;*/
                        
                        case 9:exit(0);
                               break;
                             
                        default:printf("n Wrong Choice:n");
                                break;
				}
	}

}
void create()
{
	struct node* temp;
	temp = (struct node*)malloc(sizeof(struct node));
	printf("Enter node data");
	scanf("%d",&temp->data);
	temp->link = NULL;
	if(start == NULL)
	{
		start = temp;
	}
	else
	{
		struct node* ptr;
		ptr = start;
		while(ptr->link != NULL)
		{
			ptr = ptr->link;
		}
		ptr->link = temp;
	}
}

void display()
{
	if(start==NULL)
	{
		printf("\n*****List is empty*****\n");
	} 
	else
	{
		struct node* p;
		p = start;
		printf("\n-----DATA-----\n");
		while(p != NULL)
		{
			printf("%d ",p->data);
			p = p ->link;
		}
		printf("\n-----DATA-----");
	}
}
void insert_begin()
{	
	struct node* temp;            
	temp = (struct node*)malloc(sizeof(struct node));
	printf("Insert Node data\t");
	scanf("%d",&temp->data);
	if(start==NULL)
	{
		start = temp;	
		temp->link = NULL;
	}
	else
	{
		struct node* p;
		p = start;
		temp->link = p;
		start = temp;	
	}
}
void insert_end() 
{
	struct node* temp;
	temp = (struct node*)malloc(sizeof(struct node));
	printf("Enter node value");
	scanf("%d",&temp->data);
	temp->link = NULL;
	if(start == NULL)
	{
		start = temp;
	}
	else
	{
		struct node* ptr;
		ptr = start;
		while(ptr->link!=NULL)
		{
			ptr = ptr->link;
		}
		ptr->link = temp;
	}
}
void delete_begin()
{
	if(start == NULL)
	{
		printf("\nList is empty");
	}
	else
	{
		struct node* p;
		p = start->link;
		start = p;
		printf("\nBeginning node is deleted");
	}
}
void delete_end()
{
	struct node* ptr;
	if(start == NULL)
	{
		printf("List is empty");
	}
	else if(start->link == NULL) // if 1 node is only present
	{
		ptr = start;
		start = NULL;
		free(ptr);
	}
	else
	{
		struct node* temp;
		ptr = start;
		while(ptr->link != NULL)
		{
			temp = ptr;
			ptr = ptr-> link;
		}
		temp->link = NULL;
		free(ptr);
	}
}
void delete_pos()
{
	int pos,i;
	printf("Enter node's position to delete");
	scanf("%d",&pos);
	struct node* ptr;	
	if(start==NULL)
	{
		printf("List is empty");
	}
	else if(pos == 0)
	{
		ptr = start;
		start=ptr->link;
		free(ptr);
	}
	else
	{
		struct node* temp;
		ptr = start; 
		
		for(i=0,ptr=start;i<pos;i++)
		{
			temp = ptr;
			ptr = ptr->link;
		}
		temp->link = ptr->link;
		free(ptr);		
	}
}
