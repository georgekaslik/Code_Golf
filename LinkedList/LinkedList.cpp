#include <iostream>

// Node class definition
class Node {
private:
    int data;
    Node* next;

public:
    // Constructor
    Node(int data) : data(data), next(nullptr) {}

    // Getter for data
    int getData() const {
        return data;
    }

    // Setter for data
    void setData(int data) {
        this->data = data;
    }

    // Getter for next
    Node* getNext() const {
        return next;
    }

    // Setter for next
    void setNext(Node* next) {
        this->next = next;
    }
};

// Function to print the linked list
void printList(Node* head) {
    Node* currentNode = head;
    while (currentNode != nullptr) {
        std::cout << currentNode->getData() << " -> ";
        currentNode = currentNode->getNext();
    }
    std::cout << "nullptr" << std::endl;
}

int main() {
    // Creating individual nodes
    Node* firstNode = new Node(3);
    Node* secondNode = new Node(5);
    Node* thirdNode = new Node(13);
    Node* fourthNode = new Node(2);

    // Linking nodes together
    firstNode->setNext(secondNode);
    secondNode->setNext(thirdNode);
    thirdNode->setNext(fourthNode);

    // Printing linked list
    printList(firstNode);

    // Cleanup to avoid memory leaks
    delete firstNode;
    delete secondNode;
    delete thirdNode;
    delete fourthNode;

    return 0;
}
