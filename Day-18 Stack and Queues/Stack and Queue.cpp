//
// Created by mustafa on 8/7/22.
//

#include <iostream>

using namespace std;

char S[10];
char Q[10];
int front = 0;
int back = -1;
int top=-1;
class Solution {

public:
//Write your code here
static void pushCharacter(char x)
{
    top++;
    S[top] = x;
}

static void enqueueCharacter(char &i)
{
    back++;
    Q[back] = i;
}

    static char popCharacter() {
        return S[top];
        top++;
    }

    static char dequeueCharacter() {
        return Q[front];
        front++;
    }
};

int main() {
    // read the string s.
    string s;
    getline(cin, s);

    // create the Solution class object p.
    Solution obj;

    // push/enqueue all the characters of string s to stack.
    for (int i = 0; i < s.length(); i++) {
        obj.pushCharacter(s[i]);
        obj.enqueueCharacter(s[i]);
    }

    bool isPalindrome = true;

    // pop the top character from stack.
    // dequeue the first character from queue.
    // compare both the characters.
    for (int i = 0; i < s.length() / 2; i++) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
            isPalindrome = false;

            break;
        }
    }

    // finally print whether string s is palindrome or not.
    if (isPalindrome) {
        cout << "The word, " << s << ", is a palindrome.";
    } else {
        cout << "The word, " << s << ", is not a palindrome.";
    }

    return 0;
}