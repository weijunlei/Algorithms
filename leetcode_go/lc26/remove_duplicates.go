package lc26

func removeDuplicates(nums []int) int {
	if len(nums) == 0 {
		return 0
	}
	curNum := nums[0]
	curIdx := 0
	for i := 1; i < len(nums); i++ {
		if nums[i] != curNum {
			curIdx += 1
			nums[curIdx] = nums[i]
			curNum = nums[i]
		}
	}
	return curIdx + 1
}
