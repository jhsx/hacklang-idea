// This is a generated file. Not intended for manual editing.
package io.github.josehsantos.hack.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.github.josehsantos.hack.lang.HackTokenType;
import io.github.josehsantos.hack.lang.psi.impl.*;

public interface HackTypes {

  IElementType ADDITIVE_OR_CONCATENATION_EXPRESSION = new HackTokenType("ADDITIVE_OR_CONCATENATION_EXPRESSION");
  IElementType ADDITIVE_OR_CONCATENATION_OPERATOR = new HackTokenType("ADDITIVE_OR_CONCATENATION_OPERATOR");
  IElementType ARRAY_ACCESS = new HackTokenType("ARRAY_ACCESS");
  IElementType ARRAY_LITERAL_EXPRESSION = new HackTokenType("ARRAY_LITERAL_EXPRESSION");
  IElementType ARRAY_OFFSET_ACCESS = new HackTokenType("ARRAY_OFFSET_ACCESS");
  IElementType ARRAY_PAIR_ITEM = new HackTokenType("ARRAY_PAIR_ITEM");
  IElementType ARRAY_PAIR_LIST = new HackTokenType("ARRAY_PAIR_LIST");
  IElementType ARRAY_TYPE = new HackTokenType("ARRAY_TYPE");
  IElementType ASSIGNMENT_EXPRESSION = new HackTokenType("ASSIGNMENT_EXPRESSION");
  IElementType ASSIGNMENT_LIST = new HackTokenType("ASSIGNMENT_LIST");
  IElementType ATTRIBUTE_STATIC_SCALAR_LIST = new HackTokenType("ATTRIBUTE_STATIC_SCALAR_LIST");
  IElementType AWAIT_ASSIGN_EXPRESSION = new HackTokenType("AWAIT_ASSIGN_EXPRESSION");
  IElementType AWAIT_EXPRESSION = new HackTokenType("AWAIT_EXPRESSION");
  IElementType AWAIT_LIST_ASSIGN_EXPRESSION = new HackTokenType("AWAIT_LIST_ASSIGN_EXPRESSION");
  IElementType BACKTICKS_EXPRESSION = new HackTokenType("BACKTICKS_EXPRESSION");
  IElementType BITWISE_EXPRESSION = new HackTokenType("BITWISE_EXPRESSION");
  IElementType BITWISE_OPERATOR = new HackTokenType("BITWISE_OPERATOR");
  IElementType BLOCK_STATEMENT = new HackTokenType("BLOCK_STATEMENT");
  IElementType BREAK_STATEMENT = new HackTokenType("BREAK_STATEMENT");
  IElementType CALLABLE_FUNCTION_CALL_EXPRESSION = new HackTokenType("CALLABLE_FUNCTION_CALL_EXPRESSION");
  IElementType CALLABLE_TYPE = new HackTokenType("CALLABLE_TYPE");
  IElementType CALLABLE_VARIABLE = new HackTokenType("CALLABLE_VARIABLE");
  IElementType CALLING_PARAMETER_ITEM = new HackTokenType("CALLING_PARAMETER_ITEM");
  IElementType CASE_BLOCK = new HackTokenType("CASE_BLOCK");
  IElementType CASE_LIST = new HackTokenType("CASE_LIST");
  IElementType CASE_SEPARATOR = new HackTokenType("CASE_SEPARATOR");
  IElementType CAST_EXPRESSION = new HackTokenType("CAST_EXPRESSION");
  IElementType CAST_OPERATOR = new HackTokenType("CAST_OPERATOR");
  IElementType CLASS_CONSTANT = new HackTokenType("CLASS_CONSTANT");
  IElementType CLASS_DECLARATION_STATEMENT = new HackTokenType("CLASS_DECLARATION_STATEMENT");
  IElementType CLASS_METHOD_CALL_EXPRESSION = new HackTokenType("CLASS_METHOD_CALL_EXPRESSION");
  IElementType CLASS_NAME_REFERENCE = new HackTokenType("CLASS_NAME_REFERENCE");
  IElementType CLASS_STATEMENT = new HackTokenType("CLASS_STATEMENT");
  IElementType CLASS_STATEMENT_BLOCK = new HackTokenType("CLASS_STATEMENT_BLOCK");
  IElementType CLASS_STATEMENT_LIST = new HackTokenType("CLASS_STATEMENT_LIST");
  IElementType CLASS_VARIABLE_DECLARATION = new HackTokenType("CLASS_VARIABLE_DECLARATION");
  IElementType CLASS_VARIABLE_DECLARATIONS = new HackTokenType("CLASS_VARIABLE_DECLARATIONS");
  IElementType CLONE_EXPRESSION = new HackTokenType("CLONE_EXPRESSION");
  IElementType CLOSURE_EXPRESSION = new HackTokenType("CLOSURE_EXPRESSION");
  IElementType CLOSURE_FUNCTION = new HackTokenType("CLOSURE_FUNCTION");
  IElementType COLLECTION_LITERAL_EXPRESSION = new HackTokenType("COLLECTION_LITERAL_EXPRESSION");
  IElementType COMPARATIVE_EXPRESSION = new HackTokenType("COMPARATIVE_EXPRESSION");
  IElementType COMPARATIVE_OPERATOR = new HackTokenType("COMPARATIVE_OPERATOR");
  IElementType CONSTANT_ASSIGNMENT = new HackTokenType("CONSTANT_ASSIGNMENT");
  IElementType CONSTANT_DECLARATION = new HackTokenType("CONSTANT_DECLARATION");
  IElementType CONSTANT_DECLARATION_STATEMENT = new HackTokenType("CONSTANT_DECLARATION_STATEMENT");
  IElementType CONTINUE_STATEMENT = new HackTokenType("CONTINUE_STATEMENT");
  IElementType CTOR_ARGUMENTS = new HackTokenType("CTOR_ARGUMENTS");
  IElementType DECLARE_ASSIGNMENT = new HackTokenType("DECLARE_ASSIGNMENT");
  IElementType DECLARE_LIST = new HackTokenType("DECLARE_LIST");
  IElementType DECLARE_NEW_STATEMENT = new HackTokenType("DECLARE_NEW_STATEMENT");
  IElementType DECLARE_STATEMENT = new HackTokenType("DECLARE_STATEMENT");
  IElementType DECLARE_STATEMENT_BODY = new HackTokenType("DECLARE_STATEMENT_BODY");
  IElementType DEFAULT_CASE_BLOCK = new HackTokenType("DEFAULT_CASE_BLOCK");
  IElementType DIMMABLE_VARIABLE_ACCESS_EXPRESSION = new HackTokenType("DIMMABLE_VARIABLE_ACCESS_EXPRESSION");
  IElementType DIM_EXPRESSION = new HackTokenType("DIM_EXPRESSION");
  IElementType DIM_EXPRESSION_BASE = new HackTokenType("DIM_EXPRESSION_BASE");
  IElementType DOUBLE_QUOTES_STRING = new HackTokenType("DOUBLE_QUOTES_STRING");
  IElementType DO_WHILE_STATEMENT = new HackTokenType("DO_WHILE_STATEMENT");
  IElementType ECHO_STATEMENT = new HackTokenType("ECHO_STATEMENT");
  IElementType ELSEIF_BODY = new HackTokenType("ELSEIF_BODY");
  IElementType ELSEIF_LIST = new HackTokenType("ELSEIF_LIST");
  IElementType ELSE_SINGLE = new HackTokenType("ELSE_SINGLE");
  IElementType EMPTY_EXPRESSION = new HackTokenType("EMPTY_EXPRESSION");
  IElementType ENCAPS_BRACE_EXPRESSION = new HackTokenType("ENCAPS_BRACE_EXPRESSION");
  IElementType ENCAPS_BRACE_INDEX_OFFSET_EXPRESSION = new HackTokenType("ENCAPS_BRACE_INDEX_OFFSET_EXPRESSION");
  IElementType ENCAPS_EXPRESSION = new HackTokenType("ENCAPS_EXPRESSION");
  IElementType ENCAPS_FIELD_ACCESS_EXPRESSION = new HackTokenType("ENCAPS_FIELD_ACCESS_EXPRESSION");
  IElementType ENCAPS_INDEX_OFFSET_EXPRESSION = new HackTokenType("ENCAPS_INDEX_OFFSET_EXPRESSION");
  IElementType ENCAPS_LIST = new HackTokenType("ENCAPS_LIST");
  IElementType ENCAPS_VAR = new HackTokenType("ENCAPS_VAR");
  IElementType ENCAPS_VAR_OFFSET = new HackTokenType("ENCAPS_VAR_OFFSET");
  IElementType ENUM_CONSTANT_DECLARATION = new HackTokenType("ENUM_CONSTANT_DECLARATION");
  IElementType ENUM_DECLARATION_STATEMENT = new HackTokenType("ENUM_DECLARATION_STATEMENT");
  IElementType ENUM_STATEMENT = new HackTokenType("ENUM_STATEMENT");
  IElementType ENUM_STATEMENT_LIST = new HackTokenType("ENUM_STATEMENT_LIST");
  IElementType ESPECIAL_PARENTHESISED_EXPRESSION = new HackTokenType("ESPECIAL_PARENTHESISED_EXPRESSION");
  IElementType EVAL_EXPRESSION = new HackTokenType("EVAL_EXPRESSION");
  IElementType EXIT_EXPRESSION = new HackTokenType("EXIT_EXPRESSION");
  IElementType EXPRESSION_LIST = new HackTokenType("EXPRESSION_LIST");
  IElementType EXPRESSION_STATEMENT = new HackTokenType("EXPRESSION_STATEMENT");
  IElementType EXPRESSION_VARIABLE = new HackTokenType("EXPRESSION_VARIABLE");
  IElementType EXTENDS_FROM = new HackTokenType("EXTENDS_FROM");
  IElementType FOREACH_LIST_ASSIGNMENT = new HackTokenType("FOREACH_LIST_ASSIGNMENT");
  IElementType FOREACH_NEW_STATEMENT = new HackTokenType("FOREACH_NEW_STATEMENT");
  IElementType FOREACH_OPTIONAL_ARG = new HackTokenType("FOREACH_OPTIONAL_ARG");
  IElementType FOREACH_STATEMENT = new HackTokenType("FOREACH_STATEMENT");
  IElementType FOREACH_STATEMENT_BODY = new HackTokenType("FOREACH_STATEMENT_BODY");
  IElementType FOREACH_VARIABLE = new HackTokenType("FOREACH_VARIABLE");
  IElementType FOR_NEW_STATEMENT = new HackTokenType("FOR_NEW_STATEMENT");
  IElementType FOR_STATEMENT = new HackTokenType("FOR_STATEMENT");
  IElementType FOR_STATEMENT_BODY = new HackTokenType("FOR_STATEMENT_BODY");
  IElementType FROM_CLAUSE = new HackTokenType("FROM_CLAUSE");
  IElementType FULLY_QUALIFIED_CLASS_NAME = new HackTokenType("FULLY_QUALIFIED_CLASS_NAME");
  IElementType FUNCTION_BODY = new HackTokenType("FUNCTION_BODY");
  IElementType FUNCTION_CALL_PARAMETER_LIST = new HackTokenType("FUNCTION_CALL_PARAMETER_LIST");
  IElementType FUNCTION_DECLARATION = new HackTokenType("FUNCTION_DECLARATION");
  IElementType FUNCTION_DECLARATION_STATEMENT = new HackTokenType("FUNCTION_DECLARATION_STATEMENT");
  IElementType FUNCTION_TYPE = new HackTokenType("FUNCTION_TYPE");
  IElementType FUNC_TYPE_LIST = new HackTokenType("FUNC_TYPE_LIST");
  IElementType GLOBAL_STATEMENT = new HackTokenType("GLOBAL_STATEMENT");
  IElementType GLOBAL_VAR = new HackTokenType("GLOBAL_VAR");
  IElementType GLOBAL_VAR_LIST = new HackTokenType("GLOBAL_VAR_LIST");
  IElementType GOTO_STATEMENT = new HackTokenType("GOTO_STATEMENT");
  IElementType GROUP_CLAUSE = new HackTokenType("GROUP_CLAUSE");
  IElementType HALT_COMPILER_STATEMENT = new HackTokenType("HALT_COMPILER_STATEMENT");
  IElementType HERE_DOC_STRING = new HackTokenType("HERE_DOC_STRING");
  IElementType HTML_STATEMENT = new HackTokenType("HTML_STATEMENT");
  IElementType IDENTIFIER = new HackTokenType("IDENTIFIER");
  IElementType IDENTIFIER_TYPE = new HackTokenType("IDENTIFIER_TYPE");
  IElementType IF_STATEMENT = new HackTokenType("IF_STATEMENT");
  IElementType IMPLEMENTS_LIST = new HackTokenType("IMPLEMENTS_LIST");
  IElementType INCLUDE_EXPRESSION = new HackTokenType("INCLUDE_EXPRESSION");
  IElementType INNER_STATEMENT_LIST = new HackTokenType("INNER_STATEMENT_LIST");
  IElementType INSTANCEOF_EXPRESSION = new HackTokenType("INSTANCEOF_EXPRESSION");
  IElementType INTERFACE_DECLARATION_STATEMENT = new HackTokenType("INTERFACE_DECLARATION_STATEMENT");
  IElementType INTERFACE_EXTENDS_LIST = new HackTokenType("INTERFACE_EXTENDS_LIST");
  IElementType INTERFACE_LIST = new HackTokenType("INTERFACE_LIST");
  IElementType ISSET_EXPRESSION = new HackTokenType("ISSET_EXPRESSION");
  IElementType JOIN_CLAUSE = new HackTokenType("JOIN_CLAUSE");
  IElementType JOIN_INTO_CLAUSE = new HackTokenType("JOIN_INTO_CLAUSE");
  IElementType LABEL_STATEMENT = new HackTokenType("LABEL_STATEMENT");
  IElementType LAMBDA_BODY = new HackTokenType("LAMBDA_BODY");
  IElementType LAMBDA_EXPRESSION = new HackTokenType("LAMBDA_EXPRESSION");
  IElementType LAMBDA_FUNCTION = new HackTokenType("LAMBDA_FUNCTION");
  IElementType LAMBDA_USE_VARS = new HackTokenType("LAMBDA_USE_VARS");
  IElementType LET_CLAUSE = new HackTokenType("LET_CLAUSE");
  IElementType LEXICAL_VAR_LIST = new HackTokenType("LEXICAL_VAR_LIST");
  IElementType LIST_ASSIGNMENT_EXPRESSION = new HackTokenType("LIST_ASSIGNMENT_EXPRESSION");
  IElementType LIST_ASSIGNMENT_VARIABLES = new HackTokenType("LIST_ASSIGNMENT_VARIABLES");
  IElementType LITERAL_EXPRESSION = new HackTokenType("LITERAL_EXPRESSION");
  IElementType LITERAL_SCALAR_AE = new HackTokenType("LITERAL_SCALAR_AE");
  IElementType LOGICAL_EXPRESSION = new HackTokenType("LOGICAL_EXPRESSION");
  IElementType LOGICAL_OPERATOR = new HackTokenType("LOGICAL_OPERATOR");
  IElementType MAP_ARRAY_LITERAL_EXPRESSION = new HackTokenType("MAP_ARRAY_LITERAL_EXPRESSION");
  IElementType MEMBER_MODIFIER = new HackTokenType("MEMBER_MODIFIER");
  IElementType MEMBER_ONLY_ACCESS_EXPRESSION = new HackTokenType("MEMBER_ONLY_ACCESS_EXPRESSION");
  IElementType MEMBER_VARIABLE_EXPRESSION = new HackTokenType("MEMBER_VARIABLE_EXPRESSION");
  IElementType METHOD_CALL_EXPRESSION = new HackTokenType("METHOD_CALL_EXPRESSION");
  IElementType METHOD_FUNCTION_DECLARATION = new HackTokenType("METHOD_FUNCTION_DECLARATION");
  IElementType METHOD_MODIFIERS = new HackTokenType("METHOD_MODIFIERS");
  IElementType MULTIPLICATIVE_EXPRESSION = new HackTokenType("MULTIPLICATIVE_EXPRESSION");
  IElementType MULTIPLICATIVE_OPERATOR = new HackTokenType("MULTIPLICATIVE_OPERATOR");
  IElementType NAMESPACE_DECLARATION_STATEMENT = new HackTokenType("NAMESPACE_DECLARATION_STATEMENT");
  IElementType NAMESPACE_NAME = new HackTokenType("NAMESPACE_NAME");
  IElementType NAMESPACE_NAME_DECLARATION = new HackTokenType("NAMESPACE_NAME_DECLARATION");
  IElementType NAMESPACE_STRING = new HackTokenType("NAMESPACE_STRING");
  IElementType NAMESPACE_STRING_TYPEARGS = new HackTokenType("NAMESPACE_STRING_TYPEARGS");
  IElementType NAME_HOLDER = new HackTokenType("NAME_HOLDER");
  IElementType NEW_ELSEIF_BODY = new HackTokenType("NEW_ELSEIF_BODY");
  IElementType NEW_ELSEIF_LIST = new HackTokenType("NEW_ELSEIF_LIST");
  IElementType NEW_ELSE_SINGLE = new HackTokenType("NEW_ELSE_SINGLE");
  IElementType NEW_EXPRESSION = new HackTokenType("NEW_EXPRESSION");
  IElementType NEW_TYPE_DECLARATION_STATEMENT = new HackTokenType("NEW_TYPE_DECLARATION_STATEMENT");
  IElementType NULLABLE_TYPE = new HackTokenType("NULLABLE_TYPE");
  IElementType OPT_RETURN_TYPE = new HackTokenType("OPT_RETURN_TYPE");
  IElementType ORDERBY_CLAUSE = new HackTokenType("ORDERBY_CLAUSE");
  IElementType ORDERING = new HackTokenType("ORDERING");
  IElementType ORDERINGS = new HackTokenType("ORDERINGS");
  IElementType ORDERING_DIRECTION = new HackTokenType("ORDERING_DIRECTION");
  IElementType PARAMETER_ITEM = new HackTokenType("PARAMETER_ITEM");
  IElementType PARAMETER_LIST = new HackTokenType("PARAMETER_LIST");
  IElementType PARAMETER_MODIFIER = new HackTokenType("PARAMETER_MODIFIER");
  IElementType PARAMETER_MODIFIERS = new HackTokenType("PARAMETER_MODIFIERS");
  IElementType PARENTHESIZED_EXPRESSION = new HackTokenType("PARENTHESIZED_EXPRESSION");
  IElementType PREFIX_OPERATOR = new HackTokenType("PREFIX_OPERATOR");
  IElementType PRINT_EXPRESSION = new HackTokenType("PRINT_EXPRESSION");
  IElementType QUERY_ASSIGN_EXPRESSION = new HackTokenType("QUERY_ASSIGN_EXPRESSION");
  IElementType QUERY_BODY = new HackTokenType("QUERY_BODY");
  IElementType QUERY_BODY_CLAUSE = new HackTokenType("QUERY_BODY_CLAUSE");
  IElementType QUERY_BODY_CLAUSES = new HackTokenType("QUERY_BODY_CLAUSES");
  IElementType QUERY_CONTINUATION = new HackTokenType("QUERY_CONTINUATION");
  IElementType QUERY_EXPRESSION = new HackTokenType("QUERY_EXPRESSION");
  IElementType QUERY_HEAD = new HackTokenType("QUERY_HEAD");
  IElementType REQUIRE_EXPRESSION = new HackTokenType("REQUIRE_EXPRESSION");
  IElementType RETURN_STATEMENT = new HackTokenType("RETURN_STATEMENT");
  IElementType SCALAR_EXPRESSION = new HackTokenType("SCALAR_EXPRESSION");
  IElementType SELECT_CLAUSE = new HackTokenType("SELECT_CLAUSE");
  IElementType SELECT_OR_GROUP_CLAUSE = new HackTokenType("SELECT_OR_GROUP_CLAUSE");
  IElementType SEMICOLON_STATEMENT = new HackTokenType("SEMICOLON_STATEMENT");
  IElementType SHAPE_KEYNAME = new HackTokenType("SHAPE_KEYNAME");
  IElementType SHAPE_LITERAL_EXPRESSION = new HackTokenType("SHAPE_LITERAL_EXPRESSION");
  IElementType SHAPE_MEMBER_LIST = new HackTokenType("SHAPE_MEMBER_LIST");
  IElementType SHAPE_MEMBER_TYPE = new HackTokenType("SHAPE_MEMBER_TYPE");
  IElementType SHAPE_PAIR = new HackTokenType("SHAPE_PAIR");
  IElementType SHAPE_PAIR_LIST = new HackTokenType("SHAPE_PAIR_LIST");
  IElementType SHAPE_PAIR_STATIC = new HackTokenType("SHAPE_PAIR_STATIC");
  IElementType SHAPE_TYPE = new HackTokenType("SHAPE_TYPE");
  IElementType SHIFT_EXPRESSION = new HackTokenType("SHIFT_EXPRESSION");
  IElementType SHIFT_OPERATOR = new HackTokenType("SHIFT_OPERATOR");
  IElementType SIMPLE_FUNCTION_CALL_EXPRESSION = new HackTokenType("SIMPLE_FUNCTION_CALL_EXPRESSION");
  IElementType SIMPLE_VARIABLE_NAME = new HackTokenType("SIMPLE_VARIABLE_NAME");
  IElementType SINGLE_QUOTES_STRING = new HackTokenType("SINGLE_QUOTES_STRING");
  IElementType SOFT_TYPE = new HackTokenType("SOFT_TYPE");
  IElementType STATEMENT_RECOVER = new HackTokenType("STATEMENT_RECOVER");
  IElementType STATIC_ADDITIVE_OR_CONCATENATION_EXPRESSION = new HackTokenType("STATIC_ADDITIVE_OR_CONCATENATION_EXPRESSION");
  IElementType STATIC_ARRAY_EXPRESSION = new HackTokenType("STATIC_ARRAY_EXPRESSION");
  IElementType STATIC_ARRAY_ITEM = new HackTokenType("STATIC_ARRAY_ITEM");
  IElementType STATIC_ARRAY_ITEM_AE = new HackTokenType("STATIC_ARRAY_ITEM_AE");
  IElementType STATIC_ARRAY_PAIR_LIST = new HackTokenType("STATIC_ARRAY_PAIR_LIST");
  IElementType STATIC_ARRAY_PAIR_LIST_AE = new HackTokenType("STATIC_ARRAY_PAIR_LIST_AE");
  IElementType STATIC_ASSIGNMENT = new HackTokenType("STATIC_ASSIGNMENT");
  IElementType STATIC_BITWISE_EXPRESSION = new HackTokenType("STATIC_BITWISE_EXPRESSION");
  IElementType STATIC_CLASS_CONSTANT = new HackTokenType("STATIC_CLASS_CONSTANT");
  IElementType STATIC_CLASS_NAME = new HackTokenType("STATIC_CLASS_NAME");
  IElementType STATIC_CLASS_VARIABLE_EXPRESSION = new HackTokenType("STATIC_CLASS_VARIABLE_EXPRESSION");
  IElementType STATIC_COLLECTION_LITERAL = new HackTokenType("STATIC_COLLECTION_LITERAL");
  IElementType STATIC_COMPARATIVE_EXPRESSION = new HackTokenType("STATIC_COMPARATIVE_EXPRESSION");
  IElementType STATIC_EXPRESSION = new HackTokenType("STATIC_EXPRESSION");
  IElementType STATIC_LOGICAL_EXPRESSION = new HackTokenType("STATIC_LOGICAL_EXPRESSION");
  IElementType STATIC_MAP_ARRAY_LITERAL = new HackTokenType("STATIC_MAP_ARRAY_LITERAL");
  IElementType STATIC_MULTIPLICATIVE_EXPRESSION = new HackTokenType("STATIC_MULTIPLICATIVE_EXPRESSION");
  IElementType STATIC_NUMERIC_SCALAR_AE = new HackTokenType("STATIC_NUMERIC_SCALAR_AE");
  IElementType STATIC_PARENTHESIZED_EXPRESSION = new HackTokenType("STATIC_PARENTHESIZED_EXPRESSION");
  IElementType STATIC_PREFIX_EXPRESSION = new HackTokenType("STATIC_PREFIX_EXPRESSION");
  IElementType STATIC_PREFIX_OPERATOR = new HackTokenType("STATIC_PREFIX_OPERATOR");
  IElementType STATIC_SCALAR_AE = new HackTokenType("STATIC_SCALAR_AE");
  IElementType STATIC_SCALAR_LIST_AE = new HackTokenType("STATIC_SCALAR_LIST_AE");
  IElementType STATIC_SHAPE_EXPRESSION = new HackTokenType("STATIC_SHAPE_EXPRESSION");
  IElementType STATIC_SHAPE_PAIR_ITEM = new HackTokenType("STATIC_SHAPE_PAIR_ITEM");
  IElementType STATIC_SHAPE_PAIR_LIST = new HackTokenType("STATIC_SHAPE_PAIR_LIST");
  IElementType STATIC_SHAPE_PAIR_LIST_AE = new HackTokenType("STATIC_SHAPE_PAIR_LIST_AE");
  IElementType STATIC_SHIFT_EXPRESSION = new HackTokenType("STATIC_SHIFT_EXPRESSION");
  IElementType STATIC_STATEMENT = new HackTokenType("STATIC_STATEMENT");
  IElementType STATIC_TERNARY_EXPRESSION = new HackTokenType("STATIC_TERNARY_EXPRESSION");
  IElementType STATIC_VARRAY_LITERAL = new HackTokenType("STATIC_VARRAY_LITERAL");
  IElementType STATIC_VAR_LIST = new HackTokenType("STATIC_VAR_LIST");
  IElementType SUFFIX_OPERATOR = new HackTokenType("SUFFIX_OPERATOR");
  IElementType SWITCH_CASE_LIST = new HackTokenType("SWITCH_CASE_LIST");
  IElementType SWITCH_NEW_STATEMENT = new HackTokenType("SWITCH_NEW_STATEMENT");
  IElementType SWITCH_STATEMENT = new HackTokenType("SWITCH_STATEMENT");
  IElementType SWITCH_STATEMENT_LIST = new HackTokenType("SWITCH_STATEMENT_LIST");
  IElementType TERNARY_EXPRESSION = new HackTokenType("TERNARY_EXPRESSION");
  IElementType THROW_STATEMENT = new HackTokenType("THROW_STATEMENT");
  IElementType TOP_STATEMENT_LIST = new HackTokenType("TOP_STATEMENT_LIST");
  IElementType TRAIT_ALIAS_RULE = new HackTokenType("TRAIT_ALIAS_RULE");
  IElementType TRAIT_ALIAS_RULE_METHOD = new HackTokenType("TRAIT_ALIAS_RULE_METHOD");
  IElementType TRAIT_DECLARATION_STATEMENT = new HackTokenType("TRAIT_DECLARATION_STATEMENT");
  IElementType TRAIT_LIST = new HackTokenType("TRAIT_LIST");
  IElementType TRAIT_PRECEDENCE_RULE = new HackTokenType("TRAIT_PRECEDENCE_RULE");
  IElementType TRAIT_REQUIRE_DECLARATION = new HackTokenType("TRAIT_REQUIRE_DECLARATION");
  IElementType TRAIT_RULES = new HackTokenType("TRAIT_RULES");
  IElementType TRAIT_USE_DECLARATION = new HackTokenType("TRAIT_USE_DECLARATION");
  IElementType TRY_CATCH = new HackTokenType("TRY_CATCH");
  IElementType TRY_FINALLY = new HackTokenType("TRY_FINALLY");
  IElementType TRY_STATEMENT = new HackTokenType("TRY_STATEMENT");
  IElementType TUPLE_EXPRESSION = new HackTokenType("TUPLE_EXPRESSION");
  IElementType TUPLE_TYPE = new HackTokenType("TUPLE_TYPE");
  IElementType TYPEARGS = new HackTokenType("TYPEARGS");
  IElementType TYPEVAR = new HackTokenType("TYPEVAR");
  IElementType TYPEVAR_ITEM = new HackTokenType("TYPEVAR_ITEM");
  IElementType TYPEVAR_LIST = new HackTokenType("TYPEVAR_LIST");
  IElementType TYPEVAR_VARIANCE = new HackTokenType("TYPEVAR_VARIANCE");
  IElementType TYPE_DECLARATION_STATEMENT = new HackTokenType("TYPE_DECLARATION_STATEMENT");
  IElementType TYPE_LIST = new HackTokenType("TYPE_LIST");
  IElementType UNSET_STATEMENT = new HackTokenType("UNSET_STATEMENT");
  IElementType USER_ATTRIBUTE = new HackTokenType("USER_ATTRIBUTE");
  IElementType USER_ATTRIBUTES = new HackTokenType("USER_ATTRIBUTES");
  IElementType USER_ATTRIBUTE_LIST = new HackTokenType("USER_ATTRIBUTE_LIST");
  IElementType USE_DECLARATION = new HackTokenType("USE_DECLARATION");
  IElementType USE_DECLARATIONS = new HackTokenType("USE_DECLARATIONS");
  IElementType USE_DECLARATION_STATEMENT = new HackTokenType("USE_DECLARATION_STATEMENT");
  IElementType VARIABLE_EXPRESSION = new HackTokenType("VARIABLE_EXPRESSION");
  IElementType VARIABLE_EXPRESSION_VARIABLE = new HackTokenType("VARIABLE_EXPRESSION_VARIABLE");
  IElementType VARIABLE_IDENTIFIER = new HackTokenType("VARIABLE_IDENTIFIER");
  IElementType VARIABLE_LIST = new HackTokenType("VARIABLE_LIST");
  IElementType VARIABLE_MODIFIERS = new HackTokenType("VARIABLE_MODIFIERS");
  IElementType VARIABLE_NAME_HOLDER = new HackTokenType("VARIABLE_NAME_HOLDER");
  IElementType VARRAY_LITERAL_EXPRESSION = new HackTokenType("VARRAY_LITERAL_EXPRESSION");
  IElementType WHERE_CLAUSE = new HackTokenType("WHERE_CLAUSE");
  IElementType WHILE_NEW_STATEMENT = new HackTokenType("WHILE_NEW_STATEMENT");
  IElementType WHILE_STATEMENT = new HackTokenType("WHILE_STATEMENT");
  IElementType WHILE_STATEMENT_BODY = new HackTokenType("WHILE_STATEMENT_BODY");
  IElementType XHP_ATTRIBUTE = new HackTokenType("XHP_ATTRIBUTE");
  IElementType XHP_ATTRIBUTES = new HackTokenType("XHP_ATTRIBUTES");
  IElementType XHP_ATTRIBUTE_DECL = new HackTokenType("XHP_ATTRIBUTE_DECL");
  IElementType XHP_ATTRIBUTE_DECLARATION = new HackTokenType("XHP_ATTRIBUTE_DECLARATION");
  IElementType XHP_ATTRIBUTE_DECL_TYPE = new HackTokenType("XHP_ATTRIBUTE_DECL_TYPE");
  IElementType XHP_ATTRIBUTE_DEFAULT = new HackTokenType("XHP_ATTRIBUTE_DEFAULT");
  IElementType XHP_ATTRIBUTE_ENUM = new HackTokenType("XHP_ATTRIBUTE_ENUM");
  IElementType XHP_ATTRIBUTE_IS_REQUIRED = new HackTokenType("XHP_ATTRIBUTE_IS_REQUIRED");
  IElementType XHP_ATTRIBUTE_NAME = new HackTokenType("XHP_ATTRIBUTE_NAME");
  IElementType XHP_ATTRIBUTE_STMT = new HackTokenType("XHP_ATTRIBUTE_STMT");
  IElementType XHP_ATTRIBUTE_VALUE = new HackTokenType("XHP_ATTRIBUTE_VALUE");
  IElementType XHP_BAREWORD = new HackTokenType("XHP_BAREWORD");
  IElementType XHP_CATEGORY_DECLARATION = new HackTokenType("XHP_CATEGORY_DECLARATION");
  IElementType XHP_CATEGORY_STMT = new HackTokenType("XHP_CATEGORY_STMT");
  IElementType XHP_CHILD = new HackTokenType("XHP_CHILD");
  IElementType XHP_CHILDREN = new HackTokenType("XHP_CHILDREN");
  IElementType XHP_CHILDREN_DECLARATION = new HackTokenType("XHP_CHILDREN_DECLARATION");
  IElementType XHP_CHILDREN_DECL_EXPRESSION = new HackTokenType("XHP_CHILDREN_DECL_EXPRESSION");
  IElementType XHP_CHILDREN_DECL_TAG = new HackTokenType("XHP_CHILDREN_DECL_TAG");
  IElementType XHP_CHILDREN_PAREN_EXPRESSION = new HackTokenType("XHP_CHILDREN_PAREN_EXPRESSION");
  IElementType XHP_CHILDREN_STMT = new HackTokenType("XHP_CHILDREN_STMT");
  IElementType XHP_CLASS_DECLARATION_STATEMENT = new HackTokenType("XHP_CLASS_DECLARATION_STATEMENT");
  IElementType XHP_EXPRESSION = new HackTokenType("XHP_EXPRESSION");
  IElementType XHP_IDENTIFIER = new HackTokenType("XHP_IDENTIFIER");
  IElementType XHP_LABEL_WS = new HackTokenType("XHP_LABEL_WS");
  IElementType XHP_NAME_HOLDER = new HackTokenType("XHP_NAME_HOLDER");
  IElementType XHP_OPT_END_LABEL = new HackTokenType("XHP_OPT_END_LABEL");
  IElementType XHP_TAG = new HackTokenType("XHP_TAG");
  IElementType XHP_TAG_BODY = new HackTokenType("XHP_TAG_BODY");
  IElementType XHP_TYPE = new HackTokenType("XHP_TYPE");
  IElementType YIELD_ASSIGN_EXPRESSION = new HackTokenType("YIELD_ASSIGN_EXPRESSION");
  IElementType YIELD_EXPRESSION = new HackTokenType("YIELD_EXPRESSION");
  IElementType YIELD_LIST_ASSIGN_EXPRESSION = new HackTokenType("YIELD_LIST_ASSIGN_EXPRESSION");
  IElementType YIELD_STATEMENT = new HackTokenType("YIELD_STATEMENT");

  IElementType T_ABSTRACT = new HackTokenType("T_ABSTRACT");
  IElementType T_AND = new HackTokenType("&");
  IElementType T_AND_EQUAL = new HackTokenType("T_AND_EQUAL");
  IElementType T_ARRAY = new HackTokenType("T_ARRAY");
  IElementType T_ARRAY_CAST = new HackTokenType("T_ARRAY_CAST");
  IElementType T_AS = new HackTokenType("T_AS");
  IElementType T_ASCENDING = new HackTokenType("T_ASCENDING");
  IElementType T_ASYNC = new HackTokenType("T_ASYNC");
  IElementType T_AWAIT = new HackTokenType("T_AWAIT");
  IElementType T_BACK = new HackTokenType("`");
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
  IElementType T_CLOSE_TAG = new HackTokenType("T_CLOSE_TAG");
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
  IElementType T_FALSE = new HackTokenType("T_FALSE");
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
  IElementType T_LAMBDA_CP = new HackTokenType("T_LAMBDA_CP");
  IElementType T_LAMBDA_OP = new HackTokenType("T_LAMBDA_OP");
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
  IElementType T_TRUE = new HackTokenType("T_TRUE");
  IElementType T_TRY = new HackTokenType("T_TRY");
  IElementType T_TUPLE = new HackTokenType("T_TUPLE");
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
       if (type == ADDITIVE_OR_CONCATENATION_EXPRESSION) {
        return new HackAdditiveOrConcatenationExpressionImpl(node);
      }
      else if (type == ADDITIVE_OR_CONCATENATION_OPERATOR) {
        return new HackAdditiveOrConcatenationOperatorImpl(node);
      }
      else if (type == ARRAY_ACCESS) {
        return new HackArrayAccessImpl(node);
      }
      else if (type == ARRAY_LITERAL_EXPRESSION) {
        return new HackArrayLiteralExpressionImpl(node);
      }
      else if (type == ARRAY_OFFSET_ACCESS) {
        return new HackArrayOffsetAccessImpl(node);
      }
      else if (type == ARRAY_PAIR_ITEM) {
        return new HackArrayPairItemImpl(node);
      }
      else if (type == ARRAY_PAIR_LIST) {
        return new HackArrayPairListImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new HackArrayTypeImpl(node);
      }
      else if (type == ASSIGNMENT_EXPRESSION) {
        return new HackAssignmentExpressionImpl(node);
      }
      else if (type == ASSIGNMENT_LIST) {
        return new HackAssignmentListImpl(node);
      }
      else if (type == ATTRIBUTE_STATIC_SCALAR_LIST) {
        return new HackAttributeStaticScalarListImpl(node);
      }
      else if (type == AWAIT_ASSIGN_EXPRESSION) {
        return new HackAwaitAssignExpressionImpl(node);
      }
      else if (type == AWAIT_EXPRESSION) {
        return new HackAwaitExpressionImpl(node);
      }
      else if (type == AWAIT_LIST_ASSIGN_EXPRESSION) {
        return new HackAwaitListAssignExpressionImpl(node);
      }
      else if (type == BACKTICKS_EXPRESSION) {
        return new HackBackticksExpressionImpl(node);
      }
      else if (type == BITWISE_EXPRESSION) {
        return new HackBitwiseExpressionImpl(node);
      }
      else if (type == BITWISE_OPERATOR) {
        return new HackBitwiseOperatorImpl(node);
      }
      else if (type == BLOCK_STATEMENT) {
        return new HackBlockStatementImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new HackBreakStatementImpl(node);
      }
      else if (type == CALLABLE_FUNCTION_CALL_EXPRESSION) {
        return new HackCallableFunctionCallExpressionImpl(node);
      }
      else if (type == CALLABLE_TYPE) {
        return new HackCallableTypeImpl(node);
      }
      else if (type == CALLABLE_VARIABLE) {
        return new HackCallableVariableImpl(node);
      }
      else if (type == CALLING_PARAMETER_ITEM) {
        return new HackCallingParameterItemImpl(node);
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
      else if (type == CAST_EXPRESSION) {
        return new HackCastExpressionImpl(node);
      }
      else if (type == CAST_OPERATOR) {
        return new HackCastOperatorImpl(node);
      }
      else if (type == CLASS_CONSTANT) {
        return new HackClassConstantImpl(node);
      }
      else if (type == CLASS_DECLARATION_STATEMENT) {
        return new HackClassDeclarationStatementImpl(node);
      }
      else if (type == CLASS_METHOD_CALL_EXPRESSION) {
        return new HackClassMethodCallExpressionImpl(node);
      }
      else if (type == CLASS_NAME_REFERENCE) {
        return new HackClassNameReferenceImpl(node);
      }
      else if (type == CLASS_STATEMENT) {
        return new HackClassStatementImpl(node);
      }
      else if (type == CLASS_STATEMENT_BLOCK) {
        return new HackClassStatementBlockImpl(node);
      }
      else if (type == CLASS_STATEMENT_LIST) {
        return new HackClassStatementListImpl(node);
      }
      else if (type == CLASS_VARIABLE_DECLARATION) {
        return new HackClassVariableDeclarationImpl(node);
      }
      else if (type == CLASS_VARIABLE_DECLARATIONS) {
        return new HackClassVariableDeclarationsImpl(node);
      }
      else if (type == CLONE_EXPRESSION) {
        return new HackCloneExpressionImpl(node);
      }
      else if (type == CLOSURE_EXPRESSION) {
        return new HackClosureExpressionImpl(node);
      }
      else if (type == CLOSURE_FUNCTION) {
        return new HackClosureFunctionImpl(node);
      }
      else if (type == COLLECTION_LITERAL_EXPRESSION) {
        return new HackCollectionLiteralExpressionImpl(node);
      }
      else if (type == COMPARATIVE_EXPRESSION) {
        return new HackComparativeExpressionImpl(node);
      }
      else if (type == COMPARATIVE_OPERATOR) {
        return new HackComparativeOperatorImpl(node);
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
      else if (type == DECLARE_NEW_STATEMENT) {
        return new HackDeclareNewStatementImpl(node);
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
      else if (type == DIMMABLE_VARIABLE_ACCESS_EXPRESSION) {
        return new HackDimmableVariableAccessExpressionImpl(node);
      }
      else if (type == DIM_EXPRESSION) {
        return new HackDimExpressionImpl(node);
      }
      else if (type == DIM_EXPRESSION_BASE) {
        return new HackDimExpressionBaseImpl(node);
      }
      else if (type == DOUBLE_QUOTES_STRING) {
        return new HackDoubleQuotesStringImpl(node);
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
      else if (type == EMPTY_EXPRESSION) {
        return new HackEmptyExpressionImpl(node);
      }
      else if (type == ENCAPS_BRACE_EXPRESSION) {
        return new HackEncapsBraceExpressionImpl(node);
      }
      else if (type == ENCAPS_BRACE_INDEX_OFFSET_EXPRESSION) {
        return new HackEncapsBraceIndexOffsetExpressionImpl(node);
      }
      else if (type == ENCAPS_EXPRESSION) {
        return new HackEncapsExpressionImpl(node);
      }
      else if (type == ENCAPS_FIELD_ACCESS_EXPRESSION) {
        return new HackEncapsFieldAccessExpressionImpl(node);
      }
      else if (type == ENCAPS_INDEX_OFFSET_EXPRESSION) {
        return new HackEncapsIndexOffsetExpressionImpl(node);
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
      else if (type == ESPECIAL_PARENTHESISED_EXPRESSION) {
        return new HackEspecialParenthesisedExpressionImpl(node);
      }
      else if (type == EVAL_EXPRESSION) {
        return new HackEvalExpressionImpl(node);
      }
      else if (type == EXIT_EXPRESSION) {
        return new HackExitExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new HackExpressionListImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new HackExpressionStatementImpl(node);
      }
      else if (type == EXPRESSION_VARIABLE) {
        return new HackExpressionVariableImpl(node);
      }
      else if (type == EXTENDS_FROM) {
        return new HackExtendsFromImpl(node);
      }
      else if (type == FOREACH_LIST_ASSIGNMENT) {
        return new HackForeachListAssignmentImpl(node);
      }
      else if (type == FOREACH_NEW_STATEMENT) {
        return new HackForeachNewStatementImpl(node);
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
      else if (type == FOR_NEW_STATEMENT) {
        return new HackForNewStatementImpl(node);
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
      else if (type == FUNCTION_DECLARATION) {
        return new HackFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_DECLARATION_STATEMENT) {
        return new HackFunctionDeclarationStatementImpl(node);
      }
      else if (type == FUNCTION_TYPE) {
        return new HackFunctionTypeImpl(node);
      }
      else if (type == FUNC_TYPE_LIST) {
        return new HackFuncTypeListImpl(node);
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
      else if (type == HERE_DOC_STRING) {
        return new HackHereDocStringImpl(node);
      }
      else if (type == HTML_STATEMENT) {
        return new HackHtmlStatementImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new HackIdentifierImpl(node);
      }
      else if (type == IDENTIFIER_TYPE) {
        return new HackIdentifierTypeImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new HackIfStatementImpl(node);
      }
      else if (type == IMPLEMENTS_LIST) {
        return new HackImplementsListImpl(node);
      }
      else if (type == INCLUDE_EXPRESSION) {
        return new HackIncludeExpressionImpl(node);
      }
      else if (type == INNER_STATEMENT_LIST) {
        return new HackInnerStatementListImpl(node);
      }
      else if (type == INSTANCEOF_EXPRESSION) {
        return new HackInstanceofExpressionImpl(node);
      }
      else if (type == INTERFACE_DECLARATION_STATEMENT) {
        return new HackInterfaceDeclarationStatementImpl(node);
      }
      else if (type == INTERFACE_EXTENDS_LIST) {
        return new HackInterfaceExtendsListImpl(node);
      }
      else if (type == INTERFACE_LIST) {
        return new HackInterfaceListImpl(node);
      }
      else if (type == ISSET_EXPRESSION) {
        return new HackIssetExpressionImpl(node);
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
      else if (type == LAMBDA_FUNCTION) {
        return new HackLambdaFunctionImpl(node);
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
      else if (type == LIST_ASSIGNMENT_EXPRESSION) {
        return new HackListAssignmentExpressionImpl(node);
      }
      else if (type == LIST_ASSIGNMENT_VARIABLES) {
        return new HackListAssignmentVariablesImpl(node);
      }
      else if (type == LITERAL_EXPRESSION) {
        return new HackLiteralExpressionImpl(node);
      }
      else if (type == LITERAL_SCALAR_AE) {
        return new HackLiteralScalarAeImpl(node);
      }
      else if (type == LOGICAL_EXPRESSION) {
        return new HackLogicalExpressionImpl(node);
      }
      else if (type == LOGICAL_OPERATOR) {
        return new HackLogicalOperatorImpl(node);
      }
      else if (type == MAP_ARRAY_LITERAL_EXPRESSION) {
        return new HackMapArrayLiteralExpressionImpl(node);
      }
      else if (type == MEMBER_MODIFIER) {
        return new HackMemberModifierImpl(node);
      }
      else if (type == MEMBER_ONLY_ACCESS_EXPRESSION) {
        return new HackMemberOnlyAccessExpressionImpl(node);
      }
      else if (type == MEMBER_VARIABLE_EXPRESSION) {
        return new HackMemberVariableExpressionImpl(node);
      }
      else if (type == METHOD_CALL_EXPRESSION) {
        return new HackMethodCallExpressionImpl(node);
      }
      else if (type == METHOD_FUNCTION_DECLARATION) {
        return new HackMethodFunctionDeclarationImpl(node);
      }
      else if (type == METHOD_MODIFIERS) {
        return new HackMethodModifiersImpl(node);
      }
      else if (type == MULTIPLICATIVE_EXPRESSION) {
        return new HackMultiplicativeExpressionImpl(node);
      }
      else if (type == MULTIPLICATIVE_OPERATOR) {
        return new HackMultiplicativeOperatorImpl(node);
      }
      else if (type == NAMESPACE_DECLARATION_STATEMENT) {
        return new HackNamespaceDeclarationStatementImpl(node);
      }
      else if (type == NAMESPACE_NAME) {
        return new HackNamespaceNameImpl(node);
      }
      else if (type == NAMESPACE_NAME_DECLARATION) {
        return new HackNamespaceNameDeclarationImpl(node);
      }
      else if (type == NAMESPACE_STRING) {
        return new HackNamespaceStringImpl(node);
      }
      else if (type == NAMESPACE_STRING_TYPEARGS) {
        return new HackNamespaceStringTypeargsImpl(node);
      }
      else if (type == NAME_HOLDER) {
        return new HackNameHolderImpl(node);
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
      else if (type == NEW_EXPRESSION) {
        return new HackNewExpressionImpl(node);
      }
      else if (type == NEW_TYPE_DECLARATION_STATEMENT) {
        return new HackNewTypeDeclarationStatementImpl(node);
      }
      else if (type == NULLABLE_TYPE) {
        return new HackNullableTypeImpl(node);
      }
      else if (type == OPT_RETURN_TYPE) {
        return new HackOptReturnTypeImpl(node);
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
      else if (type == PARENTHESIZED_EXPRESSION) {
        return new HackParenthesizedExpressionImpl(node);
      }
      else if (type == PREFIX_OPERATOR) {
        return new HackPrefixOperatorImpl(node);
      }
      else if (type == PRINT_EXPRESSION) {
        return new HackPrintExpressionImpl(node);
      }
      else if (type == QUERY_ASSIGN_EXPRESSION) {
        return new HackQueryAssignExpressionImpl(node);
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
      else if (type == QUERY_EXPRESSION) {
        return new HackQueryExpressionImpl(node);
      }
      else if (type == QUERY_HEAD) {
        return new HackQueryHeadImpl(node);
      }
      else if (type == REQUIRE_EXPRESSION) {
        return new HackRequireExpressionImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new HackReturnStatementImpl(node);
      }
      else if (type == SCALAR_EXPRESSION) {
        return new HackScalarExpressionImpl(node);
      }
      else if (type == SELECT_CLAUSE) {
        return new HackSelectClauseImpl(node);
      }
      else if (type == SELECT_OR_GROUP_CLAUSE) {
        return new HackSelectOrGroupClauseImpl(node);
      }
      else if (type == SEMICOLON_STATEMENT) {
        return new HackSemicolonStatementImpl(node);
      }
      else if (type == SHAPE_KEYNAME) {
        return new HackShapeKeynameImpl(node);
      }
      else if (type == SHAPE_LITERAL_EXPRESSION) {
        return new HackShapeLiteralExpressionImpl(node);
      }
      else if (type == SHAPE_MEMBER_LIST) {
        return new HackShapeMemberListImpl(node);
      }
      else if (type == SHAPE_MEMBER_TYPE) {
        return new HackShapeMemberTypeImpl(node);
      }
      else if (type == SHAPE_PAIR) {
        return new HackShapePairImpl(node);
      }
      else if (type == SHAPE_PAIR_LIST) {
        return new HackShapePairListImpl(node);
      }
      else if (type == SHAPE_PAIR_STATIC) {
        return new HackShapePairStaticImpl(node);
      }
      else if (type == SHAPE_TYPE) {
        return new HackShapeTypeImpl(node);
      }
      else if (type == SHIFT_EXPRESSION) {
        return new HackShiftExpressionImpl(node);
      }
      else if (type == SHIFT_OPERATOR) {
        return new HackShiftOperatorImpl(node);
      }
      else if (type == SIMPLE_FUNCTION_CALL_EXPRESSION) {
        return new HackSimpleFunctionCallExpressionImpl(node);
      }
      else if (type == SIMPLE_VARIABLE_NAME) {
        return new HackSimpleVariableNameImpl(node);
      }
      else if (type == SINGLE_QUOTES_STRING) {
        return new HackSingleQuotesStringImpl(node);
      }
      else if (type == SOFT_TYPE) {
        return new HackSoftTypeImpl(node);
      }
      else if (type == STATEMENT_RECOVER) {
        return new HackStatementRecoverImpl(node);
      }
      else if (type == STATIC_ADDITIVE_OR_CONCATENATION_EXPRESSION) {
        return new HackStaticAdditiveOrConcatenationExpressionImpl(node);
      }
      else if (type == STATIC_ARRAY_EXPRESSION) {
        return new HackStaticArrayExpressionImpl(node);
      }
      else if (type == STATIC_ARRAY_ITEM) {
        return new HackStaticArrayItemImpl(node);
      }
      else if (type == STATIC_ARRAY_ITEM_AE) {
        return new HackStaticArrayItemAeImpl(node);
      }
      else if (type == STATIC_ARRAY_PAIR_LIST) {
        return new HackStaticArrayPairListImpl(node);
      }
      else if (type == STATIC_ARRAY_PAIR_LIST_AE) {
        return new HackStaticArrayPairListAeImpl(node);
      }
      else if (type == STATIC_ASSIGNMENT) {
        return new HackStaticAssignmentImpl(node);
      }
      else if (type == STATIC_BITWISE_EXPRESSION) {
        return new HackStaticBitwiseExpressionImpl(node);
      }
      else if (type == STATIC_CLASS_CONSTANT) {
        return new HackStaticClassConstantImpl(node);
      }
      else if (type == STATIC_CLASS_NAME) {
        return new HackStaticClassNameImpl(node);
      }
      else if (type == STATIC_CLASS_VARIABLE_EXPRESSION) {
        return new HackStaticClassVariableExpressionImpl(node);
      }
      else if (type == STATIC_COLLECTION_LITERAL) {
        return new HackStaticCollectionLiteralImpl(node);
      }
      else if (type == STATIC_COMPARATIVE_EXPRESSION) {
        return new HackStaticComparativeExpressionImpl(node);
      }
      else if (type == STATIC_EXPRESSION) {
        return new HackStaticExpressionImpl(node);
      }
      else if (type == STATIC_LOGICAL_EXPRESSION) {
        return new HackStaticLogicalExpressionImpl(node);
      }
      else if (type == STATIC_MAP_ARRAY_LITERAL) {
        return new HackStaticMapArrayLiteralImpl(node);
      }
      else if (type == STATIC_MULTIPLICATIVE_EXPRESSION) {
        return new HackStaticMultiplicativeExpressionImpl(node);
      }
      else if (type == STATIC_NUMERIC_SCALAR_AE) {
        return new HackStaticNumericScalarAeImpl(node);
      }
      else if (type == STATIC_PARENTHESIZED_EXPRESSION) {
        return new HackStaticParenthesizedExpressionImpl(node);
      }
      else if (type == STATIC_PREFIX_EXPRESSION) {
        return new HackStaticPrefixExpressionImpl(node);
      }
      else if (type == STATIC_PREFIX_OPERATOR) {
        return new HackStaticPrefixOperatorImpl(node);
      }
      else if (type == STATIC_SCALAR_AE) {
        return new HackStaticScalarAeImpl(node);
      }
      else if (type == STATIC_SCALAR_LIST_AE) {
        return new HackStaticScalarListAeImpl(node);
      }
      else if (type == STATIC_SHAPE_EXPRESSION) {
        return new HackStaticShapeExpressionImpl(node);
      }
      else if (type == STATIC_SHAPE_PAIR_ITEM) {
        return new HackStaticShapePairItemImpl(node);
      }
      else if (type == STATIC_SHAPE_PAIR_LIST) {
        return new HackStaticShapePairListImpl(node);
      }
      else if (type == STATIC_SHAPE_PAIR_LIST_AE) {
        return new HackStaticShapePairListAeImpl(node);
      }
      else if (type == STATIC_SHIFT_EXPRESSION) {
        return new HackStaticShiftExpressionImpl(node);
      }
      else if (type == STATIC_STATEMENT) {
        return new HackStaticStatementImpl(node);
      }
      else if (type == STATIC_TERNARY_EXPRESSION) {
        return new HackStaticTernaryExpressionImpl(node);
      }
      else if (type == STATIC_VARRAY_LITERAL) {
        return new HackStaticVarrayLiteralImpl(node);
      }
      else if (type == STATIC_VAR_LIST) {
        return new HackStaticVarListImpl(node);
      }
      else if (type == SUFFIX_OPERATOR) {
        return new HackSuffixOperatorImpl(node);
      }
      else if (type == SWITCH_CASE_LIST) {
        return new HackSwitchCaseListImpl(node);
      }
      else if (type == SWITCH_NEW_STATEMENT) {
        return new HackSwitchNewStatementImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new HackSwitchStatementImpl(node);
      }
      else if (type == SWITCH_STATEMENT_LIST) {
        return new HackSwitchStatementListImpl(node);
      }
      else if (type == TERNARY_EXPRESSION) {
        return new HackTernaryExpressionImpl(node);
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
      else if (type == TRAIT_LIST) {
        return new HackTraitListImpl(node);
      }
      else if (type == TRAIT_PRECEDENCE_RULE) {
        return new HackTraitPrecedenceRuleImpl(node);
      }
      else if (type == TRAIT_REQUIRE_DECLARATION) {
        return new HackTraitRequireDeclarationImpl(node);
      }
      else if (type == TRAIT_RULES) {
        return new HackTraitRulesImpl(node);
      }
      else if (type == TRAIT_USE_DECLARATION) {
        return new HackTraitUseDeclarationImpl(node);
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
      else if (type == TUPLE_EXPRESSION) {
        return new HackTupleExpressionImpl(node);
      }
      else if (type == TUPLE_TYPE) {
        return new HackTupleTypeImpl(node);
      }
      else if (type == TYPEARGS) {
        return new HackTypeargsImpl(node);
      }
      else if (type == TYPEVAR) {
        return new HackTypevarImpl(node);
      }
      else if (type == TYPEVAR_ITEM) {
        return new HackTypevarItemImpl(node);
      }
      else if (type == TYPEVAR_LIST) {
        return new HackTypevarListImpl(node);
      }
      else if (type == TYPEVAR_VARIANCE) {
        return new HackTypevarVarianceImpl(node);
      }
      else if (type == TYPE_DECLARATION_STATEMENT) {
        return new HackTypeDeclarationStatementImpl(node);
      }
      else if (type == TYPE_LIST) {
        return new HackTypeListImpl(node);
      }
      else if (type == UNSET_STATEMENT) {
        return new HackUnsetStatementImpl(node);
      }
      else if (type == USER_ATTRIBUTE) {
        return new HackUserAttributeImpl(node);
      }
      else if (type == USER_ATTRIBUTES) {
        return new HackUserAttributesImpl(node);
      }
      else if (type == USER_ATTRIBUTE_LIST) {
        return new HackUserAttributeListImpl(node);
      }
      else if (type == USE_DECLARATION) {
        return new HackUseDeclarationImpl(node);
      }
      else if (type == USE_DECLARATIONS) {
        return new HackUseDeclarationsImpl(node);
      }
      else if (type == USE_DECLARATION_STATEMENT) {
        return new HackUseDeclarationStatementImpl(node);
      }
      else if (type == VARIABLE_EXPRESSION) {
        return new HackVariableExpressionImpl(node);
      }
      else if (type == VARIABLE_EXPRESSION_VARIABLE) {
        return new HackVariableExpressionVariableImpl(node);
      }
      else if (type == VARIABLE_IDENTIFIER) {
        return new HackVariableIdentifierImpl(node);
      }
      else if (type == VARIABLE_LIST) {
        return new HackVariableListImpl(node);
      }
      else if (type == VARIABLE_MODIFIERS) {
        return new HackVariableModifiersImpl(node);
      }
      else if (type == VARIABLE_NAME_HOLDER) {
        return new HackVariableNameHolderImpl(node);
      }
      else if (type == VARRAY_LITERAL_EXPRESSION) {
        return new HackVarrayLiteralExpressionImpl(node);
      }
      else if (type == WHERE_CLAUSE) {
        return new HackWhereClauseImpl(node);
      }
      else if (type == WHILE_NEW_STATEMENT) {
        return new HackWhileNewStatementImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new HackWhileStatementImpl(node);
      }
      else if (type == WHILE_STATEMENT_BODY) {
        return new HackWhileStatementBodyImpl(node);
      }
      else if (type == XHP_ATTRIBUTE) {
        return new HackXhpAttributeImpl(node);
      }
      else if (type == XHP_ATTRIBUTES) {
        return new HackXhpAttributesImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_DECL) {
        return new HackXhpAttributeDeclImpl(node);
      }
      else if (type == XHP_ATTRIBUTE_DECLARATION) {
        return new HackXhpAttributeDeclarationImpl(node);
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
      else if (type == XHP_CATEGORY_DECLARATION) {
        return new HackXhpCategoryDeclarationImpl(node);
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
      else if (type == XHP_CHILDREN_DECLARATION) {
        return new HackXhpChildrenDeclarationImpl(node);
      }
      else if (type == XHP_CHILDREN_DECL_EXPRESSION) {
        return new HackXhpChildrenDeclExpressionImpl(node);
      }
      else if (type == XHP_CHILDREN_DECL_TAG) {
        return new HackXhpChildrenDeclTagImpl(node);
      }
      else if (type == XHP_CHILDREN_PAREN_EXPRESSION) {
        return new HackXhpChildrenParenExpressionImpl(node);
      }
      else if (type == XHP_CHILDREN_STMT) {
        return new HackXhpChildrenStmtImpl(node);
      }
      else if (type == XHP_CLASS_DECLARATION_STATEMENT) {
        return new HackXhpClassDeclarationStatementImpl(node);
      }
      else if (type == XHP_EXPRESSION) {
        return new HackXhpExpressionImpl(node);
      }
      else if (type == XHP_IDENTIFIER) {
        return new HackXhpIdentifierImpl(node);
      }
      else if (type == XHP_LABEL_WS) {
        return new HackXhpLabelWsImpl(node);
      }
      else if (type == XHP_NAME_HOLDER) {
        return new HackXhpNameHolderImpl(node);
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
      else if (type == XHP_TYPE) {
        return new HackXhpTypeImpl(node);
      }
      else if (type == YIELD_ASSIGN_EXPRESSION) {
        return new HackYieldAssignExpressionImpl(node);
      }
      else if (type == YIELD_EXPRESSION) {
        return new HackYieldExpressionImpl(node);
      }
      else if (type == YIELD_LIST_ASSIGN_EXPRESSION) {
        return new HackYieldListAssignExpressionImpl(node);
      }
      else if (type == YIELD_STATEMENT) {
        return new HackYieldStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
