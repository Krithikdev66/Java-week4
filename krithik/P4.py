class ATM:
    def __init__(self,balance):
        self.balance=balance
    def deposit(self,amount):
        self.balance+=amount
    def display(self):
        print("Current balance:",self.balance)   
a=ATM(5000)
a.deposit(101) 
a.display()       