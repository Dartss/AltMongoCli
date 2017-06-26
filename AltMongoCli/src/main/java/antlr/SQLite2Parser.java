package antlr;// Generated from SQLite2.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLite2Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_CREATE=50, K_CROSS=51, K_CURRENT_DATE=52, K_CURRENT_TIME=53, K_CURRENT_TIMESTAMP=54, 
		K_DATABASE=55, K_DEFAULT=56, K_DEFERRABLE=57, K_DEFERRED=58, K_DELETE=59, 
		K_DESC=60, K_DETACH=61, K_DISTINCT=62, K_DROP=63, K_EACH=64, K_ELSE=65, 
		K_END=66, K_ESCAPE=67, K_EXCEPT=68, K_EXCLUSIVE=69, K_EXISTS=70, K_EXPLAIN=71, 
		K_FAIL=72, K_FOR=73, K_FOREIGN=74, K_FROM=75, K_FULL=76, K_GLOB=77, K_GROUP=78, 
		K_HAVING=79, K_IF=80, K_IGNORE=81, K_IMMEDIATE=82, K_IN=83, K_INDEX=84, 
		K_INDEXED=85, K_INITIALLY=86, K_INNER=87, K_INSERT=88, K_INSTEAD=89, K_INTERSECT=90, 
		K_INTO=91, K_IS=92, K_ISNULL=93, K_JOIN=94, K_KEY=95, K_LEFT=96, K_LIKE=97, 
		K_LIMIT=98, K_MATCH=99, K_NATURAL=100, K_NO=101, K_NOT=102, K_NOTNULL=103, 
		K_NULL=104, K_OF=105, K_OFFSET=106, K_ON=107, K_OR=108, K_ORDER=109, K_OUTER=110, 
		K_PLAN=111, K_PRAGMA=112, K_PRIMARY=113, K_QUERY=114, K_RAISE=115, K_RECURSIVE=116, 
		K_REFERENCES=117, K_REGEXP=118, K_REINDEX=119, K_RELEASE=120, K_RENAME=121, 
		K_REPLACE=122, K_RESTRICT=123, K_RIGHT=124, K_ROLLBACK=125, K_ROW=126, 
		K_SAVEPOINT=127, K_SELECT=128, K_SET=129, K_TABLE=130, K_TEMP=131, K_TEMPORARY=132, 
		K_THEN=133, K_TO=134, K_TRANSACTION=135, K_TRIGGER=136, K_UNION=137, K_UNIQUE=138, 
		K_UPDATE=139, K_USING=140, K_VACUUM=141, K_VALUES=142, K_VIEW=143, K_VIRTUAL=144, 
		K_WHEN=145, K_WHERE=146, K_WITH=147, K_WITHOUT=148, IDENTIFIER=149, STRING_VALUE=150, 
		NUMERIC_LITERAL=151, BIND_PARAMETER=152, STRING_LITERAL=153, BLOB_LITERAL=154, 
		SINGLE_LINE_COMMENT=155, MULTILINE_COMMENT=156, SPACES=157, UNEXPECTED_CHAR=158;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
		"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
		"'>'", "'>='", "'=='", "'!='", "'<>'", "K_ABORT", "K_ACTION", "K_ADD", 
		"K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", 
		"K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", 
		"K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", 
		"K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", 
		"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", 
		"K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", 
		"K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", 
		"K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", 
		"K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", 
		"K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", 
		"K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
		"K_MATCH", "K_NATURAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
		"K_OFFSET", "K_ON", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", 
		"K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", 
		"K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", 
		"K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", 
		"K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", 
		"K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", 
		"K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", 
		"STRING_VALUE", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
		"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR"
	};
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_index_stmt = 10, RULE_create_table_stmt = 11, RULE_create_trigger_stmt = 12, 
		RULE_create_view_stmt = 13, RULE_create_virtual_table_stmt = 14, RULE_delete_stmt = 15, 
		RULE_delete_stmt_limited = 16, RULE_detach_stmt = 17, RULE_drop_index_stmt = 18, 
		RULE_drop_table_stmt = 19, RULE_drop_trigger_stmt = 20, RULE_drop_view_stmt = 21, 
		RULE_factored_select_stmt = 22, RULE_insert_stmt = 23, RULE_pragma_stmt = 24, 
		RULE_reindex_stmt = 25, RULE_release_stmt = 26, RULE_rollback_stmt = 27, 
		RULE_savepoint_stmt = 28, RULE_simple_select_stmt = 29, RULE_select_stmt = 30, 
		RULE_select_or_values = 31, RULE_update_stmt = 32, RULE_update_stmt_limited = 33, 
		RULE_vacuum_stmt = 34, RULE_column_def = 35, RULE_type_name = 36, RULE_column_constraint = 37, 
		RULE_conflict_clause = 38, RULE_expr = 39, RULE_target_name = 40, RULE_foreign_key_clause = 41, 
		RULE_raise_function = 42, RULE_indexed_column = 43, RULE_table_constraint = 44, 
		RULE_with_clause = 45, RULE_qualified_table_name = 46, RULE_ordering_term = 47, 
		RULE_pragma_value = 48, RULE_common_table_expression = 49, RULE_result_column = 50, 
		RULE_table_or_subquery = 51, RULE_join_clause = 52, RULE_join_operator = 53, 
		RULE_join_constraint = 54, RULE_select_core = 55, RULE_compound_operator = 56, 
		RULE_signed_number = 57, RULE_literal_value = 58, RULE_unary_operator = 59, 
		RULE_error_message = 60, RULE_module_argument = 61, RULE_column_alias = 62, 
		RULE_keyword = 63, RULE_name = 64, RULE_function_name = 65, RULE_database_name = 66, 
		RULE_schema_name = 67, RULE_table_function_name = 68, RULE_table_name = 69, 
		RULE_table_or_index_name = 70, RULE_new_table_name = 71, RULE_column_name = 72, 
		RULE_collation_name = 73, RULE_foreign_table = 74, RULE_index_name = 75, 
		RULE_trigger_name = 76, RULE_view_name = 77, RULE_module_name = 78, RULE_pragma_name = 79, 
		RULE_savepoint_name = 80, RULE_table_alias = 81, RULE_transaction_name = 82, 
		RULE_any_name = 83, RULE_comparing_operators = 84;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
		"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
		"create_table_stmt", "create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
		"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
		"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "factored_select_stmt", 
		"insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", 
		"savepoint_stmt", "simple_select_stmt", "select_stmt", "select_or_values", 
		"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", "type_name", 
		"column_constraint", "conflict_clause", "expr", "target_name", "foreign_key_clause", 
		"raise_function", "indexed_column", "table_constraint", "with_clause", 
		"qualified_table_name", "ordering_term", "pragma_value", "common_table_expression", 
		"result_column", "table_or_subquery", "join_clause", "join_operator", 
		"join_constraint", "select_core", "compound_operator", "signed_number", 
		"literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "function_name", "database_name", "schema_name", 
		"table_function_name", "table_name", "table_or_index_name", "new_table_name", 
		"column_name", "collation_name", "foreign_table", "index_name", "trigger_name", 
		"view_name", "module_name", "pragma_name", "savepoint_name", "table_alias", 
		"transaction_name", "any_name", "comparing_operators"
	};

	@Override
	public String getGrammarFileName() { return "SQLite2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLite2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public TerminalNode EOF() { return getToken(SQLite2Parser.EOF, 0); }
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH) | (1L << K_DROP))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_END - 66)) | (1L << (K_EXPLAIN - 66)) | (1L << (K_INSERT - 66)) | (1L << (K_PRAGMA - 66)) | (1L << (K_REINDEX - 66)) | (1L << (K_RELEASE - 66)) | (1L << (K_REPLACE - 66)) | (1L << (K_ROLLBACK - 66)) | (1L << (K_SAVEPOINT - 66)) | (1L << (K_SELECT - 66)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (K_UPDATE - 139)) | (1L << (K_VACUUM - 139)) | (1L << (K_VALUES - 139)) | (1L << (K_WITH - 139)) | (1L << (UNEXPECTED_CHAR - 139)))) != 0)) {
				{
				setState(172);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(170); sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(171); error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLite2Parser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); ((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitSql_stmt_list(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(182); match(SCOL);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188); sql_stmt();
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(189); match(SCOL);
						}
						}
						setState(192); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(194); sql_stmt();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200); match(SCOL);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLite2Parser.K_EXPLAIN, 0); }
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public TerminalNode K_QUERY() { return getToken(SQLite2Parser.K_QUERY, 0); }
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public TerminalNode K_PLAN() { return getToken(SQLite2Parser.K_PLAN, 0); }
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitSql_stmt(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(206); match(K_EXPLAIN);
				setState(209);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(207); match(K_QUERY);
					setState(208); match(K_PLAN);
					}
				}

				}
			}

			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(213); alter_table_stmt();
				}
				break;

			case 2:
				{
				setState(214); analyze_stmt();
				}
				break;

			case 3:
				{
				setState(215); attach_stmt();
				}
				break;

			case 4:
				{
				setState(216); begin_stmt();
				}
				break;

			case 5:
				{
				setState(217); commit_stmt();
				}
				break;

			case 6:
				{
				setState(218); compound_select_stmt();
				}
				break;

			case 7:
				{
				setState(219); create_index_stmt();
				}
				break;

			case 8:
				{
				setState(220); create_table_stmt();
				}
				break;

			case 9:
				{
				setState(221); create_trigger_stmt();
				}
				break;

			case 10:
				{
				setState(222); create_view_stmt();
				}
				break;

			case 11:
				{
				setState(223); create_virtual_table_stmt();
				}
				break;

			case 12:
				{
				setState(224); delete_stmt();
				}
				break;

			case 13:
				{
				setState(225); delete_stmt_limited();
				}
				break;

			case 14:
				{
				setState(226); detach_stmt();
				}
				break;

			case 15:
				{
				setState(227); drop_index_stmt();
				}
				break;

			case 16:
				{
				setState(228); drop_table_stmt();
				}
				break;

			case 17:
				{
				setState(229); drop_trigger_stmt();
				}
				break;

			case 18:
				{
				setState(230); drop_view_stmt();
				}
				break;

			case 19:
				{
				setState(231); factored_select_stmt();
				}
				break;

			case 20:
				{
				setState(232); insert_stmt();
				}
				break;

			case 21:
				{
				setState(233); pragma_stmt();
				}
				break;

			case 22:
				{
				setState(234); reindex_stmt();
				}
				break;

			case 23:
				{
				setState(235); release_stmt();
				}
				break;

			case 24:
				{
				setState(236); rollback_stmt();
				}
				break;

			case 25:
				{
				setState(237); savepoint_stmt();
				}
				break;

			case 26:
				{
				setState(238); simple_select_stmt();
				}
				break;

			case 27:
				{
				setState(239); select_stmt();
				}
				break;

			case 28:
				{
				setState(240); update_stmt();
				}
				break;

			case 29:
				{
				setState(241); update_stmt_limited();
				}
				break;

			case 30:
				{
				setState(242); vacuum_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_RENAME() { return getToken(SQLite2Parser.K_RENAME, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLite2Parser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLite2Parser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(SQLite2Parser.K_COLUMN, 0); }
		public TerminalNode K_TO() { return getToken(SQLite2Parser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLite2Parser.K_ADD, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitAlter_table_stmt(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(K_ALTER);
			setState(246); match(K_TABLE);
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(247); database_name();
				setState(248); match(DOT);
				}
				break;
			}
			setState(252); table_name();
			setState(261);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(253); match(K_RENAME);
				setState(254); match(K_TO);
				setState(255); new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(256); match(K_ADD);
				setState(258);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(257); match(K_COLUMN);
					}
				}

				setState(260); column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SQLite2Parser.K_ANALYZE, 0); }
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitAnalyze_stmt(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(K_ANALYZE);
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(264); database_name();
				}
				break;

			case 2:
				{
				setState(265); table_or_index_name();
				}
				break;

			case 3:
				{
				setState(266); database_name();
				setState(267); match(DOT);
				setState(268); table_or_index_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(SQLite2Parser.K_AS, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLite2Parser.K_DATABASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_ATTACH() { return getToken(SQLite2Parser.K_ATTACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitAttach_stmt(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(K_ATTACH);
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(273); match(K_DATABASE);
				}
				break;
			}
			setState(276); expr(0);
			setState(277); match(K_AS);
			setState(278); database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLite2Parser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SQLite2Parser.K_BEGIN, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLite2Parser.K_DEFERRED, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLite2Parser.K_TRANSACTION, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLite2Parser.K_IMMEDIATE, 0); }
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitBegin_stmt(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(K_BEGIN);
			setState(282);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) {
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(288);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(284); match(K_TRANSACTION);
				setState(286);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(285); transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_COMMIT() { return getToken(SQLite2Parser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SQLite2Parser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLite2Parser.K_TRANSACTION, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitCommit_stmt(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(295);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(291); match(K_TRANSACTION);
				setState(293);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(292); transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SQLite2Parser.K_EXCEPT, i);
		}
		public TerminalNode K_ALL(int i) {
			return getToken(SQLite2Parser.K_ALL, i);
		}
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SQLite2Parser.K_INTERSECT); }
		public TerminalNode K_LIMIT() { return getToken(SQLite2Parser.K_LIMIT, 0); }
		public TerminalNode K_UNION(int i) {
			return getToken(SQLite2Parser.K_UNION, i);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<TerminalNode> K_ALL() { return getTokens(SQLite2Parser.K_ALL); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_ORDER() { return getToken(SQLite2Parser.K_ORDER, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SQLite2Parser.K_INTERSECT, i);
		}
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public List<TerminalNode> K_EXCEPT() { return getTokens(SQLite2Parser.K_EXCEPT); }
		public List<TerminalNode> K_UNION() { return getTokens(SQLite2Parser.K_UNION); }
		public TerminalNode K_OFFSET() { return getToken(SQLite2Parser.K_OFFSET, 0); }
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitCompound_select_stmt(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(297); with_clause();
				}
			}

			setState(300); select_core();
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(301); match(K_UNION);
					setState(303);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(302); match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(305); match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(306); match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(309); select_core();
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(324);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(314); match(K_ORDER);
				setState(315); match(K_BY);
				setState(316); ordering_term();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(317); match(COMMA);
					setState(318); ordering_term();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(332);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(326); match(K_LIMIT);
				setState(327); expr(0);
				setState(330);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(328);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(329); expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public TerminalNode K_IF() { return getToken(SQLite2Parser.K_IF, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLite2Parser.K_WHERE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLite2Parser.K_INDEX, 0); }
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode K_ON() { return getToken(SQLite2Parser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_CREATE() { return getToken(SQLite2Parser.K_CREATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLite2Parser.K_UNIQUE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitCreate_index_stmt(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); match(K_CREATE);
			setState(336);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(335); match(K_UNIQUE);
				}
			}

			setState(338); match(K_INDEX);
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(339); match(K_IF);
				setState(340); match(K_NOT);
				setState(341); match(K_EXISTS);
				}
				break;
			}
			setState(347);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(344); database_name();
				setState(345); match(DOT);
				}
				break;
			}
			setState(349); index_name();
			setState(350); match(K_ON);
			setState(351); table_name();
			setState(352); match(OPEN_PAR);
			setState(353); indexed_column();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(354); match(COMMA);
				setState(355); indexed_column();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361); match(CLOSE_PAR);
			setState(364);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(362); match(K_WHERE);
				setState(363); expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_TABLE() { return getToken(SQLite2Parser.K_TABLE, 0); }
		public TerminalNode K_IF() { return getToken(SQLite2Parser.K_IF, 0); }
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLite2Parser.K_TEMP, 0); }
		public TerminalNode K_AS() { return getToken(SQLite2Parser.K_AS, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLite2Parser.K_CREATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public TerminalNode K_WITHOUT() { return getToken(SQLite2Parser.K_WITHOUT, 0); }
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLite2Parser.IDENTIFIER, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TEMPORARY() { return getToken(SQLite2Parser.K_TEMPORARY, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitCreate_table_stmt(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366); match(K_CREATE);
			setState(368);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(367);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(370); match(K_TABLE);
			setState(374);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(371); match(K_IF);
				setState(372); match(K_NOT);
				setState(373); match(K_EXISTS);
				}
			}

			setState(379);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(376); database_name();
				setState(377); match(DOT);
				}
				break;
			}
			setState(381); table_name();
			setState(405);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(382); match(OPEN_PAR);
				setState(383); column_def();
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(384); match(COMMA);
						setState(385); column_def();
						}
						} 
					}
					setState(390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(391); match(COMMA);
					setState(392); table_constraint();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398); match(CLOSE_PAR);
				setState(401);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(399); match(K_WITHOUT);
					setState(400); match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(403); match(K_AS);
				setState(404); select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SQLite2Parser.K_INSERT, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLite2Parser.K_DELETE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLite2Parser.K_TEMP, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLite2Parser.K_INSTEAD, 0); }
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public TerminalNode K_FOR() { return getToken(SQLite2Parser.K_FOR, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLite2Parser.K_WHEN, 0); }
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public TerminalNode K_TEMPORARY() { return getToken(SQLite2Parser.K_TEMPORARY, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLite2Parser.K_BEFORE, 0); }
		public TerminalNode K_IF() { return getToken(SQLite2Parser.K_IF, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLite2Parser.K_AFTER, 0); }
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public TerminalNode K_BEGIN() { return getToken(SQLite2Parser.K_BEGIN, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SQLite2Parser.K_OF); }
		public TerminalNode K_EACH() { return getToken(SQLite2Parser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SQLite2Parser.K_ROW, 0); }
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public TerminalNode K_OF(int i) {
			return getToken(SQLite2Parser.K_OF, i);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public TerminalNode K_ON() { return getToken(SQLite2Parser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_CREATE() { return getToken(SQLite2Parser.K_CREATE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLite2Parser.K_UPDATE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public TerminalNode K_END() { return getToken(SQLite2Parser.K_END, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public TerminalNode K_TRIGGER() { return getToken(SQLite2Parser.K_TRIGGER, 0); }
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitCreate_trigger_stmt(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); match(K_CREATE);
			setState(409);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(408);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(411); match(K_TRIGGER);
			setState(415);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(412); match(K_IF);
				setState(413); match(K_NOT);
				setState(414); match(K_EXISTS);
				}
				break;
			}
			setState(420);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(417); database_name();
				setState(418); match(DOT);
				}
				break;
			}
			setState(422); trigger_name();
			setState(427);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(423); match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(424); match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(425); match(K_INSTEAD);
				setState(426); match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(443);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(429); match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(430); match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(431); match(K_UPDATE);
				setState(441);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(432); match(K_OF);
					setState(433); column_name();
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(434); match(COMMA);
						setState(435); column_name();
						}
						}
						setState(440);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(445); match(K_ON);
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(446); database_name();
				setState(447); match(DOT);
				}
				break;
			}
			setState(451); table_name();
			setState(455);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(452); match(K_FOR);
				setState(453); match(K_EACH);
				setState(454); match(K_ROW);
				}
			}

			setState(459);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(457); match(K_WHEN);
				setState(458); expr(0);
				}
			}

			setState(461); match(K_BEGIN);
			setState(470); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(466);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(462); update_stmt();
					}
					break;

				case 2:
					{
					setState(463); insert_stmt();
					}
					break;

				case 3:
					{
					setState(464); delete_stmt();
					}
					break;

				case 4:
					{
					setState(465); select_stmt();
					}
					break;
				}
				setState(468); match(SCOL);
				}
				}
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INSERT - 88)) | (1L << (K_REPLACE - 88)) | (1L << (K_SELECT - 88)) | (1L << (K_UPDATE - 88)) | (1L << (K_VALUES - 88)) | (1L << (K_WITH - 88)))) != 0) );
			setState(474); match(K_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(SQLite2Parser.K_AS, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLite2Parser.K_CREATE, 0); }
		public TerminalNode K_IF() { return getToken(SQLite2Parser.K_IF, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_VIEW() { return getToken(SQLite2Parser.K_VIEW, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLite2Parser.K_TEMP, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TEMPORARY() { return getToken(SQLite2Parser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitCreate_view_stmt(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); match(K_CREATE);
			setState(478);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(477);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(480); match(K_VIEW);
			setState(484);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(481); match(K_IF);
				setState(482); match(K_NOT);
				setState(483); match(K_EXISTS);
				}
				break;
			}
			setState(489);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(486); database_name();
				setState(487); match(DOT);
				}
				break;
			}
			setState(491); view_name();
			setState(492); match(K_AS);
			setState(493); select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode K_VIRTUAL() { return getToken(SQLite2Parser.K_VIRTUAL, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLite2Parser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLite2Parser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLite2Parser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public TerminalNode K_USING() { return getToken(SQLite2Parser.K_USING, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitCreate_virtual_table_stmt(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495); match(K_CREATE);
			setState(496); match(K_VIRTUAL);
			setState(497); match(K_TABLE);
			setState(501);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(498); match(K_IF);
				setState(499); match(K_NOT);
				setState(500); match(K_EXISTS);
				}
			}

			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(503); database_name();
				setState(504); match(DOT);
				}
				break;
			}
			setState(508); table_name();
			setState(509); match(K_USING);
			setState(510); module_name();
			setState(522);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(511); match(OPEN_PAR);
				setState(512); module_argument();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(513); match(COMMA);
					setState(514); module_argument();
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520); match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLite2Parser.K_WHERE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(SQLite2Parser.K_FROM, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLite2Parser.K_DELETE, 0); }
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitDelete_stmt(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(524); with_clause();
				}
			}

			setState(527); match(K_DELETE);
			setState(528); match(K_FROM);
			setState(529); qualified_table_name();
			setState(532);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(530); match(K_WHERE);
				setState(531); expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public TerminalNode K_WHERE() { return getToken(SQLite2Parser.K_WHERE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(SQLite2Parser.K_FROM, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLite2Parser.K_LIMIT, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLite2Parser.K_DELETE, 0); }
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_ORDER() { return getToken(SQLite2Parser.K_ORDER, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLite2Parser.K_OFFSET, 0); }
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitDelete_stmt_limited(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(534); with_clause();
				}
			}

			setState(537); match(K_DELETE);
			setState(538); match(K_FROM);
			setState(539); qualified_table_name();
			setState(542);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(540); match(K_WHERE);
				setState(541); expr(0);
				}
			}

			setState(562);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(554);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(544); match(K_ORDER);
					setState(545); match(K_BY);
					setState(546); ordering_term();
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(547); match(COMMA);
						setState(548); ordering_term();
						}
						}
						setState(553);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(556); match(K_LIMIT);
				setState(557); expr(0);
				setState(560);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(558);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(559); expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DATABASE() { return getToken(SQLite2Parser.K_DATABASE, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLite2Parser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitDetach_stmt(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_detach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564); match(K_DETACH);
			setState(566);
			_la = _input.LA(1);
			if (_la==K_DATABASE) {
				{
				setState(565); match(K_DATABASE);
				}
			}

			setState(568); database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_INDEX() { return getToken(SQLite2Parser.K_INDEX, 0); }
		public TerminalNode K_IF() { return getToken(SQLite2Parser.K_IF, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_DROP() { return getToken(SQLite2Parser.K_DROP, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitDrop_index_stmt(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); match(K_DROP);
			setState(571); match(K_INDEX);
			setState(574);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(572); match(K_IF);
				setState(573); match(K_EXISTS);
				}
				break;
			}
			setState(579);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(576); database_name();
				setState(577); match(DOT);
				}
				break;
			}
			setState(581); index_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_TABLE() { return getToken(SQLite2Parser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLite2Parser.K_IF, 0); }
		public TerminalNode K_DROP() { return getToken(SQLite2Parser.K_DROP, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitDrop_table_stmt(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); match(K_DROP);
			setState(584); match(K_TABLE);
			setState(587);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(585); match(K_IF);
				setState(586); match(K_EXISTS);
				}
			}

			setState(592);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(589); database_name();
				setState(590); match(DOT);
				}
				break;
			}
			setState(594); table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLite2Parser.K_IF, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_DROP() { return getToken(SQLite2Parser.K_DROP, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TRIGGER() { return getToken(SQLite2Parser.K_TRIGGER, 0); }
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitDrop_trigger_stmt(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596); match(K_DROP);
			setState(597); match(K_TRIGGER);
			setState(600);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(598); match(K_IF);
				setState(599); match(K_EXISTS);
				}
				break;
			}
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(602); database_name();
				setState(603); match(DOT);
				}
				break;
			}
			setState(607); trigger_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLite2Parser.K_IF, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_DROP() { return getToken(SQLite2Parser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLite2Parser.K_VIEW, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitDrop_view_stmt(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609); match(K_DROP);
			setState(610); match(K_VIEW);
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(611); match(K_IF);
				setState(612); match(K_EXISTS);
				}
				break;
			}
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(615); database_name();
				setState(616); match(DOT);
				}
				break;
			}
			setState(620); view_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLite2Parser.K_LIMIT, 0); }
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_ORDER() { return getToken(SQLite2Parser.K_ORDER, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLite2Parser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitFactored_select_stmt(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(622); with_clause();
				}
			}

			setState(625); select_core();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(626); compound_operator();
				setState(627); select_core();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(634); match(K_ORDER);
				setState(635); match(K_BY);
				setState(636); ordering_term();
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(637); match(COMMA);
					setState(638); ordering_term();
					}
					}
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(652);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(646); match(K_LIMIT);
				setState(647); expr(0);
				setState(650);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(648);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(649); expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SQLite2Parser.K_INTO, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_INSERT() { return getToken(SQLite2Parser.K_INSERT, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLite2Parser.K_DEFAULT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLite2Parser.K_ROLLBACK, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLite2Parser.K_FAIL, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_IGNORE() { return getToken(SQLite2Parser.K_IGNORE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLite2Parser.K_VALUES, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLite2Parser.K_OR, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLite2Parser.K_ABORT, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_REPLACE() { return getToken(SQLite2Parser.K_REPLACE, 0); }
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitInsert_stmt(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(654); with_clause();
				}
			}

			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(657); match(K_INSERT);
				}
				break;

			case 2:
				{
				setState(658); match(K_REPLACE);
				}
				break;

			case 3:
				{
				setState(659); match(K_INSERT);
				setState(660); match(K_OR);
				setState(661); match(K_REPLACE);
				}
				break;

			case 4:
				{
				setState(662); match(K_INSERT);
				setState(663); match(K_OR);
				setState(664); match(K_ROLLBACK);
				}
				break;

			case 5:
				{
				setState(665); match(K_INSERT);
				setState(666); match(K_OR);
				setState(667); match(K_ABORT);
				}
				break;

			case 6:
				{
				setState(668); match(K_INSERT);
				setState(669); match(K_OR);
				setState(670); match(K_FAIL);
				}
				break;

			case 7:
				{
				setState(671); match(K_INSERT);
				setState(672); match(K_OR);
				setState(673); match(K_IGNORE);
				}
				break;
			}
			setState(676); match(K_INTO);
			setState(680);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(677); database_name();
				setState(678); match(DOT);
				}
				break;
			}
			setState(682); table_name();
			setState(694);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(683); match(OPEN_PAR);
				setState(684); column_name();
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(685); match(COMMA);
					setState(686); column_name();
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692); match(CLOSE_PAR);
				}
			}

			setState(727);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(696); match(K_VALUES);
				setState(697); match(OPEN_PAR);
				setState(698); expr(0);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(699); match(COMMA);
					setState(700); expr(0);
					}
					}
					setState(705);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(706); match(CLOSE_PAR);
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(707); match(COMMA);
					setState(708); match(OPEN_PAR);
					setState(709); expr(0);
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(710); match(COMMA);
						setState(711); expr(0);
						}
						}
						setState(716);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(717); match(CLOSE_PAR);
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				{
				setState(724); select_stmt();
				}
				break;

			case 3:
				{
				setState(725); match(K_DEFAULT);
				setState(726); match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_stmtContext extends ParserRuleContext {
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_PRAGMA() { return getToken(SQLite2Parser.K_PRAGMA, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitPragma_stmt(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729); match(K_PRAGMA);
			setState(733);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(730); database_name();
				setState(731); match(DOT);
				}
				break;
			}
			setState(735); pragma_name();
			setState(742);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(736); match(ASSIGN);
				setState(737); pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(738); match(OPEN_PAR);
				setState(739); pragma_value();
				setState(740); match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reindex_stmtContext extends ParserRuleContext {
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_REINDEX() { return getToken(SQLite2Parser.K_REINDEX, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitReindex_stmt(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); match(K_REINDEX);
			setState(755);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(745); collation_name();
				}
				break;

			case 2:
				{
				setState(749);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(746); database_name();
					setState(747); match(DOT);
					}
					break;
				}
				setState(753);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(751); table_name();
					}
					break;

				case 2:
					{
					setState(752); index_name();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SQLite2Parser.K_SAVEPOINT, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLite2Parser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitRelease_stmt(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757); match(K_RELEASE);
			setState(759);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(758); match(K_SAVEPOINT);
				}
				break;
			}
			setState(761); savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SQLite2Parser.K_SAVEPOINT, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_TO() { return getToken(SQLite2Parser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLite2Parser.K_TRANSACTION, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLite2Parser.K_ROLLBACK, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitRollback_stmt(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763); match(K_ROLLBACK);
			setState(768);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(764); match(K_TRANSACTION);
				setState(766);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(765); transaction_name();
					}
					break;
				}
				}
			}

			setState(775);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(770); match(K_TO);
				setState(772);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(771); match(K_SAVEPOINT);
					}
					break;
				}
				setState(774); savepoint_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SQLite2Parser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitSavepoint_stmt(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777); match(K_SAVEPOINT);
			setState(778); savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_ORDER() { return getToken(SQLite2Parser.K_ORDER, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLite2Parser.K_LIMIT, 0); }
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLite2Parser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitSimple_select_stmt(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(780); with_clause();
				}
			}

			setState(783); select_core();
			setState(794);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(784); match(K_ORDER);
				setState(785); match(K_BY);
				setState(786); ordering_term();
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(787); match(COMMA);
					setState(788); ordering_term();
					}
					}
					setState(793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(802);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(796); match(K_LIMIT);
				setState(797); expr(0);
				setState(800);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(798);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(799); expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLite2Parser.K_LIMIT, 0); }
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_ORDER() { return getToken(SQLite2Parser.K_ORDER, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLite2Parser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(804); with_clause();
				}
			}

			setState(807); select_or_values();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(808); compound_operator();
				setState(809); select_or_values();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(826);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(816); match(K_ORDER);
				setState(817); match(K_BY);
				setState(818); ordering_term();
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(819); match(COMMA);
					setState(820); ordering_term();
					}
					}
					setState(825);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(834);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(828); match(K_LIMIT);
				setState(829); expr(0);
				setState(832);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(830);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(831); expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(SQLite2Parser.K_WHERE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(SQLite2Parser.K_FROM, 0); }
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_ALL() { return getToken(SQLite2Parser.K_ALL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_GROUP() { return getToken(SQLite2Parser.K_GROUP, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLite2Parser.K_DISTINCT, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLite2Parser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLite2Parser.K_VALUES, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public TerminalNode K_SELECT() { return getToken(SQLite2Parser.K_SELECT, 0); }
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitSelect_or_values(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select_or_values);
		int _la;
		try {
			setState(910);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(836); match(K_SELECT);
				setState(838);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(837);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(840); result_column();
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(841); match(COMMA);
					setState(842); result_column();
					}
					}
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(860);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(848); match(K_FROM);
					setState(858);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						setState(849); table_or_subquery();
						setState(854);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(850); match(COMMA);
							setState(851); table_or_subquery();
							}
							}
							setState(856);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;

					case 2:
						{
						setState(857); join_clause();
						}
						break;
					}
					}
				}

				setState(864);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(862); match(K_WHERE);
					setState(863); expr(0);
					}
				}

				setState(880);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(866); match(K_GROUP);
					setState(867); match(K_BY);
					setState(868); expr(0);
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(869); match(COMMA);
						setState(870); expr(0);
						}
						}
						setState(875);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(878);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(876); match(K_HAVING);
						setState(877); expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(882); match(K_VALUES);
				setState(883); match(OPEN_PAR);
				setState(884); expr(0);
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(885); match(COMMA);
					setState(886); expr(0);
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(892); match(CLOSE_PAR);
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(893); match(COMMA);
					setState(894); match(OPEN_PAR);
					setState(895); expr(0);
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(896); match(COMMA);
						setState(897); expr(0);
						}
						}
						setState(902);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(903); match(CLOSE_PAR);
					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLite2Parser.K_WHERE, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLite2Parser.K_ROLLBACK, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLite2Parser.K_FAIL, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_IGNORE() { return getToken(SQLite2Parser.K_IGNORE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_UPDATE() { return getToken(SQLite2Parser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLite2Parser.K_SET, 0); }
		public TerminalNode K_OR() { return getToken(SQLite2Parser.K_OR, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLite2Parser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLite2Parser.K_REPLACE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitUpdate_stmt(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(912); with_clause();
				}
			}

			setState(915); match(K_UPDATE);
			setState(926);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(916); match(K_OR);
				setState(917); match(K_ROLLBACK);
				}
				break;

			case 2:
				{
				setState(918); match(K_OR);
				setState(919); match(K_ABORT);
				}
				break;

			case 3:
				{
				setState(920); match(K_OR);
				setState(921); match(K_REPLACE);
				}
				break;

			case 4:
				{
				setState(922); match(K_OR);
				setState(923); match(K_FAIL);
				}
				break;

			case 5:
				{
				setState(924); match(K_OR);
				setState(925); match(K_IGNORE);
				}
				break;
			}
			setState(928); qualified_table_name();
			setState(929); match(K_SET);
			setState(930); column_name();
			setState(931); match(ASSIGN);
			setState(932); expr(0);
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(933); match(COMMA);
				setState(934); column_name();
				setState(935); match(ASSIGN);
				setState(936); expr(0);
				}
				}
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(945);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(943); match(K_WHERE);
				setState(944); expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLite2Parser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLite2Parser.K_LIMIT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLite2Parser.K_ROLLBACK, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLite2Parser.K_FAIL, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_IGNORE() { return getToken(SQLite2Parser.K_IGNORE, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLite2Parser.K_ORDER, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_UPDATE() { return getToken(SQLite2Parser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLite2Parser.K_SET, 0); }
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public TerminalNode K_OR() { return getToken(SQLite2Parser.K_OR, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLite2Parser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLite2Parser.K_REPLACE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLite2Parser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitUpdate_stmt_limited(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(947); with_clause();
				}
			}

			setState(950); match(K_UPDATE);
			setState(961);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(951); match(K_OR);
				setState(952); match(K_ROLLBACK);
				}
				break;

			case 2:
				{
				setState(953); match(K_OR);
				setState(954); match(K_ABORT);
				}
				break;

			case 3:
				{
				setState(955); match(K_OR);
				setState(956); match(K_REPLACE);
				}
				break;

			case 4:
				{
				setState(957); match(K_OR);
				setState(958); match(K_FAIL);
				}
				break;

			case 5:
				{
				setState(959); match(K_OR);
				setState(960); match(K_IGNORE);
				}
				break;
			}
			setState(963); qualified_table_name();
			setState(964); match(K_SET);
			setState(965); column_name();
			setState(966); match(ASSIGN);
			setState(967); expr(0);
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(968); match(COMMA);
				setState(969); column_name();
				setState(970); match(ASSIGN);
				setState(971); expr(0);
				}
				}
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(980);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(978); match(K_WHERE);
				setState(979); expr(0);
				}
			}

			setState(1000);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(992);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(982); match(K_ORDER);
					setState(983); match(K_BY);
					setState(984); ordering_term();
					setState(989);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(985); match(COMMA);
						setState(986); ordering_term();
						}
						}
						setState(991);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(994); match(K_LIMIT);
				setState(995); expr(0);
				setState(998);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(996);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(997); expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SQLite2Parser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitVacuum_stmt(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002); match(K_VACUUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitColumn_def(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004); column_name();
			setState(1006);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1005); type_name();
				}
				break;
			}
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (K_NOT - 102)) | (1L << (K_NULL - 102)) | (1L << (K_PRIMARY - 102)) | (1L << (K_REFERENCES - 102)) | (1L << (K_UNIQUE - 102)))) != 0)) {
				{
				{
				setState(1008); column_constraint();
				}
				}
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1015); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(1014); name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1017); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			} while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(1029);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1019); match(OPEN_PAR);
				setState(1020); signed_number();
				setState(1021); match(CLOSE_PAR);
				}
				break;

			case 2:
				{
				setState(1023); match(OPEN_PAR);
				setState(1024); signed_number();
				setState(1025); match(COMMA);
				setState(1026); signed_number();
				setState(1027); match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_COLLATE() { return getToken(SQLite2Parser.K_COLLATE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLite2Parser.K_DEFAULT, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLite2Parser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_DESC() { return getToken(SQLite2Parser.K_DESC, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLite2Parser.K_PRIMARY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLite2Parser.K_CHECK, 0); }
		public TerminalNode K_NULL() { return getToken(SQLite2Parser.K_NULL, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLite2Parser.K_UNIQUE, 0); }
		public TerminalNode K_KEY() { return getToken(SQLite2Parser.K_KEY, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLite2Parser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLite2Parser.K_ASC, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitColumn_constraint(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1031); match(K_CONSTRAINT);
				setState(1032); name();
				}
			}

			setState(1068);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1035); match(K_PRIMARY);
				setState(1036); match(K_KEY);
				setState(1038);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1037);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1040); conflict_clause();
				setState(1042);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1041); match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1045);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1044); match(K_NOT);
					}
				}

				setState(1047); match(K_NULL);
				setState(1048); conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1049); match(K_UNIQUE);
				setState(1050); conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1051); match(K_CHECK);
				setState(1052); match(OPEN_PAR);
				setState(1053); expr(0);
				setState(1054); match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1056); match(K_DEFAULT);
				setState(1063);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1057); signed_number();
					}
					break;

				case 2:
					{
					setState(1058); literal_value();
					}
					break;

				case 3:
					{
					setState(1059); match(OPEN_PAR);
					setState(1060); expr(0);
					setState(1061); match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1065); match(K_COLLATE);
				setState(1066); collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1067); foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLite2Parser.K_ON, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLite2Parser.K_IGNORE, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLite2Parser.K_CONFLICT, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLite2Parser.K_ABORT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLite2Parser.K_ROLLBACK, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLite2Parser.K_FAIL, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLite2Parser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitConflict_clause(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1070); match(K_ON);
				setState(1071); match(K_CONFLICT);
				setState(1072);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_FAIL - 72)) | (1L << (K_IGNORE - 72)) | (1L << (K_REPLACE - 72)) | (1L << (K_ROLLBACK - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLite2Parser.BIND_PARAMETER, 0); }
		public Target_nameContext target_name() {
			return getRuleContext(Target_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLite2Parser.K_COLLATE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public TerminalNode K_CASE() { return getToken(SQLite2Parser.K_CASE, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLite2Parser.K_MATCH, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(SQLite2Parser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLite2Parser.K_ISNULL, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLite2Parser.K_NULL, 0); }
		public TerminalNode K_OR() { return getToken(SQLite2Parser.K_OR, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLite2Parser.K_WHEN); }
		public TerminalNode K_BETWEEN() { return getToken(SQLite2Parser.K_BETWEEN, 0); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLite2Parser.K_THEN, i);
		}
		public TerminalNode STRING_VALUE() { return getToken(SQLite2Parser.STRING_VALUE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLite2Parser.K_CAST, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLite2Parser.K_REGEXP, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLite2Parser.K_WHEN, i);
		}
		public TerminalNode K_LIKE() { return getToken(SQLite2Parser.K_LIKE, 0); }
		public Comparing_operatorsContext comparing_operators() {
			return getRuleContext(Comparing_operatorsContext.class,0);
		}
		public TerminalNode K_GLOB() { return getToken(SQLite2Parser.K_GLOB, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLite2Parser.K_AS, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLite2Parser.K_ELSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLite2Parser.K_DISTINCT, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(SQLite2Parser.K_IN, 0); }
		public TerminalNode K_AND() { return getToken(SQLite2Parser.K_AND, 0); }
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLite2Parser.K_ESCAPE, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_END() { return getToken(SQLite2Parser.K_END, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_NOTNULL() { return getToken(SQLite2Parser.K_NOTNULL, 0); }
		public List<TerminalNode> K_THEN() { return getTokens(SQLite2Parser.K_THEN); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1076); unary_operator();
				setState(1077); expr(20);
				}
				break;

			case 2:
				{
				setState(1079); literal_value();
				}
				break;

			case 3:
				{
				setState(1080); match(BIND_PARAMETER);
				}
				break;

			case 4:
				{
				setState(1081); target_name();
				}
				break;

			case 5:
				{
				setState(1082); match(STRING_VALUE);
				}
				break;

			case 6:
				{
				setState(1083); function_name();
				setState(1084); match(OPEN_PAR);
				setState(1097);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case STRING_VALUE:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1086);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						setState(1085); match(K_DISTINCT);
						}
						break;
					}
					setState(1088); expr(0);
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1089); match(COMMA);
						setState(1090); expr(0);
						}
						}
						setState(1095);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1096); match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1099); match(CLOSE_PAR);
				}
				break;

			case 7:
				{
				setState(1101); match(OPEN_PAR);
				setState(1102); expr(0);
				setState(1103); match(CLOSE_PAR);
				}
				break;

			case 8:
				{
				setState(1105); match(K_CAST);
				setState(1106); match(OPEN_PAR);
				setState(1107); expr(0);
				setState(1108); match(K_AS);
				setState(1109); type_name();
				setState(1110); match(CLOSE_PAR);
				}
				break;

			case 9:
				{
				setState(1116);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1113);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1112); match(K_NOT);
						}
					}

					setState(1115); match(K_EXISTS);
					}
				}

				setState(1118); match(OPEN_PAR);
				setState(1119); select_stmt();
				setState(1120); match(CLOSE_PAR);
				}
				break;

			case 10:
				{
				setState(1122); match(K_CASE);
				setState(1124);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1123); expr(0);
					}
					break;
				}
				setState(1131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1126); match(K_WHEN);
					setState(1127); expr(0);
					setState(1128); match(K_THEN);
					setState(1129); expr(0);
					}
					}
					setState(1133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1137);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1135); match(K_ELSE);
					setState(1136); expr(0);
					}
				}

				setState(1139); match(K_END);
				}
				break;

			case 11:
				{
				setState(1141); raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1227);
					switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1144);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1145); match(PIPE2);
						setState(1146); expr(20);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1147);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1148);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1149); expr(19);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1150);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1151);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1152); expr(18);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1153);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1154);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1155); expr(17);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1156);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						{
						setState(1157); comparing_operators();
						}
						setState(1158); expr(16);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1160);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1161); match(K_AND);
						setState(1162); expr(14);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1163);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1164); match(K_OR);
						setState(1165); expr(13);
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1166);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1167); match(K_IS);
						setState(1169);
						switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
						case 1:
							{
							setState(1168); match(K_NOT);
							}
							break;
						}
						setState(1171); expr(6);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1172);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1174);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1173); match(K_NOT);
							}
						}

						setState(1176); match(K_BETWEEN);
						setState(1177); expr(0);
						setState(1178); match(K_AND);
						setState(1179); expr(5);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1181);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1183);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1182); match(K_NOT);
							}
						}

						setState(1185); match(K_IN);
						setState(1205);
						switch (_input.LA(1)) {
						case OPEN_PAR:
							{
							setState(1186); match(OPEN_PAR);
							setState(1196);
							switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
							case 1:
								{
								setState(1187); select_stmt();
								}
								break;

							case 2:
								{
								setState(1188); expr(0);
								setState(1193);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1189); match(COMMA);
									setState(1190); expr(0);
									}
									}
									setState(1195);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1198); match(CLOSE_PAR);
							}
							break;
						case IDENTIFIER:
							{
							setState(1202);
							switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
							case 1:
								{
								setState(1199); database_name();
								setState(1200); match(DOT);
								}
								break;
							}
							setState(1204); table_name();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;

					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1207);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1208); match(K_COLLATE);
						setState(1209); collation_name();
						}
						break;

					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1210);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1212);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1211); match(K_NOT);
							}
						}

						setState(1214);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_GLOB - 77)) | (1L << (K_LIKE - 77)) | (1L << (K_MATCH - 77)) | (1L << (K_REGEXP - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1215); expr(0);
						setState(1218);
						switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
						case 1:
							{
							setState(1216); match(K_ESCAPE);
							setState(1217); expr(0);
							}
							break;
						}
						}
						break;

					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1220);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1225);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1221); match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1222); match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1223); match(K_NOT);
							setState(1224); match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Target_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Target_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterTarget_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitTarget_name(this);
		}
	}

	public final Target_nameContext target_name() throws RecognitionException {
		Target_nameContext _localctx = new Target_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_target_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1235);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1232); database_name();
					setState(1233); match(DOT);
					}
					break;
				}
				setState(1237); table_name();
				setState(1238); match(DOT);
				}
				break;
			}
			setState(1242); column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLite2Parser.K_RESTRICT); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLite2Parser.K_NO, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLite2Parser.K_CASCADE); }
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLite2Parser.K_DEFAULT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLite2Parser.K_RESTRICT, i);
		}
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLite2Parser.K_ACTION, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLite2Parser.K_DELETE); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLite2Parser.K_DEFAULT, i);
		}
		public TerminalNode K_SET(int i) {
			return getToken(SQLite2Parser.K_SET, i);
		}
		public TerminalNode K_ON(int i) {
			return getToken(SQLite2Parser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLite2Parser.K_MATCH); }
		public TerminalNode K_INITIALLY() { return getToken(SQLite2Parser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLite2Parser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLite2Parser.K_SET); }
		public List<TerminalNode> K_NULL() { return getTokens(SQLite2Parser.K_NULL); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public TerminalNode K_NULL(int i) {
			return getToken(SQLite2Parser.K_NULL, i);
		}
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLite2Parser.K_DELETE, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLite2Parser.K_NO); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLite2Parser.K_UPDATE, i);
		}
		public TerminalNode K_DEFERRED() { return getToken(SQLite2Parser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLite2Parser.K_IMMEDIATE, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> K_ON() { return getTokens(SQLite2Parser.K_ON); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_REFERENCES() { return getToken(SQLite2Parser.K_REFERENCES, 0); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLite2Parser.K_CASCADE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLite2Parser.K_UPDATE); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLite2Parser.K_MATCH, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLite2Parser.K_ACTION); }
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitForeign_key_clause(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244); match(K_REFERENCES);
			setState(1245); foreign_table();
			setState(1257);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1246); match(OPEN_PAR);
				setState(1247); column_name();
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1248); match(COMMA);
					setState(1249); column_name();
					}
					}
					setState(1254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1255); match(CLOSE_PAR);
				}
			}

			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1273);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1259); match(K_ON);
					setState(1260);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1269);
					switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
					case 1:
						{
						setState(1261); match(K_SET);
						setState(1262); match(K_NULL);
						}
						break;

					case 2:
						{
						setState(1263); match(K_SET);
						setState(1264); match(K_DEFAULT);
						}
						break;

					case 3:
						{
						setState(1265); match(K_CASCADE);
						}
						break;

					case 4:
						{
						setState(1266); match(K_RESTRICT);
						}
						break;

					case 5:
						{
						setState(1267); match(K_NO);
						setState(1268); match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1271); match(K_MATCH);
					setState(1272); name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1290);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1281);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1280); match(K_NOT);
					}
				}

				setState(1283); match(K_DEFERRABLE);
				setState(1288);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1284); match(K_INITIALLY);
					setState(1285); match(K_DEFERRED);
					}
					break;

				case 2:
					{
					setState(1286); match(K_INITIALLY);
					setState(1287); match(K_IMMEDIATE);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_functionContext extends ParserRuleContext {
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_IGNORE() { return getToken(SQLite2Parser.K_IGNORE, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLite2Parser.K_ABORT, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLite2Parser.K_RAISE, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLite2Parser.K_ROLLBACK, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLite2Parser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitRaise_function(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292); match(K_RAISE);
			setState(1293); match(OPEN_PAR);
			setState(1298);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1294); match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1295);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1296); match(COMMA);
				setState(1297); error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1300); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLite2Parser.K_COLLATE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLite2Parser.K_DESC, 0); }
		public TerminalNode K_ASC() { return getToken(SQLite2Parser.K_ASC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitIndexed_column(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302); column_name();
			setState(1305);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1303); match(K_COLLATE);
				setState(1304); collation_name();
				}
			}

			setState(1308);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1307);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public TerminalNode K_FOREIGN() { return getToken(SQLite2Parser.K_FOREIGN, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLite2Parser.K_PRIMARY, 0); }
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_CHECK() { return getToken(SQLite2Parser.K_CHECK, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLite2Parser.K_UNIQUE, 0); }
		public TerminalNode K_KEY() { return getToken(SQLite2Parser.K_KEY, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLite2Parser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitTable_constraint(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1310); match(K_CONSTRAINT);
				setState(1311); name();
				}
			}

			setState(1350);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1317);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1314); match(K_PRIMARY);
					setState(1315); match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1316); match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1319); match(OPEN_PAR);
				setState(1320); indexed_column();
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1321); match(COMMA);
					setState(1322); indexed_column();
					}
					}
					setState(1327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1328); match(CLOSE_PAR);
				setState(1329); conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1331); match(K_CHECK);
				setState(1332); match(OPEN_PAR);
				setState(1333); expr(0);
				setState(1334); match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1336); match(K_FOREIGN);
				setState(1337); match(K_KEY);
				setState(1338); match(OPEN_PAR);
				setState(1339); column_name();
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1340); match(COMMA);
					setState(1341); column_name();
					}
					}
					setState(1346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1347); match(CLOSE_PAR);
				setState(1348); foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SQLite2Parser.K_WITH, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLite2Parser.K_RECURSIVE, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitWith_clause(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352); match(K_WITH);
			setState(1354);
			_la = _input.LA(1);
			if (_la==K_RECURSIVE) {
				{
				setState(1353); match(K_RECURSIVE);
				}
			}

			setState(1356); common_table_expression();
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1357); match(COMMA);
				setState(1358); common_table_expression();
				}
				}
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public TerminalNode K_INDEXED() { return getToken(SQLite2Parser.K_INDEXED, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitQualified_table_name(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1364); database_name();
				setState(1365); match(DOT);
				}
				break;
			}
			setState(1369); table_name();
			setState(1375);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1370); match(K_INDEXED);
				setState(1371); match(K_BY);
				setState(1372); index_name();
				}
				break;
			case K_NOT:
				{
				setState(1373); match(K_NOT);
				setState(1374); match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLite2Parser.K_COLLATE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLite2Parser.K_DESC, 0); }
		public TerminalNode K_ASC() { return getToken(SQLite2Parser.K_ASC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitOrdering_term(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377); expr(0);
			setState(1380);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1378); match(K_COLLATE);
				setState(1379); collation_name();
				}
			}

			setState(1383);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1382);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLite2Parser.STRING_LITERAL, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitPragma_value(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pragma_value);
		try {
			setState(1388);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1385); signed_number();
				}
				break;
			case OPEN_PAR:
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386); name();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1387); match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(SQLite2Parser.K_AS, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitCommon_table_expression(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390); table_name();
			setState(1402);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1391); match(OPEN_PAR);
				setState(1392); column_name();
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1393); match(COMMA);
					setState(1394); column_name();
					}
					}
					setState(1399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1400); match(CLOSE_PAR);
				}
			}

			setState(1404); match(K_AS);
			setState(1405); match(OPEN_PAR);
			setState(1406); select_stmt();
			setState(1407); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(SQLite2Parser.K_AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitResult_column(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_result_column);
		int _la;
		try {
			setState(1421);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409); match(STAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410); table_name();
				setState(1411); match(DOT);
				setState(1412); match(STAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1414); expr(0);
				setState(1419);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1416);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1415); match(K_AS);
						}
					}

					setState(1418); column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public TerminalNode K_INDEXED() { return getToken(SQLite2Parser.K_INDEXED, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLite2Parser.K_AS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitTable_or_subquery(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_table_or_subquery);
		int _la;
		try {
			setState(1489);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1423); schema_name();
					setState(1424); match(DOT);
					}
					break;
				}
				setState(1428); table_name();
				setState(1433);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1430);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1429); match(K_AS);
						}
					}

					setState(1432); table_alias();
					}
				}

				setState(1440);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1435); match(K_INDEXED);
					setState(1436); match(K_BY);
					setState(1437); index_name();
					}
					break;
				case K_NOT:
					{
					setState(1438); match(K_NOT);
					setState(1439); match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_CROSS:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXCEPT:
				case K_EXPLAIN:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UNION:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1445);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1442); schema_name();
					setState(1443); match(DOT);
					}
					break;
				}
				setState(1447); table_function_name();
				setState(1448); match(OPEN_PAR);
				setState(1457);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT) | (1L << K_DROP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_ROW - 64)) | (1L << (K_SAVEPOINT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_VALUE - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					setState(1449); expr(0);
					setState(1454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1450); match(COMMA);
						setState(1451); expr(0);
						}
						}
						setState(1456);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1459); match(CLOSE_PAR);
				setState(1464);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1461);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1460); match(K_AS);
						}
					}

					setState(1463); table_alias();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1466); match(OPEN_PAR);
				setState(1476);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1467); table_or_subquery();
					setState(1472);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1468); match(COMMA);
						setState(1469); table_or_subquery();
						}
						}
						setState(1474);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;

				case 2:
					{
					setState(1475); join_clause();
					}
					break;
				}
				setState(1478); match(CLOSE_PAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1480); match(OPEN_PAR);
				setState(1481); select_stmt();
				setState(1482); match(CLOSE_PAR);
				setState(1487);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1484);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1483); match(K_AS);
						}
					}

					setState(1486); table_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitJoin_clause(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491); table_or_subquery();
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_INNER - 87)) | (1L << (K_JOIN - 87)) | (1L << (K_LEFT - 87)) | (1L << (K_NATURAL - 87)))) != 0)) {
				{
				{
				setState(1492); join_operator();
				setState(1493); table_or_subquery();
				setState(1494); join_constraint();
				}
				}
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_CROSS() { return getToken(SQLite2Parser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLite2Parser.K_OUTER, 0); }
		public TerminalNode K_INNER() { return getToken(SQLite2Parser.K_INNER, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLite2Parser.K_NATURAL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLite2Parser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLite2Parser.K_LEFT, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitJoin_operator(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_join_operator);
		int _la;
		try {
			setState(1514);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1501); match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1502); match(K_NATURAL);
					}
				}

				setState(1511);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1505); match(K_LEFT);
					setState(1507);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1506); match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1509); match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1510); match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1513); match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ON() { return getToken(SQLite2Parser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_USING() { return getToken(SQLite2Parser.K_USING, 0); }
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitJoin_constraint(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1516); match(K_ON);
				setState(1517); expr(0);
				}
				break;
			case K_USING:
				{
				setState(1518); match(K_USING);
				setState(1519); match(OPEN_PAR);
				setState(1520); column_name();
				setState(1525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1521); match(COMMA);
					setState(1522); column_name();
					}
					}
					setState(1527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1528); match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_CROSS:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXCEPT:
			case K_EXPLAIN:
			case K_GROUP:
			case K_INNER:
			case K_INSERT:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UNION:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(SQLite2Parser.K_WHERE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(SQLite2Parser.K_FROM, 0); }
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_ALL() { return getToken(SQLite2Parser.K_ALL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_GROUP() { return getToken(SQLite2Parser.K_GROUP, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLite2Parser.K_DISTINCT, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLite2Parser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLite2Parser.K_VALUES, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public TerminalNode K_SELECT() { return getToken(SQLite2Parser.K_SELECT, 0); }
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitSelect_core(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_select_core);
		int _la;
		try {
			setState(1606);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532); match(K_SELECT);
				setState(1534);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1533);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(1536); result_column();
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1537); match(COMMA);
					setState(1538); result_column();
					}
					}
					setState(1543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1556);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1544); match(K_FROM);
					setState(1554);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						setState(1545); table_or_subquery();
						setState(1550);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1546); match(COMMA);
							setState(1547); table_or_subquery();
							}
							}
							setState(1552);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;

					case 2:
						{
						setState(1553); join_clause();
						}
						break;
					}
					}
				}

				setState(1560);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1558); match(K_WHERE);
					setState(1559); expr(0);
					}
				}

				setState(1576);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1562); match(K_GROUP);
					setState(1563); match(K_BY);
					setState(1564); expr(0);
					setState(1569);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1565); match(COMMA);
						setState(1566); expr(0);
						}
						}
						setState(1571);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1574);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1572); match(K_HAVING);
						setState(1573); expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1578); match(K_VALUES);
				setState(1579); match(OPEN_PAR);
				setState(1580); expr(0);
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1581); match(COMMA);
					setState(1582); expr(0);
					}
					}
					setState(1587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1588); match(CLOSE_PAR);
				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1589); match(COMMA);
					setState(1590); match(OPEN_PAR);
					setState(1591); expr(0);
					setState(1596);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1592); match(COMMA);
						setState(1593); expr(0);
						}
						}
						setState(1598);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1599); match(CLOSE_PAR);
					}
					}
					setState(1605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_ALL() { return getToken(SQLite2Parser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLite2Parser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLite2Parser.K_EXCEPT, 0); }
		public TerminalNode K_UNION() { return getToken(SQLite2Parser.K_UNION, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitCompound_operator(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_compound_operator);
		try {
			setState(1613);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608); match(K_UNION);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609); match(K_UNION);
				setState(1610); match(K_ALL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1611); match(K_INTERSECT);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1612); match(K_EXCEPT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLite2Parser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitSigned_number(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1615);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1618); match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLite2Parser.K_CURRENT_DATE, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLite2Parser.NUMERIC_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLite2Parser.K_NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLite2Parser.STRING_LITERAL, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLite2Parser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLite2Parser.K_CURRENT_TIME, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLite2Parser.BLOB_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_NULL - 104)) | (1L << (NUMERIC_LITERAL - 104)) | (1L << (STRING_LITERAL - 104)) | (1L << (BLOB_LITERAL - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLite2Parser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitError_message(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitModule_argument(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_module_argument);
		try {
			setState(1628);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1626); expr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1627); column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLite2Parser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLite2Parser.IDENTIFIER, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitColumn_alias(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_INDEXED() { return getToken(SQLite2Parser.K_INDEXED, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLite2Parser.K_RECURSIVE, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLite2Parser.K_DETACH, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLite2Parser.K_CASCADE, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLite2Parser.K_COLLATE, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLite2Parser.K_VACUUM, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLite2Parser.K_COLUMN, 0); }
		public TerminalNode K_DROP() { return getToken(SQLite2Parser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLite2Parser.K_VIEW, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLite2Parser.K_CONSTRAINT, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLite2Parser.K_TEMPORARY, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLite2Parser.K_VIRTUAL, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLite2Parser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLite2Parser.K_BEGIN, 0); }
		public TerminalNode K_OF() { return getToken(SQLite2Parser.K_OF, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLite2Parser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLite2Parser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLite2Parser.K_CREATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLite2Parser.K_IN, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLite2Parser.K_VALUES, 0); }
		public TerminalNode K_UNION() { return getToken(SQLite2Parser.K_UNION, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLite2Parser.K_RAISE, 0); }
		public TerminalNode K_ADD() { return getToken(SQLite2Parser.K_ADD, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLite2Parser.K_OFFSET, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLite2Parser.K_REPLACE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLite2Parser.K_TRIGGER, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLite2Parser.K_SAVEPOINT, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLite2Parser.K_DATABASE, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLite2Parser.K_INSERT, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLite2Parser.K_LIMIT, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLite2Parser.K_COMMIT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLite2Parser.K_EXISTS, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLite2Parser.K_CONFLICT, 0); }
		public TerminalNode K_DESC() { return getToken(SQLite2Parser.K_DESC, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLite2Parser.K_TEMP, 0); }
		public TerminalNode K_TO() { return getToken(SQLite2Parser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLite2Parser.K_TRANSACTION, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLite2Parser.K_QUERY, 0); }
		public TerminalNode K_IS() { return getToken(SQLite2Parser.K_IS, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLite2Parser.K_RELEASE, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLite2Parser.K_DEFERRABLE, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLite2Parser.K_IGNORE, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLite2Parser.K_SELECT, 0); }
		public TerminalNode K_FOR() { return getToken(SQLite2Parser.K_FOR, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLite2Parser.K_EXCEPT, 0); }
		public TerminalNode K_OR() { return getToken(SQLite2Parser.K_OR, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLite2Parser.K_BEFORE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLite2Parser.K_RENAME, 0); }
		public TerminalNode K_INTO() { return getToken(SQLite2Parser.K_INTO, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLite2Parser.K_WHERE, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLite2Parser.K_INTERSECT, 0); }
		public TerminalNode K_FROM() { return getToken(SQLite2Parser.K_FROM, 0); }
		public TerminalNode K_EACH() { return getToken(SQLite2Parser.K_EACH, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLite2Parser.K_GLOB, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLite2Parser.K_ROLLBACK, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLite2Parser.K_LEFT, 0); }
		public TerminalNode K_FULL() { return getToken(SQLite2Parser.K_FULL, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLite2Parser.K_GROUP, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLite2Parser.K_REFERENCES, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLite2Parser.K_UPDATE, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLite2Parser.K_ACTION, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLite2Parser.K_CURRENT_TIME, 0); }
		public TerminalNode K_END() { return getToken(SQLite2Parser.K_END, 0); }
		public TerminalNode K_ASC() { return getToken(SQLite2Parser.K_ASC, 0); }
		public TerminalNode K_THEN() { return getToken(SQLite2Parser.K_THEN, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLite2Parser.K_RESTRICT, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLite2Parser.K_FOREIGN, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLite2Parser.K_EXPLAIN, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLite2Parser.K_INSTEAD, 0); }
		public TerminalNode K_WITH() { return getToken(SQLite2Parser.K_WITH, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLite2Parser.K_ISNULL, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLite2Parser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLite2Parser.K_OUTER, 0); }
		public TerminalNode K_SET() { return getToken(SQLite2Parser.K_SET, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLite2Parser.K_UNIQUE, 0); }
		public TerminalNode K_KEY() { return getToken(SQLite2Parser.K_KEY, 0); }
		public TerminalNode K_CAST() { return getToken(SQLite2Parser.K_CAST, 0); }
		public TerminalNode K_NO() { return getToken(SQLite2Parser.K_NO, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLite2Parser.K_AFTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLite2Parser.K_PLAN, 0); }
		public TerminalNode K_ROW() { return getToken(SQLite2Parser.K_ROW, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLite2Parser.K_IMMEDIATE, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLite2Parser.K_PRIMARY, 0); }
		public TerminalNode K_ON() { return getToken(SQLite2Parser.K_ON, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLite2Parser.K_DISTINCT, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLite2Parser.K_HAVING, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLite2Parser.K_ALTER, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLite2Parser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLite2Parser.K_NOTNULL, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLite2Parser.K_DEFAULT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLite2Parser.K_INNER, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLite2Parser.K_DELETE, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLite2Parser.K_RIGHT, 0); }
		public TerminalNode K_CASE() { return getToken(SQLite2Parser.K_CASE, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLite2Parser.K_MATCH, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLite2Parser.K_INITIALLY, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLite2Parser.K_EXCLUSIVE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLite2Parser.K_CHECK, 0); }
		public TerminalNode K_NULL() { return getToken(SQLite2Parser.K_NULL, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLite2Parser.K_REINDEX, 0); }
		public TerminalNode K_BY() { return getToken(SQLite2Parser.K_BY, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLite2Parser.K_ABORT, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLite2Parser.K_WHEN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLite2Parser.K_BETWEEN, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLite2Parser.K_REGEXP, 0); }
		public TerminalNode K_IF() { return getToken(SQLite2Parser.K_IF, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLite2Parser.K_TABLE, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLite2Parser.K_LIKE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLite2Parser.K_DEFERRED, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLite2Parser.K_ANALYZE, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLite2Parser.K_JOIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLite2Parser.K_FAIL, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLite2Parser.K_PRAGMA, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLite2Parser.K_INDEX, 0); }
		public TerminalNode K_AS() { return getToken(SQLite2Parser.K_AS, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLite2Parser.K_ELSE, 0); }
		public TerminalNode K_ALL() { return getToken(SQLite2Parser.K_ALL, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLite2Parser.K_ATTACH, 0); }
		public TerminalNode K_AND() { return getToken(SQLite2Parser.K_AND, 0); }
		public TerminalNode K_USING() { return getToken(SQLite2Parser.K_USING, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLite2Parser.K_WITHOUT, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLite2Parser.K_NATURAL, 0); }
		public TerminalNode K_NOT() { return getToken(SQLite2Parser.K_NOT, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLite2Parser.K_ESCAPE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_ACTION - 25)) | (1L << (K_ADD - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_ALL - 25)) | (1L << (K_ALTER - 25)) | (1L << (K_ANALYZE - 25)) | (1L << (K_AND - 25)) | (1L << (K_AS - 25)) | (1L << (K_ASC - 25)) | (1L << (K_ATTACH - 25)) | (1L << (K_AUTOINCREMENT - 25)) | (1L << (K_BEFORE - 25)) | (1L << (K_BEGIN - 25)) | (1L << (K_BETWEEN - 25)) | (1L << (K_BY - 25)) | (1L << (K_CASCADE - 25)) | (1L << (K_CASE - 25)) | (1L << (K_CAST - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_COLUMN - 25)) | (1L << (K_COMMIT - 25)) | (1L << (K_CONFLICT - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_CURRENT_DATE - 25)) | (1L << (K_CURRENT_TIME - 25)) | (1L << (K_CURRENT_TIMESTAMP - 25)) | (1L << (K_DATABASE - 25)) | (1L << (K_DEFAULT - 25)) | (1L << (K_DEFERRABLE - 25)) | (1L << (K_DEFERRED - 25)) | (1L << (K_DELETE - 25)) | (1L << (K_DESC - 25)) | (1L << (K_DETACH - 25)) | (1L << (K_DISTINCT - 25)) | (1L << (K_DROP - 25)) | (1L << (K_EACH - 25)) | (1L << (K_ELSE - 25)) | (1L << (K_END - 25)) | (1L << (K_ESCAPE - 25)) | (1L << (K_EXCEPT - 25)) | (1L << (K_EXCLUSIVE - 25)) | (1L << (K_EXISTS - 25)) | (1L << (K_EXPLAIN - 25)) | (1L << (K_FAIL - 25)) | (1L << (K_FOR - 25)) | (1L << (K_FOREIGN - 25)) | (1L << (K_FROM - 25)) | (1L << (K_FULL - 25)) | (1L << (K_GLOB - 25)) | (1L << (K_GROUP - 25)) | (1L << (K_HAVING - 25)) | (1L << (K_IF - 25)) | (1L << (K_IGNORE - 25)) | (1L << (K_IMMEDIATE - 25)) | (1L << (K_IN - 25)) | (1L << (K_INDEX - 25)) | (1L << (K_INDEXED - 25)) | (1L << (K_INITIALLY - 25)) | (1L << (K_INNER - 25)) | (1L << (K_INSERT - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSTEAD - 89)) | (1L << (K_INTERSECT - 89)) | (1L << (K_INTO - 89)) | (1L << (K_IS - 89)) | (1L << (K_ISNULL - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_KEY - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_LIKE - 89)) | (1L << (K_LIMIT - 89)) | (1L << (K_MATCH - 89)) | (1L << (K_NATURAL - 89)) | (1L << (K_NO - 89)) | (1L << (K_NOT - 89)) | (1L << (K_NOTNULL - 89)) | (1L << (K_NULL - 89)) | (1L << (K_OF - 89)) | (1L << (K_OFFSET - 89)) | (1L << (K_ON - 89)) | (1L << (K_OR - 89)) | (1L << (K_ORDER - 89)) | (1L << (K_OUTER - 89)) | (1L << (K_PLAN - 89)) | (1L << (K_PRAGMA - 89)) | (1L << (K_PRIMARY - 89)) | (1L << (K_QUERY - 89)) | (1L << (K_RAISE - 89)) | (1L << (K_RECURSIVE - 89)) | (1L << (K_REFERENCES - 89)) | (1L << (K_REGEXP - 89)) | (1L << (K_REINDEX - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_RESTRICT - 89)) | (1L << (K_RIGHT - 89)) | (1L << (K_ROLLBACK - 89)) | (1L << (K_ROW - 89)) | (1L << (K_SAVEPOINT - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_SET - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_TEMP - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_TO - 89)) | (1L << (K_TRANSACTION - 89)) | (1L << (K_TRIGGER - 89)) | (1L << (K_UNION - 89)) | (1L << (K_UNIQUE - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_USING - 89)) | (1L << (K_VACUUM - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_VIEW - 89)) | (1L << (K_VIRTUAL - 89)) | (1L << (K_WHEN - 89)) | (1L << (K_WHERE - 89)) | (1L << (K_WITH - 89)) | (1L << (K_WITHOUT - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLite2Parser.IDENTIFIER, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitDatabase_name(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitSchema_name(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterTable_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitTable_function_name(this);
		}
	}

	public final Table_function_nameContext table_function_name() throws RecognitionException {
		Table_function_nameContext _localctx = new Table_function_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLite2Parser.IDENTIFIER, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitTable_or_index_name(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitNew_table_name(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLite2Parser.IDENTIFIER, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitCollation_name(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitForeign_table(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitTrigger_name(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitView_name(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitModule_name(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitPragma_name(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitSavepoint_name(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLite2Parser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLite2Parser.IDENTIFIER, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitTable_alias(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_table_alias);
		try {
			setState(1674);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1668); match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669); match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1670); match(OPEN_PAR);
				setState(1671); table_alias();
				setState(1672); match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitTransaction_name(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLite2Parser.IDENTIFIER, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitAny_name(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_any_name);
		try {
			setState(1684);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1678); match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1679); keyword();
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1680); match(OPEN_PAR);
				setState(1681); any_name();
				setState(1682); match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparing_operatorsContext extends ParserRuleContext {
		public Comparing_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparing_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).enterComparing_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLite2Listener ) ((SQLite2Listener)listener).exitComparing_operators(this);
		}
	}

	public final Comparing_operatorsContext comparing_operators() throws RecognitionException {
		Comparing_operatorsContext _localctx = new Comparing_operatorsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_comparing_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 19);

		case 1: return precpred(_ctx, 18);

		case 2: return precpred(_ctx, 17);

		case 3: return precpred(_ctx, 16);

		case 4: return precpred(_ctx, 15);

		case 5: return precpred(_ctx, 13);

		case 6: return precpred(_ctx, 12);

		case 7: return precpred(_ctx, 5);

		case 8: return precpred(_ctx, 4);

		case 9: return precpred(_ctx, 14);

		case 10: return precpred(_ctx, 8);

		case 11: return precpred(_ctx, 7);

		case 12: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a0\u069b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\7\2\u00af\n\2\f\2\16\2\u00b2\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\7\4\u00ba\n\4\f\4\16\4\u00bd\13\4\3\4\3\4\6\4\u00c1\n\4\r\4\16"+
		"\4\u00c2\3\4\7\4\u00c6\n\4\f\4\16\4\u00c9\13\4\3\4\7\4\u00cc\n\4\f\4\16"+
		"\4\u00cf\13\4\3\5\3\5\3\5\5\5\u00d4\n\5\5\5\u00d6\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f6\n\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00fd\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0105\n\6\3\6\5\6\u0108\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0111\n\7\3\b\3\b\5\b\u0115\n\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\5\t\u011d\n\t\3\t\3\t\5\t\u0121\n\t\5\t\u0123\n\t\3\n"+
		"\3\n\3\n\5\n\u0128\n\n\5\n\u012a\n\n\3\13\5\13\u012d\n\13\3\13\3\13\3"+
		"\13\5\13\u0132\n\13\3\13\3\13\5\13\u0136\n\13\3\13\6\13\u0139\n\13\r\13"+
		"\16\13\u013a\3\13\3\13\3\13\3\13\3\13\7\13\u0142\n\13\f\13\16\13\u0145"+
		"\13\13\5\13\u0147\n\13\3\13\3\13\3\13\3\13\5\13\u014d\n\13\5\13\u014f"+
		"\n\13\3\f\3\f\5\f\u0153\n\f\3\f\3\f\3\f\3\f\5\f\u0159\n\f\3\f\3\f\3\f"+
		"\5\f\u015e\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0167\n\f\f\f\16\f\u016a"+
		"\13\f\3\f\3\f\3\f\5\f\u016f\n\f\3\r\3\r\5\r\u0173\n\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0179\n\r\3\r\3\r\3\r\5\r\u017e\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0185"+
		"\n\r\f\r\16\r\u0188\13\r\3\r\3\r\7\r\u018c\n\r\f\r\16\r\u018f\13\r\3\r"+
		"\3\r\3\r\5\r\u0194\n\r\3\r\3\r\5\r\u0198\n\r\3\16\3\16\5\16\u019c\n\16"+
		"\3\16\3\16\3\16\3\16\5\16\u01a2\n\16\3\16\3\16\3\16\5\16\u01a7\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u01ae\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u01b7\n\16\f\16\16\16\u01ba\13\16\5\16\u01bc\n\16\5\16\u01be"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u01c4\n\16\3\16\3\16\3\16\3\16\5\16\u01ca"+
		"\n\16\3\16\3\16\5\16\u01ce\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u01d5\n"+
		"\16\3\16\3\16\6\16\u01d9\n\16\r\16\16\16\u01da\3\16\3\16\3\17\3\17\5\17"+
		"\u01e1\n\17\3\17\3\17\3\17\3\17\5\17\u01e7\n\17\3\17\3\17\3\17\5\17\u01ec"+
		"\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01f8\n\20"+
		"\3\20\3\20\3\20\5\20\u01fd\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u0206\n\20\f\20\16\20\u0209\13\20\3\20\3\20\5\20\u020d\n\20\3\21\5\21"+
		"\u0210\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0217\n\21\3\22\5\22\u021a\n"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u0221\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0228\n\22\f\22\16\22\u022b\13\22\5\22\u022d\n\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0233\n\22\5\22\u0235\n\22\3\23\3\23\5\23\u0239\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\5\24\u0241\n\24\3\24\3\24\3\24\5\24\u0246\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u024e\n\25\3\25\3\25\3\25\5\25\u0253"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u025b\n\26\3\26\3\26\3\26\5\26"+
		"\u0260\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0268\n\27\3\27\3\27\3"+
		"\27\5\27\u026d\n\27\3\27\3\27\3\30\5\30\u0272\n\30\3\30\3\30\3\30\3\30"+
		"\7\30\u0278\n\30\f\30\16\30\u027b\13\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u0282\n\30\f\30\16\30\u0285\13\30\5\30\u0287\n\30\3\30\3\30\3\30\3\30"+
		"\5\30\u028d\n\30\5\30\u028f\n\30\3\31\5\31\u0292\n\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u02a5\n\31\3\31\3\31\3\31\3\31\5\31\u02ab\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u02b2\n\31\f\31\16\31\u02b5\13\31\3\31\3\31\5\31\u02b9\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u02c0\n\31\f\31\16\31\u02c3\13\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u02cb\n\31\f\31\16\31\u02ce\13\31\3\31"+
		"\3\31\7\31\u02d2\n\31\f\31\16\31\u02d5\13\31\3\31\3\31\3\31\5\31\u02da"+
		"\n\31\3\32\3\32\3\32\3\32\5\32\u02e0\n\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u02e9\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u02f0\n\33\3\33\3"+
		"\33\5\33\u02f4\n\33\5\33\u02f6\n\33\3\34\3\34\5\34\u02fa\n\34\3\34\3\34"+
		"\3\35\3\35\3\35\5\35\u0301\n\35\5\35\u0303\n\35\3\35\3\35\5\35\u0307\n"+
		"\35\3\35\5\35\u030a\n\35\3\36\3\36\3\36\3\37\5\37\u0310\n\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u0318\n\37\f\37\16\37\u031b\13\37\5\37\u031d"+
		"\n\37\3\37\3\37\3\37\3\37\5\37\u0323\n\37\5\37\u0325\n\37\3 \5 \u0328"+
		"\n \3 \3 \3 \3 \7 \u032e\n \f \16 \u0331\13 \3 \3 \3 \3 \3 \7 \u0338\n"+
		" \f \16 \u033b\13 \5 \u033d\n \3 \3 \3 \3 \5 \u0343\n \5 \u0345\n \3!"+
		"\3!\5!\u0349\n!\3!\3!\3!\7!\u034e\n!\f!\16!\u0351\13!\3!\3!\3!\3!\7!\u0357"+
		"\n!\f!\16!\u035a\13!\3!\5!\u035d\n!\5!\u035f\n!\3!\3!\5!\u0363\n!\3!\3"+
		"!\3!\3!\3!\7!\u036a\n!\f!\16!\u036d\13!\3!\3!\5!\u0371\n!\5!\u0373\n!"+
		"\3!\3!\3!\3!\3!\7!\u037a\n!\f!\16!\u037d\13!\3!\3!\3!\3!\3!\3!\7!\u0385"+
		"\n!\f!\16!\u0388\13!\3!\3!\7!\u038c\n!\f!\16!\u038f\13!\5!\u0391\n!\3"+
		"\"\5\"\u0394\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03a1"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u03ad\n\"\f\"\16\"\u03b0"+
		"\13\"\3\"\3\"\5\"\u03b4\n\"\3#\5#\u03b7\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u03c4\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u03d0\n#\f#\16#\u03d3"+
		"\13#\3#\3#\5#\u03d7\n#\3#\3#\3#\3#\3#\7#\u03de\n#\f#\16#\u03e1\13#\5#"+
		"\u03e3\n#\3#\3#\3#\3#\5#\u03e9\n#\5#\u03eb\n#\3$\3$\3%\3%\5%\u03f1\n%"+
		"\3%\7%\u03f4\n%\f%\16%\u03f7\13%\3&\6&\u03fa\n&\r&\16&\u03fb\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u0408\n&\3\'\3\'\5\'\u040c\n\'\3\'\3\'\3\'\5"+
		"\'\u0411\n\'\3\'\3\'\5\'\u0415\n\'\3\'\5\'\u0418\n\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u042a\n\'\3\'\3\'\3"+
		"\'\5\'\u042f\n\'\3(\3(\3(\5(\u0434\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\5)\u0441\n)\3)\3)\3)\7)\u0446\n)\f)\16)\u0449\13)\3)\5)\u044c\n)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u045c\n)\3)\5)\u045f\n)\3)"+
		"\3)\3)\3)\3)\3)\5)\u0467\n)\3)\3)\3)\3)\3)\6)\u046e\n)\r)\16)\u046f\3"+
		")\3)\5)\u0474\n)\3)\3)\3)\5)\u0479\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0494\n)\3)\3)\3)\5)\u0499"+
		"\n)\3)\3)\3)\3)\3)\3)\3)\5)\u04a2\n)\3)\3)\3)\3)\3)\3)\7)\u04aa\n)\f)"+
		"\16)\u04ad\13)\5)\u04af\n)\3)\3)\3)\3)\5)\u04b5\n)\3)\5)\u04b8\n)\3)\3"+
		")\3)\3)\3)\5)\u04bf\n)\3)\3)\3)\3)\5)\u04c5\n)\3)\3)\3)\3)\3)\5)\u04cc"+
		"\n)\7)\u04ce\n)\f)\16)\u04d1\13)\3*\3*\3*\5*\u04d6\n*\3*\3*\3*\5*\u04db"+
		"\n*\3*\3*\3+\3+\3+\3+\3+\3+\7+\u04e5\n+\f+\16+\u04e8\13+\3+\3+\5+\u04ec"+
		"\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u04f8\n+\3+\3+\5+\u04fc\n+\7+\u04fe"+
		"\n+\f+\16+\u0501\13+\3+\5+\u0504\n+\3+\3+\3+\3+\3+\5+\u050b\n+\5+\u050d"+
		"\n+\3,\3,\3,\3,\3,\3,\5,\u0515\n,\3,\3,\3-\3-\3-\5-\u051c\n-\3-\5-\u051f"+
		"\n-\3.\3.\5.\u0523\n.\3.\3.\3.\5.\u0528\n.\3.\3.\3.\3.\7.\u052e\n.\f."+
		"\16.\u0531\13.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0541\n.\f"+
		".\16.\u0544\13.\3.\3.\3.\5.\u0549\n.\3/\3/\5/\u054d\n/\3/\3/\3/\7/\u0552"+
		"\n/\f/\16/\u0555\13/\3\60\3\60\3\60\5\60\u055a\n\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u0562\n\60\3\61\3\61\3\61\5\61\u0567\n\61\3\61\5\61\u056a"+
		"\n\61\3\62\3\62\3\62\5\62\u056f\n\62\3\63\3\63\3\63\3\63\3\63\7\63\u0576"+
		"\n\63\f\63\16\63\u0579\13\63\3\63\3\63\5\63\u057d\n\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u058b\n\64\3\64\5\64"+
		"\u058e\n\64\5\64\u0590\n\64\3\65\3\65\3\65\5\65\u0595\n\65\3\65\3\65\5"+
		"\65\u0599\n\65\3\65\5\65\u059c\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u05a3"+
		"\n\65\3\65\3\65\3\65\5\65\u05a8\n\65\3\65\3\65\3\65\3\65\3\65\7\65\u05af"+
		"\n\65\f\65\16\65\u05b2\13\65\5\65\u05b4\n\65\3\65\3\65\5\65\u05b8\n\65"+
		"\3\65\5\65\u05bb\n\65\3\65\3\65\3\65\3\65\7\65\u05c1\n\65\f\65\16\65\u05c4"+
		"\13\65\3\65\5\65\u05c7\n\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u05cf\n"+
		"\65\3\65\5\65\u05d2\n\65\5\65\u05d4\n\65\3\66\3\66\3\66\3\66\3\66\7\66"+
		"\u05db\n\66\f\66\16\66\u05de\13\66\3\67\3\67\5\67\u05e2\n\67\3\67\3\67"+
		"\5\67\u05e6\n\67\3\67\3\67\5\67\u05ea\n\67\3\67\5\67\u05ed\n\67\38\38"+
		"\38\38\38\38\38\78\u05f6\n8\f8\168\u05f9\138\38\38\58\u05fd\n8\39\39\5"+
		"9\u0601\n9\39\39\39\79\u0606\n9\f9\169\u0609\139\39\39\39\39\79\u060f"+
		"\n9\f9\169\u0612\139\39\59\u0615\n9\59\u0617\n9\39\39\59\u061b\n9\39\3"+
		"9\39\39\39\79\u0622\n9\f9\169\u0625\139\39\39\59\u0629\n9\59\u062b\n9"+
		"\39\39\39\39\39\79\u0632\n9\f9\169\u0635\139\39\39\39\39\39\39\79\u063d"+
		"\n9\f9\169\u0640\139\39\39\79\u0644\n9\f9\169\u0647\139\59\u0649\n9\3"+
		":\3:\3:\3:\3:\5:\u0650\n:\3;\5;\u0653\n;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3"+
		"?\5?\u065f\n?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3"+
		"I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3"+
		"S\3S\3S\5S\u068d\nS\3T\3T\3U\3U\3U\3U\3U\3U\5U\u0697\nU\3V\3V\3V\4\u0186"+
		"\u03fb\3PW\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\2\24\5\2<<GGTT\4\2\61\61DD\4\2\7\7ll\3\2\u0085"+
		"\u0086\4\2\37\37@@\4\2$$>>\7\2\33\33JJSS||\177\177\4\2\t\t\16\17\3\2\n"+
		"\13\3\2\20\23\6\2OOcceexx\4\2==\u008d\u008d\5\2\33\33JJ\177\177\6\2\66"+
		"8jj\u0099\u0099\u009b\u009c\4\2\n\fhh\4\2\u0097\u0097\u009b\u009b\3\2"+
		"\33\u0096\3\2\24\31\u0796\2\u00b0\3\2\2\2\4\u00b5\3\2\2\2\6\u00bb\3\2"+
		"\2\2\b\u00d5\3\2\2\2\n\u00f7\3\2\2\2\f\u0109\3\2\2\2\16\u0112\3\2\2\2"+
		"\20\u011a\3\2\2\2\22\u0124\3\2\2\2\24\u012c\3\2\2\2\26\u0150\3\2\2\2\30"+
		"\u0170\3\2\2\2\32\u0199\3\2\2\2\34\u01de\3\2\2\2\36\u01f1\3\2\2\2 \u020f"+
		"\3\2\2\2\"\u0219\3\2\2\2$\u0236\3\2\2\2&\u023c\3\2\2\2(\u0249\3\2\2\2"+
		"*\u0256\3\2\2\2,\u0263\3\2\2\2.\u0271\3\2\2\2\60\u0291\3\2\2\2\62\u02db"+
		"\3\2\2\2\64\u02ea\3\2\2\2\66\u02f7\3\2\2\28\u02fd\3\2\2\2:\u030b\3\2\2"+
		"\2<\u030f\3\2\2\2>\u0327\3\2\2\2@\u0390\3\2\2\2B\u0393\3\2\2\2D\u03b6"+
		"\3\2\2\2F\u03ec\3\2\2\2H\u03ee\3\2\2\2J\u03f9\3\2\2\2L\u040b\3\2\2\2N"+
		"\u0433\3\2\2\2P\u0478\3\2\2\2R\u04da\3\2\2\2T\u04de\3\2\2\2V\u050e\3\2"+
		"\2\2X\u0518\3\2\2\2Z\u0522\3\2\2\2\\\u054a\3\2\2\2^\u0559\3\2\2\2`\u0563"+
		"\3\2\2\2b\u056e\3\2\2\2d\u0570\3\2\2\2f\u058f\3\2\2\2h\u05d3\3\2\2\2j"+
		"\u05d5\3\2\2\2l\u05ec\3\2\2\2n\u05fc\3\2\2\2p\u0648\3\2\2\2r\u064f\3\2"+
		"\2\2t\u0652\3\2\2\2v\u0656\3\2\2\2x\u0658\3\2\2\2z\u065a\3\2\2\2|\u065e"+
		"\3\2\2\2~\u0660\3\2\2\2\u0080\u0662\3\2\2\2\u0082\u0664\3\2\2\2\u0084"+
		"\u0666\3\2\2\2\u0086\u0668\3\2\2\2\u0088\u066a\3\2\2\2\u008a\u066c\3\2"+
		"\2\2\u008c\u066e\3\2\2\2\u008e\u0670\3\2\2\2\u0090\u0672\3\2\2\2\u0092"+
		"\u0674\3\2\2\2\u0094\u0676\3\2\2\2\u0096\u0678\3\2\2\2\u0098\u067a\3\2"+
		"\2\2\u009a\u067c\3\2\2\2\u009c\u067e\3\2\2\2\u009e\u0680\3\2\2\2\u00a0"+
		"\u0682\3\2\2\2\u00a2\u0684\3\2\2\2\u00a4\u068c\3\2\2\2\u00a6\u068e\3\2"+
		"\2\2\u00a8\u0696\3\2\2\2\u00aa\u0698\3\2\2\2\u00ac\u00af\5\6\4\2\u00ad"+
		"\u00af\5\4\3\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\7\2\2\3\u00b4\3\3\2\2\2\u00b5\u00b6\7\u00a0"+
		"\2\2\u00b6\u00b7\b\3\1\2\u00b7\5\3\2\2\2\u00b8\u00ba\7\3\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c7\5\b\5\2\u00bf\u00c1\7\3"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\5\b\5\2\u00c5\u00c0\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00cd\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\7\3\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\7\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\7I\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\u00d4\7q\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2"+
		"\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00f5\3\2\2\2\u00d7"+
		"\u00f6\5\n\6\2\u00d8\u00f6\5\f\7\2\u00d9\u00f6\5\16\b\2\u00da\u00f6\5"+
		"\20\t\2\u00db\u00f6\5\22\n\2\u00dc\u00f6\5\24\13\2\u00dd\u00f6\5\26\f"+
		"\2\u00de\u00f6\5\30\r\2\u00df\u00f6\5\32\16\2\u00e0\u00f6\5\34\17\2\u00e1"+
		"\u00f6\5\36\20\2\u00e2\u00f6\5 \21\2\u00e3\u00f6\5\"\22\2\u00e4\u00f6"+
		"\5$\23\2\u00e5\u00f6\5&\24\2\u00e6\u00f6\5(\25\2\u00e7\u00f6\5*\26\2\u00e8"+
		"\u00f6\5,\27\2\u00e9\u00f6\5.\30\2\u00ea\u00f6\5\60\31\2\u00eb\u00f6\5"+
		"\62\32\2\u00ec\u00f6\5\64\33\2\u00ed\u00f6\5\66\34\2\u00ee\u00f6\58\35"+
		"\2\u00ef\u00f6\5:\36\2\u00f0\u00f6\5<\37\2\u00f1\u00f6\5> \2\u00f2\u00f6"+
		"\5B\"\2\u00f3\u00f6\5D#\2\u00f4\u00f6\5F$\2\u00f5\u00d7\3\2\2\2\u00f5"+
		"\u00d8\3\2\2\2\u00f5\u00d9\3\2\2\2\u00f5\u00da\3\2\2\2\u00f5\u00db\3\2"+
		"\2\2\u00f5\u00dc\3\2\2\2\u00f5\u00dd\3\2\2\2\u00f5\u00de\3\2\2\2\u00f5"+
		"\u00df\3\2\2\2\u00f5\u00e0\3\2\2\2\u00f5\u00e1\3\2\2\2\u00f5\u00e2\3\2"+
		"\2\2\u00f5\u00e3\3\2\2\2\u00f5\u00e4\3\2\2\2\u00f5\u00e5\3\2\2\2\u00f5"+
		"\u00e6\3\2\2\2\u00f5\u00e7\3\2\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00e9\3\2"+
		"\2\2\u00f5\u00ea\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5"+
		"\u00ed\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3\2"+
		"\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\t\3\2\2\2\u00f7\u00f8\7 \2\2\u00f8\u00fc\7\u0084"+
		"\2\2\u00f9\u00fa\5\u0086D\2\u00fa\u00fb\7\4\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f9\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0107\5\u008c"+
		"G\2\u00ff\u0100\7{\2\2\u0100\u0101\7\u0088\2\2\u0101\u0108\5\u0090I\2"+
		"\u0102\u0104\7\35\2\2\u0103\u0105\7\60\2\2\u0104\u0103\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\5H%\2\u0107\u00ff\3\2\2\2\u0107"+
		"\u0102\3\2\2\2\u0108\13\3\2\2\2\u0109\u0110\7!\2\2\u010a\u0111\5\u0086"+
		"D\2\u010b\u0111\5\u008eH\2\u010c\u010d\5\u0086D\2\u010d\u010e\7\4\2\2"+
		"\u010e\u010f\5\u008eH\2\u010f\u0111\3\2\2\2\u0110\u010a\3\2\2\2\u0110"+
		"\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u0111\3\2\2\2\u0111\r\3\2\2\2"+
		"\u0112\u0114\7%\2\2\u0113\u0115\79\2\2\u0114\u0113\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\5P)\2\u0117\u0118\7#\2\2\u0118"+
		"\u0119\5\u0086D\2\u0119\17\3\2\2\2\u011a\u011c\7(\2\2\u011b\u011d\t\2"+
		"\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0122\3\2\2\2\u011e"+
		"\u0120\7\u0089\2\2\u011f\u0121\5\u00a6T\2\u0120\u011f\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\21\3\2\2\2\u0124\u0129\t\3\2\2\u0125\u0127\7\u0089\2\2\u0126\u0128\5"+
		"\u00a6T\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2"+
		"\u0129\u0125\3\2\2\2\u0129\u012a\3\2\2\2\u012a\23\3\2\2\2\u012b\u012d"+
		"\5\\/\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0138\5p9\2\u012f\u0131\7\u008b\2\2\u0130\u0132\7\37\2\2\u0131\u0130"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0136\3\2\2\2\u0133\u0136\7\\\2\2\u0134"+
		"\u0136\7F\2\2\u0135\u012f\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0139\5p9\2\u0138\u0135\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0146\3\2\2\2\u013c"+
		"\u013d\7o\2\2\u013d\u013e\7*\2\2\u013e\u0143\5`\61\2\u013f\u0140\7\7\2"+
		"\2\u0140\u0142\5`\61\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u013c\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014e\3\2\2\2\u0148\u0149\7d"+
		"\2\2\u0149\u014c\5P)\2\u014a\u014b\t\4\2\2\u014b\u014d\5P)\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0148\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\25\3\2\2\2\u0150\u0152\7\64\2\2\u0151\u0153\7\u008c"+
		"\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0158\7V\2\2\u0155\u0156\7R\2\2\u0156\u0157\7h\2\2\u0157\u0159\7H\2\2"+
		"\u0158\u0155\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015d\3\2\2\2\u015a\u015b"+
		"\5\u0086D\2\u015b\u015c\7\4\2\2\u015c\u015e\3\2\2\2\u015d\u015a\3\2\2"+
		"\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\5\u0098M\2\u0160"+
		"\u0161\7m\2\2\u0161\u0162\5\u008cG\2\u0162\u0163\7\5\2\2\u0163\u0168\5"+
		"X-\2\u0164\u0165\7\7\2\2\u0165\u0167\5X-\2\u0166\u0164\3\2\2\2\u0167\u016a"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016e\7\6\2\2\u016c\u016d\7\u0094\2\2\u016d\u016f"+
		"\5P)\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\27\3\2\2\2\u0170"+
		"\u0172\7\64\2\2\u0171\u0173\t\5\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0173\u0174\3\2\2\2\u0174\u0178\7\u0084\2\2\u0175\u0176\7R\2\2"+
		"\u0176\u0177\7h\2\2\u0177\u0179\7H\2\2\u0178\u0175\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017d\3\2\2\2\u017a\u017b\5\u0086D\2\u017b\u017c\7\4\2"+
		"\2\u017c\u017e\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0197\5\u008cG\2\u0180\u0181\7\5\2\2\u0181\u0186\5H%\2"+
		"\u0182\u0183\7\7\2\2\u0183\u0185\5H%\2\u0184\u0182\3\2\2\2\u0185\u0188"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018d\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0189\u018a\7\7\2\2\u018a\u018c\5Z.\2\u018b\u0189\3\2\2"+
		"\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0193\7\6\2\2\u0191\u0192\7\u0096\2"+
		"\2\u0192\u0194\7\u0097\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0198\3\2\2\2\u0195\u0196\7#\2\2\u0196\u0198\5> \2\u0197\u0180\3\2\2"+
		"\2\u0197\u0195\3\2\2\2\u0198\31\3\2\2\2\u0199\u019b\7\64\2\2\u019a\u019c"+
		"\t\5\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u01a1\7\u008a\2\2\u019e\u019f\7R\2\2\u019f\u01a0\7h\2\2\u01a0\u01a2\7"+
		"H\2\2\u01a1\u019e\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6\3\2\2\2\u01a3"+
		"\u01a4\5\u0086D\2\u01a4\u01a5\7\4\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a3"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ad\5\u009aN"+
		"\2\u01a9\u01ae\7\'\2\2\u01aa\u01ae\7\36\2\2\u01ab\u01ac\7[\2\2\u01ac\u01ae"+
		"\7k\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01bd\3\2\2\2\u01af\u01be\7=\2\2\u01b0\u01be\7Z\2"+
		"\2\u01b1\u01bb\7\u008d\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b8\5\u0092J\2\u01b4"+
		"\u01b5\7\7\2\2\u01b5\u01b7\5\u0092J\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01b2\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2"+
		"\2\2\u01bd\u01af\3\2\2\2\u01bd\u01b0\3\2\2\2\u01bd\u01b1\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c3\7m\2\2\u01c0\u01c1\5\u0086D\2\u01c1\u01c2\7"+
		"\4\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c9\5\u008cG\2\u01c6\u01c7\7K\2\2\u01c7\u01c8\7"+
		"B\2\2\u01c8\u01ca\7\u0080\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01ca\3\2\2\2"+
		"\u01ca\u01cd\3\2\2\2\u01cb\u01cc\7\u0093\2\2\u01cc\u01ce\5P)\2\u01cd\u01cb"+
		"\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d8\7(\2\2\u01d0"+
		"\u01d5\5B\"\2\u01d1\u01d5\5\60\31\2\u01d2\u01d5\5 \21\2\u01d3\u01d5\5"+
		"> \2\u01d4\u01d0\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7\3\2\2\u01d7\u01d9\3\2"+
		"\2\2\u01d8\u01d4\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\7D\2\2\u01dd\33\3\2\2\2"+
		"\u01de\u01e0\7\64\2\2\u01df\u01e1\t\5\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e6\7\u0091\2\2\u01e3\u01e4\7R\2"+
		"\2\u01e4\u01e5\7h\2\2\u01e5\u01e7\7H\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01eb\3\2\2\2\u01e8\u01e9\5\u0086D\2\u01e9\u01ea\7\4\2"+
		"\2\u01ea\u01ec\3\2\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01ee\5\u009cO\2\u01ee\u01ef\7#\2\2\u01ef\u01f0\5> \2\u01f0"+
		"\35\3\2\2\2\u01f1\u01f2\7\64\2\2\u01f2\u01f3\7\u0092\2\2\u01f3\u01f7\7"+
		"\u0084\2\2\u01f4\u01f5\7R\2\2\u01f5\u01f6\7h\2\2\u01f6\u01f8\7H\2\2\u01f7"+
		"\u01f4\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fc\3\2\2\2\u01f9\u01fa\5\u0086"+
		"D\2\u01fa\u01fb\7\4\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\5\u008cG\2\u01ff\u0200"+
		"\7\u008e\2\2\u0200\u020c\5\u009eP\2\u0201\u0202\7\5\2\2\u0202\u0207\5"+
		"|?\2\u0203\u0204\7\7\2\2\u0204\u0206\5|?\2\u0205\u0203\3\2\2\2\u0206\u0209"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u020a\u020b\7\6\2\2\u020b\u020d\3\2\2\2\u020c\u0201\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\37\3\2\2\2\u020e\u0210\5\\/\2\u020f\u020e"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7=\2\2\u0212"+
		"\u0213\7M\2\2\u0213\u0216\5^\60\2\u0214\u0215\7\u0094\2\2\u0215\u0217"+
		"\5P)\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217!\3\2\2\2\u0218\u021a"+
		"\5\\/\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021c\7=\2\2\u021c\u021d\7M\2\2\u021d\u0220\5^\60\2\u021e\u021f\7\u0094"+
		"\2\2\u021f\u0221\5P)\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0234"+
		"\3\2\2\2\u0222\u0223\7o\2\2\u0223\u0224\7*\2\2\u0224\u0229\5`\61\2\u0225"+
		"\u0226\7\7\2\2\u0226\u0228\5`\61\2\u0227\u0225\3\2\2\2\u0228\u022b\3\2"+
		"\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022c\u0222\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022e\u022f\7d\2\2\u022f\u0232\5P)\2\u0230\u0231\t\4\2\2\u0231\u0233"+
		"\5P)\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234"+
		"\u022c\3\2\2\2\u0234\u0235\3\2\2\2\u0235#\3\2\2\2\u0236\u0238\7?\2\2\u0237"+
		"\u0239\79\2\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u023b\5\u0086D\2\u023b%\3\2\2\2\u023c\u023d\7A\2\2\u023d\u0240"+
		"\7V\2\2\u023e\u023f\7R\2\2\u023f\u0241\7H\2\2\u0240\u023e\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0245\3\2\2\2\u0242\u0243\5\u0086D\2\u0243\u0244"+
		"\7\4\2\2\u0244\u0246\3\2\2\2\u0245\u0242\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0248\5\u0098M\2\u0248\'\3\2\2\2\u0249\u024a\7A\2"+
		"\2\u024a\u024d\7\u0084\2\2\u024b\u024c\7R\2\2\u024c\u024e\7H\2\2\u024d"+
		"\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0252\3\2\2\2\u024f\u0250\5\u0086"+
		"D\2\u0250\u0251\7\4\2\2\u0251\u0253\3\2\2\2\u0252\u024f\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\5\u008cG\2\u0255)\3\2\2"+
		"\2\u0256\u0257\7A\2\2\u0257\u025a\7\u008a\2\2\u0258\u0259\7R\2\2\u0259"+
		"\u025b\7H\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025f\3\2"+
		"\2\2\u025c\u025d\5\u0086D\2\u025d\u025e\7\4\2\2\u025e\u0260\3\2\2\2\u025f"+
		"\u025c\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\5\u009a"+
		"N\2\u0262+\3\2\2\2\u0263\u0264\7A\2\2\u0264\u0267\7\u0091\2\2\u0265\u0266"+
		"\7R\2\2\u0266\u0268\7H\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026c\3\2\2\2\u0269\u026a\5\u0086D\2\u026a\u026b\7\4\2\2\u026b\u026d"+
		"\3\2\2\2\u026c\u0269\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u026f\5\u009cO\2\u026f-\3\2\2\2\u0270\u0272\5\\/\2\u0271\u0270\3\2\2"+
		"\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0279\5p9\2\u0274\u0275"+
		"\5r:\2\u0275\u0276\5p9\2\u0276\u0278\3\2\2\2\u0277\u0274\3\2\2\2\u0278"+
		"\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0286\3\2"+
		"\2\2\u027b\u0279\3\2\2\2\u027c\u027d\7o\2\2\u027d\u027e\7*\2\2\u027e\u0283"+
		"\5`\61\2\u027f\u0280\7\7\2\2\u0280\u0282\5`\61\2\u0281\u027f\3\2\2\2\u0282"+
		"\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0287\3\2"+
		"\2\2\u0285\u0283\3\2\2\2\u0286\u027c\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u028e\3\2\2\2\u0288\u0289\7d\2\2\u0289\u028c\5P)\2\u028a\u028b\t\4\2"+
		"\2\u028b\u028d\5P)\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f"+
		"\3\2\2\2\u028e\u0288\3\2\2\2\u028e\u028f\3\2\2\2\u028f/\3\2\2\2\u0290"+
		"\u0292\5\\/\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u02a4\3\2"+
		"\2\2\u0293\u02a5\7Z\2\2\u0294\u02a5\7|\2\2\u0295\u0296\7Z\2\2\u0296\u0297"+
		"\7n\2\2\u0297\u02a5\7|\2\2\u0298\u0299\7Z\2\2\u0299\u029a\7n\2\2\u029a"+
		"\u02a5\7\177\2\2\u029b\u029c\7Z\2\2\u029c\u029d\7n\2\2\u029d\u02a5\7\33"+
		"\2\2\u029e\u029f\7Z\2\2\u029f\u02a0\7n\2\2\u02a0\u02a5\7J\2\2\u02a1\u02a2"+
		"\7Z\2\2\u02a2\u02a3\7n\2\2\u02a3\u02a5\7S\2\2\u02a4\u0293\3\2\2\2\u02a4"+
		"\u0294\3\2\2\2\u02a4\u0295\3\2\2\2\u02a4\u0298\3\2\2\2\u02a4\u029b\3\2"+
		"\2\2\u02a4\u029e\3\2\2\2\u02a4\u02a1\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02aa\7]\2\2\u02a7\u02a8\5\u0086D\2\u02a8\u02a9\7\4\2\2\u02a9\u02ab\3"+
		"\2\2\2\u02aa\u02a7\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02b8\5\u008cG\2\u02ad\u02ae\7\5\2\2\u02ae\u02b3\5\u0092J\2\u02af\u02b0"+
		"\7\7\2\2\u02b0\u02b2\5\u0092J\2\u02b1\u02af\3\2\2\2\u02b2\u02b5\3\2\2"+
		"\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3"+
		"\3\2\2\2\u02b6\u02b7\7\6\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02ad\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b9\u02d9\3\2\2\2\u02ba\u02bb\7\u0090\2\2\u02bb\u02bc"+
		"\7\5\2\2\u02bc\u02c1\5P)\2\u02bd\u02be\7\7\2\2\u02be\u02c0\5P)\2\u02bf"+
		"\u02bd\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2"+
		"\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02d3\7\6\2\2\u02c5"+
		"\u02c6\7\7\2\2\u02c6\u02c7\7\5\2\2\u02c7\u02cc\5P)\2\u02c8\u02c9\7\7\2"+
		"\2\u02c9\u02cb\5P)\2\u02ca\u02c8\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca"+
		"\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf"+
		"\u02d0\7\6\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02c5\3\2\2\2\u02d2\u02d5\3\2"+
		"\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02da\3\2\2\2\u02d5"+
		"\u02d3\3\2\2\2\u02d6\u02da\5> \2\u02d7\u02d8\7:\2\2\u02d8\u02da\7\u0090"+
		"\2\2\u02d9\u02ba\3\2\2\2\u02d9\u02d6\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da"+
		"\61\3\2\2\2\u02db\u02df\7r\2\2\u02dc\u02dd\5\u0086D\2\u02dd\u02de\7\4"+
		"\2\2\u02de\u02e0\3\2\2\2\u02df\u02dc\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e8\5\u00a0Q\2\u02e2\u02e3\7\b\2\2\u02e3\u02e9"+
		"\5b\62\2\u02e4\u02e5\7\5\2\2\u02e5\u02e6\5b\62\2\u02e6\u02e7\7\6\2\2\u02e7"+
		"\u02e9\3\2\2\2\u02e8\u02e2\3\2\2\2\u02e8\u02e4\3\2\2\2\u02e8\u02e9\3\2"+
		"\2\2\u02e9\63\3\2\2\2\u02ea\u02f5\7y\2\2\u02eb\u02f6\5\u0094K\2\u02ec"+
		"\u02ed\5\u0086D\2\u02ed\u02ee\7\4\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02ec"+
		"\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02f4\5\u008cG"+
		"\2\u02f2\u02f4\5\u0098M\2\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4"+
		"\u02f6\3\2\2\2\u02f5\u02eb\3\2\2\2\u02f5\u02ef\3\2\2\2\u02f5\u02f6\3\2"+
		"\2\2\u02f6\65\3\2\2\2\u02f7\u02f9\7z\2\2\u02f8\u02fa\7\u0081\2\2\u02f9"+
		"\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\5\u00a2"+
		"R\2\u02fc\67\3\2\2\2\u02fd\u0302\7\177\2\2\u02fe\u0300\7\u0089\2\2\u02ff"+
		"\u0301\5\u00a6T\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303"+
		"\3\2\2\2\u0302\u02fe\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0309\3\2\2\2\u0304"+
		"\u0306\7\u0088\2\2\u0305\u0307\7\u0081\2\2\u0306\u0305\3\2\2\2\u0306\u0307"+
		"\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a\5\u00a2R\2\u0309\u0304\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030a9\3\2\2\2\u030b\u030c\7\u0081\2\2\u030c\u030d"+
		"\5\u00a2R\2\u030d;\3\2\2\2\u030e\u0310\5\\/\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u031c\5p9\2\u0312\u0313\7o\2"+
		"\2\u0313\u0314\7*\2\2\u0314\u0319\5`\61\2\u0315\u0316\7\7\2\2\u0316\u0318"+
		"\5`\61\2\u0317\u0315\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u0312\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u0324\3\2\2\2\u031e\u031f\7d\2\2\u031f"+
		"\u0322\5P)\2\u0320\u0321\t\4\2\2\u0321\u0323\5P)\2\u0322\u0320\3\2\2\2"+
		"\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u031e\3\2\2\2\u0324\u0325"+
		"\3\2\2\2\u0325=\3\2\2\2\u0326\u0328\5\\/\2\u0327\u0326\3\2\2\2\u0327\u0328"+
		"\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032f\5@!\2\u032a\u032b\5r:\2\u032b"+
		"\u032c\5@!\2\u032c\u032e\3\2\2\2\u032d\u032a\3\2\2\2\u032e\u0331\3\2\2"+
		"\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u033c\3\2\2\2\u0331\u032f"+
		"\3\2\2\2\u0332\u0333\7o\2\2\u0333\u0334\7*\2\2\u0334\u0339\5`\61\2\u0335"+
		"\u0336\7\7\2\2\u0336\u0338\5`\61\2\u0337\u0335\3\2\2\2\u0338\u033b\3\2"+
		"\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033d\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033c\u0332\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0344\3\2"+
		"\2\2\u033e\u033f\7d\2\2\u033f\u0342\5P)\2\u0340\u0341\t\4\2\2\u0341\u0343"+
		"\5P)\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344"+
		"\u033e\3\2\2\2\u0344\u0345\3\2\2\2\u0345?\3\2\2\2\u0346\u0348\7\u0082"+
		"\2\2\u0347\u0349\t\6\2\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034f\5f\64\2\u034b\u034c\7\7\2\2\u034c\u034e\5f"+
		"\64\2\u034d\u034b\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f"+
		"\u0350\3\2\2\2\u0350\u035e\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u035c\7M"+
		"\2\2\u0353\u0358\5h\65\2\u0354\u0355\7\7\2\2\u0355\u0357\5h\65\2\u0356"+
		"\u0354\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2"+
		"\2\2\u0359\u035d\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035d\5j\66\2\u035c"+
		"\u0353\3\2\2\2\u035c\u035b\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0352\3\2"+
		"\2\2\u035e\u035f\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u0361\7\u0094\2\2\u0361"+
		"\u0363\5P)\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0372\3\2\2"+
		"\2\u0364\u0365\7P\2\2\u0365\u0366\7*\2\2\u0366\u036b\5P)\2\u0367\u0368"+
		"\7\7\2\2\u0368\u036a\5P)\2\u0369\u0367\3\2\2\2\u036a\u036d\3\2\2\2\u036b"+
		"\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u0370\3\2\2\2\u036d\u036b\3\2"+
		"\2\2\u036e\u036f\7Q\2\2\u036f\u0371\5P)\2\u0370\u036e\3\2\2\2\u0370\u0371"+
		"\3\2\2\2\u0371\u0373\3\2\2\2\u0372\u0364\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"\u0391\3\2\2\2\u0374\u0375\7\u0090\2\2\u0375\u0376\7\5\2\2\u0376\u037b"+
		"\5P)\2\u0377\u0378\7\7\2\2\u0378\u037a\5P)\2\u0379\u0377\3\2\2\2\u037a"+
		"\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e\3\2"+
		"\2\2\u037d\u037b\3\2\2\2\u037e\u038d\7\6\2\2\u037f\u0380\7\7\2\2\u0380"+
		"\u0381\7\5\2\2\u0381\u0386\5P)\2\u0382\u0383\7\7\2\2\u0383\u0385\5P)\2"+
		"\u0384\u0382\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387"+
		"\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038a\7\6\2\2\u038a"+
		"\u038c\3\2\2\2\u038b\u037f\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2"+
		"\2\2\u038d\u038e\3\2\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u0390"+
		"\u0346\3\2\2\2\u0390\u0374\3\2\2\2\u0391A\3\2\2\2\u0392\u0394\5\\/\2\u0393"+
		"\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u03a0\7\u008d"+
		"\2\2\u0396\u0397\7n\2\2\u0397\u03a1\7\177\2\2\u0398\u0399\7n\2\2\u0399"+
		"\u03a1\7\33\2\2\u039a\u039b\7n\2\2\u039b\u03a1\7|\2\2\u039c\u039d\7n\2"+
		"\2\u039d\u03a1\7J\2\2\u039e\u039f\7n\2\2\u039f\u03a1\7S\2\2\u03a0\u0396"+
		"\3\2\2\2\u03a0\u0398\3\2\2\2\u03a0\u039a\3\2\2\2\u03a0\u039c\3\2\2\2\u03a0"+
		"\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\5^"+
		"\60\2\u03a3\u03a4\7\u0083\2\2\u03a4\u03a5\5\u0092J\2\u03a5\u03a6\7\b\2"+
		"\2\u03a6\u03ae\5P)\2\u03a7\u03a8\7\7\2\2\u03a8\u03a9\5\u0092J\2\u03a9"+
		"\u03aa\7\b\2\2\u03aa\u03ab\5P)\2\u03ab\u03ad\3\2\2\2\u03ac\u03a7\3\2\2"+
		"\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b3"+
		"\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03b2\7\u0094\2\2\u03b2\u03b4\5P)\2"+
		"\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4C\3\2\2\2\u03b5\u03b7\5"+
		"\\/\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03c3\7\u008d\2\2\u03b9\u03ba\7n\2\2\u03ba\u03c4\7\177\2\2\u03bb\u03bc"+
		"\7n\2\2\u03bc\u03c4\7\33\2\2\u03bd\u03be\7n\2\2\u03be\u03c4\7|\2\2\u03bf"+
		"\u03c0\7n\2\2\u03c0\u03c4\7J\2\2\u03c1\u03c2\7n\2\2\u03c2\u03c4\7S\2\2"+
		"\u03c3\u03b9\3\2\2\2\u03c3\u03bb\3\2\2\2\u03c3\u03bd\3\2\2\2\u03c3\u03bf"+
		"\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5"+
		"\u03c6\5^\60\2\u03c6\u03c7\7\u0083\2\2\u03c7\u03c8\5\u0092J\2\u03c8\u03c9"+
		"\7\b\2\2\u03c9\u03d1\5P)\2\u03ca\u03cb\7\7\2\2\u03cb\u03cc\5\u0092J\2"+
		"\u03cc\u03cd\7\b\2\2\u03cd\u03ce\5P)\2\u03ce\u03d0\3\2\2\2\u03cf\u03ca"+
		"\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2"+
		"\u03d6\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d5\7\u0094\2\2\u03d5\u03d7"+
		"\5P)\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03ea\3\2\2\2\u03d8"+
		"\u03d9\7o\2\2\u03d9\u03da\7*\2\2\u03da\u03df\5`\61\2\u03db\u03dc\7\7\2"+
		"\2\u03dc\u03de\5`\61\2\u03dd\u03db\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd"+
		"\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2"+
		"\u03d8\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\7d"+
		"\2\2\u03e5\u03e8\5P)\2\u03e6\u03e7\t\4\2\2\u03e7\u03e9\5P)\2\u03e8\u03e6"+
		"\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03e2\3\2\2\2\u03ea"+
		"\u03eb\3\2\2\2\u03ebE\3\2\2\2\u03ec\u03ed\7\u008f\2\2\u03edG\3\2\2\2\u03ee"+
		"\u03f0\5\u0092J\2\u03ef\u03f1\5J&\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3"+
		"\2\2\2\u03f1\u03f5\3\2\2\2\u03f2\u03f4\5L\'\2\u03f3\u03f2\3\2\2\2\u03f4"+
		"\u03f7\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6I\3\2\2\2"+
		"\u03f7\u03f5\3\2\2\2\u03f8\u03fa\5\u0082B\2\u03f9\u03f8\3\2\2\2\u03fa"+
		"\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fc\u0407\3\2"+
		"\2\2\u03fd\u03fe\7\5\2\2\u03fe\u03ff\5t;\2\u03ff\u0400\7\6\2\2\u0400\u0408"+
		"\3\2\2\2\u0401\u0402\7\5\2\2\u0402\u0403\5t;\2\u0403\u0404\7\7\2\2\u0404"+
		"\u0405\5t;\2\u0405\u0406\7\6\2\2\u0406\u0408\3\2\2\2\u0407\u03fd\3\2\2"+
		"\2\u0407\u0401\3\2\2\2\u0407\u0408\3\2\2\2\u0408K\3\2\2\2\u0409\u040a"+
		"\7\63\2\2\u040a\u040c\5\u0082B\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2"+
		"\2\u040c\u042e\3\2\2\2\u040d\u040e\7s\2\2\u040e\u0410\7a\2\2\u040f\u0411"+
		"\t\7\2\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412"+
		"\u0414\5N(\2\u0413\u0415\7&\2\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2"+
		"\2\u0415\u042f\3\2\2\2\u0416\u0418\7h\2\2\u0417\u0416\3\2\2\2\u0417\u0418"+
		"\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\7j\2\2\u041a\u042f\5N(\2\u041b"+
		"\u041c\7\u008c\2\2\u041c\u042f\5N(\2\u041d\u041e\7.\2\2\u041e\u041f\7"+
		"\5\2\2\u041f\u0420\5P)\2\u0420\u0421\7\6\2\2\u0421\u042f\3\2\2\2\u0422"+
		"\u0429\7:\2\2\u0423\u042a\5t;\2\u0424\u042a\5v<\2\u0425\u0426\7\5\2\2"+
		"\u0426\u0427\5P)\2\u0427\u0428\7\6\2\2\u0428\u042a\3\2\2\2\u0429\u0423"+
		"\3\2\2\2\u0429\u0424\3\2\2\2\u0429\u0425\3\2\2\2\u042a\u042f\3\2\2\2\u042b"+
		"\u042c\7/\2\2\u042c\u042f\5\u0094K\2\u042d\u042f\5T+\2\u042e\u040d\3\2"+
		"\2\2\u042e\u0417\3\2\2\2\u042e\u041b\3\2\2\2\u042e\u041d\3\2\2\2\u042e"+
		"\u0422\3\2\2\2\u042e\u042b\3\2\2\2\u042e\u042d\3\2\2\2\u042fM\3\2\2\2"+
		"\u0430\u0431\7m\2\2\u0431\u0432\7\62\2\2\u0432\u0434\t\b\2\2\u0433\u0430"+
		"\3\2\2\2\u0433\u0434\3\2\2\2\u0434O\3\2\2\2\u0435\u0436\b)\1\2\u0436\u0437"+
		"\5x=\2\u0437\u0438\5P)\26\u0438\u0479\3\2\2\2\u0439\u0479\5v<\2\u043a"+
		"\u0479\7\u009a\2\2\u043b\u0479\5R*\2\u043c\u0479\7\u0098\2\2\u043d\u043e"+
		"\5\u0084C\2\u043e\u044b\7\5\2\2\u043f\u0441\7@\2\2\u0440\u043f\3\2\2\2"+
		"\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0447\5P)\2\u0443\u0444"+
		"\7\7\2\2\u0444\u0446\5P)\2\u0445\u0443\3\2\2\2\u0446\u0449\3\2\2\2\u0447"+
		"\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044c\3\2\2\2\u0449\u0447\3\2"+
		"\2\2\u044a\u044c\7\t\2\2\u044b\u0440\3\2\2\2\u044b\u044a\3\2\2\2\u044b"+
		"\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\7\6\2\2\u044e\u0479\3\2"+
		"\2\2\u044f\u0450\7\5\2\2\u0450\u0451\5P)\2\u0451\u0452\7\6\2\2\u0452\u0479"+
		"\3\2\2\2\u0453\u0454\7-\2\2\u0454\u0455\7\5\2\2\u0455\u0456\5P)\2\u0456"+
		"\u0457\7#\2\2\u0457\u0458\5J&\2\u0458\u0459\7\6\2\2\u0459\u0479\3\2\2"+
		"\2\u045a\u045c\7h\2\2\u045b\u045a\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045d"+
		"\3\2\2\2\u045d\u045f\7H\2\2\u045e\u045b\3\2\2\2\u045e\u045f\3\2\2\2\u045f"+
		"\u0460\3\2\2\2\u0460\u0461\7\5\2\2\u0461\u0462\5> \2\u0462\u0463\7\6\2"+
		"\2\u0463\u0479\3\2\2\2\u0464\u0466\7,\2\2\u0465\u0467\5P)\2\u0466\u0465"+
		"\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u046d\3\2\2\2\u0468\u0469\7\u0093\2"+
		"\2\u0469\u046a\5P)\2\u046a\u046b\7\u0087\2\2\u046b\u046c\5P)\2\u046c\u046e"+
		"\3\2\2\2\u046d\u0468\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u046d\3\2\2\2\u046f"+
		"\u0470\3\2\2\2\u0470\u0473\3\2\2\2\u0471\u0472\7C\2\2\u0472\u0474\5P)"+
		"\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476"+
		"\7D\2\2\u0476\u0479\3\2\2\2\u0477\u0479\5V,\2\u0478\u0435\3\2\2\2\u0478"+
		"\u0439\3\2\2\2\u0478\u043a\3\2\2\2\u0478\u043b\3\2\2\2\u0478\u043c\3\2"+
		"\2\2\u0478\u043d\3\2\2\2\u0478\u044f\3\2\2\2\u0478\u0453\3\2\2\2\u0478"+
		"\u045e\3\2\2\2\u0478\u0464\3\2\2\2\u0478\u0477\3\2\2\2\u0479\u04cf\3\2"+
		"\2\2\u047a\u047b\f\25\2\2\u047b\u047c\7\r\2\2\u047c\u04ce\5P)\26\u047d"+
		"\u047e\f\24\2\2\u047e\u047f\t\t\2\2\u047f\u04ce\5P)\25\u0480\u0481\f\23"+
		"\2\2\u0481\u0482\t\n\2\2\u0482\u04ce\5P)\24\u0483\u0484\f\22\2\2\u0484"+
		"\u0485\t\13\2\2\u0485\u04ce\5P)\23\u0486\u0487\f\21\2\2\u0487\u0488\5"+
		"\u00aaV\2\u0488\u0489\5P)\22\u0489\u04ce\3\2\2\2\u048a\u048b\f\17\2\2"+
		"\u048b\u048c\7\"\2\2\u048c\u04ce\5P)\20\u048d\u048e\f\16\2\2\u048e\u048f"+
		"\7n\2\2\u048f\u04ce\5P)\17\u0490\u0491\f\7\2\2\u0491\u0493\7^\2\2\u0492"+
		"\u0494\7h\2\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2"+
		"\2\2\u0495\u04ce\5P)\b\u0496\u0498\f\6\2\2\u0497\u0499\7h\2\2\u0498\u0497"+
		"\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\7)\2\2\u049b"+
		"\u049c\5P)\2\u049c\u049d\7\"\2\2\u049d\u049e\5P)\7\u049e\u04ce\3\2\2\2"+
		"\u049f\u04a1\f\20\2\2\u04a0\u04a2\7h\2\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2"+
		"\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04b7\7U\2\2\u04a4\u04ae\7\5\2\2\u04a5"+
		"\u04af\5> \2\u04a6\u04ab\5P)\2\u04a7\u04a8\7\7\2\2\u04a8\u04aa\5P)\2\u04a9"+
		"\u04a7\3\2\2\2\u04aa\u04ad\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab\u04ac\3\2"+
		"\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ae\u04a5\3\2\2\2\u04ae"+
		"\u04a6\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b8\7\6"+
		"\2\2\u04b1\u04b2\5\u0086D\2\u04b2\u04b3\7\4\2\2\u04b3\u04b5\3\2\2\2\u04b4"+
		"\u04b1\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\5\u008c"+
		"G\2\u04b7\u04a4\3\2\2\2\u04b7\u04b4\3\2\2\2\u04b8\u04ce\3\2\2\2\u04b9"+
		"\u04ba\f\n\2\2\u04ba\u04bb\7/\2\2\u04bb\u04ce\5\u0094K\2\u04bc\u04be\f"+
		"\t\2\2\u04bd\u04bf\7h\2\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf"+
		"\u04c0\3\2\2\2\u04c0\u04c1\t\f\2\2\u04c1\u04c4\5P)\2\u04c2\u04c3\7E\2"+
		"\2\u04c3\u04c5\5P)\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04ce"+
		"\3\2\2\2\u04c6\u04cb\f\b\2\2\u04c7\u04cc\7_\2\2\u04c8\u04cc\7i\2\2\u04c9"+
		"\u04ca\7h\2\2\u04ca\u04cc\7j\2\2\u04cb\u04c7\3\2\2\2\u04cb\u04c8\3\2\2"+
		"\2\u04cb\u04c9\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd\u047a\3\2\2\2\u04cd\u047d"+
		"\3\2\2\2\u04cd\u0480\3\2\2\2\u04cd\u0483\3\2\2\2\u04cd\u0486\3\2\2\2\u04cd"+
		"\u048a\3\2\2\2\u04cd\u048d\3\2\2\2\u04cd\u0490\3\2\2\2\u04cd\u0496\3\2"+
		"\2\2\u04cd\u049f\3\2\2\2\u04cd\u04b9\3\2\2\2\u04cd\u04bc\3\2\2\2\u04cd"+
		"\u04c6\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd\3\2\2\2\u04cf\u04d0\3\2"+
		"\2\2\u04d0Q\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u04d3\5\u0086D\2\u04d3\u04d4"+
		"\7\4\2\2\u04d4\u04d6\3\2\2\2\u04d5\u04d2\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6"+
		"\u04d7\3\2\2\2\u04d7\u04d8\5\u008cG\2\u04d8\u04d9\7\4\2\2\u04d9\u04db"+
		"\3\2\2\2\u04da\u04d5\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04dd\5\u0092J\2\u04ddS\3\2\2\2\u04de\u04df\7w\2\2\u04df\u04eb\5\u0096"+
		"L\2\u04e0\u04e1\7\5\2\2\u04e1\u04e6\5\u0092J\2\u04e2\u04e3\7\7\2\2\u04e3"+
		"\u04e5\5\u0092J\2\u04e4\u04e2\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4"+
		"\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9"+
		"\u04ea\7\6\2\2\u04ea\u04ec\3\2\2\2\u04eb\u04e0\3\2\2\2\u04eb\u04ec\3\2"+
		"\2\2\u04ec\u04ff\3\2\2\2\u04ed\u04ee\7m\2\2\u04ee\u04f7\t\r\2\2\u04ef"+
		"\u04f0\7\u0083\2\2\u04f0\u04f8\7j\2\2\u04f1\u04f2\7\u0083\2\2\u04f2\u04f8"+
		"\7:\2\2\u04f3\u04f8\7+\2\2\u04f4\u04f8\7}\2\2\u04f5\u04f6\7g\2\2\u04f6"+
		"\u04f8\7\34\2\2\u04f7\u04ef\3\2\2\2\u04f7\u04f1\3\2\2\2\u04f7\u04f3\3"+
		"\2\2\2\u04f7\u04f4\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f8\u04fc\3\2\2\2\u04f9"+
		"\u04fa\7e\2\2\u04fa\u04fc\5\u0082B\2\u04fb\u04ed\3\2\2\2\u04fb\u04f9\3"+
		"\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff"+
		"\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u050c\3\2\2\2\u0501\u04ff\3\2"+
		"\2\2\u0502\u0504\7h\2\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504"+
		"\u0505\3\2\2\2\u0505\u050a\7;\2\2\u0506\u0507\7X\2\2\u0507\u050b\7<\2"+
		"\2\u0508\u0509\7X\2\2\u0509\u050b\7T\2\2\u050a\u0506\3\2\2\2\u050a\u0508"+
		"\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d\3\2\2\2\u050c\u0503\3\2\2\2\u050c"+
		"\u050d\3\2\2\2\u050dU\3\2\2\2\u050e\u050f\7u\2\2\u050f\u0514\7\5\2\2\u0510"+
		"\u0515\7S\2\2\u0511\u0512\t\16\2\2\u0512\u0513\7\7\2\2\u0513\u0515\5z"+
		">\2\u0514\u0510\3\2\2\2\u0514\u0511\3\2\2\2\u0515\u0516\3\2\2\2\u0516"+
		"\u0517\7\6\2\2\u0517W\3\2\2\2\u0518\u051b\5\u0092J\2\u0519\u051a\7/\2"+
		"\2\u051a\u051c\5\u0094K\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c"+
		"\u051e\3\2\2\2\u051d\u051f\t\7\2\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2"+
		"\2\2\u051fY\3\2\2\2\u0520\u0521\7\63\2\2\u0521\u0523\5\u0082B\2\u0522"+
		"\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0548\3\2\2\2\u0524\u0525\7s"+
		"\2\2\u0525\u0528\7a\2\2\u0526\u0528\7\u008c\2\2\u0527\u0524\3\2\2\2\u0527"+
		"\u0526\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\7\5\2\2\u052a\u052f\5X"+
		"-\2\u052b\u052c\7\7\2\2\u052c\u052e\5X-\2\u052d\u052b\3\2\2\2\u052e\u0531"+
		"\3\2\2\2\u052f\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532\3\2\2\2\u0531"+
		"\u052f\3\2\2\2\u0532\u0533\7\6\2\2\u0533\u0534\5N(\2\u0534\u0549\3\2\2"+
		"\2\u0535\u0536\7.\2\2\u0536\u0537\7\5\2\2\u0537\u0538\5P)\2\u0538\u0539"+
		"\7\6\2\2\u0539\u0549\3\2\2\2\u053a\u053b\7L\2\2\u053b\u053c\7a\2\2\u053c"+
		"\u053d\7\5\2\2\u053d\u0542\5\u0092J\2\u053e\u053f\7\7\2\2\u053f\u0541"+
		"\5\u0092J\2\u0540\u053e\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2"+
		"\2\u0542\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544\u0542\3\2\2\2\u0545\u0546"+
		"\7\6\2\2\u0546\u0547\5T+\2\u0547\u0549\3\2\2\2\u0548\u0527\3\2\2\2\u0548"+
		"\u0535\3\2\2\2\u0548\u053a\3\2\2\2\u0549[\3\2\2\2\u054a\u054c\7\u0095"+
		"\2\2\u054b\u054d\7v\2\2\u054c\u054b\3\2\2\2\u054c\u054d\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u0553\5d\63\2\u054f\u0550\7\7\2\2\u0550\u0552\5d"+
		"\63\2\u0551\u054f\3\2\2\2\u0552\u0555\3\2\2\2\u0553\u0551\3\2\2\2\u0553"+
		"\u0554\3\2\2\2\u0554]\3\2\2\2\u0555\u0553\3\2\2\2\u0556\u0557\5\u0086"+
		"D\2\u0557\u0558\7\4\2\2\u0558\u055a\3\2\2\2\u0559\u0556\3\2\2\2\u0559"+
		"\u055a\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u0561\5\u008cG\2\u055c\u055d"+
		"\7W\2\2\u055d\u055e\7*\2\2\u055e\u0562\5\u0098M\2\u055f\u0560\7h\2\2\u0560"+
		"\u0562\7W\2\2\u0561\u055c\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2"+
		"\2\2\u0562_\3\2\2\2\u0563\u0566\5P)\2\u0564\u0565\7/\2\2\u0565\u0567\5"+
		"\u0094K\2\u0566\u0564\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2\2"+
		"\u0568\u056a\t\7\2\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056aa\3"+
		"\2\2\2\u056b\u056f\5t;\2\u056c\u056f\5\u0082B\2\u056d\u056f\7\u009b\2"+
		"\2\u056e\u056b\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056d\3\2\2\2\u056fc"+
		"\3\2\2\2\u0570\u057c\5\u008cG\2\u0571\u0572\7\5\2\2\u0572\u0577\5\u0092"+
		"J\2\u0573\u0574\7\7\2\2\u0574\u0576\5\u0092J\2\u0575\u0573\3\2\2\2\u0576"+
		"\u0579\3\2\2\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057a\3\2"+
		"\2\2\u0579\u0577\3\2\2\2\u057a\u057b\7\6\2\2\u057b\u057d\3\2\2\2\u057c"+
		"\u0571\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f\7#"+
		"\2\2\u057f\u0580\7\5\2\2\u0580\u0581\5> \2\u0581\u0582\7\6\2\2\u0582e"+
		"\3\2\2\2\u0583\u0590\7\t\2\2\u0584\u0585\5\u008cG\2\u0585\u0586\7\4\2"+
		"\2\u0586\u0587\7\t\2\2\u0587\u0590\3\2\2\2\u0588\u058d\5P)\2\u0589\u058b"+
		"\7#\2\2\u058a\u0589\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\3\2\2\2\u058c"+
		"\u058e\5~@\2\u058d\u058a\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0590\3\2\2"+
		"\2\u058f\u0583\3\2\2\2\u058f\u0584\3\2\2\2\u058f\u0588\3\2\2\2\u0590g"+
		"\3\2\2\2\u0591\u0592\5\u0088E\2\u0592\u0593\7\4\2\2\u0593\u0595\3\2\2"+
		"\2\u0594\u0591\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u059b"+
		"\5\u008cG\2\u0597\u0599\7#\2\2\u0598\u0597\3\2\2\2\u0598\u0599\3\2\2\2"+
		"\u0599\u059a\3\2\2\2\u059a\u059c\5\u00a4S\2\u059b\u0598\3\2\2\2\u059b"+
		"\u059c\3\2\2\2\u059c\u05a2\3\2\2\2\u059d\u059e\7W\2\2\u059e\u059f\7*\2"+
		"\2\u059f\u05a3\5\u0098M\2\u05a0\u05a1\7h\2\2\u05a1\u05a3\7W\2\2\u05a2"+
		"\u059d\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05d4\3\2"+
		"\2\2\u05a4\u05a5\5\u0088E\2\u05a5\u05a6\7\4\2\2\u05a6\u05a8\3\2\2\2\u05a7"+
		"\u05a4\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\5\u008a"+
		"F\2\u05aa\u05b3\7\5\2\2\u05ab\u05b0\5P)\2\u05ac\u05ad\7\7\2\2\u05ad\u05af"+
		"\5P)\2\u05ae\u05ac\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0"+
		"\u05b1\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05ab\3\2"+
		"\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05ba\7\6\2\2\u05b6"+
		"\u05b8\7#\2\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\3\2"+
		"\2\2\u05b9\u05bb\5\u00a4S\2\u05ba\u05b7\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb"+
		"\u05d4\3\2\2\2\u05bc\u05c6\7\5\2\2\u05bd\u05c2\5h\65\2\u05be\u05bf\7\7"+
		"\2\2\u05bf\u05c1\5h\65\2\u05c0\u05be\3\2\2\2\u05c1\u05c4\3\2\2\2\u05c2"+
		"\u05c0\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c7\3\2\2\2\u05c4\u05c2\3\2"+
		"\2\2\u05c5\u05c7\5j\66\2\u05c6\u05bd\3\2\2\2\u05c6\u05c5\3\2\2\2\u05c7"+
		"\u05c8\3\2\2\2\u05c8\u05c9\7\6\2\2\u05c9\u05d4\3\2\2\2\u05ca\u05cb\7\5"+
		"\2\2\u05cb\u05cc\5> \2\u05cc\u05d1\7\6\2\2\u05cd\u05cf\7#\2\2\u05ce\u05cd"+
		"\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d2\5\u00a4S"+
		"\2\u05d1\u05ce\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d4\3\2\2\2\u05d3\u0594"+
		"\3\2\2\2\u05d3\u05a7\3\2\2\2\u05d3\u05bc\3\2\2\2\u05d3\u05ca\3\2\2\2\u05d4"+
		"i\3\2\2\2\u05d5\u05dc\5h\65\2\u05d6\u05d7\5l\67\2\u05d7\u05d8\5h\65\2"+
		"\u05d8\u05d9\5n8\2\u05d9\u05db\3\2\2\2\u05da\u05d6\3\2\2\2\u05db\u05de"+
		"\3\2\2\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05ddk\3\2\2\2\u05de"+
		"\u05dc\3\2\2\2\u05df\u05ed\7\7\2\2\u05e0\u05e2\7f\2\2\u05e1\u05e0\3\2"+
		"\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e9\3\2\2\2\u05e3\u05e5\7b\2\2\u05e4"+
		"\u05e6\7p\2\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05ea\3\2"+
		"\2\2\u05e7\u05ea\7Y\2\2\u05e8\u05ea\7\65\2\2\u05e9\u05e3\3\2\2\2\u05e9"+
		"\u05e7\3\2\2\2\u05e9\u05e8\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05eb\3\2"+
		"\2\2\u05eb\u05ed\7`\2\2\u05ec\u05df\3\2\2\2\u05ec\u05e1\3\2\2\2\u05ed"+
		"m\3\2\2\2\u05ee\u05ef\7m\2\2\u05ef\u05fd\5P)\2\u05f0\u05f1\7\u008e\2\2"+
		"\u05f1\u05f2\7\5\2\2\u05f2\u05f7\5\u0092J\2\u05f3\u05f4\7\7\2\2\u05f4"+
		"\u05f6\5\u0092J\2\u05f5\u05f3\3\2\2\2\u05f6\u05f9\3\2\2\2\u05f7\u05f5"+
		"\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\3\2\2\2\u05f9\u05f7\3\2\2\2\u05fa"+
		"\u05fb\7\6\2\2\u05fb\u05fd\3\2\2\2\u05fc\u05ee\3\2\2\2\u05fc\u05f0\3\2"+
		"\2\2\u05fc\u05fd\3\2\2\2\u05fdo\3\2\2\2\u05fe\u0600\7\u0082\2\2\u05ff"+
		"\u0601\t\6\2\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2"+
		"\2\2\u0602\u0607\5f\64\2\u0603\u0604\7\7\2\2\u0604\u0606\5f\64\2\u0605"+
		"\u0603\3\2\2\2\u0606\u0609\3\2\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2"+
		"\2\2\u0608\u0616\3\2\2\2\u0609\u0607\3\2\2\2\u060a\u0614\7M\2\2\u060b"+
		"\u0610\5h\65\2\u060c\u060d\7\7\2\2\u060d\u060f\5h\65\2\u060e\u060c\3\2"+
		"\2\2\u060f\u0612\3\2\2\2\u0610\u060e\3\2\2\2\u0610\u0611\3\2\2\2\u0611"+
		"\u0615\3\2\2\2\u0612\u0610\3\2\2\2\u0613\u0615\5j\66\2\u0614\u060b\3\2"+
		"\2\2\u0614\u0613\3\2\2\2\u0615\u0617\3\2\2\2\u0616\u060a\3\2\2\2\u0616"+
		"\u0617\3\2\2\2\u0617\u061a\3\2\2\2\u0618\u0619\7\u0094\2\2\u0619\u061b"+
		"\5P)\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u062a\3\2\2\2\u061c"+
		"\u061d\7P\2\2\u061d\u061e\7*\2\2\u061e\u0623\5P)\2\u061f\u0620\7\7\2\2"+
		"\u0620\u0622\5P)\2\u0621\u061f\3\2\2\2\u0622\u0625\3\2\2\2\u0623\u0621"+
		"\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0628\3\2\2\2\u0625\u0623\3\2\2\2\u0626"+
		"\u0627\7Q\2\2\u0627\u0629\5P)\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2"+
		"\2\u0629\u062b\3\2\2\2\u062a\u061c\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u0649"+
		"\3\2\2\2\u062c\u062d\7\u0090\2\2\u062d\u062e\7\5\2\2\u062e\u0633\5P)\2"+
		"\u062f\u0630\7\7\2\2\u0630\u0632\5P)\2\u0631\u062f\3\2\2\2\u0632\u0635"+
		"\3\2\2\2\u0633\u0631\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636\3\2\2\2\u0635"+
		"\u0633\3\2\2\2\u0636\u0645\7\6\2\2\u0637\u0638\7\7\2\2\u0638\u0639\7\5"+
		"\2\2\u0639\u063e\5P)\2\u063a\u063b\7\7\2\2\u063b\u063d\5P)\2\u063c\u063a"+
		"\3\2\2\2\u063d\u0640\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f"+
		"\u0641\3\2\2\2\u0640\u063e\3\2\2\2\u0641\u0642\7\6\2\2\u0642\u0644\3\2"+
		"\2\2\u0643\u0637\3\2\2\2\u0644\u0647\3\2\2\2\u0645\u0643\3\2\2\2\u0645"+
		"\u0646\3\2\2\2\u0646\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0648\u05fe\3\2"+
		"\2\2\u0648\u062c\3\2\2\2\u0649q\3\2\2\2\u064a\u0650\7\u008b\2\2\u064b"+
		"\u064c\7\u008b\2\2\u064c\u0650\7\37\2\2\u064d\u0650\7\\\2\2\u064e\u0650"+
		"\7F\2\2\u064f\u064a\3\2\2\2\u064f\u064b\3\2\2\2\u064f\u064d\3\2\2\2\u064f"+
		"\u064e\3\2\2\2\u0650s\3\2\2\2\u0651\u0653\t\n\2\2\u0652\u0651\3\2\2\2"+
		"\u0652\u0653\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\7\u0099\2\2\u0655"+
		"u\3\2\2\2\u0656\u0657\t\17\2\2\u0657w\3\2\2\2\u0658\u0659\t\20\2\2\u0659"+
		"y\3\2\2\2\u065a\u065b\7\u009b\2\2\u065b{\3\2\2\2\u065c\u065f\5P)\2\u065d"+
		"\u065f\5H%\2\u065e\u065c\3\2\2\2\u065e\u065d\3\2\2\2\u065f}\3\2\2\2\u0660"+
		"\u0661\t\21\2\2\u0661\177\3\2\2\2\u0662\u0663\t\22\2\2\u0663\u0081\3\2"+
		"\2\2\u0664\u0665\5\u00a8U\2\u0665\u0083\3\2\2\2\u0666\u0667\5\u00a8U\2"+
		"\u0667\u0085\3\2\2\2\u0668\u0669\7\u0097\2\2\u0669\u0087\3\2\2\2\u066a"+
		"\u066b\5\u00a8U\2\u066b\u0089\3\2\2\2\u066c\u066d\5\u00a8U\2\u066d\u008b"+
		"\3\2\2\2\u066e\u066f\7\u0097\2\2\u066f\u008d\3\2\2\2\u0670\u0671\5\u00a8"+
		"U\2\u0671\u008f\3\2\2\2\u0672\u0673\5\u00a8U\2\u0673\u0091\3\2\2\2\u0674"+
		"\u0675\7\u0097\2\2\u0675\u0093\3\2\2\2\u0676\u0677\5\u00a8U\2\u0677\u0095"+
		"\3\2\2\2\u0678\u0679\5\u00a8U\2\u0679\u0097\3\2\2\2\u067a\u067b\5\u00a8"+
		"U\2\u067b\u0099\3\2\2\2\u067c\u067d\5\u00a8U\2\u067d\u009b\3\2\2\2\u067e"+
		"\u067f\5\u00a8U\2\u067f\u009d\3\2\2\2\u0680\u0681\5\u00a8U\2\u0681\u009f"+
		"\3\2\2\2\u0682\u0683\5\u00a8U\2\u0683\u00a1\3\2\2\2\u0684\u0685\5\u00a8"+
		"U\2\u0685\u00a3\3\2\2\2\u0686\u068d\7\u0097\2\2\u0687\u068d\7\u009b\2"+
		"\2\u0688\u0689\7\5\2\2\u0689\u068a\5\u00a4S\2\u068a\u068b\7\6\2\2\u068b"+
		"\u068d\3\2\2\2\u068c\u0686\3\2\2\2\u068c\u0687\3\2\2\2\u068c\u0688\3\2"+
		"\2\2\u068d\u00a5\3\2\2\2\u068e\u068f\5\u00a8U\2\u068f\u00a7\3\2\2\2\u0690"+
		"\u0697\7\u0097\2\2\u0691\u0697\5\u0080A\2\u0692\u0693\7\5\2\2\u0693\u0694"+
		"\5\u00a8U\2\u0694\u0695\7\6\2\2\u0695\u0697\3\2\2\2\u0696\u0690\3\2\2"+
		"\2\u0696\u0691\3\2\2\2\u0696\u0692\3\2\2\2\u0697\u00a9\3\2\2\2\u0698\u0699"+
		"\t\23\2\2\u0699\u00ab\3\2\2\2\u00ef\u00ae\u00b0\u00bb\u00c2\u00c7\u00cd"+
		"\u00d3\u00d5\u00f5\u00fc\u0104\u0107\u0110\u0114\u011c\u0120\u0122\u0127"+
		"\u0129\u012c\u0131\u0135\u013a\u0143\u0146\u014c\u014e\u0152\u0158\u015d"+
		"\u0168\u016e\u0172\u0178\u017d\u0186\u018d\u0193\u0197\u019b\u01a1\u01a6"+
		"\u01ad\u01b8\u01bb\u01bd\u01c3\u01c9\u01cd\u01d4\u01da\u01e0\u01e6\u01eb"+
		"\u01f7\u01fc\u0207\u020c\u020f\u0216\u0219\u0220\u0229\u022c\u0232\u0234"+
		"\u0238\u0240\u0245\u024d\u0252\u025a\u025f\u0267\u026c\u0271\u0279\u0283"+
		"\u0286\u028c\u028e\u0291\u02a4\u02aa\u02b3\u02b8\u02c1\u02cc\u02d3\u02d9"+
		"\u02df\u02e8\u02ef\u02f3\u02f5\u02f9\u0300\u0302\u0306\u0309\u030f\u0319"+
		"\u031c\u0322\u0324\u0327\u032f\u0339\u033c\u0342\u0344\u0348\u034f\u0358"+
		"\u035c\u035e\u0362\u036b\u0370\u0372\u037b\u0386\u038d\u0390\u0393\u03a0"+
		"\u03ae\u03b3\u03b6\u03c3\u03d1\u03d6\u03df\u03e2\u03e8\u03ea\u03f0\u03f5"+
		"\u03fb\u0407\u040b\u0410\u0414\u0417\u0429\u042e\u0433\u0440\u0447\u044b"+
		"\u045b\u045e\u0466\u046f\u0473\u0478\u0493\u0498\u04a1\u04ab\u04ae\u04b4"+
		"\u04b7\u04be\u04c4\u04cb\u04cd\u04cf\u04d5\u04da\u04e6\u04eb\u04f7\u04fb"+
		"\u04ff\u0503\u050a\u050c\u0514\u051b\u051e\u0522\u0527\u052f\u0542\u0548"+
		"\u054c\u0553\u0559\u0561\u0566\u0569\u056e\u0577\u057c\u058a\u058d\u058f"+
		"\u0594\u0598\u059b\u05a2\u05a7\u05b0\u05b3\u05b7\u05ba\u05c2\u05c6\u05ce"+
		"\u05d1\u05d3\u05dc\u05e1\u05e5\u05e9\u05ec\u05f7\u05fc\u0600\u0607\u0610"+
		"\u0614\u0616\u061a\u0623\u0628\u062a\u0633\u063e\u0645\u0648\u064f\u0652"+
		"\u065e\u068c\u0696";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}