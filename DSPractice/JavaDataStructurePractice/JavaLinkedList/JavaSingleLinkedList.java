package JavaLinkedList;

public class JavaSingleLinkedList<T> implements JavaLinkedList<T>{
	
	private LinkedListNode<T> head;
	
	public JavaSingleLinkedList(){
		this.head = null;
	}

	@Override
	public void insertAtBegining(T data) {

		LinkedListNode<T> node = new LinkedListNode<T>();
		node.setData(data);
		node.setNextNode(head);
		this.head = node;
	}

	@Override
	public void insertAtEnd(T data) {

		LinkedListNode<T> node = new LinkedListNode<T>();
		node.setData(data);
		node.setNextNode(null);
		LinkedListNode<T> tempNode = this.head;
		while(tempNode.getNextNode() != null){
			tempNode = tempNode.getNextNode();
		}
		tempNode.setNextNode(node);
	}

	@Override
	public void insertAtPosition(T data, int position) throws InvalidPositionException {

		LinkedListNode<T> node = new LinkedListNode<T>();
		node.setData(data);
		node.setNextNode(null);
		LinkedListNode<T> temp = this.head;
		if ( position == 0){
			throw new InvalidPositionException(position + " is invalid Position.");
		}else if (position == 1){
			node.setNextNode(temp);
			this.head = node;
		} else {
			for (int i = 0; i < position-2; i++){
				if (temp.getNextNode() != null)
					temp = temp.getNextNode();
				else 
					throw new InvalidPositionException(position + " is invalid Position.");
			}
			node.setNextNode(temp.getNextNode());
			temp.setNextNode(node);
		}
	}

	@Override
	public void deleteAtBegining() {
		
		LinkedListNode<T> tempNode = this.head;
		this.head = this.head.getNextNode();
		tempNode = null;
	}

	@Override
	public void deleteAtEnd() {
		
		LinkedListNode<T> tempNode = this.head;
		while(tempNode.getNextNode().getNextNode()!=null){
			tempNode = tempNode.getNextNode();
		}
		LinkedListNode<T> tempNode2 = tempNode.getNextNode();
		tempNode.setNextNode(null);
		tempNode2 = null;
	}

	@Override
	public void deleteAtPosition(int position) throws InvalidPositionException {

		LinkedListNode<T> temp1 = this.head;
		if (position == 0 ){
			throw new InvalidPositionException(position + " is invalid.");
		} else if (position == 1){
			this.head = temp1.getNextNode();
			temp1 = null;
		} else {
			for (int i = 0; i < position-2; i++){
				if (temp1.getNextNode() != null)
					temp1 = temp1.getNextNode();
				else 
					throw new InvalidPositionException(position + " is invalid Position.");
			}
			if (temp1.getNextNode() != null){
				LinkedListNode<T> temp2 = temp1.getNextNode();
				temp1.setNextNode(temp2.getNextNode());
				temp2 = null;
			}
			else 
				throw new InvalidPositionException(position + " is invalid Position.");
		}
	}

	@Override
	public void printList() {

		LinkedListNode<T> tempNode = this.head;
		while (tempNode != null){
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.getNextNode();
		}
		System.out.println();
	}

}
