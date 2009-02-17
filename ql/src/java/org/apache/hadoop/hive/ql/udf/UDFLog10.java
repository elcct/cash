/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql.udf;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hive.ql.exec.UDF;


public class UDFLog10 extends UDF {

  private static Log LOG = LogFactory.getLog(UDFLog10.class.getName());

  private static double log10 = Math.log(10.0);
  public UDFLog10() {
  }

  /**
   * Returns the logarithm of "a" with base 10.
   */
  public Double evaluate(Double a)  {
    if (a == null || a <= 0.0) {
      return null;
    } else {
      return Double.valueOf(Math.log(a)/log10);
    }
  }

}