/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */    
package org.apache.harmony.test.stress.jpda.jdwp.share;

import org.apache.harmony.share.framework.jpda.TestOptions;

import org.apache.harmony.share.MultiCase;

/**
 * Basic class for JDWP QA tests based on <code>TestHarness</code> framework.
 * 
 * @author Ivan G. Popov
 * @version $Revision: 1.2 $
 */
public abstract class JDWPQARawTestCase extends MultiCase {

    /**
     * Where to print log messages.
     */
    protected JDWPQALogWriter logWriter; 

    /**
     * Test run options.
     */
    protected TestOptions settings; 

    /**
     * This method should be overriden in derived classes to return full name
     * for debuggee class.
     * 
     * @return full debuggee class name
     */
    protected abstract String getDebuggeeClassName();

    /**
     * Overrides inherited JUint method to provide initialization and invocation
     * of internalSetUp() and internalTearDown() methods.
     */
    protected void setUp() throws Exception {
        super.setUp();

        logWriter = new JDWPQALogWriter(log, "");

        settings = new TestOptions(); 
        settings.setDebuggeeClassName(getDebuggeeClassName());
    }
}