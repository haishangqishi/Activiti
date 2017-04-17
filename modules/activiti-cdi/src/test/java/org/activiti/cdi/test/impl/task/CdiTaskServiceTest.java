<<<<<<< HEAD
package org.activiti.cdi.test.impl.task;

import org.activiti.cdi.test.CdiActivitiTestCase;
import org.activiti.engine.task.Task;
import org.junit.Test;


public class CdiTaskServiceTest extends CdiActivitiTestCase {
  
  @Test
  public void testClaimTask() {
    Task newTask = taskService.newTask();
    taskService.saveTask(newTask);
    taskService.claim(newTask.getId(), "kermit");
    taskService.deleteTask(newTask.getId(),true);
  }

}
=======
package org.activiti.cdi.test.impl.task;

import org.activiti.cdi.test.CdiActivitiTestCase;
import org.activiti.engine.task.Task;
import org.junit.Test;


public class CdiTaskServiceTest extends CdiActivitiTestCase {
  
  @Test
  public void testClaimTask() {
    Task newTask = taskService.newTask();
    taskService.saveTask(newTask);
    taskService.claim(newTask.getId(), "kermit");
    taskService.deleteTask(newTask.getId(),true);
  }

}
>>>>>>> 4417bb216feb631658be5fb53da2a693926f6001
