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
        temp->next = target->next;
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
    int iValue = 0;
    int iPosition = 0;
    int iChoice = 0;

    while (iChoice != 9)
    {
        printf("\n-----------------------------------------------\n");
        printf("1 : Insert Node at First Position\n");
        printf("2 : Insert Node at Last Position\n");
        printf("3 : Insert Node at Given Position\n");
        printf("4 : Delete node from First Position\n");
        printf("5 : Delete node from Last Position\n");
        printf("6 : Delete node from Given Position\n");
        printf("7 : Display all the nodes\n");
        printf("8 : Count the nodes\n");
        printf("-----------------------------------------------\n");
        printf("Enter Your Choice: ");
        scanf("%d", &iChoice);

        switch (iChoice)
        {
        case 1:
            printf("\nEnter the value : ");
            scanf("%d", &iValue);

            InsertFirst(&head, iValue);
            break;

        case 2:
            printf("\nEnter the value: ");
            scanf("%d", &iValue);

            InsertLast(&head, iValue);
            break;

        case 3:
            printf("\nEnter the value : ");
            scanf("%d", &iValue);
            printf("\nEnter the position: ");
            scanf("%d", &iPosition);

            InsertAtPos(&head, iValue, iPosition);
            break;

        case 4:
            DeleteFirst(&head);
            break;

        case 5:
            DeleteLast(&head);
            break;

        case 6:
            printf("\nEnter the position: ");
            scanf("%d", &iPosition);

            DeleteAtPos(&head, iPosition);

        case 7:
            printf("\nLinked list elements are : \n");
            Display(head);
            break;

        case 8:
            iRet = Count(head);
            printf("\nNumber of nodes are: %d", iRet);
            break;
        case 9:
            printf("\nThank you for using Application");
            break;

        default:
            printf("Invalid Option");
        }
    }

    return 0;
}