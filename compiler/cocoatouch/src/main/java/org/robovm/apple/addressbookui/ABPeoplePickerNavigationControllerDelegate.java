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
package org.robovm.apple.addressbookui;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ABPeoplePickerNavigationControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "peoplePickerNavigationController:didSelectPerson:")
    void didSelectPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person);
    @Method(selector = "peoplePickerNavigationController:didSelectPerson:property:identifier:")
    void didSelectPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person, ABProperty property, int identifier);
    @Method(selector = "peoplePickerNavigationControllerDidCancel:")
    void didCancel(ABPeoplePickerNavigationController peoplePicker);
    /**
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "peoplePickerNavigationController:shouldContinueAfterSelectingPerson:")
    boolean shouldContinueAfterSelectingPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person);
    /**
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "peoplePickerNavigationController:shouldContinueAfterSelectingPerson:property:identifier:")
    boolean shouldContinueAfterSelectingPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person, ABProperty property, int identifier);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
