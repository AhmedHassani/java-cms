/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mustafa_cms;

/**
 *
 * @author ahmed
 */
public class User {
    public String name;
    public String data;
    public String number;
    public String dataexp;
    public String priceget;
    public String priceout;
    public String pr;
    public String id;
User(String name,String number ,String priceout,String priceget,String dataexp,String data,String pr,String id){
    this.name=name;
    this.data=data;
    this.number=number;
    this.dataexp=dataexp;
    this.priceget=priceget;
    this.priceout=priceout;
    this.pr=pr;
    this.id=id;
    }
}
