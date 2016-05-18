/*
 * DO NOT EDIT THIS FILE.
 *
 * This file is machine generated and any edits will be lost the next
 * time the file is generated. Use the https://github.com/lapps/vocabulary-pages
 * project to make changes.
 */

package org.lappsgrid.vocabulary;

public class Features {
   private Features() { }

   public static class Thing {
      public static final String ALTERNATE_NAME = "alternateName";
   }

   public static class Annotation extends Thing {
      public static final String ID = "id";
   }

   public static class Region extends Annotation {
      public static final String TARGETS = "targets";
      public static final String START = "start";
      public static final String END = "end";
   }

   public static class Relation extends Annotation {
      public static final String LABEL = "label";
   }

   public static class GenericRelation extends Relation {
      public static final String RELATION = "relation";
      public static final String ARGUMENTS = "arguments";
   }

   public static class SemanticRole extends Relation {
      public static final String HEAD = "head";
      public static final String ARGUMENT = "argument";
   }

   public static class Paragraph extends Region {
   }

   public static class Sentence extends Region {
      public static final String TYPE = "sentenceType";
   }

   public static class NounChunk extends Region {
   }

   public static class VerbChunk extends Region {
      public static final String TYPE = "vcType";
      public static final String TENSE = "tense";
      public static final String VOICE = "voice";
      public static final String NEG = "neg";
   }

   public static class NamedEntity extends Region {
      public static final String CATEGORY = "category";
   }

   public static class Date extends NamedEntity {
      public static final String TYPE = "dateType";
   }

   public static class Location extends NamedEntity {
      public static final String TYPE = "locType";
   }

   public static class Organization extends NamedEntity {
      public static final String TYPE = "orgType";
   }

   public static class Person extends NamedEntity {
      public static final String GENDER = "gender";
   }

   public static class Token extends Region {
      public static final String PART_OF_SPEECH = "pos";
      public static final String POS = "pos";
      public static final String LEMMA = "lemma";
      public static final String TYPE = "tokenType";
      public static final String ORTH = "orth";
      public static final String LENGTH = "length";
      public static final String WORD = "word";
   }

   public static class Coreference extends Annotation {
      public static final String MENTIONS = "mentions";
      public static final String REPRESENTATIVE = "representative";
   }

   public static class Markable extends Region {
   }

   public static class PhraseStructure extends Annotation {
      public static final String CONSTITUENTS = "constituents";
      public static final String ROOT = "root";
   }

   public static class Constituent extends Relation {
      public static final String PARENT = "parent";
      public static final String CHILDREN = "children";
   }

   public static class DependencyStructure extends Annotation {
      public static final String TYPE = "dependencyType";
      public static final String DEPENDENCIES = "dependencies";
   }

   public static class Dependency extends Relation {
      public static final String GOVERNOR = "governor";
      public static final String DEPENDENT = "dependent";
   }

   public static class Document extends Thing {
      public static final String ID = "id";
      public static final String SOURCE = "source";
      public static final String TYPE = "sourceType";
      public static final String ENCODING = "encoding";
      public static final String LANGUAGE = "language";
   }

   public static class TextDocument extends Document {
   }

   public static class AudioDocument extends Document {
   }

}
