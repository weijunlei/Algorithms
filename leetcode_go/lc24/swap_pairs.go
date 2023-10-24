package lc24

type ListNode struct {
	Val  int
	Next *ListNode
}

func swapPairs(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	result := &ListNode{0, head}
	pre := result
	for pre.Next != nil && pre.Next.Next != nil {
		node1 := pre.Next
		node2 := pre.Next.Next
		pre.Next = node2
		node1.Next = node2.Next
		node2.Next = node1
		pre = node1
	}
	return result.Next
}
