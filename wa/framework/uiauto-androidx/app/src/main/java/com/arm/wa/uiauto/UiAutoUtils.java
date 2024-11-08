/*    Copyright 2013-2024 ARM Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package com.arm.wa.uiauto;

import android.os.Bundle;

public final class UiAutoUtils {

    /** Construct launch command of an application. */
    public static String createLaunchCommand(Bundle parameters) {
        String launchCommand;
        String activityName = parameters.getString("launch_activity");
        String packageName = parameters.getString("package_name");
        if (activityName.equals("None")) {
            launchCommand = String.format("am start --user -3 %s", packageName);
        }
        else {
            launchCommand = String.format("am start --user -3 -n %s/%s", packageName, activityName);
        }
        return launchCommand;
    }
}
