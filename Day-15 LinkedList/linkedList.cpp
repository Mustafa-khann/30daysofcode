#include <iostream>
#include <cstddef>
using namespace std;
class Node
{
public:
    int data;
    Node *next;
    explicit Node(int d){
        data=d;
        next= nullptr;
    }
};
class Solution{
public:

    Node* insert(Node *head,int data)
    {
        if(head == nullptr)
        {
            return new Node(data);
        }
        else if(head->next == nullptr )
        {
            head->next = new Node(data);
        }
        else
        {
            insert(head->next, data);
        }
        return head;
    }

    static void display(Node *head)
    {
        Node *start=head;
        while(start)
        {
            cout<<start->data<<" ";
            start=start->next;
        }
    }
};
int main()
{
    Node* head= nullptr;
    Solution mylist;
    int T,data;
    cin>>T;
    while(T-->0){
        cin>>data;
        head=mylist.insert(head,data);
    }
    mylist.display(head);

}