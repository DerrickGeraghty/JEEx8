/**
 * 
 */
package edu.nbcc.factory;

/**
 * @author Derrick Geraghty
 *
 */
public class Admin implements User{

	@Override
	public String getEntitlements() {
		// TODO Auto-generated method stub
		return "Admin User";
	}

}
