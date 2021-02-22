class Squeezer:
    count = 0
    def __init__ (self, color="",maximum_amount_of_juice=0, power_consumption=0, producer="", price=0, warranty_time=0, number_of_speeds=0):
        self.color = color
        self.maximum_amount_of_juice = maximum_amount_of_juice
        self.power_consumption = power_consumption
        self.producer = producer
        self.price = price
        self.warranty_time = warranty_time
        self.number_of_speeds = number_of_speeds
        Squeezer.count += 1
    def __str__(self):
        return "color:" + self.maximum_amount_of_juice + "\npower consumption: " + str(self.power_consumption) + "\nproducer:" +str(self.producer) + "\nprice:" + str(self.price) + "\nwarranty time:" + str(self.warranty_time) + "\nnumber of speeds:" + str(self.number_of_speeds)
        
        
        
    def __del__(self):
        Squeezer.count -= 1
        del self

def main():

    S1 = Squeezer("white", 11, 2, "PHILIPS", 5000, 1, 3 )
    print(S1)
    S2 = Squeezer("black", 7, 1, "Haeger", 1200, 1, 2 )
    print(S2)



    PHILIPS = Squeezer('PHILIPS')
    Haeger = Squeezer('Haeger')

     
if __name__=='__main__':
    main()