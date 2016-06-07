package token_parser;
// $ANTLR 3.5.2 GPXTreeParser.g 2016-06-04 22:40:30

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GPXTreeParser extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTR_EQ", "ATTR_VALUE", "DIGIT", 
		"GENERIC_ID", "LETTER", "NAMECHAR", "PCDATA", "TAG_CLOSE", "TAG_DECLARATION_CLOSE", 
		"TAG_DECLARATION_OPEN", "TAG_EMPTY_CLOSE", "TAG_END_OPEN", "TAG_START_OPEN", 
		"WS", "ATTRIBUTE", "ELEMENT"
	};
	public static final int EOF=-1;
	public static final int ATTR_EQ=4;
	public static final int ATTR_VALUE=5;
	public static final int DIGIT=6;
	public static final int GENERIC_ID=7;
	public static final int LETTER=8;
	public static final int NAMECHAR=9;
	public static final int PCDATA=10;
	public static final int TAG_CLOSE=11;
	public static final int TAG_DECLARATION_CLOSE=12;
	public static final int TAG_DECLARATION_OPEN=13;
	public static final int TAG_EMPTY_CLOSE=14;
	public static final int TAG_END_OPEN=15;
	public static final int TAG_START_OPEN=16;
	public static final int WS=17;
	public static final int ATTRIBUTE=18;
	public static final int ELEMENT=19;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public GPXTreeParser(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public GPXTreeParser(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GPXTreeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "GPXTreeParser.g"; }



	// $ANTLR start "document"
	// GPXTreeParser.g:7:1: document : element ;
	public final void document() throws RecognitionException {
		try {
			// GPXTreeParser.g:7:10: ( element )
			// GPXTreeParser.g:7:12: element
			{
			pushFollow(FOLLOW_element_in_document38);
			element();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "document"



	// $ANTLR start "element"
	// GPXTreeParser.g:9:1: element : ^( ELEMENT name= GENERIC_ID ( ^( ATTRIBUTE attrName= GENERIC_ID value= ATTR_VALUE ) )* ( element |text= PCDATA )* ) ;
	public final void element() throws RecognitionException {
		Tree name=null;
		Tree attrName=null;
		Tree value=null;
		Tree text=null;

		try {
			// GPXTreeParser.g:10:5: ( ^( ELEMENT name= GENERIC_ID ( ^( ATTRIBUTE attrName= GENERIC_ID value= ATTR_VALUE ) )* ( element |text= PCDATA )* ) )
			// GPXTreeParser.g:10:7: ^( ELEMENT name= GENERIC_ID ( ^( ATTRIBUTE attrName= GENERIC_ID value= ATTR_VALUE ) )* ( element |text= PCDATA )* )
			{
			match(input,ELEMENT,FOLLOW_ELEMENT_in_element53); 
			match(input, Token.DOWN, null); 
			name=(Tree)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_element57); 
			 System.out.print("<"+(name!=null?name.getText():null)); 
			// GPXTreeParser.g:12:13: ( ^( ATTRIBUTE attrName= GENERIC_ID value= ATTR_VALUE ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ATTRIBUTE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// GPXTreeParser.g:13:17: ^( ATTRIBUTE attrName= GENERIC_ID value= ATTR_VALUE )
					{
					match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_element104); 
					match(input, Token.DOWN, null); 
					attrName=(Tree)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_element108); 
					value=(Tree)match(input,ATTR_VALUE,FOLLOW_ATTR_VALUE_in_element112); 
					match(input, Token.UP, null); 

					 System.out.print(" "+(attrName!=null?attrName.getText():null)+"="+(value!=null?value.getText():null)); 
					}
					break;

				default :
					break loop1;
				}
			}

			 System.out.println(">"); 
			// GPXTreeParser.g:17:13: ( element |text= PCDATA )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ELEMENT) ) {
					alt2=1;
				}
				else if ( (LA2_0==PCDATA) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// GPXTreeParser.g:17:14: element
					{
					pushFollow(FOLLOW_element_in_element175);
					element();
					state._fsp--;

					}
					break;
				case 2 :
					// GPXTreeParser.g:18:15: text= PCDATA
					{
					text=(Tree)match(input,PCDATA,FOLLOW_PCDATA_in_element193); 
					 System.out.print((text!=null?text.getText():null)); 
					}
					break;

				default :
					break loop2;
				}
			}

			 System.out.println("</"+(name!=null?name.getText():null)+">"); 
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "element"

	// Delegated rules



	public static final BitSet FOLLOW_element_in_document38 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELEMENT_in_element53 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GENERIC_ID_in_element57 = new BitSet(new long[]{0x00000000000C0408L});
	public static final BitSet FOLLOW_ATTRIBUTE_in_element104 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GENERIC_ID_in_element108 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ATTR_VALUE_in_element112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_element_in_element175 = new BitSet(new long[]{0x0000000000080408L});
	public static final BitSet FOLLOW_PCDATA_in_element193 = new BitSet(new long[]{0x0000000000080408L});
}
