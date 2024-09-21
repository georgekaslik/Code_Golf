
class HashMap:

    def __init__(self):
        self.Map = [None] * 10
    
    def Hash(self,value):
        hash = 0
        for char in value:
            if char.isdigit():
                hash += char
            else:
                hash += ord(char)
        hash = hash % 10
        return hash

    def Put(self, key, value):
        index = self.Hash(key)
        if(self.Map[index] == None):
            self.Map[index] = []
        self.Remove(key)
        self.Map[index].append((key, value))

    def Get(self, key):
        index = self.Hash(key)
        linkedList = self.Map[index]
        for item in linkedList:
            if(item[0] == key):
                return item
    
    def Remove(self, key):
        index = self.Hash(key)
        if(not self.Map[index] == None):
            subIndexCounter = 0
            for i in self.Map[index]:                
                if(i[0] == key):
                    del self.Map[index][subIndexCounter]
                    return
                subIndexCounter += 1

    def Print(self):
        for key in self.Map:
            if key == None:
                print("None")
            else:
                for k in key:
                    print(k, end=" : ")
                print("")


m = HashMap()
m.Print()
print("=======")
m.Put("hello","world")
m.Put("george","Kaslik")
m.Put("viktor","Kaslik")
m.Put("bertie","Kaslik")
m.Put("lottie","Kaslik")
m.Put("charlie","Kaslik")
m.Put("laura","Kaslik")
m.Put("kim","Kaslik")
m.Put("pete","Kaslik")
m.Put("hello","worldUpdated")

print(m.Get("george"))
print("=======")

m.Print()