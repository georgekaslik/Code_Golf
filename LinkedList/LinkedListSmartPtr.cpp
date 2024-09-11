#include <memory>
#include <iostream>

class node {
private:
    int data;
    std::shared_ptr<node> nextNode;

public:
    node(int data) : data(data), nextNode(nullptr) {}

    int getData() { return data; }

    void setNext(std::shared_ptr<node> n) { nextNode = n; }

    void insert(int d) {
        std::shared_ptr<node> n = std::make_shared<node>(d);
        nextNode = n;
    }

    std::shared_ptr<node> getNext() { return nextNode; }
};

int main() {
    std::shared_ptr<node> firstNode = std::make_shared<node>(10);
    firstNode->insert(20);
    firstNode->getNext()->insert(50);

    std::shared_ptr<node> next = firstNode;
    while (next != nullptr) {
        std::cout << next->getData() << std::endl;
        next = next->getNext();
    }
}