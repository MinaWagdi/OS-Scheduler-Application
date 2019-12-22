# OS-Scheduler-Application
Application to perform different scheduling algorithms on processes.


This projects supports many scheduling algorithms:

* First Come First Served Scheduling algorithm
* Shortest Job First Scheduling non-preemptive
* Priority Scheduling algorithm Non-Preemptive
* Round Robin Scheduling
* Shortest Job First Scheduling Preemptive
* Priority Scheduling algorithm Preemptive

_It also supports GAP handling_


How to use ? 
1. The user opens the jar file of the program  
2. The user enters each Process Name , Burst Time , Arrival Time , Priority and quantum Time 
3. The user clicks the “Add Process” button.
Immediately , the process details entered by the user will appear in the text area found in the right of the window.
4. Then , the user enters the second Process details and then clicks the “Add Process” button another time. 
5. Repeat until you are finished of all the processes you wish to enter.
6. Choose a scheduling algorithm to schedule the processes you have just entered
7. Click “ Run”

In the text Area , you will find the scheduling done by the program for the processes. 
For each you will find : the process Name , the starting Time , the Pre-empted Time as well as the waiting time it has waited until executed another time.
Finally , if you wish to try another scheduling algorithm or restart your work , all you have to do is to click on the “Reset” Button and re-begin your work.


Note: The values entered in the priority textField are not taken into consideration unless selection one of the two priority scheduling algorithms.
Also , the quantuam value you enter in the quantum textField is taken into consideration only with the Round Robin Scheduling algorithm.
