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

import java.util.HashMap;
import java.util.Map;

/**
 * @author Keith Suderman
 */
public final class Annotations
{
   protected static final Map<String,String> index = new HashMap<String, String>();

   private Annotations()
   {

   }

   public static final String SENTENCE = "http://vocab.lappsgrid.org/Sentence";
   public static final String TOKEN = "http://vocab.lappsgrid.org/Token";
   public static final String NE = "http://vocab.lappsgrid.org/NamedEntity";
   public static final String PERSON = "http://vocab.lappsgrid.org/Person";
   public static final String LOCATION = "http://vocab.lappsgrid.org/Location";
   public static final String ORGANIZATION = "http://vocab.lappsgrid.org/Organization";
   public static final String PART_OF_SPEECH = "http://vocab.lappsgrid.org/Token#pos";
   public static final String NOMINAL_COREFERENCE = "http://vocab.lappsgrid.org/alias";
   public static final String PRONOMINAL_CORREFERNCE = "http://vocab.lappsgrid.org/coref";
   public static final String LOOKUP = "http://vocab.lappsgrid.org/Lookup";
   public static final String NCHUNK = "http://vocab.lappsgrid.org/NounChunk";
   public static final String VCHUNK = "http://vocab.lappsgrid.org/VerbChunk";

   static {
      index.put("s", SENTENCE);
      index.put("sent", SENTENCE);
      index.put("tok", TOKEN);
      index.put("word", TOKEN);
      index.put("organization", ORGANIZATION);
   }


   public static String translate(String input)
   {
      String key = input.toLowerCase();
      String result = index.get(key);
      if (result != null)
      {
         return result;
      }
      return key;
   }
}
