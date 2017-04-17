<<<<<<< HEAD
package org.activiti.engine.impl.jobexecutor;

import org.activiti.engine.impl.interceptor.Command;

public interface FailedJobCommandFactory {
	
	public Command<Object> getCommand(String jobId, Throwable exception);

}
=======
package org.activiti.engine.impl.jobexecutor;

import org.activiti.engine.impl.interceptor.Command;

public interface FailedJobCommandFactory {
	
	public Command<Object> getCommand(String jobId, Throwable exception);

}
>>>>>>> 4417bb216feb631658be5fb53da2a693926f6001
