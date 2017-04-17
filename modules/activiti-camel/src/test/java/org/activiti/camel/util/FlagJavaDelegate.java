<<<<<<< HEAD
package org.activiti.camel.util;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;


public class FlagJavaDelegate implements JavaDelegate {
   public static  boolean flag;
   
   public static void reset()  {
     flag = false;
   }

  @Override
  public void execute(DelegateExecution execution) throws Exception {
    flag = true;
    
  }
  
  public static boolean isFlagSet() {
    return flag;
  }
   
}
=======
package org.activiti.camel.util;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;


public class FlagJavaDelegate implements JavaDelegate {
   public static  boolean flag;
   
   public static void reset()  {
     flag = false;
   }

  @Override
  public void execute(DelegateExecution execution) throws Exception {
    flag = true;
    
  }
  
  public static boolean isFlagSet() {
    return flag;
  }
   
}
>>>>>>> 4417bb216feb631658be5fb53da2a693926f6001
