package com.vanamadhuryam.calenderapp.model;

import java.util.HashMap;
import java.util.Map;

public class CalenderDTO {

   private String dateDescription;
   private String locationDescription;
   private String dateHeader;
   private String indianDateHeader;
   private Map<String, String> dateMap = new HashMap<>();

   public String getDateDescription() {
      return dateDescription;
   }

   public void setDateDescription(String dateDescription) {
      this.dateDescription = dateDescription;
   }

   public String getLocationDescription() {
      return locationDescription;
   }

   public void setLocationDescription(String locationDescription) {
      this.locationDescription = locationDescription;
   }

   public String getDateHeader() {
      return dateHeader;
   }

   public void setDateHeader(String dateHeader) {
      this.dateHeader = dateHeader;
   }

   public String getIndianDateHeader() {
      return indianDateHeader;
   }

   public void setIndianDateHeader(String indianDateHeader) {
      this.indianDateHeader = indianDateHeader;
   }

   public Map<String, String> getDateMap() {
      return dateMap;
   }

   public void setDateMap(Map<String, String> dateMap) {
      this.dateMap = dateMap;
   }
}
