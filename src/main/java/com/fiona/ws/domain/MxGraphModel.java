package com.fiona.ws.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
@XmlRootElement(name = "mxGraphModel")
public class MxGraphModel {
	//@XmlElement(name = "root")
	//@Getter
    private String root;
   
   /* public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }*/

}