/*
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
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * ODPS Datahub服务用于上传、下载数据到ODPS
 *
 * <p>
 * Examples:
 *
 * <ul>
 * <li>
 * <code><pre>
 * Account account = new AliyunAccount("accessId", "accessKey");
 * Odps odps = new Odps(account);
 * odps.setDefaultProject("my_project");
 *
 * DatahubClient client = new DatahubClient(odps);
 * DatahubReader reader = client.openDatahubReader("shardId");
 * DatahubWriter writer = client.openDatahubWriter("shardId");
 * ....
 * </pre></code>
 * </li></ul>
 * <p>
 */
package com.aliyun.odps.datahub;

