package revision.qa;

public class StringLogestParagraph {
	
	public class MaxWordSentenceFinder {

	    public static void main(String[] args) {
	        String paragraph = "This is the first statement. Here is another, which is slightly longer.Finally, this is the longest statement in terms of word count in this paragraph.";

	        Result result = findMaxWordSentence(paragraph);

	        if (result != null) {
	            System.out.println("Sentence with max words:");
	            System.out.println("\"" + result.sentence + "\"");
	            System.out.println("Word count: " + result.wordCount);
	        } else {
	            System.out.println("No valid sentences found.");
	        }
	    }

	    /**
	     * Finds the sentence with the maximum word count in the given paragraph.
	     * A sentence is delimited by '.', '!' or '?'.
	     */
	    public static Result findMaxWordSentence(String paragraph) {
	       // if (paragraph == null || paragraph.isEmpty()) return null;

	        // Normalize: ensure a space after sentence-ending punctuation if missing
	        // e.g., "... longer.Finally, ..." -> "... longer. Finally, ..."
	       // String normalized = paragraph.replaceAll("([.!?])(\\S)", "$1 $2");

	        // Split on '.', '!' or '?' keeping it simple (no lookbehind needed)
	        String[] sentences = paragraph.split("[.!?]");

	        
	        
	        String bestSentence = null;
	        int maxWords = -1;

	        for (String raw : sentences) {
	            String sentence = raw.trim();
	            if (sentence.isEmpty()) continue;

	            // Split on one or more whitespace characters to count words
	            String[] words = sentence.split("\\s+");
	            int count = (sentence.isEmpty() ? 0 : words.length);

	            if (count > maxWords) {
	                maxWords = count;
	                bestSentence = sentence;
	            }
	        }

	        return (bestSentence == null) ? null : new Result(bestSentence, maxWords);
	    }

	    /** Simple DTO to return sentence and its word count. */
	    public static class Result {
	        final String sentence;
	        final int wordCount;

	        Result(String sentence, int wordCount) {
	            this.sentence = sentence;
	            this.wordCount = wordCount;
	        }
	    }
	}

}
