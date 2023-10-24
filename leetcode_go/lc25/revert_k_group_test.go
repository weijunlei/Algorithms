package lc25

import (
	"testing"
)

func TestRevertKGroup(t *testing.T) {
	l1 := &ListNode{1, nil}
	l1.Next = &ListNode{2, nil}
	l1.Next.Next = &ListNode{3, nil}
	l1.Next.Next.Next = &ListNode{4, nil}
	l1.Next.Next.Next.Next = &ListNode{5, nil}
	l1 = reverseKGroup(l1, 2)
	for l1 != nil {
		t.Log(l1.Val)
		l1 = l1.Next
	}
}
