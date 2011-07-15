/*
 * Copyright (c) 2009, 2011 akquinet tech@spree GmbH.
 *
 * This file is part of Hibersap.
 *
 * Hibersap is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * Hibersap is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with Hibersap. If
 * not, see <http://www.gnu.org/licenses/>.
 */

package org.hibersap.it.jco;

import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItem;

public class BapiFinderTest
{
    @Test
    public void findsFlightBapis()
    {
        SessionManager sessionManager = new AnnotationConfiguration( "A12" ).buildSessionManager();
        Session session = sessionManager.openSession();

        BapiFinder bapiFinder;
        try
        {
            bapiFinder = new BapiFinder( "BC-DWB" );
            session.execute( bapiFinder );
        }
        finally
        {
            session.close();
        }

        System.out.println(bapiFinder.getBapiDescriptions());

        assertThat( bapiFinder.getBapiDescriptions().size(), greaterThan( 0 ) );
        assertThat( bapiFinder.getBapiDescriptions(), hasItem(
                new BapiDescription( "Flight", "Flight with connection data (SAP training)", "GetList",
                        "Find list of flights", "BAPI_FLIGHT_GETLIST" ) ) );
    }
}