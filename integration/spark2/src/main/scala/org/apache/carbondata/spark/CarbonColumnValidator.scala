/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.carbondata.spark

import org.apache.carbondata.core.carbon.metadata.schema.table.column.ColumnSchema
import org.apache.carbondata.spark.exception.MalformedCarbonCommandException

 /**
  * Carbon column validator
  */
class CarbonColumnValidator extends ColumnValidator {
  def validateColumns(allColumns: Seq[ColumnSchema]): Unit = {
    allColumns.foreach { columnSchema =>
      val colWithSameId = allColumns.filter { x =>
        x.getColumnUniqueId.equals(columnSchema.getColumnUniqueId)
      }
      if (colWithSameId.size > 1) {
        throw new MalformedCarbonCommandException("Two column can not have same columnId")
      }
    }
  }
}
