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
package org.robovm.apple.security;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Security")/*</annotations>*/
@Marshaler(/*<name>*/SecReturn/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SecReturn/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static SecReturn toObject(Class<SecReturn> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new SecReturn(o);
        }
        @MarshalsPointer
        public static long toNative(SecReturn o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<SecReturn> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<SecReturn> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new SecReturn(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<SecReturn> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (SecReturn i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    SecReturn(CFDictionary data) {
        super(data);
    }
    public SecReturn() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(CFType key) {
        return data.containsKey(key);
    }
    public <T extends NativeObject> T get(CFType key, Class<T> type) {
        if (has(key)) {
            return data.get(key, type);
        }
        return null;
    }
    public SecReturn set(CFType key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    public boolean shouldReturnData() {
        if (has(Keys.Data())) {
            CFBoolean val = get(Keys.Data(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public SecReturn setShouldReturnData(boolean shouldReturnData) {
        set(Keys.Data(), CFBoolean.valueOf(shouldReturnData));
        return this;
    }
    public boolean shouldReturnAttributes() {
        if (has(Keys.Attributes())) {
            CFBoolean val = get(Keys.Attributes(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public SecReturn setShouldReturnAttributes(boolean shouldReturnAttributes) {
        set(Keys.Attributes(), CFBoolean.valueOf(shouldReturnAttributes));
        return this;
    }
    public boolean shouldReturnReference() {
        if (has(Keys.Ref())) {
            CFBoolean val = get(Keys.Ref(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public SecReturn setShouldReturnReference(boolean shouldReturnReference) {
        set(Keys.Ref(), CFBoolean.valueOf(shouldReturnReference));
        return this;
    }
    public boolean shouldReturnPersistent() {
        if (has(Keys.PersistentRef())) {
            CFBoolean val = get(Keys.PersistentRef(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public SecReturn setShouldReturnPersistent(boolean shouldReturnPersistent) {
        set(Keys.PersistentRef(), CFBoolean.valueOf(shouldReturnPersistent));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("Security")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kSecReturnData", optional=true)
        public static native CFType Data();
        @GlobalValue(symbol="kSecReturnAttributes", optional=true)
        public static native CFType Attributes();
        @GlobalValue(symbol="kSecReturnRef", optional=true)
        public static native CFType Ref();
        @GlobalValue(symbol="kSecReturnPersistentRef", optional=true)
        public static native CFType PersistentRef();
    }
    /*</keys>*/
}
