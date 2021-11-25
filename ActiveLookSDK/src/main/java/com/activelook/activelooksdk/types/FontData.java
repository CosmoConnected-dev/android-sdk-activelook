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

import java.security.InvalidParameterException;

public class FontData {

    private final byte[] bytes;

    private final int height;

    public FontData(byte[] bytes) {
        this.bytes = new byte[bytes.length];
        this.height = bytes[1];
        System.arraycopy(bytes, 0, this.bytes, 0, bytes.length);
    }

    @Deprecated
    public FontData(byte height, byte[] bytes) {
        // TODO: change here having data directly in font file.
        this.height = height;
        this.bytes = new byte[bytes.length];
        System.arraycopy(bytes, 0, this.bytes, 0, bytes.length);
    }

    public char getFontSize() {
        return (char) (this.bytes.length);
    }

    public byte[][] getChunks(int size) {
        return Utils.split(this.bytes, size);
    }

}
