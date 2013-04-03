/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.persistence.interfaces;

import br.com.utfpr.model.Address;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface AddressDAO {

    /**
     *
     * @param address
     * @return
     */
    public int insertAddress(Address address);

    /**
     *
     * @param address
     * @return
     */
    public boolean deleteAddress(Address address);

    /**
     *
     * @param address
     * @return
     */
    public Address findAddress(Address address);

    /**
     *
     * @param address
     * @return
     */
    public boolean updateAddress(Address address);

    /**
     *
     * @param condition
     * @return
     */
    public RowSet selectAddressRS(String condition);
}