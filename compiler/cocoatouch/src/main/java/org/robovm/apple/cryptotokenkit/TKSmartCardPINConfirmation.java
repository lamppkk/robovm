/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package org.robovm.apple.cryptotokenkit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/TKSmartCardPINConfirmation/*</name>*/ extends Bits</*<name>*/TKSmartCardPINConfirmation/*</name>*/> {
    /*<values>*/
    public static final TKSmartCardPINConfirmation None = new TKSmartCardPINConfirmation(0L);
    public static final TKSmartCardPINConfirmation New = new TKSmartCardPINConfirmation(1L);
    public static final TKSmartCardPINConfirmation Current = new TKSmartCardPINConfirmation(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/TKSmartCardPINConfirmation/*</name>*/[] values = _values(/*<name>*/TKSmartCardPINConfirmation/*</name>*/.class);

    public /*<name>*/TKSmartCardPINConfirmation/*</name>*/(long value) { super(value); }
    private /*<name>*/TKSmartCardPINConfirmation/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/TKSmartCardPINConfirmation/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/TKSmartCardPINConfirmation/*</name>*/(value, mask);
    }
    protected /*<name>*/TKSmartCardPINConfirmation/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/TKSmartCardPINConfirmation/*</name>*/[] values() {
        return values.clone();
    }
}
