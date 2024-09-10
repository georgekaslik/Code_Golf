#include <iostream>
using namespace std;

// Structure for a node in the linked list
struct Node {
    int data;
    Node* next;

    // Constructor for creating a new node
    Node(int value) : data(value), next(NULL) {}

    // Getter for the next node
    Node* getNext() {
        return next;
    }

    // Setter for the next node
    void setNext(Node* nextNode) {
        next = nextNode;
    }
};

// Linked list class
class LinkedList {
    Node* head;

public:
    LinkedList() : head(NULL) {}

    // Insert a new node at the beginning of the list
    void insertAtBeginning(int value) {
        Node* newNode = new Node(value);
        newNode->setNext(head);
        head = newNode;
    }

    // Insert a new node at the end of the list
    void insertAtEnd(int value) {
        Node* newNode = new Node(value);
        if (!head) {
            head = newNode;
            return;
        }

        Node* temp = head;
        while (temp->getNext()) {
            temp = temp->getNext();
        }
        temp->setNext(newNode);
    }

    // Delete the first node of the list
    void deleteFromBeginning() {
        if (!head) return;
        Node* temp = head;
        head = head->getNext();
        delete temp;
    }

    // Delete the last node of the list
    void deleteFromEnd() {
        if (!head) return;
        if (!head->getNext()) {
            delete head;
            head = NULL;
            return;
        }

        Node* temp = head;
        while (temp->getNext()->getNext()) {
            temp = temp->getNext();
        }
        delete temp->getNext();
        temp->setNext(NULL);
    }

    // Display the nodes of the linked list
    void display() {
        Node* temp = head;
        while (temp) {
            cout << temp->data << " -> ";
            temp = temp->getNext();
        }
        cout << "NULL" << endl;
    }
};

int main() {
    LinkedList list1;

    list1.insertAtEnd(10);
    list1.insertAtEnd(20);
    list1.insertAtBeginning(5);

    cout << "Linked list after insertions: ";
    list1.display();

    list1.deleteFromBeginning();
    cout << "Linked list after deleting from beginning: ";
    list1.display();

    list1.deleteFromEnd();
    cout << "Linked list after deleting from end: ";
    list1.display();

    return 0;
}
