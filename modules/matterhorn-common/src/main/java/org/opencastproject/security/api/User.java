/**
 *  Copyright 2009, 2010 The Regents of the University of California
 *  Licensed under the Educational Community License, Version 2.0
 *  (the "License"); you may not use this file except in compliance
 *  with the License. You may obtain a copy of the License at
 *
 *  http://www.osedu.org/licenses/ECL-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS"
 *  BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 */
package org.opencastproject.security.api;

import java.util.Set;

/**
 * Represent a user in Matterhorn
 */
public interface User {

  /**
   * Gets this user's unique account name.
   * 
   * @return the account name
   */
  String getUsername();

  /**
   * Gets this user's password, if available.
   * 
   * @return the password
   */
  String getPassword();

  /**
   * Returns <code>true</code> if this user object can be used to log into Matterhorn.
   * 
   * @return <code>true</code> if this user can login
   */
  boolean canLogin();

  /**
   * Returns the user's organization identifier.
   * 
   * @return the organization
   */
  Organization getOrganization();

  /**
   * Gets the user's roles. For anonymous users, this will return {@link Anonymous}.
   * 
   * @return the user's roles
   */
  Set<Role> getRoles();

  /**
   * Returns whether the user is in a specific role.
   * 
   * @param role
   *          the role to check
   * @return whether the role is one of this user's roles
   */
  boolean hasRole(String role);

}
