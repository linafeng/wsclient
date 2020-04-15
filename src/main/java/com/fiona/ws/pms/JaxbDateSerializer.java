package com.fiona.ws.pms;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.bind.annotation.adapters.XmlAdapter;  
  
public class JaxbDateSerializer extends XmlAdapter<String, Calendar>{  
  
 private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");  
  
    @Override  
    public String marshal(Calendar date) throws Exception {  
        return dateFormat.format(date.getTime());  
    }  
  
    @Override  
    public Calendar unmarshal(String date) throws Exception {  
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(dateFormat.parse(date));
        return calendar;
    }  
}  