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

package org.hibersap.annotations;

import org.hibersap.conversion.Converter;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Converter that maps the parameter's data type from the type returned by JCo to any Java type and
 * vice versa.
 *
 * @author Carsten Erker
 */
@Retention(RUNTIME)
public @interface Convert {

    Class<? extends Converter> converter();
}
