package com.example.studentmanager.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

 @Entity
public class TimeSlot {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long SlotID;
     @NotNull
     private String Time;

     public long getSlotID() {
         return SlotID;
     }

     public void setSlotID(long slotID) {
         SlotID = slotID;
     }

     public String getTime() {
         return Time;
     }

     public void setTime(String time) {
         Time = time;
     }
 }
