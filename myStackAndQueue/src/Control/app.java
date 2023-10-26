package Control;

import Module.myQueueLinkList;

public class app {
	public static void main(String[] args) {
//		myStackArray<Integer> stack = new myStackArray<Integer>(3);
//		myStackLinkList<Integer> stackL = new myStackLinkList<Integer>();
//		myQueueArray<Integer> queue = new myQueueArray<Integer>(3);
		myQueueLinkList<Integer> queueL = new myQueueLinkList<Integer>();
		
		queueL.push(1);
		queueL.push(2);		
		queueL.push(3);
		queueL.push(4);
		queueL.outPut();
		System.out.println(queueL.search(5)); 
		System.out.println(queueL.toStringOut());

	}
}
