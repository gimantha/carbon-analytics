/*
 * Copyright (c)  2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.event.simulator.core.exception;

/**
 * customized exception class for uploading non csv files
 */
public class InvalidFileException extends Exception {

    /**
     * Throws customizes exception for uploading invalid files
     *
     * @param message Error Message
     */
    public InvalidFileException(String message) {
        super(message);
    }

    /**
     * Throws customizes exception for uploading invalid files
     *
     * @param message Error Message
     * @param cause   Throwable that caused the InvalidConfigException
     */
    public InvalidFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
