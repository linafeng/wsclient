package com.fiona.ws.pms;
import java.text.SimpleDateFormat;  
import java.util.Date;  
  
import javax.xml.bind.annotation.adapters.XmlAdapter;  
  
public class JaxbDateSerializer2 extends XmlAdapter<String, Date>{  
  
 private SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyyThh:mm:ss");  
  
    @Override  
    public String marshal(Date date) throws Exception {  
        return dateFormat.format(date);  
    }  
  
    @Override  
    public Date unmarshal(String date) throws Exception {  
        return dateFormat.parse(date);  
    }  
}  