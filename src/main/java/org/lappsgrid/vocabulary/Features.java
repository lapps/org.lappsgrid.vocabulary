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
public class Features
{
   private Features()
   {

   }

//   public static final String PART_OF_SPEECH = "pos";
//   public static final String LEMMA = "lemma";
//   public static final String WORD = "word";
//   public static final String CATEGORY = "category";
//   public static final String NER = "ner";

   public static class Token
   {
      public static final String ID = "id";
      public static final String START = "start";
      public static final String END = "end";
      public static final String PART_OF_SPEECH = "pos";
      public static final String LEMMA = "lemma";
      public static final String WORD = "string";
      public static final String TYPE = "type";
      public static final String ORTH = "orth";
      public static final String NER = "namedEntity";

   }

   public static class Sentence
   {
      public static final String ID = "id";
      public static final String START = "start";
      public static final String END = "end";
      public static final String TYPE = "type";
   }
}
