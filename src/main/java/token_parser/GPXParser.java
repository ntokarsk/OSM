package token_parser;
// $ANTLR 3.5.2 GPXParser.g 2016-06-04 22:40:22

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;


@SuppressWarnings("all")
public class GPXParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GPXParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GPXParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return GPXParser.tokenNames; }
	@Override public String getGrammarFileName() { return "GPXParser.g"; }


	public static class document_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "document"
	// GPXParser.g:12:1: document : ( declaration !)? element ^;
	public final GPXParser.document_return document() throws RecognitionException {
		GPXParser.document_return retval = new GPXParser.document_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declaration1 =null;
		ParserRuleReturnScope element2 =null;


		try {
			// GPXParser.g:12:10: ( ( declaration !)? element ^)
			// GPXParser.g:12:12: ( declaration !)? element ^
			{
			root_0 = (Object)adaptor.nil();


			// GPXParser.g:12:12: ( declaration !)?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TAG_DECLARATION_OPEN) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// GPXParser.g:12:13: declaration !
					{
					pushFollow(FOLLOW_declaration_in_document54);
					declaration1=declaration();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_element_in_document59);
			element2=element();
			state._fsp--;

			root_0 = (Object)adaptor.becomeRoot(element2.getTree(), root_0);
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "document"


	public static class element_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "element"
	// GPXParser.g:14:1: element : ( startTag ^ ( element | PCDATA )* endTag !| emptyElement ) ;
	public final GPXParser.element_return element() throws RecognitionException {
		GPXParser.element_return retval = new GPXParser.element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PCDATA5=null;
		ParserRuleReturnScope startTag3 =null;
		ParserRuleReturnScope element4 =null;
		ParserRuleReturnScope endTag6 =null;
		ParserRuleReturnScope emptyElement7 =null;

		Object PCDATA5_tree=null;

		try {
			// GPXParser.g:15:5: ( ( startTag ^ ( element | PCDATA )* endTag !| emptyElement ) )
			// GPXParser.g:15:7: ( startTag ^ ( element | PCDATA )* endTag !| emptyElement )
			{
			root_0 = (Object)adaptor.nil();


			// GPXParser.g:15:7: ( startTag ^ ( element | PCDATA )* endTag !| emptyElement )
			int alt3=2;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// GPXParser.g:15:9: startTag ^ ( element | PCDATA )* endTag !
					{
					pushFollow(FOLLOW_startTag_in_element75);
					startTag3=startTag();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(startTag3.getTree(), root_0);
					// GPXParser.g:15:19: ( element | PCDATA )*
					loop2:
					while (true) {
						int alt2=3;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==TAG_START_OPEN) ) {
							alt2=1;
						}
						else if ( (LA2_0==PCDATA) ) {
							alt2=2;
						}

						switch (alt2) {
						case 1 :
							// GPXParser.g:15:20: element
							{
							pushFollow(FOLLOW_element_in_element79);
							element4=element();
							state._fsp--;

							adaptor.addChild(root_0, element4.getTree());

							}
							break;
						case 2 :
							// GPXParser.g:15:30: PCDATA
							{
							PCDATA5=(Token)match(input,PCDATA,FOLLOW_PCDATA_in_element83); 
							PCDATA5_tree = (Object)adaptor.create(PCDATA5);
							adaptor.addChild(root_0, PCDATA5_tree);

							}
							break;

						default :
							break loop2;
						}
					}

					pushFollow(FOLLOW_endTag_in_element88);
					endTag6=endTag();
					state._fsp--;

					}
					break;
				case 2 :
					// GPXParser.g:16:7: emptyElement
					{
					pushFollow(FOLLOW_emptyElement_in_element97);
					emptyElement7=emptyElement();
					state._fsp--;

					adaptor.addChild(root_0, emptyElement7.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "element"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// GPXParser.g:19:1: declaration : TAG_DECLARATION_OPEN GENERIC_ID ( attribute )* TAG_DECLARATION_CLOSE ;
	public final GPXParser.declaration_return declaration() throws RecognitionException {
		GPXParser.declaration_return retval = new GPXParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TAG_DECLARATION_OPEN8=null;
		Token GENERIC_ID9=null;
		Token TAG_DECLARATION_CLOSE11=null;
		ParserRuleReturnScope attribute10 =null;

		Object TAG_DECLARATION_OPEN8_tree=null;
		Object GENERIC_ID9_tree=null;
		Object TAG_DECLARATION_CLOSE11_tree=null;

		try {
			// GPXParser.g:19:14: ( TAG_DECLARATION_OPEN GENERIC_ID ( attribute )* TAG_DECLARATION_CLOSE )
			// GPXParser.g:19:16: TAG_DECLARATION_OPEN GENERIC_ID ( attribute )* TAG_DECLARATION_CLOSE
			{
			root_0 = (Object)adaptor.nil();


			TAG_DECLARATION_OPEN8=(Token)match(input,TAG_DECLARATION_OPEN,FOLLOW_TAG_DECLARATION_OPEN_in_declaration113); 
			TAG_DECLARATION_OPEN8_tree = (Object)adaptor.create(TAG_DECLARATION_OPEN8);
			adaptor.addChild(root_0, TAG_DECLARATION_OPEN8_tree);

			GENERIC_ID9=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_declaration115); 
			GENERIC_ID9_tree = (Object)adaptor.create(GENERIC_ID9);
			adaptor.addChild(root_0, GENERIC_ID9_tree);

			// GPXParser.g:19:48: ( attribute )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==GENERIC_ID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// GPXParser.g:19:48: attribute
					{
					pushFollow(FOLLOW_attribute_in_declaration117);
					attribute10=attribute();
					state._fsp--;

					adaptor.addChild(root_0, attribute10.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			TAG_DECLARATION_CLOSE11=(Token)match(input,TAG_DECLARATION_CLOSE,FOLLOW_TAG_DECLARATION_CLOSE_in_declaration120); 
			TAG_DECLARATION_CLOSE11_tree = (Object)adaptor.create(TAG_DECLARATION_CLOSE11);
			adaptor.addChild(root_0, TAG_DECLARATION_CLOSE11_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class startTag_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "startTag"
	// GPXParser.g:21:1: startTag : TAG_START_OPEN GENERIC_ID ( attribute )* TAG_CLOSE -> ^( ELEMENT GENERIC_ID ( attribute )* ) ;
	public final GPXParser.startTag_return startTag() throws RecognitionException {
		GPXParser.startTag_return retval = new GPXParser.startTag_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TAG_START_OPEN12=null;
		Token GENERIC_ID13=null;
		Token TAG_CLOSE15=null;
		ParserRuleReturnScope attribute14 =null;

		Object TAG_START_OPEN12_tree=null;
		Object GENERIC_ID13_tree=null;
		Object TAG_CLOSE15_tree=null;
		RewriteRuleTokenStream stream_TAG_START_OPEN=new RewriteRuleTokenStream(adaptor,"token TAG_START_OPEN");
		RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");
		RewriteRuleTokenStream stream_TAG_CLOSE=new RewriteRuleTokenStream(adaptor,"token TAG_CLOSE");
		RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");

		try {
			// GPXParser.g:21:10: ( TAG_START_OPEN GENERIC_ID ( attribute )* TAG_CLOSE -> ^( ELEMENT GENERIC_ID ( attribute )* ) )
			// GPXParser.g:21:12: TAG_START_OPEN GENERIC_ID ( attribute )* TAG_CLOSE
			{
			TAG_START_OPEN12=(Token)match(input,TAG_START_OPEN,FOLLOW_TAG_START_OPEN_in_startTag129);  
			stream_TAG_START_OPEN.add(TAG_START_OPEN12);

			GENERIC_ID13=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_startTag131);  
			stream_GENERIC_ID.add(GENERIC_ID13);

			// GPXParser.g:21:38: ( attribute )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==GENERIC_ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// GPXParser.g:21:38: attribute
					{
					pushFollow(FOLLOW_attribute_in_startTag133);
					attribute14=attribute();
					state._fsp--;

					stream_attribute.add(attribute14.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			TAG_CLOSE15=(Token)match(input,TAG_CLOSE,FOLLOW_TAG_CLOSE_in_startTag136);  
			stream_TAG_CLOSE.add(TAG_CLOSE15);

			// AST REWRITE
			// elements: attribute, GENERIC_ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 22:9: -> ^( ELEMENT GENERIC_ID ( attribute )* )
			{
				// GPXParser.g:22:12: ^( ELEMENT GENERIC_ID ( attribute )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELEMENT, "ELEMENT"), root_1);
				adaptor.addChild(root_1, stream_GENERIC_ID.nextNode());
				// GPXParser.g:22:33: ( attribute )*
				while ( stream_attribute.hasNext() ) {
					adaptor.addChild(root_1, stream_attribute.nextTree());
				}
				stream_attribute.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "startTag"


	public static class attribute_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attribute"
	// GPXParser.g:25:1: attribute : GENERIC_ID ATTR_EQ ATTR_VALUE -> ^( ATTRIBUTE GENERIC_ID ATTR_VALUE ) ;
	public final GPXParser.attribute_return attribute() throws RecognitionException {
		GPXParser.attribute_return retval = new GPXParser.attribute_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GENERIC_ID16=null;
		Token ATTR_EQ17=null;
		Token ATTR_VALUE18=null;

		Object GENERIC_ID16_tree=null;
		Object ATTR_EQ17_tree=null;
		Object ATTR_VALUE18_tree=null;
		RewriteRuleTokenStream stream_ATTR_VALUE=new RewriteRuleTokenStream(adaptor,"token ATTR_VALUE");
		RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");
		RewriteRuleTokenStream stream_ATTR_EQ=new RewriteRuleTokenStream(adaptor,"token ATTR_EQ");

		try {
			// GPXParser.g:25:11: ( GENERIC_ID ATTR_EQ ATTR_VALUE -> ^( ATTRIBUTE GENERIC_ID ATTR_VALUE ) )
			// GPXParser.g:25:13: GENERIC_ID ATTR_EQ ATTR_VALUE
			{
			GENERIC_ID16=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_attribute168);  
			stream_GENERIC_ID.add(GENERIC_ID16);

			ATTR_EQ17=(Token)match(input,ATTR_EQ,FOLLOW_ATTR_EQ_in_attribute170);  
			stream_ATTR_EQ.add(ATTR_EQ17);

			ATTR_VALUE18=(Token)match(input,ATTR_VALUE,FOLLOW_ATTR_VALUE_in_attribute172);  
			stream_ATTR_VALUE.add(ATTR_VALUE18);

			// AST REWRITE
			// elements: ATTR_VALUE, GENERIC_ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 25:43: -> ^( ATTRIBUTE GENERIC_ID ATTR_VALUE )
			{
				// GPXParser.g:25:46: ^( ATTRIBUTE GENERIC_ID ATTR_VALUE )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_1);
				adaptor.addChild(root_1, stream_GENERIC_ID.nextNode());
				adaptor.addChild(root_1, stream_ATTR_VALUE.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attribute"


	public static class endTag_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "endTag"
	// GPXParser.g:27:1: endTag : TAG_END_OPEN GENERIC_ID TAG_CLOSE ;
	public final GPXParser.endTag_return endTag() throws RecognitionException {
		GPXParser.endTag_return retval = new GPXParser.endTag_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TAG_END_OPEN19=null;
		Token GENERIC_ID20=null;
		Token TAG_CLOSE21=null;

		Object TAG_END_OPEN19_tree=null;
		Object GENERIC_ID20_tree=null;
		Object TAG_CLOSE21_tree=null;

		try {
			// GPXParser.g:27:9: ( TAG_END_OPEN GENERIC_ID TAG_CLOSE )
			// GPXParser.g:27:11: TAG_END_OPEN GENERIC_ID TAG_CLOSE
			{
			root_0 = (Object)adaptor.nil();


			TAG_END_OPEN19=(Token)match(input,TAG_END_OPEN,FOLLOW_TAG_END_OPEN_in_endTag192); 
			TAG_END_OPEN19_tree = (Object)adaptor.create(TAG_END_OPEN19);
			adaptor.addChild(root_0, TAG_END_OPEN19_tree);

			GENERIC_ID20=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_endTag194); 
			GENERIC_ID20_tree = (Object)adaptor.create(GENERIC_ID20);
			adaptor.addChild(root_0, GENERIC_ID20_tree);

			TAG_CLOSE21=(Token)match(input,TAG_CLOSE,FOLLOW_TAG_CLOSE_in_endTag196); 
			TAG_CLOSE21_tree = (Object)adaptor.create(TAG_CLOSE21);
			adaptor.addChild(root_0, TAG_CLOSE21_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "endTag"


	public static class emptyElement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "emptyElement"
	// GPXParser.g:29:1: emptyElement : TAG_START_OPEN GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE -> ^( ELEMENT GENERIC_ID ( attribute )* ) ;
	public final GPXParser.emptyElement_return emptyElement() throws RecognitionException {
		GPXParser.emptyElement_return retval = new GPXParser.emptyElement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TAG_START_OPEN22=null;
		Token GENERIC_ID23=null;
		Token TAG_EMPTY_CLOSE25=null;
		ParserRuleReturnScope attribute24 =null;

		Object TAG_START_OPEN22_tree=null;
		Object GENERIC_ID23_tree=null;
		Object TAG_EMPTY_CLOSE25_tree=null;
		RewriteRuleTokenStream stream_TAG_START_OPEN=new RewriteRuleTokenStream(adaptor,"token TAG_START_OPEN");
		RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");
		RewriteRuleTokenStream stream_TAG_EMPTY_CLOSE=new RewriteRuleTokenStream(adaptor,"token TAG_EMPTY_CLOSE");
		RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");

		try {
			// GPXParser.g:29:14: ( TAG_START_OPEN GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE -> ^( ELEMENT GENERIC_ID ( attribute )* ) )
			// GPXParser.g:29:16: TAG_START_OPEN GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE
			{
			TAG_START_OPEN22=(Token)match(input,TAG_START_OPEN,FOLLOW_TAG_START_OPEN_in_emptyElement204);  
			stream_TAG_START_OPEN.add(TAG_START_OPEN22);

			GENERIC_ID23=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_emptyElement206);  
			stream_GENERIC_ID.add(GENERIC_ID23);

			// GPXParser.g:29:42: ( attribute )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==GENERIC_ID) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// GPXParser.g:29:42: attribute
					{
					pushFollow(FOLLOW_attribute_in_emptyElement208);
					attribute24=attribute();
					state._fsp--;

					stream_attribute.add(attribute24.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			TAG_EMPTY_CLOSE25=(Token)match(input,TAG_EMPTY_CLOSE,FOLLOW_TAG_EMPTY_CLOSE_in_emptyElement211);  
			stream_TAG_EMPTY_CLOSE.add(TAG_EMPTY_CLOSE25);

			// AST REWRITE
			// elements: GENERIC_ID, attribute
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 30:9: -> ^( ELEMENT GENERIC_ID ( attribute )* )
			{
				// GPXParser.g:30:12: ^( ELEMENT GENERIC_ID ( attribute )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELEMENT, "ELEMENT"), root_1);
				adaptor.addChild(root_1, stream_GENERIC_ID.nextNode());
				// GPXParser.g:30:33: ( attribute )*
				while ( stream_attribute.hasNext() ) {
					adaptor.addChild(root_1, stream_attribute.nextTree());
				}
				stream_attribute.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "emptyElement"

	// Delegated rules


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\20\2\7\1\4\2\uffff\1\5\1\7";
	static final String DFA3_maxS =
		"\1\20\1\7\1\16\1\4\2\uffff\1\5\1\16";
	static final String DFA3_acceptS =
		"\4\uffff\1\1\1\2\2\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\3\uffff\1\4\2\uffff\1\5",
			"\1\6",
			"",
			"",
			"\1\7",
			"\1\3\3\uffff\1\4\2\uffff\1\5"
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "15:7: ( startTag ^ ( element | PCDATA )* endTag !| emptyElement )";
		}
	}

	public static final BitSet FOLLOW_declaration_in_document54 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_element_in_document59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_startTag_in_element75 = new BitSet(new long[]{0x0000000000018400L});
	public static final BitSet FOLLOW_element_in_element79 = new BitSet(new long[]{0x0000000000018400L});
	public static final BitSet FOLLOW_PCDATA_in_element83 = new BitSet(new long[]{0x0000000000018400L});
	public static final BitSet FOLLOW_endTag_in_element88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyElement_in_element97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_DECLARATION_OPEN_in_declaration113 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_GENERIC_ID_in_declaration115 = new BitSet(new long[]{0x0000000000001080L});
	public static final BitSet FOLLOW_attribute_in_declaration117 = new BitSet(new long[]{0x0000000000001080L});
	public static final BitSet FOLLOW_TAG_DECLARATION_CLOSE_in_declaration120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_START_OPEN_in_startTag129 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_GENERIC_ID_in_startTag131 = new BitSet(new long[]{0x0000000000000880L});
	public static final BitSet FOLLOW_attribute_in_startTag133 = new BitSet(new long[]{0x0000000000000880L});
	public static final BitSet FOLLOW_TAG_CLOSE_in_startTag136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERIC_ID_in_attribute168 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ATTR_EQ_in_attribute170 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ATTR_VALUE_in_attribute172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_END_OPEN_in_endTag192 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_GENERIC_ID_in_endTag194 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TAG_CLOSE_in_endTag196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_START_OPEN_in_emptyElement204 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_GENERIC_ID_in_emptyElement206 = new BitSet(new long[]{0x0000000000004080L});
	public static final BitSet FOLLOW_attribute_in_emptyElement208 = new BitSet(new long[]{0x0000000000004080L});
	public static final BitSet FOLLOW_TAG_EMPTY_CLOSE_in_emptyElement211 = new BitSet(new long[]{0x0000000000000002L});
}
