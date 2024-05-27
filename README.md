# Basic LRU Cache Implementation

A singly linked list can be used to demonstrate the basic principles of a LRU cache. 
New elements are added with the "put" method at the front of the linked list. The least recently used elements in the list are moved down to the end of the list and eventually removed when the cache size limit has been reached. Whenever an element is accessed 
using the "get" method, the list is updated with the recently used element being pushed to the front of the list. 

Below is an example of the implementation:

<img width="211" alt="Screenshot 2024-05-27 at 2 31 19 PM" src="https://github.com/JosephS1618/lru-cache/assets/46387707/c0fb629f-4537-405a-9867-f049652b0750">
