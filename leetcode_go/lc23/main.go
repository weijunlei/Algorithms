package main

import "fmt"

type ListNode struct {
	Val  int
	Next *ListNode
}

func mergeKListsHelper(lists []*ListNode, left, right int) *ListNode {
	if left > right {
		return nil
	}
	if left == right {
		return lists[left]
	}
	resultNode := &ListNode{}
	pre := resultNode
	var leftNode, rightNode *ListNode
	if right-left == 1 {
		leftNode = lists[left]
		rightNode = lists[right]
	} else {
		mid := (right-left)/2 + left
		leftNode = mergeKListsHelper(lists, left, mid)
		rightNode = mergeKListsHelper(lists, mid+1, right)
	}

	for leftNode != nil && rightNode != nil {
		if leftNode.Val <= rightNode.Val {
			pre.Next = leftNode
			leftNode = leftNode.Next
		} else {
			pre.Next = rightNode
			rightNode = rightNode.Next
		}
		pre = pre.Next
	}
	if leftNode != nil {
		pre.Next = leftNode
	}
	if rightNode != nil {
		pre.Next = rightNode
	}
	return resultNode.Next
}

func mergeKLists(lists []*ListNode) *ListNode {
	if len(lists) == 0 {
		return nil
	}

	return mergeKListsHelper(lists, 0, len(lists)-1)
}

func main() {
	l1 := &ListNode{Val: 1}
	l1.Next = &ListNode{Val: 3}
	l2 := &ListNode{Val: 2}
	l2.Next = &ListNode{Val: 4}
	lists := []*ListNode{l1, l2}
	result := mergeKLists(lists)
	for result != nil {
		fmt.Println(result.Val)
		result = result.Next
	}
}
