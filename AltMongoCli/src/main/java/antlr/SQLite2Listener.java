package antlr;// Generated from SQLite2.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLite2Parser}.
 */
public interface SQLite2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(@NotNull SQLite2Parser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(@NotNull SQLite2Parser.Create_virtual_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull SQLite2Parser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull SQLite2Parser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(@NotNull SQLite2Parser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(@NotNull SQLite2Parser.Savepoint_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(@NotNull SQLite2Parser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(@NotNull SQLite2Parser.Drop_index_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull SQLite2Parser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull SQLite2Parser.Table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(@NotNull SQLite2Parser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(@NotNull SQLite2Parser.Join_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(@NotNull SQLite2Parser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(@NotNull SQLite2Parser.Indexed_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#comparing_operators}.
	 * @param ctx the parse tree
	 */
	void enterComparing_operators(@NotNull SQLite2Parser.Comparing_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#comparing_operators}.
	 * @param ctx the parse tree
	 */
	void exitComparing_operators(@NotNull SQLite2Parser.Comparing_operatorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull SQLite2Parser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull SQLite2Parser.Literal_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(@NotNull SQLite2Parser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(@NotNull SQLite2Parser.Delete_stmt_limitedContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(@NotNull SQLite2Parser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(@NotNull SQLite2Parser.Transaction_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(@NotNull SQLite2Parser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(@NotNull SQLite2Parser.Column_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(@NotNull SQLite2Parser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(@NotNull SQLite2Parser.Sql_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(@NotNull SQLite2Parser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(@NotNull SQLite2Parser.New_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull SQLite2Parser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull SQLite2Parser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(@NotNull SQLite2Parser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(@NotNull SQLite2Parser.Error_messageContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(@NotNull SQLite2Parser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(@NotNull SQLite2Parser.Create_index_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull SQLite2Parser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull SQLite2Parser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(@NotNull SQLite2Parser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(@NotNull SQLite2Parser.Rollback_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(@NotNull SQLite2Parser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(@NotNull SQLite2Parser.Sql_stmt_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(@NotNull SQLite2Parser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(@NotNull SQLite2Parser.Join_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(@NotNull SQLite2Parser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(@NotNull SQLite2Parser.Schema_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull SQLite2Parser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull SQLite2Parser.Collation_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(@NotNull SQLite2Parser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(@NotNull SQLite2Parser.Pragma_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#table_function_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_function_name(@NotNull SQLite2Parser.Table_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#table_function_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_function_name(@NotNull SQLite2Parser.Table_function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(@NotNull SQLite2Parser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(@NotNull SQLite2Parser.Update_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(@NotNull SQLite2Parser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(@NotNull SQLite2Parser.Column_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(@NotNull SQLite2Parser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(@NotNull SQLite2Parser.Alter_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(@NotNull SQLite2Parser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(@NotNull SQLite2Parser.Attach_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull SQLite2Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull SQLite2Parser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(@NotNull SQLite2Parser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(@NotNull SQLite2Parser.Table_or_index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(@NotNull SQLite2Parser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(@NotNull SQLite2Parser.Module_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(@NotNull SQLite2Parser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(@NotNull SQLite2Parser.Compound_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull SQLite2Parser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull SQLite2Parser.Table_aliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(@NotNull SQLite2Parser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(@NotNull SQLite2Parser.Drop_trigger_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(@NotNull SQLite2Parser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(@NotNull SQLite2Parser.Module_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(@NotNull SQLite2Parser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(@NotNull SQLite2Parser.Create_trigger_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#target_name}.
	 * @param ctx the parse tree
	 */
	void enterTarget_name(@NotNull SQLite2Parser.Target_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#target_name}.
	 * @param ctx the parse tree
	 */
	void exitTarget_name(@NotNull SQLite2Parser.Target_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(@NotNull SQLite2Parser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(@NotNull SQLite2Parser.Signed_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(@NotNull SQLite2Parser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(@NotNull SQLite2Parser.Ordering_termContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(@NotNull SQLite2Parser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(@NotNull SQLite2Parser.Simple_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(@NotNull SQLite2Parser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(@NotNull SQLite2Parser.Table_or_subqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(@NotNull SQLite2Parser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(@NotNull SQLite2Parser.ErrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(@NotNull SQLite2Parser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(@NotNull SQLite2Parser.Commit_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(@NotNull SQLite2Parser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(@NotNull SQLite2Parser.Select_or_valuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(@NotNull SQLite2Parser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(@NotNull SQLite2Parser.Select_coreContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(@NotNull SQLite2Parser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(@NotNull SQLite2Parser.Savepoint_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(@NotNull SQLite2Parser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(@NotNull SQLite2Parser.Factored_select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(@NotNull SQLite2Parser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(@NotNull SQLite2Parser.Conflict_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(@NotNull SQLite2Parser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(@NotNull SQLite2Parser.Compound_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull SQLite2Parser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull SQLite2Parser.Trigger_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(@NotNull SQLite2Parser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(@NotNull SQLite2Parser.Begin_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(@NotNull SQLite2Parser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(@NotNull SQLite2Parser.Foreign_key_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(@NotNull SQLite2Parser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(@NotNull SQLite2Parser.Reindex_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull SQLite2Parser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull SQLite2Parser.Any_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(@NotNull SQLite2Parser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(@NotNull SQLite2Parser.Insert_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(@NotNull SQLite2Parser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(@NotNull SQLite2Parser.Common_table_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(@NotNull SQLite2Parser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(@NotNull SQLite2Parser.Drop_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(@NotNull SQLite2Parser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(@NotNull SQLite2Parser.Release_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(@NotNull SQLite2Parser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(@NotNull SQLite2Parser.Vacuum_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SQLite2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SQLite2Parser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(@NotNull SQLite2Parser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(@NotNull SQLite2Parser.Create_table_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(@NotNull SQLite2Parser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(@NotNull SQLite2Parser.Drop_view_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull SQLite2Parser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull SQLite2Parser.Index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(@NotNull SQLite2Parser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(@NotNull SQLite2Parser.View_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(@NotNull SQLite2Parser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(@NotNull SQLite2Parser.Detach_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull SQLite2Parser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull SQLite2Parser.With_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(@NotNull SQLite2Parser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(@NotNull SQLite2Parser.Qualified_table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(@NotNull SQLite2Parser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(@NotNull SQLite2Parser.Create_view_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(@NotNull SQLite2Parser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(@NotNull SQLite2Parser.Column_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(@NotNull SQLite2Parser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(@NotNull SQLite2Parser.Database_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull SQLite2Parser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull SQLite2Parser.Column_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(@NotNull SQLite2Parser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(@NotNull SQLite2Parser.Result_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull SQLite2Parser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull SQLite2Parser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(@NotNull SQLite2Parser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(@NotNull SQLite2Parser.Table_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(@NotNull SQLite2Parser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(@NotNull SQLite2Parser.Pragma_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(@NotNull SQLite2Parser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(@NotNull SQLite2Parser.Analyze_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(@NotNull SQLite2Parser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(@NotNull SQLite2Parser.Foreign_tableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull SQLite2Parser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull SQLite2Parser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(@NotNull SQLite2Parser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(@NotNull SQLite2Parser.Join_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(@NotNull SQLite2Parser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(@NotNull SQLite2Parser.Update_stmt_limitedContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(@NotNull SQLite2Parser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(@NotNull SQLite2Parser.Raise_functionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull SQLite2Parser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull SQLite2Parser.Select_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(@NotNull SQLite2Parser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(@NotNull SQLite2Parser.Delete_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLite2Parser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(@NotNull SQLite2Parser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLite2Parser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(@NotNull SQLite2Parser.Pragma_valueContext ctx);
}