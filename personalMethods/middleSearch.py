import math
test = {
    'input': {
        'cards': [13, 10, 8, 7, 5, 3, 1],
        'query': 7
        },
    'output': 3
}
tests = []
tests.append(test)
tests.append({
    'input': {
        'cards': [13, 10, 8, 7, 5, 3, 1],
        'query': 13
        },
    'output': 0
})

def locateCard (card, query):
    half = len(card) // 2
    newMin = 0
    newMax = len(card) - 1
    while newMin <= newMax:
        print(half)
        if card[half] == query:
            return card[half]
        elif card[half] > query:
            newMin = half + 1
            half = (newMin + newMax) // 2
        elif card[half] < query:
            newMax = half - 1
            half = (newMin + newMax) // 2

    return -1

for testsss in tests:
    print(locateCard(testsss['input']['cards'], testsss['input']['query']))
