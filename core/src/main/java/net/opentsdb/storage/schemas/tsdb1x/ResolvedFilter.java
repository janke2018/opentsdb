// This file is part of OpenTSDB.
// Copyright (C) 2018  The OpenTSDB Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package net.opentsdb.storage.schemas.tsdb1x;

import java.util.List;

/**
 * A container returned at UID resolution type when converting from a
 * query filter to UIDs for building a storage query or comparing keys.
 * 
 * @since 3.0
 */
public interface ResolvedFilter {

  /** @return A non-null tag key UID. */
  public byte[] getTagKey();
  
  /** @return A possible list of tag values if the filter contained
   * literals. Returns null if the filter did not have literals. */
  public List<byte[]> getTagValues();
  
}
