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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.hadoop.rdf.io.output;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.OutputFormat;
import org.apache.jena.hadoop.rdf.types.QuadWritable;
import org.apache.jena.riot.Lang;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests for JSON-LD output format
 */
public class JsonLdQuadOutputTest extends AbstractQuadOutputFormatTests {

    @Override
    protected String getFileExtension() {
        return ".jsonld";
    }

    @Override
    protected Lang getRdfLanguage() {
        return Lang.JSONLD;
    }

    @Override
    protected OutputFormat<NullWritable, QuadWritable> getOutputFormat() {
        return new JsonLDQuadOutputFormat<NullWritable>();
    }

    @Override
    @Test
    @Ignore //Ignored because of JENA-813 performance effect being compounded due to the nature of how JSON-LD is written
    public void output_03() throws IOException, InterruptedException {
        // TODO Auto-generated method stub
        super.output_03();
    }

    @Override
    @Test
    @Ignore //Ignored because of JENA-813 performance effect being compounded due to the nature of how JSON-LD is written
    public void output_04() throws IOException, InterruptedException {
        // TODO Auto-generated method stub
        super.output_04();
    }

}
