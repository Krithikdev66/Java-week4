class Parent:
    def parent(self):
        print("from parent class")
class Child(Parent):
    def child(self):
        print("From child Class")
c=Child()
c.child()   
c.parent() 


class Animal:
    def meow(self):
        print("Cat")
    def bark(self):
        print("Dog")
    def meow(self):
        print("Tiger")     
c=Animal()
c.meow()
c.bark()
c.meow()            