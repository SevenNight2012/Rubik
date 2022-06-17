/**
 * Copyright (C) Baidu Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rubik.plugins.basic.exception.module

import com.rubik.plugins.basic.exception.RubikException

/**
 * Thrown when module maven groupId was not set.
 *
 * @since 1.8
 */
internal class RubikModuleMavenGroupNotSetException : RubikException() {
    override fun toString() =
        "RubikModuleMavenGroupNotSetException  please make sure ext.rubik_module_maven_default_group_id in build.gradle of root project!"
}