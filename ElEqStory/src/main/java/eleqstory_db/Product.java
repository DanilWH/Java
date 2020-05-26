/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleqstory_db;

/**
 *
 * @author danil
 */
public class Product {
    
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] image;
    
    public Product(int pid, String pname, float pprice, String pAddDate, byte[] pimg)
    {
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.addDate = pAddDate;
        this.image = pimg;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public float getPrice()
    {
        return this.price;
    }
    
    public String getAddDate()
    {
        return this.addDate;
    }
    
    public byte[] getImage()
    {
        return this.image;
    }
}
