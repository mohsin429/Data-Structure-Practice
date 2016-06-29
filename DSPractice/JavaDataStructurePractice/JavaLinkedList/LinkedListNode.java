package JavaLinkedList;

public class LinkedListNode<T> {

	protected T data;
	protected LinkedListNode<T> nextNode;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public LinkedListNode<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(LinkedListNode<T> nextNode) {
		this.nextNode = nextNode;
	}
}
