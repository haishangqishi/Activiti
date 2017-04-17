<<<<<<< HEAD
package org.activiti.camel.util;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

/**
 * Attach to the ReceiveTask (end event).
 * 
 * @author stefan.schulze@accelsis.biz
 *
 */
public class DummyExecutionListener implements ExecutionListener {

	private static final long serialVersionUID = 1L;

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		// dummy
	}
}
=======
package org.activiti.camel.util;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

/**
 * Attach to the ReceiveTask (end event).
 * 
 * @author stefan.schulze@accelsis.biz
 *
 */
public class DummyExecutionListener implements ExecutionListener {

	private static final long serialVersionUID = 1L;

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		// dummy
	}
}
>>>>>>> 4417bb216feb631658be5fb53da2a693926f6001
