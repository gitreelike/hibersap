/*
 * Copyright (c) 2008-2014 akquinet tech@spree GmbH
 *
 * This file is part of Hibersap.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this software except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.hibersap.configuration.xml;

public enum ValidationMode {
    /**
     * Use Bean Validation if a provider is found on the classpath (Default).
     */
    AUTO,

    /**
     * Force the use of Bean Validation.
     * Hibersap will throw an Exception if no provider is found on the classpath.
     */
    CALLBACK,

    /**
     * Do not use Bean Validation, even if a provider is present.
     */
    NONE
}
