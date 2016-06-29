package JavaLinkedList;

public interface JavaLinkedList<T> {

	public void insertAtBegining(T data);
	
	public void insertAtEnd(T data);
	
	public void insertAtPosition(T data, int position) throws InvalidPositionException;
	
	public void deleteAtBegining();
	
	public void deleteAtEnd();
	
	public void deleteAtPosition(int position) throws InvalidPositionException;
	
	public void printList();
}
