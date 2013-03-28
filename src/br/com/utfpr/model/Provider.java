package br.com.utfpr.model;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Provider {
    
    private static final Logger LOG = Logger.getLogger(Provider.class.getName());
    private int provider_id;
    private String name;
    private Address addr;
    private Contact cont;
    private int legalPersonNumber;
    private ArrayList<Integer> products_id;
    
    /**
     *
     * @return
     */
    public int getProvider_id() {
        return provider_id;
    }
    
    /**
     *
     * @param provider_id
     */
    public void setProvider_id(int provider_id) {
        this.provider_id = provider_id;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getLegalPersonNumber() {
        return legalPersonNumber;
    }

    /**
     *
     * @param legalPersonNumber
     */
    public void setLegalPersonNumber(int legalPersonNumber) {
        this.legalPersonNumber = legalPersonNumber;
    }

    /**
     *
     * @return
     */
    public ArrayList<Integer> getProducts_id() {
        return products_id;
    }

    /**
     *
     * @param products_id
     */
    public void setProducts_id(ArrayList<Integer> products_id) {
        this.products_id = products_id;
    }

    /**
     *
     * @param product_id
     */
    public void addProduct_id(int product_id) {
        this.products_id.add(product_id);
    }

    /**
     *
     * @return
     */
    public Address getAddr() {
        return addr;
    }

    /**
     *
     * @param addr
     */
    public void setAddr(Address addr) {
        this.addr = addr;
    }

    /**
     *
     * @return
     */
    public Contact getCont() {
        return cont;
    }

    /**
     *
     * @param cont
     */
    public void setCont(Contact cont) {
        this.cont = cont;
    }
}