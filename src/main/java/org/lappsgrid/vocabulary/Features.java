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

   public static class Thing
   {
      public static final String ALTERNATE_NAME = "alternateName";
   }

   public static class Annotation extends Thing
   {
      public static final String ID = "id";
   }

   public static class Span extends Annotation
   {
      public static final String START = "start";
      public static final String END = "end";
   }

   public static class Sentence extends Span
   {
      public static final String TYPE = "sentenceType";
   }

   public static class Token extends Span
   {
      public static final String PART_OF_SPEECH = "pos";
      public static final String LEMMA = "lemma";
      public static final String WORD = "word";
      public static final String TYPE = "type";
      public static final String ORTH = "orth";
      public static final String NER = "namedEntity";
   }

   public static class NamedEntity extends Span {}

   public static class Date extends NamedEntity
   {
      public static final String Type = "dateType";
   }

   public static class Location extends NamedEntity
   {
      public static final String TYPE = "locType";
   }

   public static class Organization extends NamedEntity
   {
      public static final String TYPE = "orgType";
   }

   public static class Person extends NamedEntity
   {
      public static final String GENDER = "gender";
   }

   public static class Markable extends Span
   {
      public static final String TARGETS = "targets";
   }

   public static class Constituent extends Span
   {
      public static final String LABEL = "label";
      public static final String CHILDREN = "children";
   }

   public static class Coreference extends Span
   {
      public static final String MENTIONS = "mentions";
      public static final String REPRESENTATIVE = "representative";
   }

   public static class PhraseStructure extends Span
   {
      public static final String CATEGORY_SET = "categorySet";
      public static final String CONSTITUENTS = "constituents";
   }

   public static class DependencyStructure extends Span
   {
      public static final String TYPE = "dependencyType";
      public static final String DEPENDENCIES = "dependencies";
   }

   public static class Document extends Annotation
   {
      public static final String SOURCE = "source";
      public static final String TYPE = "sourceType";
      public static final String ENCODING = "encoding";
      public static final String LANGUAGE = "language";
   }

   public static class TextDocument extends Document
   {
   }

   public static class AudioDocument extends Document
   {
   }
}
