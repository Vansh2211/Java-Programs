#include<iostream>
using namespace std;

class Node{
   public:
   int data;
   Node* next;
};

void printList(Node* n){
   while (n!=NULL)
   {
      cout<<n->data<<"  ";
      n = n->next;
   }
   
}

int main(){
   Node* head = NULL;
   Node* second = NULL;
   Node* third = NULL;
   Node* fourth = NULL;

   head = new Node();
   second = new Node();
   third = new Node();
   fourth = new Node();

//first node
  head->data = 1;
  head->next = second;

  //second node
  second->data=2;
  second->next=third;

  //third node
  third->data=3;
  third->next=fourth;
  
  //fourth node
  fourth->data=774;
  fourth->next=NULL;
  
  

  //function call

  printList(head);

  return 0;
}