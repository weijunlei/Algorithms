package lc27

import "testing"

func TestRemoveElement(t *testing.T) {
	nums := []int{1, 2, 3, 4, 3, 5}
	tmp := removeElement(nums, 3)
	t.Log(tmp)
}
