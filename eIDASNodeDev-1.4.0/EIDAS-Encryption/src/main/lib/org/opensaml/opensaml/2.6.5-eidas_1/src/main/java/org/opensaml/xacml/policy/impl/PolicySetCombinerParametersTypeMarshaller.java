/*
 * Licensed to the University Corporation for Advanced Internet Development,
 * Inc. (UCAID) under one or more contributor license agreements.  See the
 * NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The UCAID licenses this file to You under the Apache
 * License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensaml.xacml.policy.impl;

import org.opensaml.xacml.policy.PolicySetCombinerParametersType;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.io.MarshallingException;
import org.opensaml.xml.util.DatatypeHelper;
import org.w3c.dom.Element;

/**
 * Marshaller for {@link PolicySetCombinerParametersType}.
 */
public class PolicySetCombinerParametersTypeMarshaller extends CombinerParametersTypeMarshaller {

    /**
     * Constructor.
     */
    public PolicySetCombinerParametersTypeMarshaller() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    protected void marshallAttributes(XMLObject xmlObject, Element domElement) throws MarshallingException {
        PolicySetCombinerParametersType policySetCombinerParametersType = (PolicySetCombinerParametersType) xmlObject;

        if (!DatatypeHelper.isEmpty(policySetCombinerParametersType.getPolicySetIdRef())) {
            domElement.setAttribute(PolicySetCombinerParametersType.POLICY_SET_ID_REF_ATTRIB_NAME,
                    policySetCombinerParametersType.getPolicySetIdRef());
        }
        super.marshallAttributes(xmlObject, domElement);
    }

}
