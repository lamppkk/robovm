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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/INCallDestinationType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unknown(0L),
    Normal(1L),
    Emergency(2L),
    Voicemail(3L),
    Redial(4L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    CallBack(5L),
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use INCallDestinationTypeNormal instead
     */
    @Deprecated
    NormalDestination(1L),
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use INCallDestinationTypeEmergency instead
     */
    @Deprecated
    EmergencyDestination(2L),
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use INCallDestinationTypeVoicemail instead
     */
    @Deprecated
    VoicemailDestination(3L),
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use INCallDestinationTypeRedial instead
     */
    @Deprecated
    RedialDestination(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/INCallDestinationType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/INCallDestinationType/*</name>*/ valueOf(long n) {
        for (/*<name>*/INCallDestinationType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/INCallDestinationType/*</name>*/.class.getName());
    }
}
