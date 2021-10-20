/**
 * 
 */
package com.advancelatam.repositorio;

import com.advancelatam.modelo.Auto;

/**
 * @author gustavoefrainparcosanchez
 *
 */
public interface IAutoRepo extends IGenericRepo <Auto, Integer> {
	
	Auto findByPlaca(String placa);

}
