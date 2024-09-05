class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }

    // get the next node
    getNext() {
        return this.next;
    }

    // add the next node
    addNext(node) {
        this.next = node;
    }
}

function main() {
    // Creating and linking nodes together in one step
    const firstNode = new Node(3);
    firstNode.addNext(new Node(5));
    firstNode.getNext().addNext(new Node(13));
    firstNode.getNext().getNext().addNext(new Node(2));

    // Printing linked list
    let currentNode = firstNode;
    while (currentNode !== null) {
        process.stdout.write(currentNode.data + " -> ");
        currentNode = currentNode.getNext();
    }
    console.log("null");
}

main();