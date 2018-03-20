/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.salesforce.api.utils;

import java.time.OffsetTime;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * XStream converter for handling {@link OffsetTime} fields.
 */
public class TimeConverter implements Converter {

    @Override
    public void marshal(Object o, HierarchicalStreamWriter writer, MarshallingContext context) {
        OffsetTime time = (OffsetTime) o;
        writer.setValue(DateTimeUtils.formatTime(time));
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        try {
            return DateTimeUtils.parseTime(reader.getValue());
        } catch (Exception e) {
            throw new ConversionException(
                    String.format("Error reading OffsetTime from value %s: %s",
                        reader.getValue(), e.getMessage()),
                    e);
        }
    }

    @Override
    public boolean canConvert(Class aClass) {
        return OffsetTime.class.isAssignableFrom(aClass);
    }

}