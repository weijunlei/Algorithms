package lc24

import (
	"fmt"
	"testing"
)

func Test(t *testing.T) {

	l := &ListNode{Val: 1}
	l.Next = &ListNode{Val: 2}
	l.Next.Next = &ListNode{Val: 3}
	l.Next.Next.Next = &ListNode{Val: 4}
	l = swapPairs(l)
	for l != nil {
		fmt.Println(l.Val)
		l = l.Next
	}

}
