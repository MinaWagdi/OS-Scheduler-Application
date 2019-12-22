/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1.os;

/**
 *
 * @author Mina
 */
public class Process
    {
        String name;
        int arrivalTime ; 
        int burst ; 
        int priority ; 
        int TimeRemaining ;// for RR Scheduling
        int waitingTime ;
        int StartTime ;
        int EndTime ; 
        public Process()
        {
            arrivalTime =1 ; 
            burst = 1 ; 
            priority = 1 ; 
            TimeRemaining = burst ;
            
        }
        
        public Process(String n, int burst , int arrivalTime , int priority)
        {
            this.name = n;
            this.arrivalTime=arrivalTime; 
            this.burst = burst ; 
            this.priority = priority ; 
            TimeRemaining=burst ; 
            
        }
        @Override
        public boolean equals(Object obj)
        {
            if(obj instanceof Process)
            {
                if(((Process) obj).name==this.name&&((Process) obj).TimeRemaining==this.TimeRemaining
                        &&((Process) obj).arrivalTime==this.arrivalTime&&((Process) obj).burst==this.burst
                        &&((Process) obj).priority==this.priority)
                    return true ; 
                return false ;
            }
            else 
                return false ; 
        }
        
        public void exectute()
        {
            TimeRemaining--; 
        }
    }
