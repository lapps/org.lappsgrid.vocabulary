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
 * Values set in the <em>contains</em> section of a <em>ProcessingStep</em>'s
 * <em>metadata</em>.
 *
 * @author Keith Suderman
 */
public final class Contents
{
   public static class TagSets
   {
      public static final String PENN = "tagset:penn";
      public static final String GATE = "tagset:gate";
      public static final String CLAWS = "tagset:claws";
      public static final String CLAWS5 = "tagset:claws5";
      public static final String CLAWS7 = "tagset:claws7";
      public static final String HEPPLE = "tagset:hepple";
      public static final String BIBER = "tagset:biber";
   }

   public static class Tokenizations
   {
      public static final String ANNIE = "tokenization:annie";
      public static final String STANFORD = "tokenization:stanford";
      public static final String OPENNLP = "tokenization:opennlp";
      public static final String LINGPIPE = "tokenization:lingpipe";
   }

   public static class Chunks
   {
      public static final String SENTENCES = "chunk:sentence";
      public static final String NOUNS = "chunk:noun";
      public static final String VERBS = "chunk:verb";
   }

   private Contents()
   {

   }
}
