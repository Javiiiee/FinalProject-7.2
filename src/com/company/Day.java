package com.company;

    public class Day {
        private String dayName = "";
        private String [] days = {"Monday", "Tueday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        public Day(){
            this.dayName = "";
        }
        public Day(String day){
            this.dayName = day;
        }
        public String getDay(String dayName){
            Day name = new Day(dayName);
            for(int i = 0; i<days.length; i++){
                if(dayName.equalsIgnoreCase(days[i])){
                    this.dayName = days[i];
                }else{
                    continue;
                }
            }
            return dayName;
        }
        public String getDay(){
            Day name = new Day(dayName);
            for(int i = 0; i<days.length; i++){
                if(dayName.equalsIgnoreCase(days[i])){
                    this.dayName = days[i];
                }else{
                    continue;
                }
            }
            return dayName;

        }
        public void setDay(String day){
            this.dayName = day;
        }
        public int getDayIndex(String dayName){
            for (int i = 0; i< days.length; i++){
                if (days[i].equalsIgnoreCase(dayName)){
                    return i;
                }
            }
            return -1;
        }
        public String calculateDay(int numberOfDays){
            String message ="";
            int dayIndex = getDayIndex(this.dayName);
            if(dayIndex !=-1 && numberOfDays >= 0){
                message = days[(dayIndex + numberOfDays)%7];
            } else if (dayIndex != -1 && numberOfDays <0){
                message = days[7 - (Math.abs(numberOfDays)-dayIndex) %7];
            }else{
                message = "Invalid Day";
            }
            return message;
        }
        public String getNextDay(){
            return calculateDay(1);
        }
        public String getPreviousDay(){
            return calculateDay(-1);
        }
        public String toString(){
            return "the day is:"+ dayName;
        }
    }
