/*
 * Copyright (c) 2016 by European Commission
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * http://www.osor.eu/eupl/european-union-public-licence-eupl-v.1.1
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 *
 * This product combines work with different licenses. See the "NOTICE" text
 * file for details on the various modules and licenses.
 * The "NOTICE" text file is part of the distribution. Any derivative works
 * that you distribute must include a readable copy of the "NOTICE" text file.
 *
 */

function submitIdpChoiceAction() {
    var idpForm = document.getElementsByName('redirectForm')[0];
    idpForm.action = document.getElementById("idpList").value;
    document.getElementsByName('redirectForm')[0].submit();
}

function init_idpRedirect() {
    var buttonSubmitIdp = document.getElementById("submit_idp_choice");
    buttonSubmitIdp.addEventListener("click", function () {
        submitIdpChoiceAction()
    });
}

init_idpRedirect();