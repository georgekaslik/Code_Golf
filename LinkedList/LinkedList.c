#include <stdio.h>
#include <stdlib.h>

// Define the Node structure
typedef struct Node {
    int data;
    struct Node* next;
} Node;

// Function to create a new node with given data
Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to get the next node
Node* getNext(Node* node) {
    return node->next;
}

// Function to add the next node
void addNext(Node* node, Node* nextNode) {
    node->next = nextNode;
}

void printList(Node* head) {
    Node* currentNode = head;
    while (currentNode != NULL) {
        printf("%d -> ", currentNode->data);
        currentNode = getNext(currentNode);
    }
    printf("null\n");
}

int main() {
    // Creating and linking nodes together in one step
    Node* firstNode = createNode(3);
    addNext(firstNode, createNode(5));
    addNext(getNext(firstNode), createNode(13));
    addNext(getNext(getNext(firstNode)), createNode(2));

    // Printing linked list
    printList(firstNode);

    // Free allocated memory
    Node* currentNode = firstNode;
    while (currentNode != NULL) {
        Node* nextNode = getNext(currentNode);
        free(currentNode);
        currentNode = nextNode;
    }

    return 0;
}