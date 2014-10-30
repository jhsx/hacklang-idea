// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.github.josehsantos.hack.lang.HackTokenType;
import io.github.josehsantos.hack.lang.psi.impl.*;

public interface HackTypes {

  IElementType ADDITIONAL_CATCHES = new HackTokenType("ADDITIONAL_CATCHES");
  IElementType ARRAY_ACCESS = new HackTokenType("ARRAY_ACCESS");
  IElementType ARRAY_LITERAL = new HackTokenType("ARRAY_LITERAL");
  IElementType ARRAY_PAIR_LIST = new HackTokenType("ARRAY_PAIR_LIST");
  IElementType ASSIGNMENT_LIST = new HackTokenType("ASSIGNMENT_LIST");
  IElementType ATTRIBUTE_STATIC_SCALAR_LIST = new HackTokenType("ATTRIBUTE_STATIC_SCALAR_LIST");
  IElementType AWAIT_ASSIGN_EXPR = new HackTokenType("AWAIT_ASSIGN_EXPR");
  IElementType AWAIT_EXPR = new HackTokenType("AWAIT_EXPR");
  IElementType AWAIT_LIST_ASSIGN_EXPR = new HackTokenType("AWAIT_LIST_ASSIGN_EXPR");
  IElementType BACKTICKS_EXPR = new HackTokenType("BACKTICKS_EXPR");
  IElementType BREAK_STATEMENT = new HackTokenType("BREAK_STATEMENT");
  IElementType CALLABLE_VARIABLE = new HackTokenType("CALLABLE_VARIABLE");
  IElementType CASE_BLOCK = new HackTokenType("CASE_BLOCK");
  IElementType CASE_LIST = new HackTokenType("CASE_LIST");
  IElementType CASE_SEPARATOR = new HackTokenType("CASE_SEPARATOR");
  IElementType CLASS_CONSTANT = new HackTokenType("CLASS_CONSTANT");
  IElementType CLASS_CONSTANT_DECLARATION = new HackTokenType("CLASS_CONSTANT_DECLARATION");
  IElementType CLASS_DECLARATION_STATEMENT = new HackTokenType("CLASS_DECLARATION_STATEMENT");
  IElementType CLASS_DECL_NAME = new HackTokenType("CLASS_DECL_NAME");
  IElementType CLASS_ENTRY_TYPE = new HackTokenType("CLASS_ENTRY_TYPE");
  IElementType CLASS_METHOD_CALL = new HackTokenType("CLASS_METHOD_CALL");
  IElementType CLASS_NAMESPACE_STRING_TYPEARGS = new HackTokenType("CLASS_NAMESPACE_STRING_TYPEARGS");
  IElementType CLASS_NAME_REFERENCE = new HackTokenType("CLASS_NAME_REFERENCE");
  IElementType CLASS_STATEMENT = new HackTokenType("CLASS_STATEMENT");
  IElementType CLASS_STATEMENT_LIST = new HackTokenType("CLASS_STATEMENT_LIST");
  IElementType CLASS_VARIABLE_DECLARATION = new HackTokenType("CLASS_VARIABLE_DECLARATION");
  IElementType CLOSURE_EXPRESSION = new HackTokenType("CLOSURE_EXPRESSION");
  IElementType COLLECTION_INIT = new HackTokenType("COLLECTION_INIT");
  IElementType COLLECTION_LITERAL = new HackTokenType("COLLECTION_LITERAL");
  IElementType COMMON_SCALAR = new HackTokenType("COMMON_SCALAR");
  IElementType COMMON_SCALAR_AE = new HackTokenType("COMMON_SCALAR_AE");
  IElementType COMPOUND_VARIABLE = new HackTokenType("COMPOUND_VARIABLE");
  IElementType CONSTANT_ASSIGNMENT = new HackTokenType("CONSTANT_ASSIGNMENT");
  IElementType CONSTANT_DECLARATION = new HackTokenType("CONSTANT_DECLARATION");
  IElementType CONSTANT_DECLARATION_STATEMENT = new HackTokenType("CONSTANT_DECLARATION_STATEMENT");
  IElementType CONTINUE_STATEMENT = new HackTokenType("CONTINUE_STATEMENT");
  IElementType CTOR_ARGUMENTS = new HackTokenType("CTOR_ARGUMENTS");
  IElementType DECLARE_ASSIGNMENT = new HackTokenType("DECLARE_ASSIGNMENT");
  IElementType DECLARE_LIST = new HackTokenType("DECLARE_LIST");
  IElementType DECLARE_STATEMENT = new HackTokenType("DECLARE_STATEMENT");
  IElementType DECLARE_STATEMENT_BODY = new HackTokenType("DECLARE_STATEMENT_BODY");
  IElementType DEFAULT_CASE_BLOCK = new HackTokenType("DEFAULT_CASE_BLOCK");
  IElementType DIMMABLE_VARIABLE = new HackTokenType("DIMMABLE_VARIABLE");
  IElementType DIMMABLE_VARIABLE_ACCESS = new HackTokenType("DIMMABLE_VARIABLE_ACCESS");
  IElementType DIMMABLE_VARIABLE_NO_CALLS = new HackTokenType("DIMMABLE_VARIABLE_NO_CALLS");
  IElementType DIMMABLE_VARIABLE_NO_CALLS_ACCESS = new HackTokenType("DIMMABLE_VARIABLE_NO_CALLS_ACCESS");
  IElementType DIM_EXPR = new HackTokenType("DIM_EXPR");
  IElementType DIM_EXPR_BASE = new HackTokenType("DIM_EXPR_BASE");
  IElementType DIM_OFFSET = new HackTokenType("DIM_OFFSET");
  IElementType DO_WHILE_STATEMENT = new HackTokenType("DO_WHILE_STATEMENT");
  IElementType ECHO_STATEMENT = new HackTokenType("ECHO_STATEMENT");
  IElementType ELSEIF_BODY = new HackTokenType("ELSEIF_BODY");
  IElementType ELSEIF_LIST = new HackTokenType("ELSEIF_LIST");
  IElementType ELSE_SINGLE = new HackTokenType("ELSE_SINGLE");
  IElementType ENCAPS_LIST = new HackTokenType("ENCAPS_LIST");
  IElementType ENCAPS_VAR = new HackTokenType("ENCAPS_VAR");
  IElementType ENCAPS_VAR_OFFSET = new HackTokenType("ENCAPS_VAR_OFFSET");
  IElementType ENUM_CONSTANT_DECLARATION = new HackTokenType("ENUM_CONSTANT_DECLARATION");
  IElementType ENUM_DECLARATION_STATEMENT = new HackTokenType("ENUM_DECLARATION_STATEMENT");
  IElementType ENUM_STATEMENT = new HackTokenType("ENUM_STATEMENT");
  IElementType ENUM_STATEMENT_LIST = new HackTokenType("ENUM_STATEMENT_LIST");
  IElementType EXIT_EXPR = new HackTokenType("EXIT_EXPR");
  IElementType EXPR = new HackTokenType("EXPR");
  IElementType EXPR_LIST = new HackTokenType("EXPR_LIST");
  IElementType EXPR_NO_VARIABLE = new HackTokenType("EXPR_NO_VARIABLE");
  IElementType EXPR_STATEMENT = new HackTokenType("EXPR_STATEMENT");
  IElementType EXPR_WITH_PARENS = new HackTokenType("EXPR_WITH_PARENS");
  IElementType EXTENDS_FROM = new HackTokenType("EXTENDS_FROM");
  IElementType FINALLY_STATEMENT_LIST = new HackTokenType("FINALLY_STATEMENT_LIST");
  IElementType FOREACH_OPTIONAL_ARG = new HackTokenType("FOREACH_OPTIONAL_ARG");
  IElementType FOREACH_STATEMENT = new HackTokenType("FOREACH_STATEMENT");
  IElementType FOREACH_STATEMENT_BODY = new HackTokenType("FOREACH_STATEMENT_BODY");
  IElementType FOREACH_VARIABLE = new HackTokenType("FOREACH_VARIABLE");
  IElementType FOR_EXPR = new HackTokenType("FOR_EXPR");
  IElementType FOR_STATEMENT = new HackTokenType("FOR_STATEMENT");
  IElementType FOR_STATEMENT_BODY = new HackTokenType("FOR_STATEMENT_BODY");
  IElementType FROM_CLAUSE = new HackTokenType("FROM_CLAUSE");
  IElementType FULLY_QUALIFIED_CLASS_NAME = new HackTokenType("FULLY_QUALIFIED_CLASS_NAME");
  IElementType FUNCTION_BODY = new HackTokenType("FUNCTION_BODY");
  IElementType FUNCTION_CALL_PARAMETER_LIST = new HackTokenType("FUNCTION_CALL_PARAMETER_LIST");
  IElementType FUNCTION_DECLARATION_STATEMENT = new HackTokenType("FUNCTION_DECLARATION_STATEMENT");
  IElementType FUNCTION_LOC = new HackTokenType("FUNCTION_LOC");
  IElementType GLOBAL_STATEMENT = new HackTokenType("GLOBAL_STATEMENT");
  IElementType GLOBAL_VAR = new HackTokenType("GLOBAL_VAR");
  IElementType GLOBAL_VAR_LIST = new HackTokenType("GLOBAL_VAR_LIST");
  IElementType GOTO_STATEMENT = new HackTokenType("GOTO_STATEMENT");
  IElementType GROUP_CLAUSE = new HackTokenType("GROUP_CLAUSE");
  IElementType HALT_COMPILER_STATEMENT = new HackTokenType("HALT_COMPILER_STATEMENT");
  IElementType HH_FUNC_TYPE_LIST = new HackTokenType("HH_FUNC_TYPE_LIST");
  IElementType HH_NAME_WITH_TYPE = new HackTokenType("HH_NAME_WITH_TYPE");
  IElementType HH_NAME_WITH_TYPEVAR = new HackTokenType("HH_NAME_WITH_TYPEVAR");
  IElementType HH_NON_EMPTY_SHAPE_MEMBER_LIST = new HackTokenType("HH_NON_EMPTY_SHAPE_MEMBER_LIST");
  IElementType HH_NON_EMPTY_TYPE_LIST = new HackTokenType("HH_NON_EMPTY_TYPE_LIST");
  IElementType HH_NULL_TYPE = new HackTokenType("HH_NULL_TYPE");
  IElementType HH_OPT_CONSTRAINT = new HackTokenType("HH_OPT_CONSTRAINT");
  IElementType HH_OPT_RETURN_TYPE = new HackTokenType("HH_OPT_RETURN_TYPE");
  IElementType HH_POSSIBLE_COMMA = new HackTokenType("HH_POSSIBLE_COMMA");
  IElementType HH_SHAPE_MEMBER_LIST = new HackTokenType("HH_SHAPE_MEMBER_LIST");
  IElementType HH_SHAPE_MEMBER_TYPE = new HackTokenType("HH_SHAPE_MEMBER_TYPE");
  IElementType HH_SHAPE_TYPE = new HackTokenType("HH_SHAPE_TYPE");
  IElementType HH_TYPE = new HackTokenType("HH_TYPE");
  IElementType HH_TYPEARGS_OPT = new HackTokenType("HH_TYPEARGS_OPT");
  IElementType HH_TYPEVAR_LIST = new HackTokenType("HH_TYPEVAR_LIST");
  IElementType HH_TYPEVAR_VARIANCE = new HackTokenType("HH_TYPEVAR_VARIANCE");
  IElementType HH_TYPE_ALIAS_STATEMENT = new HackTokenType("HH_TYPE_ALIAS_STATEMENT");
  IElementType HH_TYPE_LIST = new HackTokenType("HH_TYPE_LIST");
  IElementType HH_TYPE_OPT = new HackTokenType("HH_TYPE_OPT");
  IElementType HTML_STATEMENT = new HackTokenType("HTML_STATEMENT");
  IElementType IDENT = new HackTokenType("IDENT");
  IElementType IF_STATEMENT = new HackTokenType("IF_STATEMENT");
  IElementType IMPLEMENTS_LIST = new HackTokenType("IMPLEMENTS_LIST");
  IElementType INNER_STATEMENT = new HackTokenType("INNER_STATEMENT");
  IElementType INNER_STATEMENT_LIST = new HackTokenType("INNER_STATEMENT_LIST");
  IElementType INTERFACE_DECL_NAME = new HackTokenType("INTERFACE_DECL_NAME");
  IElementType INTERFACE_EXTENDS_LIST = new HackTokenType("INTERFACE_EXTENDS_LIST");
  IElementType INTERFACE_LIST = new HackTokenType("INTERFACE_LIST");
  IElementType INTERNAL_FUNCTIONS = new HackTokenType("INTERNAL_FUNCTIONS");
  IElementType IS_REFERENCE = new HackTokenType("IS_REFERENCE");
  IElementType JOIN_CLAUSE = new HackTokenType("JOIN_CLAUSE");
  IElementType JOIN_INTO_CLAUSE = new HackTokenType("JOIN_INTO_CLAUSE");
  IElementType LABEL_STATEMENT = new HackTokenType("LABEL_STATEMENT");
  IElementType LAMBDA_BODY = new HackTokenType("LAMBDA_BODY");
  IElementType LAMBDA_EXPRESSION = new HackTokenType("LAMBDA_EXPRESSION");
  IElementType LAMBDA_USE_VARS = new HackTokenType("LAMBDA_USE_VARS");
  IElementType LET_CLAUSE = new HackTokenType("LET_CLAUSE");
  IElementType LEXICAL_VAR_LIST = new HackTokenType("LEXICAL_VAR_LIST");
  IElementType MAP_ARRAY_INIT = new HackTokenType("MAP_ARRAY_INIT");
  IElementType MAP_ARRAY_LITERAL = new HackTokenType("MAP_ARRAY_LITERAL");
  IElementType MEMBER_MODIFIER = new HackTokenType("MEMBER_MODIFIER");
  IElementType METHOD_BODY = new HackTokenType("METHOD_BODY");
  IElementType METHOD_MODIFIERS = new HackTokenType("METHOD_MODIFIERS");
  IElementType NAMESPACE_NAME = new HackTokenType("NAMESPACE_NAME");
  IElementType NAMESPACE_STATEMENT = new HackTokenType("NAMESPACE_STATEMENT");
  IElementType NAMESPACE_STRING = new HackTokenType("NAMESPACE_STRING");
  IElementType NAMESPACE_STRING_BASE = new HackTokenType("NAMESPACE_STRING_BASE");
  IElementType NAMESPACE_STRING_TYPEARGS = new HackTokenType("NAMESPACE_STRING_TYPEARGS");
  IElementType NEW_ELSEIF_BODY = new HackTokenType("NEW_ELSEIF_BODY");
  IElementType NEW_ELSEIF_LIST = new HackTokenType("NEW_ELSEIF_LIST");
  IElementType NEW_ELSE_SINGLE = new HackTokenType("NEW_ELSE_SINGLE");
  IElementType NON_EMPTY_ARRAY_PAIR_LIST = new HackTokenType("NON_EMPTY_ARRAY_PAIR_LIST");
  IElementType NON_EMPTY_COLLECTION_INIT = new HackTokenType("NON_EMPTY_COLLECTION_INIT");
  IElementType NON_EMPTY_FCALL_PARAMETER_LIST = new HackTokenType("NON_EMPTY_FCALL_PARAMETER_LIST");
  IElementType NON_EMPTY_MAP_ARRAY_INIT = new HackTokenType("NON_EMPTY_MAP_ARRAY_INIT");
  IElementType NON_EMPTY_MEMBER_MODIFIERS = new HackTokenType("NON_EMPTY_MEMBER_MODIFIERS");
  IElementType NON_EMPTY_SHAPE_PAIR_LIST = new HackTokenType("NON_EMPTY_SHAPE_PAIR_LIST");
  IElementType NON_EMPTY_STATIC_ARRAY_PAIR_LIST = new HackTokenType("NON_EMPTY_STATIC_ARRAY_PAIR_LIST");
  IElementType NON_EMPTY_STATIC_ARRAY_PAIR_LIST_AE = new HackTokenType("NON_EMPTY_STATIC_ARRAY_PAIR_LIST_AE");
  IElementType NON_EMPTY_STATIC_COLLECTION_INIT = new HackTokenType("NON_EMPTY_STATIC_COLLECTION_INIT");
  IElementType NON_EMPTY_STATIC_MAP_ARRAY_INIT = new HackTokenType("NON_EMPTY_STATIC_MAP_ARRAY_INIT");
  IElementType NON_EMPTY_STATIC_SCALAR_LIST_AE = new HackTokenType("NON_EMPTY_STATIC_SCALAR_LIST_AE");
  IElementType NON_EMPTY_STATIC_SHAPE_PAIR_LIST = new HackTokenType("NON_EMPTY_STATIC_SHAPE_PAIR_LIST");
  IElementType NON_EMPTY_STATIC_SHAPE_PAIR_LIST_AE = new HackTokenType("NON_EMPTY_STATIC_SHAPE_PAIR_LIST_AE");
  IElementType NON_EMPTY_STATIC_VARRAY_INIT = new HackTokenType("NON_EMPTY_STATIC_VARRAY_INIT");
  IElementType NON_EMPTY_USER_ATTRIBUTES = new HackTokenType("NON_EMPTY_USER_ATTRIBUTES");
  IElementType NON_EMPTY_USER_ATTRIBUTE_LIST = new HackTokenType("NON_EMPTY_USER_ATTRIBUTE_LIST");
  IElementType NON_EMPTY_VARRAY_INIT = new HackTokenType("NON_EMPTY_VARRAY_INIT");
  IElementType OBJECT_METHOD_CALL = new HackTokenType("OBJECT_METHOD_CALL");
  IElementType OPTIONAL_FINALLY = new HackTokenType("OPTIONAL_FINALLY");
  IElementType OPTIONAL_USER_ATTRIBUTES = new HackTokenType("OPTIONAL_USER_ATTRIBUTES");
  IElementType ORDERBY_CLAUSE = new HackTokenType("ORDERBY_CLAUSE");
  IElementType ORDERING = new HackTokenType("ORDERING");
  IElementType ORDERINGS = new HackTokenType("ORDERINGS");
  IElementType ORDERING_DIRECTION = new HackTokenType("ORDERING_DIRECTION");
  IElementType PARAMETER_ITEM = new HackTokenType("PARAMETER_ITEM");
  IElementType PARAMETER_LIST = new HackTokenType("PARAMETER_LIST");
  IElementType PARAMETER_MODIFIER = new HackTokenType("PARAMETER_MODIFIER");
  IElementType PARAMETER_MODIFIERS = new HackTokenType("PARAMETER_MODIFIERS");
  IElementType PARENTHESIS_EXPR = new HackTokenType("PARENTHESIS_EXPR");
  IElementType POSSIBLE_COMMA = new HackTokenType("POSSIBLE_COMMA");
  IElementType PROPERTY_ACCESS = new HackTokenType("PROPERTY_ACCESS");
  IElementType PROPERTY_ACCESS_WITHOUT_VARIABLES = new HackTokenType("PROPERTY_ACCESS_WITHOUT_VARIABLES");
  IElementType QUERY_ASSIGN_EXPR = new HackTokenType("QUERY_ASSIGN_EXPR");
  IElementType QUERY_BODY = new HackTokenType("QUERY_BODY");
  IElementType QUERY_BODY_CLAUSE = new HackTokenType("QUERY_BODY_CLAUSE");
  IElementType QUERY_BODY_CLAUSES = new HackTokenType("QUERY_BODY_CLAUSES");
  IElementType QUERY_CONTINUATION = new HackTokenType("QUERY_CONTINUATION");
  IElementType QUERY_EXPR = new HackTokenType("QUERY_EXPR");
  IElementType QUERY_HEAD = new HackTokenType("QUERY_HEAD");
  IElementType REFERENCE_VARIABLE = new HackTokenType("REFERENCE_VARIABLE");
  IElementType RETURN_STATEMENT = new HackTokenType("RETURN_STATEMENT");
  IElementType SCALAR = new HackTokenType("SCALAR");
  IElementType SELECT_CLAUSE = new HackTokenType("SELECT_CLAUSE");
  IElementType SELECT_OR_GROUP_CLAUSE = new HackTokenType("SELECT_OR_GROUP_CLAUSE");
  IElementType SHAPE_KEYNAME = new HackTokenType("SHAPE_KEYNAME");
  IElementType SHAPE_LITERAL = new HackTokenType("SHAPE_LITERAL");
  IElementType SHAPE_PAIR_LIST = new HackTokenType("SHAPE_PAIR_LIST");
  IElementType SIMPLE_FUNCTION_CALL = new HackTokenType("SIMPLE_FUNCTION_CALL");
  IElementType SIMPLE_INDIRECT_REFERENCE = new HackTokenType("SIMPLE_INDIRECT_REFERENCE");
  IElementType STATEMENT = new HackTokenType("STATEMENT");
  IElementType STATIC_ARRAY_PAIR_LIST = new HackTokenType("STATIC_ARRAY_PAIR_LIST");
  IElementType STATIC_ARRAY_PAIR_LIST_AE = new HackTokenType("STATIC_ARRAY_PAIR_LIST_AE");
  IElementType STATIC_CLASS_CONSTANT = new HackTokenType("STATIC_CLASS_CONSTANT");
  IElementType STATIC_CLASS_NAME = new HackTokenType("STATIC_CLASS_NAME");
  IElementType STATIC_COLLECTION_INIT = new HackTokenType("STATIC_COLLECTION_INIT");
  IElementType STATIC_COLLECTION_LITERAL = new HackTokenType("STATIC_COLLECTION_LITERAL");
  IElementType STATIC_EXPR = new HackTokenType("STATIC_EXPR");
  IElementType STATIC_MAP_ARRAY_INIT = new HackTokenType("STATIC_MAP_ARRAY_INIT");
  IElementType STATIC_MAP_ARRAY_LITERAL = new HackTokenType("STATIC_MAP_ARRAY_LITERAL");
  IElementType STATIC_NUMERIC_SCALAR_AE = new HackTokenType("STATIC_NUMERIC_SCALAR_AE");
  IElementType STATIC_SCALAR_AE = new HackTokenType("STATIC_SCALAR_AE");
  IElementType STATIC_SCALAR_LIST_AE = new HackTokenType("STATIC_SCALAR_LIST_AE");
  IElementType STATIC_SHAPE_PAIR_LIST = new HackTokenType("STATIC_SHAPE_PAIR_LIST");
  IElementType STATIC_SHAPE_PAIR_LIST_AE = new HackTokenType("STATIC_SHAPE_PAIR_LIST_AE");
  IElementType STATIC_STATEMENT = new HackTokenType("STATIC_STATEMENT");
  IElementType STATIC_VARRAY_INIT = new HackTokenType("STATIC_VARRAY_INIT");
  IElementType STATIC_VARRAY_LITERAL = new HackTokenType("STATIC_VARRAY_LITERAL");
  IElementType STATIC_VAR_LIST = new HackTokenType("STATIC_VAR_LIST");
  IElementType SWITCH_CASE_LIST = new HackTokenType("SWITCH_CASE_LIST");
  IElementType SWITCH_STATEMENT = new HackTokenType("SWITCH_STATEMENT");
  IElementType THROW_STATEMENT = new HackTokenType("THROW_STATEMENT");
  IElementType TOP_STATEMENT_LIST = new HackTokenType("TOP_STATEMENT_LIST");
  IElementType TRAIT_ALIAS_RULE = new HackTokenType("TRAIT_ALIAS_RULE");
  IElementType TRAIT_ALIAS_RULE_METHOD = new HackTokenType("TRAIT_ALIAS_RULE_METHOD");
  IElementType TRAIT_DECLARATION_STATEMENT = new HackTokenType("TRAIT_DECLARATION_STATEMENT");
  IElementType TRAIT_DECL_NAME = new HackTokenType("TRAIT_DECL_NAME");
  IElementType TRAIT_LIST = new HackTokenType("TRAIT_LIST");
  IElementType TRAIT_PRECEDENCE_RULE = new HackTokenType("TRAIT_PRECEDENCE_RULE");
  IElementType TRAIT_RULES = new HackTokenType("TRAIT_RULES");
  IElementType TRY_CATCH = new HackTokenType("TRY_CATCH");
  IElementType TRY_FINALLY = new HackTokenType("TRY_FINALLY");
  IElementType TRY_STATEMENT = new HackTokenType("TRY_STATEMENT");
  IElementType TRY_STATEMENT_LIST = new HackTokenType("TRY_STATEMENT_LIST");
  IElementType UNSET_STATEMENT = new HackTokenType("UNSET_STATEMENT");
  IElementType USER_ATTRIBUTE_LIST = new HackTokenType("USER_ATTRIBUTE_LIST");
  IElementType USE_CONST_DECLARATION = new HackTokenType("USE_CONST_DECLARATION");
  IElementType USE_CONST_DECLARATIONS = new HackTokenType("USE_CONST_DECLARATIONS");
  IElementType USE_DECLARATION = new HackTokenType("USE_DECLARATION");
  IElementType USE_DECLARATIONS = new HackTokenType("USE_DECLARATIONS");
  IElementType USE_FN_DECLARATION = new HackTokenType("USE_FN_DECLARATION");
  IElementType USE_FN_DECLARATIONS = new HackTokenType("USE_FN_DECLARATIONS");
  IElementType USE_STATEMENT = new HackTokenType("USE_STATEMENT");
  IElementType VARIABLE = new HackTokenType("VARIABLE");
  IElementType VARIABLE_LIST = new HackTokenType("VARIABLE_LIST");
  IElementType VARIABLE_MODIFIERS = new HackTokenType("VARIABLE_MODIFIERS");
  IElementType VARIABLE_NO_CALLS = new HackTokenType("VARIABLE_NO_CALLS");
  IElementType VARIABLE_WITHOUT_OBJECTS = new HackTokenType("VARIABLE_WITHOUT_OBJECTS");
  IElementType VARRAY_INIT = new HackTokenType("VARRAY_INIT");
  IElementType VARRAY_LITERAL = new HackTokenType("VARRAY_LITERAL");
  IElementType WHERE_CLAUSE = new HackTokenType("WHERE_CLAUSE");
  IElementType WHILE_STATEMENT = new HackTokenType("WHILE_STATEMENT");
  IElementType WHILE_STATEMENT_BODY = new HackTokenType("WHILE_STATEMENT_BODY");
  IElementType XHP_ATTRIBUTES = new HackTokenType("XHP_ATTRIBUTES");
  IElementType XHP_ATTRIBUTE_DECL = new HackTokenType("XHP_ATTRIBUTE_DECL");
  IElementType XHP_ATTRIBUTE_DECL_TYPE = new HackTokenType("XHP_ATTRIBUTE_DECL_TYPE");
  IElementType XHP_ATTRIBUTE_DEFAULT = new HackTokenType("XHP_ATTRIBUTE_DEFAULT");
  IElementType XHP_ATTRIBUTE_ENUM = new HackTokenType("XHP_ATTRIBUTE_ENUM");
  IElementType XHP_ATTRIBUTE_IS_REQUIRED = new HackTokenType("XHP_ATTRIBUTE_IS_REQUIRED");
  IElementType XHP_ATTRIBUTE_NAME = new HackTokenType("XHP_ATTRIBUTE_NAME");
  IElementType XHP_ATTRIBUTE_STMT = new HackTokenType("XHP_ATTRIBUTE_STMT");
  IElementType XHP_ATTRIBUTE_VALUE = new HackTokenType("XHP_ATTRIBUTE_VALUE");
  IElementType XHP_BAREWORD = new HackTokenType("XHP_BAREWORD");
  IElementType XHP_CATEGORY_DECL = new HackTokenType("XHP_CATEGORY_DECL");
  IElementType XHP_CATEGORY_STMT = new HackTokenType("XHP_CATEGORY_STMT");
  IElementType XHP_CHILD = new HackTokenType("XHP_CHILD");
  IElementType XHP_CHILDREN = new HackTokenType("XHP_CHILDREN");
  IElementType XHP_CHILDREN_DECL_EXPR = new HackTokenType("XHP_CHILDREN_DECL_EXPR");
  IElementType XHP_CHILDREN_DECL_TAG = new HackTokenType("XHP_CHILDREN_DECL_TAG");
  IElementType XHP_CHILDREN_PAREN_EXPR = new HackTokenType("XHP_CHILDREN_PAREN_EXPR");
  IElementType XHP_CHILDREN_STMT = new HackTokenType("XHP_CHILDREN_STMT");
  IElementType XHP_LABEL_WS = new HackTokenType("XHP_LABEL_WS");
  IElementType XHP_OPT_END_LABEL = new HackTokenType("XHP_OPT_END_LABEL");
  IElementType XHP_TAG = new HackTokenType("XHP_TAG");
  IElementType XHP_TAG_BODY = new HackTokenType("XHP_TAG_BODY");
  IElementType YIELD_ASSIGN_EXPR = new HackTokenType("YIELD_ASSIGN_EXPR");
  IElementType YIELD_EXPR = new HackTokenType("YIELD_EXPR");
  IElementType YIELD_LIST_ASSIGN_EXPR = new HackTokenType("YIELD_LIST_ASSIGN_EXPR");
  IElementType YIELD_STATEMENT = new HackTokenType("YIELD_STATEMENT");

  IElementType BACKTICKS_EXPR_0_0 = new HackTokenType("backticks_expr_0_0");
  IElementType DIMMABLE_VARIABLE_NO_CALLS_0_0 = new HackTokenType("dimmable_variable_no_calls_0_0");
  IElementType HH_OPT_CONSTRAINT_0_0 = new HackTokenType("hh_opt_constraint_0_0");
  IElementType T_ABSTRACT = new HackTokenType("T_ABSTRACT");
  IElementType T_AND = new HackTokenType("&");
  IElementType T_AND_EQUAL = new HackTokenType("T_AND_EQUAL");
  IElementType T_ARRAY = new HackTokenType("T_ARRAY");
  IElementType T_ARRAY_CAST = new HackTokenType("T_ARRAY_CAST");
  IElementType T_AS = new HackTokenType("T_AS");
  IElementType T_ASCENDING = new HackTokenType("T_ASCENDING");
  IElementType T_ASYNC = new HackTokenType("T_ASYNC");
  IElementType T_AWAIT = new HackTokenType("T_AWAIT");
  IElementType T_BOOLEAN_AND = new HackTokenType("T_BOOLEAN_AND");
  IElementType T_BOOLEAN_OR = new HackTokenType("T_BOOLEAN_OR");
  IElementType T_BOOL_CAST = new HackTokenType("T_BOOL_CAST");
  IElementType T_BREAK = new HackTokenType("T_BREAK");
  IElementType T_BY = new HackTokenType("T_BY");
  IElementType T_CALLABLE = new HackTokenType("T_CALLABLE");
  IElementType T_CASE = new HackTokenType("T_CASE");
  IElementType T_CATCH = new HackTokenType("T_CATCH");
  IElementType T_CLASS = new HackTokenType("T_CLASS");
  IElementType T_CLASS_C = new HackTokenType("T_CLASS_C");
  IElementType T_CLONE = new HackTokenType("T_CLONE");
  IElementType T_COLON = new HackTokenType(":");
  IElementType T_COMMA = new HackTokenType(",");
  IElementType T_COMPILER_HALT_OFFSET = new HackTokenType("T_COMPILER_HALT_OFFSET");
  IElementType T_CONCAT_EQUAL = new HackTokenType("T_CONCAT_EQUAL");
  IElementType T_CONST = new HackTokenType("T_CONST");
  IElementType T_CONSTANT_ENCAPSED_STRING = new HackTokenType("T_CONSTANT_ENCAPSED_STRING");
  IElementType T_CONTINUE = new HackTokenType("T_CONTINUE");
  IElementType T_CURLY_OPEN = new HackTokenType("T_CURLY_OPEN");
  IElementType T_DEC = new HackTokenType("T_DEC");
  IElementType T_DECLARE = new HackTokenType("T_DECLARE");
  IElementType T_DEFAULT = new HackTokenType("T_DEFAULT");
  IElementType T_DESCENDING = new HackTokenType("T_DESCENDING");
  IElementType T_DIR = new HackTokenType("T_DIR");
  IElementType T_DIV = new HackTokenType("/");
  IElementType T_DIV_EQUAL = new HackTokenType("T_DIV_EQUAL");
  IElementType T_DNUMBER = new HackTokenType("T_DNUMBER");
  IElementType T_DO = new HackTokenType("T_DO");
  IElementType T_DOLLAR_OPEN_CURLY_BRACES = new HackTokenType("T_DOLLAR_OPEN_CURLY_BRACES");
  IElementType T_DOLLAR_SIGN = new HackTokenType("$");
  IElementType T_DOT = new HackTokenType(".");
  IElementType T_DOUBLE_ARROW = new HackTokenType("T_DOUBLE_ARROW");
  IElementType T_DOUBLE_CAST = new HackTokenType("T_DOUBLE_CAST");
  IElementType T_DOUBLE_COLON = new HackTokenType("T_DOUBLE_COLON");
  IElementType T_DOUBLE_QUOTE = new HackTokenType("\"");
  IElementType T_ECHO = new HackTokenType("T_ECHO");
  IElementType T_ELLIPSIS = new HackTokenType("...");
  IElementType T_ELSE = new HackTokenType("T_ELSE");
  IElementType T_ELSEIF = new HackTokenType("T_ELSEIF");
  IElementType T_EMPTY = new HackTokenType("T_EMPTY");
  IElementType T_ENCAPSED_AND_WHITESPACE = new HackTokenType("T_ENCAPSED_AND_WHITESPACE");
  IElementType T_ENDDECLARE = new HackTokenType("T_ENDDECLARE");
  IElementType T_ENDFOR = new HackTokenType("T_ENDFOR");
  IElementType T_ENDFOREACH = new HackTokenType("T_ENDFOREACH");
  IElementType T_ENDIF = new HackTokenType("T_ENDIF");
  IElementType T_ENDSWITCH = new HackTokenType("T_ENDSWITCH");
  IElementType T_ENDWHILE = new HackTokenType("T_ENDWHILE");
  IElementType T_END_HEREDOC = new HackTokenType("T_END_HEREDOC");
  IElementType T_ENUM = new HackTokenType("T_ENUM");
  IElementType T_EQUAL = new HackTokenType("=");
  IElementType T_EQUALS = new HackTokenType("T_EQUALS");
  IElementType T_EVAL = new HackTokenType("T_EVAL");
  IElementType T_EXIT = new HackTokenType("T_EXIT");
  IElementType T_EXTENDS = new HackTokenType("T_EXTENDS");
  IElementType T_FILE = new HackTokenType("T_FILE");
  IElementType T_FINAL = new HackTokenType("T_FINAL");
  IElementType T_FINALLY = new HackTokenType("T_FINALLY");
  IElementType T_FOR = new HackTokenType("T_FOR");
  IElementType T_FOREACH = new HackTokenType("T_FOREACH");
  IElementType T_FROM = new HackTokenType("T_FROM");
  IElementType T_FUNCTION = new HackTokenType("T_FUNCTION");
  IElementType T_FUNC_C = new HackTokenType("T_FUNC_C");
  IElementType T_GLOBAL = new HackTokenType("T_GLOBAL");
  IElementType T_GOTO = new HackTokenType("T_GOTO");
  IElementType T_GREATER = new HackTokenType(">");
  IElementType T_GROUP = new HackTokenType("T_GROUP");
  IElementType T_HALT_COMPILER = new HackTokenType("T_HALT_COMPILER");
  IElementType T_IF = new HackTokenType("T_IF");
  IElementType T_IMPLEMENTS = new HackTokenType("T_IMPLEMENTS");
  IElementType T_IN = new HackTokenType("T_IN");
  IElementType T_INC = new HackTokenType("T_INC");
  IElementType T_INCLUDE = new HackTokenType("T_INCLUDE");
  IElementType T_INCLUDE_ONCE = new HackTokenType("T_INCLUDE_ONCE");
  IElementType T_INLINE_HTML = new HackTokenType("T_INLINE_HTML");
  IElementType T_INSTANCEOF = new HackTokenType("T_INSTANCEOF");
  IElementType T_INSTEADOF = new HackTokenType("T_INSTEADOF");
  IElementType T_INTERFACE = new HackTokenType("T_INTERFACE");
  IElementType T_INTO = new HackTokenType("T_INTO");
  IElementType T_INT_CAST = new HackTokenType("T_INT_CAST");
  IElementType T_ISSET = new HackTokenType("T_ISSET");
  IElementType T_IS_EQUAL = new HackTokenType("T_IS_EQUAL");
  IElementType T_IS_GREATER_OR_EQUAL = new HackTokenType("T_IS_GREATER_OR_EQUAL");
  IElementType T_IS_IDENTICAL = new HackTokenType("T_IS_IDENTICAL");
  IElementType T_IS_NOT_EQUAL = new HackTokenType("T_IS_NOT_EQUAL");
  IElementType T_IS_NOT_IDENTICAL = new HackTokenType("T_IS_NOT_IDENTICAL");
  IElementType T_IS_SMALLER_OR_EQUAL = new HackTokenType("T_IS_SMALLER_OR_EQUAL");
  IElementType T_JOIN = new HackTokenType("T_JOIN");
  IElementType T_LAMBDA_ARROW = new HackTokenType("T_LAMBDA_ARROW");
  IElementType T_LBRACE = new HackTokenType("{");
  IElementType T_LBRACKET = new HackTokenType("[");
  IElementType T_LESS = new HackTokenType("<");
  IElementType T_LET = new HackTokenType("T_LET");
  IElementType T_LINE = new HackTokenType("T_LINE");
  IElementType T_LIST = new HackTokenType("T_LIST");
  IElementType T_LNUMBER = new HackTokenType("T_LNUMBER");
  IElementType T_LOGICAL_AND = new HackTokenType("T_LOGICAL_AND");
  IElementType T_LOGICAL_OR = new HackTokenType("T_LOGICAL_OR");
  IElementType T_LOGICAL_XOR = new HackTokenType("T_LOGICAL_XOR");
  IElementType T_LPAREN = new HackTokenType("(");
  IElementType T_METHOD_C = new HackTokenType("T_METHOD_C");
  IElementType T_MIARRAY = new HackTokenType("T_MIARRAY");
  IElementType T_MINUS = new HackTokenType("-");
  IElementType T_MINUS_EQUAL = new HackTokenType("T_MINUS_EQUAL");
  IElementType T_MOD = new HackTokenType("%");
  IElementType T_MOD_EQUAL = new HackTokenType("T_MOD_EQUAL");
  IElementType T_MSARRAY = new HackTokenType("T_MSARRAY");
  IElementType T_MUL = new HackTokenType("*");
  IElementType T_MUL_EQUAL = new HackTokenType("T_MUL_EQUAL");
  IElementType T_NAMESPACE = new HackTokenType("T_NAMESPACE");
  IElementType T_NEGATE = new HackTokenType("!");
  IElementType T_NEW = new HackTokenType("T_NEW");
  IElementType T_NEWTYPE = new HackTokenType("T_NEWTYPE");
  IElementType T_NOT = new HackTokenType("~");
  IElementType T_NS_C = new HackTokenType("T_NS_C");
  IElementType T_NS_SEPARATOR = new HackTokenType("T_NS_SEPARATOR");
  IElementType T_NUM_STRING = new HackTokenType("T_NUM_STRING");
  IElementType T_OBJECT_CAST = new HackTokenType("T_OBJECT_CAST");
  IElementType T_OBJECT_OPERATOR = new HackTokenType("T_OBJECT_OPERATOR");
  IElementType T_ON = new HackTokenType("T_ON");
  IElementType T_ONUMBER = new HackTokenType("T_ONUMBER");
  IElementType T_OPEN_TAG = new HackTokenType("T_OPEN_TAG");
  IElementType T_OR = new HackTokenType("|");
  IElementType T_ORDERBY = new HackTokenType("T_ORDERBY");
  IElementType T_OR_EQUAL = new HackTokenType("T_OR_EQUAL");
  IElementType T_PLUS = new HackTokenType("+");
  IElementType T_PLUS_EQUAL = new HackTokenType("T_PLUS_EQUAL");
  IElementType T_POW = new HackTokenType("T_POW");
  IElementType T_POW_EQUAL = new HackTokenType("T_POW_EQUAL");
  IElementType T_PRINT = new HackTokenType("T_PRINT");
  IElementType T_PRIVATE = new HackTokenType("T_PRIVATE");
  IElementType T_PROTECTED = new HackTokenType("T_PROTECTED");
  IElementType T_PUBLIC = new HackTokenType("T_PUBLIC");
  IElementType T_QUEST = new HackTokenType("?");
  IElementType T_RBRACE = new HackTokenType("}");
  IElementType T_RBRACKET = new HackTokenType("]");
  IElementType T_REQUIRE = new HackTokenType("T_REQUIRE");
  IElementType T_REQUIRE_ONCE = new HackTokenType("T_REQUIRE_ONCE");
  IElementType T_RETURN = new HackTokenType("T_RETURN");
  IElementType T_RPAREN = new HackTokenType(")");
  IElementType T_SELECT = new HackTokenType("T_SELECT");
  IElementType T_SEMICOLON = new HackTokenType(";");
  IElementType T_SHAPE = new HackTokenType("T_SHAPE");
  IElementType T_SILENCE = new HackTokenType("@");
  IElementType T_SINGLE_QUOTE = new HackTokenType("'");
  IElementType T_SL = new HackTokenType("T_SL");
  IElementType T_SL_EQUAL = new HackTokenType("T_SL_EQUAL");
  IElementType T_SR = new HackTokenType("T_SR");
  IElementType T_SR_EQUAL = new HackTokenType("T_SR_EQUAL");
  IElementType T_START_HEREDOC = new HackTokenType("T_START_HEREDOC");
  IElementType T_STATIC = new HackTokenType("T_STATIC");
  IElementType T_STRING = new HackTokenType("T_STRING");
  IElementType T_STRING_CAST = new HackTokenType("T_STRING_CAST");
  IElementType T_STRING_VARNAME = new HackTokenType("T_STRING_VARNAME");
  IElementType T_SWITCH = new HackTokenType("T_SWITCH");
  IElementType T_THROW = new HackTokenType("T_THROW");
  IElementType T_TRAIT = new HackTokenType("T_TRAIT");
  IElementType T_TRAIT_C = new HackTokenType("T_TRAIT_C");
  IElementType T_TRY = new HackTokenType("T_TRY");
  IElementType T_TYPE = new HackTokenType("T_TYPE");
  IElementType T_TYPELIST_GT = new HackTokenType("T_TYPELIST_GT");
  IElementType T_TYPELIST_LT = new HackTokenType("T_TYPELIST_LT");
  IElementType T_UNSET = new HackTokenType("T_UNSET");
  IElementType T_UNSET_CAST = new HackTokenType("T_UNSET_CAST");
  IElementType T_USE = new HackTokenType("T_USE");
  IElementType T_VAR = new HackTokenType("T_VAR");
  IElementType T_VARIABLE = new HackTokenType("T_VARIABLE");
  IElementType T_VARRAY = new HackTokenType("T_VARRAY");
  IElementType T_WHERE = new HackTokenType("T_WHERE");
  IElementType T_WHILE = new HackTokenType("T_WHILE");
  IElementType T_XHP_ATTRIBUTE = new HackTokenType("T_XHP_ATTRIBUTE");
  IElementType T_XHP_CATEGORY = new HackTokenType("T_XHP_CATEGORY");
  IElementType T_XHP_CATEGORY_LABEL = new HackTokenType("T_XHP_CATEGORY_LABEL");
  IElementType T_XHP_CHILDREN = new HackTokenType("T_XHP_CHILDREN");
  IElementType T_XHP_LABEL = new HackTokenType("T_XHP_LABEL");
  IElementType T_XHP_REQUIRED = new HackTokenType("T_XHP_REQUIRED");
  IElementType T_XHP_TAG_GT = new HackTokenType("T_XHP_TAG_GT");
  IElementType T_XHP_TAG_LT = new HackTokenType("T_XHP_TAG_LT");
  IElementType T_XHP_TEXT = new HackTokenType("T_XHP_TEXT");
  IElementType T_XOR = new HackTokenType("^");
  IElementType T_XOR_EQUAL = new HackTokenType("T_XOR_EQUAL");
  IElementType T_YIELD = new HackTokenType("T_YIELD");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADDITIONAL_CATCHES) {
        return new HackAdditionalCatchesImpl(node);
      }
      else if (type == ARRAY_ACCESS) {
        return new HackArrayAccessImpl(node);
      }
      else if (type == ARRAY_LITERAL) {
        return new HackArrayLiteralImpl(node);
      }
      else if (type == ARRAY_PAIR_LIST) {
        return new HackArrayPairListImpl(node);
      }
      else if (type == ASSIGNMENT_LIST) {
        return new HackAssignmentListImpl(node);
      }
      else if (type == ATTRIBUTE_STATIC_SCALAR_LIST) {
        return new HackAttributeStaticScalarListImpl(node);
      }
      else if (type == AWAIT_ASSIGN_EXPR) {
        return new HackAwaitAssignExprImpl(node);
      }
      else if (type == AWAIT_EXPR) {
        return new HackAwaitExprImpl(node);
      }
      else if (type == AWAIT_LIST_ASSIGN_EXPR) {
        return new HackAwaitListAssignExprImpl(node);
      }
      else if (type == BACKTICKS_EXPR) {
        return new HackBackticksExprImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new HackBreakStatementImpl(node);
      }
      else if (type == CALLABLE_VARIABLE) {
        return new HackCallableVariableImpl(node);
      }
      else if (type == CASE_BLOCK) {
        return new HackCaseBlockImpl(node);
      }
      else if (type == CASE_LIST) {
        return new HackCaseListImpl(node);
      }
      else if (type == CASE_SEPARATOR) {
        return new HackCaseSeparatorImpl(node);
      }
      else if (type == CLASS_CONSTANT) {
        return new HackClassConstantImpl(node);
      }
      else if (type == CLASS_CONSTANT_DECLARATION) {
        return new HackClassConstantDeclarationImpl(node);
      }
      else if (type == CLASS_DECLARATION_STATEMENT) {
        return new HackClassDeclarationStatementImpl(node);
      }
      else if (type == CLASS_DECL_NAME) {
        return new HackClassDeclNameImpl(node);
      }
      else if (type == CLASS_ENTRY_TYPE) {
        return new HackClassEntryTypeImpl(node);
      }
      else if (type == CLASS_METHOD_CALL) {
        return new HackClassMethodCallImpl(node);
      }
      else if (type == CLASS_NAMESPACE_STRING_TYPEARGS) {
        return new HackClassNamespaceStringTypeargsImpl(node);
      }
      else if (type == CLASS_NAME_REFERENCE) {
        return new HackClassNameReferenceImpl(node);
      }
      else if (type == CLASS_STATEMENT) {
        return new HackClassStatementImpl(node);
      }
      else if (type == CLASS_STATEMENT_LIST) {
        return new HackClassStatementListImpl(node);
      }
      else if (type == CLASS_VARIABLE_DECLARATION) {
        return new HackClassVariableDeclarationImpl(node);
      }
      else if (type == CLOSURE_EXPRESSION) {
        return new HackClosureExpressionImpl(node);
      }
      else if (type == COLLECTION_INIT) {
        return new HackCollectionInitImpl(node);
      }
      else if (type == COLLECTION_LITERAL) {
        return new HackCollectionLiteralImpl(node);
      }
      else if (type == COMMON_SCALAR) {
        return new HackCommonScalarImpl(node);
      }
      else if (type == COMMON_SCALAR_AE) {
        return new HackCommonScalarAeImpl(node);
      }
      else if (type == COMPOUND_VARIABLE) {
        return new HackCompoundVariableImpl(node);
      }
      else if (type == CONSTANT_ASSIGNMENT) {
        return new HackConstantAssignmentImpl(node);
      }
      else if (type == CONSTANT_DECLARATION) {
        return new HackConstantDeclarationImpl(node);
      }
      else if (type == CONSTANT_DECLARATION_STATEMENT) {
        return new HackConstantDeclarationStatementImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new HackContinueStatementImpl(node);
      }
      else if (type == CTOR_ARGUMENTS) {
        return new HackCtorArgumentsImpl(node);
      }
      else if (type == DECLARE_ASSIGNMENT) {
        return new HackDeclareAssignmentImpl(node);
      }
      else if (type == DECLARE_LIST) {
        return new HackDeclareListImpl(node);
      }
      else if (type == DECLARE_STATEMENT) {
        return new HackDeclareStatementImpl(node);
      }
      else if (type == DECLARE_STATEMENT_BODY) {
        return new HackDeclareStatementBodyImpl(node);
      }
      else if (type == DEFAULT_CASE_BLOCK) {
        return new HackDefaultCaseBlockImpl(node);
      }
      else if (type == DIMMABLE_VARIABLE) {
        return new HackDimmableVariableImpl(node);
      }
      else if (type == DIMMABLE_VARIABLE_ACCESS) {
        return new HackDimmableVariableAccessImpl(node);
      }
      else if (type == DIMMABLE_VARIABLE_NO_CALLS) {
        return new HackDimmableVariableNoCallsImpl(node);
      }
      else if (type == DIMMABLE_VARIABLE_NO_CALLS_ACCESS) {
        return new HackDimmableVariableNoCallsAccessImpl(node);
      }
      else if (type == DIM_EXPR) {
        return new HackDimExprImpl(node);
      }
      else if (type == DIM_EXPR_BASE) {
        return new HackDimExprBaseImpl(node);
      }
      else if (type == DIM_OFFSET) {
        return new HackDimOffsetImpl(node);
      }
      else if (type == DO_WHILE_STATEMENT) {
        return new HackDoWhileStatementImpl(node);
      }
      else if (type == ECHO_STATEMENT) {
        return new HackEchoStatementImpl(node);
      }
      else if (type == ELSEIF_BODY) {
        return new HackElseifBodyImpl(node);
      }
      else if (type == ELSEIF_LIST) {
        return new HackElseifListImpl(node);
      }
      else if (type == ELSE_SINGLE) {
        return new HackElseSingleImpl(node);
      }
      else if (type == ENCAPS_LIST) {
        return new HackEncapsListImpl(node);
      }
      else if (type == ENCAPS_VAR) {
        return new HackEncapsVarImpl(node);
      }
      else if (type == ENCAPS_VAR_OFFSET) {
        return new HackEncapsVarOffsetImpl(node);
      }
      else if (type == ENUM_CONSTANT_DECLARATION) {
        return new HackEnumConstantDeclarationImpl(node);
      }
      else if (type == ENUM_DECLARATION_STATEMENT) {
        return new HackEnumDeclarationStatementImpl(node);
      }
      else if (type == ENUM_STATEMENT) {
        return new HackEnumStatementImpl(node);
      }
      else if (type == ENUM_STATEMENT_LIST) {
        return new HackEnumStatementListImpl(node);
      }
      else if (type == EXIT_EXPR) {
        return new HackExitExprImpl(node);
      }
      else if (type == EXPR) {
        return new HackExprImpl(node);
      }
      else if (type == EXPR_LIST) {
        return new HackExprListImpl(node);
      }
      else if (type == EXPR_NO_VARIABLE) {
        return new HackExprNoVariableImpl(node);
      }
      else if (type == EXPR_STATEMENT) {
        return new HackExprStatementImpl(node);
      }
      else if (type == EXPR_WITH_PARENS) {
        return new HackExprWithParensImpl(node);
      }
      else if (type == EXTENDS_FROM) {
        return new HackExtendsFromImpl(node);
      }
      else if (type == FINALLY_STATEMENT_LIST) {
        return new HackFinallyStatementListImpl(node);
      }
      else if (type == FOREACH_OPTIONAL_ARG) {
        return new HackForeachOptionalArgImpl(node);
      }
      else if (type == FOREACH_STATEMENT) {
        return new HackForeachStatementImpl(node);
      }
      else if (type == FOREACH_STATEMENT_BODY) {
        return new HackForeachStatementBodyImpl(node);
      }
      else if (type == FOREACH_VARIABLE) {
        return new HackForeachVariableImpl(node);
      }
      else if (type == FOR_EXPR) {
        return new HackForExprImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new HackForStatementImpl(node);
      }
      else if (type == FOR_STATEMENT_BODY) {
        return new HackForStatementBodyImpl(node);
      }
      else if (type == FROM_CLAUSE) {
        return new HackFromClauseImpl(node);
      }
      else if (type == FULLY_QUALIFIED_CLASS_NAME) {
        return new HackFullyQualifiedClassNameImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new HackFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_CALL_PARAMETER_LIST) {
        return new HackFunctionCallParameterListImpl(node);
      }
      else if (type == FUNCTION_DECLARATION_STATEMENT) {
        return new HackFunctionDeclarationStatementImpl(node);
      }
      else if (type == FUNCTION_LOC) {
        return new HackFunctionLocImpl(node);
      }
      else if (type == GLOBAL_STATEMENT) {
        return new HackGlobalStatementImpl(node);
      }
      else if (type == GLOBAL_VAR) {
        return new HackGlobalVarImpl(node);
      }
      else if (type == GLOBAL_VAR_LIST) {
        return new HackGlobalVarListImpl(node);
      }
      else if (type == GOTO_STATEMENT) {
        return new HackGotoStatementImpl(node);
      }
      else if (type == GROUP_CLAUSE) {
        return new HackGroupClauseImpl(node);
      }
      else if (type == HALT_COMPILER_STATEMENT) {
        return new HackHaltCompilerStatementImpl(node);
      }
      else if (type == HH_FUNC_TYPE_LIST) {
        return new HackHhFuncTypeListImpl(node);
      }
      else if (type == HH_NAME_WITH_TYPE) {
        return new HackHhNameWithTypeImpl(node);
      }
      else if (type == HH_NAME_WITH_TYPEVAR) {
        return new HackHhNameWithTypevarImpl(node);
      }
      else if (type == HH_NON_EMPTY_SHAPE_MEMBER_LIST) {
        return new HackHhNonEmptyShapeMemberListImpl(node);
      }
      else if (type == HH_NON_EMPTY_TYPE_LIST) {
        return new HackHhNonEmptyTypeListImpl(node);
      }
      else if (type == HH_NULL_TYPE) {
        return new HackHhNullTypeImpl(node);
      }
      else if (type == HH_OPT_CONSTRAINT) {
        return new HackHhOptConstraintImpl(node);
      }
      else if (type == HH_OPT_RETURN_TYPE) {
        return new HackHhOptReturnTypeImpl(node);
      }
      else if (type == HH_POSSIBLE_COMMA) {
        return new HackHhPossibleCommaImpl(node);
      }
      else if (type == HH_SHAPE_MEMBER_LIST) {
        return new HackHhShapeMemberListImpl(node);
      }
      else if (type == HH_SHAPE_MEMBER_TYPE) {
        return new HackHhShapeMemberTypeImpl(node);
      }
      else if (type == HH_SHAPE_TYPE) {
        return new HackHhShapeTypeImpl(node);
      }
      else if (type == HH_TYPE) {
        return new HackHhTypeImpl(node);
      }
      else if (type == HH_TYPEARGS_OPT) {
        return new HackHhTypeargsOptImpl(node);
      }
      else if (type == HH_TYPEVAR_LIST) {
        return new HackHhTypevarListImpl(node);
      }
      else if (type == HH_TYPEVAR_VARIANCE) {
        return new HackHhTypevarVarianceImpl(node);
      }
      else if (type == HH_TYPE_ALIAS_STATEMENT) {
        return new HackHhTypeAliasStatementImpl(node);
      }
      else if (type == HH_TYPE_LIST) {
        return new HackHhTypeListImpl(node);
      }
      else if (type == HH_TYPE_OPT) {
        return new HackHhTypeOptImpl(node);
      }
      else if (type == HTML_STATEMENT) {
        return new HackHtmlStatementImpl(node);
      }
      else if (type == IDENT) {
        return new HackIdentImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new HackIfStatementImpl(node);
      }
      else if (type == IMPLEMENTS_LIST) {
        return new HackImplementsListImpl(node);
      }
      else if (type == INNER_STATEMENT) {
        return new HackInnerStatementImpl(node);
      }
      else if (type == INNER_STATEMENT_LIST) {
        return new HackInnerStatementListImpl(node);
      }
      else if (type == INTERFACE_DECL_NAME) {
        return new HackInterfaceDeclNameImpl(node);
      }
      else if (type == INTERFACE_EXTENDS_LIST) {
        return new HackInterfaceExtendsListImpl(node);
      }
      else if (type == INTERFACE_LIST) {
        return new HackInterfaceListImpl(node);
      }
      else if (type == INTERNAL_FUNCTIONS) {
        return new HackInternalFunctionsImpl(node);
      }
      else if (type == IS_REFERENCE) {
        return new HackIsReferenceImpl(node);
      }
      else if (type == JOIN_CLAUSE) {
        return new HackJoinClauseImpl(node);
      }
      else if (type == JOIN_INTO_CLAUSE) {
        return new HackJoinIntoClauseImpl(node);
      }
      else if (type == LABEL_STATEMENT) {
        return new HackLabelStatementImpl(node);
      }
      else if (type == LAMBDA_BODY) {
        return new HackLambdaBodyImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION) {
        return new HackLambdaExpressionImpl(node);
      }
      else if (type == LAMBDA_USE_VARS) {
        return new HackLambdaUseVarsImpl(node);
      }
      else if (type == LET_CLAUSE) {
        return new HackLetClauseImpl(node);
      }
      else if (type == LEXICAL_VAR_LIST) {
        return new HackLexicalVarListImpl(node);
      }
      else if (type == MAP_ARRAY_INIT) {
        return new HackMapArrayInitImpl(node);
      }
      else if (type == MAP_ARRAY_LITERAL) {
        return new HackMapArrayLiteralImpl(node);
      }
      else if (type == MEMBER_MODIFIER) {
        return new HackMemberModifierImpl(node);
      }
      else if (type == METHOD_BODY) {
        return new HackMethodBodyImpl(node);
      }
      else if (type == METHOD_MODIFIERS) {
        return new HackMethodModifiersImpl(node);
      }
      else if (type == NAMESPACE_NAME) {
        return new HackNamespaceNameImpl(node);
      }
      else if (type == NAMESPACE_STATEMENT) {
        return new HackNamespaceStatementImpl(node);
      }
      else if (type == NAMESPACE_STRING) {
        return new HackNamespaceStringImpl(node);
      }
      else if (type == NAMESPACE_STRING_BASE) {
        return new HackNamespaceStringBaseImpl(node);
      }
      else if (type == NAMESPACE_STRING_TYPEARGS) {
        return new HackNamespaceStringTypeargsImpl(node);
      }
      else if (type == NEW_ELSEIF_BODY) {
        return new HackNewElseifBodyImpl(node);
      }
      else if (type == NEW_ELSEIF_LIST) {
        return new HackNewElseifListImpl(node);
      }
      else if (type == NEW_ELSE_SINGLE) {
        return new HackNewElseSingleImpl(node);
      }
      else if (type == NON_EMPTY_ARRAY_PAIR_LIST) {
        return new HackNonEmptyArrayPairListImpl(node);
      }
      else if (type == NON_EMPTY_COLLECTION_INIT) {
        return new HackNonEmptyCollectionInitImpl(node);
      }
      else if (type == NON_EMPTY_FCALL_PARAMETER_LIST) {
        return new HackNonEmptyFcallParameterListImpl(node);
      }
      else if (type == NON_EMPTY_MAP_ARRAY_INIT) {
        return new HackNonEmptyMapArrayInitImpl(node);
      }
      else if (type == NON_EMPTY_MEMBER_MODIFIERS) {
        return new HackNonEmptyMemberModifiersImpl(node);
      }
      else if (type == NON_EMPTY_SHAPE_PAIR_LIST) {
        return new HackNonEmptyShapePairListImpl(node);
      }
      else if (type == NON_EMPTY_STATIC_ARRAY_PAIR_LIST) {
        return new HackNonEmptyStaticArrayPairListImpl(node);
      }
      else if (type == NON_EMPTY_STATIC_ARRAY_PAIR_LIST_AE) {
        return new HackNonEmptyStaticArrayPairListAeImpl(node);
      }
      else if (type == NON_EMPTY_STATIC_COLLECTION_INIT) {
        return new HackNonEmptyStaticCollectionInitImpl(node);
      }
      else if (type == NON_EMPTY_STATIC_MAP_ARRAY_INIT) {
        return new HackNonEmptyStaticMapArrayInitImpl(node);
      }
      else if (type == NON_EMPTY_STATIC_SCALAR_LIST_AE) {
        return new HackNonEmptyStaticScalarListAeImpl(node);
      }
      else if (type == NON_EMPTY_STATIC_SHAPE_PAIR_LIST) {
        return new HackNonEmptyStaticShapePairListImpl(node);
      }
      else if (type == NON_EMPTY_STATIC_SHAPE_PAIR_LIST_AE) {
        return new HackNonEmptyStaticShapePairListAeImpl(node);
      }
      else if (type == NON_EMPTY_STATIC_VARRAY_INIT) {
        return new HackNonEmptyStaticVarrayInitImpl(node);
      }
      else if (type == NON_EMPTY_USER_ATTRIBUTES) {
        return new HackNonEmptyUserAttributesImpl(node);
      }
      else if (type == NON_EMPTY_USER_ATTRIBUTE_LIST) {
        return new HackNonEmptyUserAttributeListImpl(node);
      }
      else if (type == NON_EMPTY_VARRAY_INIT) {
        return new HackNonEmptyVarrayInitImpl(node);
      }
      else if (type == OBJECT_METHOD_CALL) {
        return new HackObjectMethodCallImpl(node);
      }
      else if (type == OPTIONAL_FINALLY) {
        return new HackOptionalFinallyImpl(node);
      }
      else if (type == OPTIONAL_USER_ATTRIBUTES) {
        return new HackOptionalUserAttributesImpl(node);
      }
      else if (type == ORDERBY_CLAUSE) {
        return new HackOrderbyClauseImpl(node);
      }
      else if (type == ORDERING) {
        return new HackOrderingImpl(node);
      }
      else if (type == ORDERINGS) {
        return new HackOrderingsImpl(node);
      }
      else if (type == ORDERING_DIRECTION) {
        return new HackOrderingDirectionImpl(node);
      }
      else if (type == PARAMETER_ITEM) {
        return new HackParameterItemImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new HackParameterListImpl(node);
      }
      else if (type == PARAMETER_MODIFIER) {
        return new HackParameterModifierImpl(node);
      }
      else if (type == PARAMETER_MODIFIERS) {
        return new HackParameterModifiersImpl(node);
      }
      else if (type == PARENTHESIS_EXPR) {
        return new HackParenthesisExprImpl(node);
      }
      else if (type == POSSIBLE_COMMA) {
        return new HackPossibleCommaImpl(node);
      }
      else if (type == PROPERTY_ACCESS) {
        return new HackPropertyAccessImpl(node);
      }
      else if (type == PROPERTY_ACCESS_WITHOUT_VARIABLES) {
        return new HackPropertyAccessWithoutVariablesImpl(node);
      }
      else if (type == QUERY_ASSIGN_EXPR) {
        return new HackQueryAssignExprImpl(node);
      }
      else if (type == QUERY_BODY) {
        return new HackQueryBodyImpl(node);
      }
      else if (type == QUERY_BODY_CLAUSE) {
        return new HackQueryBodyClauseImpl(node);
      }
      else if (type == QUERY_BODY_CLAUSES) {
        return new HackQueryBodyClausesImpl(node);
      }
      else if (type == QUERY_CONTINUATION) {
        return new HackQueryContinuationImpl(node);
      }
      else if (type == QUERY_EXPR) {
        return new HackQueryExprImpl(node);
      }
      else if (type == QUERY_HEAD) {
        return new HackQueryHeadImpl(node);
      }
      else if (type == REFERENCE_VARIABLE) {
        return new HackReferenceVariableImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new HackReturnStatementImpl(node);
      }
      else if (type == SCALAR) {
        return new HackScalarImpl(node);
      }
      else if (type == SELECT_CLAUSE) {
        return new HackSelectClauseImpl(node);
      }
      else if (type == SELECT_OR_GROUP_CLAUSE) {
        return new HackSelectOrGroupClauseImpl(node);
      }
      else if (type == SHAPE_KEYNAME) {
        return new HackShapeKeynameImpl(node);
      }
      else if (type == SHAPE_LITERAL) {
        return new HackShapeLiteralImpl(node);
      }
      else if (type == SHAPE_PAIR_LIST) {
        return new HackShapePairListImpl(node);
      }
      else if (type == SIMPLE_FUNCTION_CALL) {
        return new HackSimpleFunctionCallImpl(node);
      }
      else if (type == SIMPLE_INDIRECT_REFERENCE) {
        return new HackSimpleIndirectReferenceImpl(node);
      }
      else if (type == STATEMENT) {
        return new HackStatementImpl(node);
      }
      else if (type == STATIC_ARRAY_PAIR_LIST) {
        return new HackStaticArrayPairListImpl(node);
      }
      else if (type == STATIC_ARRAY_PAIR_LIST_AE) {
        return new HackStaticArrayPairListAeImpl(node);
      }
      else if (type == STATIC_CLASS_CONSTANT) {
        return new HackStaticClassConstantImpl(node);
      }
      else if (type == STATIC_CLASS_NAME) {
        return new HackStaticClassNameImpl(node);
      }
      else if (type == STATIC_COLLECTION_INIT) {
        return new HackStaticCollectionInitImpl(node);
      }
      else if (type == STATIC_COLLECTION_LITERAL) {
        return new HackStaticCollectionLiteralImpl(node);
      }
      else if (type == STATIC_EXPR) {
        return new HackStaticExprImpl(node);
      }
      else if (type == STATIC_MAP_ARRAY_INIT) {
        return new HackStaticMapArrayInitImpl(node);
      }
      else if (type == STATIC_MAP_ARRAY_LITERAL) {
        return new HackStaticMapArrayLiteralImpl(node);
      }
      else if (type == STATIC_NUMERIC_SCALAR_AE) {
        return new HackStaticNumericScalarAeImpl(node);
      }
      else if (type == STATIC_SCALAR_AE) {
        return new HackStaticScalarAeImpl(node);
      }
      else if (type == STATIC_SCALAR_LIST_AE) {
        return new HackStaticScalarListAeImpl(node);
      }
      else if (type == STATIC_SHAPE_PAIR_LIST) {
        return new HackStaticShapePairListImpl(node);
      }
      else if (type == STATIC_SHAPE_PAIR_LIST_AE) {
        return new HackStaticShapePairListAeImpl(node);
      }
      else if (type == STATIC_STATEMENT) {
        return new HackStaticStatementImpl(node);
      }
      else if (type == STATIC_VARRAY_INIT) {
        return new HackStaticVarrayInitImpl(node);
      }
      else if (type == STATIC_VARRAY_LITERAL) {
        return new HackStaticVarrayLiteralImpl(node);
      }
      else if (type == STATIC_VAR_LIST) {
        return new HackStaticVarListImpl(node);
      }
      else if (type == SWITCH_CASE_LIST) {
        return new HackSwitchCaseListImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new HackSwitchStatementImpl(node);
      }
      else if (type == THROW_STATEMENT) {
        return new HackThrowStatementImpl(node);
      }
      else if (type == TOP_STATEMENT_LIST) {
        return new HackTopStatementListImpl(node);
      }
      else if (type == TRAIT_ALIAS_RULE) {
        return new HackTraitAliasRuleImpl(node);
      }
      else if (type == TRAIT_ALIAS_RULE_METHOD) {
        return new HackTraitAliasRuleMethodImpl(node);
      }
      else if (type == TRAIT_DECLARATION_STATEMENT) {
        return new HackTraitDeclarationStatementImpl(node);
      }
      else if (type == TRAIT_DECL_NAME) {
        return new HackTraitDeclNameImpl(node);
      }
      else if (type == TRAIT_LIST) {
        return new HackTraitListImpl(node);
      }
      else if (type == TRAIT_PRECEDENCE_RULE) {
        return new HackTraitPrecedenceRuleImpl(node);
      }
      else if (type == TRAIT_RULES) {
        return new HackTraitRulesImpl(node);
      }
      else if (type == TRY_CATCH) {
        return new HackTryCatchImpl(node);
      }
      else if (type == TRY_FINALLY) {
        return new HackTryFinallyImpl(node);
      }
      else if (type == TRY_STATEMENT) {
        return new HackTryStatementImpl(node);
      }
      else if (type == TRY_STATEMENT_LIST) {
        return new HackTryStatementListImpl(node);
      }
      else if (type == UNSET_STATEMENT) {
        return new HackUnsetStatementImpl(node);
      }
      else if (type == USER_ATTRIBUTE_LIST) {
        return new HackUserAttributeListImpl(node);
      }
      else if (type == USE_CONST_DECLARATION) {
        return new HackUseConstDeclarationImpl(node);
      }
      else if (type == USE_CONST_DECLARATIONS) {
        return new HackUseConstDeclarationsImpl(node);
      }
      else if (type == USE_DECLARATION) {
        return new HackUseDeclarationImpl(node);
      }
      else if (type == USE_DECLARATIONS) {
        return new HackUseDeclarationsImpl(node);
      }
      else if (type == USE_FN_DECLARATION) {
        return new HackUseFnDeclarationImpl(node);
      }
      else if (type == USE_FN_DECLARATIONS) {
        return new HackUseFnDeclarationsImpl(node);
      }
      else if (type == USE_STATEMENT) {
        return new HackUseStatementImpl(node);
      }
      else if (type == VARIABLE) {
        return new HackVariableImpl(node);
      }
      else if (type == VARIABLE_LIST) {
        return new HackVariableListImpl(node);
      }
      else if (type == VARIABLE_MODIFIERS) {
        return new HackVariableModifiersImpl(node);
      }
      else if (type == VARIABLE_NO_CALLS) {
        return new HackVariableNoCallsImpl(node);
      }
      else if (type == VARIABLE_WITHOUT_OBJECTS) {
        return new HackVariableWithoutObjectsImpl(node);
      }
      else if (type == VARRAY_INIT) {
        return new HackVarrayInitImpl(node);
      }
      else if (type == VARRAY_LITERAL) {
        return new HackVarrayLiteralImpl(node);
      }
      else if (type == WHERE_CLAUSE) {
        return new HackWhereClauseImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new HackWhileStatementImpl(node);
      }
      else if (type == WHILE_STATEMENT_BODY) {
        return new HackWhileStatementBodyImpl(node);
      }
      else if (type == XHP_ATTRIBUTES) {
        return new HackXhpAttributesImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_DECL) {
        return new HackXhpAttributeDeclImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_DECL_TYPE) {
        return new HackXhpAttributeDeclTypeImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_DEFAULT) {
        return new HackXhpAttributeDefaultImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_ENUM) {
        return new HackXhpAttributeEnumImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_IS_REQUIRED) {
        return new HackXhpAttributeIsRequiredImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_NAME) {
        return new HackXhpAttributeNameImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_STMT) {
        return new HackXhpAttributeStmtImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_VALUE) {
        return new HackXhpAttributeValueImpl(node);
      }
      else if (type == XHP_BAREWORD) {
        return new HackXhpBarewordImpl(node);
      }
      else if (type == XHP_CATEGORY_DECL) {
        return new HackXhpCategoryDeclImpl(node);
      }
      else if (type == XHP_CATEGORY_STMT) {
        return new HackXhpCategoryStmtImpl(node);
      }
      else if (type == XHP_CHILD) {
        return new HackXhpChildImpl(node);
      }
      else if (type == XHP_CHILDREN) {
        return new HackXhpChildrenImpl(node);
      }
      else if (type == XHP_CHILDREN_DECL_EXPR) {
        return new HackXhpChildrenDeclExprImpl(node);
      }
      else if (type == XHP_CHILDREN_DECL_TAG) {
        return new HackXhpChildrenDeclTagImpl(node);
      }
      else if (type == XHP_CHILDREN_PAREN_EXPR) {
        return new HackXhpChildrenParenExprImpl(node);
      }
      else if (type == XHP_CHILDREN_STMT) {
        return new HackXhpChildrenStmtImpl(node);
      }
      else if (type == XHP_LABEL_WS) {
        return new HackXhpLabelWsImpl(node);
      }
      else if (type == XHP_OPT_END_LABEL) {
        return new HackXhpOptEndLabelImpl(node);
      }
      else if (type == XHP_TAG) {
        return new HackXhpTagImpl(node);
      }
      else if (type == XHP_TAG_BODY) {
        return new HackXhpTagBodyImpl(node);
      }
      else if (type == YIELD_ASSIGN_EXPR) {
        return new HackYieldAssignExprImpl(node);
      }
      else if (type == YIELD_EXPR) {
        return new HackYieldExprImpl(node);
      }
      else if (type == YIELD_LIST_ASSIGN_EXPR) {
        return new HackYieldListAssignExprImpl(node);
      }
      else if (type == YIELD_STATEMENT) {
        return new HackYieldStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
