class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

    def setNext(self, next_node):
        self.next = next_node

    def getNext(self):
        return self.next

# Creating nodes
node1 = Node(3)
node2 = Node(5)
node3 = Node(13)
node4 = Node(2)

# Linking nodes using setNext()
node1.setNext(node2)
node2.setNext(node3)
node3.setNext(node4)

# Traversing the linked list and printing data
currentNode = node1
while currentNode:
    print(currentNode.data, end=" -> ")
    currentNode = currentNode.getNext()
print("null")
