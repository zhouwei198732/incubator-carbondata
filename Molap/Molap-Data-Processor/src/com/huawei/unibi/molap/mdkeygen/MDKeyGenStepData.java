/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huawei.unibi.molap.mdkeygen;

import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

import com.huawei.unibi.molap.keygenerator.KeyGenerator;

/**
 * Project Name 	: Carbon 
 * Module Name 		: MOLAP Data Processor
 * Author 			: Suprith T 72079 
 * Created Date 	: 25-Aug-2015
 * FileName 		: MDKeyGenStep.java
 * Description 		: Kettle step data to generate MD Key
 * Class Version 	: 1.0
 */
public class MDKeyGenStepData extends BaseStepData implements
        StepDataInterface
{
    /**
     * outputRowMeta
     */
    protected RowMetaInterface outputRowMeta;
    
    /**
     * rowMeta
     */
  //  protected RowMetaInterface rowMeta;
    
    /**
     * generator for each column independently
     */
    protected KeyGenerator[] generator;
    
    /**
     * precomputed default objects
     */
    // public Object[] defaultObjects;

    /**
     * the size of the input rows
     */
    // public int inputSize;

    /**
     * where the key field indexes are
     */
    // public int[] keyFieldIndex;

    /**
     * meta info for a string conversion
     */
    // public ValueMetaInterface[] conversionMeta;
    
}