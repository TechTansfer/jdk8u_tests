/*
 * Copyright 2006 The Apache Software Foundation or its licensors, as applicable
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Olessia Salmina
 */

package org.apache.harmony.test.reliability.api.text;

import org.apache.harmony.test.reliability.share.Test;
import java.util.*;
import java.text.*;

public class StringCrC {
    public static String getRandomString(char size) {
        char[] ch = new char[size];
        Random rand = new Random();
        int i = 0;
        while (i < size) {

            int c = rand.nextInt(0xFFFF);
            if (Character.isJavaIdentifierPart((char) c)) {
                ch[i++] = (char) c;
            }
        }
        return new String(ch);
    }
}

