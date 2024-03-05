class fibonacci():
    def __init__(self, countNumber):    
        self.number = countNumber
        
    def calc(self):
        result = []

        lastNum = 0
        thisNum = 1

        while(lastNum < self.number):
            result.append(thisNum)

            nextNum = lastNum + thisNum
            lastNum = thisNum
            thisNum = nextNum

        pertence = self.number in result
        return "O numero pertence a sequência" if pertence else "O numero não pertence a sequência"