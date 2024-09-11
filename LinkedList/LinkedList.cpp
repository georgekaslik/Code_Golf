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
    Node firstNode = Node(3);
    Node secondNode = Node(5);
    Node thirdNode = Node(13);
    Node fourthNode = Node(2);

    // Linking nodes together
    firstNode.setNext(&secondNode);
    firstNode.getNext()->setNext(&thirdNode);
    firstNode.getNext()->getNext()->setNext(&fourthNode);

    // Printing linked list
    Node* node = &firstNode;
    while(node != nullptr)
    {
        std::cout << node->getData();
        node = node->getNext();
    }

    return 0;
}
