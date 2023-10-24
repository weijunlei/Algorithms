package lc26

import "testing"

func TestRemoveDuplicates(t *testing.T) {
	nums := []int{0, 0, 1, 1, 2, 3, 4, 4}
	tmp := removeDuplicates(nums)
	t.Log(tmp)
}
