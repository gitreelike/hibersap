package org.hibersap.annotations;

/*
 * Copyright (C) 2008 akquinet tech@spree GmbH
 * 
 * This file is part of Hibersap.
 *
 * Hibersap is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Hibersap is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Hibersap.  If not, see <http://www.gnu.org/licenses/>.
 */

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

/**
 * Annotation to declare members of Bapi import/export return structures.
 * 
 * @author Carsten Erker
 */
@Retention(RUNTIME)
public @interface Parameter {
	/**
	 * Declare name of the parameter in the Bapi structure.
	 */
	String value();

	/**
	 * Declare type of parameter, either SIMPLE or STRUCTURE
	 */
	ParameterType type() default ParameterType.SIMPLE;
}