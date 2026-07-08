////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////
#include <stdio.h>
#include <stdlib.h>

////////////////////////////////////////////////////////////
//
//  Node structure of singly linked list
//  Members: int, struct node *
//
////////////////////////////////////////////////////////////
struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

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
    while (first != NULL)
    {
        printf("%d -> ", first->data);
        first = first->next;
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
    while (first != NULL)
    {
        iCount++;
        first = first->next;
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

    newn->data = iNo;
    newn->next = NULL;

    if (*first == NULL) // LL is empty
    {
        *first = newn;
    }
    else // LL contais at least one node
    {
        newn->next = *first;
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

    newn->data = iNo;
    newn->next = NULL;

    if (*first == NULL) // LL is empty
    {
        *first = newn;
    }
    else // LL contais at least one node
    {
        temp = *first;

        while (temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newn;
    }
}

////////////////////////////////////////////////////////////
//
//    Function name :  InsertAtPos
//    Input         :  PPNODE, int, int
//    Output        :  void
//    Description   :  Insert the Node at the user input position
//
////////////////////////////////////////////////////////////
void InsertAtPos(PPNODE first, int iNo, int iPos)
{
    int i = 0;
    int iCount = 0;

    PNODE newn = NULL;
    PNODE temp = NULL;

    iCount = Count(*first);

    if ((iPos < 1) || (iPos > (iCount + 1)))
    {
        printf("Invalid Position");
        return;
    }

    if (iPos == 1)
    {
        InsertFirst(first, iNo);
    }
    else if (iPos == (iCount + 1))
    {
        InsertLast(first, iNo);
    }
    else
    {
        temp = *first;

        newn = (PNODE)malloc(sizeof(NODE));
        newn->data = iNo;
        newn->next = NULL;

        for (i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next = newn;
    }
}

////////////////////////////////////////////////////////////
//
//    Function name :  DeleteFirst
//    Input         :  PPNODE
//    Output        :  void
//    Description   :  Delete the first Node from the linked list
//
////////////////////////////////////////////////////////////
void DeleteFirst(PPNODE first)
{
    PNODE temp;

    if (*first == NULL)
    {
        return;
    }
    else if (((*first)->next) == NULL)
    {
        free(*first);
        *first = NULL;
    }
    else
    {
        temp = *first;

        *first = temp->next;
        free(temp);
    }
}

////////////////////////////////////////////////////////////
//
//    Function name :  DeleteLast
//    Input         :  PPNODE
//    Output        :  void
//    Description   :  Delete the last Node from the linked list
//
////////////////////////////////////////////////////////////
void DeleteLast(PPNODE first)
{
    PNODE temp;

    if (*first == NULL)
    {
        return;
    }
    else if (((*first)->next) == NULL)
    {
        free(*first);
        *first = NULL;
    }
    else
    {
        temp = *first;

        while (temp->next->next != NULL)
        {
            temp = temp->next;
        }

        free(temp->next);
        temp->next = NULL;
    }
}


////////////////////////////////////////////////////////////
//
//    Function name :  DeleteAtPos
//    Input         :  PPNODE, int
//    Output        :  void
//    Description   :  Delete the Node from the user input position
//
////////////////////////////////////////////////////////////
void DeleteAtPos(PPNODE first, int iPos)
{
    int i = 0;
    int iCount = 0;

    PNODE temp = NULL;
    PNODE target = NULL;

    iCount = Count(*first);

    if ((iPos < 1) || (iPos > iCount))
    {
        printf("Invalid Position");
        return;
    }

    if (iPos == 1)
    {
        DeleteFirst(first);
    }
    else if (iPos == iCount)
    {
        DeleteLast(first);
    }
    else
    {
        temp = *first;

        for (i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;
        }

        target = temp->next;
        temp->next = target -> next;
        free(target);
    }
}

////////////////////////////////////////////////////////////
//
//  Application to perform Operations on Singly Linked List
//
////////////////////////////////////////////////////////////
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

    InsertAtPos(&head, 99, 4);

    Display(head);
    iRet = Count(head);
    printf("Number of nodes in the linked list : %d\n\n", iRet);

    DeleteFirst(&head);

    Display(head);
    iRet = Count(head);
    printf("Number of nodes in the linked list : %d\n\n", iRet);

    DeleteLast(&head);

    Display(head);
    iRet = Count(head);
    printf("Number of nodes in the linked list : %d\n\n", iRet);

    DeleteAtPos(&head,3);

    Display(head);
    iRet = Count(head);
    printf("Number of nodes in the linked list : %d\n\n", iRet);

    return 0;
}