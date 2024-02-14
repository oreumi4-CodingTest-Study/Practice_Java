answer = 99999

def diff(begin, word):
    cnt = 0
    for i in range(len(begin)):
        if begin[i] != word[i]:
            cnt += 1
    return cnt

def dfs(begin, target, words, depth, tmp, used):
    global answer
    # if answer != 99999 and depth >= answer:
    #     return

    if begin == target:
        answer = min(answer, depth)
        print(tmp)
        return

    for idx, word in enumerate(words):
        if used[idx] == 0 and diff(begin, word) == 1:
            used[idx] = 1
            dfs(word, target, words, depth + 1, tmp + [word], used)
            used[idx] = 0


def solution(begin, target, words):
    global answer
    dfs(begin, target, words, 0, [], [0]*len(words))
    if answer == 99999:
        answer = 0
    return answer


