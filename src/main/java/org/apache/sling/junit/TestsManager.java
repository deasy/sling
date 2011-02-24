/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.junit;

import java.util.Collection;

/** Service that gives access to JUnit test classes */
public interface TestsManager {
    /** Return the names of all currently available tests */
    public Collection<String> getTestNames();
    
    /** Instantiate test class for specified test */
    public Class<?> getTestClass(String testName) throws ClassNotFoundException;
    
    /** List tests using supplied Renderer - does NOT call setup or cleanup
     *  on renderer.
     */
    public void listTests(Collection<String> testNames, Renderer renderer) throws Exception;
    
    /** Execute tests and report results using supplied Renderer - does NOT call setup or cleanup
     *  on renderer.
     *  @param testMethodName if not empty, only test methods that have this name are executed
     */ 
    public void executeTests(Collection<String> testNames, Renderer renderer, String testMethodName) throws Exception;
}
