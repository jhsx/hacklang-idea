// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.github.josehsantos.hack.lang.psi.HackTypes.*;
import static io.github.josehsantos.hack.lang.parser.HackParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class HackParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ADDITIVE_OR_CONCATENATION_EXPRESSION) {
      r = additive_or_concatenation_expression(b, 0);
    }
    else if (t == ADDITIVE_OR_CONCATENATION_OPERATOR) {
      r = additive_or_concatenation_operator(b, 0);
    }
    else if (t == ARRAY_ACCESS) {
      r = array_access(b, 0);
    }
    else if (t == ARRAY_LITERAL_EXPRESSION) {
      r = array_literal_expression(b, 0);
    }
    else if (t == ARRAY_OFFSET_ACCESS) {
      r = array_offset_access(b, 0);
    }
    else if (t == ARRAY_PAIR_ITEM) {
      r = array_pair_item(b, 0);
    }
    else if (t == ARRAY_PAIR_LIST) {
      r = array_pair_list(b, 0);
    }
    else if (t == ARRAY_TYPE) {
      r = array_type(b, 0);
    }
    else if (t == ASSIGNMENT_EXPRESSION) {
      r = assignment_expression(b, 0);
    }
    else if (t == ASSIGNMENT_LIST) {
      r = assignment_list(b, 0);
    }
    else if (t == ATTRIBUTE_STATIC_SCALAR_LIST) {
      r = attribute_static_scalar_list(b, 0);
    }
    else if (t == AWAIT_ASSIGN_EXPRESSION) {
      r = await_assign_expression(b, 0);
    }
    else if (t == AWAIT_EXPRESSION) {
      r = await_expression(b, 0);
    }
    else if (t == AWAIT_LIST_ASSIGN_EXPRESSION) {
      r = await_list_assign_expression(b, 0);
    }
    else if (t == BACKTICKS_EXPRESSION) {
      r = backticks_expression(b, 0);
    }
    else if (t == BITWISE_EXPRESSION) {
      r = bitwise_expression(b, 0);
    }
    else if (t == BITWISE_OPERATOR) {
      r = bitwise_operator(b, 0);
    }
    else if (t == BLOCK_STATEMENT) {
      r = block_statement(b, 0);
    }
    else if (t == BREAK_STATEMENT) {
      r = break_statement(b, 0);
    }
    else if (t == CALLABLE_FUNCTION_CALL_EXPRESSION) {
      r = callable_function_call_expression(b, 0);
    }
    else if (t == CALLABLE_TYPE) {
      r = callable_type(b, 0);
    }
    else if (t == CALLABLE_VARIABLE) {
      r = callable_variable(b, 0);
    }
    else if (t == CALLING_PARAMETER_ITEM) {
      r = calling_parameter_item(b, 0);
    }
    else if (t == CASE_BLOCK) {
      r = case_block(b, 0);
    }
    else if (t == CASE_LIST) {
      r = case_list(b, 0);
    }
    else if (t == CASE_SEPARATOR) {
      r = case_separator(b, 0);
    }
    else if (t == CAST_EXPRESSION) {
      r = cast_expression(b, 0);
    }
    else if (t == CAST_OPERATOR) {
      r = cast_operator(b, 0);
    }
    else if (t == CLASS_CONSTANT) {
      r = class_constant(b, 0);
    }
    else if (t == CLASS_DECLARATION_STATEMENT) {
      r = class_declaration_statement(b, 0);
    }
    else if (t == CLASS_METHOD_CALL_EXPRESSION) {
      r = class_method_call_expression(b, 0);
    }
    else if (t == CLASS_NAME_REFERENCE) {
      r = class_name_reference(b, 0);
    }
    else if (t == CLASS_STATEMENT) {
      r = class_statement(b, 0);
    }
    else if (t == CLASS_STATEMENT_BLOCK) {
      r = class_statement_block(b, 0);
    }
    else if (t == CLASS_STATEMENT_LIST) {
      r = class_statement_list(b, 0);
    }
    else if (t == CLASS_VARIABLE_DECLARATION) {
      r = class_variable_declaration(b, 0);
    }
    else if (t == CLASS_VARIABLE_DECLARATIONS) {
      r = class_variable_declarations(b, 0);
    }
    else if (t == CLONE_EXPRESSION) {
      r = clone_expression(b, 0);
    }
    else if (t == CLOSURE_EXPRESSION) {
      r = closure_expression(b, 0);
    }
    else if (t == CLOSURE_FUNCTION) {
      r = closure_function(b, 0);
    }
    else if (t == COLLECTION_LITERAL_EXPRESSION) {
      r = collection_literal_expression(b, 0);
    }
    else if (t == COMPARATIVE_EXPRESSION) {
      r = comparative_expression(b, 0);
    }
    else if (t == COMPARATIVE_OPERATOR) {
      r = comparative_operator(b, 0);
    }
    else if (t == CONSTANT_ASSIGNMENT) {
      r = constant_assignment(b, 0);
    }
    else if (t == CONSTANT_DECLARATION) {
      r = constant_declaration(b, 0);
    }
    else if (t == CONSTANT_DECLARATION_STATEMENT) {
      r = constant_declaration_statement(b, 0);
    }
    else if (t == CONTINUE_STATEMENT) {
      r = continue_statement(b, 0);
    }
    else if (t == CTOR_ARGUMENTS) {
      r = ctor_arguments(b, 0);
    }
    else if (t == DECLARE_ASSIGNMENT) {
      r = declare_assignment(b, 0);
    }
    else if (t == DECLARE_LIST) {
      r = declare_list(b, 0);
    }
    else if (t == DECLARE_NEW_STATEMENT) {
      r = declare_new_statement(b, 0);
    }
    else if (t == DECLARE_STATEMENT) {
      r = declare_statement(b, 0);
    }
    else if (t == DECLARE_STATEMENT_BODY) {
      r = declare_statement_body(b, 0);
    }
    else if (t == DEFAULT_CASE_BLOCK) {
      r = default_case_block(b, 0);
    }
    else if (t == DIM_EXPRESSION) {
      r = dim_expression(b, 0);
    }
    else if (t == DIM_EXPRESSION_BASE) {
      r = dim_expression_base(b, 0);
    }
    else if (t == DIMMABLE_VARIABLE_ACCESS_EXPRESSION) {
      r = dimmable_variable_access_expression(b, 0);
    }
    else if (t == DO_WHILE_STATEMENT) {
      r = do_while_statement(b, 0);
    }
    else if (t == DOUBLE_QUOTES_STRING) {
      r = double_quotes_string(b, 0);
    }
    else if (t == ECHO_STATEMENT) {
      r = echo_statement(b, 0);
    }
    else if (t == ELSE_SINGLE) {
      r = else_single(b, 0);
    }
    else if (t == ELSEIF_BODY) {
      r = elseif_body(b, 0);
    }
    else if (t == ELSEIF_LIST) {
      r = elseif_list(b, 0);
    }
    else if (t == EMPTY_EXPRESSION) {
      r = empty_expression(b, 0);
    }
    else if (t == ENCAPS_BRACE_EXPRESSION) {
      r = encaps_brace_expression(b, 0);
    }
    else if (t == ENCAPS_BRACE_INDEX_OFFSET_EXPRESSION) {
      r = encaps_brace_index_offset_expression(b, 0);
    }
    else if (t == ENCAPS_EXPRESSION) {
      r = encaps_expression(b, 0);
    }
    else if (t == ENCAPS_FIELD_ACCESS_EXPRESSION) {
      r = encaps_field_access_expression(b, 0);
    }
    else if (t == ENCAPS_INDEX_OFFSET_EXPRESSION) {
      r = encaps_index_offset_expression(b, 0);
    }
    else if (t == ENCAPS_LIST) {
      r = encaps_list(b, 0);
    }
    else if (t == ENCAPS_VAR) {
      r = encaps_var(b, 0);
    }
    else if (t == ENCAPS_VAR_OFFSET) {
      r = encaps_var_offset(b, 0);
    }
    else if (t == ENUM_CONSTANT_DECLARATION) {
      r = enum_constant_declaration(b, 0);
    }
    else if (t == ENUM_DECLARATION_STATEMENT) {
      r = enum_declaration_statement(b, 0);
    }
    else if (t == ENUM_STATEMENT) {
      r = enum_statement(b, 0);
    }
    else if (t == ENUM_STATEMENT_LIST) {
      r = enum_statement_list(b, 0);
    }
    else if (t == ESPECIAL_PARENTHESISED_EXPRESSION) {
      r = especial_parenthesised_expression(b, 0);
    }
    else if (t == EVAL_EXPRESSION) {
      r = eval_expression(b, 0);
    }
    else if (t == EXIT_EXPRESSION) {
      r = exit_expression(b, 0);
    }
    else if (t == EXPRESSION_LIST) {
      r = expression_list(b, 0);
    }
    else if (t == EXPRESSION_STATEMENT) {
      r = expression_statement(b, 0);
    }
    else if (t == EXPRESSION_VARIABLE) {
      r = expression_variable(b, 0);
    }
    else if (t == EXTENDS_FROM) {
      r = extends_from(b, 0);
    }
    else if (t == FOR_NEW_STATEMENT) {
      r = for_new_statement(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = for_statement(b, 0);
    }
    else if (t == FOR_STATEMENT_BODY) {
      r = for_statement_body(b, 0);
    }
    else if (t == FOREACH_LIST_ASSIGNMENT) {
      r = foreach_list_assignment(b, 0);
    }
    else if (t == FOREACH_NEW_STATEMENT) {
      r = foreach_new_statement(b, 0);
    }
    else if (t == FOREACH_OPTIONAL_ARG) {
      r = foreach_optional_arg(b, 0);
    }
    else if (t == FOREACH_STATEMENT) {
      r = foreach_statement(b, 0);
    }
    else if (t == FOREACH_STATEMENT_BODY) {
      r = foreach_statement_body(b, 0);
    }
    else if (t == FOREACH_VARIABLE) {
      r = foreach_variable(b, 0);
    }
    else if (t == FROM_CLAUSE) {
      r = from_clause(b, 0);
    }
    else if (t == FULLY_QUALIFIED_CLASS_NAME) {
      r = fully_qualified_class_name(b, 0);
    }
    else if (t == FUNC_TYPE_LIST) {
      r = func_type_list(b, 0);
    }
    else if (t == FUNCTION_BODY) {
      r = function_body(b, 0);
    }
    else if (t == FUNCTION_CALL_PARAMETER_LIST) {
      r = function_call_parameter_list(b, 0);
    }
    else if (t == FUNCTION_DECLARATION) {
      r = function_declaration(b, 0);
    }
    else if (t == FUNCTION_DECLARATION_STATEMENT) {
      r = function_declaration_statement(b, 0);
    }
    else if (t == FUNCTION_TYPE) {
      r = function_type(b, 0);
    }
    else if (t == GLOBAL_STATEMENT) {
      r = global_statement(b, 0);
    }
    else if (t == GLOBAL_VAR) {
      r = global_var(b, 0);
    }
    else if (t == GLOBAL_VAR_LIST) {
      r = global_var_list(b, 0);
    }
    else if (t == GOTO_STATEMENT) {
      r = goto_statement(b, 0);
    }
    else if (t == GROUP_CLAUSE) {
      r = group_clause(b, 0);
    }
    else if (t == HALT_COMPILER_STATEMENT) {
      r = halt_compiler_statement(b, 0);
    }
    else if (t == HERE_DOC_STRING) {
      r = here_doc_string(b, 0);
    }
    else if (t == HTML_STATEMENT) {
      r = html_statement(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = identifier(b, 0);
    }
    else if (t == IDENTIFIER_TYPE) {
      r = identifier_type(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = if_statement(b, 0);
    }
    else if (t == IMPLEMENTS_LIST) {
      r = implements_list(b, 0);
    }
    else if (t == INCLUDE_EXPRESSION) {
      r = include_expression(b, 0);
    }
    else if (t == INNER_STATEMENT_LIST) {
      r = inner_statement_list(b, 0);
    }
    else if (t == INSTANCEOF_EXPRESSION) {
      r = instanceof_expression(b, 0);
    }
    else if (t == INTERFACE_DECLARATION_STATEMENT) {
      r = interface_declaration_statement(b, 0);
    }
    else if (t == INTERFACE_EXTENDS_LIST) {
      r = interface_extends_list(b, 0);
    }
    else if (t == INTERFACE_LIST) {
      r = interface_list(b, 0);
    }
    else if (t == ISSET_EXPRESSION) {
      r = isset_expression(b, 0);
    }
    else if (t == JOIN_CLAUSE) {
      r = join_clause(b, 0);
    }
    else if (t == JOIN_INTO_CLAUSE) {
      r = join_into_clause(b, 0);
    }
    else if (t == LABEL_STATEMENT) {
      r = label_statement(b, 0);
    }
    else if (t == LAMBDA_BODY) {
      r = lambda_body(b, 0);
    }
    else if (t == LAMBDA_EXPRESSION) {
      r = lambda_expression(b, 0);
    }
    else if (t == LAMBDA_FUNCTION) {
      r = lambda_function(b, 0);
    }
    else if (t == LAMBDA_USE_VARS) {
      r = lambda_use_vars(b, 0);
    }
    else if (t == LET_CLAUSE) {
      r = let_clause(b, 0);
    }
    else if (t == LEXICAL_VAR_LIST) {
      r = lexical_var_list(b, 0);
    }
    else if (t == LIST_ASSIGNMENT_EXPRESSION) {
      r = list_assignment_expression(b, 0);
    }
    else if (t == LIST_ASSIGNMENT_VARIABLES) {
      r = list_assignment_variables(b, 0);
    }
    else if (t == LITERAL_EXPRESSION) {
      r = literal_expression(b, 0);
    }
    else if (t == LITERAL_SCALAR_AE) {
      r = literal_scalar_ae(b, 0);
    }
    else if (t == LOGICAL_EXPRESSION) {
      r = logical_expression(b, 0);
    }
    else if (t == LOGICAL_OPERATOR) {
      r = logical_operator(b, 0);
    }
    else if (t == MAP_ARRAY_LITERAL_EXPRESSION) {
      r = map_array_literal_expression(b, 0);
    }
    else if (t == MEMBER_MODIFIER) {
      r = member_modifier(b, 0);
    }
    else if (t == MEMBER_ONLY_ACCESS_EXPRESSION) {
      r = member_only_access_expression(b, 0);
    }
    else if (t == MEMBER_VARIABLE_EXPRESSION) {
      r = member_variable_expression(b, 0);
    }
    else if (t == METHOD_CALL_EXPRESSION) {
      r = method_call_expression(b, 0);
    }
    else if (t == METHOD_FUNCTION_DECLARATION) {
      r = method_function_declaration(b, 0);
    }
    else if (t == METHOD_MODIFIERS) {
      r = method_modifiers(b, 0);
    }
    else if (t == MULTIPLICATIVE_EXPRESSION) {
      r = multiplicative_expression(b, 0);
    }
    else if (t == MULTIPLICATIVE_OPERATOR) {
      r = multiplicative_operator(b, 0);
    }
    else if (t == NAME_HOLDER) {
      r = name_holder(b, 0);
    }
    else if (t == NAMESPACE_DECLARATION_STATEMENT) {
      r = namespace_declaration_statement(b, 0);
    }
    else if (t == NAMESPACE_NAME) {
      r = namespace_name(b, 0);
    }
    else if (t == NAMESPACE_NAME_DECLARATION) {
      r = namespace_name_declaration(b, 0);
    }
    else if (t == NAMESPACE_STRING) {
      r = namespace_string(b, 0);
    }
    else if (t == NAMESPACE_STRING_TYPEARGS) {
      r = namespace_string_typeargs(b, 0);
    }
    else if (t == NEW_ELSE_SINGLE) {
      r = new_else_single(b, 0);
    }
    else if (t == NEW_ELSEIF_BODY) {
      r = new_elseif_body(b, 0);
    }
    else if (t == NEW_ELSEIF_LIST) {
      r = new_elseif_list(b, 0);
    }
    else if (t == NEW_EXPRESSION) {
      r = new_expression(b, 0);
    }
    else if (t == NEW_TYPE_DECLARATION_STATEMENT) {
      r = new_type_declaration_statement(b, 0);
    }
    else if (t == NULLABLE_TYPE) {
      r = nullable_type(b, 0);
    }
    else if (t == OPT_RETURN_TYPE) {
      r = opt_return_type(b, 0);
    }
    else if (t == ORDERBY_CLAUSE) {
      r = orderby_clause(b, 0);
    }
    else if (t == ORDERING) {
      r = ordering(b, 0);
    }
    else if (t == ORDERING_DIRECTION) {
      r = ordering_direction(b, 0);
    }
    else if (t == ORDERINGS) {
      r = orderings(b, 0);
    }
    else if (t == PARAMETER_ITEM) {
      r = parameter_item(b, 0);
    }
    else if (t == PARAMETER_LIST) {
      r = parameter_list(b, 0);
    }
    else if (t == PARAMETER_MODIFIER) {
      r = parameter_modifier(b, 0);
    }
    else if (t == PARAMETER_MODIFIERS) {
      r = parameter_modifiers(b, 0);
    }
    else if (t == PARENTHESIZED_EXPRESSION) {
      r = parenthesized_expression(b, 0);
    }
    else if (t == PREFIX_OPERATOR) {
      r = prefix_operator(b, 0);
    }
    else if (t == PRINT_EXPRESSION) {
      r = print_expression(b, 0);
    }
    else if (t == QUERY_ASSIGN_EXPRESSION) {
      r = query_assign_expression(b, 0);
    }
    else if (t == QUERY_BODY) {
      r = query_body(b, 0);
    }
    else if (t == QUERY_BODY_CLAUSE) {
      r = query_body_clause(b, 0);
    }
    else if (t == QUERY_BODY_CLAUSES) {
      r = query_body_clauses(b, 0);
    }
    else if (t == QUERY_CONTINUATION) {
      r = query_continuation(b, 0);
    }
    else if (t == QUERY_EXPRESSION) {
      r = query_expression(b, 0);
    }
    else if (t == QUERY_HEAD) {
      r = query_head(b, 0);
    }
    else if (t == REQUIRE_EXPRESSION) {
      r = require_expression(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = return_statement(b, 0);
    }
    else if (t == SCALAR_EXPRESSION) {
      r = scalar_expression(b, 0);
    }
    else if (t == SELECT_CLAUSE) {
      r = select_clause(b, 0);
    }
    else if (t == SELECT_OR_GROUP_CLAUSE) {
      r = select_or_group_clause(b, 0);
    }
    else if (t == SEMICOLON_STATEMENT) {
      r = semicolon_statement(b, 0);
    }
    else if (t == SHAPE_KEYNAME) {
      r = shape_keyname(b, 0);
    }
    else if (t == SHAPE_LITERAL_EXPRESSION) {
      r = shape_literal_expression(b, 0);
    }
    else if (t == SHAPE_MEMBER_LIST) {
      r = shape_member_list(b, 0);
    }
    else if (t == SHAPE_MEMBER_TYPE) {
      r = shape_member_type(b, 0);
    }
    else if (t == SHAPE_PAIR) {
      r = shape_pair(b, 0);
    }
    else if (t == SHAPE_PAIR_LIST) {
      r = shape_pair_list(b, 0);
    }
    else if (t == SHAPE_PAIR_STATIC) {
      r = shape_pair_static(b, 0);
    }
    else if (t == SHAPE_TYPE) {
      r = shape_type(b, 0);
    }
    else if (t == SHIFT_EXPRESSION) {
      r = shift_expression(b, 0);
    }
    else if (t == SHIFT_OPERATOR) {
      r = shift_operator(b, 0);
    }
    else if (t == SIMPLE_FUNCTION_CALL_EXPRESSION) {
      r = simple_function_call_expression(b, 0);
    }
    else if (t == SIMPLE_VARIABLE_NAME) {
      r = simple_variable_name(b, 0);
    }
    else if (t == SINGLE_QUOTES_STRING) {
      r = single_quotes_string(b, 0);
    }
    else if (t == SOFT_TYPE) {
      r = soft_type(b, 0);
    }
    else if (t == STATEMENT_RECOVER) {
      r = statement_recover(b, 0);
    }
    else if (t == STATIC_ADDITIVE_OR_CONCATENATION_EXPRESSION) {
      r = static_additive_or_concatenation_expression(b, 0);
    }
    else if (t == STATIC_ARRAY_EXPRESSION) {
      r = static_array_expression(b, 0);
    }
    else if (t == STATIC_ARRAY_ITEM) {
      r = static_array_item(b, 0);
    }
    else if (t == STATIC_ARRAY_ITEM_AE) {
      r = static_array_item_ae(b, 0);
    }
    else if (t == STATIC_ARRAY_PAIR_LIST) {
      r = static_array_pair_list(b, 0);
    }
    else if (t == STATIC_ARRAY_PAIR_LIST_AE) {
      r = static_array_pair_list_ae(b, 0);
    }
    else if (t == STATIC_ASSIGNMENT) {
      r = static_assignment(b, 0);
    }
    else if (t == STATIC_BITWISE_EXPRESSION) {
      r = static_bitwise_expression(b, 0);
    }
    else if (t == STATIC_CLASS_CONSTANT) {
      r = static_class_constant(b, 0);
    }
    else if (t == STATIC_CLASS_NAME) {
      r = static_class_name(b, 0);
    }
    else if (t == STATIC_CLASS_VARIABLE_EXPRESSION) {
      r = static_class_variable_expression(b, 0);
    }
    else if (t == STATIC_COLLECTION_LITERAL) {
      r = static_collection_literal(b, 0);
    }
    else if (t == STATIC_COMPARATIVE_EXPRESSION) {
      r = static_comparative_expression(b, 0);
    }
    else if (t == STATIC_EXPRESSION) {
      r = static_expression(b, 0);
    }
    else if (t == STATIC_LOGICAL_EXPRESSION) {
      r = static_logical_expression(b, 0);
    }
    else if (t == STATIC_MAP_ARRAY_LITERAL) {
      r = static_map_array_literal(b, 0);
    }
    else if (t == STATIC_MULTIPLICATIVE_EXPRESSION) {
      r = static_multiplicative_expression(b, 0);
    }
    else if (t == STATIC_NUMERIC_SCALAR_AE) {
      r = static_numeric_scalar_ae(b, 0);
    }
    else if (t == STATIC_PARENTHESIZED_EXPRESSION) {
      r = static_parenthesized_expression(b, 0);
    }
    else if (t == STATIC_PREFIX_EXPRESSION) {
      r = static_prefix_expression(b, 0);
    }
    else if (t == STATIC_PREFIX_OPERATOR) {
      r = static_prefix_operator(b, 0);
    }
    else if (t == STATIC_SCALAR_AE) {
      r = static_scalar_ae(b, 0);
    }
    else if (t == STATIC_SCALAR_LIST_AE) {
      r = static_scalar_list_ae(b, 0);
    }
    else if (t == STATIC_SHAPE_EXPRESSION) {
      r = static_shape_expression(b, 0);
    }
    else if (t == STATIC_SHAPE_PAIR_ITEM) {
      r = static_shape_pair_item(b, 0);
    }
    else if (t == STATIC_SHAPE_PAIR_LIST) {
      r = static_shape_pair_list(b, 0);
    }
    else if (t == STATIC_SHAPE_PAIR_LIST_AE) {
      r = static_shape_pair_list_ae(b, 0);
    }
    else if (t == STATIC_SHIFT_EXPRESSION) {
      r = static_shift_expression(b, 0);
    }
    else if (t == STATIC_STATEMENT) {
      r = static_statement(b, 0);
    }
    else if (t == STATIC_TERNARY_EXPRESSION) {
      r = static_ternary_expression(b, 0);
    }
    else if (t == STATIC_VAR_LIST) {
      r = static_var_list(b, 0);
    }
    else if (t == STATIC_VARRAY_LITERAL) {
      r = static_varray_literal(b, 0);
    }
    else if (t == SUFFIX_OPERATOR) {
      r = suffix_operator(b, 0);
    }
    else if (t == SWITCH_CASE_LIST) {
      r = switch_case_list(b, 0);
    }
    else if (t == SWITCH_NEW_STATEMENT) {
      r = switch_new_statement(b, 0);
    }
    else if (t == SWITCH_STATEMENT) {
      r = switch_statement(b, 0);
    }
    else if (t == SWITCH_STATEMENT_LIST) {
      r = switch_statement_list(b, 0);
    }
    else if (t == TERNARY_EXPRESSION) {
      r = ternary_expression(b, 0);
    }
    else if (t == THROW_STATEMENT) {
      r = throw_statement(b, 0);
    }
    else if (t == TOP_STATEMENT_LIST) {
      r = top_statement_list(b, 0);
    }
    else if (t == TRAIT_ALIAS_RULE) {
      r = trait_alias_rule(b, 0);
    }
    else if (t == TRAIT_ALIAS_RULE_METHOD) {
      r = trait_alias_rule_method(b, 0);
    }
    else if (t == TRAIT_DECLARATION_STATEMENT) {
      r = trait_declaration_statement(b, 0);
    }
    else if (t == TRAIT_LIST) {
      r = trait_list(b, 0);
    }
    else if (t == TRAIT_PRECEDENCE_RULE) {
      r = trait_precedence_rule(b, 0);
    }
    else if (t == TRAIT_REQUIRE_DECLARATION) {
      r = trait_require_declaration(b, 0);
    }
    else if (t == TRAIT_RULES) {
      r = trait_rules(b, 0);
    }
    else if (t == TRAIT_USE_DECLARATION) {
      r = trait_use_declaration(b, 0);
    }
    else if (t == TRY_CATCH) {
      r = try_catch(b, 0);
    }
    else if (t == TRY_FINALLY) {
      r = try_finally(b, 0);
    }
    else if (t == TRY_STATEMENT) {
      r = try_statement(b, 0);
    }
    else if (t == TUPLE_EXPRESSION) {
      r = tuple_expression(b, 0);
    }
    else if (t == TUPLE_TYPE) {
      r = tuple_type(b, 0);
    }
    else if (t == TYPE_DECLARATION_STATEMENT) {
      r = type_declaration_statement(b, 0);
    }
    else if (t == TYPE_LIST) {
      r = type_list(b, 0);
    }
    else if (t == TYPEARGS) {
      r = typeargs(b, 0);
    }
    else if (t == TYPEVAR) {
      r = typevar(b, 0);
    }
    else if (t == TYPEVAR_ITEM) {
      r = typevar_item(b, 0);
    }
    else if (t == TYPEVAR_LIST) {
      r = typevar_list(b, 0);
    }
    else if (t == TYPEVAR_VARIANCE) {
      r = typevar_variance(b, 0);
    }
    else if (t == UNSET_STATEMENT) {
      r = unset_statement(b, 0);
    }
    else if (t == USE_DECLARATION) {
      r = use_declaration(b, 0);
    }
    else if (t == USE_DECLARATION_STATEMENT) {
      r = use_declaration_statement(b, 0);
    }
    else if (t == USE_DECLARATIONS) {
      r = use_declarations(b, 0);
    }
    else if (t == USER_ATTRIBUTE) {
      r = user_attribute(b, 0);
    }
    else if (t == USER_ATTRIBUTE_LIST) {
      r = user_attribute_list(b, 0);
    }
    else if (t == USER_ATTRIBUTES) {
      r = user_attributes(b, 0);
    }
    else if (t == VARIABLE_EXPRESSION) {
      r = variable_expression(b, 0);
    }
    else if (t == VARIABLE_EXPRESSION_VARIABLE) {
      r = variable_expression_variable(b, 0);
    }
    else if (t == VARIABLE_IDENTIFIER) {
      r = variable_identifier(b, 0);
    }
    else if (t == VARIABLE_LIST) {
      r = variable_list(b, 0);
    }
    else if (t == VARIABLE_MODIFIERS) {
      r = variable_modifiers(b, 0);
    }
    else if (t == VARIABLE_NAME_HOLDER) {
      r = variable_name_holder(b, 0);
    }
    else if (t == VARRAY_LITERAL_EXPRESSION) {
      r = varray_literal_expression(b, 0);
    }
    else if (t == WHERE_CLAUSE) {
      r = where_clause(b, 0);
    }
    else if (t == WHILE_NEW_STATEMENT) {
      r = while_new_statement(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = while_statement(b, 0);
    }
    else if (t == WHILE_STATEMENT_BODY) {
      r = while_statement_body(b, 0);
    }
    else if (t == XHP_ATTRIBUTE) {
      r = xhp_attribute(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_DECL) {
      r = xhp_attribute_decl(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_DECL_TYPE) {
      r = xhp_attribute_decl_type(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_DECLARATION) {
      r = xhp_attribute_declaration(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_DEFAULT) {
      r = xhp_attribute_default(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_ENUM) {
      r = xhp_attribute_enum(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_IS_REQUIRED) {
      r = xhp_attribute_is_required(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_NAME) {
      r = xhp_attribute_name(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_STMT) {
      r = xhp_attribute_stmt(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_VALUE) {
      r = xhp_attribute_value(b, 0);
    }
    else if (t == XHP_ATTRIBUTES) {
      r = xhp_attributes(b, 0);
    }
    else if (t == XHP_BAREWORD) {
      r = xhp_bareword(b, 0);
    }
    else if (t == XHP_CATEGORY_DECLARATION) {
      r = xhp_category_declaration(b, 0);
    }
    else if (t == XHP_CATEGORY_STMT) {
      r = xhp_category_stmt(b, 0);
    }
    else if (t == XHP_CHILD) {
      r = xhp_child(b, 0);
    }
    else if (t == XHP_CHILDREN) {
      r = xhp_children(b, 0);
    }
    else if (t == XHP_CHILDREN_DECL_EXPRESSION) {
      r = xhp_children_decl_expression(b, 0);
    }
    else if (t == XHP_CHILDREN_DECL_TAG) {
      r = xhp_children_decl_tag(b, 0);
    }
    else if (t == XHP_CHILDREN_DECLARATION) {
      r = xhp_children_declaration(b, 0);
    }
    else if (t == XHP_CHILDREN_PAREN_EXPRESSION) {
      r = xhp_children_paren_expression(b, 0);
    }
    else if (t == XHP_CHILDREN_STMT) {
      r = xhp_children_stmt(b, 0);
    }
    else if (t == XHP_CLASS_DECLARATION_STATEMENT) {
      r = xhp_class_declaration_statement(b, 0);
    }
    else if (t == XHP_EXPRESSION) {
      r = xhp_expression(b, 0);
    }
    else if (t == XHP_IDENTIFIER) {
      r = xhp_identifier(b, 0);
    }
    else if (t == XHP_LABEL_WS) {
      r = xhp_label_ws(b, 0);
    }
    else if (t == XHP_NAME_HOLDER) {
      r = xhp_name_holder(b, 0);
    }
    else if (t == XHP_OPT_END_LABEL) {
      r = xhp_opt_end_label(b, 0);
    }
    else if (t == XHP_TAG) {
      r = xhp_tag(b, 0);
    }
    else if (t == XHP_TAG_BODY) {
      r = xhp_tag_body(b, 0);
    }
    else if (t == XHP_TYPE) {
      r = xhp_type(b, 0);
    }
    else if (t == YIELD_ASSIGN_EXPRESSION) {
      r = yield_assign_expression(b, 0);
    }
    else if (t == YIELD_EXPRESSION) {
      r = yield_expression(b, 0);
    }
    else if (t == YIELD_LIST_ASSIGN_EXPRESSION) {
      r = yield_list_assign_expression(b, 0);
    }
    else if (t == YIELD_STATEMENT) {
      r = yield_statement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return hackFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(CLASS_DECLARATION_STATEMENT, XHP_CLASS_DECLARATION_STATEMENT),
    create_token_set_(FUNCTION_DECLARATION_STATEMENT, METHOD_FUNCTION_DECLARATION),
    create_token_set_(CLASS_STATEMENT_LIST, ENUM_STATEMENT_LIST, INNER_STATEMENT_LIST, SWITCH_STATEMENT_LIST,
      TOP_STATEMENT_LIST),
    create_token_set_(ARRAY_TYPE, CALLABLE_TYPE, FUNCTION_TYPE, IDENTIFIER_TYPE,
      NULLABLE_TYPE, OPT_RETURN_TYPE, SHAPE_MEMBER_TYPE, SHAPE_TYPE,
      SOFT_TYPE, TUPLE_TYPE, XHP_ATTRIBUTE_DECL_TYPE, XHP_TYPE),
    create_token_set_(BLOCK_STATEMENT, BREAK_STATEMENT, CLASS_DECLARATION_STATEMENT, CLASS_STATEMENT,
      CONSTANT_DECLARATION_STATEMENT, CONTINUE_STATEMENT, DECLARE_NEW_STATEMENT, DECLARE_STATEMENT,
      DO_WHILE_STATEMENT, ECHO_STATEMENT, ENUM_DECLARATION_STATEMENT, ENUM_STATEMENT,
      EXPRESSION_STATEMENT, FOREACH_NEW_STATEMENT, FOREACH_STATEMENT, FOR_NEW_STATEMENT,
      FOR_STATEMENT, FUNCTION_DECLARATION_STATEMENT, GLOBAL_STATEMENT, GOTO_STATEMENT,
      HALT_COMPILER_STATEMENT, HTML_STATEMENT, IF_STATEMENT, INTERFACE_DECLARATION_STATEMENT,
      LABEL_STATEMENT, METHOD_FUNCTION_DECLARATION, NAMESPACE_DECLARATION_STATEMENT, NEW_TYPE_DECLARATION_STATEMENT,
      RETURN_STATEMENT, SEMICOLON_STATEMENT, STATIC_STATEMENT, SWITCH_NEW_STATEMENT,
      SWITCH_STATEMENT, THROW_STATEMENT, TRAIT_DECLARATION_STATEMENT, TRY_STATEMENT,
      TYPE_DECLARATION_STATEMENT, UNSET_STATEMENT, USE_DECLARATION_STATEMENT, WHILE_NEW_STATEMENT,
      WHILE_STATEMENT, XHP_CLASS_DECLARATION_STATEMENT, YIELD_STATEMENT),
  };

  /* ********************************************************** */
  // try_catch*
  static boolean additional_catches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additional_catches")) return false;
    int c = current_position_(b);
    while (true) {
      if (!try_catch(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additional_catches", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // additive_or_concatenation_operator multiplicative_expression_wrapper
  public static boolean additive_or_concatenation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_or_concatenation_expression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<additive or concatenation expression>");
    r = additive_or_concatenation_operator(b, l + 1);
    p = r; // pin = 1
    r = r && multiplicative_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, ADDITIVE_OR_CONCATENATION_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // multiplicative_expression_wrapper additive_or_concatenation_expression*
  static boolean additive_or_concatenation_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_or_concatenation_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicative_expression_wrapper(b, l + 1);
    r = r && additive_or_concatenation_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // additive_or_concatenation_expression*
  private static boolean additive_or_concatenation_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_or_concatenation_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!additive_or_concatenation_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additive_or_concatenation_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '+'|'-'|'.'
  public static boolean additive_or_concatenation_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_or_concatenation_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<additive or concatenation operator>");
    r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    if (!r) r = consumeToken(b, T_DOT);
    exit_section_(b, l, m, ADDITIVE_OR_CONCATENATION_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // array_offset_access | '{' expression '}'
  public static boolean array_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_access")) return false;
    if (!nextTokenIs(b, "<array access>", T_LBRACKET, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array access>");
    r = array_offset_access(b, l + 1);
    if (!r) r = array_access_1(b, l + 1);
    exit_section_(b, l, m, ARRAY_ACCESS, r, false, null);
    return r;
  }

  // '{' expression '}'
  private static boolean array_access_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_access_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_ARRAY '(' array_pair_list ')'
  static boolean array_literal_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_literal_base")) return false;
    if (!nextTokenIs(b, T_ARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ARRAY);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, array_pair_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // array_literal_base | short_array_literal_base
  public static boolean array_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_literal_expression")) return false;
    if (!nextTokenIs(b, "<array literal expression>", T_LBRACKET, T_ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array literal expression>");
    r = array_literal_base(b, l + 1);
    if (!r) r = short_array_literal_base(b, l + 1);
    exit_section_(b, l, m, ARRAY_LITERAL_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' expression ']'
  public static boolean array_offset_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_offset_access")) return false;
    if (!nextTokenIs(b, T_LBRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1));
    r = p && consumeToken(b, T_RBRACKET) && r;
    exit_section_(b, l, m, ARRAY_OFFSET_ACCESS, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // expression (T_DOUBLE_ARROW (expression|(&variable)))?
  public static boolean array_pair_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pair_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array pair item>");
    r = expression(b, l + 1);
    r = r && array_pair_item_1(b, l + 1);
    exit_section_(b, l, m, ARRAY_PAIR_ITEM, r, false, null);
    return r;
  }

  // (T_DOUBLE_ARROW (expression|(&variable)))?
  private static boolean array_pair_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pair_item_1")) return false;
    array_pair_item_1_0(b, l + 1);
    return true;
  }

  // T_DOUBLE_ARROW (expression|(&variable))
  private static boolean array_pair_item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pair_item_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOUBLE_ARROW);
    r = r && array_pair_item_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression|(&variable)
  private static boolean array_pair_item_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pair_item_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    if (!r) r = array_pair_item_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &variable
  private static boolean array_pair_item_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pair_item_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_, null);
    r = variable(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (array_pair_item (',' array_pair_item)* ','?)?
  public static boolean array_pair_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pair_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<array pair list>");
    array_pair_list_0(b, l + 1);
    exit_section_(b, l, m, ARRAY_PAIR_LIST, true, false, null);
    return true;
  }

  // array_pair_item (',' array_pair_item)* ','?
  private static boolean array_pair_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pair_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_pair_item(b, l + 1);
    r = r && array_pair_list_0_1(b, l + 1);
    r = r && array_pair_list_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' array_pair_item)*
  private static boolean array_pair_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pair_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!array_pair_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_pair_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' array_pair_item
  private static boolean array_pair_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pair_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && array_pair_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean array_pair_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pair_list_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_ARRAY typeargs?
  public static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    if (!nextTokenIs(b, T_ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY);
    r = r && array_type_1(b, l + 1);
    exit_section_(b, m, ARRAY_TYPE, r);
    return r;
  }

  // typeargs?
  private static boolean array_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1")) return false;
    typeargs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // assignment_operator assignment_expression_wrapper
  public static boolean assignment_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_expression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<assignment expression>");
    r = assignment_operator(b, l + 1);
    p = r; // pin = 1
    r = r && assignment_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, ASSIGNMENT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (try_variable_name_first assignment_or_list_expression+)|ternary_expression_wrapper
  static boolean assignment_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_expression_wrapper_0(b, l + 1);
    if (!r) r = ternary_expression_wrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // try_variable_name_first assignment_or_list_expression+
  private static boolean assignment_expression_wrapper_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_expression_wrapper_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = try_variable_name_first(b, l + 1);
    r = r && assignment_expression_wrapper_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // assignment_or_list_expression+
  private static boolean assignment_expression_wrapper_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_expression_wrapper_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_or_list_expression(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!assignment_or_list_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assignment_expression_wrapper_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((try_variable_name_first | (list_assignment_variables)) (',' (variable_name_holder|variable | (list_assignment_variables)))*)?
  public static boolean assignment_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<assignment list>");
    assignment_list_0(b, l + 1);
    exit_section_(b, l, m, ASSIGNMENT_LIST, true, false, null);
    return true;
  }

  // (try_variable_name_first | (list_assignment_variables)) (',' (variable_name_holder|variable | (list_assignment_variables)))*
  private static boolean assignment_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_list_0_0(b, l + 1);
    r = r && assignment_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // try_variable_name_first | (list_assignment_variables)
  private static boolean assignment_list_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_list_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = try_variable_name_first(b, l + 1);
    if (!r) r = assignment_list_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (list_assignment_variables)
  private static boolean assignment_list_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_list_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_assignment_variables(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (variable_name_holder|variable | (list_assignment_variables)))*
  private static boolean assignment_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!assignment_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assignment_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' (variable_name_holder|variable | (list_assignment_variables))
  private static boolean assignment_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && assignment_list_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // variable_name_holder|variable | (list_assignment_variables)
  private static boolean assignment_list_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_list_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_name_holder(b, l + 1);
    if (!r) r = variable(b, l + 1);
    if (!r) r = assignment_list_0_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (list_assignment_variables)
  private static boolean assignment_list_0_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_list_0_1_0_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_assignment_variables(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('=' ('&' T_NEW)?) | T_PLUS_EQUAL | T_MINUS_EQUAL | T_MUL_EQUAL | T_DIV_EQUAL | T_CONCAT_EQUAL | T_MOD_EQUAL | T_AND_EQUAL | T_OR_EQUAL | T_XOR_EQUAL | T_SL_EQUAL | T_SR_EQUAL | T_POW_EQUAL
  static boolean assignment_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_operator_0(b, l + 1);
    if (!r) r = consumeToken(b, T_PLUS_EQUAL);
    if (!r) r = consumeToken(b, T_MINUS_EQUAL);
    if (!r) r = consumeToken(b, T_MUL_EQUAL);
    if (!r) r = consumeToken(b, T_DIV_EQUAL);
    if (!r) r = consumeToken(b, T_CONCAT_EQUAL);
    if (!r) r = consumeToken(b, T_MOD_EQUAL);
    if (!r) r = consumeToken(b, T_AND_EQUAL);
    if (!r) r = consumeToken(b, T_OR_EQUAL);
    if (!r) r = consumeToken(b, T_XOR_EQUAL);
    if (!r) r = consumeToken(b, T_SL_EQUAL);
    if (!r) r = consumeToken(b, T_SR_EQUAL);
    if (!r) r = consumeToken(b, T_POW_EQUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' ('&' T_NEW)?
  private static boolean assignment_operator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQUAL);
    r = r && assignment_operator_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('&' T_NEW)?
  private static boolean assignment_operator_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator_0_1")) return false;
    assignment_operator_0_1_0(b, l + 1);
    return true;
  }

  // '&' T_NEW
  private static boolean assignment_operator_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AND);
    r = r && consumeToken(b, T_NEW);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignment_expression | list_assignment_expression
  static boolean assignment_or_list_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_or_list_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_expression(b, l + 1);
    if (!r) r = list_assignment_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' static_scalar_list_ae ')'
  public static boolean attribute_static_scalar_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_static_scalar_list")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && static_scalar_list_ae(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, ATTRIBUTE_STATIC_SCALAR_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // try_variable_name_first '=' await_expression
  public static boolean await_assign_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "await_assign_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<await assign expression>");
    r = try_variable_name_first(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && await_expression(b, l + 1);
    exit_section_(b, l, m, AWAIT_ASSIGN_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_AWAIT expression
  public static boolean await_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "await_expression")) return false;
    if (!nextTokenIs(b, T_AWAIT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_AWAIT);
    p = r; // pin = 1
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, AWAIT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // list_assignment_variables '=' await_expression
  public static boolean await_list_assign_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "await_list_assign_expression")) return false;
    if (!nextTokenIs(b, T_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_assignment_variables(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && await_expression(b, l + 1);
    exit_section_(b, m, AWAIT_LIST_ASSIGN_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // '`' (T_ENCAPSED_AND_WHITESPACE | encaps_list)* '`'
  public static boolean backticks_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "backticks_expression")) return false;
    if (!nextTokenIs(b, T_BACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_BACK);
    r = r && backticks_expression_1(b, l + 1);
    r = r && consumeToken(b, T_BACK);
    exit_section_(b, m, BACKTICKS_EXPRESSION, r);
    return r;
  }

  // (T_ENCAPSED_AND_WHITESPACE | encaps_list)*
  private static boolean backticks_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "backticks_expression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!backticks_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "backticks_expression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // T_ENCAPSED_AND_WHITESPACE | encaps_list
  private static boolean backticks_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "backticks_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ENCAPSED_AND_WHITESPACE);
    if (!r) r = encaps_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // bitwise_operator shift_expression_wrapper
  public static boolean bitwise_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_expression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<bitwise expression>");
    r = bitwise_operator(b, l + 1);
    p = r; // pin = 1
    r = r && shift_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, BITWISE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // shift_expression_wrapper bitwise_expression*
  static boolean bitwise_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_expression_wrapper(b, l + 1);
    r = r && bitwise_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // bitwise_expression*
  private static boolean bitwise_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!bitwise_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bitwise_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '|' | '&' | '^'
  public static boolean bitwise_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<bitwise operator>");
    r = consumeToken(b, T_OR);
    if (!r) r = consumeToken(b, T_AND);
    if (!r) r = consumeToken(b, T_XOR);
    exit_section_(b, l, m, BITWISE_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_NAMESPACE namespace_name_declaration? '{'  top_statement_list '}'
  static boolean block_namespace_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_namespace_statement")) return false;
    if (!nextTokenIs(b, T_NAMESPACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_NAMESPACE);
    r = r && block_namespace_statement_1(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    p = r; // pin = 3
    r = r && report_error_(b, top_statement_list(b, l + 1));
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // namespace_name_declaration?
  private static boolean block_namespace_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_namespace_statement_1")) return false;
    namespace_name_declaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' inner_statement_list '}'
  public static boolean block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, inner_statement_list(b, l + 1));
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, BLOCK_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_BREAK expression? ';'
  public static boolean break_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement")) return false;
    if (!nextTokenIs(b, T_BREAK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_BREAK);
    p = r; // pin = 1
    r = r && report_error_(b, break_statement_1(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, BREAK_STATEMENT, r, p, null);
    return r || p;
  }

  // expression?
  private static boolean break_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // callable_variable '(' function_call_parameter_list ')'
  public static boolean callable_function_call_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable_function_call_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<callable function call expression>");
    r = callable_variable(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    r = r && function_call_parameter_list(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, l, m, CALLABLE_FUNCTION_CALL_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_CALLABLE
  public static boolean callable_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable_type")) return false;
    if (!nextTokenIs(b, T_CALLABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CALLABLE);
    exit_section_(b, m, CALLABLE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // variable_expression | dimmable_variable_access_expression | parenthesized_variable_expression
  public static boolean callable_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callable_variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<callable variable>");
    r = variable_expression(b, l + 1);
    if (!r) r = dimmable_variable_access_expression(b, l + 1);
    if (!r) r = parenthesized_variable_expression(b, l + 1);
    exit_section_(b, l, m, CALLABLE_VARIABLE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression | ('&' variable) | ("..." expression) {}
  public static boolean calling_parameter_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calling_parameter_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<calling parameter item>");
    r = expression(b, l + 1);
    if (!r) r = calling_parameter_item_1(b, l + 1);
    if (!r) r = calling_parameter_item_2(b, l + 1);
    exit_section_(b, l, m, CALLING_PARAMETER_ITEM, r, false, null);
    return r;
  }

  // '&' variable
  private static boolean calling_parameter_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calling_parameter_item_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AND);
    r = r && variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("..." expression) {}
  private static boolean calling_parameter_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calling_parameter_item_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calling_parameter_item_2_0(b, l + 1);
    r = r && calling_parameter_item_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "..." expression
  private static boolean calling_parameter_item_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calling_parameter_item_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ELLIPSIS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {}
  private static boolean calling_parameter_item_2_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // T_CASE expression case_separator inner_statement_list
  public static boolean case_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_block")) return false;
    if (!nextTokenIs(b, T_CASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_CASE);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1));
    r = p && report_error_(b, case_separator(b, l + 1)) && r;
    r = p && inner_statement_list(b, l + 1) && r;
    exit_section_(b, l, m, CASE_BLOCK, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (case_block|default_case_block)*
  public static boolean case_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<case list>");
    int c = current_position_(b);
    while (true) {
      if (!case_list_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, CASE_LIST, true, false, null);
    return true;
  }

  // case_block|default_case_block
  private static boolean case_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_block(b, l + 1);
    if (!r) r = default_case_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' | ';'
  public static boolean case_separator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_separator")) return false;
    if (!nextTokenIs(b, "<case separator>", T_COLON, T_SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<case separator>");
    r = consumeToken(b, T_COLON);
    if (!r) r = consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, CASE_SEPARATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // cast_operator  prefix_expression_wrapper
  public static boolean cast_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<cast expression>");
    r = cast_operator(b, l + 1);
    p = r; // pin = 1
    r = r && prefix_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, CAST_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // cast_expression+|prefix_expression_wrapper
  static boolean cast_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cast_expression_wrapper_0(b, l + 1);
    if (!r) r = prefix_expression_wrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // cast_expression+
  private static boolean cast_expression_wrapper_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expression_wrapper_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cast_expression(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!cast_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cast_expression_wrapper_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_INT_CAST | T_DOUBLE_CAST | T_STRING_CAST | T_ARRAY_CAST | T_OBJECT_CAST | T_BOOL_CAST | T_UNSET_CAST
  public static boolean cast_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<cast operator>");
    r = consumeToken(b, T_INT_CAST);
    if (!r) r = consumeToken(b, T_DOUBLE_CAST);
    if (!r) r = consumeToken(b, T_STRING_CAST);
    if (!r) r = consumeToken(b, T_ARRAY_CAST);
    if (!r) r = consumeToken(b, T_OBJECT_CAST);
    if (!r) r = consumeToken(b, T_BOOL_CAST);
    if (!r) r = consumeToken(b, T_UNSET_CAST);
    exit_section_(b, l, m, CAST_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // static_class_name T_DOUBLE_COLON (identifier|T_CLASS)
  public static boolean class_constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class constant>");
    r = static_class_name(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && class_constant_2(b, l + 1);
    exit_section_(b, l, m, CLASS_CONSTANT, r, false, null);
    return r;
  }

  // identifier|T_CLASS
  private static boolean class_constant_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_constant_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    if (!r) r = consumeToken(b, T_CLASS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // user_attributes? (T_CLASS | (T_ABSTRACT T_CLASS) | (T_FINAL T_CLASS)) name_holder typevar?  extends_from? implements_list? class_statement_block
  public static boolean class_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<class declaration statement>");
    r = class_declaration_statement_0(b, l + 1);
    r = r && class_declaration_statement_1(b, l + 1);
    r = r && name_holder(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, class_declaration_statement_3(b, l + 1));
    r = p && report_error_(b, class_declaration_statement_4(b, l + 1)) && r;
    r = p && report_error_(b, class_declaration_statement_5(b, l + 1)) && r;
    r = p && class_statement_block(b, l + 1) && r;
    exit_section_(b, l, m, CLASS_DECLARATION_STATEMENT, r, p, null);
    return r || p;
  }

  // user_attributes?
  private static boolean class_declaration_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_statement_0")) return false;
    user_attributes(b, l + 1);
    return true;
  }

  // T_CLASS | (T_ABSTRACT T_CLASS) | (T_FINAL T_CLASS)
  private static boolean class_declaration_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CLASS);
    if (!r) r = class_declaration_statement_1_1(b, l + 1);
    if (!r) r = class_declaration_statement_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_ABSTRACT T_CLASS
  private static boolean class_declaration_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_statement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_ABSTRACT, T_CLASS);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_FINAL T_CLASS
  private static boolean class_declaration_statement_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_statement_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_FINAL, T_CLASS);
    exit_section_(b, m, null, r);
    return r;
  }

  // typevar?
  private static boolean class_declaration_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_statement_3")) return false;
    typevar(b, l + 1);
    return true;
  }

  // extends_from?
  private static boolean class_declaration_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_statement_4")) return false;
    extends_from(b, l + 1);
    return true;
  }

  // implements_list?
  private static boolean class_declaration_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_statement_5")) return false;
    implements_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // static_class_name T_DOUBLE_COLON ((identifier typeargs?)|variable_expression|variable_expression_variable) '(' function_call_parameter_list ')'
  public static boolean class_method_call_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_method_call_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class method call expression>");
    r = static_class_name(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && class_method_call_expression_2(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    r = r && function_call_parameter_list(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, l, m, CLASS_METHOD_CALL_EXPRESSION, r, false, null);
    return r;
  }

  // (identifier typeargs?)|variable_expression|variable_expression_variable
  private static boolean class_method_call_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_method_call_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_method_call_expression_2_0(b, l + 1);
    if (!r) r = variable_expression(b, l + 1);
    if (!r) r = variable_expression_variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier typeargs?
  private static boolean class_method_call_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_method_call_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && class_method_call_expression_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeargs?
  private static boolean class_method_call_expression_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_method_call_expression_2_0_1")) return false;
    typeargs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // fully_qualified_class_name
  //                         | T_STATIC
  //                         | variable_no_calls
  public static boolean class_name_reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name_reference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class name reference>");
    r = fully_qualified_class_name(b, l + 1);
    if (!r) r = consumeToken(b, T_STATIC);
    if (!r) r = variable_no_calls(b, l + 1);
    exit_section_(b, l, m, CLASS_NAME_REFERENCE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ((T_NAMESPACE namespace_name) | namespace_name) typeargs?
  static boolean class_namespace_string_typeargs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_namespace_string_typeargs")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_namespace_string_typeargs_0(b, l + 1);
    r = r && class_namespace_string_typeargs_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_NAMESPACE namespace_name) | namespace_name
  private static boolean class_namespace_string_typeargs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_namespace_string_typeargs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_namespace_string_typeargs_0_0(b, l + 1);
    if (!r) r = namespace_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_NAMESPACE namespace_name
  private static boolean class_namespace_string_typeargs_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_namespace_string_typeargs_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NAMESPACE);
    r = r && namespace_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeargs?
  private static boolean class_namespace_string_typeargs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_namespace_string_typeargs_1")) return false;
    typeargs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // class_variable_declarations ';'
  // | constant_declaration ';'
  // | method_function_declaration ';'?
  // | xhp_attribute_declaration
  // | xhp_category_declaration
  // | xhp_children_declaration
  // | trait_require_declaration
  // | trait_use_declaration
  public static boolean class_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<class statement>");
    r = class_statement_0(b, l + 1);
    if (!r) r = class_statement_1(b, l + 1);
    if (!r) r = class_statement_2(b, l + 1);
    if (!r) r = xhp_attribute_declaration(b, l + 1);
    if (!r) r = xhp_category_declaration(b, l + 1);
    if (!r) r = xhp_children_declaration(b, l + 1);
    if (!r) r = trait_require_declaration(b, l + 1);
    if (!r) r = trait_use_declaration(b, l + 1);
    exit_section_(b, l, m, CLASS_STATEMENT, r, false, null);
    return r;
  }

  // class_variable_declarations ';'
  private static boolean class_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_variable_declarations(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // constant_declaration ';'
  private static boolean class_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constant_declaration(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // method_function_declaration ';'?
  private static boolean class_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_function_declaration(b, l + 1);
    r = r && class_statement_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean class_statement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement_2_1")) return false;
    consumeToken(b, T_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // '{' class_statement_list '}'
  public static boolean class_statement_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement_block")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, class_statement_list(b, l + 1));
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, CLASS_STATEMENT_BLOCK, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // class_statement*
  public static boolean class_statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<class statement list>");
    int c = current_position_(b);
    while (true) {
      if (!class_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_statement_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, CLASS_STATEMENT_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // (static_assignment|variable_name_holder) (','  (static_assignment|variable_name_holder))*
  public static boolean class_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_variable_declaration")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_variable_declaration_0(b, l + 1);
    r = r && class_variable_declaration_1(b, l + 1);
    exit_section_(b, m, CLASS_VARIABLE_DECLARATION, r);
    return r;
  }

  // static_assignment|variable_name_holder
  private static boolean class_variable_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_variable_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_assignment(b, l + 1);
    if (!r) r = variable_name_holder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','  (static_assignment|variable_name_holder))*
  private static boolean class_variable_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_variable_declaration_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!class_variable_declaration_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_variable_declaration_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','  (static_assignment|variable_name_holder)
  private static boolean class_variable_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_variable_declaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && class_variable_declaration_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static_assignment|variable_name_holder
  private static boolean class_variable_declaration_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_variable_declaration_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_assignment(b, l + 1);
    if (!r) r = variable_name_holder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (variable_modifiers|(member_modifier+ types_group?))  class_variable_declaration
  public static boolean class_variable_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_variable_declarations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class variable declarations>");
    r = class_variable_declarations_0(b, l + 1);
    r = r && class_variable_declaration(b, l + 1);
    exit_section_(b, l, m, CLASS_VARIABLE_DECLARATIONS, r, false, null);
    return r;
  }

  // variable_modifiers|(member_modifier+ types_group?)
  private static boolean class_variable_declarations_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_variable_declarations_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_modifiers(b, l + 1);
    if (!r) r = class_variable_declarations_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // member_modifier+ types_group?
  private static boolean class_variable_declarations_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_variable_declarations_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_variable_declarations_0_1_0(b, l + 1);
    r = r && class_variable_declarations_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // member_modifier+
  private static boolean class_variable_declarations_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_variable_declarations_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_modifier(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!member_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_variable_declarations_0_1_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // types_group?
  private static boolean class_variable_declarations_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_variable_declarations_0_1_1")) return false;
    types_group(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // class_declaration_statement | xhp_class_declaration_statement
  static boolean classes_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classes_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_declaration_statement(b, l + 1);
    if (!r) r = xhp_class_declaration_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_CLONE expression
  public static boolean clone_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_expression")) return false;
    if (!nextTokenIs(b, T_CLONE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_CLONE);
    p = r; // pin = 1
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, CLONE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // closure_function
  public static boolean closure_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<closure expression>");
    r = closure_function(b, l + 1);
    exit_section_(b, l, m, CLOSURE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // member_modifier* T_FUNCTION '&'? '('  parameter_list ')' opt_return_type? lambda_use_vars? '{' inner_statement_list '}'
  public static boolean closure_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_function")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<closure function>");
    r = closure_function_0(b, l + 1);
    r = r && consumeToken(b, T_FUNCTION);
    r = r && closure_function_2(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 4
    r = r && report_error_(b, parameter_list(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && report_error_(b, closure_function_6(b, l + 1)) && r;
    r = p && report_error_(b, closure_function_7(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_LBRACE)) && r;
    r = p && report_error_(b, inner_statement_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, CLOSURE_FUNCTION, r, p, null);
    return r || p;
  }

  // member_modifier*
  private static boolean closure_function_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_function_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "closure_function_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '&'?
  private static boolean closure_function_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_function_2")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  // opt_return_type?
  private static boolean closure_function_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_function_6")) return false;
    opt_return_type(b, l + 1);
    return true;
  }

  // lambda_use_vars?
  private static boolean closure_function_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_function_7")) return false;
    lambda_use_vars(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // fully_qualified_class_name '{' array_pair_list '}'
  static boolean collection_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_literal")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = fully_qualified_class_name(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    p = r; // pin = 2
    r = r && report_error_(b, array_pair_list(b, l + 1));
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // collection_literal
  public static boolean collection_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_literal_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<collection literal expression>");
    r = collection_literal(b, l + 1);
    exit_section_(b, l, m, COLLECTION_LITERAL_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // comparative_operator bitwise_expression_wrapper
  public static boolean comparative_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<comparative expression>");
    r = comparative_operator(b, l + 1);
    p = r; // pin = 1
    r = r && bitwise_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, COMPARATIVE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // bitwise_expression_wrapper comparative_expression*
  static boolean comparative_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bitwise_expression_wrapper(b, l + 1);
    r = r && comparative_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comparative_expression*
  private static boolean comparative_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!comparative_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparative_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_IS_IDENTICAL | T_IS_NOT_IDENTICAL | T_IS_EQUAL | T_IS_NOT_EQUAL | '<' | T_IS_SMALLER_OR_EQUAL | '>' | T_IS_GREATER_OR_EQUAL
  public static boolean comparative_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<comparative operator>");
    r = consumeToken(b, T_IS_IDENTICAL);
    if (!r) r = consumeToken(b, T_IS_NOT_IDENTICAL);
    if (!r) r = consumeToken(b, T_IS_EQUAL);
    if (!r) r = consumeToken(b, T_IS_NOT_EQUAL);
    if (!r) r = consumeToken(b, T_LESS);
    if (!r) r = consumeToken(b, T_IS_SMALLER_OR_EQUAL);
    if (!r) r = consumeToken(b, T_GREATER);
    if (!r) r = consumeToken(b, T_IS_GREATER_OR_EQUAL);
    exit_section_(b, l, m, COMPARATIVE_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_variable_name | (expression_variable)
  static boolean compound_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_variable")) return false;
    if (!nextTokenIs(b, "", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_variable_name(b, l + 1);
    if (!r) r = compound_variable_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expression_variable)
  private static boolean compound_variable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_variable_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // name_with_type '=' static_expression
  public static boolean constant_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_assignment")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<constant assignment>");
    r = name_with_type(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    p = r; // pin = 2
    r = r && static_expression(b, l + 1);
    exit_section_(b, l, m, CONSTANT_ASSIGNMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_CONST constant_assignment (',' constant_assignment)*
  public static boolean constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration")) return false;
    if (!nextTokenIs(b, T_CONST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_CONST);
    p = r; // pin = 1
    r = r && report_error_(b, constant_assignment(b, l + 1));
    r = p && constant_declaration_2(b, l + 1) && r;
    exit_section_(b, l, m, CONSTANT_DECLARATION, r, p, null);
    return r || p;
  }

  // (',' constant_assignment)*
  private static boolean constant_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!constant_declaration_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constant_declaration_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' constant_assignment
  private static boolean constant_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && constant_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constant_declaration ';'
  public static boolean constant_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_statement")) return false;
    if (!nextTokenIs(b, T_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constant_declaration(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, CONSTANT_DECLARATION_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // T_CONTINUE expression? ';'
  public static boolean continue_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement")) return false;
    if (!nextTokenIs(b, T_CONTINUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_CONTINUE);
    p = r; // pin = 1
    r = r && report_error_(b, continue_statement_1(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, CONTINUE_STATEMENT, r, p, null);
    return r || p;
  }

  // expression?
  private static boolean continue_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' function_call_parameter_list  ')'
  public static boolean ctor_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctor_arguments")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && function_call_parameter_list(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, CTOR_ARGUMENTS, r);
    return r;
  }

  /* ********************************************************** */
  // name_holder '=' static_expression
  public static boolean declare_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_assignment")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<declare assignment>");
    r = name_holder(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    p = r; // pin = 2
    r = r && static_expression(b, l + 1);
    exit_section_(b, l, m, DECLARE_ASSIGNMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (declare_assignment (',' declare_assignment )*)?
  public static boolean declare_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<declare list>");
    declare_list_0(b, l + 1);
    exit_section_(b, l, m, DECLARE_LIST, true, false, null);
    return true;
  }

  // declare_assignment (',' declare_assignment )*
  private static boolean declare_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declare_assignment(b, l + 1);
    r = r && declare_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' declare_assignment )*
  private static boolean declare_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!declare_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declare_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' declare_assignment
  private static boolean declare_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && declare_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' inner_statement_list T_ENDDECLARE ';'
  public static boolean declare_new_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_new_statement")) return false;
    if (!nextTokenIs(b, T_COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_COLON);
    p = r; // pin = 1
    r = r && report_error_(b, inner_statement_list(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_ENDDECLARE)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, DECLARE_NEW_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_DECLARE '(' declare_list ')' declare_statement_body
  public static boolean declare_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_statement")) return false;
    if (!nextTokenIs(b, T_DECLARE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_DECLARE);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, declare_list(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && declare_statement_body(b, l + 1) && r;
    exit_section_(b, l, m, DECLARE_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // declare_new_statement | statement
  public static boolean declare_statement_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_statement_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declare statement body>");
    r = declare_new_statement(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, DECLARE_STATEMENT_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_DEFAULT case_separator inner_statement_list
  public static boolean default_case_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_case_block")) return false;
    if (!nextTokenIs(b, T_DEFAULT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_DEFAULT);
    p = r; // pin = 1
    r = r && report_error_(b, case_separator(b, l + 1));
    r = p && inner_statement_list(b, l + 1) && r;
    exit_section_(b, l, m, DEFAULT_CASE_BLOCK, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // dim_expression_base array_offset_access (array_offset_access)*
  public static boolean dim_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dim_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<dim expression>");
    r = dim_expression_base(b, l + 1);
    r = r && array_offset_access(b, l + 1);
    r = r && dim_expression_2(b, l + 1);
    exit_section_(b, l, m, DIM_EXPRESSION, r, false, null);
    return r;
  }

  // (array_offset_access)*
  private static boolean dim_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dim_expression_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!dim_expression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dim_expression_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (array_offset_access)
  private static boolean dim_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dim_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_offset_access(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // array_literal_expression | class_constant | T_CONSTANT_ENCAPSED_STRING | parenthesized_expression
  public static boolean dim_expression_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dim_expression_base")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<dim expression base>");
    r = array_literal_expression(b, l + 1);
    if (!r) r = class_constant(b, l + 1);
    if (!r) r = consumeToken(b, T_CONSTANT_ENCAPSED_STRING);
    if (!r) r = parenthesized_expression(b, l + 1);
    exit_section_(b, l, m, DIM_EXPRESSION_BASE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // array_access+ | ('(' expression_with_parens ')' array_access+)
  public static boolean dimmable_variable_access_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dimmable_variable_access_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<dimmable variable access expression>");
    r = dimmable_variable_access_expression_0(b, l + 1);
    if (!r) r = dimmable_variable_access_expression_1(b, l + 1);
    exit_section_(b, l, m, DIMMABLE_VARIABLE_ACCESS_EXPRESSION, r, false, null);
    return r;
  }

  // array_access+
  private static boolean dimmable_variable_access_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dimmable_variable_access_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_access(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!array_access(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dimmable_variable_access_expression_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' expression_with_parens ')' array_access+
  private static boolean dimmable_variable_access_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dimmable_variable_access_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && expression_with_parens(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    r = r && dimmable_variable_access_expression_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // array_access+
  private static boolean dimmable_variable_access_expression_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dimmable_variable_access_expression_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_access(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!array_access(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dimmable_variable_access_expression_1_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_DO  statement T_WHILE parenthesized_expression ';'
  public static boolean do_while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_while_statement")) return false;
    if (!nextTokenIs(b, T_DO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_DO);
    p = r; // pin = 1
    r = r && report_error_(b, statement(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_WHILE)) && r;
    r = p && report_error_(b, parenthesized_expression(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, DO_WHILE_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '"' encaps_list '"'
  public static boolean double_quotes_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "double_quotes_string")) return false;
    if (!nextTokenIs(b, T_DOUBLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOUBLE_QUOTE);
    r = r && encaps_list(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_QUOTE);
    exit_section_(b, m, DOUBLE_QUOTES_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // T_ECHO expression_list ';'
  public static boolean echo_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "echo_statement")) return false;
    if (!nextTokenIs(b, T_ECHO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ECHO);
    p = r; // pin = 1
    r = r && report_error_(b, expression_list(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, ECHO_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_ELSE statement
  public static boolean else_single(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_single")) return false;
    if (!nextTokenIs(b, T_ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ELSE);
    p = r; // pin = 1
    r = r && statement(b, l + 1);
    exit_section_(b, l, m, ELSE_SINGLE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_ELSEIF parenthesized_expression statement
  public static boolean elseif_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseif_body")) return false;
    if (!nextTokenIs(b, T_ELSEIF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ELSEIF);
    p = r; // pin = 1
    r = r && report_error_(b, parenthesized_expression(b, l + 1));
    r = p && statement(b, l + 1) && r;
    exit_section_(b, l, m, ELSEIF_BODY, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // elseif_body*
  public static boolean elseif_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseif_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<elseif list>");
    int c = current_position_(b);
    while (true) {
      if (!elseif_body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elseif_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, ELSEIF_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // T_EMPTY '(' expression ')'
  public static boolean empty_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "empty_expression")) return false;
    if (!nextTokenIs(b, T_EMPTY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_EMPTY);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, expression(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, EMPTY_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_CURLY_OPEN variable '}'
  public static boolean encaps_brace_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encaps_brace_expression")) return false;
    if (!nextTokenIs(b, T_CURLY_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CURLY_OPEN);
    r = r && variable(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, ENCAPS_BRACE_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // T_DOLLAR_OPEN_CURLY_BRACES T_STRING_VARNAME array_offset_access '}'
  public static boolean encaps_brace_index_offset_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encaps_brace_index_offset_expression")) return false;
    if (!nextTokenIs(b, T_DOLLAR_OPEN_CURLY_BRACES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_DOLLAR_OPEN_CURLY_BRACES, T_STRING_VARNAME);
    r = r && array_offset_access(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, ENCAPS_BRACE_INDEX_OFFSET_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // T_DOLLAR_OPEN_CURLY_BRACES expression '}'
  public static boolean encaps_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encaps_expression")) return false;
    if (!nextTokenIs(b, T_DOLLAR_OPEN_CURLY_BRACES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOLLAR_OPEN_CURLY_BRACES);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, ENCAPS_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // variable_identifier T_OBJECT_OPERATOR identifier
  public static boolean encaps_field_access_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encaps_field_access_expression")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_identifier(b, l + 1);
    r = r && consumeToken(b, T_OBJECT_OPERATOR);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, ENCAPS_FIELD_ACCESS_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // variable_identifier '[' encaps_var_offset ']'
  public static boolean encaps_index_offset_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encaps_index_offset_expression")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = variable_identifier(b, l + 1);
    r = r && consumeToken(b, T_LBRACKET);
    p = r; // pin = 2
    r = r && report_error_(b, encaps_var_offset(b, l + 1));
    r = p && consumeToken(b, T_RBRACKET) && r;
    exit_section_(b, l, m, ENCAPS_INDEX_OFFSET_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (T_ENCAPSED_AND_WHITESPACE|encaps_var)*
  public static boolean encaps_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encaps_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<encaps list>");
    int c = current_position_(b);
    while (true) {
      if (!encaps_list_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "encaps_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, ENCAPS_LIST, true, false, null);
    return true;
  }

  // T_ENCAPSED_AND_WHITESPACE|encaps_var
  private static boolean encaps_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encaps_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ENCAPSED_AND_WHITESPACE);
    if (!r) r = encaps_var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // encaps_index_offset_expression
  // | encaps_field_access_expression
  // | variable_identifier
  // | encaps_expression
  // | encaps_brace_index_offset_expression
  // | encaps_brace_expression
  public static boolean encaps_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encaps_var")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<encaps var>");
    r = encaps_index_offset_expression(b, l + 1);
    if (!r) r = encaps_field_access_expression(b, l + 1);
    if (!r) r = variable_identifier(b, l + 1);
    if (!r) r = encaps_expression(b, l + 1);
    if (!r) r = encaps_brace_index_offset_expression(b, l + 1);
    if (!r) r = encaps_brace_expression(b, l + 1);
    exit_section_(b, l, m, ENCAPS_VAR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier | T_NUM_STRING | T_VARIABLE
  public static boolean encaps_var_offset(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encaps_var_offset")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<encaps var offset>");
    r = identifier(b, l + 1);
    if (!r) r = consumeToken(b, T_NUM_STRING);
    if (!r) r = consumeToken(b, T_VARIABLE);
    exit_section_(b, l, m, ENCAPS_VAR_OFFSET, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_with_type '=' static_expression
  public static boolean enum_constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_constant_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<enum constant declaration>");
    r = name_with_type(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    p = r; // pin = 2
    r = r && static_expression(b, l + 1);
    exit_section_(b, l, m, ENUM_CONSTANT_DECLARATION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // user_attributes? T_ENUM name_holder  ':' types_group (T_AS types_group)? '{' enum_statement_list '}'
  public static boolean enum_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_statement")) return false;
    if (!nextTokenIs(b, "<enum declaration statement>", T_ENUM, T_SL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<enum declaration statement>");
    r = enum_declaration_statement_0(b, l + 1);
    r = r && consumeToken(b, T_ENUM);
    p = r; // pin = 2
    r = r && report_error_(b, name_holder(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COLON)) && r;
    r = p && report_error_(b, types_group(b, l + 1)) && r;
    r = p && report_error_(b, enum_declaration_statement_5(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_LBRACE)) && r;
    r = p && report_error_(b, enum_statement_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, ENUM_DECLARATION_STATEMENT, r, p, null);
    return r || p;
  }

  // user_attributes?
  private static boolean enum_declaration_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_statement_0")) return false;
    user_attributes(b, l + 1);
    return true;
  }

  // (T_AS types_group)?
  private static boolean enum_declaration_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_statement_5")) return false;
    enum_declaration_statement_5_0(b, l + 1);
    return true;
  }

  // T_AS types_group
  private static boolean enum_declaration_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && types_group(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // enum_constant_declaration ';'
  public static boolean enum_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum statement>");
    r = enum_constant_declaration(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, ENUM_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // enum_statement*
  public static boolean enum_statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_statement_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<enum statement list>");
    int c = current_position_(b);
    while (true) {
      if (!enum_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_statement_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, ENUM_STATEMENT_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // '(' expression_with_parens ')'
  public static boolean especial_parenthesised_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "especial_parenthesised_expression")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    r = r && expression_with_parens(b, l + 1);
    p = r; // pin = 2
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, l, m, ESPECIAL_PARENTHESISED_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_EVAL '(' expression ')'
  public static boolean eval_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eval_expression")) return false;
    if (!nextTokenIs(b, T_EVAL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_EVAL);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, expression(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, EVAL_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_EXIT (('(' ')' ) | parenthesized_expression)
  public static boolean exit_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_expression")) return false;
    if (!nextTokenIs(b, T_EXIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EXIT);
    r = r && exit_expression_1(b, l + 1);
    exit_section_(b, m, EXIT_EXPRESSION, r);
    return r;
  }

  // ('(' ')' ) | parenthesized_expression
  private static boolean exit_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exit_expression_1_0(b, l + 1);
    if (!r) r = parenthesized_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' ')'
  private static boolean exit_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignment_expression_wrapper
  static boolean expression(PsiBuilder b, int l) {
    return assignment_expression_wrapper(b, l + 1);
  }

  /* ********************************************************** */
  // (expression (',' expression)*)?
  public static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<expression list>");
    expression_list_0(b, l + 1);
    exit_section_(b, l, m, EXPRESSION_LIST, true, false, null);
    return true;
  }

  // expression (',' expression)*
  private static boolean expression_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && expression_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expression)*
  private static boolean expression_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expression
  private static boolean expression_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (yield_expression
  //                         |yield_assign_expression
  //                         |yield_list_assign_expression
  //                         |await_expression
  //                         |await_assign_expression
  //                         |await_list_assign_expression
  //                         |query_assign_expression
  //                         |expression) ';'
  public static boolean expression_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression statement>");
    r = expression_statement_0(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, EXPRESSION_STATEMENT, r, false, null);
    return r;
  }

  // yield_expression
  //                         |yield_assign_expression
  //                         |yield_list_assign_expression
  //                         |await_expression
  //                         |await_assign_expression
  //                         |await_list_assign_expression
  //                         |query_assign_expression
  //                         |expression
  private static boolean expression_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = yield_expression(b, l + 1);
    if (!r) r = yield_assign_expression(b, l + 1);
    if (!r) r = yield_list_assign_expression(b, l + 1);
    if (!r) r = await_expression(b, l + 1);
    if (!r) r = await_assign_expression(b, l + 1);
    if (!r) r = await_list_assign_expression(b, l + 1);
    if (!r) r = query_assign_expression(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '$' '{' expression '}'
  public static boolean expression_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_variable")) return false;
    if (!nextTokenIs(b, T_DOLLAR_SIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOLLAR_SIGN);
    r = r && consumeToken(b, T_LBRACE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, EXPRESSION_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // especial_parenthesised_expression
  //                             | new_expression
  //                             | clone_expression
  //                             | xhp_expression
  //                             | collection_literal_expression
  static boolean expression_with_parens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_with_parens")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = especial_parenthesised_expression(b, l + 1);
    if (!r) r = new_expression(b, l + 1);
    if (!r) r = clone_expression(b, l + 1);
    if (!r) r = xhp_expression(b, l + 1);
    if (!r) r = collection_literal_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_EXTENDS fully_qualified_class_name
  public static boolean extends_from(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_from")) return false;
    if (!nextTokenIs(b, T_EXTENDS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_EXTENDS);
    p = r; // pin = 1
    r = r && fully_qualified_class_name(b, l + 1);
    exit_section_(b, l, m, EXTENDS_FROM, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // block_statement
  static boolean finally_statement_list(PsiBuilder b, int l) {
    return block_statement(b, l + 1);
  }

  /* ********************************************************** */
  // ':' inner_statement_list T_ENDFOR ';'
  public static boolean for_new_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_new_statement")) return false;
    if (!nextTokenIs(b, T_COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_COLON);
    p = r; // pin = 1
    r = r && report_error_(b, inner_statement_list(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_ENDFOR)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, FOR_NEW_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_FOR '(' expression_list ';' expression_list ';' expression_list ')'  for_statement_body
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, T_FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_FOR);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, expression_list(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_SEMICOLON)) && r;
    r = p && report_error_(b, expression_list(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_SEMICOLON)) && r;
    r = p && report_error_(b, expression_list(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && for_statement_body(b, l + 1) && r;
    exit_section_(b, l, m, FOR_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // for_new_statement     | statement
  public static boolean for_statement_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<for statement body>");
    r = for_new_statement(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, FOR_STATEMENT_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // list_assignment_variables
  public static boolean foreach_list_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_list_assignment")) return false;
    if (!nextTokenIs(b, T_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_assignment_variables(b, l + 1);
    exit_section_(b, m, FOREACH_LIST_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ':' inner_statement_list T_ENDFOREACH ';'
  public static boolean foreach_new_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_new_statement")) return false;
    if (!nextTokenIs(b, T_COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_COLON);
    p = r; // pin = 1
    r = r && report_error_(b, inner_statement_list(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_ENDFOREACH)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, FOREACH_NEW_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_DOUBLE_ARROW foreach_variable
  public static boolean foreach_optional_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_optional_arg")) return false;
    if (!nextTokenIs(b, T_DOUBLE_ARROW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_DOUBLE_ARROW);
    p = r; // pin = 1
    r = r && foreach_variable(b, l + 1);
    exit_section_(b, l, m, FOREACH_OPTIONAL_ARG, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_FOREACH '(' expression T_AWAIT? T_AS foreach_variable foreach_optional_arg? ')'  foreach_statement_body
  public static boolean foreach_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement")) return false;
    if (!nextTokenIs(b, T_FOREACH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_FOREACH);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, expression(b, l + 1)) && r;
    r = p && report_error_(b, foreach_statement_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_AS)) && r;
    r = p && report_error_(b, foreach_variable(b, l + 1)) && r;
    r = p && report_error_(b, foreach_statement_6(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && foreach_statement_body(b, l + 1) && r;
    exit_section_(b, l, m, FOREACH_STATEMENT, r, p, null);
    return r || p;
  }

  // T_AWAIT?
  private static boolean foreach_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_3")) return false;
    consumeToken(b, T_AWAIT);
    return true;
  }

  // foreach_optional_arg?
  private static boolean foreach_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_6")) return false;
    foreach_optional_arg(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // foreach_new_statement | statement
  public static boolean foreach_statement_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach statement body>");
    r = foreach_new_statement(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, FOREACH_STATEMENT_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('&'? variable) | foreach_list_assignment
  public static boolean foreach_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach variable>");
    r = foreach_variable_0(b, l + 1);
    if (!r) r = foreach_list_assignment(b, l + 1);
    exit_section_(b, l, m, FOREACH_VARIABLE, r, false, null);
    return r;
  }

  // '&'? variable
  private static boolean foreach_variable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_variable_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = foreach_variable_0_0(b, l + 1);
    r = r && variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&'?
  private static boolean foreach_variable_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_variable_0_0")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  /* ********************************************************** */
  // T_FROM T_VARIABLE T_IN expression
  public static boolean from_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "from_clause")) return false;
    if (!nextTokenIs(b, T_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_FROM, T_VARIABLE, T_IN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, FROM_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs
  //                     | xhp_identifier
  public static boolean fully_qualified_class_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fully_qualified_class_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<fully qualified class name>");
    r = class_namespace_string_typeargs(b, l + 1);
    if (!r) r = xhp_identifier(b, l + 1);
    exit_section_(b, l, m, FULLY_QUALIFIED_CLASS_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_list "..."?
  public static boolean func_type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_type_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<func type list>");
    r = type_list(b, l + 1);
    r = r && func_type_list_1(b, l + 1);
    exit_section_(b, l, m, FUNC_TYPE_LIST, r, false, null);
    return r;
  }

  // "..."?
  private static boolean func_type_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_type_list_1")) return false;
    consumeToken(b, T_ELLIPSIS);
    return true;
  }

  /* ********************************************************** */
  // '{' inner_statement_list '}' ';'?
  public static boolean function_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_body")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, inner_statement_list(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_RBRACE)) && r;
    r = p && function_body_3(b, l + 1) && r;
    exit_section_(b, l, m, FUNCTION_BODY, r, p, null);
    return r || p;
  }

  // ';'?
  private static boolean function_body_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_body_3")) return false;
    consumeToken(b, T_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // (calling_parameter_item (',' calling_parameter_item)* ','?)?
  public static boolean function_call_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_parameter_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<function call parameter list>");
    function_call_parameter_list_0(b, l + 1);
    exit_section_(b, l, m, FUNCTION_CALL_PARAMETER_LIST, true, false, null);
    return true;
  }

  // calling_parameter_item (',' calling_parameter_item)* ','?
  private static boolean function_call_parameter_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_parameter_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calling_parameter_item(b, l + 1);
    r = r && function_call_parameter_list_0_1(b, l + 1);
    r = r && function_call_parameter_list_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' calling_parameter_item)*
  private static boolean function_call_parameter_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_parameter_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!function_call_parameter_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_call_parameter_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' calling_parameter_item
  private static boolean function_call_parameter_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_parameter_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && calling_parameter_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean function_call_parameter_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_parameter_list_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // user_attributes? method_modifiers? T_FUNCTION '&'? name_holder typevar?  '(' parameter_list ')' opt_return_type? function_body
  public static boolean function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<function declaration>");
    r = function_declaration_0(b, l + 1);
    r = r && function_declaration_1(b, l + 1);
    r = r && consumeToken(b, T_FUNCTION);
    r = r && function_declaration_3(b, l + 1);
    r = r && name_holder(b, l + 1);
    p = r; // pin = 5
    r = r && report_error_(b, function_declaration_5(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_LPAREN)) && r;
    r = p && report_error_(b, parameter_list(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && report_error_(b, function_declaration_9(b, l + 1)) && r;
    r = p && function_body(b, l + 1) && r;
    exit_section_(b, l, m, FUNCTION_DECLARATION, r, p, null);
    return r || p;
  }

  // user_attributes?
  private static boolean function_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_0")) return false;
    user_attributes(b, l + 1);
    return true;
  }

  // method_modifiers?
  private static boolean function_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_1")) return false;
    method_modifiers(b, l + 1);
    return true;
  }

  // '&'?
  private static boolean function_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_3")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  // typevar?
  private static boolean function_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_5")) return false;
    typevar(b, l + 1);
    return true;
  }

  // opt_return_type?
  private static boolean function_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_9")) return false;
    opt_return_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // function_declaration
  public static boolean function_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function declaration statement>");
    r = function_declaration(b, l + 1);
    exit_section_(b, l, m, FUNCTION_DECLARATION_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' T_FUNCTION '(' func_type_list ')' ':' types_group ')'
  public static boolean function_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    r = r && consumeToken(b, T_FUNCTION);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, func_type_list(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && report_error_(b, consumeToken(b, T_COLON)) && r;
    r = p && report_error_(b, types_group(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, FUNCTION_TYPE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_GLOBAL global_var_list ';'
  public static boolean global_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_statement")) return false;
    if (!nextTokenIs(b, T_GLOBAL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_GLOBAL);
    p = r; // pin = 1
    r = r && report_error_(b, global_var_list(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, GLOBAL_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // variable_name_holder | ('$' variable) | (expression_variable)
  public static boolean global_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_var")) return false;
    if (!nextTokenIs(b, "<global var>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global var>");
    r = variable_name_holder(b, l + 1);
    if (!r) r = global_var_1(b, l + 1);
    if (!r) r = global_var_2(b, l + 1);
    exit_section_(b, l, m, GLOBAL_VAR, r, false, null);
    return r;
  }

  // '$' variable
  private static boolean global_var_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_var_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOLLAR_SIGN);
    r = r && variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expression_variable)
  private static boolean global_var_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_var_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (global_var (',' global_var)*)?
  public static boolean global_var_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_var_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<global var list>");
    global_var_list_0(b, l + 1);
    exit_section_(b, l, m, GLOBAL_VAR_LIST, true, false, null);
    return true;
  }

  // global_var (',' global_var)*
  private static boolean global_var_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_var_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_var(b, l + 1);
    r = r && global_var_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' global_var)*
  private static boolean global_var_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_var_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!global_var_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_var_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' global_var
  private static boolean global_var_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_var_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && global_var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_GOTO identifier ';'
  public static boolean goto_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "goto_statement")) return false;
    if (!nextTokenIs(b, T_GOTO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_GOTO);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, GOTO_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_GROUP expression T_BY expression
  public static boolean group_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_clause")) return false;
    if (!nextTokenIs(b, T_GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_GROUP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_BY);
    r = r && expression(b, l + 1);
    exit_section_(b, m, GROUP_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // T_INLINE_HTML? T_OPEN_TAG top_statement_list?
  static boolean hackFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hackFile")) return false;
    if (!nextTokenIs(b, "", T_INLINE_HTML, T_OPEN_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hackFile_0(b, l + 1);
    r = r && consumeToken(b, T_OPEN_TAG);
    r = r && hackFile_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_INLINE_HTML?
  private static boolean hackFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hackFile_0")) return false;
    consumeToken(b, T_INLINE_HTML);
    return true;
  }

  // top_statement_list?
  private static boolean hackFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hackFile_2")) return false;
    top_statement_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_HALT_COMPILER '(' ')' ';'
  public static boolean halt_compiler_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "halt_compiler_statement")) return false;
    if (!nextTokenIs(b, T_HALT_COMPILER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_HALT_COMPILER);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, HALT_COMPILER_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_START_HEREDOC encaps_list T_END_HEREDOC
  public static boolean here_doc_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "here_doc_string")) return false;
    if (!nextTokenIs(b, T_START_HEREDOC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_START_HEREDOC);
    r = r && encaps_list(b, l + 1);
    r = r && consumeToken(b, T_END_HEREDOC);
    exit_section_(b, m, HERE_DOC_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // T_CLOSE_TAG T_INLINE_HTML? T_OPEN_TAG?
  public static boolean html_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "html_statement")) return false;
    if (!nextTokenIs(b, T_CLOSE_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CLOSE_TAG);
    r = r && html_statement_1(b, l + 1);
    r = r && html_statement_2(b, l + 1);
    exit_section_(b, m, HTML_STATEMENT, r);
    return r;
  }

  // T_INLINE_HTML?
  private static boolean html_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "html_statement_1")) return false;
    consumeToken(b, T_INLINE_HTML);
    return true;
  }

  // T_OPEN_TAG?
  private static boolean html_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "html_statement_2")) return false;
    consumeToken(b, T_OPEN_TAG);
    return true;
  }

  /* ********************************************************** */
  // T_STRING
  //         | T_XHP_ATTRIBUTE
  //         | T_XHP_CATEGORY
  //         | T_XHP_CHILDREN
  //         | T_XHP_REQUIRED
  //         | T_ENUM
  //         | T_WHERE
  //         | T_JOIN
  //         | T_ON
  //         | T_IN
  //         | T_EQUALS
  //         | T_INTO
  //         | T_LET
  //         | T_ORDERBY
  //         | T_ASCENDING
  //         | T_DESCENDING
  //         | T_SELECT
  //         | T_GROUP
  //         | T_BY
  //         | T_TRUE
  //         | T_FALSE
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<identifier>");
    r = consumeToken(b, T_STRING);
    if (!r) r = consumeToken(b, T_XHP_ATTRIBUTE);
    if (!r) r = consumeToken(b, T_XHP_CATEGORY);
    if (!r) r = consumeToken(b, T_XHP_CHILDREN);
    if (!r) r = consumeToken(b, T_XHP_REQUIRED);
    if (!r) r = consumeToken(b, T_ENUM);
    if (!r) r = consumeToken(b, T_WHERE);
    if (!r) r = consumeToken(b, T_JOIN);
    if (!r) r = consumeToken(b, T_ON);
    if (!r) r = consumeToken(b, T_IN);
    if (!r) r = consumeToken(b, T_EQUALS);
    if (!r) r = consumeToken(b, T_INTO);
    if (!r) r = consumeToken(b, T_LET);
    if (!r) r = consumeToken(b, T_ORDERBY);
    if (!r) r = consumeToken(b, T_ASCENDING);
    if (!r) r = consumeToken(b, T_DESCENDING);
    if (!r) r = consumeToken(b, T_SELECT);
    if (!r) r = consumeToken(b, T_GROUP);
    if (!r) r = consumeToken(b, T_BY);
    if (!r) r = consumeToken(b, T_TRUE);
    if (!r) r = consumeToken(b, T_FALSE);
    exit_section_(b, l, m, IDENTIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs
  public static boolean identifier_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<identifier type>");
    r = class_namespace_string_typeargs(b, l + 1);
    exit_section_(b, l, m, IDENTIFIER_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // new_if_statement |  normal_if_statement
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, T_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = new_if_statement(b, l + 1);
    if (!r) r = normal_if_statement(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // T_IMPLEMENTS interface_list
  public static boolean implements_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_list")) return false;
    if (!nextTokenIs(b, T_IMPLEMENTS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_IMPLEMENTS);
    p = r; // pin = 1
    r = r && interface_list(b, l + 1);
    exit_section_(b, l, m, IMPLEMENTS_LIST, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (T_INCLUDE|T_INCLUDE_ONCE) expression
  public static boolean include_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_expression")) return false;
    if (!nextTokenIs(b, "<include expression>", T_INCLUDE, T_INCLUDE_ONCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<include expression>");
    r = include_expression_0(b, l + 1);
    p = r; // pin = 1
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, INCLUDE_EXPRESSION, r, p, null);
    return r || p;
  }

  // T_INCLUDE|T_INCLUDE_ONCE
  private static boolean include_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_INCLUDE);
    if (!r) r = consumeToken(b, T_INCLUDE_ONCE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement
  //                     | function_declaration_statement
  //                     | classes_wrapper
  //                     | interface_declaration_statement
  //                     | trait_declaration_statement
  static boolean inner_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    if (!r) r = function_declaration_statement(b, l + 1);
    if (!r) r = classes_wrapper(b, l + 1);
    if (!r) r = interface_declaration_statement(b, l + 1);
    if (!r) r = trait_declaration_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // inner_statement*
  public static boolean inner_statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_statement_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<inner statement list>");
    int c = current_position_(b);
    while (true) {
      if (!inner_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inner_statement_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, INNER_STATEMENT_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // T_INSTANCEOF class_name_reference
  public static boolean instanceof_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instanceof_expression")) return false;
    if (!nextTokenIs(b, T_INSTANCEOF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_INSTANCEOF);
    p = r; // pin = 1
    r = r && class_name_reference(b, l + 1);
    exit_section_(b, l, m, INSTANCEOF_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // cast_expression_wrapper instanceof_expression*
  static boolean instanceof_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instanceof_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cast_expression_wrapper(b, l + 1);
    r = r && instanceof_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // instanceof_expression*
  private static boolean instanceof_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instanceof_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!instanceof_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "instanceof_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // user_attributes? T_INTERFACE name_holder typevar?  interface_extends_list? class_statement_block
  public static boolean interface_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_statement")) return false;
    if (!nextTokenIs(b, "<interface declaration statement>", T_INTERFACE, T_SL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<interface declaration statement>");
    r = interface_declaration_statement_0(b, l + 1);
    r = r && consumeToken(b, T_INTERFACE);
    p = r; // pin = 2
    r = r && report_error_(b, name_holder(b, l + 1));
    r = p && report_error_(b, interface_declaration_statement_3(b, l + 1)) && r;
    r = p && report_error_(b, interface_declaration_statement_4(b, l + 1)) && r;
    r = p && class_statement_block(b, l + 1) && r;
    exit_section_(b, l, m, INTERFACE_DECLARATION_STATEMENT, r, p, null);
    return r || p;
  }

  // user_attributes?
  private static boolean interface_declaration_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_statement_0")) return false;
    user_attributes(b, l + 1);
    return true;
  }

  // typevar?
  private static boolean interface_declaration_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_statement_3")) return false;
    typevar(b, l + 1);
    return true;
  }

  // interface_extends_list?
  private static boolean interface_declaration_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_statement_4")) return false;
    interface_extends_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_EXTENDS interface_list
  public static boolean interface_extends_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_extends_list")) return false;
    if (!nextTokenIs(b, T_EXTENDS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_EXTENDS);
    p = r; // pin = 1
    r = r && interface_list(b, l + 1);
    exit_section_(b, l, m, INTERFACE_EXTENDS_LIST, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (fully_qualified_class_name (',' fully_qualified_class_name)*)?
  public static boolean interface_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<interface list>");
    interface_list_0(b, l + 1);
    exit_section_(b, l, m, INTERFACE_LIST, true, false, null);
    return true;
  }

  // fully_qualified_class_name (',' fully_qualified_class_name)*
  private static boolean interface_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fully_qualified_class_name(b, l + 1);
    r = r && interface_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' fully_qualified_class_name)*
  private static boolean interface_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interface_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' fully_qualified_class_name
  private static boolean interface_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && fully_qualified_class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // isset_expression
  //                                 | empty_expression
  //                                 | include_expression
  //                                 | eval_expression
  //                                 | require_expression
  //                                 | tuple_expression
  //                                 | exit_expression
  //                                 | print_expression
  static boolean internal_functions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "internal_functions")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = isset_expression(b, l + 1);
    if (!r) r = empty_expression(b, l + 1);
    if (!r) r = include_expression(b, l + 1);
    if (!r) r = eval_expression(b, l + 1);
    if (!r) r = require_expression(b, l + 1);
    if (!r) r = tuple_expression(b, l + 1);
    if (!r) r = exit_expression(b, l + 1);
    if (!r) r = print_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_ISSET '(' variable_list ')'
  public static boolean isset_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isset_expression")) return false;
    if (!nextTokenIs(b, T_ISSET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ISSET);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, variable_list(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, ISSET_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_JOIN T_VARIABLE T_IN expression T_ON expression T_EQUALS expression
  public static boolean join_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_clause")) return false;
    if (!nextTokenIs(b, T_JOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_JOIN, T_VARIABLE, T_IN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_ON);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, JOIN_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // T_JOIN T_VARIABLE T_IN expression T_ON expression T_EQUALS expression T_INTO T_VARIABLE
  public static boolean join_into_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_into_clause")) return false;
    if (!nextTokenIs(b, T_JOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_JOIN, T_VARIABLE, T_IN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_ON);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_EQUALS);
    r = r && expression(b, l + 1);
    r = r && consumeTokens(b, 0, T_INTO, T_VARIABLE);
    exit_section_(b, m, JOIN_INTO_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // name_holder ':'
  public static boolean label_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<label statement>");
    r = name_holder(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    exit_section_(b, l, m, LABEL_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_LAMBDA_ARROW (expression | await_expression | (block_statement))
  public static boolean lambda_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_body")) return false;
    if (!nextTokenIs(b, T_LAMBDA_ARROW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LAMBDA_ARROW);
    p = r; // pin = 1
    r = r && lambda_body_1(b, l + 1);
    exit_section_(b, l, m, LAMBDA_BODY, r, p, null);
    return r || p;
  }

  // expression | await_expression | (block_statement)
  private static boolean lambda_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    if (!r) r = await_expression(b, l + 1);
    if (!r) r = lambda_body_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (block_statement)
  private static boolean lambda_body_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_body_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lambda_function
  public static boolean lambda_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lambda expression>");
    r = lambda_function(b, l + 1);
    exit_section_(b, l, m, LAMBDA_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_ASYNC? ((T_LAMBDA_OP  parameter_list T_LAMBDA_CP opt_return_type?)|parameter_list) lambda_body
  public static boolean lambda_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_function")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lambda function>");
    r = lambda_function_0(b, l + 1);
    r = r && lambda_function_1(b, l + 1);
    r = r && lambda_body(b, l + 1);
    exit_section_(b, l, m, LAMBDA_FUNCTION, r, false, null);
    return r;
  }

  // T_ASYNC?
  private static boolean lambda_function_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_function_0")) return false;
    consumeToken(b, T_ASYNC);
    return true;
  }

  // (T_LAMBDA_OP  parameter_list T_LAMBDA_CP opt_return_type?)|parameter_list
  private static boolean lambda_function_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_function_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lambda_function_1_0(b, l + 1);
    if (!r) r = parameter_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_LAMBDA_OP  parameter_list T_LAMBDA_CP opt_return_type?
  private static boolean lambda_function_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_function_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LAMBDA_OP);
    r = r && parameter_list(b, l + 1);
    r = r && consumeToken(b, T_LAMBDA_CP);
    r = r && lambda_function_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // opt_return_type?
  private static boolean lambda_function_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_function_1_0_3")) return false;
    opt_return_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_USE '(' lexical_var_list ')'
  public static boolean lambda_use_vars(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_use_vars")) return false;
    if (!nextTokenIs(b, T_USE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_USE);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, lexical_var_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, LAMBDA_USE_VARS, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_LET T_VARIABLE '=' expression
  public static boolean let_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_clause")) return false;
    if (!nextTokenIs(b, T_LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_LET, T_VARIABLE);
    r = r && consumeToken(b, T_EQUAL);
    r = r && expression(b, l + 1);
    exit_section_(b, m, LET_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // ('&'? T_VARIABLE (',' '&'? T_VARIABLE)* ','?)?
  public static boolean lexical_var_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexical_var_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<lexical var list>");
    lexical_var_list_0(b, l + 1);
    exit_section_(b, l, m, LEXICAL_VAR_LIST, true, false, null);
    return true;
  }

  // '&'? T_VARIABLE (',' '&'? T_VARIABLE)* ','?
  private static boolean lexical_var_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexical_var_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lexical_var_list_0_0(b, l + 1);
    r = r && consumeToken(b, T_VARIABLE);
    r = r && lexical_var_list_0_2(b, l + 1);
    r = r && lexical_var_list_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&'?
  private static boolean lexical_var_list_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexical_var_list_0_0")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  // (',' '&'? T_VARIABLE)*
  private static boolean lexical_var_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexical_var_list_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!lexical_var_list_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lexical_var_list_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' '&'? T_VARIABLE
  private static boolean lexical_var_list_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexical_var_list_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && lexical_var_list_0_2_0_1(b, l + 1);
    r = r && consumeToken(b, T_VARIABLE);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&'?
  private static boolean lexical_var_list_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexical_var_list_0_2_0_1")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  // ','?
  private static boolean lexical_var_list_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexical_var_list_0_3")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // list_assignment_variables '=' expression
  public static boolean list_assignment_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_assignment_expression")) return false;
    if (!nextTokenIs(b, T_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = list_assignment_variables(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_EQUAL));
    r = p && expression(b, l + 1) && r;
    exit_section_(b, l, m, LIST_ASSIGNMENT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_LIST '(' assignment_list ')'
  public static boolean list_assignment_variables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_assignment_variables")) return false;
    if (!nextTokenIs(b, T_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LIST);
    r = r && consumeToken(b, T_LPAREN);
    r = r && assignment_list(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, LIST_ASSIGNMENT_VARIABLES, r);
    return r;
  }

  /* ********************************************************** */
  // T_LNUMBER
  //                 | T_DNUMBER
  //                 | T_ONUMBER
  //                 | T_CONSTANT_ENCAPSED_STRING
  //                 | T_LINE
  //                 | T_FILE
  //                 | T_DIR
  //                 | T_CLASS_C
  //                 | T_TRAIT_C
  //                 | T_METHOD_C
  //                 | T_FUNC_C
  //                 | T_NS_C
  //                 | T_COMPILER_HALT_OFFSET
  //                 | T_START_HEREDOC T_ENCAPSED_AND_WHITESPACE T_END_HEREDOC
  //                 | T_START_HEREDOC T_END_HEREDOC
  public static boolean literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal expression>");
    r = consumeToken(b, T_LNUMBER);
    if (!r) r = consumeToken(b, T_DNUMBER);
    if (!r) r = consumeToken(b, T_ONUMBER);
    if (!r) r = consumeToken(b, T_CONSTANT_ENCAPSED_STRING);
    if (!r) r = consumeToken(b, T_LINE);
    if (!r) r = consumeToken(b, T_FILE);
    if (!r) r = consumeToken(b, T_DIR);
    if (!r) r = consumeToken(b, T_CLASS_C);
    if (!r) r = consumeToken(b, T_TRAIT_C);
    if (!r) r = consumeToken(b, T_METHOD_C);
    if (!r) r = consumeToken(b, T_FUNC_C);
    if (!r) r = consumeToken(b, T_NS_C);
    if (!r) r = consumeToken(b, T_COMPILER_HALT_OFFSET);
    if (!r) r = parseTokens(b, 0, T_START_HEREDOC, T_ENCAPSED_AND_WHITESPACE, T_END_HEREDOC);
    if (!r) r = parseTokens(b, 0, T_START_HEREDOC, T_END_HEREDOC);
    exit_section_(b, l, m, LITERAL_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_LNUMBER
  // | T_DNUMBER
  // | T_ONUMBER
  // | T_CONSTANT_ENCAPSED_STRING
  // | T_START_HEREDOC T_ENCAPSED_AND_WHITESPACE T_END_HEREDOC
  // | T_START_HEREDOC T_END_HEREDOC
  public static boolean literal_scalar_ae(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_scalar_ae")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal scalar ae>");
    r = consumeToken(b, T_LNUMBER);
    if (!r) r = consumeToken(b, T_DNUMBER);
    if (!r) r = consumeToken(b, T_ONUMBER);
    if (!r) r = consumeToken(b, T_CONSTANT_ENCAPSED_STRING);
    if (!r) r = parseTokens(b, 0, T_START_HEREDOC, T_ENCAPSED_AND_WHITESPACE, T_END_HEREDOC);
    if (!r) r = parseTokens(b, 0, T_START_HEREDOC, T_END_HEREDOC);
    exit_section_(b, l, m, LITERAL_SCALAR_AE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // logical_operator comparative_expression_wrapper
  public static boolean logical_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<logical expression>");
    r = logical_operator(b, l + 1);
    p = r; // pin = 1
    r = r && comparative_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, LOGICAL_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // comparative_expression_wrapper logical_expression*
  static boolean logical_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparative_expression_wrapper(b, l + 1);
    r = r && logical_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // logical_expression*
  private static boolean logical_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!logical_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_BOOLEAN_OR | T_BOOLEAN_AND | T_LOGICAL_OR | T_LOGICAL_AND | T_LOGICAL_XOR
  public static boolean logical_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<logical operator>");
    r = consumeToken(b, T_BOOLEAN_OR);
    if (!r) r = consumeToken(b, T_BOOLEAN_AND);
    if (!r) r = consumeToken(b, T_LOGICAL_OR);
    if (!r) r = consumeToken(b, T_LOGICAL_AND);
    if (!r) r = consumeToken(b, T_LOGICAL_XOR);
    exit_section_(b, l, m, LOGICAL_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (T_MIARRAY|T_MSARRAY) '(' array_pair_list ')'
  public static boolean map_array_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_array_literal_expression")) return false;
    if (!nextTokenIs(b, "<map array literal expression>", T_MIARRAY, T_MSARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<map array literal expression>");
    r = map_array_literal_expression_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, array_pair_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, MAP_ARRAY_LITERAL_EXPRESSION, r, p, null);
    return r || p;
  }

  // T_MIARRAY|T_MSARRAY
  private static boolean map_array_literal_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_array_literal_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_MIARRAY);
    if (!r) r = consumeToken(b, T_MSARRAY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_PUBLIC
  //                     | T_PROTECTED
  //                     | T_PRIVATE
  //                     | T_STATIC
  //                     | T_ABSTRACT
  //                     | T_FINAL
  //                     | T_ASYNC
  public static boolean member_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<member modifier>");
    r = consumeToken(b, T_PUBLIC);
    if (!r) r = consumeToken(b, T_PROTECTED);
    if (!r) r = consumeToken(b, T_PRIVATE);
    if (!r) r = consumeToken(b, T_STATIC);
    if (!r) r = consumeToken(b, T_ABSTRACT);
    if (!r) r = consumeToken(b, T_FINAL);
    if (!r) r = consumeToken(b, T_ASYNC);
    exit_section_(b, l, m, MEMBER_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_OBJECT_OPERATOR property_access
  public static boolean member_only_access_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_only_access_expression")) return false;
    if (!nextTokenIs(b, T_OBJECT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_OBJECT_OPERATOR);
    r = r && property_access(b, l + 1);
    exit_section_(b, l, m, MEMBER_ONLY_ACCESS_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_OBJECT_OPERATOR property_access
  public static boolean member_variable_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_variable_expression")) return false;
    if (!nextTokenIs(b, T_OBJECT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_OBJECT_OPERATOR);
    r = r && property_access(b, l + 1);
    exit_section_(b, l, m, MEMBER_VARIABLE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (especial_parenthesised_expression|possible_variable) (method_call_expression|member_variable_expression)*
  static boolean member_variable_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_variable_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_variable_wrapper_0(b, l + 1);
    r = r && member_variable_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // especial_parenthesised_expression|possible_variable
  private static boolean member_variable_wrapper_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_variable_wrapper_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = especial_parenthesised_expression(b, l + 1);
    if (!r) r = possible_variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (method_call_expression|member_variable_expression)*
  private static boolean member_variable_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_variable_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member_variable_wrapper_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_variable_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // method_call_expression|member_variable_expression
  private static boolean member_variable_wrapper_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_variable_wrapper_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_call_expression(b, l + 1);
    if (!r) r = member_variable_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_OBJECT_OPERATOR ((identifier typeargs?)|variable_expression|variable_expression_variable)
  //                                                                                    '(' function_call_parameter_list ')'
  public static boolean method_call_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call_expression")) return false;
    if (!nextTokenIs(b, T_OBJECT_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_OBJECT_OPERATOR);
    r = r && method_call_expression_1(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 3
    r = r && report_error_(b, function_call_parameter_list(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, METHOD_CALL_EXPRESSION, r, p, null);
    return r || p;
  }

  // (identifier typeargs?)|variable_expression|variable_expression_variable
  private static boolean method_call_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_call_expression_1_0(b, l + 1);
    if (!r) r = variable_expression(b, l + 1);
    if (!r) r = variable_expression_variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier typeargs?
  private static boolean method_call_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && method_call_expression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeargs?
  private static boolean method_call_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call_expression_1_0_1")) return false;
    typeargs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // function_declaration
  public static boolean method_function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_function_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<method function declaration>");
    r = function_declaration(b, l + 1);
    exit_section_(b, l, m, METHOD_FUNCTION_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // member_modifier+
  public static boolean method_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<method modifiers>");
    r = member_modifier(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!member_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, METHOD_MODIFIERS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // multiplicative_operator instanceof_expression_wrapper
  public static boolean multiplicative_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<multiplicative expression>");
    r = multiplicative_operator(b, l + 1);
    p = r; // pin = 1
    r = r && instanceof_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, MULTIPLICATIVE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // instanceof_expression_wrapper multiplicative_expression*
  static boolean multiplicative_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instanceof_expression_wrapper(b, l + 1);
    r = r && multiplicative_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // multiplicative_expression*
  private static boolean multiplicative_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!multiplicative_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicative_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '*' | '/' | '%' | T_POW
  public static boolean multiplicative_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<multiplicative operator>");
    r = consumeToken(b, T_MUL);
    if (!r) r = consumeToken(b, T_DIV);
    if (!r) r = consumeToken(b, T_MOD);
    if (!r) r = consumeToken(b, T_POW);
    exit_section_(b, l, m, MULTIPLICATIVE_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean name_holder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_holder")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<name holder>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, NAME_HOLDER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // types_group? name_holder
  static boolean name_with_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_with_type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_with_type_0(b, l + 1);
    r = r && name_holder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // types_group?
  private static boolean name_with_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_with_type_0")) return false;
    types_group(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simple_namespace_statement | block_namespace_statement
  public static boolean namespace_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration_statement")) return false;
    if (!nextTokenIs(b, T_NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_namespace_statement(b, l + 1);
    if (!r) r = block_namespace_statement(b, l + 1);
    exit_section_(b, m, NAMESPACE_DECLARATION_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // T_NS_SEPARATOR? identifier (T_NS_SEPARATOR identifier)*
  public static boolean namespace_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_name")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<namespace name>");
    r = namespace_name_0(b, l + 1);
    r = r && identifier(b, l + 1);
    p = r; // pin = 2
    r = r && namespace_name_2(b, l + 1);
    exit_section_(b, l, m, NAMESPACE_NAME, r, p, null);
    return r || p;
  }

  // T_NS_SEPARATOR?
  private static boolean namespace_name_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_name_0")) return false;
    consumeToken(b, T_NS_SEPARATOR);
    return true;
  }

  // (T_NS_SEPARATOR identifier)*
  private static boolean namespace_name_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_name_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!namespace_name_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_name_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // T_NS_SEPARATOR identifier
  private static boolean namespace_name_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_name_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NS_SEPARATOR);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_NS_SEPARATOR? name_holder (T_NS_SEPARATOR name_holder)*
  public static boolean namespace_name_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_name_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<namespace name declaration>");
    r = namespace_name_declaration_0(b, l + 1);
    r = r && name_holder(b, l + 1);
    r = r && namespace_name_declaration_2(b, l + 1);
    exit_section_(b, l, m, NAMESPACE_NAME_DECLARATION, r, false, null);
    return r;
  }

  // T_NS_SEPARATOR?
  private static boolean namespace_name_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_name_declaration_0")) return false;
    consumeToken(b, T_NS_SEPARATOR);
    return true;
  }

  // (T_NS_SEPARATOR name_holder)*
  private static boolean namespace_name_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_name_declaration_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!namespace_name_declaration_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_name_declaration_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // T_NS_SEPARATOR name_holder
  private static boolean namespace_name_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_name_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NS_SEPARATOR);
    r = r && name_holder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (T_NAMESPACE namespace_name) | namespace_name
  public static boolean namespace_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_string")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<namespace string>");
    r = namespace_string_0(b, l + 1);
    if (!r) r = namespace_name(b, l + 1);
    exit_section_(b, l, m, NAMESPACE_STRING, r, false, null);
    return r;
  }

  // T_NAMESPACE namespace_name
  private static boolean namespace_string_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_string_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NAMESPACE);
    r = r && namespace_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((T_NAMESPACE T_NS_SEPARATOR? namespace_name) | namespace_name) typeargs?
  public static boolean namespace_string_typeargs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_string_typeargs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<namespace string typeargs>");
    r = namespace_string_typeargs_0(b, l + 1);
    r = r && namespace_string_typeargs_1(b, l + 1);
    exit_section_(b, l, m, NAMESPACE_STRING_TYPEARGS, r, false, null);
    return r;
  }

  // (T_NAMESPACE T_NS_SEPARATOR? namespace_name) | namespace_name
  private static boolean namespace_string_typeargs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_string_typeargs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_string_typeargs_0_0(b, l + 1);
    if (!r) r = namespace_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_NAMESPACE T_NS_SEPARATOR? namespace_name
  private static boolean namespace_string_typeargs_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_string_typeargs_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NAMESPACE);
    r = r && namespace_string_typeargs_0_0_1(b, l + 1);
    r = r && namespace_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_NS_SEPARATOR?
  private static boolean namespace_string_typeargs_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_string_typeargs_0_0_1")) return false;
    consumeToken(b, T_NS_SEPARATOR);
    return true;
  }

  // typeargs?
  private static boolean namespace_string_typeargs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_string_typeargs_1")) return false;
    typeargs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_ELSE ':' inner_statement_list
  public static boolean new_else_single(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_else_single")) return false;
    if (!nextTokenIs(b, T_ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ELSE);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_COLON));
    r = p && inner_statement_list(b, l + 1) && r;
    exit_section_(b, l, m, NEW_ELSE_SINGLE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_ELSEIF parenthesized_expression ':' inner_statement_list
  public static boolean new_elseif_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_elseif_body")) return false;
    if (!nextTokenIs(b, T_ELSEIF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ELSEIF);
    p = r; // pin = 1
    r = r && report_error_(b, parenthesized_expression(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COLON)) && r;
    r = p && inner_statement_list(b, l + 1) && r;
    exit_section_(b, l, m, NEW_ELSEIF_BODY, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // new_elseif_body*
  public static boolean new_elseif_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_elseif_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<new elseif list>");
    int c = current_position_(b);
    while (true) {
      if (!new_elseif_body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "new_elseif_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, NEW_ELSEIF_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // T_NEW class_name_reference ctor_arguments
  public static boolean new_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_expression")) return false;
    if (!nextTokenIs(b, T_NEW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_NEW);
    p = r; // pin = 1
    r = r && report_error_(b, class_name_reference(b, l + 1));
    r = p && ctor_arguments(b, l + 1) && r;
    exit_section_(b, l, m, NEW_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_IF parenthesized_expression ':' inner_statement_list new_elseif_list new_else_single? T_ENDIF ';'
  static boolean new_if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_if_statement")) return false;
    if (!nextTokenIs(b, T_IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_IF);
    r = r && parenthesized_expression(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    p = r; // pin = 3
    r = r && report_error_(b, inner_statement_list(b, l + 1));
    r = p && report_error_(b, new_elseif_list(b, l + 1)) && r;
    r = p && report_error_(b, new_if_statement_5(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_ENDIF)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // new_else_single?
  private static boolean new_if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_if_statement_5")) return false;
    new_else_single(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_NEWTYPE name_holder typevar? (T_AS types_group)? '=' types_group ';'
  public static boolean new_type_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_type_declaration_statement")) return false;
    if (!nextTokenIs(b, T_NEWTYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_NEWTYPE);
    p = r; // pin = 1
    r = r && report_error_(b, name_holder(b, l + 1));
    r = p && report_error_(b, new_type_declaration_statement_2(b, l + 1)) && r;
    r = p && report_error_(b, new_type_declaration_statement_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_EQUAL)) && r;
    r = p && report_error_(b, types_group(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, NEW_TYPE_DECLARATION_STATEMENT, r, p, null);
    return r || p;
  }

  // typevar?
  private static boolean new_type_declaration_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_type_declaration_statement_2")) return false;
    typevar(b, l + 1);
    return true;
  }

  // (T_AS types_group)?
  private static boolean new_type_declaration_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_type_declaration_statement_3")) return false;
    new_type_declaration_statement_3_0(b, l + 1);
    return true;
  }

  // T_AS types_group
  private static boolean new_type_declaration_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_type_declaration_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && types_group(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_IF parenthesized_expression statement? elseif_list else_single?
  static boolean normal_if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "normal_if_statement")) return false;
    if (!nextTokenIs(b, T_IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_IF);
    p = r; // pin = 1
    r = r && report_error_(b, parenthesized_expression(b, l + 1));
    r = p && report_error_(b, normal_if_statement_2(b, l + 1)) && r;
    r = p && report_error_(b, elseif_list(b, l + 1)) && r;
    r = p && normal_if_statement_4(b, l + 1) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // statement?
  private static boolean normal_if_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "normal_if_statement_2")) return false;
    statement(b, l + 1);
    return true;
  }

  // else_single?
  private static boolean normal_if_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "normal_if_statement_4")) return false;
    else_single(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '?' types_group
  public static boolean nullable_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nullable_type")) return false;
    if (!nextTokenIs(b, T_QUEST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_QUEST);
    p = r; // pin = 1
    r = r && types_group(b, l + 1);
    exit_section_(b, l, m, NULLABLE_TYPE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // variable_no_calls_base member_only_access_expression*
  static boolean only_member_access_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "only_member_access_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_no_calls_base(b, l + 1);
    r = r && only_member_access_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // member_only_access_expression*
  private static boolean only_member_access_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "only_member_access_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member_only_access_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "only_member_access_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ':' types_group
  public static boolean opt_return_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opt_return_type")) return false;
    if (!nextTokenIs(b, T_COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_COLON);
    p = r; // pin = 1
    r = r && types_group(b, l + 1);
    exit_section_(b, l, m, OPT_RETURN_TYPE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // try_finally?
  static boolean optional_finally(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_finally")) return false;
    try_finally(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_ORDERBY orderings
  public static boolean orderby_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderby_clause")) return false;
    if (!nextTokenIs(b, T_ORDERBY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ORDERBY);
    r = r && orderings(b, l + 1);
    exit_section_(b, m, ORDERBY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // expression ordering_direction?
  public static boolean ordering(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ordering>");
    r = expression(b, l + 1);
    r = r && ordering_1(b, l + 1);
    exit_section_(b, l, m, ORDERING, r, false, null);
    return r;
  }

  // ordering_direction?
  private static boolean ordering_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering_1")) return false;
    ordering_direction(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_ASCENDING | T_DESCENDING
  public static boolean ordering_direction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering_direction")) return false;
    if (!nextTokenIs(b, "<ordering direction>", T_ASCENDING, T_DESCENDING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ordering direction>");
    r = consumeToken(b, T_ASCENDING);
    if (!r) r = consumeToken(b, T_DESCENDING);
    exit_section_(b, l, m, ORDERING_DIRECTION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ordering (',' ordering)*
  public static boolean orderings(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderings")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<orderings>");
    r = ordering(b, l + 1);
    r = r && orderings_1(b, l + 1);
    exit_section_(b, l, m, ORDERINGS, r, false, null);
    return r;
  }

  // (',' ordering)*
  private static boolean orderings_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderings_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!orderings_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "orderings_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ordering
  private static boolean orderings_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderings_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ordering(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // user_attributes? parameter_modifiers? types_group? ('&'|"...")? variable_name_holder ('=' static_expression)?
  public static boolean parameter_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter item>");
    r = parameter_item_0(b, l + 1);
    r = r && parameter_item_1(b, l + 1);
    r = r && parameter_item_2(b, l + 1);
    r = r && parameter_item_3(b, l + 1);
    r = r && variable_name_holder(b, l + 1);
    r = r && parameter_item_5(b, l + 1);
    exit_section_(b, l, m, PARAMETER_ITEM, r, false, null);
    return r;
  }

  // user_attributes?
  private static boolean parameter_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_item_0")) return false;
    user_attributes(b, l + 1);
    return true;
  }

  // parameter_modifiers?
  private static boolean parameter_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_item_1")) return false;
    parameter_modifiers(b, l + 1);
    return true;
  }

  // types_group?
  private static boolean parameter_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_item_2")) return false;
    types_group(b, l + 1);
    return true;
  }

  // ('&'|"...")?
  private static boolean parameter_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_item_3")) return false;
    parameter_item_3_0(b, l + 1);
    return true;
  }

  // '&'|"..."
  private static boolean parameter_item_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_item_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AND);
    if (!r) r = consumeToken(b, T_ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' static_expression)?
  private static boolean parameter_item_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_item_5")) return false;
    parameter_item_5_0(b, l + 1);
    return true;
  }

  // '=' static_expression
  private static boolean parameter_item_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_item_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQUAL);
    r = r && static_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (parameter_item (',' parameter_item)*  ','?)?
  public static boolean parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<parameter list>");
    parameter_list_0(b, l + 1);
    exit_section_(b, l, m, PARAMETER_LIST, true, false, null);
    return true;
  }

  // parameter_item (',' parameter_item)*  ','?
  private static boolean parameter_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_item(b, l + 1);
    r = r && parameter_list_0_1(b, l + 1);
    r = r && parameter_list_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' parameter_item)*
  private static boolean parameter_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!parameter_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameter_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' parameter_item
  private static boolean parameter_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && parameter_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean parameter_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_PUBLIC
  //                         | T_PROTECTED
  //                         | T_PRIVATE
  public static boolean parameter_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter modifier>");
    r = consumeToken(b, T_PUBLIC);
    if (!r) r = consumeToken(b, T_PROTECTED);
    if (!r) r = consumeToken(b, T_PRIVATE);
    exit_section_(b, l, m, PARAMETER_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // parameter_modifier+
  public static boolean parameter_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter modifiers>");
    r = parameter_modifier(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!parameter_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameter_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, PARAMETER_MODIFIERS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' expression ')'
  public static boolean parenthesized_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesized_expression")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, PARENTHESIZED_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '(' variable ')'
  static boolean parenthesized_variable_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesized_variable_expression")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && variable(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simple_function_call_expression
  //                                  | callable_function_call_expression
  //                                  | class_method_call_expression
  //                                  | dimmable_variable_access_expression
  //                                  | static_class_variable_expression
  //                                  | variable_expression
  //                                  | parenthesized_variable_expression
  static boolean possible_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "possible_variable")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_function_call_expression(b, l + 1);
    if (!r) r = callable_function_call_expression(b, l + 1);
    if (!r) r = class_method_call_expression(b, l + 1);
    if (!r) r = dimmable_variable_access_expression(b, l + 1);
    if (!r) r = static_class_variable_expression(b, l + 1);
    if (!r) r = variable_expression(b, l + 1);
    if (!r) r = parenthesized_variable_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // prefix_operator prefix_expression_wrapper
  static boolean prefix_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_expression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = prefix_operator(b, l + 1);
    p = r; // pin = 1
    r = r && prefix_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // prefix_expression  | primary_expression
  static boolean prefix_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefix_expression(b, l + 1);
    if (!r) r = primary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@' | '!' | '~' | '+' | '-' | T_INC | T_DEC
  public static boolean prefix_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<prefix operator>");
    r = consumeToken(b, T_SILENCE);
    if (!r) r = consumeToken(b, T_NEGATE);
    if (!r) r = consumeToken(b, T_NOT);
    if (!r) r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    if (!r) r = consumeToken(b, T_INC);
    if (!r) r = consumeToken(b, T_DEC);
    exit_section_(b, l, m, PREFIX_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // suffix_expression
  //                               | dim_expression
  //                               | lambda_expression
  //                               | expression_with_parens
  //                               | parenthesized_expression
  //                               | variable
  //                               | scalar_expression
  //                               | array_literal_expression
  //                               | shape_literal_expression
  //                               | map_array_literal_expression
  //                               | varray_literal_expression
  //                               | backticks_expression
  //                               | closure_expression
  //                               | internal_functions
  static boolean primary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = suffix_expression(b, l + 1);
    if (!r) r = dim_expression(b, l + 1);
    if (!r) r = lambda_expression(b, l + 1);
    if (!r) r = expression_with_parens(b, l + 1);
    if (!r) r = parenthesized_expression(b, l + 1);
    if (!r) r = variable(b, l + 1);
    if (!r) r = scalar_expression(b, l + 1);
    if (!r) r = array_literal_expression(b, l + 1);
    if (!r) r = shape_literal_expression(b, l + 1);
    if (!r) r = map_array_literal_expression(b, l + 1);
    if (!r) r = varray_literal_expression(b, l + 1);
    if (!r) r = backticks_expression(b, l + 1);
    if (!r) r = closure_expression(b, l + 1);
    if (!r) r = internal_functions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_PRINT expression
  public static boolean print_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "print_expression")) return false;
    if (!nextTokenIs(b, T_PRINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_PRINT);
    p = r; // pin = 1
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, PRINT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // property_access_without_variables | property_access_variable
  static boolean property_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_access")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_access_without_variables(b, l + 1);
    if (!r) r = property_access_variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable_expression
  static boolean property_access_variable(PsiBuilder b, int l) {
    return variable_expression(b, l + 1);
  }

  /* ********************************************************** */
  // identifier|'{' expression '}'
  static boolean property_access_without_variables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_access_without_variables")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    if (!r) r = property_access_without_variables_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' expression '}'
  private static boolean property_access_without_variables_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_access_without_variables_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // try_variable_name_first '=' query_expression
  public static boolean query_assign_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_assign_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query assign expression>");
    r = try_variable_name_first(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && query_expression(b, l + 1);
    exit_section_(b, l, m, QUERY_ASSIGN_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // query_body_clauses? select_or_group_clause query_continuation?
  public static boolean query_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query body>");
    r = query_body_0(b, l + 1);
    r = r && select_or_group_clause(b, l + 1);
    r = r && query_body_2(b, l + 1);
    exit_section_(b, l, m, QUERY_BODY, r, false, null);
    return r;
  }

  // query_body_clauses?
  private static boolean query_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_body_0")) return false;
    query_body_clauses(b, l + 1);
    return true;
  }

  // query_continuation?
  private static boolean query_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_body_2")) return false;
    query_continuation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // from_clause | let_clause | where_clause | join_clause | join_into_clause | orderby_clause
  public static boolean query_body_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_body_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query body clause>");
    r = from_clause(b, l + 1);
    if (!r) r = let_clause(b, l + 1);
    if (!r) r = where_clause(b, l + 1);
    if (!r) r = join_clause(b, l + 1);
    if (!r) r = join_into_clause(b, l + 1);
    if (!r) r = orderby_clause(b, l + 1);
    exit_section_(b, l, m, QUERY_BODY_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // query_body_clause+
  public static boolean query_body_clauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_body_clauses")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query body clauses>");
    r = query_body_clause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!query_body_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "query_body_clauses", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, QUERY_BODY_CLAUSES, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_INTO T_VARIABLE query_body
  public static boolean query_continuation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_continuation")) return false;
    if (!nextTokenIs(b, T_INTO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_INTO, T_VARIABLE);
    r = r && query_body(b, l + 1);
    exit_section_(b, m, QUERY_CONTINUATION, r);
    return r;
  }

  /* ********************************************************** */
  // query_head query_body
  public static boolean query_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_expression")) return false;
    if (!nextTokenIs(b, T_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query_head(b, l + 1);
    r = r && query_body(b, l + 1);
    exit_section_(b, m, QUERY_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // T_FROM T_VARIABLE T_IN expression
  public static boolean query_head(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_head")) return false;
    if (!nextTokenIs(b, T_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_FROM, T_VARIABLE, T_IN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, QUERY_HEAD, r);
    return r;
  }

  /* ********************************************************** */
  // '$'* compound_variable ((array_offset_access)|variable_expression_variable|compound_variable)*
  static boolean reference_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reference_variable")) return false;
    if (!nextTokenIs(b, "", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = reference_variable_0(b, l + 1);
    r = r && compound_variable(b, l + 1);
    r = r && reference_variable_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '$'*
  private static boolean reference_variable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reference_variable_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, T_DOLLAR_SIGN)) break;
      if (!empty_element_parsed_guard_(b, "reference_variable_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ((array_offset_access)|variable_expression_variable|compound_variable)*
  private static boolean reference_variable_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reference_variable_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!reference_variable_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "reference_variable_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (array_offset_access)|variable_expression_variable|compound_variable
  private static boolean reference_variable_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reference_variable_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = reference_variable_2_0_0(b, l + 1);
    if (!r) r = variable_expression_variable(b, l + 1);
    if (!r) r = compound_variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (array_offset_access)
  private static boolean reference_variable_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reference_variable_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_offset_access(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (T_REQUIRE|T_REQUIRE_ONCE) expression
  public static boolean require_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_expression")) return false;
    if (!nextTokenIs(b, "<require expression>", T_REQUIRE, T_REQUIRE_ONCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<require expression>");
    r = require_expression_0(b, l + 1);
    p = r; // pin = 1
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, REQUIRE_EXPRESSION, r, p, null);
    return r || p;
  }

  // T_REQUIRE|T_REQUIRE_ONCE
  private static boolean require_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_REQUIRE);
    if (!r) r = consumeToken(b, T_REQUIRE_ONCE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_RETURN  (expression|query_expression|await_expression)? ';'
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, T_RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_RETURN);
    p = r; // pin = 1
    r = r && report_error_(b, return_statement_1(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, RETURN_STATEMENT, r, p, null);
    return r || p;
  }

  // (expression|query_expression|await_expression)?
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    return_statement_1_0(b, l + 1);
    return true;
  }

  // expression|query_expression|await_expression
  private static boolean return_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    if (!r) r = query_expression(b, l + 1);
    if (!r) r = await_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_constant
  //             |  namespace_string
  //             | T_STRING_VARNAME
  //             | literal_expression
  //             | double_quotes_string
  //             | single_quotes_string
  //             | here_doc_string
  public static boolean scalar_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<scalar expression>");
    r = class_constant(b, l + 1);
    if (!r) r = namespace_string(b, l + 1);
    if (!r) r = consumeToken(b, T_STRING_VARNAME);
    if (!r) r = literal_expression(b, l + 1);
    if (!r) r = double_quotes_string(b, l + 1);
    if (!r) r = single_quotes_string(b, l + 1);
    if (!r) r = here_doc_string(b, l + 1);
    exit_section_(b, l, m, SCALAR_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_SELECT expression
  public static boolean select_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_clause")) return false;
    if (!nextTokenIs(b, T_SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SELECT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, SELECT_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // select_clause | group_clause
  public static boolean select_or_group_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_or_group_clause")) return false;
    if (!nextTokenIs(b, "<select or group clause>", T_GROUP, T_SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<select or group clause>");
    r = select_clause(b, l + 1);
    if (!r) r = group_clause(b, l + 1);
    exit_section_(b, l, m, SELECT_OR_GROUP_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ';'
  public static boolean semicolon_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semicolon_statement")) return false;
    if (!nextTokenIs(b, T_SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, SEMICOLON_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // T_CONSTANT_ENCAPSED_STRING | class_constant
  public static boolean shape_keyname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_keyname")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<shape keyname>");
    r = consumeToken(b, T_CONSTANT_ENCAPSED_STRING);
    if (!r) r = class_constant(b, l + 1);
    exit_section_(b, l, m, SHAPE_KEYNAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_SHAPE '(' shape_pair_list ')'
  public static boolean shape_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_literal_expression")) return false;
    if (!nextTokenIs(b, T_SHAPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_SHAPE);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, shape_pair_list(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, SHAPE_LITERAL_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (shape_member_type (',' shape_member_type)* ','?)?
  public static boolean shape_member_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_member_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<shape member list>");
    shape_member_list_0(b, l + 1);
    exit_section_(b, l, m, SHAPE_MEMBER_LIST, true, false, null);
    return true;
  }

  // shape_member_type (',' shape_member_type)* ','?
  private static boolean shape_member_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_member_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shape_member_type(b, l + 1);
    r = r && shape_member_list_0_1(b, l + 1);
    r = r && shape_member_list_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' shape_member_type)*
  private static boolean shape_member_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_member_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!shape_member_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shape_member_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' shape_member_type
  private static boolean shape_member_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_member_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && shape_member_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean shape_member_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_member_list_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // (T_CONSTANT_ENCAPSED_STRING T_DOUBLE_ARROW types_group)
  // | ( class_namespace_string_typeargs T_DOUBLE_COLON identifier T_DOUBLE_ARROW types_group)
  public static boolean shape_member_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_member_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<shape member type>");
    r = shape_member_type_0(b, l + 1);
    if (!r) r = shape_member_type_1(b, l + 1);
    exit_section_(b, l, m, SHAPE_MEMBER_TYPE, r, false, null);
    return r;
  }

  // T_CONSTANT_ENCAPSED_STRING T_DOUBLE_ARROW types_group
  private static boolean shape_member_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_member_type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_CONSTANT_ENCAPSED_STRING, T_DOUBLE_ARROW);
    r = r && types_group(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_namespace_string_typeargs T_DOUBLE_COLON identifier T_DOUBLE_ARROW types_group
  private static boolean shape_member_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_member_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_namespace_string_typeargs(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_ARROW);
    r = r && types_group(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // shape_keyname T_DOUBLE_ARROW expression
  public static boolean shape_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_pair")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<shape pair>");
    r = shape_keyname(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_ARROW);
    p = r; // pin = 2
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, SHAPE_PAIR, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (shape_pair (',' shape_pair)* ','?)?
  public static boolean shape_pair_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_pair_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<shape pair list>");
    shape_pair_list_0(b, l + 1);
    exit_section_(b, l, m, SHAPE_PAIR_LIST, true, false, null);
    return true;
  }

  // shape_pair (',' shape_pair)* ','?
  private static boolean shape_pair_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_pair_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shape_pair(b, l + 1);
    r = r && shape_pair_list_0_1(b, l + 1);
    r = r && shape_pair_list_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' shape_pair)*
  private static boolean shape_pair_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_pair_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!shape_pair_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shape_pair_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' shape_pair
  private static boolean shape_pair_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_pair_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && shape_pair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean shape_pair_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_pair_list_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // shape_keyname T_DOUBLE_ARROW static_expression
  public static boolean shape_pair_static(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_pair_static")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<shape pair static>");
    r = shape_keyname(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_ARROW);
    p = r; // pin = 2
    r = r && static_expression(b, l + 1);
    exit_section_(b, l, m, SHAPE_PAIR_STATIC, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_SHAPE '(' shape_member_list ')'
  public static boolean shape_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_type")) return false;
    if (!nextTokenIs(b, T_SHAPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_SHAPE);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, shape_member_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, SHAPE_TYPE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // shift_operator additive_or_concatenation_expression_wrapper
  public static boolean shift_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression")) return false;
    if (!nextTokenIs(b, "<shift expression>", T_SL, T_SR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<shift expression>");
    r = shift_operator(b, l + 1);
    p = r; // pin = 1
    r = r && additive_or_concatenation_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, SHIFT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // additive_or_concatenation_expression_wrapper shift_expression*
  static boolean shift_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additive_or_concatenation_expression_wrapper(b, l + 1);
    r = r && shift_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // shift_expression*
  private static boolean shift_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!shift_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shift_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_SL | T_SR
  public static boolean shift_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_operator")) return false;
    if (!nextTokenIs(b, "<shift operator>", T_SL, T_SR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<shift operator>");
    r = consumeToken(b, T_SL);
    if (!r) r = consumeToken(b, T_SR);
    exit_section_(b, l, m, SHIFT_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' array_pair_list ']'
  static boolean short_array_literal_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "short_array_literal_base")) return false;
    if (!nextTokenIs(b, T_LBRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, array_pair_list(b, l + 1));
    r = p && consumeToken(b, T_RBRACKET) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // namespace_string_typeargs '(' function_call_parameter_list ')'
  public static boolean simple_function_call_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_function_call_expression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<simple function call expression>");
    r = namespace_string_typeargs(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, function_call_parameter_list(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, SIMPLE_FUNCTION_CALL_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_NAMESPACE namespace_name_declaration ';'
  static boolean simple_namespace_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_namespace_statement")) return false;
    if (!nextTokenIs(b, T_NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NAMESPACE);
    r = r && namespace_name_declaration(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable_identifier
  public static boolean simple_variable_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_variable_name")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_identifier(b, l + 1);
    exit_section_(b, m, SIMPLE_VARIABLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "'" encaps_list "'"
  public static boolean single_quotes_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_quotes_string")) return false;
    if (!nextTokenIs(b, T_SINGLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SINGLE_QUOTE);
    r = r && encaps_list(b, l + 1);
    r = r && consumeToken(b, T_SINGLE_QUOTE);
    exit_section_(b, m, SINGLE_QUOTES_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // '@' types_group
  public static boolean soft_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "soft_type")) return false;
    if (!nextTokenIs(b, T_SILENCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_SILENCE);
    p = r; // pin = 1
    r = r && types_group(b, l + 1);
    exit_section_(b, l, m, SOFT_TYPE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // block_statement
  //                 | if_statement
  //                 | while_statement
  //                 | do_while_statement
  //                 | for_statement
  //                 | switch_statement
  //                 | break_statement
  //                 | continue_statement
  //                 | return_statement
  //                 | yield_statement
  //                 | global_statement
  //                 | echo_statement
  //                 | unset_statement
  //                 | semicolon_statement
  //                 | html_statement
  //                 | foreach_statement
  //                 | declare_statement
  //                 | try_statement
  //                 | throw_statement
  //                 | goto_statement
  //                 | expression_statement
  //                 | static_statement
  //                 | label_statement
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = do_while_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = switch_statement(b, l + 1);
    if (!r) r = break_statement(b, l + 1);
    if (!r) r = continue_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = yield_statement(b, l + 1);
    if (!r) r = global_statement(b, l + 1);
    if (!r) r = echo_statement(b, l + 1);
    if (!r) r = unset_statement(b, l + 1);
    if (!r) r = semicolon_statement(b, l + 1);
    if (!r) r = html_statement(b, l + 1);
    if (!r) r = foreach_statement(b, l + 1);
    if (!r) r = declare_statement(b, l + 1);
    if (!r) r = try_statement(b, l + 1);
    if (!r) r = throw_statement(b, l + 1);
    if (!r) r = goto_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    if (!r) r = static_statement(b, l + 1);
    if (!r) r = label_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(';')
  public static boolean statement_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, "<statement recover>");
    r = !statement_recover_0(b, l + 1);
    exit_section_(b, l, m, STATEMENT_RECOVER, r, false, null);
    return r;
  }

  // (';')
  private static boolean statement_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // additive_or_concatenation_operator static_multiplicative_expression_wrapper
  public static boolean static_additive_or_concatenation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_additive_or_concatenation_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<static additive or concatenation expression>");
    r = additive_or_concatenation_operator(b, l + 1);
    r = r && static_multiplicative_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, STATIC_ADDITIVE_OR_CONCATENATION_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // static_multiplicative_expression_wrapper static_additive_or_concatenation_expression*
  static boolean static_additive_or_concatenation_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_additive_or_concatenation_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_multiplicative_expression_wrapper(b, l + 1);
    r = r && static_additive_or_concatenation_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static_additive_or_concatenation_expression*
  private static boolean static_additive_or_concatenation_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_additive_or_concatenation_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_additive_or_concatenation_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_additive_or_concatenation_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (T_ARRAY '(' static_array_pair_list ')')  | ('[' static_array_pair_list ']')
  public static boolean static_array_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_expression")) return false;
    if (!nextTokenIs(b, "<static array expression>", T_LBRACKET, T_ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static array expression>");
    r = static_array_expression_0(b, l + 1);
    if (!r) r = static_array_expression_1(b, l + 1);
    exit_section_(b, l, m, STATIC_ARRAY_EXPRESSION, r, false, null);
    return r;
  }

  // T_ARRAY '(' static_array_pair_list ')'
  private static boolean static_array_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY);
    r = r && consumeToken(b, T_LPAREN);
    r = r && static_array_pair_list(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' static_array_pair_list ']'
  private static boolean static_array_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACKET);
    r = r && static_array_pair_list(b, l + 1);
    r = r && consumeToken(b, T_RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // static_expression (T_DOUBLE_ARROW static_expression)?
  public static boolean static_array_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static array item>");
    r = static_expression(b, l + 1);
    r = r && static_array_item_1(b, l + 1);
    exit_section_(b, l, m, STATIC_ARRAY_ITEM, r, false, null);
    return r;
  }

  // (T_DOUBLE_ARROW static_expression)?
  private static boolean static_array_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_item_1")) return false;
    static_array_item_1_0(b, l + 1);
    return true;
  }

  // T_DOUBLE_ARROW static_expression
  private static boolean static_array_item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_item_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOUBLE_ARROW);
    r = r && static_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // static_scalar_ae (T_DOUBLE_ARROW static_scalar_ae)?
  public static boolean static_array_item_ae(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_item_ae")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static array item ae>");
    r = static_scalar_ae(b, l + 1);
    r = r && static_array_item_ae_1(b, l + 1);
    exit_section_(b, l, m, STATIC_ARRAY_ITEM_AE, r, false, null);
    return r;
  }

  // (T_DOUBLE_ARROW static_scalar_ae)?
  private static boolean static_array_item_ae_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_item_ae_1")) return false;
    static_array_item_ae_1_0(b, l + 1);
    return true;
  }

  // T_DOUBLE_ARROW static_scalar_ae
  private static boolean static_array_item_ae_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_item_ae_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOUBLE_ARROW);
    r = r && static_scalar_ae(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (static_array_item (',' static_array_item)* ','? ','?)?
  public static boolean static_array_pair_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<static array pair list>");
    static_array_pair_list_0(b, l + 1);
    exit_section_(b, l, m, STATIC_ARRAY_PAIR_LIST, true, false, null);
    return true;
  }

  // static_array_item (',' static_array_item)* ','? ','?
  private static boolean static_array_pair_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_array_item(b, l + 1);
    r = r && static_array_pair_list_0_1(b, l + 1);
    r = r && static_array_pair_list_0_2(b, l + 1);
    r = r && static_array_pair_list_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' static_array_item)*
  private static boolean static_array_pair_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_array_pair_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_array_pair_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' static_array_item
  private static boolean static_array_pair_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && static_array_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean static_array_pair_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  // ','?
  private static boolean static_array_pair_list_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list_0_3")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // (static_array_item_ae (',' static_array_item_ae)* ','?)?
  public static boolean static_array_pair_list_ae(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list_ae")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<static array pair list ae>");
    static_array_pair_list_ae_0(b, l + 1);
    exit_section_(b, l, m, STATIC_ARRAY_PAIR_LIST_AE, true, false, null);
    return true;
  }

  // static_array_item_ae (',' static_array_item_ae)* ','?
  private static boolean static_array_pair_list_ae_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list_ae_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_array_item_ae(b, l + 1);
    r = r && static_array_pair_list_ae_0_1(b, l + 1);
    r = r && static_array_pair_list_ae_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' static_array_item_ae)*
  private static boolean static_array_pair_list_ae_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list_ae_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_array_pair_list_ae_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_array_pair_list_ae_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' static_array_item_ae
  private static boolean static_array_pair_list_ae_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list_ae_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && static_array_item_ae(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean static_array_pair_list_ae_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_array_pair_list_ae_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // variable_name_holder '=' static_expression
  public static boolean static_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_assignment")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = variable_name_holder(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    p = r; // pin = 2
    r = r && static_expression(b, l + 1);
    exit_section_(b, l, m, STATIC_ASSIGNMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // bitwise_operator static_shift_expression_wrapper
  public static boolean static_bitwise_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_bitwise_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<static bitwise expression>");
    r = bitwise_operator(b, l + 1);
    r = r && static_shift_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, STATIC_BITWISE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // static_shift_expression_wrapper static_bitwise_expression*
  static boolean static_bitwise_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_bitwise_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_shift_expression_wrapper(b, l + 1);
    r = r && static_bitwise_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static_bitwise_expression*
  private static boolean static_bitwise_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_bitwise_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_bitwise_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_bitwise_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs T_DOUBLE_COLON identifier
  // | xhp_identifier T_DOUBLE_COLON identifier
  // | class_namespace_string_typeargs T_DOUBLE_COLON T_CLASS
  public static boolean static_class_constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_class_constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static class constant>");
    r = static_class_constant_0(b, l + 1);
    if (!r) r = static_class_constant_1(b, l + 1);
    if (!r) r = static_class_constant_2(b, l + 1);
    exit_section_(b, l, m, STATIC_CLASS_CONSTANT, r, false, null);
    return r;
  }

  // class_namespace_string_typeargs T_DOUBLE_COLON identifier
  private static boolean static_class_constant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_class_constant_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_namespace_string_typeargs(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // xhp_identifier T_DOUBLE_COLON identifier
  private static boolean static_class_constant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_class_constant_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_identifier(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_namespace_string_typeargs T_DOUBLE_COLON T_CLASS
  private static boolean static_class_constant_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_class_constant_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_namespace_string_typeargs(b, l + 1);
    r = r && consumeTokens(b, 0, T_DOUBLE_COLON, T_CLASS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // fully_qualified_class_name
  //                     | T_STATIC
  //                     | reference_variable
  public static boolean static_class_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_class_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static class name>");
    r = fully_qualified_class_name(b, l + 1);
    if (!r) r = consumeToken(b, T_STATIC);
    if (!r) r = reference_variable(b, l + 1);
    exit_section_(b, l, m, STATIC_CLASS_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // static_class_name T_DOUBLE_COLON variable_expression
  public static boolean static_class_variable_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_class_variable_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static class variable expression>");
    r = static_class_name(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && variable_expression(b, l + 1);
    exit_section_(b, l, m, STATIC_CLASS_VARIABLE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // fully_qualified_class_name '{' static_array_pair_list '}'
  public static boolean static_collection_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_collection_literal")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<static collection literal>");
    r = fully_qualified_class_name(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    p = r; // pin = 2
    r = r && report_error_(b, static_array_pair_list(b, l + 1));
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, STATIC_COLLECTION_LITERAL, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // comparative_operator static_bitwise_expression_wrapper
  public static boolean static_comparative_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_comparative_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<static comparative expression>");
    r = comparative_operator(b, l + 1);
    r = r && static_bitwise_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, STATIC_COMPARATIVE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // static_bitwise_expression_wrapper static_comparative_expression*
  static boolean static_comparative_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_comparative_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_bitwise_expression_wrapper(b, l + 1);
    r = r && static_comparative_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static_comparative_expression*
  private static boolean static_comparative_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_comparative_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_comparative_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_comparative_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // static_ternary_expression_wrapper
  public static boolean static_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static expression>");
    r = static_ternary_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, STATIC_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // logical_operator static_comparative_expression_wrapper
  public static boolean static_logical_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_logical_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<static logical expression>");
    r = logical_operator(b, l + 1);
    r = r && static_comparative_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, STATIC_LOGICAL_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // static_comparative_expression_wrapper static_logical_expression*
  static boolean static_logical_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_logical_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_comparative_expression_wrapper(b, l + 1);
    r = r && static_logical_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static_logical_expression*
  private static boolean static_logical_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_logical_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_logical_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_logical_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (T_MIARRAY|T_MSARRAY) '(' static_array_pair_list ')'
  public static boolean static_map_array_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_map_array_literal")) return false;
    if (!nextTokenIs(b, "<static map array literal>", T_MIARRAY, T_MSARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<static map array literal>");
    r = static_map_array_literal_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, static_array_pair_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, STATIC_MAP_ARRAY_LITERAL, r, p, null);
    return r || p;
  }

  // T_MIARRAY|T_MSARRAY
  private static boolean static_map_array_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_map_array_literal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_MIARRAY);
    if (!r) r = consumeToken(b, T_MSARRAY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // multiplicative_operator static_prefix_expression
  public static boolean static_multiplicative_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_multiplicative_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<static multiplicative expression>");
    r = multiplicative_operator(b, l + 1);
    r = r && static_prefix_expression(b, l + 1);
    exit_section_(b, l, m, STATIC_MULTIPLICATIVE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // static_prefix_expression static_multiplicative_expression*
  static boolean static_multiplicative_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_multiplicative_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_prefix_expression(b, l + 1);
    r = r && static_multiplicative_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static_multiplicative_expression*
  private static boolean static_multiplicative_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_multiplicative_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_multiplicative_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_multiplicative_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ('+'|'-')?( T_LNUMBER
  // | T_DNUMBER
  // | T_ONUMBER
  // | identifier
  // )
  public static boolean static_numeric_scalar_ae(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_numeric_scalar_ae")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static numeric scalar ae>");
    r = static_numeric_scalar_ae_0(b, l + 1);
    r = r && static_numeric_scalar_ae_1(b, l + 1);
    exit_section_(b, l, m, STATIC_NUMERIC_SCALAR_AE, r, false, null);
    return r;
  }

  // ('+'|'-')?
  private static boolean static_numeric_scalar_ae_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_numeric_scalar_ae_0")) return false;
    static_numeric_scalar_ae_0_0(b, l + 1);
    return true;
  }

  // '+'|'-'
  private static boolean static_numeric_scalar_ae_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_numeric_scalar_ae_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_LNUMBER
  // | T_DNUMBER
  // | T_ONUMBER
  // | identifier
  private static boolean static_numeric_scalar_ae_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_numeric_scalar_ae_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LNUMBER);
    if (!r) r = consumeToken(b, T_DNUMBER);
    if (!r) r = consumeToken(b, T_ONUMBER);
    if (!r) r = identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' static_expression ')'
  public static boolean static_parenthesized_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_parenthesized_expression")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, static_expression(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, STATIC_PARENTHESIZED_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (static_prefix_operator static_prefix_expression) | static_primary_expression
  public static boolean static_prefix_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_prefix_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static prefix expression>");
    r = static_prefix_expression_0(b, l + 1);
    if (!r) r = static_primary_expression(b, l + 1);
    exit_section_(b, l, m, STATIC_PREFIX_EXPRESSION, r, false, null);
    return r;
  }

  // static_prefix_operator static_prefix_expression
  private static boolean static_prefix_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_prefix_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_prefix_operator(b, l + 1);
    r = r && static_prefix_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '!' | '~' | '+' | '-'
  public static boolean static_prefix_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_prefix_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static prefix operator>");
    r = consumeToken(b, T_NEGATE);
    if (!r) r = consumeToken(b, T_NOT);
    if (!r) r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    exit_section_(b, l, m, STATIC_PREFIX_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // literal_expression
  //                     | namespace_string
  //                     | static_array_expression
  //                     | static_shape_expression
  //                     | static_class_constant
  //                     | static_collection_literal
  //                     | static_map_array_literal
  //                     | static_varray_literal
  //                     | static_parenthesized_expression
  static boolean static_primary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_primary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal_expression(b, l + 1);
    if (!r) r = namespace_string(b, l + 1);
    if (!r) r = static_array_expression(b, l + 1);
    if (!r) r = static_shape_expression(b, l + 1);
    if (!r) r = static_class_constant(b, l + 1);
    if (!r) r = static_collection_literal(b, l + 1);
    if (!r) r = static_map_array_literal(b, l + 1);
    if (!r) r = static_varray_literal(b, l + 1);
    if (!r) r = static_parenthesized_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // literal_scalar_ae
  // | identifier
  // | static_numeric_scalar_ae
  // | T_ARRAY '(' static_array_pair_list_ae ')'
  // | '[' static_array_pair_list_ae ']'
  // | T_SHAPE '(' static_shape_pair_list_ae ')'
  public static boolean static_scalar_ae(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_scalar_ae")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static scalar ae>");
    r = literal_scalar_ae(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    if (!r) r = static_numeric_scalar_ae(b, l + 1);
    if (!r) r = static_scalar_ae_3(b, l + 1);
    if (!r) r = static_scalar_ae_4(b, l + 1);
    if (!r) r = static_scalar_ae_5(b, l + 1);
    exit_section_(b, l, m, STATIC_SCALAR_AE, r, false, null);
    return r;
  }

  // T_ARRAY '(' static_array_pair_list_ae ')'
  private static boolean static_scalar_ae_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_scalar_ae_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY);
    r = r && consumeToken(b, T_LPAREN);
    r = r && static_array_pair_list_ae(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' static_array_pair_list_ae ']'
  private static boolean static_scalar_ae_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_scalar_ae_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACKET);
    r = r && static_array_pair_list_ae(b, l + 1);
    r = r && consumeToken(b, T_RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_SHAPE '(' static_shape_pair_list_ae ')'
  private static boolean static_scalar_ae_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_scalar_ae_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SHAPE);
    r = r && consumeToken(b, T_LPAREN);
    r = r && static_shape_pair_list_ae(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (static_scalar_ae (',' static_scalar_ae)* ','?)?
  public static boolean static_scalar_list_ae(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_scalar_list_ae")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<static scalar list ae>");
    static_scalar_list_ae_0(b, l + 1);
    exit_section_(b, l, m, STATIC_SCALAR_LIST_AE, true, false, null);
    return true;
  }

  // static_scalar_ae (',' static_scalar_ae)* ','?
  private static boolean static_scalar_list_ae_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_scalar_list_ae_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_scalar_ae(b, l + 1);
    r = r && static_scalar_list_ae_0_1(b, l + 1);
    r = r && static_scalar_list_ae_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' static_scalar_ae)*
  private static boolean static_scalar_list_ae_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_scalar_list_ae_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_scalar_list_ae_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_scalar_list_ae_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' static_scalar_ae
  private static boolean static_scalar_list_ae_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_scalar_list_ae_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && static_scalar_ae(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean static_scalar_list_ae_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_scalar_list_ae_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_SHAPE '(' static_shape_pair_list ')'
  public static boolean static_shape_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_expression")) return false;
    if (!nextTokenIs(b, T_SHAPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_SHAPE);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, static_shape_pair_list(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, STATIC_SHAPE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // shape_keyname T_DOUBLE_ARROW static_scalar_ae
  public static boolean static_shape_pair_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static shape pair item>");
    r = shape_keyname(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_ARROW);
    r = r && static_scalar_ae(b, l + 1);
    exit_section_(b, l, m, STATIC_SHAPE_PAIR_ITEM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (shape_pair_static (',' shape_pair_static)* ','?)?
  public static boolean static_shape_pair_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<static shape pair list>");
    static_shape_pair_list_0(b, l + 1);
    exit_section_(b, l, m, STATIC_SHAPE_PAIR_LIST, true, false, null);
    return true;
  }

  // shape_pair_static (',' shape_pair_static)* ','?
  private static boolean static_shape_pair_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shape_pair_static(b, l + 1);
    r = r && static_shape_pair_list_0_1(b, l + 1);
    r = r && static_shape_pair_list_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' shape_pair_static)*
  private static boolean static_shape_pair_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_shape_pair_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_shape_pair_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' shape_pair_static
  private static boolean static_shape_pair_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && shape_pair_static(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean static_shape_pair_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_list_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // (static_shape_pair_item (',' static_shape_pair_item)* ','?)?
  public static boolean static_shape_pair_list_ae(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_list_ae")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<static shape pair list ae>");
    static_shape_pair_list_ae_0(b, l + 1);
    exit_section_(b, l, m, STATIC_SHAPE_PAIR_LIST_AE, true, false, null);
    return true;
  }

  // static_shape_pair_item (',' static_shape_pair_item)* ','?
  private static boolean static_shape_pair_list_ae_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_list_ae_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_shape_pair_item(b, l + 1);
    r = r && static_shape_pair_list_ae_0_1(b, l + 1);
    r = r && static_shape_pair_list_ae_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' static_shape_pair_item)*
  private static boolean static_shape_pair_list_ae_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_list_ae_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_shape_pair_list_ae_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_shape_pair_list_ae_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' static_shape_pair_item
  private static boolean static_shape_pair_list_ae_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_list_ae_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && static_shape_pair_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean static_shape_pair_list_ae_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shape_pair_list_ae_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // shift_operator static_additive_or_concatenation_expression_wrapper
  public static boolean static_shift_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shift_expression")) return false;
    if (!nextTokenIs(b, "<static shift expression>", T_SL, T_SR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<static shift expression>");
    r = shift_operator(b, l + 1);
    r = r && static_additive_or_concatenation_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, STATIC_SHIFT_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // static_additive_or_concatenation_expression_wrapper static_shift_expression*
  static boolean static_shift_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shift_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_additive_or_concatenation_expression_wrapper(b, l + 1);
    r = r && static_shift_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static_shift_expression*
  private static boolean static_shift_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_shift_expression_wrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_shift_expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_shift_expression_wrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_STATIC static_var_list ';'
  public static boolean static_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_statement")) return false;
    if (!nextTokenIs(b, T_STATIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_STATIC);
    p = r; // pin = 1
    r = r && report_error_(b, static_var_list(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, STATIC_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '?' static_expression? ':' static_ternary_expression_wrapper
  public static boolean static_ternary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_ternary_expression")) return false;
    if (!nextTokenIs(b, T_QUEST)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_QUEST);
    r = r && static_ternary_expression_1(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && static_ternary_expression_wrapper(b, l + 1);
    exit_section_(b, l, m, STATIC_TERNARY_EXPRESSION, r, false, null);
    return r;
  }

  // static_expression?
  private static boolean static_ternary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_ternary_expression_1")) return false;
    static_expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // static_logical_expression_wrapper static_ternary_expression?
  static boolean static_ternary_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_ternary_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_logical_expression_wrapper(b, l + 1);
    r = r && static_ternary_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static_ternary_expression?
  private static boolean static_ternary_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_ternary_expression_wrapper_1")) return false;
    static_ternary_expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ((static_assignment|variable_name_holder) (',' (static_assignment|variable_name_holder))*)?
  public static boolean static_var_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_var_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<static var list>");
    static_var_list_0(b, l + 1);
    exit_section_(b, l, m, STATIC_VAR_LIST, true, false, null);
    return true;
  }

  // (static_assignment|variable_name_holder) (',' (static_assignment|variable_name_holder))*
  private static boolean static_var_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_var_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_var_list_0_0(b, l + 1);
    r = r && static_var_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static_assignment|variable_name_holder
  private static boolean static_var_list_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_var_list_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_assignment(b, l + 1);
    if (!r) r = variable_name_holder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (static_assignment|variable_name_holder))*
  private static boolean static_var_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_var_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!static_var_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_var_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' (static_assignment|variable_name_holder)
  private static boolean static_var_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_var_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && static_var_list_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static_assignment|variable_name_holder
  private static boolean static_var_list_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_var_list_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_assignment(b, l + 1);
    if (!r) r = variable_name_holder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_VARRAY '(' static_array_pair_list ')'
  public static boolean static_varray_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_varray_literal")) return false;
    if (!nextTokenIs(b, T_VARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_VARRAY);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, static_array_pair_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, STATIC_VARRAY_LITERAL, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // variable suffix_operator
  static boolean suffix_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable(b, l + 1);
    r = r && suffix_operator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_INC | T_DEC
  public static boolean suffix_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_operator")) return false;
    if (!nextTokenIs(b, "<suffix operator>", T_DEC, T_INC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<suffix operator>");
    r = consumeToken(b, T_INC);
    if (!r) r = consumeToken(b, T_DEC);
    exit_section_(b, l, m, SUFFIX_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // switch_statement_list | switch_new_statement
  public static boolean switch_case_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_list")) return false;
    if (!nextTokenIs(b, "<switch case list>", T_COLON, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<switch case list>");
    r = switch_statement_list(b, l + 1);
    if (!r) r = switch_new_statement(b, l + 1);
    exit_section_(b, l, m, SWITCH_CASE_LIST, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ':' ';'? case_list T_ENDSWITCH ';'
  public static boolean switch_new_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_new_statement")) return false;
    if (!nextTokenIs(b, T_COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_COLON);
    p = r; // pin = 1
    r = r && report_error_(b, switch_new_statement_1(b, l + 1));
    r = p && report_error_(b, case_list(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_ENDSWITCH)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, SWITCH_NEW_STATEMENT, r, p, null);
    return r || p;
  }

  // ';'?
  private static boolean switch_new_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_new_statement_1")) return false;
    consumeToken(b, T_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // T_SWITCH parenthesized_expression  switch_case_list
  public static boolean switch_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement")) return false;
    if (!nextTokenIs(b, T_SWITCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_SWITCH);
    p = r; // pin = 1
    r = r && report_error_(b, parenthesized_expression(b, l + 1));
    r = p && switch_case_list(b, l + 1) && r;
    exit_section_(b, l, m, SWITCH_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '{' ';'? case_list '}'
  public static boolean switch_statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement_list")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, switch_statement_list_1(b, l + 1));
    r = p && report_error_(b, case_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, SWITCH_STATEMENT_LIST, r, p, null);
    return r || p;
  }

  // ';'?
  private static boolean switch_statement_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement_list_1")) return false;
    consumeToken(b, T_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // '?' expression? ':' ternary_expression_wrapper
  public static boolean ternary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternary_expression")) return false;
    if (!nextTokenIs(b, T_QUEST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_QUEST);
    p = r; // pin = 1
    r = r && report_error_(b, ternary_expression_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COLON)) && r;
    r = p && ternary_expression_wrapper(b, l + 1) && r;
    exit_section_(b, l, m, TERNARY_EXPRESSION, r, p, null);
    return r || p;
  }

  // expression?
  private static boolean ternary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternary_expression_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // logical_expression_wrapper ternary_expression?
  static boolean ternary_expression_wrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternary_expression_wrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = logical_expression_wrapper(b, l + 1);
    r = r && ternary_expression_wrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ternary_expression?
  private static boolean ternary_expression_wrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternary_expression_wrapper_1")) return false;
    ternary_expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_THROW expression ';'
  public static boolean throw_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throw_statement")) return false;
    if (!nextTokenIs(b, T_THROW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_THROW);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, THROW_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (
  //                         namespace_declaration_statement //OK
  //                        | statement //ok
  //                        | function_declaration_statement //OK
  //                        | classes_wrapper //OK
  //                        | interface_declaration_statement //OK
  //                        | enum_declaration_statement //OK
  //                        | trait_declaration_statement //OK
  //                        | type_alias_declaration_statement
  //                        | halt_compiler_statement //OK
  //                        | use_declaration_statement //OK
  //                        | constant_declaration_statement //OK
  //                        )* {
  //                         //recoverWhile="statement_recover"
  //                        }
  public static boolean top_statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_statement_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<top statement list>");
    r = top_statement_list_0(b, l + 1);
    r = r && top_statement_list_1(b, l + 1);
    exit_section_(b, l, m, TOP_STATEMENT_LIST, r, false, null);
    return r;
  }

  // (
  //                         namespace_declaration_statement //OK
  //                        | statement //ok
  //                        | function_declaration_statement //OK
  //                        | classes_wrapper //OK
  //                        | interface_declaration_statement //OK
  //                        | enum_declaration_statement //OK
  //                        | trait_declaration_statement //OK
  //                        | type_alias_declaration_statement
  //                        | halt_compiler_statement //OK
  //                        | use_declaration_statement //OK
  //                        | constant_declaration_statement //OK
  //                        )*
  private static boolean top_statement_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_statement_list_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!top_statement_list_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "top_statement_list_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // namespace_declaration_statement //OK
  //                        | statement //ok
  //                        | function_declaration_statement //OK
  //                        | classes_wrapper //OK
  //                        | interface_declaration_statement //OK
  //                        | enum_declaration_statement //OK
  //                        | trait_declaration_statement //OK
  //                        | type_alias_declaration_statement
  //                        | halt_compiler_statement //OK
  //                        | use_declaration_statement //OK
  //                        | constant_declaration_statement
  private static boolean top_statement_list_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_statement_list_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_declaration_statement(b, l + 1);
    if (!r) r = statement(b, l + 1);
    if (!r) r = function_declaration_statement(b, l + 1);
    if (!r) r = classes_wrapper(b, l + 1);
    if (!r) r = interface_declaration_statement(b, l + 1);
    if (!r) r = enum_declaration_statement(b, l + 1);
    if (!r) r = trait_declaration_statement(b, l + 1);
    if (!r) r = type_alias_declaration_statement(b, l + 1);
    if (!r) r = halt_compiler_statement(b, l + 1);
    if (!r) r = use_declaration_statement(b, l + 1);
    if (!r) r = constant_declaration_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  //                         //recoverWhile="statement_recover"
  //                        }
  private static boolean top_statement_list_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // trait_alias_rule_method T_AS method_modifiers? identifier ';'
  // | trait_alias_rule_method T_AS member_modifier+ ';'
  public static boolean trait_alias_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_rule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<trait alias rule>");
    r = trait_alias_rule_0(b, l + 1);
    if (!r) r = trait_alias_rule_1(b, l + 1);
    exit_section_(b, l, m, TRAIT_ALIAS_RULE, r, false, null);
    return r;
  }

  // trait_alias_rule_method T_AS method_modifiers? identifier ';'
  private static boolean trait_alias_rule_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_rule_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trait_alias_rule_method(b, l + 1);
    r = r && consumeToken(b, T_AS);
    r = r && trait_alias_rule_0_2(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // method_modifiers?
  private static boolean trait_alias_rule_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_rule_0_2")) return false;
    method_modifiers(b, l + 1);
    return true;
  }

  // trait_alias_rule_method T_AS member_modifier+ ';'
  private static boolean trait_alias_rule_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_rule_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trait_alias_rule_method(b, l + 1);
    r = r && consumeToken(b, T_AS);
    r = r && trait_alias_rule_1_2(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // member_modifier+
  private static boolean trait_alias_rule_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_rule_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_modifier(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!member_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_alias_rule_1_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs T_DOUBLE_COLON identifier
  // | identifier
  public static boolean trait_alias_rule_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_rule_method")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<trait alias rule method>");
    r = trait_alias_rule_method_0(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    exit_section_(b, l, m, TRAIT_ALIAS_RULE_METHOD, r, false, null);
    return r;
  }

  // class_namespace_string_typeargs T_DOUBLE_COLON identifier
  private static boolean trait_alias_rule_method_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_alias_rule_method_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_namespace_string_typeargs(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // user_attributes? T_TRAIT name_holder typevar?  implements_list? class_statement_block
  public static boolean trait_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_declaration_statement")) return false;
    if (!nextTokenIs(b, "<trait declaration statement>", T_SL, T_TRAIT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<trait declaration statement>");
    r = trait_declaration_statement_0(b, l + 1);
    r = r && consumeToken(b, T_TRAIT);
    p = r; // pin = 2
    r = r && report_error_(b, name_holder(b, l + 1));
    r = p && report_error_(b, trait_declaration_statement_3(b, l + 1)) && r;
    r = p && report_error_(b, trait_declaration_statement_4(b, l + 1)) && r;
    r = p && class_statement_block(b, l + 1) && r;
    exit_section_(b, l, m, TRAIT_DECLARATION_STATEMENT, r, p, null);
    return r || p;
  }

  // user_attributes?
  private static boolean trait_declaration_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_declaration_statement_0")) return false;
    user_attributes(b, l + 1);
    return true;
  }

  // typevar?
  private static boolean trait_declaration_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_declaration_statement_3")) return false;
    typevar(b, l + 1);
    return true;
  }

  // implements_list?
  private static boolean trait_declaration_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_declaration_statement_4")) return false;
    implements_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (fully_qualified_class_name (',' fully_qualified_class_name)*)?
  public static boolean trait_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<trait list>");
    trait_list_0(b, l + 1);
    exit_section_(b, l, m, TRAIT_LIST, true, false, null);
    return true;
  }

  // fully_qualified_class_name (',' fully_qualified_class_name)*
  private static boolean trait_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fully_qualified_class_name(b, l + 1);
    r = r && trait_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' fully_qualified_class_name)*
  private static boolean trait_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!trait_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' fully_qualified_class_name
  private static boolean trait_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && fully_qualified_class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs T_DOUBLE_COLON identifier T_INSTEADOF trait_list ';'
  public static boolean trait_precedence_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_precedence_rule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<trait precedence rule>");
    r = class_namespace_string_typeargs(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, T_INSTEADOF);
    r = r && trait_list(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, TRAIT_PRECEDENCE_RULE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_REQUIRE (T_EXTENDS|T_IMPLEMENTS) fully_qualified_class_name ';'
  public static boolean trait_require_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_require_declaration")) return false;
    if (!nextTokenIs(b, T_REQUIRE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_REQUIRE);
    p = r; // pin = 1
    r = r && report_error_(b, trait_require_declaration_1(b, l + 1));
    r = p && report_error_(b, fully_qualified_class_name(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, TRAIT_REQUIRE_DECLARATION, r, p, null);
    return r || p;
  }

  // T_EXTENDS|T_IMPLEMENTS
  private static boolean trait_require_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_require_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EXTENDS);
    if (!r) r = consumeToken(b, T_IMPLEMENTS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (trait_precedence_rule |  trait_alias_rule)+
  public static boolean trait_rules(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_rules")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<trait rules>");
    r = trait_rules_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!trait_rules_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trait_rules", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, TRAIT_RULES, r, false, null);
    return r;
  }

  // trait_precedence_rule |  trait_alias_rule
  private static boolean trait_rules_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_rules_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trait_precedence_rule(b, l + 1);
    if (!r) r = trait_alias_rule(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_USE trait_list (';'| '{' trait_rules? '}')
  public static boolean trait_use_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_declaration")) return false;
    if (!nextTokenIs(b, T_USE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_USE);
    p = r; // pin = 1
    r = r && report_error_(b, trait_list(b, l + 1));
    r = p && trait_use_declaration_2(b, l + 1) && r;
    exit_section_(b, l, m, TRAIT_USE_DECLARATION, r, p, null);
    return r || p;
  }

  // ';'| '{' trait_rules? '}'
  private static boolean trait_use_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SEMICOLON);
    if (!r) r = trait_use_declaration_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' trait_rules? '}'
  private static boolean trait_use_declaration_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_declaration_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && trait_use_declaration_2_1_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // trait_rules?
  private static boolean trait_use_declaration_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trait_use_declaration_2_1_1")) return false;
    trait_rules(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_CATCH '(' fully_qualified_class_name T_VARIABLE ')' '{' inner_statement_list '}'
  public static boolean try_catch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_catch")) return false;
    if (!nextTokenIs(b, T_CATCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_CATCH);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, fully_qualified_class_name(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_VARIABLE)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && report_error_(b, consumeToken(b, T_LBRACE)) && r;
    r = p && report_error_(b, inner_statement_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, TRY_CATCH, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_FINALLY  finally_statement_list
  public static boolean try_finally(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_finally")) return false;
    if (!nextTokenIs(b, T_FINALLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_FINALLY);
    p = r; // pin = 1
    r = r && finally_statement_list(b, l + 1);
    exit_section_(b, l, m, TRY_FINALLY, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (T_TRY try_statement_list try_catch additional_catches  optional_finally)
  //         | (T_TRY try_statement_list try_finally)
  public static boolean try_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement")) return false;
    if (!nextTokenIs(b, T_TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = try_statement_0(b, l + 1);
    if (!r) r = try_statement_1(b, l + 1);
    exit_section_(b, m, TRY_STATEMENT, r);
    return r;
  }

  // T_TRY try_statement_list try_catch additional_catches  optional_finally
  private static boolean try_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_TRY);
    r = r && try_statement_list(b, l + 1);
    r = r && try_catch(b, l + 1);
    r = r && additional_catches(b, l + 1);
    r = r && optional_finally(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_TRY try_statement_list try_finally
  private static boolean try_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_TRY);
    r = r && try_statement_list(b, l + 1);
    r = r && try_finally(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block_statement
  static boolean try_statement_list(PsiBuilder b, int l) {
    return block_statement(b, l + 1);
  }

  /* ********************************************************** */
  // variable_name_holder|variable
  static boolean try_variable_name_first(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_variable_name_first")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_name_holder(b, l + 1);
    if (!r) r = variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_TUPLE '(' function_call_parameter_list ')'
  public static boolean tuple_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expression")) return false;
    if (!nextTokenIs(b, T_TUPLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_TUPLE);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, function_call_parameter_list(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, TUPLE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '(' types_group ',' types_group (',' types_group)* ','? ')'
  public static boolean tuple_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, types_group(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, types_group(b, l + 1)) && r;
    r = p && report_error_(b, tuple_type_4(b, l + 1)) && r;
    r = p && report_error_(b, tuple_type_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, TUPLE_TYPE, r, p, null);
    return r || p;
  }

  // (',' types_group)*
  private static boolean tuple_type_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!tuple_type_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_type_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' types_group
  private static boolean tuple_type_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && types_group(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean tuple_type_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_5")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // type_declaration_statement | new_type_declaration_statement
  static boolean type_alias_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_alias_declaration_statement")) return false;
    if (!nextTokenIs(b, "", T_NEWTYPE, T_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_declaration_statement(b, l + 1);
    if (!r) r = new_type_declaration_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_TYPE name_holder typevar? '=' types_group ';'
  public static boolean type_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration_statement")) return false;
    if (!nextTokenIs(b, T_TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_TYPE);
    p = r; // pin = 1
    r = r && report_error_(b, name_holder(b, l + 1));
    r = p && report_error_(b, type_declaration_statement_2(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_EQUAL)) && r;
    r = p && report_error_(b, types_group(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, TYPE_DECLARATION_STATEMENT, r, p, null);
    return r || p;
  }

  // typevar?
  private static boolean type_declaration_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration_statement_2")) return false;
    typevar(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (types_group (',' types_group)* ','?)?
  public static boolean type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<type list>");
    type_list_0(b, l + 1);
    exit_section_(b, l, m, TYPE_LIST, true, false, null);
    return true;
  }

  // types_group (',' types_group)* ','?
  private static boolean type_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = types_group(b, l + 1);
    r = r && type_list_0_1(b, l + 1);
    r = r && type_list_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' types_group)*
  private static boolean type_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!type_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' types_group
  private static boolean type_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && types_group(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean type_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_TYPELIST_LT type_list T_TYPELIST_GT
  public static boolean typeargs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeargs")) return false;
    if (!nextTokenIs(b, T_TYPELIST_LT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_TYPELIST_LT);
    p = r; // pin = 1
    r = r && report_error_(b, type_list(b, l + 1));
    r = p && consumeToken(b, T_TYPELIST_GT) && r;
    exit_section_(b, l, m, TYPEARGS, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // nullable_type
  //         | soft_type
  //         | identifier_type
  //         | array_type
  //         | callable_type
  //         | shape_type
  //         | xhp_type
  //         | function_type
  //         | tuple_type
  static boolean types_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "types_group")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nullable_type(b, l + 1);
    if (!r) r = soft_type(b, l + 1);
    if (!r) r = identifier_type(b, l + 1);
    if (!r) r = array_type(b, l + 1);
    if (!r) r = callable_type(b, l + 1);
    if (!r) r = shape_type(b, l + 1);
    if (!r) r = xhp_type(b, l + 1);
    if (!r) r = function_type(b, l + 1);
    if (!r) r = tuple_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_TYPELIST_LT typevar_list T_TYPELIST_GT
  public static boolean typevar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar")) return false;
    if (!nextTokenIs(b, T_TYPELIST_LT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_TYPELIST_LT);
    p = r; // pin = 1
    r = r && report_error_(b, typevar_list(b, l + 1));
    r = p && consumeToken(b, T_TYPELIST_GT) && r;
    exit_section_(b, l, m, TYPEVAR, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // typevar_variance? name_holder (T_AS types_group)?
  public static boolean typevar_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<typevar item>");
    r = typevar_item_0(b, l + 1);
    r = r && name_holder(b, l + 1);
    r = r && typevar_item_2(b, l + 1);
    exit_section_(b, l, m, TYPEVAR_ITEM, r, false, null);
    return r;
  }

  // typevar_variance?
  private static boolean typevar_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar_item_0")) return false;
    typevar_variance(b, l + 1);
    return true;
  }

  // (T_AS types_group)?
  private static boolean typevar_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar_item_2")) return false;
    typevar_item_2_0(b, l + 1);
    return true;
  }

  // T_AS types_group
  private static boolean typevar_item_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar_item_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && types_group(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (typevar_item (',' typevar_item)?)?
  public static boolean typevar_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<typevar list>");
    typevar_list_0(b, l + 1);
    exit_section_(b, l, m, TYPEVAR_LIST, true, false, null);
    return true;
  }

  // typevar_item (',' typevar_item)?
  private static boolean typevar_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typevar_item(b, l + 1);
    r = r && typevar_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' typevar_item)?
  private static boolean typevar_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar_list_0_1")) return false;
    typevar_list_0_1_0(b, l + 1);
    return true;
  }

  // ',' typevar_item
  private static boolean typevar_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && typevar_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '+' | '-'
  public static boolean typevar_variance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar_variance")) return false;
    if (!nextTokenIs(b, "<typevar variance>", T_PLUS, T_MINUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<typevar variance>");
    r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    exit_section_(b, l, m, TYPEVAR_VARIANCE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_UNSET '(' variable_list ')' ';'
  public static boolean unset_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unset_statement")) return false;
    if (!nextTokenIs(b, T_UNSET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_UNSET);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, variable_list(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, UNSET_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // namespace_name_declaration (T_AS name_holder)?
  public static boolean use_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<use declaration>");
    r = namespace_name_declaration(b, l + 1);
    r = r && use_declaration_1(b, l + 1);
    exit_section_(b, l, m, USE_DECLARATION, r, false, null);
    return r;
  }

  // (T_AS name_holder)?
  private static boolean use_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_declaration_1")) return false;
    use_declaration_1_0(b, l + 1);
    return true;
  }

  // T_AS name_holder
  private static boolean use_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_declaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && name_holder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_USE (T_FUNCTION | T_CONST)? use_declarations ';'
  public static boolean use_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_declaration_statement")) return false;
    if (!nextTokenIs(b, T_USE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_USE);
    p = r; // pin = 1
    r = r && report_error_(b, use_declaration_statement_1(b, l + 1));
    r = p && report_error_(b, use_declarations(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, USE_DECLARATION_STATEMENT, r, p, null);
    return r || p;
  }

  // (T_FUNCTION | T_CONST)?
  private static boolean use_declaration_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_declaration_statement_1")) return false;
    use_declaration_statement_1_0(b, l + 1);
    return true;
  }

  // T_FUNCTION | T_CONST
  private static boolean use_declaration_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_declaration_statement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_FUNCTION);
    if (!r) r = consumeToken(b, T_CONST);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // use_declaration (',' use_declaration)*
  public static boolean use_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_declarations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<use declarations>");
    r = use_declaration(b, l + 1);
    r = r && use_declarations_1(b, l + 1);
    exit_section_(b, l, m, USE_DECLARATIONS, r, false, null);
    return r;
  }

  // (',' use_declaration)*
  private static boolean use_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_declarations_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!use_declarations_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_declarations_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' use_declaration
  private static boolean use_declarations_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_declarations_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && use_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier attribute_static_scalar_list?
  public static boolean user_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<user attribute>");
    r = identifier(b, l + 1);
    r = r && user_attribute_1(b, l + 1);
    exit_section_(b, l, m, USER_ATTRIBUTE, r, false, null);
    return r;
  }

  // attribute_static_scalar_list?
  private static boolean user_attribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_attribute_1")) return false;
    attribute_static_scalar_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (user_attribute (',' user_attribute)* ','?)?
  public static boolean user_attribute_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_attribute_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<user attribute list>");
    user_attribute_list_0(b, l + 1);
    exit_section_(b, l, m, USER_ATTRIBUTE_LIST, true, false, null);
    return true;
  }

  // user_attribute (',' user_attribute)* ','?
  private static boolean user_attribute_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_attribute_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = user_attribute(b, l + 1);
    r = r && user_attribute_list_0_1(b, l + 1);
    r = r && user_attribute_list_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' user_attribute)*
  private static boolean user_attribute_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_attribute_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!user_attribute_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "user_attribute_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' user_attribute
  private static boolean user_attribute_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_attribute_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && user_attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean user_attribute_list_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_attribute_list_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_SL user_attribute_list T_SR
  public static boolean user_attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_attributes")) return false;
    if (!nextTokenIs(b, T_SL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SL);
    r = r && user_attribute_list(b, l + 1);
    r = r && consumeToken(b, T_SR);
    exit_section_(b, m, USER_ATTRIBUTES, r);
    return r;
  }

  /* ********************************************************** */
  // member_variable_wrapper
  static boolean variable(PsiBuilder b, int l) {
    return member_variable_wrapper(b, l + 1);
  }

  /* ********************************************************** */
  // reference_variable
  public static boolean variable_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_expression")) return false;
    if (!nextTokenIs(b, "<variable expression>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variable expression>");
    r = reference_variable(b, l + 1);
    exit_section_(b, l, m, VARIABLE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' expression '}'
  public static boolean variable_expression_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_expression_variable")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, VARIABLE_EXPRESSION_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // T_VARIABLE
  public static boolean variable_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_identifier")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_VARIABLE);
    exit_section_(b, m, VARIABLE_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // (variable (',' variable)*)?
  public static boolean variable_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<variable list>");
    variable_list_0(b, l + 1);
    exit_section_(b, l, m, VARIABLE_LIST, true, false, null);
    return true;
  }

  // variable (',' variable)*
  private static boolean variable_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable(b, l + 1);
    r = r && variable_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' variable)*
  private static boolean variable_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!variable_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' variable
  private static boolean variable_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // member_modifier+ | T_VAR
  public static boolean variable_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variable modifiers>");
    r = variable_modifiers_0(b, l + 1);
    if (!r) r = consumeToken(b, T_VAR);
    exit_section_(b, l, m, VARIABLE_MODIFIERS, r, false, null);
    return r;
  }

  // member_modifier+
  private static boolean variable_modifiers_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_modifiers_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_modifier(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!member_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_modifiers_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable_identifier
  public static boolean variable_name_holder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_name_holder")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_identifier(b, l + 1);
    exit_section_(b, m, VARIABLE_NAME_HOLDER, r);
    return r;
  }

  /* ********************************************************** */
  // only_member_access_wrapper
  static boolean variable_no_calls(PsiBuilder b, int l) {
    return only_member_access_wrapper(b, l + 1);
  }

  /* ********************************************************** */
  // variable_expression
  //                     | dimmable_variable_access_expression
  //                     | static_class_variable_expression
  //                     | '(' expression_with_parens ')'
  //                     | parenthesized_variable_expression
  static boolean variable_no_calls_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_no_calls_base")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_expression(b, l + 1);
    if (!r) r = dimmable_variable_access_expression(b, l + 1);
    if (!r) r = static_class_variable_expression(b, l + 1);
    if (!r) r = variable_no_calls_base_3(b, l + 1);
    if (!r) r = parenthesized_variable_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' expression_with_parens ')'
  private static boolean variable_no_calls_base_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_no_calls_base_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && expression_with_parens(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_VARRAY '(' array_pair_list ')'
  public static boolean varray_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varray_literal_expression")) return false;
    if (!nextTokenIs(b, T_VARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_VARRAY);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, array_pair_list(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, VARRAY_LITERAL_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_WHERE expression
  public static boolean where_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause")) return false;
    if (!nextTokenIs(b, T_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_WHERE);
    r = r && expression(b, l + 1);
    exit_section_(b, m, WHERE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // ':' inner_statement_list T_ENDWHILE ';'
  public static boolean while_new_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_new_statement")) return false;
    if (!nextTokenIs(b, T_COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_COLON);
    p = r; // pin = 1
    r = r && report_error_(b, inner_statement_list(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_ENDWHILE)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, WHILE_NEW_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_WHILE parenthesized_expression  while_statement_body
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, T_WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_WHILE);
    p = r; // pin = 1
    r = r && report_error_(b, parenthesized_expression(b, l + 1));
    r = p && while_statement_body(b, l + 1) && r;
    exit_section_(b, l, m, WHILE_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // while_new_statement   | statement
  public static boolean while_statement_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<while statement body>");
    r = while_new_statement(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, WHILE_STATEMENT_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // xhp_attribute_name '=' xhp_attribute_value
  public static boolean xhp_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute")) return false;
    if (!nextTokenIs(b, T_XHP_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_attribute_name(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && xhp_attribute_value(b, l + 1);
    exit_section_(b, m, XHP_ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // xhp_attribute_decl_type xhp_label_ws xhp_attribute_default? xhp_attribute_is_required?
  // | xhp_identifier
  public static boolean xhp_attribute_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp attribute decl>");
    r = xhp_attribute_decl_0(b, l + 1);
    if (!r) r = xhp_identifier(b, l + 1);
    exit_section_(b, l, m, XHP_ATTRIBUTE_DECL, r, false, null);
    return r;
  }

  // xhp_attribute_decl_type xhp_label_ws xhp_attribute_default? xhp_attribute_is_required?
  private static boolean xhp_attribute_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_decl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_attribute_decl_type(b, l + 1);
    r = r && xhp_label_ws(b, l + 1);
    r = r && xhp_attribute_decl_0_2(b, l + 1);
    r = r && xhp_attribute_decl_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // xhp_attribute_default?
  private static boolean xhp_attribute_decl_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_decl_0_2")) return false;
    xhp_attribute_default(b, l + 1);
    return true;
  }

  // xhp_attribute_is_required?
  private static boolean xhp_attribute_decl_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_decl_0_3")) return false;
    xhp_attribute_is_required(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_ARRAY
  // | fully_qualified_class_name
  // | T_VAR
  // | T_ENUM '{' xhp_attribute_enum? '}'
  // | T_CALLABLE
  public static boolean xhp_attribute_decl_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_decl_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp attribute decl type>");
    r = consumeToken(b, T_ARRAY);
    if (!r) r = fully_qualified_class_name(b, l + 1);
    if (!r) r = consumeToken(b, T_VAR);
    if (!r) r = xhp_attribute_decl_type_3(b, l + 1);
    if (!r) r = consumeToken(b, T_CALLABLE);
    exit_section_(b, l, m, XHP_ATTRIBUTE_DECL_TYPE, r, false, null);
    return r;
  }

  // T_ENUM '{' xhp_attribute_enum? '}'
  private static boolean xhp_attribute_decl_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_decl_type_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ENUM);
    r = r && consumeToken(b, T_LBRACE);
    r = r && xhp_attribute_decl_type_3_2(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // xhp_attribute_enum?
  private static boolean xhp_attribute_decl_type_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_decl_type_3_2")) return false;
    xhp_attribute_enum(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_XHP_ATTRIBUTE xhp_attribute_stmt ';'
  public static boolean xhp_attribute_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_declaration")) return false;
    if (!nextTokenIs(b, T_XHP_ATTRIBUTE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_XHP_ATTRIBUTE);
    p = r; // pin = 1
    r = r && report_error_(b, xhp_attribute_stmt(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, XHP_ATTRIBUTE_DECLARATION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '=' static_expression
  public static boolean xhp_attribute_default(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_default")) return false;
    if (!nextTokenIs(b, T_EQUAL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_EQUAL);
    p = r; // pin = 1
    r = r && static_expression(b, l + 1);
    exit_section_(b, l, m, XHP_ATTRIBUTE_DEFAULT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // literal_expression (',' literal_expression)*
  public static boolean xhp_attribute_enum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_enum")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp attribute enum>");
    r = literal_expression(b, l + 1);
    r = r && xhp_attribute_enum_1(b, l + 1);
    exit_section_(b, l, m, XHP_ATTRIBUTE_ENUM, r, false, null);
    return r;
  }

  // (',' literal_expression)*
  private static boolean xhp_attribute_enum_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_enum_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!xhp_attribute_enum_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xhp_attribute_enum_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' literal_expression
  private static boolean xhp_attribute_enum_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_enum_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && literal_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@' T_XHP_REQUIRED
  public static boolean xhp_attribute_is_required(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_is_required")) return false;
    if (!nextTokenIs(b, T_SILENCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SILENCE);
    r = r && consumeToken(b, T_XHP_REQUIRED);
    exit_section_(b, m, XHP_ATTRIBUTE_IS_REQUIRED, r);
    return r;
  }

  /* ********************************************************** */
  // xhp_identifier
  public static boolean xhp_attribute_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_name")) return false;
    if (!nextTokenIs(b, T_XHP_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_identifier(b, l + 1);
    exit_section_(b, m, XHP_ATTRIBUTE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // xhp_attribute_decl (',' xhp_attribute_decl)*
  public static boolean xhp_attribute_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp attribute stmt>");
    r = xhp_attribute_decl(b, l + 1);
    r = r && xhp_attribute_stmt_1(b, l + 1);
    exit_section_(b, l, m, XHP_ATTRIBUTE_STMT, r, false, null);
    return r;
  }

  // (',' xhp_attribute_decl)*
  private static boolean xhp_attribute_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_stmt_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!xhp_attribute_stmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xhp_attribute_stmt_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' xhp_attribute_decl
  private static boolean xhp_attribute_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && xhp_attribute_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_TEXT | '{' expression '}'
  public static boolean xhp_attribute_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_value")) return false;
    if (!nextTokenIs(b, "<xhp attribute value>", T_LBRACE, T_XHP_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp attribute value>");
    r = consumeToken(b, T_XHP_TEXT);
    if (!r) r = xhp_attribute_value_1(b, l + 1);
    exit_section_(b, l, m, XHP_ATTRIBUTE_VALUE, r, false, null);
    return r;
  }

  // '{' expression '}'
  private static boolean xhp_attribute_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // xhp_attribute+
  public static boolean xhp_attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attributes")) return false;
    if (!nextTokenIs(b, T_XHP_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_attribute(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!xhp_attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xhp_attributes", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, XHP_ATTRIBUTES, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  //                 | T_EXIT
  //                 | T_FUNCTION
  //                 | T_CONST
  //                 | T_RETURN
  //                 | T_YIELD
  //                 | T_AWAIT
  //                 | T_TRY
  //                 | T_CATCH
  //                 | T_FINALLY
  //                 | T_THROW
  //                 | T_IF
  //                 | T_ELSEIF
  //                 | T_ENDIF
  //                 | T_ELSE
  //                 | T_WHILE
  //                 | T_ENDWHILE
  //                 | T_DO
  //                 | T_FOR
  //                 | T_ENDFOR
  //                 | T_FOREACH
  //                 | T_ENDFOREACH
  //                 | T_DECLARE
  //                 | T_ENDDECLARE
  //                 | T_INSTANCEOF
  //                 | T_AS
  //                 | T_SWITCH
  //                 | T_ENDSWITCH
  //                 | T_CASE
  //                 | T_DEFAULT
  //                 | T_BREAK
  //                 | T_CONTINUE
  //                 | T_GOTO
  //                 | T_ECHO
  //                 | T_PRINT
  //                 | T_CLASS
  //                 | T_INTERFACE
  //                 | T_EXTENDS
  //                 | T_IMPLEMENTS
  //                 | T_NEW
  //                 | T_CLONE
  //                 | T_VAR
  //                 | T_EVAL
  //                 | T_INCLUDE
  //                 | T_INCLUDE_ONCE
  //                 | T_REQUIRE
  //                 | T_REQUIRE_ONCE
  //                 | T_NAMESPACE
  //                 | T_USE
  //                 | T_GLOBAL
  //                 | T_ISSET
  //                 | T_EMPTY
  //                 | T_HALT_COMPILER
  //                 | T_STATIC
  //                 | T_ABSTRACT
  //                 | T_FINAL
  //                 | T_PRIVATE
  //                 | T_PROTECTED
  //                 | T_PUBLIC
  //                 | T_ASYNC
  //                 | T_UNSET
  //                 | T_LIST
  //                 | T_ARRAY
  //                 | T_LOGICAL_OR
  //                 | T_LOGICAL_AND
  //                 | T_LOGICAL_XOR
  //                 | T_CLASS_C
  //                 | T_FUNC_C
  //                 | T_METHOD_C
  //                 | T_LINE
  //                 | T_FILE
  //                 | T_DIR
  //                 | T_NS_C
  //                 | T_COMPILER_HALT_OFFSET
  //                 | T_TRAIT
  //                 | T_TRAIT_C
  //                 | T_INSTEADOF
  //                 | T_TYPE
  //                 | T_NEWTYPE
  //                 | T_SHAPE
  public static boolean xhp_bareword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_bareword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp bareword>");
    r = identifier(b, l + 1);
    if (!r) r = consumeToken(b, T_EXIT);
    if (!r) r = consumeToken(b, T_FUNCTION);
    if (!r) r = consumeToken(b, T_CONST);
    if (!r) r = consumeToken(b, T_RETURN);
    if (!r) r = consumeToken(b, T_YIELD);
    if (!r) r = consumeToken(b, T_AWAIT);
    if (!r) r = consumeToken(b, T_TRY);
    if (!r) r = consumeToken(b, T_CATCH);
    if (!r) r = consumeToken(b, T_FINALLY);
    if (!r) r = consumeToken(b, T_THROW);
    if (!r) r = consumeToken(b, T_IF);
    if (!r) r = consumeToken(b, T_ELSEIF);
    if (!r) r = consumeToken(b, T_ENDIF);
    if (!r) r = consumeToken(b, T_ELSE);
    if (!r) r = consumeToken(b, T_WHILE);
    if (!r) r = consumeToken(b, T_ENDWHILE);
    if (!r) r = consumeToken(b, T_DO);
    if (!r) r = consumeToken(b, T_FOR);
    if (!r) r = consumeToken(b, T_ENDFOR);
    if (!r) r = consumeToken(b, T_FOREACH);
    if (!r) r = consumeToken(b, T_ENDFOREACH);
    if (!r) r = consumeToken(b, T_DECLARE);
    if (!r) r = consumeToken(b, T_ENDDECLARE);
    if (!r) r = consumeToken(b, T_INSTANCEOF);
    if (!r) r = consumeToken(b, T_AS);
    if (!r) r = consumeToken(b, T_SWITCH);
    if (!r) r = consumeToken(b, T_ENDSWITCH);
    if (!r) r = consumeToken(b, T_CASE);
    if (!r) r = consumeToken(b, T_DEFAULT);
    if (!r) r = consumeToken(b, T_BREAK);
    if (!r) r = consumeToken(b, T_CONTINUE);
    if (!r) r = consumeToken(b, T_GOTO);
    if (!r) r = consumeToken(b, T_ECHO);
    if (!r) r = consumeToken(b, T_PRINT);
    if (!r) r = consumeToken(b, T_CLASS);
    if (!r) r = consumeToken(b, T_INTERFACE);
    if (!r) r = consumeToken(b, T_EXTENDS);
    if (!r) r = consumeToken(b, T_IMPLEMENTS);
    if (!r) r = consumeToken(b, T_NEW);
    if (!r) r = consumeToken(b, T_CLONE);
    if (!r) r = consumeToken(b, T_VAR);
    if (!r) r = consumeToken(b, T_EVAL);
    if (!r) r = consumeToken(b, T_INCLUDE);
    if (!r) r = consumeToken(b, T_INCLUDE_ONCE);
    if (!r) r = consumeToken(b, T_REQUIRE);
    if (!r) r = consumeToken(b, T_REQUIRE_ONCE);
    if (!r) r = consumeToken(b, T_NAMESPACE);
    if (!r) r = consumeToken(b, T_USE);
    if (!r) r = consumeToken(b, T_GLOBAL);
    if (!r) r = consumeToken(b, T_ISSET);
    if (!r) r = consumeToken(b, T_EMPTY);
    if (!r) r = consumeToken(b, T_HALT_COMPILER);
    if (!r) r = consumeToken(b, T_STATIC);
    if (!r) r = consumeToken(b, T_ABSTRACT);
    if (!r) r = consumeToken(b, T_FINAL);
    if (!r) r = consumeToken(b, T_PRIVATE);
    if (!r) r = consumeToken(b, T_PROTECTED);
    if (!r) r = consumeToken(b, T_PUBLIC);
    if (!r) r = consumeToken(b, T_ASYNC);
    if (!r) r = consumeToken(b, T_UNSET);
    if (!r) r = consumeToken(b, T_LIST);
    if (!r) r = consumeToken(b, T_ARRAY);
    if (!r) r = consumeToken(b, T_LOGICAL_OR);
    if (!r) r = consumeToken(b, T_LOGICAL_AND);
    if (!r) r = consumeToken(b, T_LOGICAL_XOR);
    if (!r) r = consumeToken(b, T_CLASS_C);
    if (!r) r = consumeToken(b, T_FUNC_C);
    if (!r) r = consumeToken(b, T_METHOD_C);
    if (!r) r = consumeToken(b, T_LINE);
    if (!r) r = consumeToken(b, T_FILE);
    if (!r) r = consumeToken(b, T_DIR);
    if (!r) r = consumeToken(b, T_NS_C);
    if (!r) r = consumeToken(b, T_COMPILER_HALT_OFFSET);
    if (!r) r = consumeToken(b, T_TRAIT);
    if (!r) r = consumeToken(b, T_TRAIT_C);
    if (!r) r = consumeToken(b, T_INSTEADOF);
    if (!r) r = consumeToken(b, T_TYPE);
    if (!r) r = consumeToken(b, T_NEWTYPE);
    if (!r) r = consumeToken(b, T_SHAPE);
    exit_section_(b, l, m, XHP_BAREWORD, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_CATEGORY xhp_category_stmt ';'
  public static boolean xhp_category_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_category_declaration")) return false;
    if (!nextTokenIs(b, T_XHP_CATEGORY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_XHP_CATEGORY);
    p = r; // pin = 1
    r = r && report_error_(b, xhp_category_stmt(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, XHP_CATEGORY_DECLARATION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_XHP_CATEGORY_LABEL (',' T_XHP_CATEGORY_LABEL)*
  public static boolean xhp_category_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_category_stmt")) return false;
    if (!nextTokenIs(b, T_XHP_CATEGORY_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_XHP_CATEGORY_LABEL);
    r = r && xhp_category_stmt_1(b, l + 1);
    exit_section_(b, m, XHP_CATEGORY_STMT, r);
    return r;
  }

  // (',' T_XHP_CATEGORY_LABEL)*
  private static boolean xhp_category_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_category_stmt_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!xhp_category_stmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xhp_category_stmt_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' T_XHP_CATEGORY_LABEL
  private static boolean xhp_category_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_category_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && consumeToken(b, T_XHP_CATEGORY_LABEL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_TEXT | variable_expression_variable | xhp_tag
  public static boolean xhp_child(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_child")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp child>");
    r = consumeToken(b, T_XHP_TEXT);
    if (!r) r = variable_expression_variable(b, l + 1);
    if (!r) r = xhp_tag(b, l + 1);
    exit_section_(b, l, m, XHP_CHILD, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // xhp_child+
  public static boolean xhp_children(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp children>");
    r = xhp_child(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!xhp_child(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xhp_children", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, XHP_CHILDREN, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (xhp_children_paren_expression | xhp_children_decl_tag) ((','|'|') (xhp_children_paren_expression | xhp_children_decl_tag))*
  public static boolean xhp_children_decl_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_decl_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp children decl expression>");
    r = xhp_children_decl_expression_0(b, l + 1);
    r = r && xhp_children_decl_expression_1(b, l + 1);
    exit_section_(b, l, m, XHP_CHILDREN_DECL_EXPRESSION, r, false, null);
    return r;
  }

  // xhp_children_paren_expression | xhp_children_decl_tag
  private static boolean xhp_children_decl_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_decl_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_children_paren_expression(b, l + 1);
    if (!r) r = xhp_children_decl_tag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((','|'|') (xhp_children_paren_expression | xhp_children_decl_tag))*
  private static boolean xhp_children_decl_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_decl_expression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!xhp_children_decl_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xhp_children_decl_expression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (','|'|') (xhp_children_paren_expression | xhp_children_decl_tag)
  private static boolean xhp_children_decl_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_decl_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_children_decl_expression_1_0_0(b, l + 1);
    r = r && xhp_children_decl_expression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','|'|'
  private static boolean xhp_children_decl_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_decl_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    if (!r) r = consumeToken(b, T_OR);
    exit_section_(b, m, null, r);
    return r;
  }

  // xhp_children_paren_expression | xhp_children_decl_tag
  private static boolean xhp_children_decl_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_decl_expression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_children_paren_expression(b, l + 1);
    if (!r) r = xhp_children_decl_tag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (identifier
  //                             | xhp_identifier
  //                             | T_XHP_CATEGORY_LABEL) ('*'|'?'|'+')?
  public static boolean xhp_children_decl_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_decl_tag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp children decl tag>");
    r = xhp_children_decl_tag_0(b, l + 1);
    r = r && xhp_children_decl_tag_1(b, l + 1);
    exit_section_(b, l, m, XHP_CHILDREN_DECL_TAG, r, false, null);
    return r;
  }

  // identifier
  //                             | xhp_identifier
  //                             | T_XHP_CATEGORY_LABEL
  private static boolean xhp_children_decl_tag_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_decl_tag_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    if (!r) r = xhp_identifier(b, l + 1);
    if (!r) r = consumeToken(b, T_XHP_CATEGORY_LABEL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('*'|'?'|'+')?
  private static boolean xhp_children_decl_tag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_decl_tag_1")) return false;
    xhp_children_decl_tag_1_0(b, l + 1);
    return true;
  }

  // '*'|'?'|'+'
  private static boolean xhp_children_decl_tag_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_decl_tag_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_MUL);
    if (!r) r = consumeToken(b, T_QUEST);
    if (!r) r = consumeToken(b, T_PLUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_CHILDREN xhp_children_stmt ';'
  public static boolean xhp_children_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_declaration")) return false;
    if (!nextTokenIs(b, T_XHP_CHILDREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_XHP_CHILDREN);
    p = r; // pin = 1
    r = r && report_error_(b, xhp_children_stmt(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, XHP_CHILDREN_DECLARATION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '(' xhp_children_decl_expression ')' ('*'|'?'|'+')?
  public static boolean xhp_children_paren_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_paren_expression")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, xhp_children_decl_expression(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && xhp_children_paren_expression_3(b, l + 1) && r;
    exit_section_(b, l, m, XHP_CHILDREN_PAREN_EXPRESSION, r, p, null);
    return r || p;
  }

  // ('*'|'?'|'+')?
  private static boolean xhp_children_paren_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_paren_expression_3")) return false;
    xhp_children_paren_expression_3_0(b, l + 1);
    return true;
  }

  // '*'|'?'|'+'
  private static boolean xhp_children_paren_expression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_paren_expression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_MUL);
    if (!r) r = consumeToken(b, T_QUEST);
    if (!r) r = consumeToken(b, T_PLUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // xhp_children_paren_expression
  // | identifier
  // | T_EMPTY
  public static boolean xhp_children_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_children_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp children stmt>");
    r = xhp_children_paren_expression(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    if (!r) r = consumeToken(b, T_EMPTY);
    exit_section_(b, l, m, XHP_CHILDREN_STMT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // user_attributes? (T_CLASS | (T_ABSTRACT T_CLASS) | (T_FINAL T_CLASS))  xhp_name_holder  extends_from? implements_list? class_statement_block
  public static boolean xhp_class_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_class_declaration_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<xhp class declaration statement>");
    r = xhp_class_declaration_statement_0(b, l + 1);
    r = r && xhp_class_declaration_statement_1(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, xhp_name_holder(b, l + 1));
    r = p && report_error_(b, xhp_class_declaration_statement_3(b, l + 1)) && r;
    r = p && report_error_(b, xhp_class_declaration_statement_4(b, l + 1)) && r;
    r = p && class_statement_block(b, l + 1) && r;
    exit_section_(b, l, m, XHP_CLASS_DECLARATION_STATEMENT, r, p, null);
    return r || p;
  }

  // user_attributes?
  private static boolean xhp_class_declaration_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_class_declaration_statement_0")) return false;
    user_attributes(b, l + 1);
    return true;
  }

  // T_CLASS | (T_ABSTRACT T_CLASS) | (T_FINAL T_CLASS)
  private static boolean xhp_class_declaration_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_class_declaration_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CLASS);
    if (!r) r = xhp_class_declaration_statement_1_1(b, l + 1);
    if (!r) r = xhp_class_declaration_statement_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_ABSTRACT T_CLASS
  private static boolean xhp_class_declaration_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_class_declaration_statement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_ABSTRACT, T_CLASS);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_FINAL T_CLASS
  private static boolean xhp_class_declaration_statement_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_class_declaration_statement_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_FINAL, T_CLASS);
    exit_section_(b, m, null, r);
    return r;
  }

  // extends_from?
  private static boolean xhp_class_declaration_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_class_declaration_statement_3")) return false;
    extends_from(b, l + 1);
    return true;
  }

  // implements_list?
  private static boolean xhp_class_declaration_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_class_declaration_statement_4")) return false;
    implements_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // xhp_tag
  public static boolean xhp_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_expression")) return false;
    if (!nextTokenIs(b, T_XHP_TAG_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_tag(b, l + 1);
    exit_section_(b, m, XHP_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_LABEL
  public static boolean xhp_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_identifier")) return false;
    if (!nextTokenIs(b, T_XHP_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_XHP_LABEL);
    exit_section_(b, m, XHP_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // xhp_bareword ((':'|'-') xhp_bareword)*
  public static boolean xhp_label_ws(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_label_ws")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp label ws>");
    r = xhp_bareword(b, l + 1);
    r = r && xhp_label_ws_1(b, l + 1);
    exit_section_(b, l, m, XHP_LABEL_WS, r, false, null);
    return r;
  }

  // ((':'|'-') xhp_bareword)*
  private static boolean xhp_label_ws_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_label_ws_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!xhp_label_ws_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xhp_label_ws_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (':'|'-') xhp_bareword
  private static boolean xhp_label_ws_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_label_ws_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_label_ws_1_0_0(b, l + 1);
    r = r && xhp_bareword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':'|'-'
  private static boolean xhp_label_ws_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_label_ws_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    if (!r) r = consumeToken(b, T_MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // xhp_identifier
  public static boolean xhp_name_holder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_name_holder")) return false;
    if (!nextTokenIs(b, T_XHP_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_identifier(b, l + 1);
    exit_section_(b, m, XHP_NAME_HOLDER, r);
    return r;
  }

  /* ********************************************************** */
  // xhp_identifier?
  public static boolean xhp_opt_end_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_opt_end_label")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<xhp opt end label>");
    xhp_identifier(b, l + 1);
    exit_section_(b, l, m, XHP_OPT_END_LABEL, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // T_XHP_TAG_LT xhp_identifier xhp_tag_body T_XHP_TAG_GT
  public static boolean xhp_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_tag")) return false;
    if (!nextTokenIs(b, T_XHP_TAG_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_XHP_TAG_LT);
    r = r && xhp_identifier(b, l + 1);
    r = r && xhp_tag_body(b, l + 1);
    r = r && consumeToken(b, T_XHP_TAG_GT);
    exit_section_(b, m, XHP_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // (xhp_attributes? '/') | (xhp_attributes? T_XHP_TAG_GT xhp_children? T_XHP_TAG_LT '/' xhp_opt_end_label)
  public static boolean xhp_tag_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_tag_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp tag body>");
    r = xhp_tag_body_0(b, l + 1);
    if (!r) r = xhp_tag_body_1(b, l + 1);
    exit_section_(b, l, m, XHP_TAG_BODY, r, false, null);
    return r;
  }

  // xhp_attributes? '/'
  private static boolean xhp_tag_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_tag_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_tag_body_0_0(b, l + 1);
    r = r && consumeToken(b, T_DIV);
    exit_section_(b, m, null, r);
    return r;
  }

  // xhp_attributes?
  private static boolean xhp_tag_body_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_tag_body_0_0")) return false;
    xhp_attributes(b, l + 1);
    return true;
  }

  // xhp_attributes? T_XHP_TAG_GT xhp_children? T_XHP_TAG_LT '/' xhp_opt_end_label
  private static boolean xhp_tag_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_tag_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_tag_body_1_0(b, l + 1);
    r = r && consumeToken(b, T_XHP_TAG_GT);
    r = r && xhp_tag_body_1_2(b, l + 1);
    r = r && consumeToken(b, T_XHP_TAG_LT);
    r = r && consumeToken(b, T_DIV);
    r = r && xhp_opt_end_label(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // xhp_attributes?
  private static boolean xhp_tag_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_tag_body_1_0")) return false;
    xhp_attributes(b, l + 1);
    return true;
  }

  // xhp_children?
  private static boolean xhp_tag_body_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_tag_body_1_2")) return false;
    xhp_children(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // xhp_identifier
  public static boolean xhp_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_type")) return false;
    if (!nextTokenIs(b, T_XHP_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xhp_identifier(b, l + 1);
    exit_section_(b, m, XHP_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // try_variable_name_first '=' yield_expression
  public static boolean yield_assign_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_assign_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<yield assign expression>");
    r = try_variable_name_first(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && yield_expression(b, l + 1);
    exit_section_(b, l, m, YIELD_ASSIGN_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_YIELD expression (T_DOUBLE_ARROW expression)?
  public static boolean yield_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression")) return false;
    if (!nextTokenIs(b, T_YIELD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_YIELD);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1));
    r = p && yield_expression_2(b, l + 1) && r;
    exit_section_(b, l, m, YIELD_EXPRESSION, r, p, null);
    return r || p;
  }

  // (T_DOUBLE_ARROW expression)?
  private static boolean yield_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression_2")) return false;
    yield_expression_2_0(b, l + 1);
    return true;
  }

  // T_DOUBLE_ARROW expression
  private static boolean yield_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOUBLE_ARROW);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // list_assignment_variables '=' yield_expression
  public static boolean yield_list_assign_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_list_assign_expression")) return false;
    if (!nextTokenIs(b, T_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_assignment_variables(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && yield_expression(b, l + 1);
    exit_section_(b, m, YIELD_LIST_ASSIGN_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // T_YIELD T_BREAK ';'
  public static boolean yield_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_statement")) return false;
    if (!nextTokenIs(b, T_YIELD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 1, T_YIELD, T_BREAK);
    p = r; // pin = 1
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, YIELD_STATEMENT, r, p, null);
    return r || p;
  }

}
