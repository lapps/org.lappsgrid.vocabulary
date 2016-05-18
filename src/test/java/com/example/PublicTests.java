package com.example;

import org.junit.Test;
import org.lappsgrid.vocabulary.Annotations;
import org.lappsgrid.vocabulary.Contents;
import org.lappsgrid.vocabulary.Features;
import org.lappsgrid.vocabulary.Metadata;

/**
 * @author Keith Suderman
 */
public class PublicTests
{
	public PublicTests()
	{

	}

	@Test
	public void visibilityTest()
	{
		// These shouldn't even compile if the visibility is not public.
		// The classes may not be public due to copy/paste errors when the
		// classes are updated (semi-)automatically
		String s = Features.Token.POS;
		s = Annotations.TOKEN;
		s = Contents.TagSets.GATE;
		s = Metadata.Contains.PRODUCER;
	}
}
