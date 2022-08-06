//
// Created by mustafa on 8/6/22.
//

#include <iostream>
using namespace std;

class Node{
public:
    int value;
    Node *next;
};

int main()
{
    Node* head = new Node();
    Node* first = new Node();
    Node* second = new Node();
    Node* third = new Node();

    head->next = first;
    first->value= 25;
    first->next = second;
    second->value = 5;
    second->next = third;
    third->value = 30;
    third->next = nullptr;

    Node* current = head;
    while(current->next)
    {
        cout<<current->value<<"\n";
        current = current->next;
    }
    return 0;
}
