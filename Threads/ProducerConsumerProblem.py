from queue import Queue
from threading import Thread
import time
import random

BUFFER_SIZE = 100; #The size of Queue buffer

queue = Queue(BUFFER_SIZE); 

class producer(Thread): #producer thread class
    def run(self):
        items = range(200);  #returns sequence of integers (which represent items) in items list
        global queue;
        while True:
            item = random.choice(items);  #Randomly pick an item of the items list
            queue.put(item); #put the item in the queue
            print ("Produced ---> ", item);
            time.sleep(random.random()); 

class consumer(Thread):
    def run(self):
        global queue;
        while True:
            item = queue.get(); #get item from the buffer
            queue.task_done(); #indicating that the consumer did his job by getting an item
            print ("Consumed ---> ", item);
            time.sleep(random.random());

#Run the Threads
producer().start();
consumer().start();
