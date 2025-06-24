#question by META

class Solution(object):
    def maximumSwap(self, num):
        ls = list(map(int, str(num)))            # original digit list
        n_lis = sorted(ls, reverse=True)         # sorted (desc) digit list
        
        if ls == n_lis:                          # already max
            return num
        
        for i in range(len(ls)):
            if ls[i] != n_lis[i]:
                # find the last index of the digit to be swapped in original list
                swap_idx = len(ls) - 1 - ls[::-1].index(n_lis[i])
                ls[i], ls[swap_idx] = ls[swap_idx], ls[i]
                break

        return int(''.join(map(str, ls)))

''' num = 98368
    ls = [9, 8, 3, 6, 8]         # original digits
    n_lis = [9, 8, 8, 6, 3]      # digits sorted descending
    Loop starts
	•	i = 0:
        ls[0] = 9 and n_lis[0] = 9 → same → continue
	•	i = 1:
        ls[1] = 8 and n_lis[1] = 8 → same → continue
	•	i = 2:
        ls[2] = 3 and n_lis[2] = 8 → mismatch found → time to swap!

    Finding last occurrence of 8 in ls
    swap_idx = len(ls) - 1 - ls[::-1].index(8)
          = 5 - 1 - [8, 6, 3, 8, 9].index(8)
          = 4 - 0 = 4
    So we’ll swap index 2 with index 4

    ls[2], ls[4] = ls[4], ls[2]
    # Before: [9, 8, 3, 6, 8]
    # After:  [9, 8, 8, 6, 3]

    To convert back to int -> int(''.join(map(str, ls))) = 98863 
'''
