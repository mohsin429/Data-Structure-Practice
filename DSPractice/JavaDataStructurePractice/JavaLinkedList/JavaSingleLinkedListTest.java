package JavaLinkedList;

public class JavaSingleLinkedListTest {

	public static void main(String[] args) {
		JavaLinkedList<Integer> testList = new JavaSingleLinkedList<Integer>();
		try {
			testList.insertAtBegining(10);
			testList.insertAtEnd(20);
			testList.insertAtEnd(30);
			
			testList.printList();
			
			testList.insertAtPosition(40, 2);
			testList.printList();
			testList.insertAtPosition(50, 1);
			testList.printList();
			testList.insertAtPosition(60, 5);
			testList.printList();
			testList.insertAtPosition(70, 7);
			testList.printList();
			
			testList.deleteAtPosition(9);
			testList.printList();
		} catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
