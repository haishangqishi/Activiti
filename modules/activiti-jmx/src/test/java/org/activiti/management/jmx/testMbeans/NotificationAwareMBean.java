<<<<<<< HEAD
/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.management.jmx.testMbeans;

import org.activiti.management.jmx.NotificationSender;
import org.activiti.management.jmx.annotations.ManagedAttribute;
import org.activiti.management.jmx.annotations.ManagedOperation;
import org.activiti.management.jmx.annotations.ManagedResource;
import org.activiti.management.jmx.annotations.NotificationSenderAware;

/**
 * @author Saeid Mirzaei
 */

@ManagedResource(description = "test description")
public class NotificationAwareMBean implements NotificationSenderAware {

  NotificationSender capturedSender;

  @ManagedAttribute(description = "test attribute String description")
  public String getTestAttributeString() {
    return null;

  }

  @ManagedAttribute(description = "test attribute Boolean description")
  public Boolean isTestAttributeBoolean() {
    return null;
  }

  @ManagedOperation(description = "test operation description")
  public void getTestOperation() {

  }

  @Override
  public void setNotificationSender(NotificationSender sender) {
    capturedSender = sender;
  }

}
=======
/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.management.jmx.testMbeans;

import org.activiti.management.jmx.NotificationSender;
import org.activiti.management.jmx.annotations.ManagedAttribute;
import org.activiti.management.jmx.annotations.ManagedOperation;
import org.activiti.management.jmx.annotations.ManagedResource;
import org.activiti.management.jmx.annotations.NotificationSenderAware;

/**
 * @author Saeid Mirzaei
 */

@ManagedResource(description = "test description")
public class NotificationAwareMBean implements NotificationSenderAware {

  NotificationSender capturedSender;

  @ManagedAttribute(description = "test attribute String description")
  public String getTestAttributeString() {
    return null;

  }

  @ManagedAttribute(description = "test attribute Boolean description")
  public Boolean isTestAttributeBoolean() {
    return null;
  }

  @ManagedOperation(description = "test operation description")
  public void getTestOperation() {

  }

  @Override
  public void setNotificationSender(NotificationSender sender) {
    capturedSender = sender;
  }

}
>>>>>>> 4417bb216feb631658be5fb53da2a693926f6001
