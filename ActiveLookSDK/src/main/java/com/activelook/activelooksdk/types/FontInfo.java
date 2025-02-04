/*

Copyright 2021 Microoled
Licensed under the Apache License, Version 2.0 (the “License”);
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an “AS IS” BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/
package com.activelook.activelooksdk.types;

import java.util.ArrayList;
import java.util.List;

public class FontInfo {

    private final byte id;
    private final byte height;

    public FontInfo(byte id, byte height) {
        this.id = id;
        this.height = height;
    }

    public static final List<FontInfo> toList(byte[] bytes) {
        final ArrayList<FontInfo> result = new ArrayList<>();
        int offset = 0;
        while (offset < bytes.length) {
            result.add(new FontInfo(bytes[offset], bytes[offset + 1]));
            offset += 2;
        }
        return result;
    }

}
