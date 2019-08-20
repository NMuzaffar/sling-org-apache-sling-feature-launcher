/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.sling.feature.launcher.spi.extensions;

import org.apache.sling.feature.Extension;

public interface ExtensionHandler
{
    /** Priority for Extension Handlers that are just a fallback instance **/
    int FALLBACK_PRIORITY = -1;

    /** @return The priority of the Extension Handler to select the most appropriate one. The one with the highest priority is selected **/
    int getPriority();

    public boolean handle(ExtensionContext context, Extension extension) throws Exception;
}
