package parser.antlr;// Generated from SQLRules.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLRulesParser}.
 */
public interface SQLRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(@NotNull SQLRulesParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(@NotNull SQLRulesParser.Create_virtual_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull SQLRulesParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull SQLRulesParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(@NotNull SQLRulesParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(@NotNull SQLRulesParser.Savepoint_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(@NotNull SQLRulesParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(@NotNull SQLRulesParser.Drop_index_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull SQLRulesParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull SQLRulesParser.Table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(@NotNull SQLRulesParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(@NotNull SQLRulesParser.Join_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(@NotNull SQLRulesParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(@NotNull SQLRulesParser.Indexed_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#comparing_operators}.
	 * @param ctx the parse tree
	 */
	void enterComparing_operators(@NotNull SQLRulesParser.Comparing_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#comparing_operators}.
	 * @param ctx the parse tree
	 */
	void exitComparing_operators(@NotNull SQLRulesParser.Comparing_operatorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull SQLRulesParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull SQLRulesParser.Literal_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(@NotNull SQLRulesParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(@NotNull SQLRulesParser.Delete_stmt_limitedContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(@NotNull SQLRulesParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(@NotNull SQLRulesParser.Transaction_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(@NotNull SQLRulesParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(@NotNull SQLRulesParser.Column_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(@NotNull SQLRulesParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(@NotNull SQLRulesParser.Sql_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(@NotNull SQLRulesParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(@NotNull SQLRulesParser.New_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull SQLRulesParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull SQLRulesParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(@NotNull SQLRulesParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(@NotNull SQLRulesParser.Error_messageContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(@NotNull SQLRulesParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(@NotNull SQLRulesParser.Create_index_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull SQLRulesParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull SQLRulesParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(@NotNull SQLRulesParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(@NotNull SQLRulesParser.Rollback_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(@NotNull SQLRulesParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(@NotNull SQLRulesParser.Sql_stmt_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(@NotNull SQLRulesParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(@NotNull SQLRulesParser.Join_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(@NotNull SQLRulesParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(@NotNull SQLRulesParser.Schema_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull SQLRulesParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull SQLRulesParser.Collation_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(@NotNull SQLRulesParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(@NotNull SQLRulesParser.Pragma_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#table_function_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_function_name(@NotNull SQLRulesParser.Table_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#table_function_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_function_name(@NotNull SQLRulesParser.Table_function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(@NotNull SQLRulesParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(@NotNull SQLRulesParser.Update_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(@NotNull SQLRulesParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(@NotNull SQLRulesParser.Column_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(@NotNull SQLRulesParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(@NotNull SQLRulesParser.Alter_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(@NotNull SQLRulesParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(@NotNull SQLRulesParser.Attach_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull SQLRulesParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull SQLRulesParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(@NotNull SQLRulesParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(@NotNull SQLRulesParser.Table_or_index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(@NotNull SQLRulesParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(@NotNull SQLRulesParser.Module_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(@NotNull SQLRulesParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(@NotNull SQLRulesParser.Compound_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull SQLRulesParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull SQLRulesParser.Table_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(@NotNull SQLRulesParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(@NotNull SQLRulesParser.Drop_trigger_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(@NotNull SQLRulesParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(@NotNull SQLRulesParser.Module_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(@NotNull SQLRulesParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(@NotNull SQLRulesParser.Create_trigger_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#target_name}.
	 * @param ctx the parse tree
	 */
	void enterTarget_name(@NotNull SQLRulesParser.Target_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#target_name}.
	 * @param ctx the parse tree
	 */
	void exitTarget_name(@NotNull SQLRulesParser.Target_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(@NotNull SQLRulesParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(@NotNull SQLRulesParser.Signed_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(@NotNull SQLRulesParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(@NotNull SQLRulesParser.Ordering_termContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(@NotNull SQLRulesParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(@NotNull SQLRulesParser.Simple_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(@NotNull SQLRulesParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(@NotNull SQLRulesParser.Table_or_subqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(@NotNull SQLRulesParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(@NotNull SQLRulesParser.ErrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(@NotNull SQLRulesParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(@NotNull SQLRulesParser.Commit_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(@NotNull SQLRulesParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(@NotNull SQLRulesParser.Select_or_valuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(@NotNull SQLRulesParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(@NotNull SQLRulesParser.Select_coreContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(@NotNull SQLRulesParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(@NotNull SQLRulesParser.Savepoint_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(@NotNull SQLRulesParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(@NotNull SQLRulesParser.Factored_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(@NotNull SQLRulesParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(@NotNull SQLRulesParser.Conflict_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(@NotNull SQLRulesParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(@NotNull SQLRulesParser.Compound_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull SQLRulesParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull SQLRulesParser.Trigger_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(@NotNull SQLRulesParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(@NotNull SQLRulesParser.Begin_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(@NotNull SQLRulesParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(@NotNull SQLRulesParser.Foreign_key_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(@NotNull SQLRulesParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(@NotNull SQLRulesParser.Reindex_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull SQLRulesParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull SQLRulesParser.Any_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(@NotNull SQLRulesParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(@NotNull SQLRulesParser.Insert_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(@NotNull SQLRulesParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(@NotNull SQLRulesParser.Common_table_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(@NotNull SQLRulesParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(@NotNull SQLRulesParser.Drop_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(@NotNull SQLRulesParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(@NotNull SQLRulesParser.Release_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(@NotNull SQLRulesParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(@NotNull SQLRulesParser.Vacuum_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SQLRulesParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SQLRulesParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(@NotNull SQLRulesParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(@NotNull SQLRulesParser.Create_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(@NotNull SQLRulesParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(@NotNull SQLRulesParser.Drop_view_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull SQLRulesParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull SQLRulesParser.Index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(@NotNull SQLRulesParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(@NotNull SQLRulesParser.View_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(@NotNull SQLRulesParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(@NotNull SQLRulesParser.Detach_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull SQLRulesParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull SQLRulesParser.With_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(@NotNull SQLRulesParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(@NotNull SQLRulesParser.Qualified_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(@NotNull SQLRulesParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(@NotNull SQLRulesParser.Create_view_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(@NotNull SQLRulesParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(@NotNull SQLRulesParser.Column_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(@NotNull SQLRulesParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(@NotNull SQLRulesParser.Database_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull SQLRulesParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull SQLRulesParser.Column_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(@NotNull SQLRulesParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(@NotNull SQLRulesParser.Result_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull SQLRulesParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull SQLRulesParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(@NotNull SQLRulesParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(@NotNull SQLRulesParser.Table_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(@NotNull SQLRulesParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(@NotNull SQLRulesParser.Pragma_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(@NotNull SQLRulesParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(@NotNull SQLRulesParser.Analyze_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(@NotNull SQLRulesParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(@NotNull SQLRulesParser.Foreign_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull SQLRulesParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull SQLRulesParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(@NotNull SQLRulesParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(@NotNull SQLRulesParser.Join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(@NotNull SQLRulesParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(@NotNull SQLRulesParser.Update_stmt_limitedContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(@NotNull SQLRulesParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(@NotNull SQLRulesParser.Raise_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull SQLRulesParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull SQLRulesParser.Select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(@NotNull SQLRulesParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(@NotNull SQLRulesParser.Delete_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLRulesParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(@NotNull SQLRulesParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLRulesParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(@NotNull SQLRulesParser.Pragma_valueContext ctx);
}