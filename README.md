org.lappsgrid.vocabulary
========================

Vocabulary used for LAPPS annotations, features, and metadata

### Build Status

[![Master Status](http://grid.anc.org:9080/travis/svg/lapps/org.lappsgrid.vocabulary?branch=master)](https://travis-ci.org/lapps/org.lappsgrid.discriminator)
[![Develop Status](http://grid.anc.org:9080/travis/svg/lapps/org.lappsgrid.vocabulary?branch=develop)](https://travis-ci.org/lapps/org.lappsgrid.discriminator)

## Maven

```xml
<dependency>
    <groupId>org.lappsgrid</groupId>
    <artifactId>vocabulary</artifactId>
    <version>2.0.0</version>
</dependency>    
```

## Usage

Like the [Discriminators](https://github.com/lapps/org.lappsgrid.discriminator) package
the Vocabulary package defines static final constants for URI in the 
[LAPPS Grid Vocabulary](http://vocab.lappsgrid.org).

The main classes are:

- `Annotations` : URI for the annotations defined in the vocabulary.
- `Features` : Allowable features for the each annotation type.
- `Metadata` : Metadata attributes used by the LAPPS Grid.

For example:

```java
Annotation a = new Annotation();
a.setLabel(Annotations.TOKEN);
a.getFeatures().add(Features.Token.PART_OF_SPEECH, "NNP");
```

The use of the Vocabulary classes ensures URI are used consistently and allows IDEs to
 provice code completion and tool-tip help.
 
