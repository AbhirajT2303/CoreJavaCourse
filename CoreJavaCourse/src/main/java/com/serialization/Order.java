package com.serialization;

import java.io.Serializable;

public class Order implements Serializable {
    private int id;
    private String itemName;
    private String orderAdd;

    @Override
    public String toString() {
        return "Order{" + "id=" + id +", itemName='" + itemName + '\'' +", orderAdd='" + orderAdd + '\'' +'}';
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setItemName(String  itemName){
        this.itemName=itemName;
    }
    public String getItemName(){
        return this.itemName;
    }
    public void setOrderAdd(String  orderAdd){
        this.orderAdd=orderAdd;
    }
    public String getOrderAdd(){
        return this.orderAdd;
    }

}
