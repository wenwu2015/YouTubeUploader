/*
 * Copyright (c) 2013 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.yydw;

import com.google.android.gms.common.Scopes;
import com.google.api.services.youtube.YouTubeScopes;

public class Auth {
    // Register an API key here: https://console.developers.google.com
    //https://console.cloud.google.com/iam-admin/serviceaccounts/project?project=gopro-1330
    //App Engine default service account  的 密钥 ID


    public static final String KEY = "117704397921421911719";

    public static final String[] SCOPES = {Scopes.PROFILE, YouTubeScopes.YOUTUBE};
}
