/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
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

package com.mongodb.client.model;

/**
 * The options for updating all documents that matches the query criteria.
 *
 * @since 3.0
 * @mongodb.driver.manual manual/tutorial/modify-documents/ Updates
 * @mongodb.driver.manual manual/reference/operator/update/ Update Operators
 */
public final class UpdateManyOptions {
    private boolean upsert;

    /**
     * Returns true if a new document should be inserted if there are no matches to the query criteria.  The default is false.
     *
     * @return true if a new document should be inserted if there are no matches to the query criteria
     */
    public boolean isUpsert() {
        return upsert;
    }

    /**
     * Set to true if a new document should be inserted if there are no matches to the query criteria.
     *
     * @param upsert true if a new document should be inserted if there are no matches to the query criteria
     * @return this
     */
    public UpdateManyOptions upsert(final boolean upsert) {
        this.upsert = upsert;
        return this;
    }
}