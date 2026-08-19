#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

////////////////////////////////////////////////////////////
//
//    Function name :  Display
//    Input         :  PNODE
//    Output        :  void
//    Description   :  Display the Nodes of Linked List
//
////////////////////////////////////////////////////////////
void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("%d -> ", first -> data);
        first = first -> next;
    }
    printf("NULL\n");
}

////////////////////////////////////////////////////////////
//
//    Function name :  Count
//    Input         :  PNODE
//    Output        :  int
//    Description   :  Count and return the Number of Nodes in the linked list 
//
////////////////////////////////////////////////////////////
int Count(PNODE first)
{
    int iCount = 0;
    while(first != NULL)
    {
        iCount++;
        first = first -> next;
    }
    return iCount;
}


////////////////////////////////////////////////////////////
//
//    Function name :  InsertFirst
//    Input         :  PPNODE, int
//    Output        :  void
//    Description   :  Insert the Node at first position in the Linked List
//
////////////////////////////////////////////////////////////
void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = iNo;
    newn -> next = NULL;

    if(*first == NULL)  // LL is empty
    {
        *first = newn;
    }
    else                // LL contais at least one node
    {
        newn -> next = *first;
        *first = newn;
    }
}


////////////////////////////////////////////////////////////
//
//    Function name :  InsertLast
//    Input         :  PPNODE, int
//    Output        :  void
//    Description   :  Insert the Node at the last position in the Linked List
//
////////////////////////////////////////////////////////////
void InsertLast(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = iNo;
    newn -> next = NULL;

    if(*first == NULL)  // LL is empty
    {
        *first = newn;
    }
    else                // LL contais at least one node
    {
        temp = *first;

        while(temp -> next != NULL)
        {
            temp = temp -> next;
        }

        temp -> next = newn;
    }
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head, 101);
    InsertFirst(&head, 51);
    InsertFirst(&head, 21);
    InsertFirst(&head, 11);

    Display(head);
    iRet = Count(head);
    printf("Number of nodes in the linked list : %d\n\n", iRet);

    InsertLast(&head, 111);
    
    Display(head);
    iRet = Count(head);
    printf("Number of nodes in the linked list : %d\n\n", iRet);

    return 0;
}