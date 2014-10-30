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
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ADDITIONAL_CATCHES) {
      result_ = additional_catches(builder_, 0);
    }
    else if (root_ == ARRAY_ACCESS) {
      result_ = array_access(builder_, 0);
    }
    else if (root_ == ARRAY_LITERAL) {
      result_ = array_literal(builder_, 0);
    }
    else if (root_ == ARRAY_PAIR_LIST) {
      result_ = array_pair_list(builder_, 0);
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
    else if (root_ == BREAK_STATEMENT) {
      result_ = break_statement(builder_, 0);
    }
    else if (root_ == CALLABLE_VARIABLE) {
      result_ = callable_variable(builder_, 0);
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
    else if (root_ == CLASS_CONSTANT) {
      result_ = class_constant(builder_, 0);
    }
    else if (root_ == CLASS_CONSTANT_DECLARATION) {
      result_ = class_constant_declaration(builder_, 0);
    }
    else if (root_ == CLASS_DECL_NAME) {
      result_ = class_decl_name(builder_, 0);
    }
    else if (root_ == CLASS_DECLARATION_STATEMENT) {
      result_ = class_declaration_statement(builder_, 0);
    }
    else if (root_ == CLASS_ENTRY_TYPE) {
      result_ = class_entry_type(builder_, 0);
    }
    else if (root_ == CLASS_METHOD_CALL) {
      result_ = class_method_call(builder_, 0);
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
    else if (root_ == CLOSURE_EXPRESSION) {
      result_ = closure_expression(builder_, 0);
    }
    else if (root_ == COLLECTION_INIT) {
      result_ = collection_init(builder_, 0);
    }
    else if (root_ == COLLECTION_LITERAL) {
      result_ = collection_literal(builder_, 0);
    }
    else if (root_ == COMMON_SCALAR) {
      result_ = common_scalar(builder_, 0);
    }
    else if (root_ == COMMON_SCALAR_AE) {
      result_ = common_scalar_ae(builder_, 0);
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
    else if (root_ == DIM_OFFSET) {
      result_ = dim_offset(builder_, 0);
    }
    else if (root_ == DIMMABLE_VARIABLE) {
      result_ = dimmable_variable(builder_, 0);
    }
    else if (root_ == DIMMABLE_VARIABLE_ACCESS) {
      result_ = dimmable_variable_access(builder_, 0);
    }
    else if (root_ == DIMMABLE_VARIABLE_NO_CALLS) {
      result_ = dimmable_variable_no_calls(builder_, 0);
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
    else if (root_ == EXIT_EXPR) {
      result_ = exit_expr(builder_, 0);
    }
    else if (root_ == EXPR) {
      result_ = expr(builder_, 0);
    }
    else if (root_ == EXPR_LIST) {
      result_ = expr_list(builder_, 0);
    }
    else if (root_ == EXPR_NO_VARIABLE) {
      result_ = expr_no_variable(builder_, 0);
    }
    else if (root_ == EXPR_STATEMENT) {
      result_ = expr_statement(builder_, 0);
    }
    else if (root_ == EXPR_WITH_PARENS) {
      result_ = expr_with_parens(builder_, 0);
    }
    else if (root_ == EXTENDS_FROM) {
      result_ = extends_from(builder_, 0);
    }
    else if (root_ == FINALLY_STATEMENT_LIST) {
      result_ = finally_statement_list(builder_, 0);
    }
    else if (root_ == FOR_EXPR) {
      result_ = for_expr(builder_, 0);
    }
    else if (root_ == FOR_STATEMENT) {
      result_ = for_statement(builder_, 0);
    }
    else if (root_ == FOR_STATEMENT_BODY) {
      result_ = for_statement_body(builder_, 0);
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
    else if (root_ == FUNCTION_LOC) {
      result_ = function_loc(builder_, 0);
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
    else if (root_ == HH_NAME_WITH_TYPE) {
      result_ = hh_name_with_type(builder_, 0);
    }
    else if (root_ == HH_NAME_WITH_TYPEVAR) {
      result_ = hh_name_with_typevar(builder_, 0);
    }
    else if (root_ == HH_NON_EMPTY_SHAPE_MEMBER_LIST) {
      result_ = hh_non_empty_shape_member_list(builder_, 0);
    }
    else if (root_ == HH_NON_EMPTY_TYPE_LIST) {
      result_ = hh_non_empty_type_list(builder_, 0);
    }
    else if (root_ == HH_NULL_TYPE) {
      result_ = hh_null_type(builder_, 0);
    }
    else if (root_ == HH_OPT_CONSTRAINT) {
      result_ = hh_opt_constraint(builder_, 0);
    }
    else if (root_ == HH_OPT_RETURN_TYPE) {
      result_ = hh_opt_return_type(builder_, 0);
    }
    else if (root_ == HH_POSSIBLE_COMMA) {
      result_ = hh_possible_comma(builder_, 0);
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
    else if (root_ == HH_TYPE) {
      result_ = hh_type(builder_, 0);
    }
    else if (root_ == HH_TYPE_ALIAS_STATEMENT) {
      result_ = hh_type_alias_statement(builder_, 0);
    }
    else if (root_ == HH_TYPE_LIST) {
      result_ = hh_type_list(builder_, 0);
    }
    else if (root_ == HH_TYPE_OPT) {
      result_ = hh_type_opt(builder_, 0);
    }
    else if (root_ == HH_TYPEARGS_OPT) {
      result_ = hh_typeargs_opt(builder_, 0);
    }
    else if (root_ == HH_TYPEVAR_LIST) {
      result_ = hh_typevar_list(builder_, 0);
    }
    else if (root_ == HH_TYPEVAR_VARIANCE) {
      result_ = hh_typevar_variance(builder_, 0);
    }
    else if (root_ == HTML_STATEMENT) {
      result_ = html_statement(builder_, 0);
    }
    else if (root_ == IDENT) {
      result_ = ident(builder_, 0);
    }
    else if (root_ == IF_STATEMENT) {
      result_ = if_statement(builder_, 0);
    }
    else if (root_ == IMPLEMENTS_LIST) {
      result_ = implements_list(builder_, 0);
    }
    else if (root_ == INNER_STATEMENT) {
      result_ = inner_statement(builder_, 0);
    }
    else if (root_ == INNER_STATEMENT_LIST) {
      result_ = inner_statement_list(builder_, 0);
    }
    else if (root_ == INTERFACE_DECL_NAME) {
      result_ = interface_decl_name(builder_, 0);
    }
    else if (root_ == INTERFACE_EXTENDS_LIST) {
      result_ = interface_extends_list(builder_, 0);
    }
    else if (root_ == INTERFACE_LIST) {
      result_ = interface_list(builder_, 0);
    }
    else if (root_ == INTERNAL_FUNCTIONS) {
      result_ = internal_functions(builder_, 0);
    }
    else if (root_ == IS_REFERENCE) {
      result_ = is_reference(builder_, 0);
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
    else if (root_ == LAMBDA_EXPRESSION) {
      result_ = lambda_expression(builder_, 0);
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
    else if (root_ == MAP_ARRAY_INIT) {
      result_ = map_array_init(builder_, 0);
    }
    else if (root_ == MAP_ARRAY_LITERAL) {
      result_ = map_array_literal(builder_, 0);
    }
    else if (root_ == MEMBER_MODIFIER) {
      result_ = member_modifier(builder_, 0);
    }
    else if (root_ == METHOD_BODY) {
      result_ = method_body(builder_, 0);
    }
    else if (root_ == METHOD_MODIFIERS) {
      result_ = method_modifiers(builder_, 0);
    }
    else if (root_ == NAMESPACE_NAME) {
      result_ = namespace_name(builder_, 0);
    }
    else if (root_ == NAMESPACE_STATEMENT) {
      result_ = namespace_statement(builder_, 0);
    }
    else if (root_ == NAMESPACE_STRING) {
      result_ = namespace_string(builder_, 0);
    }
    else if (root_ == NAMESPACE_STRING_BASE) {
      result_ = namespace_string_base(builder_, 0);
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
    else if (root_ == NON_EMPTY_ARRAY_PAIR_LIST) {
      result_ = non_empty_array_pair_list(builder_, 0);
    }
    else if (root_ == NON_EMPTY_COLLECTION_INIT) {
      result_ = non_empty_collection_init(builder_, 0);
    }
    else if (root_ == NON_EMPTY_FCALL_PARAMETER_LIST) {
      result_ = non_empty_fcall_parameter_list(builder_, 0);
    }
    else if (root_ == NON_EMPTY_MAP_ARRAY_INIT) {
      result_ = non_empty_map_array_init(builder_, 0);
    }
    else if (root_ == NON_EMPTY_MEMBER_MODIFIERS) {
      result_ = non_empty_member_modifiers(builder_, 0);
    }
    else if (root_ == NON_EMPTY_SHAPE_PAIR_LIST) {
      result_ = non_empty_shape_pair_list(builder_, 0);
    }
    else if (root_ == NON_EMPTY_STATIC_ARRAY_PAIR_LIST) {
      result_ = non_empty_static_array_pair_list(builder_, 0);
    }
    else if (root_ == NON_EMPTY_STATIC_ARRAY_PAIR_LIST_AE) {
      result_ = non_empty_static_array_pair_list_ae(builder_, 0);
    }
    else if (root_ == NON_EMPTY_STATIC_COLLECTION_INIT) {
      result_ = non_empty_static_collection_init(builder_, 0);
    }
    else if (root_ == NON_EMPTY_STATIC_MAP_ARRAY_INIT) {
      result_ = non_empty_static_map_array_init(builder_, 0);
    }
    else if (root_ == NON_EMPTY_STATIC_SCALAR_LIST_AE) {
      result_ = non_empty_static_scalar_list_ae(builder_, 0);
    }
    else if (root_ == NON_EMPTY_STATIC_SHAPE_PAIR_LIST) {
      result_ = non_empty_static_shape_pair_list(builder_, 0);
    }
    else if (root_ == NON_EMPTY_STATIC_SHAPE_PAIR_LIST_AE) {
      result_ = non_empty_static_shape_pair_list_ae(builder_, 0);
    }
    else if (root_ == NON_EMPTY_STATIC_VARRAY_INIT) {
      result_ = non_empty_static_varray_init(builder_, 0);
    }
    else if (root_ == NON_EMPTY_USER_ATTRIBUTE_LIST) {
      result_ = non_empty_user_attribute_list(builder_, 0);
    }
    else if (root_ == NON_EMPTY_USER_ATTRIBUTES) {
      result_ = non_empty_user_attributes(builder_, 0);
    }
    else if (root_ == NON_EMPTY_VARRAY_INIT) {
      result_ = non_empty_varray_init(builder_, 0);
    }
    else if (root_ == OBJECT_METHOD_CALL) {
      result_ = object_method_call(builder_, 0);
    }
    else if (root_ == OPTIONAL_FINALLY) {
      result_ = optional_finally(builder_, 0);
    }
    else if (root_ == OPTIONAL_USER_ATTRIBUTES) {
      result_ = optional_user_attributes(builder_, 0);
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
    else if (root_ == PARAMETER_MODIFIERS) {
      result_ = parameter_modifiers(builder_, 0);
    }
    else if (root_ == PARENTHESIS_EXPR) {
      result_ = parenthesis_expr(builder_, 0);
    }
    else if (root_ == POSSIBLE_COMMA) {
      result_ = possible_comma(builder_, 0);
    }
    else if (root_ == PROPERTY_ACCESS) {
      result_ = property_access(builder_, 0);
    }
    else if (root_ == PROPERTY_ACCESS_WITHOUT_VARIABLES) {
      result_ = property_access_without_variables(builder_, 0);
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
    else if (root_ == SCALAR) {
      result_ = scalar(builder_, 0);
    }
    else if (root_ == SELECT_CLAUSE) {
      result_ = select_clause(builder_, 0);
    }
    else if (root_ == SELECT_OR_GROUP_CLAUSE) {
      result_ = select_or_group_clause(builder_, 0);
    }
    else if (root_ == SHAPE_KEYNAME) {
      result_ = shape_keyname(builder_, 0);
    }
    else if (root_ == SHAPE_LITERAL) {
      result_ = shape_literal(builder_, 0);
    }
    else if (root_ == SHAPE_PAIR_LIST) {
      result_ = shape_pair_list(builder_, 0);
    }
    else if (root_ == SIMPLE_FUNCTION_CALL) {
      result_ = simple_function_call(builder_, 0);
    }
    else if (root_ == SIMPLE_INDIRECT_REFERENCE) {
      result_ = simple_indirect_reference(builder_, 0);
    }
    else if (root_ == STATEMENT) {
      result_ = statement(builder_, 0);
    }
    else if (root_ == STATIC_ARRAY_PAIR_LIST) {
      result_ = static_array_pair_list(builder_, 0);
    }
    else if (root_ == STATIC_ARRAY_PAIR_LIST_AE) {
      result_ = static_array_pair_list_ae(builder_, 0);
    }
    else if (root_ == STATIC_CLASS_CONSTANT) {
      result_ = static_class_constant(builder_, 0);
    }
    else if (root_ == STATIC_CLASS_NAME) {
      result_ = static_class_name(builder_, 0);
    }
    else if (root_ == STATIC_COLLECTION_INIT) {
      result_ = static_collection_init(builder_, 0);
    }
    else if (root_ == STATIC_COLLECTION_LITERAL) {
      result_ = static_collection_literal(builder_, 0);
    }
    else if (root_ == STATIC_EXPR) {
      result_ = static_expr(builder_, 0);
    }
    else if (root_ == STATIC_MAP_ARRAY_INIT) {
      result_ = static_map_array_init(builder_, 0);
    }
    else if (root_ == STATIC_MAP_ARRAY_LITERAL) {
      result_ = static_map_array_literal(builder_, 0);
    }
    else if (root_ == STATIC_NUMERIC_SCALAR_AE) {
      result_ = static_numeric_scalar_ae(builder_, 0);
    }
    else if (root_ == STATIC_SCALAR_AE) {
      result_ = static_scalar_ae(builder_, 0);
    }
    else if (root_ == STATIC_SCALAR_LIST_AE) {
      result_ = static_scalar_list_ae(builder_, 0);
    }
    else if (root_ == STATIC_SHAPE_PAIR_LIST) {
      result_ = static_shape_pair_list(builder_, 0);
    }
    else if (root_ == STATIC_SHAPE_PAIR_LIST_AE) {
      result_ = static_shape_pair_list_ae(builder_, 0);
    }
    else if (root_ == STATIC_STATEMENT) {
      result_ = static_statement(builder_, 0);
    }
    else if (root_ == STATIC_VAR_LIST) {
      result_ = static_var_list(builder_, 0);
    }
    else if (root_ == STATIC_VARRAY_INIT) {
      result_ = static_varray_init(builder_, 0);
    }
    else if (root_ == STATIC_VARRAY_LITERAL) {
      result_ = static_varray_literal(builder_, 0);
    }
    else if (root_ == SWITCH_CASE_LIST) {
      result_ = switch_case_list(builder_, 0);
    }
    else if (root_ == SWITCH_STATEMENT) {
      result_ = switch_statement(builder_, 0);
    }
    else if (root_ == THROW_STATEMENT) {
      result_ = throw_statement(builder_, 0);
    }
    else if (root_ == TOP_STATEMENT_LIST) {
      result_ = top_statement_list(builder_, 0);
    }
    else if (root_ == TRAIT_ALIAS_RULE) {
      result_ = trait_alias_rule(builder_, 0);
    }
    else if (root_ == TRAIT_ALIAS_RULE_METHOD) {
      result_ = trait_alias_rule_method(builder_, 0);
    }
    else if (root_ == TRAIT_DECL_NAME) {
      result_ = trait_decl_name(builder_, 0);
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
    else if (root_ == TRAIT_RULES) {
      result_ = trait_rules(builder_, 0);
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
    else if (root_ == TRY_STATEMENT_LIST) {
      result_ = try_statement_list(builder_, 0);
    }
    else if (root_ == UNSET_STATEMENT) {
      result_ = unset_statement(builder_, 0);
    }
    else if (root_ == USE_CONST_DECLARATION) {
      result_ = use_const_declaration(builder_, 0);
    }
    else if (root_ == USE_CONST_DECLARATIONS) {
      result_ = use_const_declarations(builder_, 0);
    }
    else if (root_ == USE_DECLARATION) {
      result_ = use_declaration(builder_, 0);
    }
    else if (root_ == USE_DECLARATIONS) {
      result_ = use_declarations(builder_, 0);
    }
    else if (root_ == USE_FN_DECLARATION) {
      result_ = use_fn_declaration(builder_, 0);
    }
    else if (root_ == USE_FN_DECLARATIONS) {
      result_ = use_fn_declarations(builder_, 0);
    }
    else if (root_ == USE_STATEMENT) {
      result_ = use_statement(builder_, 0);
    }
    else if (root_ == USER_ATTRIBUTE_LIST) {
      result_ = user_attribute_list(builder_, 0);
    }
    else if (root_ == VARIABLE) {
      result_ = variable(builder_, 0);
    }
    else if (root_ == VARIABLE_LIST) {
      result_ = variable_list(builder_, 0);
    }
    else if (root_ == VARIABLE_MODIFIERS) {
      result_ = variable_modifiers(builder_, 0);
    }
    else if (root_ == VARIABLE_NO_CALLS) {
      result_ = variable_no_calls(builder_, 0);
    }
    else if (root_ == VARIABLE_WITHOUT_OBJECTS) {
      result_ = variable_without_objects(builder_, 0);
    }
    else if (root_ == VARRAY_INIT) {
      result_ = varray_init(builder_, 0);
    }
    else if (root_ == VARRAY_LITERAL) {
      result_ = varray_literal(builder_, 0);
    }
    else if (root_ == WHERE_CLAUSE) {
      result_ = where_clause(builder_, 0);
    }
    else if (root_ == WHILE_STATEMENT) {
      result_ = while_statement(builder_, 0);
    }
    else if (root_ == WHILE_STATEMENT_BODY) {
      result_ = while_statement_body(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_DECL) {
      result_ = xhp_attribute_decl(builder_, 0);
    }
    else if (root_ == XHP_ATTRIBUTE_DECL_TYPE) {
      result_ = xhp_attribute_decl_type(builder_, 0);
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
    else if (root_ == XHP_CATEGORY_DECL) {
      result_ = xhp_category_decl(builder_, 0);
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
    else if (root_ == XHP_CHILDREN_PAREN_EXPR) {
      result_ = xhp_children_paren_expr(builder_, 0);
    }
    else if (root_ == XHP_CHILDREN_STMT) {
      result_ = xhp_children_stmt(builder_, 0);
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

  /* ********************************************************** */
  // try_catch*
  public static boolean additional_catches(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additional_catches")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<additional catches>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!try_catch(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "additional_catches", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, ADDITIONAL_CATCHES, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // '[' dim_offset ']'
  // | '{' expr '}'
  public static boolean array_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_access")) return false;
    if (!nextTokenIs(builder_, "<array access>", T_LBRACKET, T_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array access>");
    result_ = array_access_0(builder_, level_ + 1);
    if (!result_) result_ = array_access_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARRAY_ACCESS, result_, false, null);
    return result_;
  }

  // '[' dim_offset ']'
  private static boolean array_access_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_access_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACKET);
    result_ = result_ && dim_offset(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, null, result_);
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
  // | '[' array_pair_list ']'
  public static boolean array_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_literal")) return false;
    if (!nextTokenIs(builder_, "<array literal>", T_LBRACKET, T_ARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array literal>");
    result_ = array_literal_0(builder_, level_ + 1);
    if (!result_) result_ = array_literal_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARRAY_LITERAL, result_, false, null);
    return result_;
  }

  // T_ARRAY '(' array_pair_list ')'
  private static boolean array_literal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_literal_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ARRAY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '[' array_pair_list ']'
  private static boolean array_literal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_literal_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACKET);
    result_ = result_ && array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_array_pair_list possible_comma
  public static boolean array_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_pair_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array pair list>");
    result_ = non_empty_array_pair_list(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARRAY_PAIR_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // assignment_list ','
  // | assignment_list ',' variable
  // | assignment_list ',' T_LIST '(' assignment_list ')'
  // | variable
  // | T_LIST '(' assignment_list ')'
  public static boolean assignment_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<assignment list>");
    result_ = assignment_list_0(builder_, level_ + 1);
    if (!result_) result_ = assignment_list_1(builder_, level_ + 1);
    if (!result_) result_ = assignment_list_2(builder_, level_ + 1);
    if (!result_) result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = assignment_list_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ASSIGNMENT_LIST, result_, false, null);
    return result_;
  }

  // assignment_list ','
  private static boolean assignment_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignment_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // assignment_list ',' variable
  private static boolean assignment_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignment_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // assignment_list ',' T_LIST '(' assignment_list ')'
  private static boolean assignment_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignment_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && consumeToken(builder_, T_LIST);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && assignment_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_LIST '(' assignment_list ')'
  private static boolean assignment_list_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_list_4")) return false;
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
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<await assign expr>");
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && await_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, AWAIT_ASSIGN_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_AWAIT expr
  public static boolean await_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "await_expr")) return false;
    if (!nextTokenIs(builder_, T_AWAIT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AWAIT);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, AWAIT_EXPR, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_LIST '(' assignment_list ')' '=' await_expr
  public static boolean await_list_assign_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "await_list_assign_expr")) return false;
    if (!nextTokenIs(builder_, T_LIST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LIST);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && assignment_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && await_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, AWAIT_LIST_ASSIGN_EXPR, result_);
    return result_;
  }

  /* ********************************************************** */
  // | T_ENCAPSED_AND_WHITESPACE
  // | encaps_list
  public static boolean backticks_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "backticks_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<backticks expr>");
    result_ = consumeToken(builder_, BACKTICKS_EXPR_0_0);
    if (!result_) result_ = consumeToken(builder_, T_ENCAPSED_AND_WHITESPACE);
    if (!result_) result_ = encaps_list(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BACKTICKS_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_BREAK expr? ';'
  public static boolean break_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "break_statement")) return false;
    if (!nextTokenIs(builder_, T_BREAK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_BREAK);
    result_ = result_ && break_statement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, BREAK_STATEMENT, result_);
    return result_;
  }

  // expr?
  private static boolean break_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "break_statement_1")) return false;
    expr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // variable_without_objects
  // | dimmable_variable_access
  // | '(' variable ')'
  public static boolean callable_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callable_variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<callable variable>");
    result_ = variable_without_objects(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_access(builder_, level_ + 1);
    if (!result_) result_ = callable_variable_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CALLABLE_VARIABLE, result_, false, null);
    return result_;
  }

  // '(' variable ')'
  private static boolean callable_variable_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callable_variable_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_CASE expr case_separator inner_statement_list
  public static boolean case_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_block")) return false;
    if (!nextTokenIs(builder_, T_CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_CASE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && case_separator(builder_, level_ + 1);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, CASE_BLOCK, result_);
    return result_;
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
  // static_class_name T_DOUBLE_COLON ident
  // | static_class_name T_DOUBLE_COLON T_CLASS
  public static boolean class_constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_constant")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class constant>");
    result_ = class_constant_0(builder_, level_ + 1);
    if (!result_) result_ = class_constant_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_CONSTANT, result_, false, null);
    return result_;
  }

  // static_class_name T_DOUBLE_COLON ident
  private static boolean class_constant_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_constant_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_class_name T_DOUBLE_COLON T_CLASS
  private static boolean class_constant_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_constant_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_class_name(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, T_DOUBLE_COLON, T_CLASS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // class_constant_declaration ',' hh_name_with_type '=' static_expr
  // | T_CONST hh_name_with_type '=' static_expr
  public static boolean class_constant_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_constant_declaration")) return false;
    if (!nextTokenIs(builder_, T_CONST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_constant_declaration_0(builder_, level_ + 1);
    if (!result_) result_ = class_constant_declaration_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CLASS_CONSTANT_DECLARATION, result_);
    return result_;
  }

  // class_constant_declaration ',' hh_name_with_type '=' static_expr
  private static boolean class_constant_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_constant_declaration_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_constant_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_name_with_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_CONST hh_name_with_type '=' static_expr
  private static boolean class_constant_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_constant_declaration_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_CONST);
    result_ = result_ && hh_name_with_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_name_with_typevar
  // | T_XHP_LABEL
  public static boolean class_decl_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_decl_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class decl name>");
    result_ = hh_name_with_typevar(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_XHP_LABEL);
    exit_section_(builder_, level_, marker_, CLASS_DECL_NAME, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // class_entry_type class_decl_name  extends_from implements_list '{' class_statement_list '}'
  public static boolean class_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class declaration statement>");
    result_ = class_entry_type(builder_, level_ + 1);
    result_ = result_ && class_decl_name(builder_, level_ + 1);
    result_ = result_ && extends_from(builder_, level_ + 1);
    result_ = result_ && implements_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && class_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, level_, marker_, CLASS_DECLARATION_STATEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_CLASS
  // | T_ABSTRACT T_CLASS
  // | T_FINAL T_CLASS
  public static boolean class_entry_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_entry_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class entry type>");
    result_ = consumeToken(builder_, T_CLASS);
    if (!result_) result_ = parseTokens(builder_, 0, T_ABSTRACT, T_CLASS);
    if (!result_) result_ = parseTokens(builder_, 0, T_FINAL, T_CLASS);
    exit_section_(builder_, level_, marker_, CLASS_ENTRY_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // static_class_name T_DOUBLE_COLON ident hh_typeargs_opt '(' function_call_parameter_list ')'
  // | static_class_name T_DOUBLE_COLON variable_without_objects '(' function_call_parameter_list ')'
  // | static_class_name T_DOUBLE_COLON '{' expr '}' '(' function_call_parameter_list ')'
  public static boolean class_method_call(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_method_call")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class method call>");
    result_ = class_method_call_0(builder_, level_ + 1);
    if (!result_) result_ = class_method_call_1(builder_, level_ + 1);
    if (!result_) result_ = class_method_call_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_METHOD_CALL, result_, false, null);
    return result_;
  }

  // static_class_name T_DOUBLE_COLON ident hh_typeargs_opt '(' function_call_parameter_list ')'
  private static boolean class_method_call_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_method_call_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && hh_typeargs_opt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_class_name T_DOUBLE_COLON variable_without_objects '(' function_call_parameter_list ')'
  private static boolean class_method_call_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_method_call_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && variable_without_objects(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_class_name T_DOUBLE_COLON '{' expr '}' '(' function_call_parameter_list ')'
  private static boolean class_method_call_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_method_call_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // fully_qualified_class_name
  // | T_STATIC
  // | variable_no_calls
  public static boolean class_name_reference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_name_reference")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class name reference>");
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_STATIC);
    if (!result_) result_ = variable_no_calls(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_NAME_REFERENCE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // namespace_string_base hh_typeargs_opt
  public static boolean class_namespace_string_typeargs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_namespace_string_typeargs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class namespace string typeargs>");
    result_ = namespace_string_base(builder_, level_ + 1);
    result_ = result_ && hh_typeargs_opt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_NAMESPACE_STRING_TYPEARGS, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // variable_modifiers  class_variable_declaration ';'
  public static boolean class_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class statement>");
    result_ = variable_modifiers(builder_, level_ + 1);
    result_ = result_ && class_variable_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, level_, marker_, CLASS_STATEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // class_statement_list class_statement
  public static boolean class_statement_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_statement_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class statement list>");
    result_ = class_statement_list(builder_, level_ + 1);
    result_ = result_ && class_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_STATEMENT_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // class_variable_declaration ',' T_VARIABLE
  // | class_variable_declaration ',' static_assignment
  // | T_VARIABLE
  // | static_assignment
  public static boolean class_variable_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declaration")) return false;
    if (!nextTokenIs(builder_, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_variable_declaration_0(builder_, level_ + 1);
    if (!result_) result_ = class_variable_declaration_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = static_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, CLASS_VARIABLE_DECLARATION, result_);
    return result_;
  }

  // class_variable_declaration ',' T_VARIABLE
  private static boolean class_variable_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declaration_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_variable_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && consumeToken(builder_, T_VARIABLE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // class_variable_declaration ',' static_assignment
  private static boolean class_variable_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_variable_declaration_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_variable_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && static_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // function_loc is_reference '('  parameter_list ')' hh_opt_return_type lambda_use_vars '{' inner_statement_list '}'
  public static boolean closure_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_expression")) return false;
    if (!nextTokenIs(builder_, T_FUNCTION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = function_loc(builder_, level_ + 1);
    result_ = result_ && is_reference(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && hh_opt_return_type(builder_, level_ + 1);
    result_ = result_ && lambda_use_vars(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, CLOSURE_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_collection_init possible_comma
  public static boolean collection_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "collection_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<collection init>");
    result_ = non_empty_collection_init(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COLLECTION_INIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // fully_qualified_class_name '{' collection_init '}'
  public static boolean collection_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "collection_literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<collection literal>");
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && collection_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, level_, marker_, COLLECTION_LITERAL, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_LNUMBER
  // | T_DNUMBER
  // | T_ONUMBER
  // | T_CONSTANT_ENCAPSED_STRING
  // | T_LINE
  // | T_FILE
  // | T_DIR
  // | T_CLASS_C
  // | T_TRAIT_C
  // | T_METHOD_C
  // | T_FUNC_C
  // | T_NS_C
  // | T_COMPILER_HALT_OFFSET
  // | T_START_HEREDOC T_ENCAPSED_AND_WHITESPACE T_END_HEREDOC
  // | T_START_HEREDOC T_END_HEREDOC
  public static boolean common_scalar(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "common_scalar")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<common scalar>");
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
    exit_section_(builder_, level_, marker_, COMMON_SCALAR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_LNUMBER
  // | T_DNUMBER
  // | T_ONUMBER
  // | T_CONSTANT_ENCAPSED_STRING
  // | T_START_HEREDOC T_ENCAPSED_AND_WHITESPACE T_END_HEREDOC
  // | T_START_HEREDOC T_END_HEREDOC
  public static boolean common_scalar_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "common_scalar_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<common scalar ae>");
    result_ = consumeToken(builder_, T_LNUMBER);
    if (!result_) result_ = consumeToken(builder_, T_DNUMBER);
    if (!result_) result_ = consumeToken(builder_, T_ONUMBER);
    if (!result_) result_ = consumeToken(builder_, T_CONSTANT_ENCAPSED_STRING);
    if (!result_) result_ = parseTokens(builder_, 0, T_START_HEREDOC, T_ENCAPSED_AND_WHITESPACE, T_END_HEREDOC);
    if (!result_) result_ = parseTokens(builder_, 0, T_START_HEREDOC, T_END_HEREDOC);
    exit_section_(builder_, level_, marker_, COMMON_SCALAR_AE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_VARIABLE
  // | '$' '{' expr '}'
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
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<constant assignment>");
    result_ = hh_name_with_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONSTANT_ASSIGNMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_CONST constant_assignment (',' constant_assignment)*
  public static boolean constant_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declaration")) return false;
    if (!nextTokenIs(builder_, T_CONST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_CONST);
    result_ = result_ && constant_assignment(builder_, level_ + 1);
    result_ = result_ && constant_declaration_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONSTANT_DECLARATION, result_);
    return result_;
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
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_CONTINUE);
    result_ = result_ && continue_statement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, CONTINUE_STATEMENT, result_);
    return result_;
  }

  // expr?
  private static boolean continue_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "continue_statement_1")) return false;
    expr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' function_call_parameter_list ')'
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
  // ident '=' static_expr
  public static boolean declare_assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_assignment")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<declare assignment>");
    result_ = ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DECLARE_ASSIGNMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // declare_assignment (',' declare_assignment )*
  public static boolean declare_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<declare list>");
    result_ = declare_assignment(builder_, level_ + 1);
    result_ = result_ && declare_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DECLARE_LIST, result_, false, null);
    return result_;
  }

  // (',' declare_assignment )*
  private static boolean declare_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_list_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!declare_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "declare_list_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' declare_assignment
  private static boolean declare_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && declare_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_DECLARE '(' declare_list ')' declare_statement_body
  public static boolean declare_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_statement")) return false;
    if (!nextTokenIs(builder_, T_DECLARE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DECLARE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && declare_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && declare_statement_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, DECLARE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // statement
  // | ':' inner_statement_list T_ENDDECLARE ';'
  public static boolean declare_statement_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_statement_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<declare statement body>");
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = declare_statement_body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DECLARE_STATEMENT_BODY, result_, false, null);
    return result_;
  }

  // ':' inner_statement_list T_ENDDECLARE ';'
  private static boolean declare_statement_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_statement_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COLON);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ENDDECLARE);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_DEFAULT case_separator inner_statement_list
  public static boolean default_case_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "default_case_block")) return false;
    if (!nextTokenIs(builder_, T_DEFAULT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DEFAULT);
    result_ = result_ && case_separator(builder_, level_ + 1);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, DEFAULT_CASE_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // dim_expr '[' dim_offset ']'
  // | dim_expr_base '[' dim_offset ']'
  public static boolean dim_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dim_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dim expr>");
    result_ = dim_expr_0(builder_, level_ + 1);
    if (!result_) result_ = dim_expr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIM_EXPR, result_, false, null);
    return result_;
  }

  // dim_expr '[' dim_offset ']'
  private static boolean dim_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dim_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dim_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACKET);
    result_ = result_ && dim_offset(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dim_expr_base '[' dim_offset ']'
  private static boolean dim_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dim_expr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dim_expr_base(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACKET);
    result_ = result_ && dim_offset(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // array_literal
  // | class_constant
  // | T_CONSTANT_ENCAPSED_STRING
  // | '(' expr_no_variable ')'
  public static boolean dim_expr_base(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dim_expr_base")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dim expr base>");
    result_ = array_literal(builder_, level_ + 1);
    if (!result_) result_ = class_constant(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_CONSTANT_ENCAPSED_STRING);
    if (!result_) result_ = dim_expr_base_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIM_EXPR_BASE, result_, false, null);
    return result_;
  }

  // '(' expr_no_variable ')'
  private static boolean dim_expr_base_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dim_expr_base_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_no_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr
  public static boolean dim_offset(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dim_offset")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dim offset>");
    result_ = expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIM_OFFSET, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // simple_function_call
  // | object_method_call
  // | class_method_call
  // | dimmable_variable_access
  // | variable property_access_without_variables
  // | '(' expr_with_parens ')' property_access_without_variables
  // | callable_variable '(' function_call_parameter_list ')'
  // | '(' variable ')'
  public static boolean dimmable_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dimmable variable>");
    result_ = simple_function_call(builder_, level_ + 1);
    if (!result_) result_ = object_method_call(builder_, level_ + 1);
    if (!result_) result_ = class_method_call(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_access(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_4(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_5(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_6(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_7(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIMMABLE_VARIABLE, result_, false, null);
    return result_;
  }

  // variable property_access_without_variables
  private static boolean dimmable_variable_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && property_access_without_variables(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' property_access_without_variables
  private static boolean dimmable_variable_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && property_access_without_variables(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // callable_variable '(' function_call_parameter_list ')'
  private static boolean dimmable_variable_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = callable_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' variable ')'
  private static boolean dimmable_variable_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // dimmable_variable array_access
  // | '(' expr_with_parens ')' array_access
  public static boolean dimmable_variable_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_access")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dimmable variable access>");
    result_ = dimmable_variable_access_0(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_access_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIMMABLE_VARIABLE_ACCESS, result_, false, null);
    return result_;
  }

  // dimmable_variable array_access
  private static boolean dimmable_variable_access_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_access_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dimmable_variable(builder_, level_ + 1);
    result_ = result_ && array_access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' array_access
  private static boolean dimmable_variable_access_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_access_1")) return false;
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
  // | dimmable_variable_no_calls_access
  // | variable_no_calls property_access_without_variables
  // | '(' expr_with_parens ')' property_access_without_variables
  // | '(' variable ')'
  public static boolean dimmable_variable_no_calls(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dimmable variable no calls>");
    result_ = consumeToken(builder_, DIMMABLE_VARIABLE_NO_CALLS_0_0);
    if (!result_) result_ = dimmable_variable_no_calls_access(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_no_calls_2(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_no_calls_3(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_no_calls_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIMMABLE_VARIABLE_NO_CALLS, result_, false, null);
    return result_;
  }

  // variable_no_calls property_access_without_variables
  private static boolean dimmable_variable_no_calls_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable_no_calls(builder_, level_ + 1);
    result_ = result_ && property_access_without_variables(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' property_access_without_variables
  private static boolean dimmable_variable_no_calls_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && property_access_without_variables(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' variable ')'
  private static boolean dimmable_variable_no_calls_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // dimmable_variable_no_calls array_access
  // | '(' expr_with_parens ')' array_access
  public static boolean dimmable_variable_no_calls_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls_access")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<dimmable variable no calls access>");
    result_ = dimmable_variable_no_calls_access_0(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_no_calls_access_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIMMABLE_VARIABLE_NO_CALLS_ACCESS, result_, false, null);
    return result_;
  }

  // dimmable_variable_no_calls array_access
  private static boolean dimmable_variable_no_calls_access_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls_access_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dimmable_variable_no_calls(builder_, level_ + 1);
    result_ = result_ && array_access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' array_access
  private static boolean dimmable_variable_no_calls_access_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dimmable_variable_no_calls_access_1")) return false;
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
  // T_DO  statement T_WHILE parenthesis_expr ';'
  public static boolean do_while_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_while_statement")) return false;
    if (!nextTokenIs(builder_, T_DO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DO);
    result_ = result_ && statement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_WHILE);
    result_ = result_ && parenthesis_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, DO_WHILE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ECHO expr_list ';'
  public static boolean echo_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "echo_statement")) return false;
    if (!nextTokenIs(builder_, T_ECHO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ECHO);
    result_ = result_ && expr_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, ECHO_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ELSE statement
  public static boolean else_single(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "else_single")) return false;
    if (!nextTokenIs(builder_, T_ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ELSE);
    result_ = result_ && statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, ELSE_SINGLE, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ELSEIF parenthesis_expr statement
  public static boolean elseif_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elseif_body")) return false;
    if (!nextTokenIs(builder_, T_ELSEIF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ELSEIF);
    result_ = result_ && parenthesis_expr(builder_, level_ + 1);
    result_ = result_ && statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, ELSEIF_BODY, result_);
    return result_;
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
  // encaps_list encaps_var
  // | encaps_list T_ENCAPSED_AND_WHITESPACE
  // | encaps_var
  // | T_ENCAPSED_AND_WHITESPACE encaps_var
  public static boolean encaps_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<encaps list>");
    result_ = encaps_list_0(builder_, level_ + 1);
    if (!result_) result_ = encaps_list_1(builder_, level_ + 1);
    if (!result_) result_ = encaps_var(builder_, level_ + 1);
    if (!result_) result_ = encaps_list_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ENCAPS_LIST, result_, false, null);
    return result_;
  }

  // encaps_list encaps_var
  private static boolean encaps_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = encaps_list(builder_, level_ + 1);
    result_ = result_ && encaps_var(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // encaps_list T_ENCAPSED_AND_WHITESPACE
  private static boolean encaps_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = encaps_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ENCAPSED_AND_WHITESPACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_ENCAPSED_AND_WHITESPACE encaps_var
  private static boolean encaps_list_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_list_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ENCAPSED_AND_WHITESPACE);
    result_ = result_ && encaps_var(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_VARIABLE
  // | T_VARIABLE '[' encaps_var_offset ']'
  // | T_VARIABLE T_OBJECT_OPERATOR ident
  // | T_DOLLAR_OPEN_CURLY_BRACES expr '}'
  // | T_DOLLAR_OPEN_CURLY_BRACES T_STRING_VARNAME '[' expr ']' '}'
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

  // T_VARIABLE T_OBJECT_OPERATOR ident
  private static boolean encaps_var_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_var_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_VARIABLE, T_OBJECT_OPERATOR);
    result_ = result_ && ident(builder_, level_ + 1);
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

  // T_DOLLAR_OPEN_CURLY_BRACES T_STRING_VARNAME '[' expr ']' '}'
  private static boolean encaps_var_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_var_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_DOLLAR_OPEN_CURLY_BRACES, T_STRING_VARNAME);
    result_ = result_ && consumeToken(builder_, T_LBRACKET);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
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
  // ident
  // | T_NUM_STRING
  // | T_VARIABLE
  public static boolean encaps_var_offset(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encaps_var_offset")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<encaps var offset>");
    result_ = ident(builder_, level_ + 1);
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
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum constant declaration>");
    result_ = hh_name_with_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ENUM_CONSTANT_DECLARATION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_ENUM ident  ':' hh_type hh_opt_constraint '{' enum_statement_list '}'
  public static boolean enum_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_statement")) return false;
    if (!nextTokenIs(builder_, T_ENUM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ENUM);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && hh_type(builder_, level_ + 1);
    result_ = result_ && hh_opt_constraint(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && enum_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, ENUM_DECLARATION_STATEMENT, result_);
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
  // '(' ')'
  // | parenthesis_expr
  public static boolean exit_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exit_expr")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = exit_expr_0(builder_, level_ + 1);
    if (!result_) result_ = parenthesis_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXIT_EXPR, result_);
    return result_;
  }

  // '(' ')'
  private static boolean exit_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exit_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr_no_variable
  // | variable
  // | expr_with_parens
  public static boolean expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr>");
    result_ = expr_no_variable(builder_, level_ + 1);
    if (!result_) result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = expr_with_parens(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // expr (',' expr)*
  public static boolean expr_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr list>");
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && expr_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPR_LIST, result_, false, null);
    return result_;
  }

  // (',' expr)*
  private static boolean expr_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_list_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_list_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' expr
  private static boolean expr_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_LIST '(' assignment_list ')' '=' expr
  // | variable '=' expr
  // | variable '=' '&' variable
  // | variable '=' '&' T_NEW class_name_reference ctor_arguments
  // | variable T_PLUS_EQUAL expr
  // | variable T_MINUS_EQUAL expr
  // | variable T_MUL_EQUAL expr
  // | variable T_DIV_EQUAL expr
  // | variable T_CONCAT_EQUAL expr
  // | variable T_MOD_EQUAL expr
  // | variable T_AND_EQUAL expr
  // | variable T_OR_EQUAL expr
  // | variable T_XOR_EQUAL expr
  // | variable T_SL_EQUAL expr
  // | variable T_SR_EQUAL expr
  // | variable T_POW_EQUAL expr
  // | variable T_INC
  // | T_INC variable
  // | variable T_DEC
  // | T_DEC variable
  // | expr T_BOOLEAN_OR expr
  // | expr T_BOOLEAN_AND expr
  // | expr T_LOGICAL_OR expr
  // | expr T_LOGICAL_AND expr
  // | expr T_LOGICAL_XOR expr
  // | expr '|' expr
  // | expr '&' expr
  // | expr '^' expr
  // | expr '.' expr
  // | expr '+' expr
  // | expr '-' expr
  // | expr '*' expr
  // | expr '/' expr
  // | expr T_POW expr
  // | expr '%' expr
  // | expr T_SL expr
  // | expr T_SR expr
  // | '+' expr
  // | '-' expr
  // | '!' expr
  // | '~' expr
  // | expr T_IS_IDENTICAL expr
  // | expr T_IS_NOT_IDENTICAL expr
  // | expr T_IS_EQUAL expr
  // | expr T_IS_NOT_EQUAL expr
  // | expr '<' expr
  // | expr T_IS_SMALLER_OR_EQUAL expr
  // | expr '>' expr
  // | expr T_IS_GREATER_OR_EQUAL expr
  // | expr T_INSTANCEOF class_name_reference
  // | '(' expr_no_variable ')'
  // | expr '?' expr ':' expr
  // | expr '?' ':' expr
  // | internal_functions
  // | T_INT_CAST expr
  // | T_DOUBLE_CAST expr
  // | T_STRING_CAST expr
  // | T_ARRAY_CAST expr
  // | T_OBJECT_CAST expr
  // | T_BOOL_CAST expr
  // | T_UNSET_CAST expr
  // | T_EXIT exit_expr
  // | '@' expr
  // | scalar
  // | array_literal
  // | shape_literal
  // | map_array_literal
  // | varray_literal
  // | '`' backticks_expr '`'
  // | T_PRINT expr
  // | closure_expression
  // | lambda_expression
  // | dim_expr
  public static boolean expr_no_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr no variable>");
    result_ = expr_no_variable_0(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_1(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_2(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_3(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_4(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_5(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_6(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_7(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_8(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_9(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_10(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_11(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_12(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_13(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_14(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_15(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_16(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_17(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_18(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_19(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_20(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_21(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_22(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_23(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_24(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_25(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_26(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_27(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_28(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_29(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_30(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_31(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_32(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_33(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_34(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_35(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_36(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_37(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_38(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_39(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_40(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_41(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_42(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_43(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_44(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_45(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_46(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_47(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_48(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_49(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_50(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_51(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_52(builder_, level_ + 1);
    if (!result_) result_ = internal_functions(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_54(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_55(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_56(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_57(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_58(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_59(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_60(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_61(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_62(builder_, level_ + 1);
    if (!result_) result_ = scalar(builder_, level_ + 1);
    if (!result_) result_ = array_literal(builder_, level_ + 1);
    if (!result_) result_ = shape_literal(builder_, level_ + 1);
    if (!result_) result_ = map_array_literal(builder_, level_ + 1);
    if (!result_) result_ = varray_literal(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_68(builder_, level_ + 1);
    if (!result_) result_ = expr_no_variable_69(builder_, level_ + 1);
    if (!result_) result_ = closure_expression(builder_, level_ + 1);
    if (!result_) result_ = lambda_expression(builder_, level_ + 1);
    if (!result_) result_ = dim_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPR_NO_VARIABLE, result_, false, null);
    return result_;
  }

  // T_LIST '(' assignment_list ')' '=' expr
  private static boolean expr_no_variable_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LIST);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && assignment_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable '=' expr
  private static boolean expr_no_variable_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable '=' '&' variable
  private static boolean expr_no_variable_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && consumeToken(builder_, T_AND);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable '=' '&' T_NEW class_name_reference ctor_arguments
  private static boolean expr_no_variable_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && consumeToken(builder_, T_AND);
    result_ = result_ && consumeToken(builder_, T_NEW);
    result_ = result_ && class_name_reference(builder_, level_ + 1);
    result_ = result_ && ctor_arguments(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_PLUS_EQUAL expr
  private static boolean expr_no_variable_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_PLUS_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_MINUS_EQUAL expr
  private static boolean expr_no_variable_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MINUS_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_MUL_EQUAL expr
  private static boolean expr_no_variable_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MUL_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_DIV_EQUAL expr
  private static boolean expr_no_variable_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DIV_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_CONCAT_EQUAL expr
  private static boolean expr_no_variable_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_8")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_CONCAT_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_MOD_EQUAL expr
  private static boolean expr_no_variable_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_9")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MOD_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_AND_EQUAL expr
  private static boolean expr_no_variable_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_10")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AND_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_OR_EQUAL expr
  private static boolean expr_no_variable_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_11")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_OR_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_XOR_EQUAL expr
  private static boolean expr_no_variable_12(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_12")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_XOR_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_SL_EQUAL expr
  private static boolean expr_no_variable_13(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_13")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SL_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_SR_EQUAL expr
  private static boolean expr_no_variable_14(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_14")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SR_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_POW_EQUAL expr
  private static boolean expr_no_variable_15(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_15")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_POW_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_INC
  private static boolean expr_no_variable_16(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_16")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_INC);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_INC variable
  private static boolean expr_no_variable_17(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_17")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_INC);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_DEC
  private static boolean expr_no_variable_18(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_18")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DEC);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_DEC variable
  private static boolean expr_no_variable_19(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_19")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DEC);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_BOOLEAN_OR expr
  private static boolean expr_no_variable_20(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_20")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_BOOLEAN_OR);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_BOOLEAN_AND expr
  private static boolean expr_no_variable_21(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_21")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_BOOLEAN_AND);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_LOGICAL_OR expr
  private static boolean expr_no_variable_22(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_22")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LOGICAL_OR);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_LOGICAL_AND expr
  private static boolean expr_no_variable_23(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_23")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LOGICAL_AND);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_LOGICAL_XOR expr
  private static boolean expr_no_variable_24(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_24")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LOGICAL_XOR);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '|' expr
  private static boolean expr_no_variable_25(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_25")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_OR);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '&' expr
  private static boolean expr_no_variable_26(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_26")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AND);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '^' expr
  private static boolean expr_no_variable_27(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_27")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_XOR);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '.' expr
  private static boolean expr_no_variable_28(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_28")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOT);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '+' expr
  private static boolean expr_no_variable_29(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_29")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_PLUS);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '-' expr
  private static boolean expr_no_variable_30(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_30")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MINUS);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '*' expr
  private static boolean expr_no_variable_31(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_31")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MUL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '/' expr
  private static boolean expr_no_variable_32(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_32")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DIV);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_POW expr
  private static boolean expr_no_variable_33(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_33")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_POW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '%' expr
  private static boolean expr_no_variable_34(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_34")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MOD);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_SL expr
  private static boolean expr_no_variable_35(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_35")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_SR expr
  private static boolean expr_no_variable_36(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_36")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SR);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '+' expr
  private static boolean expr_no_variable_37(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_37")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_PLUS);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '-' expr
  private static boolean expr_no_variable_38(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_38")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MINUS);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '!' expr
  private static boolean expr_no_variable_39(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_39")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NEGATE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '~' expr
  private static boolean expr_no_variable_40(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_40")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NOT);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_IS_IDENTICAL expr
  private static boolean expr_no_variable_41(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_41")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_IDENTICAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_IS_NOT_IDENTICAL expr
  private static boolean expr_no_variable_42(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_42")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_NOT_IDENTICAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_IS_EQUAL expr
  private static boolean expr_no_variable_43(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_43")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_IS_NOT_EQUAL expr
  private static boolean expr_no_variable_44(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_44")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_NOT_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '<' expr
  private static boolean expr_no_variable_45(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_45")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LESS);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_IS_SMALLER_OR_EQUAL expr
  private static boolean expr_no_variable_46(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_46")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_SMALLER_OR_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '>' expr
  private static boolean expr_no_variable_47(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_47")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_GREATER);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_IS_GREATER_OR_EQUAL expr
  private static boolean expr_no_variable_48(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_48")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_GREATER_OR_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_INSTANCEOF class_name_reference
  private static boolean expr_no_variable_49(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_49")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_INSTANCEOF);
    result_ = result_ && class_name_reference(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_no_variable ')'
  private static boolean expr_no_variable_50(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_50")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_no_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '?' expr ':' expr
  private static boolean expr_no_variable_51(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_51")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_QUEST);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr '?' ':' expr
  private static boolean expr_no_variable_52(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_52")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_QUEST);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_INT_CAST expr
  private static boolean expr_no_variable_54(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_54")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_INT_CAST);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_DOUBLE_CAST expr
  private static boolean expr_no_variable_55(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_55")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOUBLE_CAST);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_STRING_CAST expr
  private static boolean expr_no_variable_56(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_56")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_STRING_CAST);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_ARRAY_CAST expr
  private static boolean expr_no_variable_57(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_57")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ARRAY_CAST);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_OBJECT_CAST expr
  private static boolean expr_no_variable_58(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_58")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_OBJECT_CAST);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_BOOL_CAST expr
  private static boolean expr_no_variable_59(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_59")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_BOOL_CAST);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_UNSET_CAST expr
  private static boolean expr_no_variable_60(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_60")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_UNSET_CAST);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_EXIT exit_expr
  private static boolean expr_no_variable_61(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_61")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EXIT);
    result_ = result_ && exit_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '@' expr
  private static boolean expr_no_variable_62(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_62")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SILENCE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '`' backticks_expr '`'
  private static boolean expr_no_variable_68(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_68")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "`");
    result_ = result_ && backticks_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "`");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_PRINT expr
  private static boolean expr_no_variable_69(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_no_variable_69")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_PRINT);
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
  // '(' expr_with_parens ')'
  // | T_NEW class_name_reference ctor_arguments
  // | T_CLONE expr
  // | xhp_tag
  // | collection_literal
  public static boolean expr_with_parens(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_with_parens")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr with parens>");
    result_ = expr_with_parens_0(builder_, level_ + 1);
    if (!result_) result_ = expr_with_parens_1(builder_, level_ + 1);
    if (!result_) result_ = expr_with_parens_2(builder_, level_ + 1);
    if (!result_) result_ = xhp_tag(builder_, level_ + 1);
    if (!result_) result_ = collection_literal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPR_WITH_PARENS, result_, false, null);
    return result_;
  }

  // '(' expr_with_parens ')'
  private static boolean expr_with_parens_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_with_parens_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_NEW class_name_reference ctor_arguments
  private static boolean expr_with_parens_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_with_parens_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NEW);
    result_ = result_ && class_name_reference(builder_, level_ + 1);
    result_ = result_ && ctor_arguments(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_CLONE expr
  private static boolean expr_with_parens_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_with_parens_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_CLONE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_EXTENDS fully_qualified_class_name
  public static boolean extends_from(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extends_from")) return false;
    if (!nextTokenIs(builder_, T_EXTENDS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EXTENDS);
    result_ = result_ && fully_qualified_class_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXTENDS_FROM, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{'  inner_statement_list '}'
  public static boolean finally_statement_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "finally_statement_list")) return false;
    if (!nextTokenIs(builder_, T_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, FINALLY_STATEMENT_LIST, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr_list
  public static boolean for_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<for expr>");
    result_ = expr_list(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FOR_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_FOR '(' for_expr ';' for_expr ';' for_expr ')'  for_statement_body
  public static boolean for_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement")) return false;
    if (!nextTokenIs(builder_, T_FOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_FOR);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && for_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    result_ = result_ && for_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    result_ = result_ && for_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && for_statement_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // statement
  // | ':' inner_statement_list T_ENDFOR ';'
  public static boolean for_statement_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<for statement body>");
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = for_statement_body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FOR_STATEMENT_BODY, result_, false, null);
    return result_;
  }

  // ':' inner_statement_list T_ENDFOR ';'
  private static boolean for_statement_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COLON);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ENDFOR);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_DOUBLE_ARROW foreach_variable
  public static boolean foreach_optional_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_optional_arg")) return false;
    if (!nextTokenIs(builder_, T_DOUBLE_ARROW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && foreach_variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOREACH_OPTIONAL_ARG, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_FOREACH '(' expr T_AWAIT? T_AS foreach_variable foreach_optional_arg ')'  foreach_statement_body
  public static boolean foreach_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement")) return false;
    if (!nextTokenIs(builder_, T_FOREACH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_FOREACH);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && foreach_statement_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AS);
    result_ = result_ && foreach_variable(builder_, level_ + 1);
    result_ = result_ && foreach_optional_arg(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && foreach_statement_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOREACH_STATEMENT, result_);
    return result_;
  }

  // T_AWAIT?
  private static boolean foreach_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_3")) return false;
    consumeToken(builder_, T_AWAIT);
    return true;
  }

  /* ********************************************************** */
  // statement
  // | ':' inner_statement_list T_ENDFOREACH ';'
  public static boolean foreach_statement_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<foreach statement body>");
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement_body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FOREACH_STATEMENT_BODY, result_, false, null);
    return result_;
  }

  // ':' inner_statement_list T_ENDFOREACH ';'
  private static boolean foreach_statement_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COLON);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ENDFOREACH);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable
  // | '&' variable
  // | T_LIST '(' assignment_list ')'
  public static boolean foreach_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<foreach variable>");
    result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = foreach_variable_1(builder_, level_ + 1);
    if (!result_) result_ = foreach_variable_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FOREACH_VARIABLE, result_, false, null);
    return result_;
  }

  // '&' variable
  private static boolean foreach_variable_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_variable_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AND);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_LIST '(' assignment_list ')'
  private static boolean foreach_variable_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_variable_2")) return false;
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
  // | T_XHP_LABEL
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
  // ';'
  // | '{' inner_statement_list '}'
  public static boolean function_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_body")) return false;
    if (!nextTokenIs(builder_, "<function body>", T_SEMICOLON, T_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function body>");
    result_ = consumeToken(builder_, T_SEMICOLON);
    if (!result_) result_ = function_body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FUNCTION_BODY, result_, false, null);
    return result_;
  }

  // '{' inner_statement_list '}'
  private static boolean function_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_fcall_parameter_list hh_possible_comma
  public static boolean function_call_parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_call_parameter_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function call parameter list>");
    result_ = non_empty_fcall_parameter_list(builder_, level_ + 1);
    result_ = result_ && hh_possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FUNCTION_CALL_PARAMETER_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // function_loc is_reference hh_name_with_typevar  '(' parameter_list ')' hh_opt_return_type function_body
  public static boolean function_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_statement")) return false;
    if (!nextTokenIs(builder_, T_FUNCTION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = function_loc(builder_, level_ + 1);
    result_ = result_ && is_reference(builder_, level_ + 1);
    result_ = result_ && hh_name_with_typevar(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && hh_opt_return_type(builder_, level_ + 1);
    result_ = result_ && function_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_DECLARATION_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_FUNCTION
  public static boolean function_loc(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_loc")) return false;
    if (!nextTokenIs(builder_, T_FUNCTION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_FUNCTION);
    exit_section_(builder_, marker_, FUNCTION_LOC, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_GLOBAL global_var_list ';'
  public static boolean global_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_statement")) return false;
    if (!nextTokenIs(builder_, T_GLOBAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_GLOBAL);
    result_ = result_ && global_var_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, GLOBAL_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_VARIABLE
  // | '$' variable
  // | '$' '{' expr '}'
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
  // global_var (',' global_var)*
  public static boolean global_var_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_var_list")) return false;
    if (!nextTokenIs(builder_, "<global var list>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<global var list>");
    result_ = global_var(builder_, level_ + 1);
    result_ = result_ && global_var_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, GLOBAL_VAR_LIST, result_, false, null);
    return result_;
  }

  // (',' global_var)*
  private static boolean global_var_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_var_list_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!global_var_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "global_var_list_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' global_var
  private static boolean global_var_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global_var_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && global_var(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_GOTO ident ';'
  public static boolean goto_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "goto_statement")) return false;
    if (!nextTokenIs(builder_, T_GOTO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_GOTO);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, GOTO_STATEMENT, result_);
    return result_;
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
  // T_OPEN_TAG top_statement_list
  static boolean hackFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hackFile")) return false;
    if (!nextTokenIs(builder_, T_OPEN_TAG)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_OPEN_TAG);
    result_ = result_ && top_statement_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_HALT_COMPILER '(' ')' ';'
  public static boolean halt_compiler_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "halt_compiler_statement")) return false;
    if (!nextTokenIs(builder_, T_HALT_COMPILER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_HALT_COMPILER);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, HALT_COMPILER_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_non_empty_type_list ',' "..."
  // | hh_type_list
  // | "..."
  public static boolean hh_func_type_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_func_type_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh func type list>");
    result_ = hh_func_type_list_0(builder_, level_ + 1);
    if (!result_) result_ = hh_type_list(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_ELLIPSIS);
    exit_section_(builder_, level_, marker_, HH_FUNC_TYPE_LIST, result_, false, null);
    return result_;
  }

  // hh_non_empty_type_list ',' "..."
  private static boolean hh_func_type_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_func_type_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_non_empty_type_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && consumeToken(builder_, T_ELLIPSIS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ident
  // | hh_type ident
  public static boolean hh_name_with_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_name_with_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh name with type>");
    result_ = ident(builder_, level_ + 1);
    if (!result_) result_ = hh_name_with_type_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_NAME_WITH_TYPE, result_, false, null);
    return result_;
  }

  // hh_type ident
  private static boolean hh_name_with_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_name_with_type_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_type(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ident
  // | ident T_TYPELIST_LT hh_typevar_list T_TYPELIST_GT
  public static boolean hh_name_with_typevar(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_name_with_typevar")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh name with typevar>");
    result_ = ident(builder_, level_ + 1);
    if (!result_) result_ = hh_name_with_typevar_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_NAME_WITH_TYPEVAR, result_, false, null);
    return result_;
  }

  // ident T_TYPELIST_LT hh_typevar_list T_TYPELIST_GT
  private static boolean hh_name_with_typevar_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_name_with_typevar_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_TYPELIST_LT);
    result_ = result_ && hh_typevar_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_TYPELIST_GT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_non_empty_shape_member_list ',' hh_shape_member_type
  // | hh_shape_member_type
  public static boolean hh_non_empty_shape_member_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_non_empty_shape_member_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh non empty shape member list>");
    result_ = hh_non_empty_shape_member_list_0(builder_, level_ + 1);
    if (!result_) result_ = hh_shape_member_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_NON_EMPTY_SHAPE_MEMBER_LIST, result_, false, null);
    return result_;
  }

  // hh_non_empty_shape_member_list ',' hh_shape_member_type
  private static boolean hh_non_empty_shape_member_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_non_empty_shape_member_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_non_empty_shape_member_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_shape_member_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_type
  // | hh_non_empty_type_list ',' hh_type
  public static boolean hh_non_empty_type_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_non_empty_type_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh non empty type list>");
    result_ = hh_type(builder_, level_ + 1);
    if (!result_) result_ = hh_non_empty_type_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_NON_EMPTY_TYPE_LIST, result_, false, null);
    return result_;
  }

  // hh_non_empty_type_list ',' hh_type
  private static boolean hh_non_empty_type_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_non_empty_type_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_non_empty_type_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '?' hh_type
  public static boolean hh_null_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_null_type")) return false;
    if (!nextTokenIs(builder_, T_QUEST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_QUEST);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, HH_NULL_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // | T_AS hh_type
  public static boolean hh_opt_constraint(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_opt_constraint")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh opt constraint>");
    result_ = consumeToken(builder_, HH_OPT_CONSTRAINT_0_0);
    if (!result_) result_ = hh_opt_constraint_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_OPT_CONSTRAINT, result_, false, null);
    return result_;
  }

  // T_AS hh_type
  private static boolean hh_opt_constraint_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_opt_constraint_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AS);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (':' hh_type)?
  public static boolean hh_opt_return_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_opt_return_type")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh opt return type>");
    hh_opt_return_type_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_OPT_RETURN_TYPE, true, false, null);
    return true;
  }

  // ':' hh_type
  private static boolean hh_opt_return_type_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_opt_return_type_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COLON);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ','?
  public static boolean hh_possible_comma(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_possible_comma")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh possible comma>");
    consumeToken(builder_, T_COMMA);
    exit_section_(builder_, level_, marker_, HH_POSSIBLE_COMMA, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // hh_non_empty_shape_member_list possible_comma
  public static boolean hh_shape_member_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_member_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh shape member list>");
    result_ = hh_non_empty_shape_member_list(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_SHAPE_MEMBER_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_CONSTANT_ENCAPSED_STRING T_DOUBLE_ARROW hh_type
  // | class_namespace_string_typeargs T_DOUBLE_COLON ident T_DOUBLE_ARROW hh_type
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

  // class_namespace_string_typeargs T_DOUBLE_COLON ident T_DOUBLE_ARROW hh_type
  private static boolean hh_shape_member_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_shape_member_type_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && ident(builder_, level_ + 1);
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
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SHAPE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && hh_shape_member_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, HH_SHAPE_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_null_type
  // | '@' hh_type
  // | class_namespace_string_typeargs
  // | T_ARRAY
  // | T_CALLABLE
  // | hh_shape_type
  // | T_ARRAY T_TYPELIST_LT hh_type T_TYPELIST_GT
  // | T_ARRAY T_TYPELIST_LT hh_type ',' hh_type T_TYPELIST_GT
  // | T_XHP_LABEL
  // | '(' T_FUNCTION '(' hh_func_type_list ')' ':' hh_type ')'
  // | '(' hh_type ',' hh_non_empty_type_list possible_comma ')'
  public static boolean hh_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh type>");
    result_ = hh_null_type(builder_, level_ + 1);
    if (!result_) result_ = hh_type_1(builder_, level_ + 1);
    if (!result_) result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_ARRAY);
    if (!result_) result_ = consumeToken(builder_, T_CALLABLE);
    if (!result_) result_ = hh_shape_type(builder_, level_ + 1);
    if (!result_) result_ = hh_type_6(builder_, level_ + 1);
    if (!result_) result_ = hh_type_7(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_XHP_LABEL);
    if (!result_) result_ = hh_type_9(builder_, level_ + 1);
    if (!result_) result_ = hh_type_10(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_TYPE, result_, false, null);
    return result_;
  }

  // '@' hh_type
  private static boolean hh_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SILENCE);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_ARRAY T_TYPELIST_LT hh_type T_TYPELIST_GT
  private static boolean hh_type_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_ARRAY, T_TYPELIST_LT);
    result_ = result_ && hh_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_TYPELIST_GT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_ARRAY T_TYPELIST_LT hh_type ',' hh_type T_TYPELIST_GT
  private static boolean hh_type_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_ARRAY, T_TYPELIST_LT);
    result_ = result_ && hh_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_TYPELIST_GT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' T_FUNCTION '(' hh_func_type_list ')' ':' hh_type ')'
  private static boolean hh_type_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_9")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && consumeToken(builder_, T_FUNCTION);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && hh_func_type_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && hh_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' hh_type ',' hh_non_empty_type_list possible_comma ')'
  private static boolean hh_type_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_10")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && hh_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_non_empty_type_list(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_TYPE hh_name_with_typevar '=' hh_type ';'
  // | T_NEWTYPE hh_name_with_typevar hh_opt_constraint '=' hh_type ';'
  public static boolean hh_type_alias_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_alias_statement")) return false;
    if (!nextTokenIs(builder_, "<hh type alias statement>", T_NEWTYPE, T_TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh type alias statement>");
    result_ = hh_type_alias_statement_0(builder_, level_ + 1);
    if (!result_) result_ = hh_type_alias_statement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_TYPE_ALIAS_STATEMENT, result_, false, null);
    return result_;
  }

  // T_TYPE hh_name_with_typevar '=' hh_type ';'
  private static boolean hh_type_alias_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_alias_statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_TYPE);
    result_ = result_ && hh_name_with_typevar(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && hh_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_NEWTYPE hh_name_with_typevar hh_opt_constraint '=' hh_type ';'
  private static boolean hh_type_alias_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_alias_statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NEWTYPE);
    result_ = result_ && hh_name_with_typevar(builder_, level_ + 1);
    result_ = result_ && hh_opt_constraint(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && hh_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_non_empty_type_list possible_comma
  public static boolean hh_type_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh type list>");
    result_ = hh_non_empty_type_list(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_TYPE_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // hh_type
  public static boolean hh_type_opt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_type_opt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh type opt>");
    result_ = hh_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_TYPE_OPT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_TYPELIST_LT hh_type_list T_TYPELIST_GT
  public static boolean hh_typeargs_opt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typeargs_opt")) return false;
    if (!nextTokenIs(builder_, T_TYPELIST_LT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_TYPELIST_LT);
    result_ = result_ && hh_type_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_TYPELIST_GT);
    exit_section_(builder_, marker_, HH_TYPEARGS_OPT, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_typevar_list ',' hh_typevar_variance ident
  // | hh_typevar_variance ident
  // | hh_typevar_list ',' hh_typevar_variance ident T_AS hh_type
  // | hh_typevar_variance ident T_AS hh_type
  public static boolean hh_typevar_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_list")) return false;
    if (!nextTokenIs(builder_, "<hh typevar list>", T_PLUS, T_MINUS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<hh typevar list>");
    result_ = hh_typevar_list_0(builder_, level_ + 1);
    if (!result_) result_ = hh_typevar_list_1(builder_, level_ + 1);
    if (!result_) result_ = hh_typevar_list_2(builder_, level_ + 1);
    if (!result_) result_ = hh_typevar_list_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, HH_TYPEVAR_LIST, result_, false, null);
    return result_;
  }

  // hh_typevar_list ',' hh_typevar_variance ident
  private static boolean hh_typevar_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_typevar_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_typevar_variance(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hh_typevar_variance ident
  private static boolean hh_typevar_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_typevar_variance(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hh_typevar_list ',' hh_typevar_variance ident T_AS hh_type
  private static boolean hh_typevar_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_list_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_typevar_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && hh_typevar_variance(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AS);
    result_ = result_ && hh_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hh_typevar_variance ident T_AS hh_type
  private static boolean hh_typevar_list_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hh_typevar_list_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hh_typevar_variance(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AS);
    result_ = result_ && hh_type(builder_, level_ + 1);
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
  // T_INLINE_HTML
  public static boolean html_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "html_statement")) return false;
    if (!nextTokenIs(builder_, T_INLINE_HTML)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_INLINE_HTML);
    exit_section_(builder_, marker_, HTML_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_STRING
  // | T_XHP_ATTRIBUTE
  // | T_XHP_CATEGORY
  // | T_XHP_CHILDREN
  // | T_XHP_REQUIRED
  // | T_ENUM
  // | T_WHERE
  // | T_JOIN
  // | T_ON
  // | T_IN
  // | T_EQUALS
  // | T_INTO
  // | T_LET
  // | T_ORDERBY
  // | T_ASCENDING
  // | T_DESCENDING
  // | T_SELECT
  // | T_GROUP
  // | T_BY
  public static boolean ident(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ident")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<ident>");
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
    exit_section_(builder_, level_, marker_, IDENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (T_IF parenthesis_expr statement elseif_list else_single)
  //         |  (T_IF parenthesis_expr ':' inner_statement_list new_elseif_list new_else_single T_ENDIF ';')
  public static boolean if_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement")) return false;
    if (!nextTokenIs(builder_, T_IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = if_statement_0(builder_, level_ + 1);
    if (!result_) result_ = if_statement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_STATEMENT, result_);
    return result_;
  }

  // T_IF parenthesis_expr statement elseif_list else_single
  private static boolean if_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_IF);
    result_ = result_ && parenthesis_expr(builder_, level_ + 1);
    result_ = result_ && statement(builder_, level_ + 1);
    result_ = result_ && elseif_list(builder_, level_ + 1);
    result_ = result_ && else_single(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_IF parenthesis_expr ':' inner_statement_list new_elseif_list new_else_single T_ENDIF ';'
  private static boolean if_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_IF);
    result_ = result_ && parenthesis_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && new_elseif_list(builder_, level_ + 1);
    result_ = result_ && new_else_single(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ENDIF);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_IMPLEMENTS interface_list
  public static boolean implements_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implements_list")) return false;
    if (!nextTokenIs(builder_, T_IMPLEMENTS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_IMPLEMENTS);
    result_ = result_ && interface_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, IMPLEMENTS_LIST, result_);
    return result_;
  }

  /* ********************************************************** */
  // statement
  // | function_declaration_statement
  // | class_declaration_statement
  // | trait_declaration_statement
  public static boolean inner_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inner_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<inner statement>");
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = function_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = class_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = trait_declaration_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INNER_STATEMENT, result_, false, null);
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
  // hh_name_with_typevar
  public static boolean interface_decl_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_decl_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<interface decl name>");
    result_ = hh_name_with_typevar(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INTERFACE_DECL_NAME, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_EXTENDS interface_list
  public static boolean interface_extends_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_extends_list")) return false;
    if (!nextTokenIs(builder_, T_EXTENDS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EXTENDS);
    result_ = result_ && interface_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, INTERFACE_EXTENDS_LIST, result_);
    return result_;
  }

  /* ********************************************************** */
  // fully_qualified_class_name
  // | interface_list ',' fully_qualified_class_name
  public static boolean interface_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<interface list>");
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    if (!result_) result_ = interface_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INTERFACE_LIST, result_, false, null);
    return result_;
  }

  // interface_list ',' fully_qualified_class_name
  private static boolean interface_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = interface_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && fully_qualified_class_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ISSET '(' variable_list ')'
  // | T_EMPTY '(' variable ')'
  // | T_EMPTY '(' expr_no_variable ')'
  // | T_EMPTY '(' expr_with_parens ')'
  // | T_INCLUDE expr
  // | T_INCLUDE_ONCE expr
  // | T_EVAL '(' expr ')'
  // | T_REQUIRE expr
  // | T_REQUIRE_ONCE expr
  public static boolean internal_functions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<internal functions>");
    result_ = internal_functions_0(builder_, level_ + 1);
    if (!result_) result_ = internal_functions_1(builder_, level_ + 1);
    if (!result_) result_ = internal_functions_2(builder_, level_ + 1);
    if (!result_) result_ = internal_functions_3(builder_, level_ + 1);
    if (!result_) result_ = internal_functions_4(builder_, level_ + 1);
    if (!result_) result_ = internal_functions_5(builder_, level_ + 1);
    if (!result_) result_ = internal_functions_6(builder_, level_ + 1);
    if (!result_) result_ = internal_functions_7(builder_, level_ + 1);
    if (!result_) result_ = internal_functions_8(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INTERNAL_FUNCTIONS, result_, false, null);
    return result_;
  }

  // T_ISSET '(' variable_list ')'
  private static boolean internal_functions_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ISSET);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && variable_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_EMPTY '(' variable ')'
  private static boolean internal_functions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EMPTY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_EMPTY '(' expr_no_variable ')'
  private static boolean internal_functions_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EMPTY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_no_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_EMPTY '(' expr_with_parens ')'
  private static boolean internal_functions_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EMPTY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_INCLUDE expr
  private static boolean internal_functions_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_INCLUDE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_INCLUDE_ONCE expr
  private static boolean internal_functions_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_INCLUDE_ONCE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_EVAL '(' expr ')'
  private static boolean internal_functions_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EVAL);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_REQUIRE expr
  private static boolean internal_functions_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_REQUIRE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_REQUIRE_ONCE expr
  private static boolean internal_functions_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_functions_8")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_REQUIRE_ONCE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '&'
  public static boolean is_reference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "is_reference")) return false;
    if (!nextTokenIs(builder_, T_AND)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AND);
    exit_section_(builder_, marker_, IS_REFERENCE, result_);
    return result_;
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
  // ident ':'
  public static boolean label_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<label statement>");
    result_ = ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COLON);
    exit_section_(builder_, level_, marker_, LABEL_STATEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_LAMBDA_ARROW expr
  // | T_LAMBDA_ARROW await_expr
  // | T_LAMBDA_ARROW '{' inner_statement_list '}'
  public static boolean lambda_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_body")) return false;
    if (!nextTokenIs(builder_, T_LAMBDA_ARROW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lambda_body_0(builder_, level_ + 1);
    if (!result_) result_ = lambda_body_1(builder_, level_ + 1);
    if (!result_) result_ = lambda_body_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, LAMBDA_BODY, result_);
    return result_;
  }

  // T_LAMBDA_ARROW expr
  private static boolean lambda_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LAMBDA_ARROW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_LAMBDA_ARROW await_expr
  private static boolean lambda_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LAMBDA_ARROW);
    result_ = result_ && await_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_LAMBDA_ARROW '{' inner_statement_list '}'
  private static boolean lambda_body_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_body_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LAMBDA_ARROW);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_VARIABLE  lambda_body
  public static boolean lambda_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression")) return false;
    if (!nextTokenIs(builder_, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARIABLE);
    result_ = result_ && lambda_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, LAMBDA_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_USE '(' lexical_var_list hh_possible_comma ')'
  public static boolean lambda_use_vars(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_use_vars")) return false;
    if (!nextTokenIs(builder_, T_USE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_USE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && lexical_var_list(builder_, level_ + 1);
    result_ = result_ && hh_possible_comma(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, LAMBDA_USE_VARS, result_);
    return result_;
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
  // lexical_var_list ',' T_VARIABLE
  // | lexical_var_list ',' '&' T_VARIABLE
  // | T_VARIABLE
  // | '&' T_VARIABLE
  public static boolean lexical_var_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list")) return false;
    if (!nextTokenIs(builder_, "<lexical var list>", T_AND, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<lexical var list>");
    result_ = lexical_var_list_0(builder_, level_ + 1);
    if (!result_) result_ = lexical_var_list_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = lexical_var_list_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LEXICAL_VAR_LIST, result_, false, null);
    return result_;
  }

  // lexical_var_list ',' T_VARIABLE
  private static boolean lexical_var_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lexical_var_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && consumeToken(builder_, T_VARIABLE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // lexical_var_list ',' '&' T_VARIABLE
  private static boolean lexical_var_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lexical_var_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && consumeToken(builder_, T_AND);
    result_ = result_ && consumeToken(builder_, T_VARIABLE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&' T_VARIABLE
  private static boolean lexical_var_list_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lexical_var_list_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AND);
    result_ = result_ && consumeToken(builder_, T_VARIABLE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_map_array_init possible_comma
  public static boolean map_array_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_array_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<map array init>");
    result_ = non_empty_map_array_init(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MAP_ARRAY_INIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_MIARRAY '(' map_array_init ')'
  // | T_MSARRAY '(' map_array_init ')'
  public static boolean map_array_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_array_literal")) return false;
    if (!nextTokenIs(builder_, "<map array literal>", T_MIARRAY, T_MSARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<map array literal>");
    result_ = map_array_literal_0(builder_, level_ + 1);
    if (!result_) result_ = map_array_literal_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MAP_ARRAY_LITERAL, result_, false, null);
    return result_;
  }

  // T_MIARRAY '(' map_array_init ')'
  private static boolean map_array_literal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_array_literal_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MIARRAY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && map_array_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_MSARRAY '(' map_array_init ')'
  private static boolean map_array_literal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_array_literal_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MSARRAY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && map_array_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_PUBLIC
  // | T_PROTECTED
  // | T_PRIVATE
  // | T_STATIC
  // | T_ABSTRACT
  // | T_FINAL
  // | T_ASYNC
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
  // ';'
  // | '{' inner_statement_list '}'
  public static boolean method_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_body")) return false;
    if (!nextTokenIs(builder_, "<method body>", T_SEMICOLON, T_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method body>");
    result_ = consumeToken(builder_, T_SEMICOLON);
    if (!result_) result_ = method_body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, METHOD_BODY, result_, false, null);
    return result_;
  }

  // '{' inner_statement_list '}'
  private static boolean method_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_member_modifiers
  public static boolean method_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method modifiers>");
    result_ = non_empty_member_modifiers(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, METHOD_MODIFIERS, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_NS_SEPARATOR? ident (T_NS_SEPARATOR ident)*
  public static boolean namespace_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<namespace name>");
    result_ = namespace_name_0(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && namespace_name_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NAMESPACE_NAME, result_, false, null);
    return result_;
  }

  // T_NS_SEPARATOR?
  private static boolean namespace_name_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_name_0")) return false;
    consumeToken(builder_, T_NS_SEPARATOR);
    return true;
  }

  // (T_NS_SEPARATOR ident)*
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

  // T_NS_SEPARATOR ident
  private static boolean namespace_name_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_name_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NS_SEPARATOR);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (T_NAMESPACE namespace_name ';')
  //         | (T_NAMESPACE namespace_name '{'  top_statement_list '}')
  //         | (T_NAMESPACE '{'  top_statement_list '}')
  public static boolean namespace_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_statement")) return false;
    if (!nextTokenIs(builder_, T_NAMESPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namespace_statement_0(builder_, level_ + 1);
    if (!result_) result_ = namespace_statement_1(builder_, level_ + 1);
    if (!result_) result_ = namespace_statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, NAMESPACE_STATEMENT, result_);
    return result_;
  }

  // T_NAMESPACE namespace_name ';'
  private static boolean namespace_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NAMESPACE);
    result_ = result_ && namespace_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_NAMESPACE namespace_name '{'  top_statement_list '}'
  private static boolean namespace_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NAMESPACE);
    result_ = result_ && namespace_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && top_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_NAMESPACE '{'  top_statement_list '}'
  private static boolean namespace_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_statement_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NAMESPACE);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && top_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // namespace_string_base
  public static boolean namespace_string(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<namespace string>");
    result_ = namespace_string_base(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NAMESPACE_STRING, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (T_NAMESPACE namespace_name)
  //         | namespace_name
  public static boolean namespace_string_base(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string_base")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<namespace string base>");
    result_ = namespace_string_base_0(builder_, level_ + 1);
    if (!result_) result_ = namespace_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NAMESPACE_STRING_BASE, result_, false, null);
    return result_;
  }

  // T_NAMESPACE namespace_name
  private static boolean namespace_string_base_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string_base_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NAMESPACE);
    result_ = result_ && namespace_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // namespace_string_base hh_typeargs_opt
  public static boolean namespace_string_typeargs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_string_typeargs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<namespace string typeargs>");
    result_ = namespace_string_base(builder_, level_ + 1);
    result_ = result_ && hh_typeargs_opt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NAMESPACE_STRING_TYPEARGS, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_ELSE ':' inner_statement_list
  public static boolean new_else_single(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_else_single")) return false;
    if (!nextTokenIs(builder_, T_ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ELSE);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, NEW_ELSE_SINGLE, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ELSEIF parenthesis_expr ':' inner_statement_list
  public static boolean new_elseif_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_elseif_body")) return false;
    if (!nextTokenIs(builder_, T_ELSEIF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ELSEIF);
    result_ = result_ && parenthesis_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, NEW_ELSEIF_BODY, result_);
    return result_;
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
  // non_empty_array_pair_list ',' expr T_DOUBLE_ARROW expr
  // | non_empty_array_pair_list ',' expr
  // | expr T_DOUBLE_ARROW expr
  // | expr
  // | non_empty_array_pair_list ',' expr T_DOUBLE_ARROW '&' variable
  // | non_empty_array_pair_list ',' '&' variable
  // | expr T_DOUBLE_ARROW '&' variable
  // | '&' variable
  public static boolean non_empty_array_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_array_pair_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty array pair list>");
    result_ = non_empty_array_pair_list_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_array_pair_list_1(builder_, level_ + 1);
    if (!result_) result_ = non_empty_array_pair_list_2(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = non_empty_array_pair_list_4(builder_, level_ + 1);
    if (!result_) result_ = non_empty_array_pair_list_5(builder_, level_ + 1);
    if (!result_) result_ = non_empty_array_pair_list_6(builder_, level_ + 1);
    if (!result_) result_ = non_empty_array_pair_list_7(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_ARRAY_PAIR_LIST, result_, false, null);
    return result_;
  }

  // non_empty_array_pair_list ',' expr T_DOUBLE_ARROW expr
  private static boolean non_empty_array_pair_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_array_pair_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // non_empty_array_pair_list ',' expr
  private static boolean non_empty_array_pair_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_array_pair_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_DOUBLE_ARROW expr
  private static boolean non_empty_array_pair_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_array_pair_list_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // non_empty_array_pair_list ',' expr T_DOUBLE_ARROW '&' variable
  private static boolean non_empty_array_pair_list_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_array_pair_list_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && consumeToken(builder_, T_AND);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // non_empty_array_pair_list ',' '&' variable
  private static boolean non_empty_array_pair_list_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_array_pair_list_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && consumeToken(builder_, T_AND);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_DOUBLE_ARROW '&' variable
  private static boolean non_empty_array_pair_list_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_array_pair_list_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && consumeToken(builder_, T_AND);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&' variable
  private static boolean non_empty_array_pair_list_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_array_pair_list_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AND);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_collection_init ',' expr T_DOUBLE_ARROW expr
  // | non_empty_collection_init ',' expr
  // | expr T_DOUBLE_ARROW expr
  // | expr
  public static boolean non_empty_collection_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_collection_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty collection init>");
    result_ = non_empty_collection_init_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_collection_init_1(builder_, level_ + 1);
    if (!result_) result_ = non_empty_collection_init_2(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_COLLECTION_INIT, result_, false, null);
    return result_;
  }

  // non_empty_collection_init ',' expr T_DOUBLE_ARROW expr
  private static boolean non_empty_collection_init_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_collection_init_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_collection_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // non_empty_collection_init ',' expr
  private static boolean non_empty_collection_init_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_collection_init_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_collection_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_DOUBLE_ARROW expr
  private static boolean non_empty_collection_init_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_collection_init_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr
  // | '&' variable
  // | "..." expr
  // | non_empty_fcall_parameter_list ',' expr
  // | non_empty_fcall_parameter_list ',' "..." expr
  // | non_empty_fcall_parameter_list ',' '&' variable
  public static boolean non_empty_fcall_parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_fcall_parameter_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty fcall parameter list>");
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = non_empty_fcall_parameter_list_1(builder_, level_ + 1);
    if (!result_) result_ = non_empty_fcall_parameter_list_2(builder_, level_ + 1);
    if (!result_) result_ = non_empty_fcall_parameter_list_3(builder_, level_ + 1);
    if (!result_) result_ = non_empty_fcall_parameter_list_4(builder_, level_ + 1);
    if (!result_) result_ = non_empty_fcall_parameter_list_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_FCALL_PARAMETER_LIST, result_, false, null);
    return result_;
  }

  // '&' variable
  private static boolean non_empty_fcall_parameter_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_fcall_parameter_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_AND);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "..." expr
  private static boolean non_empty_fcall_parameter_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_fcall_parameter_list_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ELLIPSIS);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // non_empty_fcall_parameter_list ',' expr
  private static boolean non_empty_fcall_parameter_list_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_fcall_parameter_list_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_fcall_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // non_empty_fcall_parameter_list ',' "..." expr
  private static boolean non_empty_fcall_parameter_list_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_fcall_parameter_list_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_fcall_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && consumeToken(builder_, T_ELLIPSIS);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // non_empty_fcall_parameter_list ',' '&' variable
  private static boolean non_empty_fcall_parameter_list_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_fcall_parameter_list_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_fcall_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && consumeToken(builder_, T_AND);
    result_ = result_ && variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_map_array_init ',' expr T_DOUBLE_ARROW expr
  // | expr T_DOUBLE_ARROW expr
  public static boolean non_empty_map_array_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_map_array_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty map array init>");
    result_ = non_empty_map_array_init_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_map_array_init_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_MAP_ARRAY_INIT, result_, false, null);
    return result_;
  }

  // non_empty_map_array_init ',' expr T_DOUBLE_ARROW expr
  private static boolean non_empty_map_array_init_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_map_array_init_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_map_array_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr T_DOUBLE_ARROW expr
  private static boolean non_empty_map_array_init_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_map_array_init_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // member_modifier
  // | non_empty_member_modifiers member_modifier
  public static boolean non_empty_member_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_member_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty member modifiers>");
    result_ = member_modifier(builder_, level_ + 1);
    if (!result_) result_ = non_empty_member_modifiers_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_MEMBER_MODIFIERS, result_, false, null);
    return result_;
  }

  // non_empty_member_modifiers member_modifier
  private static boolean non_empty_member_modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_member_modifiers_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_member_modifiers(builder_, level_ + 1);
    result_ = result_ && member_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_shape_pair_list ',' shape_keyname T_DOUBLE_ARROW expr
  // | shape_keyname T_DOUBLE_ARROW expr
  public static boolean non_empty_shape_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_shape_pair_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty shape pair list>");
    result_ = non_empty_shape_pair_list_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_shape_pair_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_SHAPE_PAIR_LIST, result_, false, null);
    return result_;
  }

  // non_empty_shape_pair_list ',' shape_keyname T_DOUBLE_ARROW expr
  private static boolean non_empty_shape_pair_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_shape_pair_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_shape_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && shape_keyname(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // shape_keyname T_DOUBLE_ARROW expr
  private static boolean non_empty_shape_pair_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_shape_pair_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = shape_keyname(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_array_pair_list ',' static_expr T_DOUBLE_ARROW static_expr
  // | non_empty_static_array_pair_list ',' static_expr
  // | static_expr T_DOUBLE_ARROW static_expr
  // | static_expr
  public static boolean non_empty_static_array_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_array_pair_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty static array pair list>");
    result_ = non_empty_static_array_pair_list_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_static_array_pair_list_1(builder_, level_ + 1);
    if (!result_) result_ = non_empty_static_array_pair_list_2(builder_, level_ + 1);
    if (!result_) result_ = static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_STATIC_ARRAY_PAIR_LIST, result_, false, null);
    return result_;
  }

  // non_empty_static_array_pair_list ',' static_expr T_DOUBLE_ARROW static_expr
  private static boolean non_empty_static_array_pair_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_array_pair_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // non_empty_static_array_pair_list ',' static_expr
  private static boolean non_empty_static_array_pair_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_array_pair_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_DOUBLE_ARROW static_expr
  private static boolean non_empty_static_array_pair_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_array_pair_list_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_array_pair_list_ae ',' static_scalar_ae T_DOUBLE_ARROW static_scalar_ae
  // | non_empty_static_array_pair_list_ae ',' static_scalar_ae
  // | static_scalar_ae T_DOUBLE_ARROW static_scalar_ae
  // | static_scalar_ae
  public static boolean non_empty_static_array_pair_list_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_array_pair_list_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty static array pair list ae>");
    result_ = non_empty_static_array_pair_list_ae_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_static_array_pair_list_ae_1(builder_, level_ + 1);
    if (!result_) result_ = non_empty_static_array_pair_list_ae_2(builder_, level_ + 1);
    if (!result_) result_ = static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_STATIC_ARRAY_PAIR_LIST_AE, result_, false, null);
    return result_;
  }

  // non_empty_static_array_pair_list_ae ',' static_scalar_ae T_DOUBLE_ARROW static_scalar_ae
  private static boolean non_empty_static_array_pair_list_ae_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_array_pair_list_ae_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_array_pair_list_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && static_scalar_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // non_empty_static_array_pair_list_ae ',' static_scalar_ae
  private static boolean non_empty_static_array_pair_list_ae_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_array_pair_list_ae_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_array_pair_list_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_scalar_ae T_DOUBLE_ARROW static_scalar_ae
  private static boolean non_empty_static_array_pair_list_ae_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_array_pair_list_ae_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_scalar_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_collection_init ',' static_expr T_DOUBLE_ARROW static_expr
  // | non_empty_static_collection_init ',' static_expr
  // | static_expr T_DOUBLE_ARROW static_expr
  // | static_expr
  public static boolean non_empty_static_collection_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_collection_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty static collection init>");
    result_ = non_empty_static_collection_init_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_static_collection_init_1(builder_, level_ + 1);
    if (!result_) result_ = non_empty_static_collection_init_2(builder_, level_ + 1);
    if (!result_) result_ = static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_STATIC_COLLECTION_INIT, result_, false, null);
    return result_;
  }

  // non_empty_static_collection_init ',' static_expr T_DOUBLE_ARROW static_expr
  private static boolean non_empty_static_collection_init_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_collection_init_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_collection_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // non_empty_static_collection_init ',' static_expr
  private static boolean non_empty_static_collection_init_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_collection_init_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_collection_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_DOUBLE_ARROW static_expr
  private static boolean non_empty_static_collection_init_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_collection_init_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_map_array_init ',' static_expr T_DOUBLE_ARROW static_expr
  // | static_expr T_DOUBLE_ARROW static_expr
  public static boolean non_empty_static_map_array_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_map_array_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty static map array init>");
    result_ = non_empty_static_map_array_init_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_static_map_array_init_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_STATIC_MAP_ARRAY_INIT, result_, false, null);
    return result_;
  }

  // non_empty_static_map_array_init ',' static_expr T_DOUBLE_ARROW static_expr
  private static boolean non_empty_static_map_array_init_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_map_array_init_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_map_array_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_DOUBLE_ARROW static_expr
  private static boolean non_empty_static_map_array_init_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_map_array_init_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_scalar_list_ae ',' static_scalar_ae
  // | static_scalar_ae
  public static boolean non_empty_static_scalar_list_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_scalar_list_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty static scalar list ae>");
    result_ = non_empty_static_scalar_list_ae_0(builder_, level_ + 1);
    if (!result_) result_ = static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_STATIC_SCALAR_LIST_AE, result_, false, null);
    return result_;
  }

  // non_empty_static_scalar_list_ae ',' static_scalar_ae
  private static boolean non_empty_static_scalar_list_ae_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_scalar_list_ae_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_scalar_list_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_shape_pair_list ',' shape_keyname T_DOUBLE_ARROW static_expr
  // | shape_keyname T_DOUBLE_ARROW static_expr
  public static boolean non_empty_static_shape_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_shape_pair_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty static shape pair list>");
    result_ = non_empty_static_shape_pair_list_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_static_shape_pair_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_STATIC_SHAPE_PAIR_LIST, result_, false, null);
    return result_;
  }

  // non_empty_static_shape_pair_list ',' shape_keyname T_DOUBLE_ARROW static_expr
  private static boolean non_empty_static_shape_pair_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_shape_pair_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_shape_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && shape_keyname(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // shape_keyname T_DOUBLE_ARROW static_expr
  private static boolean non_empty_static_shape_pair_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_shape_pair_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = shape_keyname(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_shape_pair_list_ae ',' shape_keyname T_DOUBLE_ARROW static_scalar_ae
  // | shape_keyname T_DOUBLE_ARROW static_scalar_ae
  public static boolean non_empty_static_shape_pair_list_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_shape_pair_list_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty static shape pair list ae>");
    result_ = non_empty_static_shape_pair_list_ae_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_static_shape_pair_list_ae_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_STATIC_SHAPE_PAIR_LIST_AE, result_, false, null);
    return result_;
  }

  // non_empty_static_shape_pair_list_ae ',' shape_keyname T_DOUBLE_ARROW static_scalar_ae
  private static boolean non_empty_static_shape_pair_list_ae_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_shape_pair_list_ae_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_shape_pair_list_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && shape_keyname(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // shape_keyname T_DOUBLE_ARROW static_scalar_ae
  private static boolean non_empty_static_shape_pair_list_ae_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_shape_pair_list_ae_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = shape_keyname(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
    result_ = result_ && static_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_varray_init ',' static_expr
  // | static_expr
  public static boolean non_empty_static_varray_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_varray_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty static varray init>");
    result_ = non_empty_static_varray_init_0(builder_, level_ + 1);
    if (!result_) result_ = static_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_STATIC_VARRAY_INIT, result_, false, null);
    return result_;
  }

  // non_empty_static_varray_init ',' static_expr
  private static boolean non_empty_static_varray_init_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_static_varray_init_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_static_varray_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_user_attribute_list ',' ident attribute_static_scalar_list
  // | ident attribute_static_scalar_list
  public static boolean non_empty_user_attribute_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_user_attribute_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty user attribute list>");
    result_ = non_empty_user_attribute_list_0(builder_, level_ + 1);
    if (!result_) result_ = non_empty_user_attribute_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_USER_ATTRIBUTE_LIST, result_, false, null);
    return result_;
  }

  // non_empty_user_attribute_list ',' ident attribute_static_scalar_list
  private static boolean non_empty_user_attribute_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_user_attribute_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_user_attribute_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && attribute_static_scalar_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ident attribute_static_scalar_list
  private static boolean non_empty_user_attribute_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_user_attribute_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ident(builder_, level_ + 1);
    result_ = result_ && attribute_static_scalar_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_SL user_attribute_list T_SR
  public static boolean non_empty_user_attributes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_user_attributes")) return false;
    if (!nextTokenIs(builder_, T_SL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SL);
    result_ = result_ && user_attribute_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SR);
    exit_section_(builder_, marker_, NON_EMPTY_USER_ATTRIBUTES, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_varray_init ',' expr
  // | expr
  public static boolean non_empty_varray_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_varray_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non empty varray init>");
    result_ = non_empty_varray_init_0(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NON_EMPTY_VARRAY_INIT, result_, false, null);
    return result_;
  }

  // non_empty_varray_init ',' expr
  private static boolean non_empty_varray_init_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_empty_varray_init_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_empty_varray_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable T_OBJECT_OPERATOR ident hh_typeargs_opt '(' function_call_parameter_list ')'
  // | variable T_OBJECT_OPERATOR variable_without_objects '(' function_call_parameter_list ')'
  // | variable T_OBJECT_OPERATOR '{' expr '}' '(' function_call_parameter_list ')'
  // | '(' expr_with_parens ')' T_OBJECT_OPERATOR ident hh_typeargs_opt '(' function_call_parameter_list ')'
  // | '(' expr_with_parens ')' T_OBJECT_OPERATOR variable_without_objects '(' function_call_parameter_list ')'
  // | '(' expr_with_parens ')' T_OBJECT_OPERATOR '{' expr '}' '(' function_call_parameter_list ')'
  public static boolean object_method_call(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_method_call")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<object method call>");
    result_ = object_method_call_0(builder_, level_ + 1);
    if (!result_) result_ = object_method_call_1(builder_, level_ + 1);
    if (!result_) result_ = object_method_call_2(builder_, level_ + 1);
    if (!result_) result_ = object_method_call_3(builder_, level_ + 1);
    if (!result_) result_ = object_method_call_4(builder_, level_ + 1);
    if (!result_) result_ = object_method_call_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, OBJECT_METHOD_CALL, result_, false, null);
    return result_;
  }

  // variable T_OBJECT_OPERATOR ident hh_typeargs_opt '(' function_call_parameter_list ')'
  private static boolean object_method_call_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_method_call_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && hh_typeargs_opt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_OBJECT_OPERATOR variable_without_objects '(' function_call_parameter_list ')'
  private static boolean object_method_call_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_method_call_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && variable_without_objects(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variable T_OBJECT_OPERATOR '{' expr '}' '(' function_call_parameter_list ')'
  private static boolean object_method_call_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_method_call_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' T_OBJECT_OPERATOR ident hh_typeargs_opt '(' function_call_parameter_list ')'
  private static boolean object_method_call_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_method_call_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && hh_typeargs_opt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' T_OBJECT_OPERATOR variable_without_objects '(' function_call_parameter_list ')'
  private static boolean object_method_call_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_method_call_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && variable_without_objects(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' T_OBJECT_OPERATOR '{' expr '}' '(' function_call_parameter_list ')'
  private static boolean object_method_call_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_method_call_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // try_finally?
  public static boolean optional_finally(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "optional_finally")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<optional finally>");
    try_finally(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, OPTIONAL_FINALLY, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // non_empty_user_attributes*
  public static boolean optional_user_attributes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "optional_user_attributes")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<optional user attributes>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!non_empty_user_attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "optional_user_attributes", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, OPTIONAL_USER_ATTRIBUTES, true, false, null);
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
  // expr
  // | expr ordering_direction
  public static boolean ordering(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ordering")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<ordering>");
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = ordering_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ORDERING, result_, false, null);
    return result_;
  }

  // expr ordering_direction
  private static boolean ordering_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ordering_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && ordering_direction(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ASCENDING
  // | T_DESCENDING
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
  // ordering
  // | orderings ',' ordering
  public static boolean orderings(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "orderings")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<orderings>");
    result_ = ordering(builder_, level_ + 1);
    if (!result_) result_ = orderings_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ORDERINGS, result_, false, null);
    return result_;
  }

  // orderings ',' ordering
  private static boolean orderings_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "orderings_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = orderings(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && ordering(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // optional_user_attributes parameter_modifiers hh_type_opt ('&'|"...")? T_VARIABLE ('=' static_expr)?
  public static boolean parameter_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter item>");
    result_ = optional_user_attributes(builder_, level_ + 1);
    result_ = result_ && parameter_modifiers(builder_, level_ + 1);
    result_ = result_ && hh_type_opt(builder_, level_ + 1);
    result_ = result_ && parameter_item_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_VARIABLE);
    result_ = result_ && parameter_item_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PARAMETER_ITEM, result_, false, null);
    return result_;
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
  // parameter_item (',' parameter_item)*  possible_comma
  public static boolean parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter list>");
    result_ = parameter_item(builder_, level_ + 1);
    result_ = result_ && parameter_list_1(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PARAMETER_LIST, result_, false, null);
    return result_;
  }

  // (',' parameter_item)*
  private static boolean parameter_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!parameter_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameter_list_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' parameter_item
  private static boolean parameter_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && parameter_item(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_PUBLIC
  // | T_PROTECTED
  // | T_PRIVATE
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
  // parameter_modifier
  public static boolean parameter_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter modifiers>");
    result_ = parameter_modifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PARAMETER_MODIFIERS, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '(' expr ')'
  public static boolean parenthesis_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenthesis_expr")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, PARENTHESIS_EXPR, result_);
    return result_;
  }

  /* ********************************************************** */
  // ','?
  public static boolean possible_comma(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "possible_comma")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<possible comma>");
    consumeToken(builder_, T_COMMA);
    exit_section_(builder_, level_, marker_, POSSIBLE_COMMA, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // property_access_without_variables
  // | T_OBJECT_OPERATOR variable_without_objects
  public static boolean property_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_access")) return false;
    if (!nextTokenIs(builder_, T_OBJECT_OPERATOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = property_access_without_variables(builder_, level_ + 1);
    if (!result_) result_ = property_access_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROPERTY_ACCESS, result_);
    return result_;
  }

  // T_OBJECT_OPERATOR variable_without_objects
  private static boolean property_access_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_access_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && variable_without_objects(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_OBJECT_OPERATOR ident
  // | T_OBJECT_OPERATOR '{' expr '}'
  public static boolean property_access_without_variables(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_access_without_variables")) return false;
    if (!nextTokenIs(builder_, T_OBJECT_OPERATOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = property_access_without_variables_0(builder_, level_ + 1);
    if (!result_) result_ = property_access_without_variables_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROPERTY_ACCESS_WITHOUT_VARIABLES, result_);
    return result_;
  }

  // T_OBJECT_OPERATOR ident
  private static boolean property_access_without_variables_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_access_without_variables_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_OBJECT_OPERATOR '{' expr '}'
  private static boolean property_access_without_variables_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_access_without_variables_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_OBJECT_OPERATOR);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
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
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<query assign expr>");
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && query_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, QUERY_ASSIGN_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // query_body_clauses select_or_group_clause
  // | query_body_clauses select_or_group_clause query_continuation
  // | select_or_group_clause
  // | select_or_group_clause query_continuation
  public static boolean query_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<query body>");
    result_ = query_body_0(builder_, level_ + 1);
    if (!result_) result_ = query_body_1(builder_, level_ + 1);
    if (!result_) result_ = select_or_group_clause(builder_, level_ + 1);
    if (!result_) result_ = query_body_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, QUERY_BODY, result_, false, null);
    return result_;
  }

  // query_body_clauses select_or_group_clause
  private static boolean query_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = query_body_clauses(builder_, level_ + 1);
    result_ = result_ && select_or_group_clause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // query_body_clauses select_or_group_clause query_continuation
  private static boolean query_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = query_body_clauses(builder_, level_ + 1);
    result_ = result_ && select_or_group_clause(builder_, level_ + 1);
    result_ = result_ && query_continuation(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // select_or_group_clause query_continuation
  private static boolean query_body_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = select_or_group_clause(builder_, level_ + 1);
    result_ = result_ && query_continuation(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // from_clause
  // | let_clause
  // | where_clause
  // | join_clause
  // | join_into_clause
  // | orderby_clause
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
  // query_body_clause
  // | query_body_clauses query_body_clause
  public static boolean query_body_clauses(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body_clauses")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<query body clauses>");
    result_ = query_body_clause(builder_, level_ + 1);
    if (!result_) result_ = query_body_clauses_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, QUERY_BODY_CLAUSES, result_, false, null);
    return result_;
  }

  // query_body_clauses query_body_clause
  private static boolean query_body_clauses_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "query_body_clauses_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = query_body_clauses(builder_, level_ + 1);
    result_ = result_ && query_body_clause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
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
  // reference_variable '[' dim_offset ']'
  // | reference_variable '{' expr '}'
  // | compound_variable
  public static boolean reference_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_variable")) return false;
    if (!nextTokenIs(builder_, "<reference variable>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<reference variable>");
    result_ = reference_variable_0(builder_, level_ + 1);
    if (!result_) result_ = reference_variable_1(builder_, level_ + 1);
    if (!result_) result_ = compound_variable(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, REFERENCE_VARIABLE, result_, false, null);
    return result_;
  }

  // reference_variable '[' dim_offset ']'
  private static boolean reference_variable_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_variable_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = reference_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACKET);
    result_ = result_ && dim_offset(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // reference_variable '{' expr '}'
  private static boolean reference_variable_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reference_variable_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = reference_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
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
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_RETURN);
    result_ = result_ && return_statement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, RETURN_STATEMENT, result_);
    return result_;
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
  // namespace_string
  // | T_STRING_VARNAME
  // | class_constant
  // | common_scalar
  // | '"' encaps_list '"'
  // | "'" encaps_list "'"
  // | T_START_HEREDOC encaps_list T_END_HEREDOC
  public static boolean scalar(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scalar")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<scalar>");
    result_ = namespace_string(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_STRING_VARNAME);
    if (!result_) result_ = class_constant(builder_, level_ + 1);
    if (!result_) result_ = common_scalar(builder_, level_ + 1);
    if (!result_) result_ = scalar_4(builder_, level_ + 1);
    if (!result_) result_ = scalar_5(builder_, level_ + 1);
    if (!result_) result_ = scalar_6(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SCALAR, result_, false, null);
    return result_;
  }

  // '"' encaps_list '"'
  private static boolean scalar_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scalar_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOUBLE_QUOTE);
    result_ = result_ && encaps_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_QUOTE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "'" encaps_list "'"
  private static boolean scalar_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scalar_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SINGLE_QUOTE);
    result_ = result_ && encaps_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SINGLE_QUOTE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_START_HEREDOC encaps_list T_END_HEREDOC
  private static boolean scalar_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scalar_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_START_HEREDOC);
    result_ = result_ && encaps_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_END_HEREDOC);
    exit_section_(builder_, marker_, null, result_);
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
  // select_clause
  // | group_clause
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
  // T_CONSTANT_ENCAPSED_STRING
  // | class_constant
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
  public static boolean shape_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_literal")) return false;
    if (!nextTokenIs(builder_, T_SHAPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SHAPE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && shape_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, SHAPE_LITERAL, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_shape_pair_list possible_comma
  public static boolean shape_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shape_pair_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<shape pair list>");
    result_ = non_empty_shape_pair_list(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SHAPE_PAIR_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // namespace_string_typeargs '(' function_call_parameter_list ')'
  public static boolean simple_function_call(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_function_call")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<simple function call>");
    result_ = namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, level_, marker_, SIMPLE_FUNCTION_CALL, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '$'
  // | simple_indirect_reference '$'
  public static boolean simple_indirect_reference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_indirect_reference")) return false;
    if (!nextTokenIs(builder_, T_DOLLAR_SIGN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_DOLLAR_SIGN);
    if (!result_) result_ = simple_indirect_reference_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, SIMPLE_INDIRECT_REFERENCE, result_);
    return result_;
  }

  // simple_indirect_reference '$'
  private static boolean simple_indirect_reference_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_indirect_reference_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = simple_indirect_reference(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOLLAR_SIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ('{' inner_statement_list '}')
  // | if_statement
  // | while_statement
  // | do_while_statement
  // | for_statement
  // | switch_statement
  // | break_statement
  // | continue_statement
  // | return_statement
  // | yield_statement
  // | global_statement
  // | static_statement
  // | echo_statement
  // | unset_statement
  // | ';'
  // | html_statement
  // | foreach_statement
  // | declare_statement
  // | try_statement
  // | throw_statement
  // | goto_statement
  // | expr_statement
  // | label_statement
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<statement>");
    result_ = statement_0(builder_, level_ + 1);
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
    if (!result_) result_ = static_statement(builder_, level_ + 1);
    if (!result_) result_ = echo_statement(builder_, level_ + 1);
    if (!result_) result_ = unset_statement(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_SEMICOLON);
    if (!result_) result_ = html_statement(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement(builder_, level_ + 1);
    if (!result_) result_ = declare_statement(builder_, level_ + 1);
    if (!result_) result_ = try_statement(builder_, level_ + 1);
    if (!result_) result_ = throw_statement(builder_, level_ + 1);
    if (!result_) result_ = goto_statement(builder_, level_ + 1);
    if (!result_) result_ = expr_statement(builder_, level_ + 1);
    if (!result_) result_ = label_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATEMENT, result_, false, null);
    return result_;
  }

  // '{' inner_statement_list '}'
  private static boolean statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_array_pair_list possible_comma
  public static boolean static_array_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static array pair list>");
    result_ = non_empty_static_array_pair_list(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_ARRAY_PAIR_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_array_pair_list_ae possible_comma
  public static boolean static_array_pair_list_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_array_pair_list_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static array pair list ae>");
    result_ = non_empty_static_array_pair_list_ae(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_ARRAY_PAIR_LIST_AE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_VARIABLE '=' static_expr
  static boolean static_assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_assignment")) return false;
    if (!nextTokenIs(builder_, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARIABLE);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs T_DOUBLE_COLON ident
  // | T_XHP_LABEL T_DOUBLE_COLON ident
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

  // class_namespace_string_typeargs T_DOUBLE_COLON ident
  private static boolean static_class_constant_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_class_constant_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_XHP_LABEL T_DOUBLE_COLON ident
  private static boolean static_class_constant_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_class_constant_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_XHP_LABEL, T_DOUBLE_COLON);
    result_ = result_ && ident(builder_, level_ + 1);
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
  // | T_STATIC
  // | reference_variable
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
  // non_empty_static_collection_init possible_comma
  public static boolean static_collection_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_collection_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static collection init>");
    result_ = non_empty_static_collection_init(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_COLLECTION_INIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // fully_qualified_class_name '{' static_collection_init '}'
  public static boolean static_collection_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_collection_literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static collection literal>");
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && static_collection_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, level_, marker_, STATIC_COLLECTION_LITERAL, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // common_scalar
  // | namespace_string
  // | T_ARRAY '(' static_array_pair_list ')'
  // | '[' static_array_pair_list ']'
  // | T_SHAPE '(' static_shape_pair_list ')'
  // | static_class_constant
  // | static_collection_literal
  // | static_map_array_literal
  // | static_varray_literal
  // | '(' static_expr ')'
  // | static_expr T_BOOLEAN_OR static_expr
  // | static_expr T_BOOLEAN_AND static_expr
  // | static_expr T_LOGICAL_OR static_expr
  // | static_expr T_LOGICAL_AND static_expr
  // | static_expr T_LOGICAL_XOR static_expr
  // | static_expr '|' static_expr
  // | static_expr '&' static_expr
  // | static_expr '^' static_expr
  // | static_expr '.' static_expr
  // | static_expr '+' static_expr
  // | static_expr '-' static_expr
  // | static_expr '*' static_expr
  // | static_expr '/' static_expr
  // | static_expr '%' static_expr
  // | static_expr T_SL static_expr
  // | static_expr T_SR static_expr
  // | static_expr T_POW static_expr
  // | '!' static_expr
  // | '~' static_expr
  // | '+' static_expr
  // | '-' static_expr
  // | static_expr T_IS_IDENTICAL static_expr
  // | static_expr T_IS_NOT_IDENTICAL static_expr
  // | static_expr T_IS_EQUAL static_expr
  // | static_expr T_IS_NOT_EQUAL static_expr
  // | static_expr '<' static_expr
  // | static_expr T_IS_SMALLER_OR_EQUAL static_expr
  // | static_expr '>' static_expr
  // | static_expr T_IS_GREATER_OR_EQUAL static_expr
  // | static_expr '?' static_expr ':' static_expr
  // | static_expr '?' ':' static_expr
  public static boolean static_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static expr>");
    result_ = common_scalar(builder_, level_ + 1);
    if (!result_) result_ = namespace_string(builder_, level_ + 1);
    if (!result_) result_ = static_expr_2(builder_, level_ + 1);
    if (!result_) result_ = static_expr_3(builder_, level_ + 1);
    if (!result_) result_ = static_expr_4(builder_, level_ + 1);
    if (!result_) result_ = static_class_constant(builder_, level_ + 1);
    if (!result_) result_ = static_collection_literal(builder_, level_ + 1);
    if (!result_) result_ = static_map_array_literal(builder_, level_ + 1);
    if (!result_) result_ = static_varray_literal(builder_, level_ + 1);
    if (!result_) result_ = static_expr_9(builder_, level_ + 1);
    if (!result_) result_ = static_expr_10(builder_, level_ + 1);
    if (!result_) result_ = static_expr_11(builder_, level_ + 1);
    if (!result_) result_ = static_expr_12(builder_, level_ + 1);
    if (!result_) result_ = static_expr_13(builder_, level_ + 1);
    if (!result_) result_ = static_expr_14(builder_, level_ + 1);
    if (!result_) result_ = static_expr_15(builder_, level_ + 1);
    if (!result_) result_ = static_expr_16(builder_, level_ + 1);
    if (!result_) result_ = static_expr_17(builder_, level_ + 1);
    if (!result_) result_ = static_expr_18(builder_, level_ + 1);
    if (!result_) result_ = static_expr_19(builder_, level_ + 1);
    if (!result_) result_ = static_expr_20(builder_, level_ + 1);
    if (!result_) result_ = static_expr_21(builder_, level_ + 1);
    if (!result_) result_ = static_expr_22(builder_, level_ + 1);
    if (!result_) result_ = static_expr_23(builder_, level_ + 1);
    if (!result_) result_ = static_expr_24(builder_, level_ + 1);
    if (!result_) result_ = static_expr_25(builder_, level_ + 1);
    if (!result_) result_ = static_expr_26(builder_, level_ + 1);
    if (!result_) result_ = static_expr_27(builder_, level_ + 1);
    if (!result_) result_ = static_expr_28(builder_, level_ + 1);
    if (!result_) result_ = static_expr_29(builder_, level_ + 1);
    if (!result_) result_ = static_expr_30(builder_, level_ + 1);
    if (!result_) result_ = static_expr_31(builder_, level_ + 1);
    if (!result_) result_ = static_expr_32(builder_, level_ + 1);
    if (!result_) result_ = static_expr_33(builder_, level_ + 1);
    if (!result_) result_ = static_expr_34(builder_, level_ + 1);
    if (!result_) result_ = static_expr_35(builder_, level_ + 1);
    if (!result_) result_ = static_expr_36(builder_, level_ + 1);
    if (!result_) result_ = static_expr_37(builder_, level_ + 1);
    if (!result_) result_ = static_expr_38(builder_, level_ + 1);
    if (!result_) result_ = static_expr_39(builder_, level_ + 1);
    if (!result_) result_ = static_expr_40(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_EXPR, result_, false, null);
    return result_;
  }

  // T_ARRAY '(' static_array_pair_list ')'
  private static boolean static_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_2")) return false;
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
  private static boolean static_expr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACKET);
    result_ = result_ && static_array_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_SHAPE '(' static_shape_pair_list ')'
  private static boolean static_expr_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SHAPE);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && static_shape_pair_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' static_expr ')'
  private static boolean static_expr_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_9")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_BOOLEAN_OR static_expr
  private static boolean static_expr_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_10")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_BOOLEAN_OR);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_BOOLEAN_AND static_expr
  private static boolean static_expr_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_11")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_BOOLEAN_AND);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_LOGICAL_OR static_expr
  private static boolean static_expr_12(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_12")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LOGICAL_OR);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_LOGICAL_AND static_expr
  private static boolean static_expr_13(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_13")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LOGICAL_AND);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_LOGICAL_XOR static_expr
  private static boolean static_expr_14(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_14")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LOGICAL_XOR);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '|' static_expr
  private static boolean static_expr_15(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_15")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_OR);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '&' static_expr
  private static boolean static_expr_16(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_16")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AND);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '^' static_expr
  private static boolean static_expr_17(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_17")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_XOR);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '.' static_expr
  private static boolean static_expr_18(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_18")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOT);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '+' static_expr
  private static boolean static_expr_19(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_19")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_PLUS);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '-' static_expr
  private static boolean static_expr_20(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_20")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MINUS);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '*' static_expr
  private static boolean static_expr_21(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_21")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MUL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '/' static_expr
  private static boolean static_expr_22(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_22")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DIV);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '%' static_expr
  private static boolean static_expr_23(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_23")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MOD);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_SL static_expr
  private static boolean static_expr_24(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_24")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_SR static_expr
  private static boolean static_expr_25(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_25")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SR);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_POW static_expr
  private static boolean static_expr_26(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_26")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_POW);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '!' static_expr
  private static boolean static_expr_27(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_27")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NEGATE);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '~' static_expr
  private static boolean static_expr_28(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_28")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_NOT);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '+' static_expr
  private static boolean static_expr_29(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_29")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_PLUS);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '-' static_expr
  private static boolean static_expr_30(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_30")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MINUS);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_IS_IDENTICAL static_expr
  private static boolean static_expr_31(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_31")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_IDENTICAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_IS_NOT_IDENTICAL static_expr
  private static boolean static_expr_32(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_32")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_NOT_IDENTICAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_IS_EQUAL static_expr
  private static boolean static_expr_33(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_33")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_IS_NOT_EQUAL static_expr
  private static boolean static_expr_34(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_34")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_NOT_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '<' static_expr
  private static boolean static_expr_35(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_35")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LESS);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_IS_SMALLER_OR_EQUAL static_expr
  private static boolean static_expr_36(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_36")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_SMALLER_OR_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '>' static_expr
  private static boolean static_expr_37(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_37")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_GREATER);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr T_IS_GREATER_OR_EQUAL static_expr
  private static boolean static_expr_38(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_38")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_IS_GREATER_OR_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '?' static_expr ':' static_expr
  private static boolean static_expr_39(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_39")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_QUEST);
    result_ = result_ && static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_expr '?' ':' static_expr
  private static boolean static_expr_40(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_expr_40")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_QUEST);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_map_array_init possible_comma
  public static boolean static_map_array_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_map_array_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static map array init>");
    result_ = non_empty_static_map_array_init(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_MAP_ARRAY_INIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_MIARRAY '(' static_map_array_init ')'
  // | T_MSARRAY '(' static_map_array_init ')'
  public static boolean static_map_array_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_map_array_literal")) return false;
    if (!nextTokenIs(builder_, "<static map array literal>", T_MIARRAY, T_MSARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static map array literal>");
    result_ = static_map_array_literal_0(builder_, level_ + 1);
    if (!result_) result_ = static_map_array_literal_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_MAP_ARRAY_LITERAL, result_, false, null);
    return result_;
  }

  // T_MIARRAY '(' static_map_array_init ')'
  private static boolean static_map_array_literal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_map_array_literal_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MIARRAY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && static_map_array_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_MSARRAY '(' static_map_array_init ')'
  private static boolean static_map_array_literal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_map_array_literal_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MSARRAY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && static_map_array_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_LNUMBER
  // | T_DNUMBER
  // | T_ONUMBER
  // | ident
  public static boolean static_numeric_scalar_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_numeric_scalar_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static numeric scalar ae>");
    result_ = consumeToken(builder_, T_LNUMBER);
    if (!result_) result_ = consumeToken(builder_, T_DNUMBER);
    if (!result_) result_ = consumeToken(builder_, T_ONUMBER);
    if (!result_) result_ = ident(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_NUMERIC_SCALAR_AE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // common_scalar_ae
  // | ident
  // | '+' static_numeric_scalar_ae
  // | '-' static_numeric_scalar_ae
  // | T_ARRAY '(' static_array_pair_list_ae ')'
  // | '[' static_array_pair_list_ae ']'
  // | T_SHAPE '(' static_shape_pair_list_ae ')'
  public static boolean static_scalar_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static scalar ae>");
    result_ = common_scalar_ae(builder_, level_ + 1);
    if (!result_) result_ = ident(builder_, level_ + 1);
    if (!result_) result_ = static_scalar_ae_2(builder_, level_ + 1);
    if (!result_) result_ = static_scalar_ae_3(builder_, level_ + 1);
    if (!result_) result_ = static_scalar_ae_4(builder_, level_ + 1);
    if (!result_) result_ = static_scalar_ae_5(builder_, level_ + 1);
    if (!result_) result_ = static_scalar_ae_6(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_SCALAR_AE, result_, false, null);
    return result_;
  }

  // '+' static_numeric_scalar_ae
  private static boolean static_scalar_ae_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_ae_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_PLUS);
    result_ = result_ && static_numeric_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '-' static_numeric_scalar_ae
  private static boolean static_scalar_ae_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_ae_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_MINUS);
    result_ = result_ && static_numeric_scalar_ae(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_ARRAY '(' static_array_pair_list_ae ')'
  private static boolean static_scalar_ae_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_ae_4")) return false;
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
  private static boolean static_scalar_ae_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_ae_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACKET);
    result_ = result_ && static_array_pair_list_ae(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_SHAPE '(' static_shape_pair_list_ae ')'
  private static boolean static_scalar_ae_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_ae_6")) return false;
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
  // non_empty_static_scalar_list_ae possible_comma
  public static boolean static_scalar_list_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_scalar_list_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static scalar list ae>");
    result_ = non_empty_static_scalar_list_ae(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_SCALAR_LIST_AE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_shape_pair_list possible_comma
  public static boolean static_shape_pair_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static shape pair list>");
    result_ = non_empty_static_shape_pair_list(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_SHAPE_PAIR_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_shape_pair_list_ae possible_comma
  public static boolean static_shape_pair_list_ae(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_shape_pair_list_ae")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static shape pair list ae>");
    result_ = non_empty_static_shape_pair_list_ae(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_SHAPE_PAIR_LIST_AE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_STATIC static_var_list ';'
  public static boolean static_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_statement")) return false;
    if (!nextTokenIs(builder_, T_STATIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_STATIC);
    result_ = result_ && static_var_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, STATIC_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (T_VARIABLE | static_assignment) (',' (T_VARIABLE|static_assignment))*
  public static boolean static_var_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list")) return false;
    if (!nextTokenIs(builder_, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_var_list_0(builder_, level_ + 1);
    result_ = result_ && static_var_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATIC_VAR_LIST, result_);
    return result_;
  }

  // T_VARIABLE | static_assignment
  private static boolean static_var_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = static_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' (T_VARIABLE|static_assignment))*
  private static boolean static_var_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_var_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_var_list_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' (T_VARIABLE|static_assignment)
  private static boolean static_var_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && static_var_list_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_VARIABLE|static_assignment
  private static boolean static_var_list_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_var_list_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARIABLE);
    if (!result_) result_ = static_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_static_varray_init possible_comma
  public static boolean static_varray_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_varray_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static varray init>");
    result_ = non_empty_static_varray_init(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATIC_VARRAY_INIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_VARRAY '(' static_varray_init ')'
  public static boolean static_varray_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_varray_literal")) return false;
    if (!nextTokenIs(builder_, T_VARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARRAY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && static_varray_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, STATIC_VARRAY_LITERAL, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' case_list '}'
  // | '{' ';' case_list '}'
  // | ':' case_list T_ENDSWITCH ';'
  // | ':' ';' case_list T_ENDSWITCH ';'
  public static boolean switch_case_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_list")) return false;
    if (!nextTokenIs(builder_, "<switch case list>", T_COLON, T_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<switch case list>");
    result_ = switch_case_list_0(builder_, level_ + 1);
    if (!result_) result_ = switch_case_list_1(builder_, level_ + 1);
    if (!result_) result_ = switch_case_list_2(builder_, level_ + 1);
    if (!result_) result_ = switch_case_list_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SWITCH_CASE_LIST, result_, false, null);
    return result_;
  }

  // '{' case_list '}'
  private static boolean switch_case_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && case_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' ';' case_list '}'
  private static boolean switch_case_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    result_ = result_ && case_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ':' case_list T_ENDSWITCH ';'
  private static boolean switch_case_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_list_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COLON);
    result_ = result_ && case_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ENDSWITCH);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ':' ';' case_list T_ENDSWITCH ';'
  private static boolean switch_case_list_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_list_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COLON);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    result_ = result_ && case_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ENDSWITCH);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_SWITCH parenthesis_expr  switch_case_list
  public static boolean switch_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_statement")) return false;
    if (!nextTokenIs(builder_, T_SWITCH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_SWITCH);
    result_ = result_ && parenthesis_expr(builder_, level_ + 1);
    result_ = result_ && switch_case_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, SWITCH_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_THROW expr ';'
  public static boolean throw_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throw_statement")) return false;
    if (!nextTokenIs(builder_, T_THROW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_THROW);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, THROW_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( statement
  //                        | function_declaration_statement
  //                        | class_declaration_statement
  //                        | enum_declaration_statement
  //                        | trait_declaration_statement
  //                        | hh_type_alias_statement
  //                        | halt_compiler_statement
  //                        | namespace_statement
  //                        | use_statement
  //                        | constant_declaration_statement)*
  public static boolean top_statement_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "top_statement_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<top statement list>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!top_statement_list_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "top_statement_list", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, TOP_STATEMENT_LIST, true, false, null);
    return true;
  }

  // statement
  //                        | function_declaration_statement
  //                        | class_declaration_statement
  //                        | enum_declaration_statement
  //                        | trait_declaration_statement
  //                        | hh_type_alias_statement
  //                        | halt_compiler_statement
  //                        | namespace_statement
  //                        | use_statement
  //                        | constant_declaration_statement
  private static boolean top_statement_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "top_statement_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = function_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = class_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = enum_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = trait_declaration_statement(builder_, level_ + 1);
    if (!result_) result_ = hh_type_alias_statement(builder_, level_ + 1);
    if (!result_) result_ = halt_compiler_statement(builder_, level_ + 1);
    if (!result_) result_ = namespace_statement(builder_, level_ + 1);
    if (!result_) result_ = use_statement(builder_, level_ + 1);
    if (!result_) result_ = constant_declaration_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // trait_alias_rule_method T_AS method_modifiers ident ';'
  // | trait_alias_rule_method T_AS non_empty_member_modifiers ';'
  public static boolean trait_alias_rule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait alias rule>");
    result_ = trait_alias_rule_0(builder_, level_ + 1);
    if (!result_) result_ = trait_alias_rule_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TRAIT_ALIAS_RULE, result_, false, null);
    return result_;
  }

  // trait_alias_rule_method T_AS method_modifiers ident ';'
  private static boolean trait_alias_rule_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = trait_alias_rule_method(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AS);
    result_ = result_ && method_modifiers(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // trait_alias_rule_method T_AS non_empty_member_modifiers ';'
  private static boolean trait_alias_rule_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = trait_alias_rule_method(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AS);
    result_ = result_ && non_empty_member_modifiers(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs T_DOUBLE_COLON ident
  // | ident
  public static boolean trait_alias_rule_method(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule_method")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait alias rule method>");
    result_ = trait_alias_rule_method_0(builder_, level_ + 1);
    if (!result_) result_ = ident(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TRAIT_ALIAS_RULE_METHOD, result_, false, null);
    return result_;
  }

  // class_namespace_string_typeargs T_DOUBLE_COLON ident
  private static boolean trait_alias_rule_method_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_alias_rule_method_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // hh_name_with_typevar
  public static boolean trait_decl_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_decl_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait decl name>");
    result_ = hh_name_with_typevar(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TRAIT_DECL_NAME, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_TRAIT trait_decl_name  implements_list '{' class_statement_list '}'
  public static boolean trait_declaration_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_declaration_statement")) return false;
    if (!nextTokenIs(builder_, T_TRAIT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_TRAIT);
    result_ = result_ && trait_decl_name(builder_, level_ + 1);
    result_ = result_ && implements_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && class_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, TRAIT_DECLARATION_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // fully_qualified_class_name
  // | trait_list ',' fully_qualified_class_name
  public static boolean trait_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait list>");
    result_ = fully_qualified_class_name(builder_, level_ + 1);
    if (!result_) result_ = trait_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TRAIT_LIST, result_, false, null);
    return result_;
  }

  // trait_list ',' fully_qualified_class_name
  private static boolean trait_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = trait_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && fully_qualified_class_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // class_namespace_string_typeargs T_DOUBLE_COLON ident T_INSTEADOF trait_list ';'
  public static boolean trait_precedence_rule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_precedence_rule")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait precedence rule>");
    result_ = class_namespace_string_typeargs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_INSTEADOF);
    result_ = result_ && trait_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, level_, marker_, TRAIT_PRECEDENCE_RULE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // trait_rules trait_precedence_rule
  // | trait_rules trait_alias_rule
  public static boolean trait_rules(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_rules")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait rules>");
    result_ = trait_rules_0(builder_, level_ + 1);
    if (!result_) result_ = trait_rules_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TRAIT_RULES, result_, false, null);
    return result_;
  }

  // trait_rules trait_precedence_rule
  private static boolean trait_rules_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_rules_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = trait_rules(builder_, level_ + 1);
    result_ = result_ && trait_precedence_rule(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // trait_rules trait_alias_rule
  private static boolean trait_rules_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_rules_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = trait_rules(builder_, level_ + 1);
    result_ = result_ && trait_alias_rule(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_CATCH '(' fully_qualified_class_name T_VARIABLE ')' '{' inner_statement_list '}'
  public static boolean try_catch(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_catch")) return false;
    if (!nextTokenIs(builder_, T_CATCH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_CATCH);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && fully_qualified_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_VARIABLE);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, TRY_CATCH, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_FINALLY  finally_statement_list
  public static boolean try_finally(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_finally")) return false;
    if (!nextTokenIs(builder_, T_FINALLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_FINALLY);
    result_ = result_ && finally_statement_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, TRY_FINALLY, result_);
    return result_;
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
  // '{'  inner_statement_list '}'
  public static boolean try_statement_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_statement_list")) return false;
    if (!nextTokenIs(builder_, T_LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LBRACE);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, TRY_STATEMENT_LIST, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_UNSET '(' variable_list ')' ';'
  public static boolean unset_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unset_statement")) return false;
    if (!nextTokenIs(builder_, T_UNSET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_UNSET);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && variable_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, UNSET_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( namespace_name T_AS ident)
  //         | namespace_name
  public static boolean use_const_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_const_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<use const declaration>");
    result_ = use_const_declaration_0(builder_, level_ + 1);
    if (!result_) result_ = namespace_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, USE_CONST_DECLARATION, result_, false, null);
    return result_;
  }

  // namespace_name T_AS ident
  private static boolean use_const_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_const_declaration_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namespace_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AS);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // use_const_declaration (',' use_const_declaration)*
  public static boolean use_const_declarations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_const_declarations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<use const declarations>");
    result_ = use_const_declaration(builder_, level_ + 1);
    result_ = result_ && use_const_declarations_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, USE_CONST_DECLARATIONS, result_, false, null);
    return result_;
  }

  // (',' use_const_declaration)*
  private static boolean use_const_declarations_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_const_declarations_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!use_const_declarations_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "use_const_declarations_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' use_const_declaration
  private static boolean use_const_declarations_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_const_declarations_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && use_const_declaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (namespace_name T_AS ident)
  //         | namespace_name
  public static boolean use_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<use declaration>");
    result_ = use_declaration_0(builder_, level_ + 1);
    if (!result_) result_ = namespace_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, USE_DECLARATION, result_, false, null);
    return result_;
  }

  // namespace_name T_AS ident
  private static boolean use_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_declaration_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namespace_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AS);
    result_ = result_ && ident(builder_, level_ + 1);
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
  // (namespace_name T_AS ident)
  //         | namespace_name
  public static boolean use_fn_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_fn_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<use fn declaration>");
    result_ = use_fn_declaration_0(builder_, level_ + 1);
    if (!result_) result_ = namespace_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, USE_FN_DECLARATION, result_, false, null);
    return result_;
  }

  // namespace_name T_AS ident
  private static boolean use_fn_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_fn_declaration_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namespace_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_AS);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // use_fn_declaration (',' use_fn_declaration)*
  public static boolean use_fn_declarations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_fn_declarations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<use fn declarations>");
    result_ = use_fn_declaration(builder_, level_ + 1);
    result_ = result_ && use_fn_declarations_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, USE_FN_DECLARATIONS, result_, false, null);
    return result_;
  }

  // (',' use_fn_declaration)*
  private static boolean use_fn_declarations_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_fn_declarations_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!use_fn_declarations_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "use_fn_declarations_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' use_fn_declaration
  private static boolean use_fn_declarations_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_fn_declarations_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COMMA);
    result_ = result_ && use_fn_declaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (T_USE use_declarations ';')
  //         | (T_USE T_FUNCTION use_fn_declarations ';')
  //         | (T_USE T_CONST use_const_declarations ';')
  public static boolean use_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_statement")) return false;
    if (!nextTokenIs(builder_, T_USE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = use_statement_0(builder_, level_ + 1);
    if (!result_) result_ = use_statement_1(builder_, level_ + 1);
    if (!result_) result_ = use_statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, USE_STATEMENT, result_);
    return result_;
  }

  // T_USE use_declarations ';'
  private static boolean use_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_USE);
    result_ = result_ && use_declarations(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_USE T_FUNCTION use_fn_declarations ';'
  private static boolean use_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_USE, T_FUNCTION);
    result_ = result_ && use_fn_declarations(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_USE T_CONST use_const_declarations ';'
  private static boolean use_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_statement_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_USE, T_CONST);
    result_ = result_ && use_const_declarations(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_user_attribute_list possible_comma
  public static boolean user_attribute_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "user_attribute_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<user attribute list>");
    result_ = non_empty_user_attribute_list(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, USER_ATTRIBUTE_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // variable_without_objects
  // | simple_function_call
  // | object_method_call
  // | class_method_call
  // | dimmable_variable_access
  // | variable property_access
  // | '(' expr_with_parens ')' property_access
  // | static_class_name T_DOUBLE_COLON variable_without_objects
  // | callable_variable '(' function_call_parameter_list ')'
  // | '(' variable ')'
  public static boolean variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variable>");
    result_ = variable_without_objects(builder_, level_ + 1);
    if (!result_) result_ = simple_function_call(builder_, level_ + 1);
    if (!result_) result_ = object_method_call(builder_, level_ + 1);
    if (!result_) result_ = class_method_call(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_access(builder_, level_ + 1);
    if (!result_) result_ = variable_5(builder_, level_ + 1);
    if (!result_) result_ = variable_6(builder_, level_ + 1);
    if (!result_) result_ = variable_7(builder_, level_ + 1);
    if (!result_) result_ = variable_8(builder_, level_ + 1);
    if (!result_) result_ = variable_9(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VARIABLE, result_, false, null);
    return result_;
  }

  // variable property_access
  private static boolean variable_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && property_access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' property_access
  private static boolean variable_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && property_access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_class_name T_DOUBLE_COLON variable_without_objects
  private static boolean variable_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && variable_without_objects(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // callable_variable '(' function_call_parameter_list ')'
  private static boolean variable_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_8")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = callable_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && function_call_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' variable ')'
  private static boolean variable_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_9")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
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
  // non_empty_member_modifiers
  // | T_VAR
  public static boolean variable_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variable modifiers>");
    result_ = non_empty_member_modifiers(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_VAR);
    exit_section_(builder_, level_, marker_, VARIABLE_MODIFIERS, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // variable_without_objects
  // | dimmable_variable_no_calls_access
  // | variable_no_calls property_access
  // | '(' expr_with_parens ')' property_access
  // | static_class_name T_DOUBLE_COLON variable_without_objects
  // | '(' variable ')'
  public static boolean variable_no_calls(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_no_calls")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variable no calls>");
    result_ = variable_without_objects(builder_, level_ + 1);
    if (!result_) result_ = dimmable_variable_no_calls_access(builder_, level_ + 1);
    if (!result_) result_ = variable_no_calls_2(builder_, level_ + 1);
    if (!result_) result_ = variable_no_calls_3(builder_, level_ + 1);
    if (!result_) result_ = variable_no_calls_4(builder_, level_ + 1);
    if (!result_) result_ = variable_no_calls_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VARIABLE_NO_CALLS, result_, false, null);
    return result_;
  }

  // variable_no_calls property_access
  private static boolean variable_no_calls_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_no_calls_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable_no_calls(builder_, level_ + 1);
    result_ = result_ && property_access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr_with_parens ')' property_access
  private static boolean variable_no_calls_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_no_calls_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && expr_with_parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && property_access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // static_class_name T_DOUBLE_COLON variable_without_objects
  private static boolean variable_no_calls_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_no_calls_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = static_class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_COLON);
    result_ = result_ && variable_without_objects(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' variable ')'
  private static boolean variable_no_calls_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_no_calls_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // reference_variable
  // | simple_indirect_reference reference_variable
  public static boolean variable_without_objects(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_without_objects")) return false;
    if (!nextTokenIs(builder_, "<variable without objects>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variable without objects>");
    result_ = reference_variable(builder_, level_ + 1);
    if (!result_) result_ = variable_without_objects_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VARIABLE_WITHOUT_OBJECTS, result_, false, null);
    return result_;
  }

  // simple_indirect_reference reference_variable
  private static boolean variable_without_objects_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_without_objects_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = simple_indirect_reference(builder_, level_ + 1);
    result_ = result_ && reference_variable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_empty_varray_init possible_comma
  public static boolean varray_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varray_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<varray init>");
    result_ = non_empty_varray_init(builder_, level_ + 1);
    result_ = result_ && possible_comma(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VARRAY_INIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_VARRAY '(' varray_init ')'
  public static boolean varray_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varray_literal")) return false;
    if (!nextTokenIs(builder_, T_VARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_VARRAY);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && varray_init(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, VARRAY_LITERAL, result_);
    return result_;
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
  // T_WHILE parenthesis_expr  while_statement_body
  public static boolean while_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_statement")) return false;
    if (!nextTokenIs(builder_, T_WHILE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_WHILE);
    result_ = result_ && parenthesis_expr(builder_, level_ + 1);
    result_ = result_ && while_statement_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, WHILE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // statement
  // | ':' inner_statement_list T_ENDWHILE ';'
  public static boolean while_statement_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_statement_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<while statement body>");
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = while_statement_body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, WHILE_STATEMENT_BODY, result_, false, null);
    return result_;
  }

  // ':' inner_statement_list T_ENDWHILE ';'
  private static boolean while_statement_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_statement_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_COLON);
    result_ = result_ && inner_statement_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_ENDWHILE);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // xhp_attribute_decl_type xhp_label_ws xhp_attribute_default xhp_attribute_is_required
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

  // xhp_attribute_decl_type xhp_label_ws xhp_attribute_default xhp_attribute_is_required
  private static boolean xhp_attribute_decl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_decl_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_attribute_decl_type(builder_, level_ + 1);
    result_ = result_ && xhp_label_ws(builder_, level_ + 1);
    result_ = result_ && xhp_attribute_default(builder_, level_ + 1);
    result_ = result_ && xhp_attribute_is_required(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_ARRAY
  // | fully_qualified_class_name
  // | T_VAR
  // | T_ENUM '{' xhp_attribute_enum '}'
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

  // T_ENUM '{' xhp_attribute_enum '}'
  private static boolean xhp_attribute_decl_type_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_decl_type_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_ENUM);
    result_ = result_ && consumeToken(builder_, T_LBRACE);
    result_ = result_ && xhp_attribute_enum(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '=' static_expr
  public static boolean xhp_attribute_default(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_default")) return false;
    if (!nextTokenIs(builder_, T_EQUAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_EQUAL);
    result_ = result_ && static_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, XHP_ATTRIBUTE_DEFAULT, result_);
    return result_;
  }

  /* ********************************************************** */
  // common_scalar
  // | xhp_attribute_enum ',' common_scalar
  public static boolean xhp_attribute_enum(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_enum")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp attribute enum>");
    result_ = common_scalar(builder_, level_ + 1);
    if (!result_) result_ = xhp_attribute_enum_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_ATTRIBUTE_ENUM, result_, false, null);
    return result_;
  }

  // xhp_attribute_enum ',' common_scalar
  private static boolean xhp_attribute_enum_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_enum_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_attribute_enum(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && common_scalar(builder_, level_ + 1);
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
  // xhp_attribute_decl
  // | xhp_attribute_stmt ',' xhp_attribute_decl
  public static boolean xhp_attribute_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_stmt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp attribute stmt>");
    result_ = xhp_attribute_decl(builder_, level_ + 1);
    if (!result_) result_ = xhp_attribute_stmt_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_ATTRIBUTE_STMT, result_, false, null);
    return result_;
  }

  // xhp_attribute_stmt ',' xhp_attribute_decl
  private static boolean xhp_attribute_stmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attribute_stmt_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_attribute_stmt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && xhp_attribute_decl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_XHP_TEXT
  // | '{' expr '}'
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
  // xhp_attributes xhp_attribute_name '=' xhp_attribute_value
  public static boolean xhp_attributes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_attributes")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp attributes>");
    result_ = xhp_attributes(builder_, level_ + 1);
    result_ = result_ && xhp_attribute_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && xhp_attribute_value(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_ATTRIBUTES, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ident
  // | T_EXIT
  // | T_FUNCTION
  // | T_CONST
  // | T_RETURN
  // | T_YIELD
  // | T_AWAIT
  // | T_TRY
  // | T_CATCH
  // | T_FINALLY
  // | T_THROW
  // | T_IF
  // | T_ELSEIF
  // | T_ENDIF
  // | T_ELSE
  // | T_WHILE
  // | T_ENDWHILE
  // | T_DO
  // | T_FOR
  // | T_ENDFOR
  // | T_FOREACH
  // | T_ENDFOREACH
  // | T_DECLARE
  // | T_ENDDECLARE
  // | T_INSTANCEOF
  // | T_AS
  // | T_SWITCH
  // | T_ENDSWITCH
  // | T_CASE
  // | T_DEFAULT
  // | T_BREAK
  // | T_CONTINUE
  // | T_GOTO
  // | T_ECHO
  // | T_PRINT
  // | T_CLASS
  // | T_INTERFACE
  // | T_EXTENDS
  // | T_IMPLEMENTS
  // | T_NEW
  // | T_CLONE
  // | T_VAR
  // | T_EVAL
  // | T_INCLUDE
  // | T_INCLUDE_ONCE
  // | T_REQUIRE
  // | T_REQUIRE_ONCE
  // | T_NAMESPACE
  // | T_USE
  // | T_GLOBAL
  // | T_ISSET
  // | T_EMPTY
  // | T_HALT_COMPILER
  // | T_STATIC
  // | T_ABSTRACT
  // | T_FINAL
  // | T_PRIVATE
  // | T_PROTECTED
  // | T_PUBLIC
  // | T_ASYNC
  // | T_UNSET
  // | T_LIST
  // | T_ARRAY
  // | T_LOGICAL_OR
  // | T_LOGICAL_AND
  // | T_LOGICAL_XOR
  // | T_CLASS_C
  // | T_FUNC_C
  // | T_METHOD_C
  // | T_LINE
  // | T_FILE
  // | T_DIR
  // | T_NS_C
  // | T_COMPILER_HALT_OFFSET
  // | T_TRAIT
  // | T_TRAIT_C
  // | T_INSTEADOF
  // | T_TYPE
  // | T_NEWTYPE
  // | T_SHAPE
  public static boolean xhp_bareword(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_bareword")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp bareword>");
    result_ = ident(builder_, level_ + 1);
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
  // T_XHP_CATEGORY_LABEL
  public static boolean xhp_category_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_category_decl")) return false;
    if (!nextTokenIs(builder_, T_XHP_CATEGORY_LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_XHP_CATEGORY_LABEL);
    exit_section_(builder_, marker_, XHP_CATEGORY_DECL, result_);
    return result_;
  }

  /* ********************************************************** */
  // xhp_category_decl
  // | xhp_category_stmt ',' xhp_category_decl
  public static boolean xhp_category_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_category_stmt")) return false;
    if (!nextTokenIs(builder_, T_XHP_CATEGORY_LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_category_decl(builder_, level_ + 1);
    if (!result_) result_ = xhp_category_stmt_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, XHP_CATEGORY_STMT, result_);
    return result_;
  }

  // xhp_category_stmt ',' xhp_category_decl
  private static boolean xhp_category_stmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_category_stmt_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_category_stmt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && xhp_category_decl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_XHP_TEXT
  // | '{' expr '}'
  // | xhp_tag
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
  // xhp_children xhp_child
  public static boolean xhp_children(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp children>");
    result_ = xhp_children(builder_, level_ + 1);
    result_ = result_ && xhp_child(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_CHILDREN, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // xhp_children_paren_expr
  // | xhp_children_decl_tag
  // | xhp_children_decl_tag '*'
  // | xhp_children_decl_tag '?'
  // | xhp_children_decl_tag '+'
  // | xhp_children_decl_expr ',' xhp_children_decl_expr
  // | xhp_children_decl_expr '|' xhp_children_decl_expr
  public static boolean xhp_children_decl_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp children decl expr>");
    result_ = xhp_children_paren_expr(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_decl_tag(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_decl_expr_2(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_decl_expr_3(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_decl_expr_4(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_decl_expr_5(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_decl_expr_6(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_CHILDREN_DECL_EXPR, result_, false, null);
    return result_;
  }

  // xhp_children_decl_tag '*'
  private static boolean xhp_children_decl_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_children_decl_tag(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MUL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_children_decl_tag '?'
  private static boolean xhp_children_decl_expr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_children_decl_tag(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_QUEST);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_children_decl_tag '+'
  private static boolean xhp_children_decl_expr_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_children_decl_tag(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_PLUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_children_decl_expr ',' xhp_children_decl_expr
  private static boolean xhp_children_decl_expr_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_children_decl_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COMMA);
    result_ = result_ && xhp_children_decl_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_children_decl_expr '|' xhp_children_decl_expr
  private static boolean xhp_children_decl_expr_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_expr_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_children_decl_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_OR);
    result_ = result_ && xhp_children_decl_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ident
  // | T_XHP_LABEL
  // | T_XHP_CATEGORY_LABEL
  public static boolean xhp_children_decl_tag(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_decl_tag")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp children decl tag>");
    result_ = ident(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_XHP_LABEL);
    if (!result_) result_ = consumeToken(builder_, T_XHP_CATEGORY_LABEL);
    exit_section_(builder_, level_, marker_, XHP_CHILDREN_DECL_TAG, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '(' xhp_children_decl_expr ')'
  // | '(' xhp_children_decl_expr ')' '*'
  // | '(' xhp_children_decl_expr ')' '?'
  // | '(' xhp_children_decl_expr ')' '+'
  public static boolean xhp_children_paren_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_paren_expr")) return false;
    if (!nextTokenIs(builder_, T_LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_children_paren_expr_0(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_paren_expr_1(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_paren_expr_2(builder_, level_ + 1);
    if (!result_) result_ = xhp_children_paren_expr_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, XHP_CHILDREN_PAREN_EXPR, result_);
    return result_;
  }

  // '(' xhp_children_decl_expr ')'
  private static boolean xhp_children_paren_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_paren_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && xhp_children_decl_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' xhp_children_decl_expr ')' '*'
  private static boolean xhp_children_paren_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_paren_expr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && xhp_children_decl_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_MUL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' xhp_children_decl_expr ')' '?'
  private static boolean xhp_children_paren_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_paren_expr_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && xhp_children_decl_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_QUEST);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' xhp_children_decl_expr ')' '+'
  private static boolean xhp_children_paren_expr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_paren_expr_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LPAREN);
    result_ = result_ && xhp_children_decl_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_PLUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // xhp_children_paren_expr
  // | ident
  // | T_EMPTY
  public static boolean xhp_children_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_children_stmt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp children stmt>");
    result_ = xhp_children_paren_expr(builder_, level_ + 1);
    if (!result_) result_ = ident(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, T_EMPTY);
    exit_section_(builder_, level_, marker_, XHP_CHILDREN_STMT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // xhp_bareword
  // | xhp_label_ws ':' xhp_bareword
  // | xhp_label_ws '-' xhp_bareword
  public static boolean xhp_label_ws(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_label_ws")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp label ws>");
    result_ = xhp_bareword(builder_, level_ + 1);
    if (!result_) result_ = xhp_label_ws_1(builder_, level_ + 1);
    if (!result_) result_ = xhp_label_ws_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_LABEL_WS, result_, false, null);
    return result_;
  }

  // xhp_label_ws ':' xhp_bareword
  private static boolean xhp_label_ws_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_label_ws_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_label_ws(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_COLON);
    result_ = result_ && xhp_bareword(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_label_ws '-' xhp_bareword
  private static boolean xhp_label_ws_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_label_ws_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_label_ws(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_MINUS);
    result_ = result_ && xhp_bareword(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // {T_XHP_LABEL}
  public static boolean xhp_opt_end_label(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_opt_end_label")) return false;
    if (!nextTokenIs(builder_, T_XHP_LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_XHP_LABEL);
    exit_section_(builder_, marker_, XHP_OPT_END_LABEL, result_);
    return result_;
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
  // xhp_attributes '/'
  // | xhp_attributes T_XHP_TAG_GT xhp_children T_XHP_TAG_LT '/' xhp_opt_end_label
  public static boolean xhp_tag_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_tag_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<xhp tag body>");
    result_ = xhp_tag_body_0(builder_, level_ + 1);
    if (!result_) result_ = xhp_tag_body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, XHP_TAG_BODY, result_, false, null);
    return result_;
  }

  // xhp_attributes '/'
  private static boolean xhp_tag_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_tag_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_attributes(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DIV);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // xhp_attributes T_XHP_TAG_GT xhp_children T_XHP_TAG_LT '/' xhp_opt_end_label
  private static boolean xhp_tag_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xhp_tag_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xhp_attributes(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_XHP_TAG_GT);
    result_ = result_ && xhp_children(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_XHP_TAG_LT);
    result_ = result_ && consumeToken(builder_, T_DIV);
    result_ = result_ && xhp_opt_end_label(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable '=' yield_expr
  public static boolean yield_assign_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_assign_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<yield assign expr>");
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && yield_expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, YIELD_ASSIGN_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // T_YIELD expr
  // | T_YIELD expr T_DOUBLE_ARROW expr
  public static boolean yield_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expr")) return false;
    if (!nextTokenIs(builder_, T_YIELD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = yield_expr_0(builder_, level_ + 1);
    if (!result_) result_ = yield_expr_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, YIELD_EXPR, result_);
    return result_;
  }

  // T_YIELD expr
  private static boolean yield_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_YIELD);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // T_YIELD expr T_DOUBLE_ARROW expr
  private static boolean yield_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_YIELD);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_DOUBLE_ARROW);
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
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, T_LIST);
    result_ = result_ && consumeToken(builder_, T_LPAREN);
    result_ = result_ && assignment_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, T_RPAREN);
    result_ = result_ && consumeToken(builder_, T_EQUAL);
    result_ = result_ && yield_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, YIELD_LIST_ASSIGN_EXPR, result_);
    return result_;
  }

  /* ********************************************************** */
  // T_YIELD T_BREAK ';'
  public static boolean yield_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_statement")) return false;
    if (!nextTokenIs(builder_, T_YIELD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, T_YIELD, T_BREAK);
    result_ = result_ && consumeToken(builder_, T_SEMICOLON);
    exit_section_(builder_, marker_, YIELD_STATEMENT, result_);
    return result_;
  }

}
