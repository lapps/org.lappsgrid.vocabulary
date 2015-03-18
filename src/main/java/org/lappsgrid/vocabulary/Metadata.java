/*-
 * Copyright 2014 The Language Application Grid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.lappsgrid.vocabulary;

/**
 * @author Keith Suderman
 */
public final class Metadata
{
   private Metadata()
   {

   }

   public static class Contains
   {
      public static final String URL = "url";
      public static final String PRODUCER = "producer";
      public static final String TYPE = "type";
   }

   // These type definitions assume that the "type" prefix has been
   // defined in the LAPPS JSON-LD @context.
   public static class Types
   {
      public static final String TOKENIZATION = "type:tokenization";
      public static final String PART_OF_SPEECH = "type:part-of-speech";
      public static final String NAMED_ENTITIES = "type:named-entities";
      public static final String COREFERENCE = "type:coreference";
      public static final String SENTENCE = "type:sentence";
      public static final String LOOKUP = "type:lookup";
   }
}
