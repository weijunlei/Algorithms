package lc28

func strStr(haystack string, needle string) int {
	for i := 0; i <= len(haystack)-len(needle); i++ {
		isSame := true
		for j := 0; j < len(needle); j++ {
			if haystack[i+j] != needle[j] {
				isSame = false
				break
			}
		}
		if isSame {
			return i
		}
	}
	return -1
}
