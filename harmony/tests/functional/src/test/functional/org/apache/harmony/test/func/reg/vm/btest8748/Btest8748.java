/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 */
package org.apache.harmony.test.func.reg.vm.btest8748;

import java.util.logging.Logger; 
import org.apache.harmony.test.share.reg.RegressionTest;

/**
 * Tries to load class which static initializer throws an Error. 
 * Checks that Error is caught and VM doesn't crash.
 */
public class Btest8748 extends RegressionTest {

    public static void main(String[] args) {
        System.exit(new Btest8748().test(Logger.global, args));
    }

    public int test(Logger logger, String[] args) {
        try {
            nosuch.test();
            return pass();
        } catch (Throwable e) {
            System.out.println("caught Throwable");
            e.printStackTrace(System.out);
            return error();
        }
    }
}
