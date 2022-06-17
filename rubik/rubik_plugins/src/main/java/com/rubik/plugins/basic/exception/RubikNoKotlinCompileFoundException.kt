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
package com.rubik.plugins.basic.exception

/**
 * Thrown when can not find kotlin compile task.
 *
 * @since 1.6
 */
internal class RubikNoKotlinCompileFoundException(private val variant:String?) : RubikException(){
    override fun toString() =
        "RubikNoKaptTaskFoundException can not find kotlin compile task for variant[$variant]，make sure your project has kotlin support!"
}