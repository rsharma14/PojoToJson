package com.example.Test;

/**
*
*/

import net.jcip.annotations.ThreadSafe;
import uk.co.jemos.podam.api.DataProviderStrategy;

/**
* Default implementation of a {@link DataProviderStrategy}
* <p>
* This default implementation returns values based on a random generator.
* <b>Don't use this implementation if you seek deterministic values</b>
* </p>
*
* <p>
* All values returned by this implementation are <b>different from zero</b>.
* </p>
*
* <p>
* This implementation is a Singleton
* </p>
*
* @author mtedone
*
* @since 1.0.0
*
*/
@ThreadSafe
public final class MyDataProviderStrategyImpl extends
		MyAbstractDataProviderStrategy {


	/**
	 * Implementation of the Singleton pattern
	 */
	public MyDataProviderStrategyImpl() {
		super();
		setMemoization(false);
	}


}
