// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static io.github.josehsantos.hack.lang.psi.HackTypes.*;
import static io.github.josehsantos.hack.lang.parser.HackParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class HackParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("io.github.josehsantos.hack.lang.HackParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ADDITIVE_OR_CONCATENATION_EXPR) {
      result_ = additive_or_concatenation_expr(builder_, 0);
    }
    else if (root_ == ADDITIVE_OR_CONCATENATION_OPERATOR) {
      result_ = additive_or_concatenation_operator(builder_, 0);
    }
    else if (root_ == ARRAY_ACCESS) {
      result_ = array_access(builder_, 0);
    }
    else if (root_ == ARRAY_LITERAL_EXPR) {
      result_ = array_literal_expr(builder_, 0);
    }
    else if (root_ == ARRAY_OFFSET_ACCESS) {
      result_ = array_offset_access(builder_, 0);
    }
    else if (root_ == ARRAY_PAIR_ITEM) {
      result_ = array_pair_item(builder_, 0);
    }
    else if (root_ == ARRAY_PAIR_LIST) {
      result_ = array_pair_list(builder_, 0);
    }
    else if (root_ == ARRAY_TYPE) {
      result_ = array_type(builder_, 0);
    }
    else if (root_ == ASSIGNMENT_EXPR) {
      result_ = assignment_expr(builder_, 0);
    }
    else if (root_ == ASSIGNMENT_LIST) {
      result_ = assignment_list(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_STATIC_SCALAR_LIST) {
      result_ = attribute_static_scalar_list(builder_, 0);
    }
    else if (root_ == AWAIT_ASSIGN_EXPR) {
      result_ = await_assign_expr(builder_, 0);
    }
    else if (root_ == AWAIT_EXPR) {
      result_ = await_expr(builder_, 0);
    }
    else if (root_ == AWAIT_LIST_ASSIGN_EXPR) {
      result_ = await_list_assign_expr(builder_, 0);
    }
    else if (root_ == BACKTICKS_EXPR) {
      result_ = backticks_expr(builder_, 0);
    }
    else if (root_ == BITWISE_EXPR) {
      result_ = bitwise_expr(builder_, 0);
    }
    else if (root_ == BITWISE_OPERATOR) {
      result_ = bitwise_operator(builder_, 0);
    }
    else if (root_ == BLOCK_STATEMENT) {
      result_ = block_statement(builder_, 0);
    }
    else if (root_ == BREAK_STATEMENT) {
      result_ = break_statement(builder_, 0);
    }
    else if (root_ == CALLABLE_FUNCTION_CALL_EXPR) {
      result_ = callable_function_call_expr(builder_, 0);
    }
    else if (root_ == CALLABLE_TYPE) {
      result_ = callable_type(builder_, 0);
    }
    else if (root_ == CALLABLE_VARIABLE) {
      result_ = callable_variable(builder_, 0);
    }
    else if (root_ == CALLING_PARAMETER_ITEM) {
      result_ = calling_parameter_item(builder_, 0);
    }
    else if (root_ == CASE_BLOCK) {
      result_ = case_block(builder_, 0);
    }
    else if (root_ == CASE_LIST) {
      result_ = case_list(builder_, 0);
    }
    else if (root_ == CASE_SEPARATOR) {
      result_ = case_separator(builder_, 0);
    }
    else if (root_ == CAST_EXPR) {
      result_ = cast_expr(builder_, 0);
    }
    else if (root_ == CAST_OPERATOR) {
      result_ = cast_operator(builder_, 0);
    }
    else if (root_ == CLASS_CONSTANT) {
      result_ = class_constant(builder_, 0);
    }
    else if (root_ == CLASS_DECLARATION_STATEMENT) {
      result_ = class_declaration_statement(builder_, 0);
    }
    else if (root_ == CLASS_METHOD_CALL_EXPR) {
      result_ = class_method_call_expr(builder_, 0);
    }
    else if (root_ == CLASS_NAME_REFERENCE) {
      result_ = class_name_reference(builder_, 0);
    }
    else if (root_ == CLASS_NAMESPACE_STRING_TYPEARGS) {
      result_ = class_namespace_string_typeargs(builder_, 0);
    }
    else if (root_ == CLASS_STATEMENT) {
      result_ = class_statement(builder_, 0);
    }
    else if (root_ == CLASS_STATEMENT_LIST) {
      result_ = class_statement_list(builder_, 0);
    }
    else if (root_ == CLASS_VARIABLE_DECLARATION) {
      result_ = class_variable_declaration(builder_, 0);
    }
    else if (root_ == CLASS_VARIABLE_DECLARATIONS) {
      result_ = class_variable_declarations(builder_, 0);
    }
    else if (root_ == CLONE_EXPR) {
      result_ = clone_expr(builder_, 0);
    }
    else if (root_ == CLOSURE_EXPR) {
      result_ = closure_expr(builder_, 0);
    }
    else if (root_ == COLLECTION_LITERAL_EXPR) {
      result_ = collection_literal_expr(builder_, 0);
    }
    else if (root_ == COMPARATIVE_EXPR) {
      result_ = comparative_expr(builder_, 0);
    }
    else if (root_ == COMPARATIVE_OPERATOR) {
      result_ = comparative_operator(builder_, 0);
    }
    else if (root_ == COMPOUND_VARIABLE) {
      result_ = compound_variable(builder_, 0);
    }
    else if (root_ == CONSTANT_ASSIGNMENT) {
      result_ = constant_assignment(builder_, 0);
    }
    else if (root_ == CONSTANT_DECLARATION) {
      result_ = constant_declaration(builder_, 0);
    }
    else if (root_ == CONSTANT_DECLARATION_STATEMENT) {
      result_ = constant_declaration_statement(builder_, 0);
    }
    else if (root_ == CONTINUE_STATEMENT) {
      result_ = continue_statement(builder_, 0);
    }
    else if (root_ == CTOR_ARGUMENTS) {
      result_ = ctor_arguments(builder_, 0);
    }
    else if (root_ == DECLARE_ASSIGNMENT) {
      result_ = declare_assignment(builder_, 0);
    }
    else if (root_ == DECLARE_LIST) {
      result_ = declare_list(builder_, 0);
    }
    else if (root_ == DECLARE_NEW_STATEMENT) {
      result_ = declare_new_statement(builder_, 0);
    }
    else if (root_ == DECLARE_STATEMENT) {
      result_ = declare_statement(builder_, 0);
    }
    else if (root_ == DECLARE_STATEMENT_BODY) {
      result_ = declare_statement_body(builder_, 0);
    }
    else if (root_ == DEFAULT_CASE_BLOCK) {
      result_ = default_case_block(builder_, 0);
    }
    else if (root_ == DIM_EXPR) {
      result_ = dim_expr(builder_, 0);
    }
    else if (root_ == DIM_EXPR_BASE) {
      result_ = dim_expr_base(builder_, 0);
    }
    else if (root_ == DIMMABLE_VARIABLE_ACCESS_EXPR) {
      result_ = dimmable_variable_access_expr(builder_, 0);
    }
    else if (root_ == DIMMABLE_VARIABLE_NO_CALLS_ACCESS) {
      result_ = dimmable_variable_no_calls_access(builder_, 0);
    }
    else if (root_ == DO_WHILE_STATEMENT) {
      result_ = do_while_statement(builder_, 0);
    }
    else if (root_ == ECHO_STATEMENT) {
      result_ = echo_statement(builder_, 0);
    }
    else if (root_ == ELSE_SINGLE) {
      result_ = else_single(builder_, 0);
    }
    else if (root_ == ELSEIF_BODY) {
      result_ = elseif_body(builder_, 0);
    }
    else if (root_ == ELSEIF_LIST) {
      result_ = elseif_list(builder_, 0);
    }
    else if (root_ == ENCAPS_LIST) {
      result_ = encaps_list(builder_, 0);
    }
    else if (root_ == ENCAPS_VAR) {
      result_ = encaps_var(builder_, 0);
    }
    else if (root_ == ENCAPS_VAR_OFFSET) {
      result_ = encaps_var_offset(builder_, 0);
    }
    else if (root_ == ENUM_CONSTANT_DECLARATION) {
      result_ = enum_constant_declaration(builder_, 0);
    }
    else if (root_ == ENUM_DECLARATION_STATEMENT) {
      result_ = enum_declaration_statement(builder_, 0);
    }
    else if (root_ == ENUM_STATEMENT) {
      result_ = enum_statement(builder_, 0);
    }
    else if (root_ == ENUM_STATEMENT_LIST) {
      result_ = enum_statement_list(builder_, 0);
    }
    else if (root_ == ESPECIAL_PARENTHESISED_EXPR) {
      result_ = especial_parenthesised_expr(builder_, 0);
    }
    else if (root_ == EXIT_EXPR) {
      result_ = exit_expr(builder_, 0);
    }
    else if (root_ == EXPR_LIST) {
      result_ = expr_list(builder_, 0);
    }
    else if (root_ == EXPR_STATEMENT) {
      result_ = expr_statement(builder_, 0);
    }
    else if (root_ == EXTENDS_FROM) {
      result_ = extends_from(builder_, 0);
    }
    else if (root_ == FOR_NEW_STATEMENT) {
      result_ = for_new_statement(builder_, 0);
    }
    else if (root_ == FOR_STATEMENT) {
      result_ = for_statement(builder_, 0);
    }
    else if (root_ == FOR_STATEMENT_BODY) {
      result_ = for_statement_body(builder_, 0);
    }
    else if (root_ == FOREACH_LIST_ASSIGNMENT) {
      result_ = foreach_list_assignment(builder_, 0);
    }
    else if (root_ == FOREACH_NEW_STATEMENT) {
      result_ = foreach_new_statement(builder_, 0);
    }
    else if (root_ == FOREACH_OPTIONAL_ARG) {
      result_ = foreach_optional_arg(builder_, 0);
    }
    else if (root_ == FOREACH_STATEMENT) {
      result_ = foreach_statement(builder_, 0);
    }
    else if (root_ == FOREACH_STATEMENT_BODY) {
      result_ = foreach_statement_body(builder_, 0);
    }
    else if (root_ == FOREACH_VARIABLE) {
      result_ = foreach_variable(builder_, 0);
    }
    else if (root_ == FROM_CLAUSE) {
      result_ = from_clause(builder_, 0);
    }
    else if (root_ == FULLY_QUALIFIED_CLASS_NAME) {
      result_ = fully_qualified_class_name(builder_, 0);
    }
    else if (root_ == FUNCTION_BODY) {
      result_ = function_body(builder_, 0);
    }
    else if (root_ == FUNCTION_CALL_PARAMETER_LIST) {
      result_ = function_call_parameter_list(builder_, 0);
    }
    else if (root_ == FUNCTION_DECLARATION_STATEMENT) {
      result_ = function_declaration_statement(builder_, 0);
    }
    else if (root_ == GLOBAL_STATEMENT) {
      result_ = global_statement(builder_, 0);
    }
    else if (root_ == GLOBAL_VAR) {
      result_ = global_var(builder_, 0);
    }
    else if (root_ == GLOBAL_VAR_LIST) {
      result_ = global_var_list(builder_, 0);
    }
    else if (root_ == GOTO_STATEMENT) {
      result_ = goto_statement(builder_, 0);
    }
    else if (root_ == GROUP_CLAUSE) {
      result_ = group_clause(builder_, 0);
    }
    else if (root_ == HALT_COMPILER_STATEMENT) {
      result_ = halt_compiler_statement(builder_, 0);
    }
    else if (root_ == HH_FUNC_TYPE_LIST) {
      result_ = hh_func_type_list(builder_, 0);
    }
    else if (root_ == HH_FUNCTION_TYPE) {
      result_ = hh_function_type(builder_, 0);
    }
    else if (root_ == HH_NEW_TYPE_DECLARATION_STATEMENT) {
      result_ = hh_new_type_declaration_statement(builder_, 0);
    }
    else if (root_ == HH_NULLABLE_TYPE) {
      result_ = hh_nullable_type(builder_, 0);
    }
    else if (root_ == HH_OPT_RETURN_TYPE) {
      result_ = hh_opt_return_type(builder_, 0);
    }
    else if (root_ == HH_SHAPE_MEMBER_LIST) {
      result_ = hh_shape_member_list(builder_, 0);
    }
    else if (root_ == HH_SHAPE_MEMBER_TYPE) {
      result_ = hh_shape_member_type(builder_, 0);
    }
    else if (root_ == HH_SHAPE_TYPE) {
      result_ = hh_shape_type(builder_, 0);
    }
    else if (root_ == HH_SOFT_TYPE) {
      result_ = hh_soft_type(builder_, 0);
    }
    else if (root_ == HH_TUPLE_TYPE) {
      result_ = hh_tuple_type(builder_, 0);
    }
    else if (root_ == HH_TYPE_DECLARATION_STATEMENT) {
      result_ = hh_type_declaration_statement(builder_, 0);
    }
    else if (root_ == HH_TYPE_LIST) {
      result_ = hh_type_list(builder_, 0);
    }
    else if (root_ == HH_TYPEARGS_OPT) {
      result_ = hh_typeargs_opt(builder_, 0);
    }
    else if (root_ == HH_TYPEVAR) {
      result_ = hh_typevar(builder_, 0);
    }
    else if (root_ == HH_TYPEVAR_ITEM) {
      result_ = hh_typevar_item(builder_, 0);
    }
    else if (root_ == HH_TYPEVAR_LIST) {
      result_ = hh_typevar_list(builder_, 0);
    }
    else if (root_ == HH_TYPEVAR_VARIANCE) {
      result_ = hh_typevar_variance(builder_, 0);
    }
    else if (root_ == HH_XHP_TYPE) {
      result_ = hh_xhp_type(builder_, 0);
    }
    else if (root_ == HTML_STATEMENT) {
      result_ = html_statement(builder_, 0);
    }
    else if (root_ == IDENT_TYPE) {
      result_ = ident_type(builder_, 0);
    }
    else if (root_ == IDENTIFIER) {
      result_ = identifier(builder_, 0);
    }
    else if (root_ == IF_STATEMENT) {
      result_ = if_statement(builder_, 0);
    }
    else if (root_ == IMPLEMENTS_LIST) {
      result_ = implements_list(builder_, 0);
    }
    else if (root_ == INNER_STATEMENT_LIST) {
      result_ = inner_statement_list(builder_, 0);
    }
    else if (root_ == INSTANCEOF_EXPR) {
      result_ = instanceof_expr(builder_, 0);
    }
    else if (root_ == INTERFACE_DECLARATION_STATEMENT) {
      result_ = interface_declaration_statement(builder_, 0);
    }
    else if (root_ == INTERFACE_EXTENDS_LIST) {
      result_ = interface_extends_list(builder_, 0);
    }
    else if (root_ == INTERFACE_LIST) {
      result_ = interface_list(builder_, 0);
    }
    else if (root_ == INTERNAL_EMPTY_EXPR) {
      result_ = internal_empty_expr(builder_, 0);
    }
    else if (root_ == INTERNAL_EVAL_EXPR) {
      result_ = internal_eval_expr(builder_, 0);
    }
    else if (root_ == INTERNAL_INCLUDE_EXPR) {
      result_ = internal_include_expr(builder_, 0);
    }
    else if (root_ == INTERNAL_ISSET_EXPR) {
      result_ = internal_isset_expr(builder_, 0);
    }
    else if (root_ == INTERNAL_REQUIRE_EXPR) {
      result_ = internal_require_expr(builder_, 0);
    }
    else if (root_ == INTERNAL_TUPLE_EXPR) {
      result_ = internal_tuple_expr(builder_, 0);
    }
    else if (root_ == JOIN_CLAUSE) {
      result_ = join_clause(builder_, 0);
    }
    else if (root_ == JOIN_INTO_CLAUSE) {
      result_ = join_into_clause(builder_, 0);
    }
    else if (root_ == LABEL_STATEMENT) {
      result_ = label_statement(builder_, 0);
    }
    else if (root_ == LAMBDA_BODY) {
      result_ = lambda_body(builder_, 0);
    }
    else if (root_ == LAMBDA_EXPR) {
      result_ = lambda_expr(builder_, 0);
    }
    else if (root_ == LAMBDA_USE_VARS) {
      result_ = lambda_use_vars(builder_, 0);
    }
    else if (root_ == LET_CLAUSE) {
      result_ = let_clause(builder_, 0);
    }
    else if (root_ == LEXICAL_VAR_LIST) {
      result_ = lexical_var_list(builder_, 0);
    }
    else if (root_ == LIST_ASSIGNMENT_EXPR) {
      result_ = list_assignment_expr(builder_, 0);
    }
    else if (root_ == LITERAL_EXPR) {
      result_ = literal_expr(builder_, 0);
    }
    else if (root_ == LITERAL_SCALAR_AE) {
      result_ = literal_scalar_ae(builder_, 0);
    }
    else if (root_ == LOGICAL_EXPR) {
      result_ = logical_expr(builder_, 0);
    }
    else if (root_ == LOGICAL_OPERATOR) {
      result_ = logical_operator(builder_, 0);
    }
    else if (root_ == MAP_ARRAY_LITERAL_EXPR) {
      result_ = map_array_literal_expr(builder_, 0);
    }
    else if (root_ == MEMBER_MODIFIER) {
      result_ = member_modifier(builder_, 0);
    }
    else if (root_ == MEMBER_VARIABLE_EXPR) {
      result_ = member_variable_expr(builder_, 0);
    }
    else if (root_ == METHOD_CALL_EXPR) {
      result_ = method_call_expr(builder_, 0);
    }
    else if (root_ == METHOD_FUNCTION_DECLARATION) {
      result_ = method_function_declaration(builder_, 0);
    }
    else if (root_ == METHOD_MODIFIERS) {
      result_ = method_modifiers(builder_, 0);
    }
    else if (root_ == MULTIPLICATIVE_EXPR) {
      result_ = multiplicative_expr(builder_, 0);
    }
    else if (root_ == MULTIPLICATIVE_OPERATOR) {
      result_ = multiplicative_operator(builder_, 0);
    }
    else if (root_ == NAMESPACE_DECLARATION_STATEMENT) {
      result_ = namespace_declaration_statement(builder_, 0);
    }
    else if (root_ == NAMESPACE_NAME) {
      result_ = namespace_name(builder_, 0);
    }
    else if (root_ == NAMESPACE_STRING) {
      result_ = namespace_string(builder_, 0);
    }
    else if (root_ == NAMESPACE_STRING_TYPEARGS) {
      result_ = namespace_string_typeargs(builder_, 0);
    }
    else if (root_ == NEW_ELSE_SINGLE) {
      result_ = new_else_single(builder_, 0);
    }
    else if (root_ == NEW_ELSEIF_BODY) {
      result_ = new_elseif_body(builder_, 0);
    }
    else if (root_ == NEW_ELSEIF_LIST) {
      result_ = new_elseif_list(builder_, 0);
    }
    else if (root_ == NEW_EXPR) {
      result_ = new_expr(builder_, 0);
    }
    else if (root_ == ORDERBY_CLAUSE) {
      result_ = orderby_clause(builder_, 0);
    }
    else if (root_ == ORDERING) {
      result_ = ordering(builder_, 0);
    }
    else if (root_ == ORDERING_DIRECTION) {
      result_ = ordering_direction(builder_, 0);
    }
    else if (root_ == ORDERINGS) {
      result_ = orderings(builder_, 0);
    }
    else if (root_ == PARAMETER_ITEM) {
      result_ = parameter_item(builder_, 0);
    }
    else if (root_ == PARAMETER_LIST) {
      result_ = parameter_list(builder_, 0);
    }
    else if (root_ == PARAMETER_MODIFIER) {
      result_ = parameter_modifier(builder_, 0);
    }
    else if (root_ == PARENTHESIZED_EXPR) {
      result_ = parenthesized_expr(builder_, 0);
    }
    else if (root_ == PREFIX_EXPR) {
      result_ = prefix_expr(builder_, 0);
    }
    else if (root_ == PREFIX_OPERATOR) {
      result_ = prefix_operator(builder_, 0);
    }
    else if (root_ == PRINT_EXPR) {
      result_ = print_expr(builder_, 0);
    }
    else if (root_ == QUERY_ASSIGN_EXPR) {
      result_ = query_assign_expr(builder_, 0);
    }
    else if (root_ == QUERY_BODY) {
      result_ = query_body(builder_, 0);
    }
    else if (root_ == QUERY_BODY_CLAUSE) {
      result_ = query_body_clause(builder_, 0);
    }
    else if (root_ == QUERY_BODY_CLAUSES) {
      result_ = query_body_clauses(builder_, 0);
    }
    else if (root_ == QUERY_CONTINUATION) {
      result_ = query_continuation(builder_, 0);
    }
    else if (root_ == QUERY_EXPR) {
      result_ = query_expr(builder_, 0);
    }
    else if (root_ == QUERY_HEAD) {
      result_ = query_head(builder_, 0);
    }
    else if (root_ == REFERENCE_VARIABLE) {
      result_ = reference_variable(builder_, 0);
    }
    else if (root_ == RETURN_STATEMENT) {
      result_ = return_statement(builder_, 0);
    }
    else if (root_ == SCALAR_EXPR) {
      result_ = scalar_expr(builder_, 0);
    }
    else if (root_ == SELECT_CLAUSE) {
      result_ = select_clause(builder_, 0);
    }
    else if (root_ == SELECT_OR_GROUP_CLAUSE) {
      result_ = select_or_group_clause(builder_, 0);
    }
    else if (root_ == SEMICOLON_STATEMENT) {
      result_ = semicolon_statement(builder_, 0);
    }
    else if (root_ == SHAPE_KEYNAME) {
      result_ = shape_keyname(builder_, 0);
    }
    else if (root_ == SHAPE_LITERAL_EXPR) {
      result_ = shape_literal_expr(builder_, 0);
    }
    else if (root_ == SHAPE_PAIR) {
      result_ = shape_pair(builder_, 0);
    }
    else if (root_ == SHAPE_PAIR_LIST) {
      result_ = shape_pair_list(builder_, 0);
    }
    else if (root_ == SHAPE_PAIR_STATIC) {
      result_ = shape_pair_static(builder_, 0);
    }
    else if (root_ == SHIFT_EXPR) {
      result_ = shift_expr(builder_, 0);
    }
    else if (root_ == SHIFT_OPERATOR) {
      result_ = shift_operator(builder_, 0);
    }
    else if (root_ == SIMPLE_FUNCTION_CALL_EXPR) {
      result_ = simple_function_call_expr(builder_, 0);
    }
    else if (root_ == STATIC_ADDITIVE_OR_CONCATENATION_EXPR) {
      result_ = static_additive_or_concatenation_expr(builder_, 0);
    }
    else if (root_ == STATIC_ARRAY_EXPR) {
      result_ = static_array_expr(builder_, 0);
    }
    else if (root_ == STATIC_ARRAY_ITEM) {
      result_ = static_array_item(builder_, 0);
    }
    else if (root_ == STATIC_ARRAY_ITEM_AE) {
      result_ = static_array_item_ae(builder_, 0);
    }
    else if (root_ == STATIC_ARRAY_PAIR_LIST) {
      result_ = static_array_pair_list(builder_, 0);
    }
    else if (root_ == STATIC_ARRAY_PAIR_LIST_AE) {
      result_ = static_array_pair_list_ae(builder_, 0);
    }
    else if (root_ == STATIC_ASSIGNMENT) {
      result_ = static_assignment(builder_, 0);
    }
    else if (root_ == STATIC_BITWISE_EXPR) {
      result_ = static_bitwise_expr(builder_, 0);
    }
    else if (root_ == STATIC_CLASS_CONSTANT) {
      result_ = static_class_constant(builder_, 0);
    }
    else if (root_ == STATIC_CLASS_NAME) {
      result_ = static_class_name(builder_, 0);
    }
    else if (root_ == STATIC_CLASS_VARIABLE_EXPR) {
      result_ = static_class_variable_expr(builder_, 0);
    }
    else if (root_ == STATIC_COLLECTION_LITERAL) {
      result_ = static_collection_literal(builder_, 0);
    }
    else if (root_ == STATIC_COMPARATIVE_EXPR) {
      result_ = static_comparative_expr(builder_, 0);
    }
    else if (root_ == STATIC_EXPR) {
      result_ = static_expr(builder_, 0);
    }
    else if (root_ == STATIC_LOGICAL_EXPR) {
      result_ = static_logical_expr(builder_, 0);
    }
    else if (root_ == STATIC_MAP_ARRAY_LITERAL) {
      result_ = static_map_array_literal(builder_, 0);
    }
    else if (root_ == STATIC_MULTIPLICATIVE_EXPR) {
      result_ = static_multiplicative_expr(builder_, 0);
    }
    else if (root_ == STATIC_NUMERIC_SCALAR_AE) {
      result_ = static_numeric_scalar_ae(builder_, 0);
    }
    else if (root_ == STATIC_PARENTHESIZED_EXPR) {
      result_ = static_parenthesized_expr(builder_, 0);
    }
    else if (root_ == STATIC_PREFIX_EXPR) {
      result_ = static_prefix_expr(builder_, 0);
    }
    else if (root_ == STATIC_PREFIX_OPERATOR) {
      result_ = static_prefix_operator(builder_, 0);
    }
    else if (root_ == STATIC_SCALAR_AE) {
      result_ = static_scalar_ae(builder_, 0);
    }
    else if (root_ == STATIC_SCALAR_LIST_AE) {
      result_ = static_scalar_list_ae(builder_, 0);
    }
    else if (root_ == STATIC_SHAPE_EXPR) {
      result_ = static_shape_expr(builder_, 0);
    }
    else if (root_ == STATIC_SHAPE_PAIR_ITEM) {
      result_ = static_shape_pair_item(builder_, 0);
    }
    else if (root_ == STATIC_SHAPE_PAIR_LIST) {
      result_ = static_shape_pair_list(builder_, 0);
    }
    else if (root_ == STATIC_SHAPE_PAIR_LIST_AE) {
      result_ = static_shape_pair_list_ae(builder_, 0);
    }
    else if (root_ == STATIC_SHIFT_EXPR) {
      result_ = static_shift_expr(builder_, 0);
    }
    else if (root_ == STATIC_STATEMENT) {
      result_ = static_statement(builder_, 0);
    }
    else if (root_ == STATIC_TERNARY_EXPR) {
      result_ = static_ternary_expr(builder_, 0);
    }
    else if (root_ == STATIC_VAR_LIST) {
      result_ = static_var_list(builder_, 0);
    }
    else if (root_ == STATIC_VARRAY_LITERAL) {
      result_ = static_varray_literal(builder_, 0);
    }
    else if (root_ == SWITCH_CASE_LIST) {
      result_ = switch_case_list(builder_, 0);
    }
    else if (root_ == SWITCH_NEW_STATEMENT) {
      result_ = switch_new_statement(builder_, 0);
    }
    else if (root_ == SWITCH_STATEMENT) {
      result_ = switch_statement(builder_, 0);
    }
    else if (root_ == SWITCH_STATEMENT_LIST) {
      result_ = switch_statement_list(builder_, 0);
    }
    else if (root_ == TERNARY_EXPR) {
      result_ = ternary_expr(builder_, 0);
    }
    else if (root_ == THROW_STATEMENT) {
      result_ = throw_statement(builder_, 0);
    }
    else if (root_ == TRAIT_ALIAS_RULE) {
      result_ = trait_alias_rule(builder_, 0);
    }
    else if (root_ == TRAIT_ALIAS_RULE_METHOD) {
      result_ = trait_alias_rule_method(builder_, 0);
    }
    else if (root_ == TRAIT_DECLARATION_STATEMENT) {
      result_ = trait_declaration_statement(builder_, 0);
    }
    else if (root_ == TRAIT_LIST) {
      result_ = trait_list(builder_, 0);
    }
    else if (root_ == TRAIT_PRECEDENCE_RULE) {
      result_ = trait_precedence_rule(builder_, 0);
    }
    else if (root_ == TRAIT_REQUIRE_DECLARATION) {
      result_ = trait_require_declaration(builder_, 0);
    }
    else if (root_ == TRAIT_RULES) {
      result_ = trait_rules(builder_, 0);
    }
    else if (root_ == TRAIT_USE_DECLARATION) {
      result_ = trait_use_declaration(builder_, 0);
    }
    else if (root_ == TRY_CATCH) {
      result_ = try_catch(builder_, 0);
    }
    else if (root_ == TRY_FINALLY) {
      result_ = try_finally(builder_, 0);
    }
    else if (root_ == TRY_STATEMENT) {
      result_ = try_statement(builder_, 0);
    }
    else if (root_ == UNSET_STATEMENT) {
      result_ = unset_statement(builder_, 0);
    }
    else if (root_ == USE_DECLARATION) {
      result_ = use_declaration(builder_, 0);
    }
    else if (root_ == USE_DECLARATION_STATEMENT) {
      result_ = use_declaration_statement(builder_, 0);
    }
    else if (root_ == USE_DECLARATIONS) {
      result_ = use_declarations(builder_, 0);
    }
    else if (root_ == USER_ATTRIBUTE) {
      result_ = user_attribute(builder_, 0);
    }
    else if (root_ == USER_ATTRIBUTE_LIST) {
      result_ = user_attribute_list(builder_, 0);
    }
    else if (root_ == USER_ATTRIBUTES) {
      result_ = user_attributes(builder_, 0);
    }
    else if (root_ == VARIABLE_LIST) {
      result_ = variable_list(builder_, 0);
    }
    else if (root_ == VARIABLE_MODIFIERS) {
      result_ = variable_modifiers(builder_, 0);
    }
    else if (root_ == VARIABLE_WITHOUT_OBJECTS_EXPR) {
      result_ = variable_without_objects_expr(builder_, 0);
    }
    else if (root_ == VARRAY_LITERAL_EXPR) {
      result_ = varray_literal_expr(builder_, 0);
    }
    else if (root_ == WHERE_CLAUSE) {
      result_ = where_clause(builder_, 0);
    }
    else if (root_ == WHILE_NEW_STATEMENT) {
      result_ = while_new_statement(builder_, 0);
    }
    else if (root_ == WHILE_STATEMENT) {
      result_ = while_statement(builder_, 0);
    }
    else if (root_ == WHILE_STATEMENT_BODY) {
      result_ = while_statement_body(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE) {
      result_ = xhp_attribute(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_DECL) {
      result_ = xhp_attribute_decl(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_DECL_TYPE) {
      result_ = xhp_attribute_decl_type(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_DECLARATION) {
      result_ = xhp_attribute_declaration(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_DEFAULT) {
      result_ = xhp_attribute_default(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_ENUM) {
      result_ = xhp_attribute_enum(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_IS_REQUIRED) {
      result_ = xhp_attribute_is_required(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_NAME) {
      result_ = xhp_attribute_name(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_STMT) {
      result_ = xhp_attribute_stmt(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_VALUE) {
      result_ = xhp_attribute_value(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTES) {
      result_ = xhp_attributes(builder_, 0);
    }
    else if (root_ == XHP_BAREWORD) {
      result_ = xhp_bareword(builder_, 0);
    }
    else if (root_ == XHP_CATEGORY_DECLARATION) {
      result_ = xhp_category_declaration(builder_, 0);
    }
    else if (root_ == XHP_CATEGORY_STMT) {
      result_ = xhp_category_stmt(builder_, 0);
    }
    else if (root_ == XHP_CHILD) {
      result_ = xhp_child(builder_, 0);
    }
    else if (root_ == XHP_CHILDREN) {
      result_ = xhp_children(builder_, 0);
    }
    else if (root_ == XHP_CHILDREN_DECL_EXPR) {
      result_ = xhp_children_decl_expr(builder_, 0);
    }
    else if (root_ == XHP_CHILDREN_DECL_TAG) {
      result_ = xhp_children_decl_tag(builder_, 0);
    }
    else if (root_ == XHP_CHILDREN_DECLARATION) {
      result_ = xhp_children_declaration(builder_, 0);
    }
    else if (root_ == XHP_CHILDREN_PAREN_EXPR) {
      result_ = xhp_children_paren_expr(builder_, 0);
    }
    else if (root_ == XHP_CHILDREN_STMT) {
      result_ = xhp_children_stmt(builder_, 0);
    }
    else if (root_ == XHP_EXPR) {
      result_ = xhp_expr(builder_, 0);
    }
    else if (root_ == XHP_LABEL_WS) {
      result_ = xhp_label_ws(builder_, 0);
    }
    else if (root_ == XHP_OPT_END_LABEL) {
      result_ = xhp_opt_end_label(builder_, 0);
    }
    else if (root_ == XHP_TAG) {
      result_ = xhp_tag(builder_, 0);
    }
    else if (root_ == XHP_TAG_BODY) {
      result_ = xhp_tag_body(builder_, 0);
    }
    else if (root_ == YIELD_ASSIGN_EXPR) {
      result_ = yield_assign_expr(builder_, 0);
    }
    else if (root_ == YIELD_EXPR) {
      result_ = yield_expr(builder_, 0);
    }
    else if (root_ == YIELD_LIST_ASSIGN_EXPR) {
      result_ = yield_list_assign_expr(builder_, 0);
    }
    else if (root_ == YIELD_STATEMENT) {
      result_ = yield_statement(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return hackFile(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(FUNCTION_DECLARATION_STATEMENT, METHOD_FUNCTION_DECLARATION),
  };

  /* ********************************************************** */
  // try_catch*
  static boolean additional_catches(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additional_catches")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!try_catch(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "additional_catches", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // additive_or_concatenation_operator multiplicative_expr_wrapper
  public static boolean additive_or_concatenation_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_or_concatenation_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<additive or concatenation expr>");
    result_ = additive_or_concatenation_operator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && multiplicative_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ADDITIVE_OR_CONCATENATION_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // multiplicative_expr_wrapper additive_or_concatenation_expr*
  static boolean additive_or_concatenation_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_or_concatenation_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = multiplicative_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && additive_or_concatenation_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // additive_or_concatenation_expr*
  private static boolean additive_or_concatenation_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_or_concatenation_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!additive_or_concatenation_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "additive_or_concatenation_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // '+'|'-'|'.'
  public static boolean additive_or_concatenation_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_or_concatenation_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<additive or concatenation operator>");
    result_ = consumeToken(builder_, T_PLUS);
    if (!result_) result_ = consumeToken(builder_, T_MINUS);
    if (!result_) result_ = consumeToken(builder_, T_DOT);
    exit_section_(builder_, level_, marker_, ADDITIVE_OR_CONCATENATION_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // array_offset_access | '{' expr '}'
  public static boolean array_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_access")) return false;
    if (!nextTokenIs(builder_, "<array access>", T_LBRACKET, T_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array access>");
    result_ = array_offset_access(builder_, level_ + 1);
    if (!result_) result_ = array_access_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARRAY_ACCESS, result_, false, null);
    return result_;
  }

  // '{' expr '}'
  private static boolean array_access_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_access_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ARRAY '(' array_pair_list ')'
  static boolean array_literal_base(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_literal_base")) return false;
    if (!nextTokenIs(builder_, T_ARRAY)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_ARRAY);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, array_pair_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // array_literal_base | short_array_literal_base
  public static boolean array_literal_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_literal_expr")) return false;
    if (!nextTokenIs(builder_, "<array literal expr>", T_LBRACKET, T_ARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array literal expr>");
    result_ = array_literal_base(builder_, level_ + 1);
    if (!result_) result_ = short_array_literal_base(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARRAY_LITERAL_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '[' expr ']'
  public static boolean array_offset_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_offset_access")) return false;
    if (!nextTokenIs(builder_, T_LBRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACKET);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, ARRAY_OFFSET_ACCESS, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr (T_DOUBLE_ARROW (expr|(&variable)))?
  public static boolean array_pair_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array pair item>");
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && array_pair_item_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARRAY_PAIR_ITEM, result_, false, null);
    return result_;
  }

  // (T_DOUBLE_ARROW (expr|(&variable)))?
  private static boolean array_pair_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_item_1")) return false;
    array_pair_item_1_0(builder_, level_ + 1);
    return true;
  }

  // T_DOUBLE_ARROW (expr|(&variable))
  private static boolean array_pair_item_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_item_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && array_pair_item_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr|(&variable)
  private static boolean array_pair_item_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_item_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = array_pair_item_1_0_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &variable
  private static boolean array_pair_item_1_0_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_item_1_0_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_, null);
    result_ = variable(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (array_pair_item (',' array_pair_item)* ','?)?
  public static boolean array_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array pair list>");
    array_pair_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARRAY_PAIR_LIST, true, false, null);
    return true;
  }

  // array_pair_item (',' array_pair_item)* ','?
  private static boolean array_pair_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = array_pair_item(builder_, level_ + 1);
    result_ = result_ && array_pair_list_0_1(builder_, level_ + 1);
    result_ = result_ && array_pair_list_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' array_pair_item)*
  private static boolean array_pair_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!array_pair_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_pair_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' array_pair_item
  private static boolean array_pair_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && array_pair_item(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean array_pair_list_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_list_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_ARRAY hh_typeargs_opt?
  public static boolean array_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type")) return false;
    if (!nextTokenIs(builder_, T_ARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ARRAY);
    result_ = result_ && array_type_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ARRAY_TYPE, result_);
    return result_;
  }

  // hh_typeargs_opt?
  private static boolean array_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_1")) return false;
    hh_typeargs_opt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // assignment_operator ternary_expr_wrapper
  public static boolean assignment_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<assignment expr>");
    result_ = assignment_operator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && ternary_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ASSIGNMENT_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ternary_expr_wrapper assignment_or_list_expr*
  static boolean assignment_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ternary_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && assignment_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // assignment_or_list_expr*
  private static boolean assignment_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!assignment_or_list_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "assignment_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // ((variable | (T_LIST '(' assignment_list ')')) (',' (variable | (T_LIST '(' assignment_list ')')))*)?
  public static boolean assignment_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<assignment list>");
    assignment_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ASSIGNMENT_LIST, true, false, null);
    return true;
  }

  // (variable | (T_LIST '(' assignment_list ')')) (',' (variable | (T_LIST '(' assignment_list ')')))*
  private static boolean assignment_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignment_list_0_0(builder_, level_ + 1);
    result_ = result_ && assignment_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable | (T_LIST '(' assignment_list ')')
  private static boolean assignment_list_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = assignment_list_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_LIST '(' assignment_list ')'
  private static boolean assignment_list_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_0_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LIST);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && assignment_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' (variable | (T_LIST '(' assignment_list ')')))*
  private static boolean assignment_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!assignment_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "assignment_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' (variable | (T_LIST '(' assignment_list ')'))
  private static boolean assignment_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && assignment_list_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable | (T_LIST '(' assignment_list ')')
  private static boolean assignment_list_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_0_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = assignment_list_0_1_0_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_LIST '(' assignment_list ')'
  private static boolean assignment_list_0_1_0_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_0_1_0_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LIST);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && assignment_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ('=' ('&' T_NEW)?) | T_PLUS_EQUAL | T_MINUS_EQUAL | T_MUL_EQUAL | T_DIV_EQUAL | T_CONCAT_EQUAL | T_MOD_EQUAL | T_AND_EQUAL | T_OR_EQUAL | T_XOR_EQUAL | T_SL_EQUAL | T_SR_EQUAL | T_POW_EQUAL
  static boolean assignment_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignment_operator_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_PLUS_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_MINUS_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_MUL_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_DIV_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_CONCAT_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_MOD_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_AND_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_OR_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_XOR_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_SL_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_SR_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_POW_EQUAL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '=' ('&' T_NEW)?
  private static boolean assignment_operator_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_operator_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EQUAL);
    result_ = result_ && assignment_operator_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('&' T_NEW)?
  private static boolean assignment_operator_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_operator_0_1")) return false;
    assignment_operator_0_1_0(builder_, level_ + 1);
    return true;
  }

  // '&' T_NEW
  private static boolean assignment_operator_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_operator_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AND);
    result_ = result_ && consumeToken(builder_, T_NEW);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // assignment_expr | list_assignment_expr
  static boolean assignment_or_list_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_or_list_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignment_expr(builder_, level_ + 1);
    if (!result_) result_ = list_assignment_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' static_scalar_list_ae ')'
  public static boolean attribute_static_scalar_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_static_scalar_list")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && static_scalar_list_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, ATTRIBUTE_STATIC_SCALAR_LIST, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable '=' await_expr
  public static boolean await_assign_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "await_assign_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<await assign expr>");
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    pinned_ = result_; // pin = 2
    result_ = result_ && await_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, AWAIT_ASSIGN_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_AWAIT expr
  public static boolean await_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "await_expr")) return false;
    if (!nextTokenIs(builder_, T_AWAIT)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_AWAIT);
    pinned_ = result_; // pin = 1
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, AWAIT_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_LIST '(' assignment_list ')' '=' await_expr
  public static boolean await_list_assign_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "await_list_assign_expr")) return false;
    if (!nextTokenIs(builder_, T_LIST)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LIST);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, assignment_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_EQUAL)) && result_;
    result_ = pinned_ && await_expr(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, AWAIT_LIST_ASSIGN_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '`' (T_ENCAPSED_AND_WHITESPACE | encaps_list)* '`'
  public static boolean backticks_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "backticks_expr")) return false;
    if (!nextTokenIs(builder_, T_BACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_BACK);
    result_ = result_ && backticks_expr_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_BACK);
    exit_section_(builder_, marker_, BACKTICKS_EXPR, result_);
    return result_;
  }

  // (T_ENCAPSED_AND_WHITESPACE | encaps_list)*
  private static boolean backticks_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "backticks_expr_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!backticks_expr_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "backticks_expr_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // T_ENCAPSED_AND_WHITESPACE | encaps_list
  private static boolean backticks_expr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "backticks_expr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ENCAPSED_AND_WHITESPACE);
    if (!result_) result_ = encaps_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // bitwise_operator shift_expr_wrapper
  public static boolean bitwise_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwise_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<bitwise expr>");
    result_ = bitwise_operator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && shift_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BITWISE_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // shift_expr_wrapper bitwise_expr*
  static boolean bitwise_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwise_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = shift_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && bitwise_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // bitwise_expr*
  private static boolean bitwise_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwise_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!bitwise_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "bitwise_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // '|' | '&' | '^'
  public static boolean bitwise_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwise_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<bitwise operator>");
    result_ = consumeToken(builder_, T_OR);
    if (!result_) result_ = consumeToken(builder_, T_AND);
    if (!result_) result_ = consumeToken(builder_, T_XOR);
    exit_section_(builder_, level_, marker_, BITWISE_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_NAMESPACE namespace_name? '{'  top_statement_list? '}'
  static boolean block_namespace_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_namespace_statement")) return false;
    if (!nextTokenIs(builder_, T_NAMESPACE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_NAMESPACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, block_namespace_statement_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_LBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, block_namespace_statement_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RBRACE) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // namespace_name?
  private static boolean block_namespace_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_namespace_statement_1")) return false;
    namespace_name(builder_, level_ + 1);
    return true;
  }

  // top_statement_list?
  private static boolean block_namespace_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_namespace_statement_3")) return false;
    top_statement_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' inner_statement_list '}'
  public static boolean block_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_statement")) return false;
    if (!nextTokenIs(builder_, T_LBRACE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, inner_statement_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RBRACE) && result_;
    exit_section_(builder_, level_, marker_, BLOCK_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_BREAK expr? ';'
  public static boolean break_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "break_statement")) return false;
    if (!nextTokenIs(builder_, T_BREAK)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_BREAK);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, break_statement_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, BREAK_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // expr?
  private static boolean break_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "break_statement_1")) return false;
    expr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // callable_variable '(' function_call_parameter_list ')'
  public static boolean callable_function_call_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callable_function_call_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<callable function call expr>");
    result_ = callable_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, level_, marker_, CALLABLE_FUNCTION_CALL_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_CALLABLE
  public static boolean callable_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callable_type")) return false;
    if (!nextTokenIs(builder_, T_CALLABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_CALLABLE);
    exit_section_(builder_, marker_, CALLABLE_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable_without_objects_expr | dimmable_variable_access_expr | parenthesized_variable_expr
  public static boolean callable_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callable_variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<callable variable>");
    result_ = variable_without_objects_expr(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_access_expr(builder_, level_ + 1);
    if (!result_) result_ = parenthesized_variable_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CALLABLE_VARIABLE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // expr | ('&' variable) | ("..." expr) {}
  public static boolean calling_parameter_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "calling_parameter_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<calling parameter item>");
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = calling_parameter_item_1(builder_, level_ + 1);
    if (!result_) result_ = calling_parameter_item_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CALLING_PARAMETER_ITEM, result_, false, null);
    return result_;
  }

  // '&' variable
  private static boolean calling_parameter_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "calling_parameter_item_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AND);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ("..." expr) {}
  private static boolean calling_parameter_item_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "calling_parameter_item_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = calling_parameter_item_2_0(builder_, level_ + 1);
    result_ = result_ && calling_parameter_item_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "..." expr
  private static boolean calling_parameter_item_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "calling_parameter_item_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ELLIPSIS);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {}
  private static boolean calling_parameter_item_2_1(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // T_CASE expr case_separator inner_statement_list
  public static boolean case_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_block")) return false;
    if (!nextTokenIs(builder_, T_CASE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_CASE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expr(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, case_separator(builder_, level_ + 1)) && result_;
    result_ = pinned_ && inner_statement_list(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, CASE_BLOCK, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (case_block|default_case_block)*
  public static boolean case_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<case list>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!case_list_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "case_list", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, CASE_LIST, true, false, null);
    return true;
  }

  // case_block|default_case_block
  private static boolean case_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = case_block(builder_, level_ + 1);
    if (!result_) result_ = default_case_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ':' | ';'
  public static boolean case_separator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_separator")) return false;
    if (!nextTokenIs(builder_, "<case separator>", T_COLON, T_SEMICOLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<case separator>");
    result_ = consumeToken(builder_, T_COLON);
    if (!result_) result_ = consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, level_, marker_, CASE_SEPARATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // cast_operator  prefix_expr_wrapper
  public static boolean cast_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cast_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<cast expr>");
    result_ = cast_operator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && prefix_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CAST_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // cast_expr+|prefix_expr_wrapper
  static boolean cast_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cast_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = cast_expr_wrapper_0(builder_, level_ + 1);
    if (!result_) result_ = prefix_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // cast_expr+
  private static boolean cast_expr_wrapper_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cast_expr_wrapper_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = cast_expr(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!cast_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "cast_expr_wrapper_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_INT_CAST | T_DOUBLE_CAST | T_STRING_CAST | T_ARRAY_CAST | T_OBJECT_CAST | T_BOOL_CAST | T_UNSET_CAST
  public static boolean cast_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cast_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<cast operator>");
    result_ = consumeToken(builder_, T_INT_CAST);
    if (!result_) result_ = consumeToken(builder_, T_DOUBLE_CAST);
    if (!result_) result_ = consumeToken(builder_, T_STRING_CAST);
    if (!result_) result_ = consumeToken(builder_, T_ARRAY_CAST);
    if (!result_) result_ = consumeToken(builder_, T_OBJECT_CAST);
    if (!result_) result_ = consumeToken(builder_, T_BOOL_CAST);
    if (!result_) result_ = consumeToken(builder_, T_UNSET_CAST);
    exit_section_(builder_, level_, marker_, CAST_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // static_class_name T_DOUBLE_COLON (identifier|T_CLASS)
  public static boolean class_constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_constant")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class constant>");
    result_ = static_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && class_constant_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_CONSTANT, result_, false, null);
    return result_;
  }

  // identifier|T_CLASS
  private static boolean class_constant_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_constant_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_CLASS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // user_attributes? (T_CLASS | T_ABSTRACT T_CLASS | T_FINAL T_CLASS) ((identifier hh_typevar?)
  // | T_XHP_LABEL)  extends_from? implements_list? class_statement_block
  public static boolean class_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_statement")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class declaration statement>");
    result_ = class_declaration_statement_0(builder_, level_ + 1);
    result_ = result_ && class_declaration_statement_1(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, class_declaration_statement_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, class_declaration_statement_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, class_declaration_statement_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && class_statement_block(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, CLASS_DECLARATION_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // user_attributes?
  private static boolean class_declaration_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_statement_0")) return false;
    user_attributes(builder_, level_ + 1);
    return true;
  }

  // T_CLASS | T_ABSTRACT T_CLASS | T_FINAL T_CLASS
  private static boolean class_declaration_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_CLASS);
    if (!result_) result_ = parseTokens(builder_, 0, T_ABSTRACT, T_CLASS);
    if (!result_) result_ = parseTokens(builder_, 0, T_FINAL, T_CLASS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (identifier hh_typevar?)
  // | T_XHP_LABEL
  private static boolean class_declaration_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_statement_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_declaration_statement_2_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_XHP_LABEL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier hh_typevar?
  private static boolean class_declaration_statement_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_statement_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && class_declaration_statement_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hh_typevar?
  private static boolean class_declaration_statement_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_statement_2_0_1")) return false;
    hh_typevar(builder_, level_ + 1);
    return true;
  }

  // extends_from?
  private static boolean class_declaration_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_statement_3")) return false;
    extends_from(builder_, level_ + 1);
    return true;
  }

  // implements_list?
  private static boolean class_declaration_statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_statement_4")) return false;
    implements_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // static_class_name T_DOUBLE_COLON ((identifier hh_typeargs_opt?)|variable_without_objects_expr|('{' expr '}')) '(' function_call_parameter_list ')'
  public static boolean class_method_call_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_method_call_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class method call expr>");
    result_ = static_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && class_method_call_expr_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, level_, marker_, CLASS_METHOD_CALL_EXPR, result_, false, null);
    return result_;
  }

  // (identifier hh_typeargs_opt?)|variable_without_objects_expr|('{' expr '}')
  private static boolean class_method_call_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_method_call_expr_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_method_call_expr_2_0(builder_, level_ + 1);
    if (!result_) result_ = variable_without_objects_expr(builder_, level_ + 1);
    if (!result_) result_ = class_method_call_expr_2_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier hh_typeargs_opt?
  private static boolean class_method_call_expr_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_method_call_expr_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && class_method_call_expr_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hh_typeargs_opt?
  private static boolean class_method_call_expr_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_method_call_expr_2_0_1")) return false;
    hh_typeargs_opt(builder_, level_ + 1);
    return true;
  }

  // '{' expr '}'
  private static boolean class_method_call_expr_2_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_method_call_expr_2_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // fully_qualified_class_name
  //                         | T_STATIC
  //                         | variable_no_calls
  public static boolean class_name_reference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_name_reference")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class name reference>");
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_STATIC);
    if (!result_) result_ = consumeToken(builder_, VARIABLE_NO_CALLS);
    exit_section_(builder_, level_, marker_, CLASS_NAME_REFERENCE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ((T_NAMESPACE namespace_name) | namespace_name) hh_typeargs_opt?
  public static boolean class_namespace_string_typeargs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_namespace_string_typeargs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class namespace string typeargs>");
    result_ = class_namespace_string_typeargs_0(builder_, level_ + 1);
    result_ = result_ && class_namespace_string_typeargs_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_NAMESPACE_STRING_TYPEARGS, result_, false, null);
    return result_;
  }

  // (T_NAMESPACE namespace_name) | namespace_name
  private static boolean class_namespace_string_typeargs_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_namespace_string_typeargs_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_namespace_string_typeargs_0_0(builder_, level_ + 1);
    if (!result_) result_ = namespace_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_NAMESPACE namespace_name
  private static boolean class_namespace_string_typeargs_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_namespace_string_typeargs_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NAMESPACE);
    result_ = result_ && namespace_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hh_typeargs_opt?
  private static boolean class_namespace_string_typeargs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_namespace_string_typeargs_1")) return false;
    hh_typeargs_opt(builder_, level_ + 1);
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
  public static boolean class_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class statement>");
    result_ = class_statement_0(builder_, level_ + 1);
    if (!result_) result_ = class_statement_1(builder_, level_ + 1);
    if (!result_) result_ = class_statement_2(builder_, level_ + 1);
    if (!result_) result_ = xhp_attribute_declaration(builder_, level_ + 1);
    if (!result_) result_ = xhp_category_declaration(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_declaration(builder_, level_ + 1);
    if (!result_) result_ = trait_require_declaration(builder_, level_ + 1);
    if (!result_) result_ = trait_use_declaration(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_STATEMENT, result_, false, null);
    return result_;
  }

  // class_variable_declarations ';'
  private static boolean class_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_variable_declarations(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // constant_declaration ';'
  private static boolean class_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constant_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // method_function_declaration ';'?
  private static boolean class_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_statement_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = method_function_declaration(builder_, level_ + 1);
    result_ = result_ && class_statement_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ';'?
  private static boolean class_statement_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_statement_2_1")) return false;
    consumeToken(builder_, T_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // '{' class_statement_list '}'
  static boolean class_statement_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_statement_block")) return false;
    if (!nextTokenIs(builder_, T_LBRACE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, class_statement_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RBRACE) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // class_statement*
  public static boolean class_statement_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_statement_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class statement list>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!class_statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "class_statement_list", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, CLASS_STATEMENT_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // (T_VARIABLE | static_assignment) (','  (T_VARIABLE | static_assignment))*
  public static boolean class_variable_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declaration")) return false;
    if (!nextTokenIs(builder_, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_variable_declaration_0(builder_, level_ + 1);
    result_ = result_ && class_variable_declaration_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CLASS_VARIABLE_DECLARATION, result_);
    return result_;
  }

  // T_VARIABLE | static_assignment
  private static boolean class_variable_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declaration_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = static_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (','  (T_VARIABLE | static_assignment))*
  private static boolean class_variable_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declaration_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!class_variable_declaration_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "class_variable_declaration_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ','  (T_VARIABLE | static_assignment)
  private static boolean class_variable_declaration_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declaration_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && class_variable_declaration_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_VARIABLE | static_assignment
  private static boolean class_variable_declaration_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declaration_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = static_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (variable_modifiers|(member_modifier+ hh_type?))  class_variable_declaration
  public static boolean class_variable_declarations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declarations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class variable declarations>");
    result_ = class_variable_declarations_0(builder_, level_ + 1);
    result_ = result_ && class_variable_declaration(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_VARIABLE_DECLARATIONS, result_, false, null);
    return result_;
  }

  // variable_modifiers|(member_modifier+ hh_type?)
  private static boolean class_variable_declarations_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declarations_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable_modifiers(builder_, level_ + 1);
    if (!result_) result_ = class_variable_declarations_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // member_modifier+ hh_type?
  private static boolean class_variable_declarations_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declarations_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_variable_declarations_0_1_0(builder_, level_ + 1);
    result_ = result_ && class_variable_declarations_0_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // member_modifier+
  private static boolean class_variable_declarations_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declarations_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = member_modifier(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!member_modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "class_variable_declarations_0_1_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hh_type?
  private static boolean class_variable_declarations_0_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declarations_0_1_1")) return false;
    hh_type(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_CLONE expr
  public static boolean clone_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clone_expr")) return false;
    if (!nextTokenIs(builder_, T_CLONE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_CLONE);
    pinned_ = result_; // pin = 1
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLONE_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // member_modifier* T_FUNCTION '&'? '('  parameter_list ')' hh_opt_return_type? lambda_use_vars? '{' inner_statement_list '}'
  public static boolean closure_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<closure expr>");
    result_ = closure_expr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_FUNCTION);
    result_ = result_ && closure_expr_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && closure_expr_6(builder_, level_ + 1);
    result_ = result_ && closure_expr_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, level_, marker_, CLOSURE_EXPR, result_, false, null);
    return result_;
  }

  // member_modifier*
  private static boolean closure_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_expr_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!member_modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "closure_expr_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '&'?
  private static boolean closure_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_expr_2")) return false;
    consumeToken(builder_, T_AND);
    return true;
  }

  // hh_opt_return_type?
  private static boolean closure_expr_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_expr_6")) return false;
    hh_opt_return_type(builder_, level_ + 1);
    return true;
  }

  // lambda_use_vars?
  private static boolean closure_expr_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_expr_7")) return false;
    lambda_use_vars(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // fully_qualified_class_name '{' array_pair_list '}'
  static boolean collection_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "collection_literal")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, array_pair_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RBRACE) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // collection_literal
  public static boolean collection_literal_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "collection_literal_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<collection literal expr>");
    result_ = collection_literal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COLLECTION_LITERAL_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // comparative_operator bitwise_expr_wrapper
  public static boolean comparative_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparative_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<comparative expr>");
    result_ = comparative_operator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && bitwise_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COMPARATIVE_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // bitwise_expr_wrapper comparative_expr*
  static boolean comparative_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparative_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = bitwise_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && comparative_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // comparative_expr*
  private static boolean comparative_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparative_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!comparative_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "comparative_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // T_IS_IDENTICAL | T_IS_NOT_IDENTICAL | T_IS_EQUAL | T_IS_NOT_EQUAL | '<' | T_IS_SMALLER_OR_EQUAL | '>' | T_IS_GREATER_OR_EQUAL
  public static boolean comparative_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparative_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<comparative operator>");
    result_ = consumeToken(builder_, T_IS_IDENTICAL);
    if (!result_) result_ = consumeToken(builder_, T_IS_NOT_IDENTICAL);
    if (!result_) result_ = consumeToken(builder_, T_IS_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_IS_NOT_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_LESS);
    if (!result_) result_ = consumeToken(builder_, T_IS_SMALLER_OR_EQUAL);
    if (!result_) result_ = consumeToken(builder_, T_GREATER);
    if (!result_) result_ = consumeToken(builder_, T_IS_GREATER_OR_EQUAL);
    exit_section_(builder_, level_, marker_, COMPARATIVE_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_VARIABLE | ('$' '{' expr '}')
  public static boolean compound_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compound_variable")) return false;
    if (!nextTokenIs(builder_, "<compound variable>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<compound variable>");
    result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = compound_variable_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COMPOUND_VARIABLE, result_, false, null);
    return result_;
  }

  // '$' '{' expr '}'
  private static boolean compound_variable_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compound_variable_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOLLAR_SIGN);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_name_with_type '=' static_expr
  public static boolean constant_assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_assignment")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<constant assignment>");
    result_ = hh_name_with_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    pinned_ = result_; // pin = 2
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONSTANT_ASSIGNMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_CONST constant_assignment (',' constant_assignment)*
  public static boolean constant_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declaration")) return false;
    if (!nextTokenIs(builder_, T_CONST)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_CONST);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, constant_assignment(builder_, level_ + 1));
    result_ = pinned_ && constant_declaration_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, CONSTANT_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (',' constant_assignment)*
  private static boolean constant_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declaration_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!constant_declaration_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "constant_declaration_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' constant_assignment
  private static boolean constant_declaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && constant_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // constant_declaration ';'
  public static boolean constant_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declaration_statement")) return false;
    if (!nextTokenIs(builder_, T_CONST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constant_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, CONSTANT_DECLARATION_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_CONTINUE expr? ';'
  public static boolean continue_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "continue_statement")) return false;
    if (!nextTokenIs(builder_, T_CONTINUE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_CONTINUE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, continue_statement_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, CONTINUE_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // expr?
  private static boolean continue_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "continue_statement_1")) return false;
    expr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' function_call_parameter_list  ')'
  public static boolean ctor_arguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ctor_arguments")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, CTOR_ARGUMENTS, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier '=' static_expr
  public static boolean declare_assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_assignment")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<declare assignment>");
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    pinned_ = result_; // pin = 2
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DECLARE_ASSIGNMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (declare_assignment (',' declare_assignment )*)?
  public static boolean declare_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<declare list>");
    declare_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DECLARE_LIST, true, false, null);
    return true;
  }

  // declare_assignment (',' declare_assignment )*
  private static boolean declare_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = declare_assignment(builder_, level_ + 1);
    result_ = result_ && declare_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' declare_assignment )*
  private static boolean declare_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!declare_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "declare_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' declare_assignment
  private static boolean declare_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && declare_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ':' inner_statement_list T_ENDDECLARE ';'
  public static boolean declare_new_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_new_statement")) return false;
    if (!nextTokenIs(builder_, T_COLON)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_COLON);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, inner_statement_list(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_ENDDECLARE)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, DECLARE_NEW_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_DECLARE '(' declare_list ')' declare_statement_body
  public static boolean declare_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_statement")) return false;
    if (!nextTokenIs(builder_, T_DECLARE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_DECLARE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, declare_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && declare_statement_body(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, DECLARE_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // declare_new_statement | statement
  public static boolean declare_statement_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_statement_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<declare statement body>");
    result_ = declare_new_statement(builder_, level_ + 1);
    if (!result_) result_ = statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DECLARE_STATEMENT_BODY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_DEFAULT case_separator inner_statement_list
  public static boolean default_case_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "default_case_block")) return false;
    if (!nextTokenIs(builder_, T_DEFAULT)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_DEFAULT);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, case_separator(builder_, level_ + 1));
    result_ = pinned_ && inner_statement_list(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, DEFAULT_CASE_BLOCK, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // dim_expr_base array_offset_access (array_offset_access)*
  public static boolean dim_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dim_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dim expr>");
    result_ = dim_expr_base(builder_, level_ + 1);
    result_ = result_ && array_offset_access(builder_, level_ + 1);
    result_ = result_ && dim_expr_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIM_EXPR, result_, false, null);
    return result_;
  }

  // (array_offset_access)*
  private static boolean dim_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dim_expr_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!dim_expr_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dim_expr_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (array_offset_access)
  private static boolean dim_expr_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dim_expr_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = array_offset_access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // array_literal_expr | class_constant | T_CONSTANT_ENCAPSED_STRING | parenthesized_expr
  public static boolean dim_expr_base(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dim_expr_base")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dim expr base>");
    result_ = array_literal_expr(builder_, level_ + 1);
    if (!result_) result_ = class_constant(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_CONSTANT_ENCAPSED_STRING);
    if (!result_) result_ = parenthesized_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIM_EXPR_BASE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // array_access+ | ('(' expr_with_parens ')' array_access)
  public static boolean dimmable_variable_access_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_access_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dimmable variable access expr>");
    result_ = dimmable_variable_access_expr_0(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_access_expr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIMMABLE_VARIABLE_ACCESS_EXPR, result_, false, null);
    return result_;
  }

  // array_access+
  private static boolean dimmable_variable_access_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_access_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = array_access(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!array_access(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dimmable_variable_access_expr_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' array_access
  private static boolean dimmable_variable_access_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_access_expr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && array_access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // array_access+ |('(' expr_with_parens ')' array_access+)
  public static boolean dimmable_variable_no_calls_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls_access")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dimmable variable no calls access>");
    result_ = dimmable_variable_no_calls_access_0(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_no_calls_access_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIMMABLE_VARIABLE_NO_CALLS_ACCESS, result_, false, null);
    return result_;
  }

  // array_access+
  private static boolean dimmable_variable_no_calls_access_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls_access_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = array_access(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!array_access(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dimmable_variable_no_calls_access_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' array_access+
  private static boolean dimmable_variable_no_calls_access_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls_access_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && dimmable_variable_no_calls_access_1_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // array_access+
  private static boolean dimmable_variable_no_calls_access_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls_access_1_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = array_access(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!array_access(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dimmable_variable_no_calls_access_1_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_DO  statement T_WHILE parenthesized_expr ';'
  public static boolean do_while_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_while_statement")) return false;
    if (!nextTokenIs(builder_, T_DO)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_DO);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, statement(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_WHILE)) && result_;
    result_ = pinned_ && report_error_(builder_, parenthesized_expr(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, DO_WHILE_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '"' encaps_list '"'
  static boolean double_quotes_string(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "double_quotes_string")) return false;
    if (!nextTokenIs(builder_, T_DOUBLE_QUOTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOUBLE_QUOTE);
    result_ = result_ && encaps_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_QUOTE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ECHO expr_list ';'
  public static boolean echo_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "echo_statement")) return false;
    if (!nextTokenIs(builder_, T_ECHO)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_ECHO);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expr_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, ECHO_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_ELSE statement
  public static boolean else_single(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "else_single")) return false;
    if (!nextTokenIs(builder_, T_ELSE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_ELSE);
    pinned_ = result_; // pin = 1
    result_ = result_ && statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ELSE_SINGLE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_ELSEIF parenthesized_expr statement
  public static boolean elseif_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elseif_body")) return false;
    if (!nextTokenIs(builder_, T_ELSEIF)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_ELSEIF);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, parenthesized_expr(builder_, level_ + 1));
    result_ = pinned_ && statement(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, ELSEIF_BODY, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // elseif_body*
  public static boolean elseif_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elseif_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<elseif list>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!elseif_body(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "elseif_list", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, ELSEIF_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // (T_ENCAPSED_AND_WHITESPACE|encaps_var)*
  public static boolean encaps_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<encaps list>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!encaps_list_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "encaps_list", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, ENCAPS_LIST, true, false, null);
    return true;
  }

  // T_ENCAPSED_AND_WHITESPACE|encaps_var
  private static boolean encaps_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ENCAPSED_AND_WHITESPACE);
    if (!result_) result_ = encaps_var(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_VARIABLE
  // | T_VARIABLE '[' encaps_var_offset ']'
  // | T_VARIABLE T_OBJECT_OPERATOR identifier
  // | T_DOLLAR_OPEN_CURLY_BRACES expr '}'
  // | T_DOLLAR_OPEN_CURLY_BRACES T_STRING_VARNAME array_offset_access '}'
  // | T_CURLY_OPEN variable '}'
  public static boolean encaps_var(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_var")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<encaps var>");
    result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = encaps_var_1(builder_, level_ + 1);
    if (!result_) result_ = encaps_var_2(builder_, level_ + 1);
    if (!result_) result_ = encaps_var_3(builder_, level_ + 1);
    if (!result_) result_ = encaps_var_4(builder_, level_ + 1);
    if (!result_) result_ = encaps_var_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ENCAPS_VAR, result_, false, null);
    return result_;
  }

  // T_VARIABLE '[' encaps_var_offset ']'
  private static boolean encaps_var_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_var_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARIABLE);
    result_ = result_ && consumeToken(builder_, T_LBRACKET);
    result_ = result_ && encaps_var_offset(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_VARIABLE T_OBJECT_OPERATOR identifier
  private static boolean encaps_var_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_var_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_VARIABLE, T_OBJECT_OPERATOR);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_DOLLAR_OPEN_CURLY_BRACES expr '}'
  private static boolean encaps_var_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_var_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOLLAR_OPEN_CURLY_BRACES);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_DOLLAR_OPEN_CURLY_BRACES T_STRING_VARNAME array_offset_access '}'
  private static boolean encaps_var_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_var_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_DOLLAR_OPEN_CURLY_BRACES, T_STRING_VARNAME);
    result_ = result_ && array_offset_access(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_CURLY_OPEN variable '}'
  private static boolean encaps_var_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_var_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_CURLY_OPEN);
    result_ = result_ && variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier | T_NUM_STRING | T_VARIABLE
  public static boolean encaps_var_offset(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_var_offset")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<encaps var offset>");
    result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_NUM_STRING);
    if (!result_) result_ = consumeToken(builder_, T_VARIABLE);
    exit_section_(builder_, level_, marker_, ENCAPS_VAR_OFFSET, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // hh_name_with_type '=' static_expr
  public static boolean enum_constant_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_constant_declaration")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum constant declaration>");
    result_ = hh_name_with_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    pinned_ = result_; // pin = 2
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ENUM_CONSTANT_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // user_attributes? T_ENUM identifier  ':' hh_type (T_AS hh_type)? '{' enum_statement_list '}'
  public static boolean enum_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_statement")) return false;
    if (!nextTokenIs(builder_, "<enum declaration statement>", T_ENUM, T_SL)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum declaration statement>");
    result_ = enum_declaration_statement_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ENUM);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, identifier(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_COLON)) && result_;
    result_ = pinned_ && report_error_(builder_, hh_type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, enum_declaration_statement_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_LBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, enum_statement_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RBRACE) && result_;
    exit_section_(builder_, level_, marker_, ENUM_DECLARATION_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // user_attributes?
  private static boolean enum_declaration_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_statement_0")) return false;
    user_attributes(builder_, level_ + 1);
    return true;
  }

  // (T_AS hh_type)?
  private static boolean enum_declaration_statement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_statement_5")) return false;
    enum_declaration_statement_5_0(builder_, level_ + 1);
    return true;
  }

  // T_AS hh_type
  private static boolean enum_declaration_statement_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_statement_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AS);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // enum_constant_declaration ';'
  public static boolean enum_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum statement>");
    result_ = enum_constant_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, level_, marker_, ENUM_STATEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // enum_statement*
  public static boolean enum_statement_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_statement_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum statement list>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enum_statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_statement_list", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, ENUM_STATEMENT_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // '(' expr_with_parens ')'
  public static boolean especial_parenthesised_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "especial_parenthesised_expr")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, level_, marker_, ESPECIAL_PARENTHESISED_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_EXIT (('(' ')' ) | parenthesized_expr)
  public static boolean exit_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exit_expr")) return false;
    if (!nextTokenIs(builder_, T_EXIT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EXIT);
    result_ = result_ && exit_expr_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXIT_EXPR, result_);
    return result_;
  }

  // ('(' ')' ) | parenthesized_expr
  private static boolean exit_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exit_expr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = exit_expr_1_0(builder_, level_ + 1);
    if (!result_) result_ = parenthesized_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' ')'
  private static boolean exit_expr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exit_expr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // assignment_expr_wrapper
  static boolean expr(PsiBuilder builder_, int level_) {
    return assignment_expr_wrapper(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // (expr (',' expr)*)?
  public static boolean expr_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr list>");
    expr_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPR_LIST, true, false, null);
    return true;
  }

  // expr (',' expr)*
  private static boolean expr_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && expr_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' expr)*
  private static boolean expr_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' expr
  private static boolean expr_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (expr|yield_expr|yield_assign_expr|yield_list_assign_expr|await_expr|await_assign_expr|await_list_assign_expr|query_assign_expr) ';'
  public static boolean expr_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr statement>");
    result_ = expr_statement_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, level_, marker_, EXPR_STATEMENT, result_, false, null);
    return result_;
  }

  // expr|yield_expr|yield_assign_expr|yield_list_assign_expr|await_expr|await_assign_expr|await_list_assign_expr|query_assign_expr
  private static boolean expr_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = yield_expr(builder_, level_ + 1);
    if (!result_) result_ = yield_assign_expr(builder_, level_ + 1);
    if (!result_) result_ = yield_list_assign_expr(builder_, level_ + 1);
    if (!result_) result_ = await_expr(builder_, level_ + 1);
    if (!result_) result_ = await_assign_expr(builder_, level_ + 1);
    if (!result_) result_ = await_list_assign_expr(builder_, level_ + 1);
    if (!result_) result_ = query_assign_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // especial_parenthesised_expr
  //                             | new_expr
  //                             | clone_expr
  //                             | xhp_expr
  //                             | collection_literal_expr
  static boolean expr_with_parens(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_with_parens")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = especial_parenthesised_expr(builder_, level_ + 1);
    if (!result_) result_ = new_expr(builder_, level_ + 1);
    if (!result_) result_ = clone_expr(builder_, level_ + 1);
    if (!result_) result_ = xhp_expr(builder_, level_ + 1);
    if (!result_) result_ = collection_literal_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_EXTENDS fully_qualified_class_name
  public static boolean extends_from(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extends_from")) return false;
    if (!nextTokenIs(builder_, T_EXTENDS)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_EXTENDS);
    pinned_ = result_; // pin = 1
    result_ = result_ && fully_qualified_class_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXTENDS_FROM, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // block_statement
  static boolean finally_statement_list(PsiBuilder builder_, int level_) {
    return block_statement(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // ':' inner_statement_list T_ENDFOR ';'
  public static boolean for_new_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_new_statement")) return false;
    if (!nextTokenIs(builder_, T_COLON)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_COLON);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, inner_statement_list(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_ENDFOR)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, FOR_NEW_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_FOR '(' expr_list ';' expr_list ';' expr_list ')'  for_statement_body
  public static boolean for_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement")) return false;
    if (!nextTokenIs(builder_, T_FOR)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_FOR);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, expr_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_SEMICOLON)) && result_;
    result_ = pinned_ && report_error_(builder_, expr_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_SEMICOLON)) && result_;
    result_ = pinned_ && report_error_(builder_, expr_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && for_statement_body(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, FOR_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // for_new_statement     | statement
  public static boolean for_statement_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<for statement body>");
    result_ = for_new_statement(builder_, level_ + 1);
    if (!result_) result_ = statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FOR_STATEMENT_BODY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_LIST '(' assignment_list ')'
  public static boolean foreach_list_assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_list_assignment")) return false;
    if (!nextTokenIs(builder_, T_LIST)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LIST);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, assignment_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, FOREACH_LIST_ASSIGNMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ':' inner_statement_list T_ENDFOREACH ';'
  public static boolean foreach_new_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_new_statement")) return false;
    if (!nextTokenIs(builder_, T_COLON)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_COLON);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, inner_statement_list(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_ENDFOREACH)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, FOREACH_NEW_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_DOUBLE_ARROW foreach_variable
  public static boolean foreach_optional_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_optional_arg")) return false;
    if (!nextTokenIs(builder_, T_DOUBLE_ARROW)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_DOUBLE_ARROW);
    pinned_ = result_; // pin = 1
    result_ = result_ && foreach_variable(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FOREACH_OPTIONAL_ARG, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_FOREACH '(' expr T_AWAIT? T_AS foreach_variable foreach_optional_arg? ')'  foreach_statement_body
  public static boolean foreach_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement")) return false;
    if (!nextTokenIs(builder_, T_FOREACH)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_FOREACH);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, expr(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, foreach_statement_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_AS)) && result_;
    result_ = pinned_ && report_error_(builder_, foreach_variable(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, foreach_statement_6(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && foreach_statement_body(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, FOREACH_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // T_AWAIT?
  private static boolean foreach_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_3")) return false;
    consumeToken(builder_, T_AWAIT);
    return true;
  }

  // foreach_optional_arg?
  private static boolean foreach_statement_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_6")) return false;
    foreach_optional_arg(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // foreach_new_statement | statement
  public static boolean foreach_statement_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<foreach statement body>");
    result_ = foreach_new_statement(builder_, level_ + 1);
    if (!result_) result_ = statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FOREACH_STATEMENT_BODY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ('&'? variable) | foreach_list_assignment
  public static boolean foreach_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<foreach variable>");
    result_ = foreach_variable_0(builder_, level_ + 1);
    if (!result_) result_ = foreach_list_assignment(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FOREACH_VARIABLE, result_, false, null);
    return result_;
  }

  // '&'? variable
  private static boolean foreach_variable_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_variable_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = foreach_variable_0_0(builder_, level_ + 1);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&'?
  private static boolean foreach_variable_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_variable_0_0")) return false;
    consumeToken(builder_, T_AND);
    return true;
  }

  /* ********************************************************** */
  // T_FROM T_VARIABLE T_IN expr
  public static boolean from_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "from_clause")) return false;
    if (!nextTokenIs(builder_, T_FROM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_FROM, T_VARIABLE, T_IN);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, FROM_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs
  //                     | T_XHP_LABEL
  public static boolean fully_qualified_class_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fully_qualified_class_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<fully qualified class name>");
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_XHP_LABEL);
    exit_section_(builder_, level_, marker_, FULLY_QUALIFIED_CLASS_NAME, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ';' | block_statement
  public static boolean function_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_body")) return false;
    if (!nextTokenIs(builder_, "<function body>", T_SEMICOLON, T_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function body>");
    result_ = consumeToken(builder_, T_SEMICOLON);
    if (!result_) result_ = block_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FUNCTION_BODY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (calling_parameter_item (',' calling_parameter_item)* ','?)?
  public static boolean function_call_parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_call_parameter_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function call parameter list>");
    function_call_parameter_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FUNCTION_CALL_PARAMETER_LIST, true, false, null);
    return true;
  }

  // calling_parameter_item (',' calling_parameter_item)* ','?
  private static boolean function_call_parameter_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_call_parameter_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = calling_parameter_item(builder_, level_ + 1);
    result_ = result_ && function_call_parameter_list_0_1(builder_, level_ + 1);
    result_ = result_ && function_call_parameter_list_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' calling_parameter_item)*
  private static boolean function_call_parameter_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_call_parameter_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!function_call_parameter_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "function_call_parameter_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' calling_parameter_item
  private static boolean function_call_parameter_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_call_parameter_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && calling_parameter_item(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean function_call_parameter_list_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_call_parameter_list_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // user_attributes? method_modifiers? T_FUNCTION '&'? identifier hh_typevar?  '(' parameter_list ')' hh_opt_return_type? function_body
  public static boolean function_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_statement")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function declaration statement>");
    result_ = function_declaration_statement_0(builder_, level_ + 1);
    result_ = result_ && function_declaration_statement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_FUNCTION);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, function_declaration_statement_3(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, identifier(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, function_declaration_statement_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_LPAREN)) && result_;
    result_ = pinned_ && report_error_(builder_, parameter_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && report_error_(builder_, function_declaration_statement_9(builder_, level_ + 1)) && result_;
    result_ = pinned_ && function_body(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, FUNCTION_DECLARATION_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // user_attributes?
  private static boolean function_declaration_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_statement_0")) return false;
    user_attributes(builder_, level_ + 1);
    return true;
  }

  // method_modifiers?
  private static boolean function_declaration_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_statement_1")) return false;
    method_modifiers(builder_, level_ + 1);
    return true;
  }

  // '&'?
  private static boolean function_declaration_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_statement_3")) return false;
    consumeToken(builder_, T_AND);
    return true;
  }

  // hh_typevar?
  private static boolean function_declaration_statement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_statement_5")) return false;
    hh_typevar(builder_, level_ + 1);
    return true;
  }

  // hh_opt_return_type?
  private static boolean function_declaration_statement_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_statement_9")) return false;
    hh_opt_return_type(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_GLOBAL global_var_list ';'
  public static boolean global_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_statement")) return false;
    if (!nextTokenIs(builder_, T_GLOBAL)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_GLOBAL);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, global_var_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, GLOBAL_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_VARIABLE | ('$' variable) | ('$' '{' expr '}')
  public static boolean global_var(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_var")) return false;
    if (!nextTokenIs(builder_, "<global var>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<global var>");
    result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = global_var_1(builder_, level_ + 1);
    if (!result_) result_ = global_var_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, GLOBAL_VAR, result_, false, null);
    return result_;
  }

  // '$' variable
  private static boolean global_var_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_var_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOLLAR_SIGN);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '$' '{' expr '}'
  private static boolean global_var_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_var_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOLLAR_SIGN);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (global_var (',' global_var)*)?
  public static boolean global_var_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_var_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<global var list>");
    global_var_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, GLOBAL_VAR_LIST, true, false, null);
    return true;
  }

  // global_var (',' global_var)*
  private static boolean global_var_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_var_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = global_var(builder_, level_ + 1);
    result_ = result_ && global_var_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' global_var)*
  private static boolean global_var_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_var_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!global_var_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "global_var_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' global_var
  private static boolean global_var_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_var_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && global_var(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_GOTO identifier ';'
  public static boolean goto_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "goto_statement")) return false;
    if (!nextTokenIs(builder_, T_GOTO)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_GOTO);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, identifier(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, GOTO_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_GROUP expr T_BY expr
  public static boolean group_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_clause")) return false;
    if (!nextTokenIs(builder_, T_GROUP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_GROUP);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_BY);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, GROUP_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_INLINE_HTML? T_OPEN_TAG top_statement_list?
  static boolean hackFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hackFile")) return false;
    if (!nextTokenIs(builder_, "", T_INLINE_HTML, T_OPEN_TAG)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hackFile_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_OPEN_TAG);
    result_ = result_ && hackFile_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_INLINE_HTML?
  private static boolean hackFile_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hackFile_0")) return false;
    consumeToken(builder_, T_INLINE_HTML);
    return true;
  }

  // top_statement_list?
  private static boolean hackFile_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hackFile_2")) return false;
    top_statement_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_HALT_COMPILER '(' ')' ';'
  public static boolean halt_compiler_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "halt_compiler_statement")) return false;
    if (!nextTokenIs(builder_, T_HALT_COMPILER)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_HALT_COMPILER);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, HALT_COMPILER_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_START_HEREDOC encaps_list T_END_HEREDOC
  static boolean here_doc_string(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "here_doc_string")) return false;
    if (!nextTokenIs(builder_, T_START_HEREDOC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_START_HEREDOC);
    result_ = result_ && encaps_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_END_HEREDOC);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_type_list "..."?
  public static boolean hh_func_type_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_func_type_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh func type list>");
    result_ = hh_type_list(builder_, level_ + 1);
    result_ = result_ && hh_func_type_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_FUNC_TYPE_LIST, result_, false, null);
    return result_;
  }

  // "..."?
  private static boolean hh_func_type_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_func_type_list_1")) return false;
    consumeToken(builder_, T_ELLIPSIS);
    return true;
  }

  /* ********************************************************** */
  // '(' T_FUNCTION '(' hh_func_type_list ')' ':' hh_type ')'
  public static boolean hh_function_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_function_type")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && consumeToken(builder_, T_FUNCTION);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, hh_func_type_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_COLON)) && result_;
    result_ = pinned_ && report_error_(builder_, hh_type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, HH_FUNCTION_TYPE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // hh_type? identifier
  static boolean hh_name_with_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_name_with_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_name_with_type_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hh_type?
  private static boolean hh_name_with_type_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_name_with_type_0")) return false;
    hh_type(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_NEWTYPE identifier hh_typevar? (T_AS hh_type)? '=' hh_type ';'
  public static boolean hh_new_type_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_new_type_declaration_statement")) return false;
    if (!nextTokenIs(builder_, T_NEWTYPE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_NEWTYPE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, identifier(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, hh_new_type_declaration_statement_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, hh_new_type_declaration_statement_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_EQUAL)) && result_;
    result_ = pinned_ && report_error_(builder_, hh_type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, HH_NEW_TYPE_DECLARATION_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // hh_typevar?
  private static boolean hh_new_type_declaration_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_new_type_declaration_statement_2")) return false;
    hh_typevar(builder_, level_ + 1);
    return true;
  }

  // (T_AS hh_type)?
  private static boolean hh_new_type_declaration_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_new_type_declaration_statement_3")) return false;
    hh_new_type_declaration_statement_3_0(builder_, level_ + 1);
    return true;
  }

  // T_AS hh_type
  private static boolean hh_new_type_declaration_statement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_new_type_declaration_statement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AS);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '?' hh_type
  public static boolean hh_nullable_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_nullable_type")) return false;
    if (!nextTokenIs(builder_, T_QUEST)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_QUEST);
    pinned_ = result_; // pin = 1
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_NULLABLE_TYPE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ':' hh_type
  public static boolean hh_opt_return_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_opt_return_type")) return false;
    if (!nextTokenIs(builder_, T_COLON)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_COLON);
    pinned_ = result_; // pin = 1
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_OPT_RETURN_TYPE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (hh_shape_member_type (',' hh_shape_member_type)* ','?)?
  public static boolean hh_shape_member_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_member_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh shape member list>");
    hh_shape_member_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_SHAPE_MEMBER_LIST, true, false, null);
    return true;
  }

  // hh_shape_member_type (',' hh_shape_member_type)* ','?
  private static boolean hh_shape_member_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_member_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_shape_member_type(builder_, level_ + 1);
    result_ = result_ && hh_shape_member_list_0_1(builder_, level_ + 1);
    result_ = result_ && hh_shape_member_list_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' hh_shape_member_type)*
  private static boolean hh_shape_member_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_member_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!hh_shape_member_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "hh_shape_member_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' hh_shape_member_type
  private static boolean hh_shape_member_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_member_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_shape_member_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean hh_shape_member_list_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_member_list_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_CONSTANT_ENCAPSED_STRING T_DOUBLE_ARROW hh_type
  // | class_namespace_string_typeargs T_DOUBLE_COLON identifier T_DOUBLE_ARROW hh_type
  public static boolean hh_shape_member_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_member_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh shape member type>");
    result_ = hh_shape_member_type_0(builder_, level_ + 1);
    if (!result_) result_ = hh_shape_member_type_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_SHAPE_MEMBER_TYPE, result_, false, null);
    return result_;
  }

  // T_CONSTANT_ENCAPSED_STRING T_DOUBLE_ARROW hh_type
  private static boolean hh_shape_member_type_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_member_type_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_CONSTANT_ENCAPSED_STRING, T_DOUBLE_ARROW);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // class_namespace_string_typeargs T_DOUBLE_COLON identifier T_DOUBLE_ARROW hh_type
  private static boolean hh_shape_member_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_member_type_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_SHAPE '(' hh_shape_member_list ')'
  public static boolean hh_shape_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_type")) return false;
    if (!nextTokenIs(builder_, T_SHAPE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_SHAPE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, hh_shape_member_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, HH_SHAPE_TYPE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '@' hh_type
  public static boolean hh_soft_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_soft_type")) return false;
    if (!nextTokenIs(builder_, T_SILENCE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_SILENCE);
    pinned_ = result_; // pin = 1
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_SOFT_TYPE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '(' hh_type ',' hh_type (',' hh_type)* ','? ')'
  public static boolean hh_tuple_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_tuple_type")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, hh_type(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_COMMA)) && result_;
    result_ = pinned_ && report_error_(builder_, hh_type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, hh_tuple_type_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, hh_tuple_type_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, HH_TUPLE_TYPE, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (',' hh_type)*
  private static boolean hh_tuple_type_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_tuple_type_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!hh_tuple_type_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "hh_tuple_type_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' hh_type
  private static boolean hh_tuple_type_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_tuple_type_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean hh_tuple_type_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_tuple_type_5")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // hh_nullable_type
  //         | hh_soft_type
  //         | ident_type
  //         | array_type
  //         | callable_type
  //         | hh_shape_type
  //         | hh_xhp_type
  //         | hh_function_type
  //         | hh_tuple_type
  static boolean hh_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_nullable_type(builder_, level_ + 1);
    if (!result_) result_ = hh_soft_type(builder_, level_ + 1);
    if (!result_) result_ = ident_type(builder_, level_ + 1);
    if (!result_) result_ = array_type(builder_, level_ + 1);
    if (!result_) result_ = callable_type(builder_, level_ + 1);
    if (!result_) result_ = hh_shape_type(builder_, level_ + 1);
    if (!result_) result_ = hh_xhp_type(builder_, level_ + 1);
    if (!result_) result_ = hh_function_type(builder_, level_ + 1);
    if (!result_) result_ = hh_tuple_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_type_declaration_statement | hh_new_type_declaration_statement
  static boolean hh_type_alias_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_alias_declaration_statement")) return false;
    if (!nextTokenIs(builder_, "", T_NEWTYPE, T_TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_type_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = hh_new_type_declaration_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_TYPE identifier hh_typevar? '=' hh_type ';'
  public static boolean hh_type_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_declaration_statement")) return false;
    if (!nextTokenIs(builder_, T_TYPE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_TYPE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, identifier(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, hh_type_declaration_statement_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_EQUAL)) && result_;
    result_ = pinned_ && report_error_(builder_, hh_type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, HH_TYPE_DECLARATION_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // hh_typevar?
  private static boolean hh_type_declaration_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_declaration_statement_2")) return false;
    hh_typevar(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (hh_type (',' hh_type)* ','?)?
  public static boolean hh_type_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh type list>");
    hh_type_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_TYPE_LIST, true, false, null);
    return true;
  }

  // hh_type (',' hh_type)* ','?
  private static boolean hh_type_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_type(builder_, level_ + 1);
    result_ = result_ && hh_type_list_0_1(builder_, level_ + 1);
    result_ = result_ && hh_type_list_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' hh_type)*
  private static boolean hh_type_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!hh_type_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "hh_type_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' hh_type
  private static boolean hh_type_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean hh_type_list_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_list_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_TYPELIST_LT hh_type_list T_TYPELIST_GT
  public static boolean hh_typeargs_opt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typeargs_opt")) return false;
    if (!nextTokenIs(builder_, T_TYPELIST_LT)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_TYPELIST_LT);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, hh_type_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_TYPELIST_GT) && result_;
    exit_section_(builder_, level_, marker_, HH_TYPEARGS_OPT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_TYPELIST_LT hh_typevar_list T_TYPELIST_GT
  public static boolean hh_typevar(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar")) return false;
    if (!nextTokenIs(builder_, T_TYPELIST_LT)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_TYPELIST_LT);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, hh_typevar_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_TYPELIST_GT) && result_;
    exit_section_(builder_, level_, marker_, HH_TYPEVAR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // hh_typevar_variance? identifier (T_AS hh_type)?
  public static boolean hh_typevar_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh typevar item>");
    result_ = hh_typevar_item_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && hh_typevar_item_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_TYPEVAR_ITEM, result_, false, null);
    return result_;
  }

  // hh_typevar_variance?
  private static boolean hh_typevar_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_item_0")) return false;
    hh_typevar_variance(builder_, level_ + 1);
    return true;
  }

  // (T_AS hh_type)?
  private static boolean hh_typevar_item_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_item_2")) return false;
    hh_typevar_item_2_0(builder_, level_ + 1);
    return true;
  }

  // T_AS hh_type
  private static boolean hh_typevar_item_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_item_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AS);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (hh_typevar_item (',' hh_typevar_item)?)?
  public static boolean hh_typevar_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh typevar list>");
    hh_typevar_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_TYPEVAR_LIST, true, false, null);
    return true;
  }

  // hh_typevar_item (',' hh_typevar_item)?
  private static boolean hh_typevar_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_typevar_item(builder_, level_ + 1);
    result_ = result_ && hh_typevar_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' hh_typevar_item)?
  private static boolean hh_typevar_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_list_0_1")) return false;
    hh_typevar_list_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ',' hh_typevar_item
  private static boolean hh_typevar_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_typevar_item(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '+' | '-'
  public static boolean hh_typevar_variance(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_variance")) return false;
    if (!nextTokenIs(builder_, "<hh typevar variance>", T_PLUS, T_MINUS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh typevar variance>");
    result_ = consumeToken(builder_, T_PLUS);
    if (!result_) result_ = consumeToken(builder_, T_MINUS);
    exit_section_(builder_, level_, marker_, HH_TYPEVAR_VARIANCE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_XHP_LABEL
  public static boolean hh_xhp_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_xhp_type")) return false;
    if (!nextTokenIs(builder_, T_XHP_LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_XHP_LABEL);
    exit_section_(builder_, marker_, HH_XHP_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_CLOSE_TAG T_INLINE_HTML? T_OPEN_TAG?
  public static boolean html_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "html_statement")) return false;
    if (!nextTokenIs(builder_, T_CLOSE_TAG)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_CLOSE_TAG);
    result_ = result_ && html_statement_1(builder_, level_ + 1);
    result_ = result_ && html_statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, HTML_STATEMENT, result_);
    return result_;
  }

  // T_INLINE_HTML?
  private static boolean html_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "html_statement_1")) return false;
    consumeToken(builder_, T_INLINE_HTML);
    return true;
  }

  // T_OPEN_TAG?
  private static boolean html_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "html_statement_2")) return false;
    consumeToken(builder_, T_OPEN_TAG);
    return true;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs
  public static boolean ident_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ident_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<ident type>");
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, IDENT_TYPE, result_, false, null);
    return result_;
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
  public static boolean identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<identifier>");
    result_ = consumeToken(builder_, T_STRING);
    if (!result_) result_ = consumeToken(builder_, T_XHP_ATTRIBUTE);
    if (!result_) result_ = consumeToken(builder_, T_XHP_CATEGORY);
    if (!result_) result_ = consumeToken(builder_, T_XHP_CHILDREN);
    if (!result_) result_ = consumeToken(builder_, T_XHP_REQUIRED);
    if (!result_) result_ = consumeToken(builder_, T_ENUM);
    if (!result_) result_ = consumeToken(builder_, T_WHERE);
    if (!result_) result_ = consumeToken(builder_, T_JOIN);
    if (!result_) result_ = consumeToken(builder_, T_ON);
    if (!result_) result_ = consumeToken(builder_, T_IN);
    if (!result_) result_ = consumeToken(builder_, T_EQUALS);
    if (!result_) result_ = consumeToken(builder_, T_INTO);
    if (!result_) result_ = consumeToken(builder_, T_LET);
    if (!result_) result_ = consumeToken(builder_, T_ORDERBY);
    if (!result_) result_ = consumeToken(builder_, T_ASCENDING);
    if (!result_) result_ = consumeToken(builder_, T_DESCENDING);
    if (!result_) result_ = consumeToken(builder_, T_SELECT);
    if (!result_) result_ = consumeToken(builder_, T_GROUP);
    if (!result_) result_ = consumeToken(builder_, T_BY);
    if (!result_) result_ = consumeToken(builder_, T_TRUE);
    if (!result_) result_ = consumeToken(builder_, T_FALSE);
    exit_section_(builder_, level_, marker_, IDENTIFIER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // new_if_statement |  normal_if_statement
  public static boolean if_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement")) return false;
    if (!nextTokenIs(builder_, T_IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = new_if_statement(builder_, level_ + 1);
    if (!result_) result_ = normal_if_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_IMPLEMENTS interface_list
  public static boolean implements_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implements_list")) return false;
    if (!nextTokenIs(builder_, T_IMPLEMENTS)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_IMPLEMENTS);
    pinned_ = result_; // pin = 1
    result_ = result_ && interface_list(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, IMPLEMENTS_LIST, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // statement
  //                     | function_declaration_statement
  //                     | class_declaration_statement
  //                     | interface_declaration_statement
  //                     | trait_declaration_statement
  static boolean inner_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inner_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = function_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = class_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = interface_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = trait_declaration_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // inner_statement*
  public static boolean inner_statement_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inner_statement_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<inner statement list>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!inner_statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "inner_statement_list", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, INNER_STATEMENT_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // T_INSTANCEOF class_name_reference
  public static boolean instanceof_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instanceof_expr")) return false;
    if (!nextTokenIs(builder_, T_INSTANCEOF)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, T_INSTANCEOF);
    pinned_ = result_; // pin = 1
    result_ = result_ && class_name_reference(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INSTANCEOF_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // cast_expr_wrapper instanceof_expr*
  static boolean instanceof_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instanceof_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = cast_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && instanceof_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // instanceof_expr*
  private static boolean instanceof_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instanceof_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!instanceof_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "instanceof_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // user_attributes? T_INTERFACE identifier hh_typevar?  interface_extends_list? class_statement_block
  public static boolean interface_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration_statement")) return false;
    if (!nextTokenIs(builder_, "<interface declaration statement>", T_INTERFACE, T_SL)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<interface declaration statement>");
    result_ = interface_declaration_statement_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_INTERFACE);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, identifier(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, interface_declaration_statement_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, interface_declaration_statement_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && class_statement_block(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, INTERFACE_DECLARATION_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // user_attributes?
  private static boolean interface_declaration_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration_statement_0")) return false;
    user_attributes(builder_, level_ + 1);
    return true;
  }

  // hh_typevar?
  private static boolean interface_declaration_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration_statement_3")) return false;
    hh_typevar(builder_, level_ + 1);
    return true;
  }

  // interface_extends_list?
  private static boolean interface_declaration_statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration_statement_4")) return false;
    interface_extends_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_EXTENDS interface_list
  public static boolean interface_extends_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_extends_list")) return false;
    if (!nextTokenIs(builder_, T_EXTENDS)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_EXTENDS);
    pinned_ = result_; // pin = 1
    result_ = result_ && interface_list(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INTERFACE_EXTENDS_LIST, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (fully_qualified_class_name (',' fully_qualified_class_name)*)?
  public static boolean interface_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<interface list>");
    interface_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INTERFACE_LIST, true, false, null);
    return true;
  }

  // fully_qualified_class_name (',' fully_qualified_class_name)*
  private static boolean interface_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    result_ = result_ && interface_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' fully_qualified_class_name)*
  private static boolean interface_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!interface_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "interface_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' fully_qualified_class_name
  private static boolean interface_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && fully_qualified_class_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_EMPTY '(' expr ')'
  public static boolean internal_empty_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_empty_expr")) return false;
    if (!nextTokenIs(builder_, T_EMPTY)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_EMPTY);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, expr(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, INTERNAL_EMPTY_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_EVAL '(' expr ')'
  public static boolean internal_eval_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_eval_expr")) return false;
    if (!nextTokenIs(builder_, T_EVAL)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_EVAL);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, expr(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, INTERNAL_EVAL_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // internal_isset_expr
  //                                 | internal_empty_expr
  //                                 | internal_include_expr
  //                                 | internal_eval_expr
  //                                 | internal_require_expr
  //                                 | internal_tuple_expr
  //                                 | exit_expr
  //                                 | print_expr
  static boolean internal_functions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = internal_isset_expr(builder_, level_ + 1);
    if (!result_) result_ = internal_empty_expr(builder_, level_ + 1);
    if (!result_) result_ = internal_include_expr(builder_, level_ + 1);
    if (!result_) result_ = internal_eval_expr(builder_, level_ + 1);
    if (!result_) result_ = internal_require_expr(builder_, level_ + 1);
    if (!result_) result_ = internal_tuple_expr(builder_, level_ + 1);
    if (!result_) result_ = exit_expr(builder_, level_ + 1);
    if (!result_) result_ = print_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (T_INCLUDE|T_INCLUDE_ONCE) expr
  public static boolean internal_include_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_include_expr")) return false;
    if (!nextTokenIs(builder_, "<internal include expr>", T_INCLUDE, T_INCLUDE_ONCE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<internal include expr>");
    result_ = internal_include_expr_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INTERNAL_INCLUDE_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // T_INCLUDE|T_INCLUDE_ONCE
  private static boolean internal_include_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_include_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_INCLUDE);
    if (!result_) result_ = consumeToken(builder_, T_INCLUDE_ONCE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ISSET '(' variable_list ')'
  public static boolean internal_isset_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_isset_expr")) return false;
    if (!nextTokenIs(builder_, T_ISSET)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_ISSET);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, variable_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, INTERNAL_ISSET_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (T_REQUIRE|T_REQUIRE_ONCE) expr
  public static boolean internal_require_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_require_expr")) return false;
    if (!nextTokenIs(builder_, "<internal require expr>", T_REQUIRE, T_REQUIRE_ONCE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<internal require expr>");
    result_ = internal_require_expr_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INTERNAL_REQUIRE_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // T_REQUIRE|T_REQUIRE_ONCE
  private static boolean internal_require_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_require_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_REQUIRE);
    if (!result_) result_ = consumeToken(builder_, T_REQUIRE_ONCE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_TUPLE '(' function_call_parameter_list ')'
  public static boolean internal_tuple_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_tuple_expr")) return false;
    if (!nextTokenIs(builder_, T_TUPLE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_TUPLE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, function_call_parameter_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, INTERNAL_TUPLE_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_JOIN T_VARIABLE T_IN expr T_ON expr T_EQUALS expr
  public static boolean join_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_clause")) return false;
    if (!nextTokenIs(builder_, T_JOIN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_JOIN, T_VARIABLE, T_IN);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ON);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUALS);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, JOIN_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_JOIN T_VARIABLE T_IN expr T_ON expr T_EQUALS expr T_INTO T_VARIABLE
  public static boolean join_into_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_into_clause")) return false;
    if (!nextTokenIs(builder_, T_JOIN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_JOIN, T_VARIABLE, T_IN);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ON);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUALS);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, T_INTO, T_VARIABLE);
    exit_section_(builder_, marker_, JOIN_INTO_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier ':'
  public static boolean label_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<label statement>");
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COLON);
    exit_section_(builder_, level_, marker_, LABEL_STATEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_LAMBDA_ARROW (expr | await_expr | (block_statement))
  public static boolean lambda_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_body")) return false;
    if (!nextTokenIs(builder_, T_LAMBDA_ARROW)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LAMBDA_ARROW);
    pinned_ = result_; // pin = 1
    result_ = result_ && lambda_body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LAMBDA_BODY, result_, pinned_, null);
    return result_ || pinned_;
  }

  // expr | await_expr | (block_statement)
  private static boolean lambda_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = await_expr(builder_, level_ + 1);
    if (!result_) result_ = lambda_body_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (block_statement)
  private static boolean lambda_body_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_body_1_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = block_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ASYNC? (T_VARIABLE|(T_LAMBDA_OP  parameter_list T_LAMBDA_CP hh_opt_return_type?)) lambda_body
  public static boolean lambda_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<lambda expr>");
    result_ = lambda_expr_0(builder_, level_ + 1);
    result_ = result_ && lambda_expr_1(builder_, level_ + 1);
    result_ = result_ && lambda_body(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LAMBDA_EXPR, result_, false, null);
    return result_;
  }

  // T_ASYNC?
  private static boolean lambda_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expr_0")) return false;
    consumeToken(builder_, T_ASYNC);
    return true;
  }

  // T_VARIABLE|(T_LAMBDA_OP  parameter_list T_LAMBDA_CP hh_opt_return_type?)
  private static boolean lambda_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = lambda_expr_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_LAMBDA_OP  parameter_list T_LAMBDA_CP hh_opt_return_type?
  private static boolean lambda_expr_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expr_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LAMBDA_OP);
    result_ = result_ && parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LAMBDA_CP);
    result_ = result_ && lambda_expr_1_1_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hh_opt_return_type?
  private static boolean lambda_expr_1_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expr_1_1_3")) return false;
    hh_opt_return_type(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_USE '(' lexical_var_list ')'
  public static boolean lambda_use_vars(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_use_vars")) return false;
    if (!nextTokenIs(builder_, T_USE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_USE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, lexical_var_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, LAMBDA_USE_VARS, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_LET T_VARIABLE '=' expr
  public static boolean let_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_clause")) return false;
    if (!nextTokenIs(builder_, T_LET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_LET, T_VARIABLE);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, LET_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // ('&'? T_VARIABLE (',' '&'? T_VARIABLE)* ','?)?
  public static boolean lexical_var_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<lexical var list>");
    lexical_var_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LEXICAL_VAR_LIST, true, false, null);
    return true;
  }

  // '&'? T_VARIABLE (',' '&'? T_VARIABLE)* ','?
  private static boolean lexical_var_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lexical_var_list_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_VARIABLE);
    result_ = result_ && lexical_var_list_0_2(builder_, level_ + 1);
    result_ = result_ && lexical_var_list_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&'?
  private static boolean lexical_var_list_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list_0_0")) return false;
    consumeToken(builder_, T_AND);
    return true;
  }

  // (',' '&'? T_VARIABLE)*
  private static boolean lexical_var_list_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list_0_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!lexical_var_list_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "lexical_var_list_0_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' '&'? T_VARIABLE
  private static boolean lexical_var_list_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && lexical_var_list_0_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_VARIABLE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&'?
  private static boolean lexical_var_list_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list_0_2_0_1")) return false;
    consumeToken(builder_, T_AND);
    return true;
  }

  // ','?
  private static boolean lexical_var_list_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list_0_3")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_LIST '(' assignment_list ')' '=' expr
  public static boolean list_assignment_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_assignment_expr")) return false;
    if (!nextTokenIs(builder_, T_LIST)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LIST);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, assignment_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_EQUAL)) && result_;
    result_ = pinned_ && expr(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, LIST_ASSIGNMENT_EXPR, result_, pinned_, null);
    return result_ || pinned_;
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
  public static boolean literal_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<literal expr>");
    result_ = consumeToken(builder_, T_LNUMBER);
    if (!result_) result_ = consumeToken(builder_, T_DNUMBER);
    if (!result_) result_ = consumeToken(builder_, T_ONUMBER);
    if (!result_) result_ = consumeToken(builder_, T_CONSTANT_ENCAPSED_STRING);
    if (!result_) result_ = consumeToken(builder_, T_LINE);
    if (!result_) result_ = consumeToken(builder_, T_FILE);
    if (!result_) result_ = consumeToken(builder_, T_DIR);
    if (!result_) result_ = consumeToken(builder_, T_CLASS_C);
    if (!result_) result_ = consumeToken(builder_, T_TRAIT_C);
    if (!result_) result_ = consumeToken(builder_, T_METHOD_C);
    if (!result_) result_ = consumeToken(builder_, T_FUNC_C);
    if (!result_) result_ = consumeToken(builder_, T_NS_C);
    if (!result_) result_ = consumeToken(builder_, T_COMPILER_HALT_OFFSET);
    if (!result_) result_ = parseTokens(builder_, 0, T_START_HEREDOC, T_ENCAPSED_AND_WHITESPACE, T_END_HEREDOC);
    if (!result_) result_ = parseTokens(builder_, 0, T_START_HEREDOC, T_END_HEREDOC);
    exit_section_(builder_, level_, marker_, LITERAL_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_LNUMBER
  // | T_DNUMBER
  // | T_ONUMBER
  // | T_CONSTANT_ENCAPSED_STRING
  // | T_START_HEREDOC T_ENCAPSED_AND_WHITESPACE T_END_HEREDOC
  // | T_START_HEREDOC T_END_HEREDOC
  public static boolean literal_scalar_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_scalar_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<literal scalar ae>");
    result_ = consumeToken(builder_, T_LNUMBER);
    if (!result_) result_ = consumeToken(builder_, T_DNUMBER);
    if (!result_) result_ = consumeToken(builder_, T_ONUMBER);
    if (!result_) result_ = consumeToken(builder_, T_CONSTANT_ENCAPSED_STRING);
    if (!result_) result_ = parseTokens(builder_, 0, T_START_HEREDOC, T_ENCAPSED_AND_WHITESPACE, T_END_HEREDOC);
    if (!result_) result_ = parseTokens(builder_, 0, T_START_HEREDOC, T_END_HEREDOC);
    exit_section_(builder_, level_, marker_, LITERAL_SCALAR_AE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // logical_operator comparative_expr_wrapper
  public static boolean logical_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logical_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<logical expr>");
    result_ = logical_operator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && comparative_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LOGICAL_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // comparative_expr_wrapper logical_expr*
  static boolean logical_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logical_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comparative_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && logical_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // logical_expr*
  private static boolean logical_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logical_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!logical_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "logical_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // T_BOOLEAN_OR | T_BOOLEAN_AND | T_LOGICAL_OR | T_LOGICAL_AND | T_LOGICAL_XOR
  public static boolean logical_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logical_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<logical operator>");
    result_ = consumeToken(builder_, T_BOOLEAN_OR);
    if (!result_) result_ = consumeToken(builder_, T_BOOLEAN_AND);
    if (!result_) result_ = consumeToken(builder_, T_LOGICAL_OR);
    if (!result_) result_ = consumeToken(builder_, T_LOGICAL_AND);
    if (!result_) result_ = consumeToken(builder_, T_LOGICAL_XOR);
    exit_section_(builder_, level_, marker_, LOGICAL_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (T_MIARRAY|T_MSARRAY) '(' array_pair_list ')'
  public static boolean map_array_literal_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_array_literal_expr")) return false;
    if (!nextTokenIs(builder_, "<map array literal expr>", T_MIARRAY, T_MSARRAY)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<map array literal expr>");
    result_ = map_array_literal_expr_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, array_pair_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, MAP_ARRAY_LITERAL_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // T_MIARRAY|T_MSARRAY
  private static boolean map_array_literal_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_array_literal_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MIARRAY);
    if (!result_) result_ = consumeToken(builder_, T_MSARRAY);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_PUBLIC
  //                     | T_PROTECTED
  //                     | T_PRIVATE
  //                     | T_STATIC
  //                     | T_ABSTRACT
  //                     | T_FINAL
  //                     | T_ASYNC
  public static boolean member_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_modifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<member modifier>");
    result_ = consumeToken(builder_, T_PUBLIC);
    if (!result_) result_ = consumeToken(builder_, T_PROTECTED);
    if (!result_) result_ = consumeToken(builder_, T_PRIVATE);
    if (!result_) result_ = consumeToken(builder_, T_STATIC);
    if (!result_) result_ = consumeToken(builder_, T_ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, T_FINAL);
    if (!result_) result_ = consumeToken(builder_, T_ASYNC);
    exit_section_(builder_, level_, marker_, MEMBER_MODIFIER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_OBJECT_OPERATOR property_access
  public static boolean member_variable_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_variable_expr")) return false;
    if (!nextTokenIs(builder_, T_OBJECT_OPERATOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && property_access(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MEMBER_VARIABLE_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (especial_parenthesised_expr|possible_variable) (method_call_expr|member_variable_expr)*
  static boolean member_variable_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_variable_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = member_variable_wrapper_0(builder_, level_ + 1);
    result_ = result_ && member_variable_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // especial_parenthesised_expr|possible_variable
  private static boolean member_variable_wrapper_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_variable_wrapper_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = especial_parenthesised_expr(builder_, level_ + 1);
    if (!result_) result_ = possible_variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (method_call_expr|member_variable_expr)*
  private static boolean member_variable_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_variable_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!member_variable_wrapper_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "member_variable_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // method_call_expr|member_variable_expr
  private static boolean member_variable_wrapper_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_variable_wrapper_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = method_call_expr(builder_, level_ + 1);
    if (!result_) result_ = member_variable_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_OBJECT_OPERATOR ((identifier hh_typeargs_opt?)|variable_without_objects_expr|('{' expr '}'))
  //                                                                                    '(' function_call_parameter_list ')'
  public static boolean method_call_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_expr")) return false;
    if (!nextTokenIs(builder_, T_OBJECT_OPERATOR)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && method_call_expr_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, function_call_parameter_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, METHOD_CALL_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (identifier hh_typeargs_opt?)|variable_without_objects_expr|('{' expr '}')
  private static boolean method_call_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_expr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = method_call_expr_1_0(builder_, level_ + 1);
    if (!result_) result_ = variable_without_objects_expr(builder_, level_ + 1);
    if (!result_) result_ = method_call_expr_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier hh_typeargs_opt?
  private static boolean method_call_expr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_expr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && method_call_expr_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hh_typeargs_opt?
  private static boolean method_call_expr_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_expr_1_0_1")) return false;
    hh_typeargs_opt(builder_, level_ + 1);
    return true;
  }

  // '{' expr '}'
  private static boolean method_call_expr_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_expr_1_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // user_attributes? method_modifiers? T_FUNCTION '&'? identifier hh_typevar?  '(' parameter_list ')' hh_opt_return_type? function_body
  public static boolean method_function_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_function_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method function declaration>");
    result_ = method_function_declaration_0(builder_, level_ + 1);
    result_ = result_ && method_function_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_FUNCTION);
    result_ = result_ && method_function_declaration_3(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && method_function_declaration_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && method_function_declaration_9(builder_, level_ + 1);
    result_ = result_ && function_body(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, METHOD_FUNCTION_DECLARATION, result_, false, null);
    return result_;
  }

  // user_attributes?
  private static boolean method_function_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_function_declaration_0")) return false;
    user_attributes(builder_, level_ + 1);
    return true;
  }

  // method_modifiers?
  private static boolean method_function_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_function_declaration_1")) return false;
    method_modifiers(builder_, level_ + 1);
    return true;
  }

  // '&'?
  private static boolean method_function_declaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_function_declaration_3")) return false;
    consumeToken(builder_, T_AND);
    return true;
  }

  // hh_typevar?
  private static boolean method_function_declaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_function_declaration_5")) return false;
    hh_typevar(builder_, level_ + 1);
    return true;
  }

  // hh_opt_return_type?
  private static boolean method_function_declaration_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_function_declaration_9")) return false;
    hh_opt_return_type(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // member_modifier+
  public static boolean method_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method modifiers>");
    result_ = member_modifier(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!member_modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "method_modifiers", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, METHOD_MODIFIERS, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // multiplicative_operator instanceof_expr_wrapper
  public static boolean multiplicative_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<multiplicative expr>");
    result_ = multiplicative_operator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && instanceof_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MULTIPLICATIVE_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // instanceof_expr_wrapper multiplicative_expr*
  static boolean multiplicative_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = instanceof_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && multiplicative_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // multiplicative_expr*
  private static boolean multiplicative_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!multiplicative_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "multiplicative_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // '*' | '/' | '%' | T_POW
  public static boolean multiplicative_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<multiplicative operator>");
    result_ = consumeToken(builder_, T_MUL);
    if (!result_) result_ = consumeToken(builder_, T_DIV);
    if (!result_) result_ = consumeToken(builder_, T_MOD);
    if (!result_) result_ = consumeToken(builder_, T_POW);
    exit_section_(builder_, level_, marker_, MULTIPLICATIVE_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // simple_namespace_statement | block_namespace_statement
  public static boolean namespace_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_declaration_statement")) return false;
    if (!nextTokenIs(builder_, T_NAMESPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = simple_namespace_statement(builder_, level_ + 1);
    if (!result_) result_ = block_namespace_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, NAMESPACE_DECLARATION_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_NS_SEPARATOR? identifier (T_NS_SEPARATOR identifier)*
  public static boolean namespace_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_name")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<namespace name>");
    result_ = namespace_name_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && namespace_name_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NAMESPACE_NAME, result_, pinned_, null);
    return result_ || pinned_;
  }

  // T_NS_SEPARATOR?
  private static boolean namespace_name_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_name_0")) return false;
    consumeToken(builder_, T_NS_SEPARATOR);
    return true;
  }

  // (T_NS_SEPARATOR identifier)*
  private static boolean namespace_name_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_name_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!namespace_name_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "namespace_name_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // T_NS_SEPARATOR identifier
  private static boolean namespace_name_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_name_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NS_SEPARATOR);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (T_NAMESPACE namespace_name) | namespace_name
  public static boolean namespace_string(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<namespace string>");
    result_ = namespace_string_0(builder_, level_ + 1);
    if (!result_) result_ = namespace_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NAMESPACE_STRING, result_, false, null);
    return result_;
  }

  // T_NAMESPACE namespace_name
  private static boolean namespace_string_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NAMESPACE);
    result_ = result_ && namespace_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ((T_NAMESPACE T_NS_SEPARATOR? namespace_name) | namespace_name) hh_typeargs_opt?
  public static boolean namespace_string_typeargs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string_typeargs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<namespace string typeargs>");
    result_ = namespace_string_typeargs_0(builder_, level_ + 1);
    result_ = result_ && namespace_string_typeargs_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NAMESPACE_STRING_TYPEARGS, result_, false, null);
    return result_;
  }

  // (T_NAMESPACE T_NS_SEPARATOR? namespace_name) | namespace_name
  private static boolean namespace_string_typeargs_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string_typeargs_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namespace_string_typeargs_0_0(builder_, level_ + 1);
    if (!result_) result_ = namespace_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_NAMESPACE T_NS_SEPARATOR? namespace_name
  private static boolean namespace_string_typeargs_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string_typeargs_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NAMESPACE);
    result_ = result_ && namespace_string_typeargs_0_0_1(builder_, level_ + 1);
    result_ = result_ && namespace_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_NS_SEPARATOR?
  private static boolean namespace_string_typeargs_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string_typeargs_0_0_1")) return false;
    consumeToken(builder_, T_NS_SEPARATOR);
    return true;
  }

  // hh_typeargs_opt?
  private static boolean namespace_string_typeargs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string_typeargs_1")) return false;
    hh_typeargs_opt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_ELSE ':' inner_statement_list
  public static boolean new_else_single(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_else_single")) return false;
    if (!nextTokenIs(builder_, T_ELSE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_ELSE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_COLON));
    result_ = pinned_ && inner_statement_list(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, NEW_ELSE_SINGLE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_ELSEIF parenthesized_expr ':' inner_statement_list
  public static boolean new_elseif_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_elseif_body")) return false;
    if (!nextTokenIs(builder_, T_ELSEIF)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_ELSEIF);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, parenthesized_expr(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_COLON)) && result_;
    result_ = pinned_ && inner_statement_list(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, NEW_ELSEIF_BODY, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // new_elseif_body*
  public static boolean new_elseif_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_elseif_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<new elseif list>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!new_elseif_body(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "new_elseif_list", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, NEW_ELSEIF_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // T_NEW class_name_reference ctor_arguments
  public static boolean new_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_expr")) return false;
    if (!nextTokenIs(builder_, T_NEW)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_NEW);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, class_name_reference(builder_, level_ + 1));
    result_ = pinned_ && ctor_arguments(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, NEW_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_IF parenthesized_expr ':' inner_statement_list new_elseif_list new_else_single? T_ENDIF ';'
  static boolean new_if_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_if_statement")) return false;
    if (!nextTokenIs(builder_, T_IF)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_IF);
    result_ = result_ && parenthesized_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COLON);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, inner_statement_list(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, new_elseif_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, new_if_statement_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_ENDIF)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // new_else_single?
  private static boolean new_if_statement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_if_statement_5")) return false;
    new_else_single(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_IF parenthesized_expr statement? elseif_list else_single?
  static boolean normal_if_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "normal_if_statement")) return false;
    if (!nextTokenIs(builder_, T_IF)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_IF);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, parenthesized_expr(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, normal_if_statement_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, elseif_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && normal_if_statement_4(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // statement?
  private static boolean normal_if_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "normal_if_statement_2")) return false;
    statement(builder_, level_ + 1);
    return true;
  }

  // else_single?
  private static boolean normal_if_statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "normal_if_statement_4")) return false;
    else_single(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // try_finally?
  static boolean optional_finally(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "optional_finally")) return false;
    try_finally(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_ORDERBY orderings
  public static boolean orderby_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "orderby_clause")) return false;
    if (!nextTokenIs(builder_, T_ORDERBY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ORDERBY);
    result_ = result_ && orderings(builder_, level_ + 1);
    exit_section_(builder_, marker_, ORDERBY_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr ordering_direction?
  public static boolean ordering(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ordering")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<ordering>");
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && ordering_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ORDERING, result_, false, null);
    return result_;
  }

  // ordering_direction?
  private static boolean ordering_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ordering_1")) return false;
    ordering_direction(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_ASCENDING | T_DESCENDING
  public static boolean ordering_direction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ordering_direction")) return false;
    if (!nextTokenIs(builder_, "<ordering direction>", T_ASCENDING, T_DESCENDING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<ordering direction>");
    result_ = consumeToken(builder_, T_ASCENDING);
    if (!result_) result_ = consumeToken(builder_, T_DESCENDING);
    exit_section_(builder_, level_, marker_, ORDERING_DIRECTION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ordering (',' ordering)*
  public static boolean orderings(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "orderings")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<orderings>");
    result_ = ordering(builder_, level_ + 1);
    result_ = result_ && orderings_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ORDERINGS, result_, false, null);
    return result_;
  }

  // (',' ordering)*
  private static boolean orderings_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "orderings_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!orderings_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "orderings_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' ordering
  private static boolean orderings_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "orderings_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && ordering(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // user_attributes? parameter_modifiers? hh_type? ('&'|"...")? T_VARIABLE ('=' static_expr)?
  public static boolean parameter_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter item>");
    result_ = parameter_item_0(builder_, level_ + 1);
    result_ = result_ && parameter_item_1(builder_, level_ + 1);
    result_ = result_ && parameter_item_2(builder_, level_ + 1);
    result_ = result_ && parameter_item_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_VARIABLE);
    result_ = result_ && parameter_item_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PARAMETER_ITEM, result_, false, null);
    return result_;
  }

  // user_attributes?
  private static boolean parameter_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_item_0")) return false;
    user_attributes(builder_, level_ + 1);
    return true;
  }

  // parameter_modifiers?
  private static boolean parameter_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_item_1")) return false;
    parameter_modifiers(builder_, level_ + 1);
    return true;
  }

  // hh_type?
  private static boolean parameter_item_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_item_2")) return false;
    hh_type(builder_, level_ + 1);
    return true;
  }

  // ('&'|"...")?
  private static boolean parameter_item_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_item_3")) return false;
    parameter_item_3_0(builder_, level_ + 1);
    return true;
  }

  // '&'|"..."
  private static boolean parameter_item_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_item_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AND);
    if (!result_) result_ = consumeToken(builder_, T_ELLIPSIS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('=' static_expr)?
  private static boolean parameter_item_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_item_5")) return false;
    parameter_item_5_0(builder_, level_ + 1);
    return true;
  }

  // '=' static_expr
  private static boolean parameter_item_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_item_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (parameter_item (',' parameter_item)*  ','?)?
  public static boolean parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter list>");
    parameter_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PARAMETER_LIST, true, false, null);
    return true;
  }

  // parameter_item (',' parameter_item)*  ','?
  private static boolean parameter_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_item(builder_, level_ + 1);
    result_ = result_ && parameter_list_0_1(builder_, level_ + 1);
    result_ = result_ && parameter_list_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' parameter_item)*
  private static boolean parameter_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!parameter_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameter_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' parameter_item
  private static boolean parameter_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && parameter_item(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean parameter_list_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_PUBLIC
  //                         | T_PROTECTED
  //                         | T_PRIVATE
  public static boolean parameter_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_modifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter modifier>");
    result_ = consumeToken(builder_, T_PUBLIC);
    if (!result_) result_ = consumeToken(builder_, T_PROTECTED);
    if (!result_) result_ = consumeToken(builder_, T_PRIVATE);
    exit_section_(builder_, level_, marker_, PARAMETER_MODIFIER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // parameter_modifier+
  static boolean parameter_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_modifier(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!parameter_modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameter_modifiers", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' expr ')'
  public static boolean parenthesized_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenthesized_expr")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expr(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, PARENTHESIZED_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '(' variable ')'
  static boolean parenthesized_variable_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenthesized_variable_expr")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // simple_function_call_expr
  //                                  | callable_function_call_expr
  //                                  | class_method_call_expr
  //                                  | dimmable_variable_access_expr
  //                                  | static_class_variable_expr
  //                                  | variable_without_objects_expr
  //                                  | parenthesized_variable_expr
  static boolean possible_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "possible_variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = simple_function_call_expr(builder_, level_ + 1);
    if (!result_) result_ = callable_function_call_expr(builder_, level_ + 1);
    if (!result_) result_ = class_method_call_expr(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_access_expr(builder_, level_ + 1);
    if (!result_) result_ = static_class_variable_expr(builder_, level_ + 1);
    if (!result_) result_ = variable_without_objects_expr(builder_, level_ + 1);
    if (!result_) result_ = parenthesized_variable_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // prefix_operator prefix_expr_wrapper
  public static boolean prefix_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefix_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<prefix expr>");
    result_ = prefix_operator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && prefix_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PREFIX_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // prefix_expr  | primary_expr
  static boolean prefix_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefix_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = prefix_expr(builder_, level_ + 1);
    if (!result_) result_ = primary_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '@' | '!' | '~' | '+' | '-' | T_INC | T_DEC
  public static boolean prefix_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefix_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<prefix operator>");
    result_ = consumeToken(builder_, T_SILENCE);
    if (!result_) result_ = consumeToken(builder_, T_NEGATE);
    if (!result_) result_ = consumeToken(builder_, T_NOT);
    if (!result_) result_ = consumeToken(builder_, T_PLUS);
    if (!result_) result_ = consumeToken(builder_, T_MINUS);
    if (!result_) result_ = consumeToken(builder_, T_INC);
    if (!result_) result_ = consumeToken(builder_, T_DEC);
    exit_section_(builder_, level_, marker_, PREFIX_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // dim_expr
  //                         | lambda_expr
  //                         | expr_with_parens
  //                         | parenthesized_expr
  //                         | variable
  //                         | scalar_expr
  //                         | array_literal_expr
  //                         | shape_literal_expr
  //                         | map_array_literal_expr
  //                         | varray_literal_expr
  //                         | backticks_expr
  //                         | closure_expr
  //                         | internal_functions
  static boolean primary_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dim_expr(builder_, level_ + 1);
    if (!result_) result_ = lambda_expr(builder_, level_ + 1);
    if (!result_) result_ = expr_with_parens(builder_, level_ + 1);
    if (!result_) result_ = parenthesized_expr(builder_, level_ + 1);
    if (!result_) result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = scalar_expr(builder_, level_ + 1);
    if (!result_) result_ = array_literal_expr(builder_, level_ + 1);
    if (!result_) result_ = shape_literal_expr(builder_, level_ + 1);
    if (!result_) result_ = map_array_literal_expr(builder_, level_ + 1);
    if (!result_) result_ = varray_literal_expr(builder_, level_ + 1);
    if (!result_) result_ = backticks_expr(builder_, level_ + 1);
    if (!result_) result_ = closure_expr(builder_, level_ + 1);
    if (!result_) result_ = internal_functions(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_PRINT expr
  public static boolean print_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "print_expr")) return false;
    if (!nextTokenIs(builder_, T_PRINT)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_PRINT);
    pinned_ = result_; // pin = 1
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PRINT_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // property_access_without_variables | property_access_variable
  static boolean property_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_access")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = property_access_without_variables(builder_, level_ + 1);
    if (!result_) result_ = property_access_variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable_without_objects_expr
  static boolean property_access_variable(PsiBuilder builder_, int level_) {
    return variable_without_objects_expr(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // identifier|'{' expr '}'
  static boolean property_access_without_variables(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_access_without_variables")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = property_access_without_variables_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' expr '}'
  private static boolean property_access_without_variables_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_access_without_variables_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable '=' query_expr
  public static boolean query_assign_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_assign_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<query assign expr>");
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    pinned_ = result_; // pin = 2
    result_ = result_ && query_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, QUERY_ASSIGN_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // query_body_clauses? select_or_group_clause query_continuation?
  public static boolean query_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<query body>");
    result_ = query_body_0(builder_, level_ + 1);
    result_ = result_ && select_or_group_clause(builder_, level_ + 1);
    result_ = result_ && query_body_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, QUERY_BODY, result_, false, null);
    return result_;
  }

  // query_body_clauses?
  private static boolean query_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body_0")) return false;
    query_body_clauses(builder_, level_ + 1);
    return true;
  }

  // query_continuation?
  private static boolean query_body_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body_2")) return false;
    query_continuation(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // from_clause | let_clause | where_clause | join_clause | join_into_clause | orderby_clause
  public static boolean query_body_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body_clause")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<query body clause>");
    result_ = from_clause(builder_, level_ + 1);
    if (!result_) result_ = let_clause(builder_, level_ + 1);
    if (!result_) result_ = where_clause(builder_, level_ + 1);
    if (!result_) result_ = join_clause(builder_, level_ + 1);
    if (!result_) result_ = join_into_clause(builder_, level_ + 1);
    if (!result_) result_ = orderby_clause(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, QUERY_BODY_CLAUSE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // query_body_clause+
  public static boolean query_body_clauses(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body_clauses")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<query body clauses>");
    result_ = query_body_clause(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!query_body_clause(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "query_body_clauses", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, QUERY_BODY_CLAUSES, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_INTO T_VARIABLE query_body
  public static boolean query_continuation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_continuation")) return false;
    if (!nextTokenIs(builder_, T_INTO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_INTO, T_VARIABLE);
    result_ = result_ && query_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUERY_CONTINUATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // query_head query_body
  public static boolean query_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_expr")) return false;
    if (!nextTokenIs(builder_, T_FROM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = query_head(builder_, level_ + 1);
    result_ = result_ && query_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUERY_EXPR, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_FROM T_VARIABLE T_IN expr
  public static boolean query_head(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_head")) return false;
    if (!nextTokenIs(builder_, T_FROM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_FROM, T_VARIABLE, T_IN);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUERY_HEAD, result_);
    return result_;
  }

  /* ********************************************************** */
  // compound_variable ((array_offset_access)|('{' expr '}')|compound_variable)*
  public static boolean reference_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_variable")) return false;
    if (!nextTokenIs(builder_, "<reference variable>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<reference variable>");
    result_ = compound_variable(builder_, level_ + 1);
    result_ = result_ && reference_variable_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, REFERENCE_VARIABLE, result_, false, null);
    return result_;
  }

  // ((array_offset_access)|('{' expr '}')|compound_variable)*
  private static boolean reference_variable_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_variable_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!reference_variable_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "reference_variable_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (array_offset_access)|('{' expr '}')|compound_variable
  private static boolean reference_variable_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_variable_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = reference_variable_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = reference_variable_1_0_1(builder_, level_ + 1);
    if (!result_) result_ = compound_variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (array_offset_access)
  private static boolean reference_variable_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_variable_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = array_offset_access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' expr '}'
  private static boolean reference_variable_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_variable_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_RETURN  (expr|query_expr|await_expr)? ';'
  public static boolean return_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement")) return false;
    if (!nextTokenIs(builder_, T_RETURN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_RETURN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, return_statement_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, RETURN_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (expr|query_expr|await_expr)?
  private static boolean return_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement_1")) return false;
    return_statement_1_0(builder_, level_ + 1);
    return true;
  }

  // expr|query_expr|await_expr
  private static boolean return_statement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = query_expr(builder_, level_ + 1);
    if (!result_) result_ = await_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // class_constant
  //             |  namespace_string
  //             | T_STRING_VARNAME
  //             | literal_expr
  //             | double_quotes_string
  //             | single_quotes_string
  //             | here_doc_string
  public static boolean scalar_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scalar_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<scalar expr>");
    result_ = class_constant(builder_, level_ + 1);
    if (!result_) result_ = namespace_string(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_STRING_VARNAME);
    if (!result_) result_ = literal_expr(builder_, level_ + 1);
    if (!result_) result_ = double_quotes_string(builder_, level_ + 1);
    if (!result_) result_ = single_quotes_string(builder_, level_ + 1);
    if (!result_) result_ = here_doc_string(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SCALAR_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_SELECT expr
  public static boolean select_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "select_clause")) return false;
    if (!nextTokenIs(builder_, T_SELECT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SELECT);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, SELECT_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // select_clause | group_clause
  public static boolean select_or_group_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "select_or_group_clause")) return false;
    if (!nextTokenIs(builder_, "<select or group clause>", T_GROUP, T_SELECT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<select or group clause>");
    result_ = select_clause(builder_, level_ + 1);
    if (!result_) result_ = group_clause(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SELECT_OR_GROUP_CLAUSE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ';'
  public static boolean semicolon_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "semicolon_statement")) return false;
    if (!nextTokenIs(builder_, T_SEMICOLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, SEMICOLON_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_CONSTANT_ENCAPSED_STRING | class_constant
  public static boolean shape_keyname(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_keyname")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<shape keyname>");
    result_ = consumeToken(builder_, T_CONSTANT_ENCAPSED_STRING);
    if (!result_) result_ = class_constant(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SHAPE_KEYNAME, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_SHAPE '(' shape_pair_list ')'
  public static boolean shape_literal_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_literal_expr")) return false;
    if (!nextTokenIs(builder_, T_SHAPE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_SHAPE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, shape_pair_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, SHAPE_LITERAL_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // shape_keyname T_DOUBLE_ARROW expr
  public static boolean shape_pair(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_pair")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<shape pair>");
    result_ = shape_keyname(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    pinned_ = result_; // pin = 2
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SHAPE_PAIR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (shape_pair (',' shape_pair)* ','?)?
  public static boolean shape_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_pair_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<shape pair list>");
    shape_pair_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SHAPE_PAIR_LIST, true, false, null);
    return true;
  }

  // shape_pair (',' shape_pair)* ','?
  private static boolean shape_pair_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_pair_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = shape_pair(builder_, level_ + 1);
    result_ = result_ && shape_pair_list_0_1(builder_, level_ + 1);
    result_ = result_ && shape_pair_list_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' shape_pair)*
  private static boolean shape_pair_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_pair_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!shape_pair_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "shape_pair_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' shape_pair
  private static boolean shape_pair_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_pair_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && shape_pair(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean shape_pair_list_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_pair_list_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // shape_keyname T_DOUBLE_ARROW static_expr
  public static boolean shape_pair_static(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_pair_static")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<shape pair static>");
    result_ = shape_keyname(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    pinned_ = result_; // pin = 2
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SHAPE_PAIR_STATIC, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // shift_operator additive_or_concatenation_expr_wrapper
  public static boolean shift_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expr")) return false;
    if (!nextTokenIs(builder_, "<shift expr>", T_SL, T_SR)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<shift expr>");
    result_ = shift_operator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && additive_or_concatenation_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SHIFT_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // additive_or_concatenation_expr_wrapper shift_expr*
  static boolean shift_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = additive_or_concatenation_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && shift_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // shift_expr*
  private static boolean shift_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!shift_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "shift_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // T_SL | T_SR
  public static boolean shift_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_operator")) return false;
    if (!nextTokenIs(builder_, "<shift operator>", T_SL, T_SR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<shift operator>");
    result_ = consumeToken(builder_, T_SL);
    if (!result_) result_ = consumeToken(builder_, T_SR);
    exit_section_(builder_, level_, marker_, SHIFT_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '[' array_pair_list ']'
  static boolean short_array_literal_base(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "short_array_literal_base")) return false;
    if (!nextTokenIs(builder_, T_LBRACKET)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LBRACKET);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, array_pair_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RBRACKET) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // namespace_string_typeargs '(' function_call_parameter_list ')'
  public static boolean simple_function_call_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_function_call_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<simple function call expr>");
    result_ = namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, function_call_parameter_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, SIMPLE_FUNCTION_CALL_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_NAMESPACE namespace_name ';'
  static boolean simple_namespace_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_namespace_statement")) return false;
    if (!nextTokenIs(builder_, T_NAMESPACE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_NAMESPACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, namespace_name(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // "'" encaps_list "'"
  static boolean single_quotes_string(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "single_quotes_string")) return false;
    if (!nextTokenIs(builder_, T_SINGLE_QUOTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SINGLE_QUOTE);
    result_ = result_ && encaps_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SINGLE_QUOTE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
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
  //                 | expr_statement
  //                 | static_statement
  //                 | label_statement
  static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = block_statement(builder_, level_ + 1);
    if (!result_) result_ = if_statement(builder_, level_ + 1);
    if (!result_) result_ = while_statement(builder_, level_ + 1);
    if (!result_) result_ = do_while_statement(builder_, level_ + 1);
    if (!result_) result_ = for_statement(builder_, level_ + 1);
    if (!result_) result_ = switch_statement(builder_, level_ + 1);
    if (!result_) result_ = break_statement(builder_, level_ + 1);
    if (!result_) result_ = continue_statement(builder_, level_ + 1);
    if (!result_) result_ = return_statement(builder_, level_ + 1);
    if (!result_) result_ = yield_statement(builder_, level_ + 1);
    if (!result_) result_ = global_statement(builder_, level_ + 1);
    if (!result_) result_ = echo_statement(builder_, level_ + 1);
    if (!result_) result_ = unset_statement(builder_, level_ + 1);
    if (!result_) result_ = semicolon_statement(builder_, level_ + 1);
    if (!result_) result_ = html_statement(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement(builder_, level_ + 1);
    if (!result_) result_ = declare_statement(builder_, level_ + 1);
    if (!result_) result_ = try_statement(builder_, level_ + 1);
    if (!result_) result_ = throw_statement(builder_, level_ + 1);
    if (!result_) result_ = goto_statement(builder_, level_ + 1);
    if (!result_) result_ = expr_statement(builder_, level_ + 1);
    if (!result_) result_ = static_statement(builder_, level_ + 1);
    if (!result_) result_ = label_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // additive_or_concatenation_operator static_multiplicative_expr_wrapper
  public static boolean static_additive_or_concatenation_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_additive_or_concatenation_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<static additive or concatenation expr>");
    result_ = additive_or_concatenation_operator(builder_, level_ + 1);
    result_ = result_ && static_multiplicative_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_ADDITIVE_OR_CONCATENATION_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // static_multiplicative_expr_wrapper static_additive_or_concatenation_expr*
  static boolean static_additive_or_concatenation_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_additive_or_concatenation_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_multiplicative_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && static_additive_or_concatenation_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_additive_or_concatenation_expr*
  private static boolean static_additive_or_concatenation_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_additive_or_concatenation_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_additive_or_concatenation_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_additive_or_concatenation_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // (T_ARRAY '(' static_array_pair_list ')')  | ('[' static_array_pair_list ']')
  public static boolean static_array_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_expr")) return false;
    if (!nextTokenIs(builder_, "<static array expr>", T_LBRACKET, T_ARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static array expr>");
    result_ = static_array_expr_0(builder_, level_ + 1);
    if (!result_) result_ = static_array_expr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_ARRAY_EXPR, result_, false, null);
    return result_;
  }

  // T_ARRAY '(' static_array_pair_list ')'
  private static boolean static_array_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ARRAY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && static_array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '[' static_array_pair_list ']'
  private static boolean static_array_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_expr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACKET);
    result_ = result_ && static_array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // static_expr (T_DOUBLE_ARROW static_expr)?
  public static boolean static_array_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static array item>");
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && static_array_item_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_ARRAY_ITEM, result_, false, null);
    return result_;
  }

  // (T_DOUBLE_ARROW static_expr)?
  private static boolean static_array_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_item_1")) return false;
    static_array_item_1_0(builder_, level_ + 1);
    return true;
  }

  // T_DOUBLE_ARROW static_expr
  private static boolean static_array_item_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_item_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // static_scalar_ae (T_DOUBLE_ARROW static_scalar_ae)?
  public static boolean static_array_item_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_item_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static array item ae>");
    result_ = static_scalar_ae(builder_, level_ + 1);
    result_ = result_ && static_array_item_ae_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_ARRAY_ITEM_AE, result_, false, null);
    return result_;
  }

  // (T_DOUBLE_ARROW static_scalar_ae)?
  private static boolean static_array_item_ae_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_item_ae_1")) return false;
    static_array_item_ae_1_0(builder_, level_ + 1);
    return true;
  }

  // T_DOUBLE_ARROW static_scalar_ae
  private static boolean static_array_item_ae_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_item_ae_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (static_array_item (',' static_array_item)* ','? ','?)?
  public static boolean static_array_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static array pair list>");
    static_array_pair_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_ARRAY_PAIR_LIST, true, false, null);
    return true;
  }

  // static_array_item (',' static_array_item)* ','? ','?
  private static boolean static_array_pair_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_array_item(builder_, level_ + 1);
    result_ = result_ && static_array_pair_list_0_1(builder_, level_ + 1);
    result_ = result_ && static_array_pair_list_0_2(builder_, level_ + 1);
    result_ = result_ && static_array_pair_list_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' static_array_item)*
  private static boolean static_array_pair_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_array_pair_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_array_pair_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' static_array_item
  private static boolean static_array_pair_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && static_array_item(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean static_array_pair_list_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  // ','?
  private static boolean static_array_pair_list_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_0_3")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // (static_array_item_ae (',' static_array_item_ae)* ','?)?
  public static boolean static_array_pair_list_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_ae")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static array pair list ae>");
    static_array_pair_list_ae_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_ARRAY_PAIR_LIST_AE, true, false, null);
    return true;
  }

  // static_array_item_ae (',' static_array_item_ae)* ','?
  private static boolean static_array_pair_list_ae_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_ae_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_array_item_ae(builder_, level_ + 1);
    result_ = result_ && static_array_pair_list_ae_0_1(builder_, level_ + 1);
    result_ = result_ && static_array_pair_list_ae_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' static_array_item_ae)*
  private static boolean static_array_pair_list_ae_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_ae_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_array_pair_list_ae_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_array_pair_list_ae_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' static_array_item_ae
  private static boolean static_array_pair_list_ae_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_ae_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && static_array_item_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean static_array_pair_list_ae_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_ae_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_VARIABLE '=' static_expr
  public static boolean static_assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_assignment")) return false;
    if (!nextTokenIs(builder_, T_VARIABLE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_VARIABLE);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    pinned_ = result_; // pin = 2
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_ASSIGNMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // bitwise_operator static_shift_expr_wrapper
  public static boolean static_bitwise_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_bitwise_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<static bitwise expr>");
    result_ = bitwise_operator(builder_, level_ + 1);
    result_ = result_ && static_shift_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_BITWISE_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // static_shift_expr_wrapper static_bitwise_expr*
  static boolean static_bitwise_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_bitwise_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_shift_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && static_bitwise_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_bitwise_expr*
  private static boolean static_bitwise_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_bitwise_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_bitwise_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_bitwise_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs T_DOUBLE_COLON identifier
  // | T_XHP_LABEL T_DOUBLE_COLON identifier
  // | class_namespace_string_typeargs T_DOUBLE_COLON T_CLASS
  public static boolean static_class_constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_class_constant")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static class constant>");
    result_ = static_class_constant_0(builder_, level_ + 1);
    if (!result_) result_ = static_class_constant_1(builder_, level_ + 1);
    if (!result_) result_ = static_class_constant_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_CLASS_CONSTANT, result_, false, null);
    return result_;
  }

  // class_namespace_string_typeargs T_DOUBLE_COLON identifier
  private static boolean static_class_constant_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_class_constant_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_XHP_LABEL T_DOUBLE_COLON identifier
  private static boolean static_class_constant_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_class_constant_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_XHP_LABEL, T_DOUBLE_COLON);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // class_namespace_string_typeargs T_DOUBLE_COLON T_CLASS
  private static boolean static_class_constant_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_class_constant_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, T_DOUBLE_COLON, T_CLASS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // fully_qualified_class_name
  //                     | T_STATIC
  //                     | reference_variable
  public static boolean static_class_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_class_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static class name>");
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_STATIC);
    if (!result_) result_ = reference_variable(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_CLASS_NAME, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // static_class_name T_DOUBLE_COLON variable_without_objects_expr
  public static boolean static_class_variable_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_class_variable_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static class variable expr>");
    result_ = static_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && variable_without_objects_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_CLASS_VARIABLE_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // fully_qualified_class_name '{' static_array_pair_list '}'
  public static boolean static_collection_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_collection_literal")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static collection literal>");
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, static_array_pair_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RBRACE) && result_;
    exit_section_(builder_, level_, marker_, STATIC_COLLECTION_LITERAL, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // comparative_operator static_bitwise_expr_wrapper
  public static boolean static_comparative_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_comparative_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<static comparative expr>");
    result_ = comparative_operator(builder_, level_ + 1);
    result_ = result_ && static_bitwise_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_COMPARATIVE_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // static_bitwise_expr_wrapper static_comparative_expr*
  static boolean static_comparative_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_comparative_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_bitwise_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && static_comparative_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_comparative_expr*
  private static boolean static_comparative_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_comparative_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_comparative_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_comparative_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // static_ternary_expr_wrapper
  public static boolean static_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static expr>");
    result_ = static_ternary_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // logical_operator static_comparative_expr_wrapper
  public static boolean static_logical_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_logical_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<static logical expr>");
    result_ = logical_operator(builder_, level_ + 1);
    result_ = result_ && static_comparative_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_LOGICAL_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // static_comparative_expr_wrapper static_logical_expr*
  static boolean static_logical_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_logical_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_comparative_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && static_logical_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_logical_expr*
  private static boolean static_logical_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_logical_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_logical_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_logical_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // (T_MIARRAY|T_MSARRAY) '(' static_array_pair_list ')'
  public static boolean static_map_array_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_map_array_literal")) return false;
    if (!nextTokenIs(builder_, "<static map array literal>", T_MIARRAY, T_MSARRAY)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static map array literal>");
    result_ = static_map_array_literal_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, static_array_pair_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, STATIC_MAP_ARRAY_LITERAL, result_, pinned_, null);
    return result_ || pinned_;
  }

  // T_MIARRAY|T_MSARRAY
  private static boolean static_map_array_literal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_map_array_literal_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MIARRAY);
    if (!result_) result_ = consumeToken(builder_, T_MSARRAY);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // multiplicative_operator static_prefix_expr
  public static boolean static_multiplicative_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_multiplicative_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<static multiplicative expr>");
    result_ = multiplicative_operator(builder_, level_ + 1);
    result_ = result_ && static_prefix_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_MULTIPLICATIVE_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // static_prefix_expr static_multiplicative_expr*
  static boolean static_multiplicative_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_multiplicative_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_prefix_expr(builder_, level_ + 1);
    result_ = result_ && static_multiplicative_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_multiplicative_expr*
  private static boolean static_multiplicative_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_multiplicative_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_multiplicative_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_multiplicative_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // ('+'|'-')?( T_LNUMBER
  // | T_DNUMBER
  // | T_ONUMBER
  // | identifier
  // )
  public static boolean static_numeric_scalar_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_numeric_scalar_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static numeric scalar ae>");
    result_ = static_numeric_scalar_ae_0(builder_, level_ + 1);
    result_ = result_ && static_numeric_scalar_ae_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_NUMERIC_SCALAR_AE, result_, false, null);
    return result_;
  }

  // ('+'|'-')?
  private static boolean static_numeric_scalar_ae_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_numeric_scalar_ae_0")) return false;
    static_numeric_scalar_ae_0_0(builder_, level_ + 1);
    return true;
  }

  // '+'|'-'
  private static boolean static_numeric_scalar_ae_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_numeric_scalar_ae_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_PLUS);
    if (!result_) result_ = consumeToken(builder_, T_MINUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_LNUMBER
  // | T_DNUMBER
  // | T_ONUMBER
  // | identifier
  private static boolean static_numeric_scalar_ae_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_numeric_scalar_ae_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LNUMBER);
    if (!result_) result_ = consumeToken(builder_, T_DNUMBER);
    if (!result_) result_ = consumeToken(builder_, T_ONUMBER);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' static_expr ')'
  public static boolean static_parenthesized_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_parenthesized_expr")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, static_expr(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, STATIC_PARENTHESIZED_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (static_prefix_operator static_prefix_expr) | static_primary_expr
  public static boolean static_prefix_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_prefix_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static prefix expr>");
    result_ = static_prefix_expr_0(builder_, level_ + 1);
    if (!result_) result_ = static_primary_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_PREFIX_EXPR, result_, false, null);
    return result_;
  }

  // static_prefix_operator static_prefix_expr
  private static boolean static_prefix_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_prefix_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_prefix_operator(builder_, level_ + 1);
    result_ = result_ && static_prefix_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '!' | '~' | '+' | '-'
  public static boolean static_prefix_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_prefix_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static prefix operator>");
    result_ = consumeToken(builder_, T_NEGATE);
    if (!result_) result_ = consumeToken(builder_, T_NOT);
    if (!result_) result_ = consumeToken(builder_, T_PLUS);
    if (!result_) result_ = consumeToken(builder_, T_MINUS);
    exit_section_(builder_, level_, marker_, STATIC_PREFIX_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // literal_expr
  //                     | namespace_string
  //                     | static_array_expr
  //                     | static_shape_expr
  //                     | static_class_constant
  //                     | static_collection_literal
  //                     | static_map_array_literal
  //                     | static_varray_literal
  //                     | static_parenthesized_expr
  static boolean static_primary_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_primary_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = literal_expr(builder_, level_ + 1);
    if (!result_) result_ = namespace_string(builder_, level_ + 1);
    if (!result_) result_ = static_array_expr(builder_, level_ + 1);
    if (!result_) result_ = static_shape_expr(builder_, level_ + 1);
    if (!result_) result_ = static_class_constant(builder_, level_ + 1);
    if (!result_) result_ = static_collection_literal(builder_, level_ + 1);
    if (!result_) result_ = static_map_array_literal(builder_, level_ + 1);
    if (!result_) result_ = static_varray_literal(builder_, level_ + 1);
    if (!result_) result_ = static_parenthesized_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // literal_scalar_ae
  // | identifier
  // | static_numeric_scalar_ae
  // | T_ARRAY '(' static_array_pair_list_ae ')'
  // | '[' static_array_pair_list_ae ']'
  // | T_SHAPE '(' static_shape_pair_list_ae ')'
  public static boolean static_scalar_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static scalar ae>");
    result_ = literal_scalar_ae(builder_, level_ + 1);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = static_numeric_scalar_ae(builder_, level_ + 1);
    if (!result_) result_ = static_scalar_ae_3(builder_, level_ + 1);
    if (!result_) result_ = static_scalar_ae_4(builder_, level_ + 1);
    if (!result_) result_ = static_scalar_ae_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_SCALAR_AE, result_, false, null);
    return result_;
  }

  // T_ARRAY '(' static_array_pair_list_ae ')'
  private static boolean static_scalar_ae_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_ae_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ARRAY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && static_array_pair_list_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '[' static_array_pair_list_ae ']'
  private static boolean static_scalar_ae_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_ae_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACKET);
    result_ = result_ && static_array_pair_list_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_SHAPE '(' static_shape_pair_list_ae ')'
  private static boolean static_scalar_ae_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_ae_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SHAPE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && static_shape_pair_list_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (static_scalar_ae (',' static_scalar_ae)* ','?)?
  public static boolean static_scalar_list_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_list_ae")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static scalar list ae>");
    static_scalar_list_ae_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_SCALAR_LIST_AE, true, false, null);
    return true;
  }

  // static_scalar_ae (',' static_scalar_ae)* ','?
  private static boolean static_scalar_list_ae_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_list_ae_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_scalar_ae(builder_, level_ + 1);
    result_ = result_ && static_scalar_list_ae_0_1(builder_, level_ + 1);
    result_ = result_ && static_scalar_list_ae_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' static_scalar_ae)*
  private static boolean static_scalar_list_ae_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_list_ae_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_scalar_list_ae_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_scalar_list_ae_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' static_scalar_ae
  private static boolean static_scalar_list_ae_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_list_ae_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean static_scalar_list_ae_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_list_ae_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_SHAPE '(' static_shape_pair_list ')'
  public static boolean static_shape_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_expr")) return false;
    if (!nextTokenIs(builder_, T_SHAPE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_SHAPE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, static_shape_pair_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, STATIC_SHAPE_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // shape_keyname T_DOUBLE_ARROW static_scalar_ae
  public static boolean static_shape_pair_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static shape pair item>");
    result_ = shape_keyname(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_SHAPE_PAIR_ITEM, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (shape_pair_static (',' shape_pair_static)* ','?)?
  public static boolean static_shape_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static shape pair list>");
    static_shape_pair_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_SHAPE_PAIR_LIST, true, false, null);
    return true;
  }

  // shape_pair_static (',' shape_pair_static)* ','?
  private static boolean static_shape_pair_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = shape_pair_static(builder_, level_ + 1);
    result_ = result_ && static_shape_pair_list_0_1(builder_, level_ + 1);
    result_ = result_ && static_shape_pair_list_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' shape_pair_static)*
  private static boolean static_shape_pair_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_shape_pair_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_shape_pair_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' shape_pair_static
  private static boolean static_shape_pair_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && shape_pair_static(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean static_shape_pair_list_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // (static_shape_pair_item (',' static_shape_pair_item)* ','?)?
  public static boolean static_shape_pair_list_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list_ae")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static shape pair list ae>");
    static_shape_pair_list_ae_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_SHAPE_PAIR_LIST_AE, true, false, null);
    return true;
  }

  // static_shape_pair_item (',' static_shape_pair_item)* ','?
  private static boolean static_shape_pair_list_ae_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list_ae_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_shape_pair_item(builder_, level_ + 1);
    result_ = result_ && static_shape_pair_list_ae_0_1(builder_, level_ + 1);
    result_ = result_ && static_shape_pair_list_ae_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' static_shape_pair_item)*
  private static boolean static_shape_pair_list_ae_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list_ae_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_shape_pair_list_ae_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_shape_pair_list_ae_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' static_shape_pair_item
  private static boolean static_shape_pair_list_ae_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list_ae_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && static_shape_pair_item(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean static_shape_pair_list_ae_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list_ae_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // shift_operator static_additive_or_concatenation_expr_wrapper
  public static boolean static_shift_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shift_expr")) return false;
    if (!nextTokenIs(builder_, "<static shift expr>", T_SL, T_SR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<static shift expr>");
    result_ = shift_operator(builder_, level_ + 1);
    result_ = result_ && static_additive_or_concatenation_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_SHIFT_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // static_additive_or_concatenation_expr_wrapper static_shift_expr*
  static boolean static_shift_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shift_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_additive_or_concatenation_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && static_shift_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_shift_expr*
  private static boolean static_shift_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shift_expr_wrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_shift_expr(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_shift_expr_wrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // T_STATIC static_var_list ';'
  public static boolean static_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_statement")) return false;
    if (!nextTokenIs(builder_, T_STATIC)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_STATIC);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, static_var_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, STATIC_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '?' static_expr? ':' static_ternary_expr_wrapper
  public static boolean static_ternary_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_ternary_expr")) return false;
    if (!nextTokenIs(builder_, T_QUEST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, T_QUEST);
    result_ = result_ && static_ternary_expr_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && static_ternary_expr_wrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_TERNARY_EXPR, result_, false, null);
    return result_;
  }

  // static_expr?
  private static boolean static_ternary_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_ternary_expr_1")) return false;
    static_expr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // static_logical_expr_wrapper static_ternary_expr?
  static boolean static_ternary_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_ternary_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_logical_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && static_ternary_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_ternary_expr?
  private static boolean static_ternary_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_ternary_expr_wrapper_1")) return false;
    static_ternary_expr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ((T_VARIABLE | static_assignment) (',' (T_VARIABLE|static_assignment))*)?
  public static boolean static_var_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static var list>");
    static_var_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_VAR_LIST, true, false, null);
    return true;
  }

  // (T_VARIABLE | static_assignment) (',' (T_VARIABLE|static_assignment))*
  private static boolean static_var_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_var_list_0_0(builder_, level_ + 1);
    result_ = result_ && static_var_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_VARIABLE | static_assignment
  private static boolean static_var_list_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = static_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' (T_VARIABLE|static_assignment))*
  private static boolean static_var_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_var_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_var_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' (T_VARIABLE|static_assignment)
  private static boolean static_var_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && static_var_list_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_VARIABLE|static_assignment
  private static boolean static_var_list_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list_0_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = static_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_VARRAY '(' static_array_pair_list ')'
  public static boolean static_varray_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_varray_literal")) return false;
    if (!nextTokenIs(builder_, T_VARRAY)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_VARRAY);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, static_array_pair_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, STATIC_VARRAY_LITERAL, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // switch_statement_list | switch_new_statement
  public static boolean switch_case_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_list")) return false;
    if (!nextTokenIs(builder_, "<switch case list>", T_COLON, T_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<switch case list>");
    result_ = switch_statement_list(builder_, level_ + 1);
    if (!result_) result_ = switch_new_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SWITCH_CASE_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ':' ';'? case_list T_ENDSWITCH ';'
  public static boolean switch_new_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_new_statement")) return false;
    if (!nextTokenIs(builder_, T_COLON)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_COLON);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, switch_new_statement_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, case_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_ENDSWITCH)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, SWITCH_NEW_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ';'?
  private static boolean switch_new_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_new_statement_1")) return false;
    consumeToken(builder_, T_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // T_SWITCH parenthesized_expr  switch_case_list
  public static boolean switch_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_statement")) return false;
    if (!nextTokenIs(builder_, T_SWITCH)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_SWITCH);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, parenthesized_expr(builder_, level_ + 1));
    result_ = pinned_ && switch_case_list(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, SWITCH_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '{' ';'? case_list '}'
  public static boolean switch_statement_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_statement_list")) return false;
    if (!nextTokenIs(builder_, T_LBRACE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, switch_statement_list_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, case_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RBRACE) && result_;
    exit_section_(builder_, level_, marker_, SWITCH_STATEMENT_LIST, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ';'?
  private static boolean switch_statement_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_statement_list_1")) return false;
    consumeToken(builder_, T_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // '?' expr? ':' ternary_expr_wrapper
  public static boolean ternary_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ternary_expr")) return false;
    if (!nextTokenIs(builder_, T_QUEST)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, T_QUEST);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ternary_expr_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_COLON)) && result_;
    result_ = pinned_ && ternary_expr_wrapper(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, TERNARY_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // expr?
  private static boolean ternary_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ternary_expr_1")) return false;
    expr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // logical_expr_wrapper ternary_expr?
  static boolean ternary_expr_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ternary_expr_wrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = logical_expr_wrapper(builder_, level_ + 1);
    result_ = result_ && ternary_expr_wrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ternary_expr?
  private static boolean ternary_expr_wrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ternary_expr_wrapper_1")) return false;
    ternary_expr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_THROW expr ';'
  public static boolean throw_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throw_statement")) return false;
    if (!nextTokenIs(builder_, T_THROW)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_THROW);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expr(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, THROW_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ( statement //Almost
  //                        | function_declaration_statement //OK
  //                        | class_declaration_statement //OK
  //                        | interface_declaration_statement //OK
  //                        | enum_declaration_statement //OK
  //                        | trait_declaration_statement //OK
  //                        | hh_type_alias_declaration_statement
  //                        | halt_compiler_statement //OK
  //                        | namespace_declaration_statement //OK
  //                        | use_declaration_statement //OK
  //                        | constant_declaration_statement //OK
  //                        )+
  static boolean top_statement_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "top_statement_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = top_statement_list_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!top_statement_list_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "top_statement_list", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // statement //Almost
  //                        | function_declaration_statement //OK
  //                        | class_declaration_statement //OK
  //                        | interface_declaration_statement //OK
  //                        | enum_declaration_statement //OK
  //                        | trait_declaration_statement //OK
  //                        | hh_type_alias_declaration_statement
  //                        | halt_compiler_statement //OK
  //                        | namespace_declaration_statement //OK
  //                        | use_declaration_statement //OK
  //                        | constant_declaration_statement
  private static boolean top_statement_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "top_statement_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = function_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = class_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = interface_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = enum_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = trait_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = hh_type_alias_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = halt_compiler_statement(builder_, level_ + 1);
    if (!result_) result_ = namespace_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = use_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = constant_declaration_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // trait_alias_rule_method T_AS method_modifiers? identifier ';'
  // | trait_alias_rule_method T_AS member_modifier+ ';'
  public static boolean trait_alias_rule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait alias rule>");
    result_ = trait_alias_rule_0(builder_, level_ + 1);
    if (!result_) result_ = trait_alias_rule_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TRAIT_ALIAS_RULE, result_, false, null);
    return result_;
  }

  // trait_alias_rule_method T_AS method_modifiers? identifier ';'
  private static boolean trait_alias_rule_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = trait_alias_rule_method(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AS);
    result_ = result_ && trait_alias_rule_0_2(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // method_modifiers?
  private static boolean trait_alias_rule_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule_0_2")) return false;
    method_modifiers(builder_, level_ + 1);
    return true;
  }

  // trait_alias_rule_method T_AS member_modifier+ ';'
  private static boolean trait_alias_rule_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = trait_alias_rule_method(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AS);
    result_ = result_ && trait_alias_rule_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // member_modifier+
  private static boolean trait_alias_rule_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule_1_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = member_modifier(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!member_modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "trait_alias_rule_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs T_DOUBLE_COLON identifier
  // | identifier
  public static boolean trait_alias_rule_method(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule_method")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait alias rule method>");
    result_ = trait_alias_rule_method_0(builder_, level_ + 1);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TRAIT_ALIAS_RULE_METHOD, result_, false, null);
    return result_;
  }

  // class_namespace_string_typeargs T_DOUBLE_COLON identifier
  private static boolean trait_alias_rule_method_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule_method_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // user_attributes? T_TRAIT identifier hh_typevar?  implements_list? class_statement_block
  public static boolean trait_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_declaration_statement")) return false;
    if (!nextTokenIs(builder_, "<trait declaration statement>", T_SL, T_TRAIT)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait declaration statement>");
    result_ = trait_declaration_statement_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_TRAIT);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, identifier(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, trait_declaration_statement_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, trait_declaration_statement_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && class_statement_block(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, TRAIT_DECLARATION_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // user_attributes?
  private static boolean trait_declaration_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_declaration_statement_0")) return false;
    user_attributes(builder_, level_ + 1);
    return true;
  }

  // hh_typevar?
  private static boolean trait_declaration_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_declaration_statement_3")) return false;
    hh_typevar(builder_, level_ + 1);
    return true;
  }

  // implements_list?
  private static boolean trait_declaration_statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_declaration_statement_4")) return false;
    implements_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (fully_qualified_class_name (',' fully_qualified_class_name)*)?
  public static boolean trait_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait list>");
    trait_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TRAIT_LIST, true, false, null);
    return true;
  }

  // fully_qualified_class_name (',' fully_qualified_class_name)*
  private static boolean trait_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    result_ = result_ && trait_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' fully_qualified_class_name)*
  private static boolean trait_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!trait_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "trait_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' fully_qualified_class_name
  private static boolean trait_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && fully_qualified_class_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs T_DOUBLE_COLON identifier T_INSTEADOF trait_list ';'
  public static boolean trait_precedence_rule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_precedence_rule")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait precedence rule>");
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_INSTEADOF);
    result_ = result_ && trait_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, level_, marker_, TRAIT_PRECEDENCE_RULE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_REQUIRE (T_EXTENDS|T_IMPLEMENTS) fully_qualified_class_name ';'
  public static boolean trait_require_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_require_declaration")) return false;
    if (!nextTokenIs(builder_, T_REQUIRE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_REQUIRE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, trait_require_declaration_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, fully_qualified_class_name(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, TRAIT_REQUIRE_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // T_EXTENDS|T_IMPLEMENTS
  private static boolean trait_require_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_require_declaration_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EXTENDS);
    if (!result_) result_ = consumeToken(builder_, T_IMPLEMENTS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (trait_precedence_rule |  trait_alias_rule)+
  public static boolean trait_rules(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_rules")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait rules>");
    result_ = trait_rules_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!trait_rules_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "trait_rules", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, TRAIT_RULES, result_, false, null);
    return result_;
  }

  // trait_precedence_rule |  trait_alias_rule
  private static boolean trait_rules_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_rules_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = trait_precedence_rule(builder_, level_ + 1);
    if (!result_) result_ = trait_alias_rule(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_USE trait_list (';'| '{' trait_rules? '}')
  public static boolean trait_use_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_use_declaration")) return false;
    if (!nextTokenIs(builder_, T_USE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_USE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, trait_list(builder_, level_ + 1));
    result_ = pinned_ && trait_use_declaration_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, TRAIT_USE_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ';'| '{' trait_rules? '}'
  private static boolean trait_use_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_use_declaration_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SEMICOLON);
    if (!result_) result_ = trait_use_declaration_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' trait_rules? '}'
  private static boolean trait_use_declaration_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_use_declaration_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && trait_use_declaration_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // trait_rules?
  private static boolean trait_use_declaration_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_use_declaration_2_1_1")) return false;
    trait_rules(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_CATCH '(' fully_qualified_class_name T_VARIABLE ')' '{' inner_statement_list '}'
  public static boolean try_catch(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_catch")) return false;
    if (!nextTokenIs(builder_, T_CATCH)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_CATCH);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, fully_qualified_class_name(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_VARIABLE)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_LBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, inner_statement_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RBRACE) && result_;
    exit_section_(builder_, level_, marker_, TRY_CATCH, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_FINALLY  finally_statement_list
  public static boolean try_finally(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_finally")) return false;
    if (!nextTokenIs(builder_, T_FINALLY)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_FINALLY);
    pinned_ = result_; // pin = 1
    result_ = result_ && finally_statement_list(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TRY_FINALLY, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (T_TRY try_statement_list try_catch additional_catches  optional_finally)
  //         | (T_TRY try_statement_list try_finally)
  public static boolean try_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_statement")) return false;
    if (!nextTokenIs(builder_, T_TRY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = try_statement_0(builder_, level_ + 1);
    if (!result_) result_ = try_statement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, TRY_STATEMENT, result_);
    return result_;
  }

  // T_TRY try_statement_list try_catch additional_catches  optional_finally
  private static boolean try_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_TRY);
    result_ = result_ && try_statement_list(builder_, level_ + 1);
    result_ = result_ && try_catch(builder_, level_ + 1);
    result_ = result_ && additional_catches(builder_, level_ + 1);
    result_ = result_ && optional_finally(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_TRY try_statement_list try_finally
  private static boolean try_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_TRY);
    result_ = result_ && try_statement_list(builder_, level_ + 1);
    result_ = result_ && try_finally(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // block_statement
  static boolean try_statement_list(PsiBuilder builder_, int level_) {
    return block_statement(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // T_UNSET '(' variable_list ')' ';'
  public static boolean unset_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unset_statement")) return false;
    if (!nextTokenIs(builder_, T_UNSET)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_UNSET);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, variable_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, UNSET_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // namespace_name (T_AS identifier)?
  public static boolean use_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<use declaration>");
    result_ = namespace_name(builder_, level_ + 1);
    result_ = result_ && use_declaration_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, USE_DECLARATION, result_, false, null);
    return result_;
  }

  // (T_AS identifier)?
  private static boolean use_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declaration_1")) return false;
    use_declaration_1_0(builder_, level_ + 1);
    return true;
  }

  // T_AS identifier
  private static boolean use_declaration_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declaration_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AS);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_USE (T_FUNCTION | T_CONST)? use_declarations ';'
  public static boolean use_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declaration_statement")) return false;
    if (!nextTokenIs(builder_, T_USE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_USE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, use_declaration_statement_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, use_declarations(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, USE_DECLARATION_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (T_FUNCTION | T_CONST)?
  private static boolean use_declaration_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declaration_statement_1")) return false;
    use_declaration_statement_1_0(builder_, level_ + 1);
    return true;
  }

  // T_FUNCTION | T_CONST
  private static boolean use_declaration_statement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declaration_statement_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_FUNCTION);
    if (!result_) result_ = consumeToken(builder_, T_CONST);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // use_declaration (',' use_declaration)*
  public static boolean use_declarations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declarations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<use declarations>");
    result_ = use_declaration(builder_, level_ + 1);
    result_ = result_ && use_declarations_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, USE_DECLARATIONS, result_, false, null);
    return result_;
  }

  // (',' use_declaration)*
  private static boolean use_declarations_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declarations_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!use_declarations_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "use_declarations_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' use_declaration
  private static boolean use_declarations_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declarations_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && use_declaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier attribute_static_scalar_list?
  public static boolean user_attribute(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "user_attribute")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<user attribute>");
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && user_attribute_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, USER_ATTRIBUTE, result_, false, null);
    return result_;
  }

  // attribute_static_scalar_list?
  private static boolean user_attribute_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "user_attribute_1")) return false;
    attribute_static_scalar_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (user_attribute (',' user_attribute)* ','?)?
  public static boolean user_attribute_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "user_attribute_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<user attribute list>");
    user_attribute_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, USER_ATTRIBUTE_LIST, true, false, null);
    return true;
  }

  // user_attribute (',' user_attribute)* ','?
  private static boolean user_attribute_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "user_attribute_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = user_attribute(builder_, level_ + 1);
    result_ = result_ && user_attribute_list_0_1(builder_, level_ + 1);
    result_ = result_ && user_attribute_list_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' user_attribute)*
  private static boolean user_attribute_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "user_attribute_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!user_attribute_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "user_attribute_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' user_attribute
  private static boolean user_attribute_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "user_attribute_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && user_attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean user_attribute_list_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "user_attribute_list_0_2")) return false;
    consumeToken(builder_, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_SL user_attribute_list T_SR
  public static boolean user_attributes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "user_attributes")) return false;
    if (!nextTokenIs(builder_, T_SL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SL);
    result_ = result_ && user_attribute_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SR);
    exit_section_(builder_, marker_, USER_ATTRIBUTES, result_);
    return result_;
  }

  /* ********************************************************** */
  // member_variable_wrapper
  static boolean variable(PsiBuilder builder_, int level_) {
    return member_variable_wrapper(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // (variable (',' variable)*)?
  public static boolean variable_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variable list>");
    variable_list_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VARIABLE_LIST, true, false, null);
    return true;
  }

  // variable (',' variable)*
  private static boolean variable_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && variable_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' variable)*
  private static boolean variable_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_list_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!variable_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "variable_list_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' variable
  private static boolean variable_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_list_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // member_modifier+ | T_VAR
  public static boolean variable_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variable modifiers>");
    result_ = variable_modifiers_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_VAR);
    exit_section_(builder_, level_, marker_, VARIABLE_MODIFIERS, result_, false, null);
    return result_;
  }

  // member_modifier+
  private static boolean variable_modifiers_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = member_modifier(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!member_modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "variable_modifiers_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '$'* reference_variable
  public static boolean variable_without_objects_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_without_objects_expr")) return false;
    if (!nextTokenIs(builder_, "<variable without objects expr>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variable without objects expr>");
    result_ = variable_without_objects_expr_0(builder_, level_ + 1);
    result_ = result_ && reference_variable(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VARIABLE_WITHOUT_OBJECTS_EXPR, result_, false, null);
    return result_;
  }

  // '$'*
  private static boolean variable_without_objects_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_without_objects_expr_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!consumeToken(builder_, T_DOLLAR_SIGN)) break;
      if (!empty_element_parsed_guard_(builder_, "variable_without_objects_expr_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // T_VARRAY '(' array_pair_list ')'
  public static boolean varray_literal_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varray_literal_expr")) return false;
    if (!nextTokenIs(builder_, T_VARRAY)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_VARRAY);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, array_pair_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_RPAREN) && result_;
    exit_section_(builder_, level_, marker_, VARRAY_LITERAL_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_WHERE expr
  public static boolean where_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "where_clause")) return false;
    if (!nextTokenIs(builder_, T_WHERE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_WHERE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, WHERE_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // ':' inner_statement_list T_ENDWHILE ';'
  public static boolean while_new_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_new_statement")) return false;
    if (!nextTokenIs(builder_, T_COLON)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_COLON);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, inner_statement_list(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_ENDWHILE)) && result_;
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, WHILE_NEW_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_WHILE parenthesized_expr  while_statement_body
  public static boolean while_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_statement")) return false;
    if (!nextTokenIs(builder_, T_WHILE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_WHILE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, parenthesized_expr(builder_, level_ + 1));
    result_ = pinned_ && while_statement_body(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, WHILE_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // while_new_statement   | statement
  public static boolean while_statement_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_statement_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<while statement body>");
    result_ = while_new_statement(builder_, level_ + 1);
    if (!result_) result_ = statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, WHILE_STATEMENT_BODY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // xhp_attribute_name '=' xhp_attribute_value
  public static boolean xhp_attribute(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute")) return false;
    if (!nextTokenIs(builder_, T_XHP_LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_attribute_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && xhp_attribute_value(builder_, level_ + 1);
    exit_section_(builder_, marker_, XHP_ATTRIBUTE, result_);
    return result_;
  }

  /* ********************************************************** */
  // xhp_attribute_decl_type xhp_label_ws xhp_attribute_default? xhp_attribute_is_required?
  // | T_XHP_LABEL
  public static boolean xhp_attribute_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_decl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp attribute decl>");
    result_ = xhp_attribute_decl_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_XHP_LABEL);
    exit_section_(builder_, level_, marker_, XHP_ATTRIBUTE_DECL, result_, false, null);
    return result_;
  }

  // xhp_attribute_decl_type xhp_label_ws xhp_attribute_default? xhp_attribute_is_required?
  private static boolean xhp_attribute_decl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_decl_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_attribute_decl_type(builder_, level_ + 1);
    result_ = result_ && xhp_label_ws(builder_, level_ + 1);
    result_ = result_ && xhp_attribute_decl_0_2(builder_, level_ + 1);
    result_ = result_ && xhp_attribute_decl_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_attribute_default?
  private static boolean xhp_attribute_decl_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_decl_0_2")) return false;
    xhp_attribute_default(builder_, level_ + 1);
    return true;
  }

  // xhp_attribute_is_required?
  private static boolean xhp_attribute_decl_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_decl_0_3")) return false;
    xhp_attribute_is_required(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_ARRAY
  // | fully_qualified_class_name
  // | T_VAR
  // | T_ENUM '{' xhp_attribute_enum? '}'
  // | T_CALLABLE
  public static boolean xhp_attribute_decl_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_decl_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp attribute decl type>");
    result_ = consumeToken(builder_, T_ARRAY);
    if (!result_) result_ = fully_qualified_class_name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_VAR);
    if (!result_) result_ = xhp_attribute_decl_type_3(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_CALLABLE);
    exit_section_(builder_, level_, marker_, XHP_ATTRIBUTE_DECL_TYPE, result_, false, null);
    return result_;
  }

  // T_ENUM '{' xhp_attribute_enum? '}'
  private static boolean xhp_attribute_decl_type_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_decl_type_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ENUM);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && xhp_attribute_decl_type_3_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_attribute_enum?
  private static boolean xhp_attribute_decl_type_3_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_decl_type_3_2")) return false;
    xhp_attribute_enum(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // T_XHP_ATTRIBUTE xhp_attribute_stmt ';'
  public static boolean xhp_attribute_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_declaration")) return false;
    if (!nextTokenIs(builder_, T_XHP_ATTRIBUTE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_XHP_ATTRIBUTE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, xhp_attribute_stmt(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, XHP_ATTRIBUTE_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '=' static_expr
  public static boolean xhp_attribute_default(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_default")) return false;
    if (!nextTokenIs(builder_, T_EQUAL)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_EQUAL);
    pinned_ = result_; // pin = 1
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_ATTRIBUTE_DEFAULT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // literal_expr (',' literal_expr)*
  public static boolean xhp_attribute_enum(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_enum")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp attribute enum>");
    result_ = literal_expr(builder_, level_ + 1);
    result_ = result_ && xhp_attribute_enum_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_ATTRIBUTE_ENUM, result_, false, null);
    return result_;
  }

  // (',' literal_expr)*
  private static boolean xhp_attribute_enum_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_enum_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!xhp_attribute_enum_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "xhp_attribute_enum_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' literal_expr
  private static boolean xhp_attribute_enum_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_enum_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && literal_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '@' T_XHP_REQUIRED
  public static boolean xhp_attribute_is_required(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_is_required")) return false;
    if (!nextTokenIs(builder_, T_SILENCE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SILENCE);
    result_ = result_ && consumeToken(builder_, T_XHP_REQUIRED);
    exit_section_(builder_, marker_, XHP_ATTRIBUTE_IS_REQUIRED, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_XHP_LABEL
  public static boolean xhp_attribute_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_name")) return false;
    if (!nextTokenIs(builder_, T_XHP_LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_XHP_LABEL);
    exit_section_(builder_, marker_, XHP_ATTRIBUTE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // xhp_attribute_decl (',' xhp_attribute_decl)*
  public static boolean xhp_attribute_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_stmt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp attribute stmt>");
    result_ = xhp_attribute_decl(builder_, level_ + 1);
    result_ = result_ && xhp_attribute_stmt_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_ATTRIBUTE_STMT, result_, false, null);
    return result_;
  }

  // (',' xhp_attribute_decl)*
  private static boolean xhp_attribute_stmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_stmt_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!xhp_attribute_stmt_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "xhp_attribute_stmt_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' xhp_attribute_decl
  private static boolean xhp_attribute_stmt_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_stmt_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && xhp_attribute_decl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_XHP_TEXT | '{' expr '}'
  public static boolean xhp_attribute_value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_value")) return false;
    if (!nextTokenIs(builder_, "<xhp attribute value>", T_LBRACE, T_XHP_TEXT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp attribute value>");
    result_ = consumeToken(builder_, T_XHP_TEXT);
    if (!result_) result_ = xhp_attribute_value_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_ATTRIBUTE_VALUE, result_, false, null);
    return result_;
  }

  // '{' expr '}'
  private static boolean xhp_attribute_value_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_value_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // xhp_attribute+
  public static boolean xhp_attributes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attributes")) return false;
    if (!nextTokenIs(builder_, T_XHP_LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_attribute(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!xhp_attribute(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "xhp_attributes", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, XHP_ATTRIBUTES, result_);
    return result_;
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
  public static boolean xhp_bareword(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_bareword")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp bareword>");
    result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_EXIT);
    if (!result_) result_ = consumeToken(builder_, T_FUNCTION);
    if (!result_) result_ = consumeToken(builder_, T_CONST);
    if (!result_) result_ = consumeToken(builder_, T_RETURN);
    if (!result_) result_ = consumeToken(builder_, T_YIELD);
    if (!result_) result_ = consumeToken(builder_, T_AWAIT);
    if (!result_) result_ = consumeToken(builder_, T_TRY);
    if (!result_) result_ = consumeToken(builder_, T_CATCH);
    if (!result_) result_ = consumeToken(builder_, T_FINALLY);
    if (!result_) result_ = consumeToken(builder_, T_THROW);
    if (!result_) result_ = consumeToken(builder_, T_IF);
    if (!result_) result_ = consumeToken(builder_, T_ELSEIF);
    if (!result_) result_ = consumeToken(builder_, T_ENDIF);
    if (!result_) result_ = consumeToken(builder_, T_ELSE);
    if (!result_) result_ = consumeToken(builder_, T_WHILE);
    if (!result_) result_ = consumeToken(builder_, T_ENDWHILE);
    if (!result_) result_ = consumeToken(builder_, T_DO);
    if (!result_) result_ = consumeToken(builder_, T_FOR);
    if (!result_) result_ = consumeToken(builder_, T_ENDFOR);
    if (!result_) result_ = consumeToken(builder_, T_FOREACH);
    if (!result_) result_ = consumeToken(builder_, T_ENDFOREACH);
    if (!result_) result_ = consumeToken(builder_, T_DECLARE);
    if (!result_) result_ = consumeToken(builder_, T_ENDDECLARE);
    if (!result_) result_ = consumeToken(builder_, T_INSTANCEOF);
    if (!result_) result_ = consumeToken(builder_, T_AS);
    if (!result_) result_ = consumeToken(builder_, T_SWITCH);
    if (!result_) result_ = consumeToken(builder_, T_ENDSWITCH);
    if (!result_) result_ = consumeToken(builder_, T_CASE);
    if (!result_) result_ = consumeToken(builder_, T_DEFAULT);
    if (!result_) result_ = consumeToken(builder_, T_BREAK);
    if (!result_) result_ = consumeToken(builder_, T_CONTINUE);
    if (!result_) result_ = consumeToken(builder_, T_GOTO);
    if (!result_) result_ = consumeToken(builder_, T_ECHO);
    if (!result_) result_ = consumeToken(builder_, T_PRINT);
    if (!result_) result_ = consumeToken(builder_, T_CLASS);
    if (!result_) result_ = consumeToken(builder_, T_INTERFACE);
    if (!result_) result_ = consumeToken(builder_, T_EXTENDS);
    if (!result_) result_ = consumeToken(builder_, T_IMPLEMENTS);
    if (!result_) result_ = consumeToken(builder_, T_NEW);
    if (!result_) result_ = consumeToken(builder_, T_CLONE);
    if (!result_) result_ = consumeToken(builder_, T_VAR);
    if (!result_) result_ = consumeToken(builder_, T_EVAL);
    if (!result_) result_ = consumeToken(builder_, T_INCLUDE);
    if (!result_) result_ = consumeToken(builder_, T_INCLUDE_ONCE);
    if (!result_) result_ = consumeToken(builder_, T_REQUIRE);
    if (!result_) result_ = consumeToken(builder_, T_REQUIRE_ONCE);
    if (!result_) result_ = consumeToken(builder_, T_NAMESPACE);
    if (!result_) result_ = consumeToken(builder_, T_USE);
    if (!result_) result_ = consumeToken(builder_, T_GLOBAL);
    if (!result_) result_ = consumeToken(builder_, T_ISSET);
    if (!result_) result_ = consumeToken(builder_, T_EMPTY);
    if (!result_) result_ = consumeToken(builder_, T_HALT_COMPILER);
    if (!result_) result_ = consumeToken(builder_, T_STATIC);
    if (!result_) result_ = consumeToken(builder_, T_ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, T_FINAL);
    if (!result_) result_ = consumeToken(builder_, T_PRIVATE);
    if (!result_) result_ = consumeToken(builder_, T_PROTECTED);
    if (!result_) result_ = consumeToken(builder_, T_PUBLIC);
    if (!result_) result_ = consumeToken(builder_, T_ASYNC);
    if (!result_) result_ = consumeToken(builder_, T_UNSET);
    if (!result_) result_ = consumeToken(builder_, T_LIST);
    if (!result_) result_ = consumeToken(builder_, T_ARRAY);
    if (!result_) result_ = consumeToken(builder_, T_LOGICAL_OR);
    if (!result_) result_ = consumeToken(builder_, T_LOGICAL_AND);
    if (!result_) result_ = consumeToken(builder_, T_LOGICAL_XOR);
    if (!result_) result_ = consumeToken(builder_, T_CLASS_C);
    if (!result_) result_ = consumeToken(builder_, T_FUNC_C);
    if (!result_) result_ = consumeToken(builder_, T_METHOD_C);
    if (!result_) result_ = consumeToken(builder_, T_LINE);
    if (!result_) result_ = consumeToken(builder_, T_FILE);
    if (!result_) result_ = consumeToken(builder_, T_DIR);
    if (!result_) result_ = consumeToken(builder_, T_NS_C);
    if (!result_) result_ = consumeToken(builder_, T_COMPILER_HALT_OFFSET);
    if (!result_) result_ = consumeToken(builder_, T_TRAIT);
    if (!result_) result_ = consumeToken(builder_, T_TRAIT_C);
    if (!result_) result_ = consumeToken(builder_, T_INSTEADOF);
    if (!result_) result_ = consumeToken(builder_, T_TYPE);
    if (!result_) result_ = consumeToken(builder_, T_NEWTYPE);
    if (!result_) result_ = consumeToken(builder_, T_SHAPE);
    exit_section_(builder_, level_, marker_, XHP_BAREWORD, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_XHP_CATEGORY xhp_category_stmt ';'
  public static boolean xhp_category_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_category_declaration")) return false;
    if (!nextTokenIs(builder_, T_XHP_CATEGORY)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_XHP_CATEGORY);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, xhp_category_stmt(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, XHP_CATEGORY_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_XHP_CATEGORY_LABEL (',' T_XHP_CATEGORY_LABEL)*
  public static boolean xhp_category_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_category_stmt")) return false;
    if (!nextTokenIs(builder_, T_XHP_CATEGORY_LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_XHP_CATEGORY_LABEL);
    result_ = result_ && xhp_category_stmt_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, XHP_CATEGORY_STMT, result_);
    return result_;
  }

  // (',' T_XHP_CATEGORY_LABEL)*
  private static boolean xhp_category_stmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_category_stmt_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!xhp_category_stmt_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "xhp_category_stmt_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' T_XHP_CATEGORY_LABEL
  private static boolean xhp_category_stmt_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_category_stmt_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && consumeToken(builder_, T_XHP_CATEGORY_LABEL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_XHP_TEXT | ('{' expr '}') | xhp_tag
  public static boolean xhp_child(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_child")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp child>");
    result_ = consumeToken(builder_, T_XHP_TEXT);
    if (!result_) result_ = xhp_child_1(builder_, level_ + 1);
    if (!result_) result_ = xhp_tag(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_CHILD, result_, false, null);
    return result_;
  }

  // '{' expr '}'
  private static boolean xhp_child_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_child_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // xhp_child+
  public static boolean xhp_children(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp children>");
    result_ = xhp_child(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!xhp_child(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "xhp_children", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, XHP_CHILDREN, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (xhp_children_paren_expr | xhp_children_decl_tag) ((','|'|') (xhp_children_paren_expr | xhp_children_decl_tag))*
  public static boolean xhp_children_decl_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp children decl expr>");
    result_ = xhp_children_decl_expr_0(builder_, level_ + 1);
    result_ = result_ && xhp_children_decl_expr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_CHILDREN_DECL_EXPR, result_, false, null);
    return result_;
  }

  // xhp_children_paren_expr | xhp_children_decl_tag
  private static boolean xhp_children_decl_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_children_paren_expr(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_decl_tag(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ((','|'|') (xhp_children_paren_expr | xhp_children_decl_tag))*
  private static boolean xhp_children_decl_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!xhp_children_decl_expr_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "xhp_children_decl_expr_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (','|'|') (xhp_children_paren_expr | xhp_children_decl_tag)
  private static boolean xhp_children_decl_expr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_children_decl_expr_1_0_0(builder_, level_ + 1);
    result_ = result_ && xhp_children_decl_expr_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','|'|'
  private static boolean xhp_children_decl_expr_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    if (!result_) result_ = consumeToken(builder_, T_OR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_children_paren_expr | xhp_children_decl_tag
  private static boolean xhp_children_decl_expr_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_children_paren_expr(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_decl_tag(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier
  //                             | T_XHP_LABEL
  //                             | T_XHP_CATEGORY_LABEL) ('*'|'?'|'+')?
  public static boolean xhp_children_decl_tag(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_tag")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp children decl tag>");
    result_ = xhp_children_decl_tag_0(builder_, level_ + 1);
    result_ = result_ && xhp_children_decl_tag_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_CHILDREN_DECL_TAG, result_, false, null);
    return result_;
  }

  // identifier
  //                             | T_XHP_LABEL
  //                             | T_XHP_CATEGORY_LABEL
  private static boolean xhp_children_decl_tag_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_tag_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_XHP_LABEL);
    if (!result_) result_ = consumeToken(builder_, T_XHP_CATEGORY_LABEL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('*'|'?'|'+')?
  private static boolean xhp_children_decl_tag_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_tag_1")) return false;
    xhp_children_decl_tag_1_0(builder_, level_ + 1);
    return true;
  }

  // '*'|'?'|'+'
  private static boolean xhp_children_decl_tag_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_tag_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MUL);
    if (!result_) result_ = consumeToken(builder_, T_QUEST);
    if (!result_) result_ = consumeToken(builder_, T_PLUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_XHP_CHILDREN xhp_children_stmt ';'
  public static boolean xhp_children_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_declaration")) return false;
    if (!nextTokenIs(builder_, T_XHP_CHILDREN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_XHP_CHILDREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, xhp_children_stmt(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, T_SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, XHP_CHILDREN_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '(' xhp_children_decl_expr ')' ('*'|'?'|'+')?
  public static boolean xhp_children_paren_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_paren_expr")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, xhp_children_decl_expr(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && xhp_children_paren_expr_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, XHP_CHILDREN_PAREN_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ('*'|'?'|'+')?
  private static boolean xhp_children_paren_expr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_paren_expr_3")) return false;
    xhp_children_paren_expr_3_0(builder_, level_ + 1);
    return true;
  }

  // '*'|'?'|'+'
  private static boolean xhp_children_paren_expr_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_paren_expr_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MUL);
    if (!result_) result_ = consumeToken(builder_, T_QUEST);
    if (!result_) result_ = consumeToken(builder_, T_PLUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // xhp_children_paren_expr
  // | identifier
  // | T_EMPTY
  public static boolean xhp_children_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_stmt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp children stmt>");
    result_ = xhp_children_paren_expr(builder_, level_ + 1);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_EMPTY);
    exit_section_(builder_, level_, marker_, XHP_CHILDREN_STMT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // xhp_tag
  public static boolean xhp_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_expr")) return false;
    if (!nextTokenIs(builder_, T_XHP_TAG_LT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_tag(builder_, level_ + 1);
    exit_section_(builder_, marker_, XHP_EXPR, result_);
    return result_;
  }

  /* ********************************************************** */
  // xhp_bareword ((':'|'-') xhp_bareword)*
  public static boolean xhp_label_ws(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_label_ws")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp label ws>");
    result_ = xhp_bareword(builder_, level_ + 1);
    result_ = result_ && xhp_label_ws_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_LABEL_WS, result_, false, null);
    return result_;
  }

  // ((':'|'-') xhp_bareword)*
  private static boolean xhp_label_ws_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_label_ws_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!xhp_label_ws_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "xhp_label_ws_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (':'|'-') xhp_bareword
  private static boolean xhp_label_ws_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_label_ws_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_label_ws_1_0_0(builder_, level_ + 1);
    result_ = result_ && xhp_bareword(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ':'|'-'
  private static boolean xhp_label_ws_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_label_ws_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COLON);
    if (!result_) result_ = consumeToken(builder_, T_MINUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_XHP_LABEL?
  public static boolean xhp_opt_end_label(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_opt_end_label")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp opt end label>");
    consumeToken(builder_, T_XHP_LABEL);
    exit_section_(builder_, level_, marker_, XHP_OPT_END_LABEL, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // T_XHP_TAG_LT T_XHP_LABEL xhp_tag_body T_XHP_TAG_GT
  public static boolean xhp_tag(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_tag")) return false;
    if (!nextTokenIs(builder_, T_XHP_TAG_LT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_XHP_TAG_LT, T_XHP_LABEL);
    result_ = result_ && xhp_tag_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_XHP_TAG_GT);
    exit_section_(builder_, marker_, XHP_TAG, result_);
    return result_;
  }

  /* ********************************************************** */
  // (xhp_attributes? '/') | (xhp_attributes? T_XHP_TAG_GT xhp_children? T_XHP_TAG_LT '/' xhp_opt_end_label)
  public static boolean xhp_tag_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_tag_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp tag body>");
    result_ = xhp_tag_body_0(builder_, level_ + 1);
    if (!result_) result_ = xhp_tag_body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_TAG_BODY, result_, false, null);
    return result_;
  }

  // xhp_attributes? '/'
  private static boolean xhp_tag_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_tag_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_tag_body_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DIV);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_attributes?
  private static boolean xhp_tag_body_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_tag_body_0_0")) return false;
    xhp_attributes(builder_, level_ + 1);
    return true;
  }

  // xhp_attributes? T_XHP_TAG_GT xhp_children? T_XHP_TAG_LT '/' xhp_opt_end_label
  private static boolean xhp_tag_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_tag_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_tag_body_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_XHP_TAG_GT);
    result_ = result_ && xhp_tag_body_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_XHP_TAG_LT);
    result_ = result_ && consumeToken(builder_, T_DIV);
    result_ = result_ && xhp_opt_end_label(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_attributes?
  private static boolean xhp_tag_body_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_tag_body_1_0")) return false;
    xhp_attributes(builder_, level_ + 1);
    return true;
  }

  // xhp_children?
  private static boolean xhp_tag_body_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_tag_body_1_2")) return false;
    xhp_children(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // variable '=' yield_expr
  public static boolean yield_assign_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_assign_expr")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<yield assign expr>");
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    pinned_ = result_; // pin = 2
    result_ = result_ && yield_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YIELD_ASSIGN_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_YIELD expr (T_DOUBLE_ARROW expr)?
  public static boolean yield_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expr")) return false;
    if (!nextTokenIs(builder_, T_YIELD)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_YIELD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expr(builder_, level_ + 1));
    result_ = pinned_ && yield_expr_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, YIELD_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (T_DOUBLE_ARROW expr)?
  private static boolean yield_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expr_2")) return false;
    yield_expr_2_0(builder_, level_ + 1);
    return true;
  }

  // T_DOUBLE_ARROW expr
  private static boolean yield_expr_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expr_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_LIST '(' assignment_list ')' '=' yield_expr
  public static boolean yield_list_assign_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_list_assign_expr")) return false;
    if (!nextTokenIs(builder_, T_LIST)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, T_LIST);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, T_LPAREN));
    result_ = pinned_ && report_error_(builder_, assignment_list(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_RPAREN)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, T_EQUAL)) && result_;
    result_ = pinned_ && yield_expr(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, YIELD_LIST_ASSIGN_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // T_YIELD T_BREAK ';'
  public static boolean yield_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_statement")) return false;
    if (!nextTokenIs(builder_, T_YIELD)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokens(builder_, 1, T_YIELD, T_BREAK);
    pinned_ = result_; // pin = 1
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, level_, marker_, YIELD_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

}
