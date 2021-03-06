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
package org.activiti.management.jmx.annotations;

import org.activiti.management.jmx.NotificationSender;

/**
 * @author Saeid Mirzaei
 */
public interface NotificationSenderAware {

  /**
   * {@link NotificationSender} to use for sending notifications.
   * 
   * @param sender
   *          sender to use for sending notifications
   */
  void setNotificationSender(NotificationSender sender);
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
package org.activiti.management.jmx.annotations;

import org.activiti.management.jmx.NotificationSender;

/**
 * @author Saeid Mirzaei
 */
public interface NotificationSenderAware {

  /**
   * {@link NotificationSender} to use for sending notifications.
   * 
   * @param sender
   *          sender to use for sending notifications
   */
  void setNotificationSender(NotificationSender sender);
}
>>>>>>> 4417bb216feb631658be5fb53da2a693926f6001
