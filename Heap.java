package project1;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {

	public static void main(String[] args) {
		PriorityQueue<Integer>minHeap=new PriorityQueue<Integer>();
		minHeap.add(20);
		minHeap.add(5);
		minHeap.add(15);
		minHeap.add(10);
		System.out.println("MinHeap output");
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
		PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>(Collections.reverseOrder());
		maxheap.add(20);
		maxheap.add(5);
		maxheap.add(15);
		maxheap.add(10);
		System.out.println("MaxHeap output");
		while(!maxheap.isEmpty()) {
			System.out.println(maxheap.poll());

	}

}}
