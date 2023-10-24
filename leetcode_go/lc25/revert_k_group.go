package lc25

type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseKGroup(head *ListNode, k int) *ListNode {
	if head == nil || head.Next == nil || k == 1 {
		return head
	}
	result := &ListNode{Next: head}
	pre := result
	for head != nil {
		tail := pre
		for i := 0; i < k; i++ {
			tail = tail.Next
			if tail == nil {
				return result.Next
			}
		}
		tmp := tail.Next
		head, tail = helper(head, tail)
		pre.Next = head
		pre = tail
		head = tmp
	}
	return result.Next
}

func helper(head, tail *ListNode) (*ListNode, *ListNode) {
	p := head
	pre := tail.Next
	for pre != tail {
		tmp := p.Next
		p.Next = pre
		pre = p
		p = tmp
	}
	return tail, head
}
