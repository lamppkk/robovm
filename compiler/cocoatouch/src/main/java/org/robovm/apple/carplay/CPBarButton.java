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
package org.robovm.apple.carplay;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPBarButton/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPBarButtonPtr extends Ptr<CPBarButton, CPBarButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPBarButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPBarButton() {}
    protected CPBarButton(Handle h, long handle) { super(h, handle); }
    protected CPBarButton(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithImage:handler:")
    public CPBarButton(UIImage image, @Block VoidBlock1<CPBarButton> handler) { super((SkipInit) null); initObject(init(image, handler)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTitle:handler:")
    public CPBarButton(String title, @Block VoidBlock1<CPBarButton> handler) { super((SkipInit) null); initObject(init(title, handler)); }
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -[CPBarButton initWithImage:handler:] or -[CPBarButton buttonWithTitle:handler:]
     */
    @Deprecated
    @Method(selector = "initWithType:handler:")
    public CPBarButton(CPBarButtonType type, @Block VoidBlock1<CPBarButton> handler) { super((SkipInit) null); initObject(init(type, handler)); }
    @Method(selector = "initWithCoder:")
    public CPBarButton(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "buttonStyle")
    public native CPBarButtonStyle getButtonStyle();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setButtonStyle:")
    public native void setButtonStyle(CPBarButtonStyle v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -[CPBarButton initWithImage:handler:] or -[CPBarButton initWithTitle:handler:]
     */
    @Deprecated
    @Property(selector = "buttonType")
    public native CPBarButtonType getButtonType();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithImage:handler:")
    protected native @Pointer long init(UIImage image, @Block VoidBlock1<CPBarButton> handler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTitle:handler:")
    protected native @Pointer long init(String title, @Block VoidBlock1<CPBarButton> handler);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -[CPBarButton initWithImage:handler:] or -[CPBarButton buttonWithTitle:handler:]
     */
    @Deprecated
    @Method(selector = "initWithType:handler:")
    protected native @Pointer long init(CPBarButtonType type, @Block VoidBlock1<CPBarButton> handler);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
