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
    if (t == ADDITIVE_CONCATENATION_EXPRESSION) {
      r = AdditiveConcatenationExpression(b, 0);
    }
    else if (t == ADDITIVE_CONCATENATION_OPERATOR) {
      r = AdditiveConcatenationOperator(b, 0);
    }
    else if (t == ARRAY_ACCESS_EXPRESSION) {
      r = ArrayAccessExpression(b, 0);
    }
    else if (t == ARRAY_LITERAL_EXPRESSION) {
      r = ArrayLiteralExpression(b, 0);
    }
    else if (t == ARRAY_PAIR) {
      r = ArrayPair(b, 0);
    }
    else if (t == ARRAY_TYPE) {
      r = ArrayType(b, 0);
    }
    else if (t == ASSIGNMENT_EXPRESSION) {
      r = AssignmentExpression(b, 0);
    }
    else if (t == ASSIGNMENT_LIST) {
      r = AssignmentList(b, 0);
    }
    else if (t == ATTRIBUTE) {
      r = Attribute(b, 0);
    }
    else if (t == ATTRIBUTE_STATIC_SCALAR_LIST) {
      r = AttributeStaticScalarList(b, 0);
    }
    else if (t == ATTRIBUTES) {
      r = Attributes(b, 0);
    }
    else if (t == AWAIT_ASSIGN_EXPRESSION) {
      r = AwaitAssignExpression(b, 0);
    }
    else if (t == AWAIT_EXPRESSION) {
      r = AwaitExpression(b, 0);
    }
    else if (t == AWAIT_LIST_ASSIGN_EXPRESSION) {
      r = AwaitListAssignExpression(b, 0);
    }
    else if (t == BACKTICKS_EXPRESSION) {
      r = BackticksExpression(b, 0);
    }
    else if (t == BITWISE_EXPRESSION) {
      r = BitwiseExpression(b, 0);
    }
    else if (t == BITWISE_OPERATOR) {
      r = BitwiseOperator(b, 0);
    }
    else if (t == BLOCK) {
      r = Block(b, 0);
    }
    else if (t == BLOCK_STATEMENT) {
      r = BlockStatement(b, 0);
    }
    else if (t == BREAK_STATEMENT) {
      r = BreakStatement(b, 0);
    }
    else if (t == CALL_PARAMETER) {
      r = CallParameter(b, 0);
    }
    else if (t == CALLABLE_FUNCTION_CALL_EXPRESSION) {
      r = CallableFunctionCallExpression(b, 0);
    }
    else if (t == CALLABLE_TYPE) {
      r = CallableType(b, 0);
    }
    else if (t == CASE_BLOCK) {
      r = CaseBlock(b, 0);
    }
    else if (t == CASE_LIST) {
      r = CaseList(b, 0);
    }
    else if (t == CASE_SEPARATOR) {
      r = CaseSeparator(b, 0);
    }
    else if (t == CAST_EXPRESSION) {
      r = CastExpression(b, 0);
    }
    else if (t == CAST_OPERATOR) {
      r = CastOperator(b, 0);
    }
    else if (t == CLASS_BLOCK) {
      r = ClassBlock(b, 0);
    }
    else if (t == CLASS_CONSTANT) {
      r = ClassConstant(b, 0);
    }
    else if (t == CLASS_DECLARATION) {
      r = ClassDeclaration(b, 0);
    }
    else if (t == CLASS_STATEMENT) {
      r = ClassStatement(b, 0);
    }
    else if (t == CLASS_VARIABLE_DECLARATION) {
      r = ClassVariableDeclaration(b, 0);
    }
    else if (t == CLASS_VARIABLE_STATEMENT) {
      r = ClassVariableStatement(b, 0);
    }
    else if (t == CLONE_EXPRESSION) {
      r = CloneExpression(b, 0);
    }
    else if (t == CLOSURE_EXPRESSION) {
      r = ClosureExpression(b, 0);
    }
    else if (t == CLOSURE_FUNCTION) {
      r = ClosureFunction(b, 0);
    }
    else if (t == COLLECTION_LITERAL_EXPRESSION) {
      r = CollectionLiteralExpression(b, 0);
    }
    else if (t == COMPARATIVE_EXPRESSION) {
      r = ComparativeExpression(b, 0);
    }
    else if (t == COMPARATIVE_OPERATOR) {
      r = ComparativeOperator(b, 0);
    }
    else if (t == CONSTANT_ASSIGNMENT) {
      r = ConstantAssignment(b, 0);
    }
    else if (t == CONSTANT_DECLARATION) {
      r = ConstantDeclaration(b, 0);
    }
    else if (t == CONSTANT_STATEMENT) {
      r = ConstantStatement(b, 0);
    }
    else if (t == CONTINUE_STATEMENT) {
      r = ContinueStatement(b, 0);
    }
    else if (t == DECLARE_ASSIGNMENT) {
      r = DeclareAssignment(b, 0);
    }
    else if (t == DECLARE_LIST) {
      r = DeclareList(b, 0);
    }
    else if (t == DECLARE_STATEMENT) {
      r = DeclareStatement(b, 0);
    }
    else if (t == DO_WHILE_STATEMENT) {
      r = DoWhileStatement(b, 0);
    }
    else if (t == DOUBLE_QUOTES_STRING) {
      r = DoubleQuotesString(b, 0);
    }
    else if (t == DYNAMIC_VARIABLE_EXPRESSION) {
      r = DynamicVariableExpression(b, 0);
    }
    else if (t == ECHO_STATEMENT) {
      r = EchoStatement(b, 0);
    }
    else if (t == ELSE_IF_STATEMENT) {
      r = ElseIfStatement(b, 0);
    }
    else if (t == ELSE_STATEMENT) {
      r = ElseStatement(b, 0);
    }
    else if (t == EMPTY_EXPRESSION) {
      r = EmptyExpression(b, 0);
    }
    else if (t == ENCAPS_BRACE_EXPRESSION) {
      r = EncapsBraceExpression(b, 0);
    }
    else if (t == ENCAPS_BRACE_INDEX_OFFSET_EXPRESSION) {
      r = EncapsBraceIndexOffsetExpression(b, 0);
    }
    else if (t == ENCAPS_EXPRESSION) {
      r = EncapsExpression(b, 0);
    }
    else if (t == ENCAPS_FIELD_ACCESS_EXPRESSION) {
      r = EncapsFieldAccessExpression(b, 0);
    }
    else if (t == ENCAPS_INDEX_OFFSET_EXPRESSION) {
      r = EncapsIndexOffsetExpression(b, 0);
    }
    else if (t == ENCAPS_LIST) {
      r = EncapsList(b, 0);
    }
    else if (t == ENCAPS_VAR) {
      r = EncapsVar(b, 0);
    }
    else if (t == ENCAPS_VAR_OFFSET) {
      r = EncapsVarOffset(b, 0);
    }
    else if (t == ENUM_CONSTANT_DECLARATION) {
      r = EnumConstantDeclaration(b, 0);
    }
    else if (t == ENUM_CONSTANT_STATEMENT) {
      r = EnumConstantStatement(b, 0);
    }
    else if (t == ENUM_DECLARATION) {
      r = EnumDeclaration(b, 0);
    }
    else if (t == ENUM_STATEMENT) {
      r = EnumStatement(b, 0);
    }
    else if (t == ESPECIAL_PARENTHESISED_EXPRESSION) {
      r = EspecialParenthesisedExpression(b, 0);
    }
    else if (t == EVAL_EXPRESSION) {
      r = EvalExpression(b, 0);
    }
    else if (t == EXIT_EXPRESSION) {
      r = ExitExpression(b, 0);
    }
    else if (t == EXPRESSION_LIST) {
      r = ExpressionList(b, 0);
    }
    else if (t == EXPRESSION_STATEMENT) {
      r = ExpressionStatement(b, 0);
    }
    else if (t == EXPRESSION_VARIABLE) {
      r = ExpressionVariable(b, 0);
    }
    else if (t == EXTENDS) {
      r = Extends(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = ForStatement(b, 0);
    }
    else if (t == FOREACH_OPTIONAL_ARG) {
      r = ForeachOptionalArg(b, 0);
    }
    else if (t == FOREACH_STATEMENT) {
      r = ForeachStatement(b, 0);
    }
    else if (t == FOREACH_VARIABLE) {
      r = ForeachVariable(b, 0);
    }
    else if (t == FROM_CLAUSE) {
      r = FromClause(b, 0);
    }
    else if (t == FULLY_QUALIFIED_CLASS_NAME) {
      r = FullyQualifiedClassName(b, 0);
    }
    else if (t == FULLY_QUALIFIED_STATIC_IDENTIFIER) {
      r = FullyQualifiedStaticIdentifier(b, 0);
    }
    else if (t == FUNCTION_CALL_EXPRESSION) {
      r = FunctionCallExpression(b, 0);
    }
    else if (t == FUNCTION_DECLARATION) {
      r = FunctionDeclaration(b, 0);
    }
    else if (t == FUNCTION_STATEMENT) {
      r = FunctionStatement(b, 0);
    }
    else if (t == FUNCTION_TYPE) {
      r = FunctionType(b, 0);
    }
    else if (t == GLOBAL_STATEMENT) {
      r = GlobalStatement(b, 0);
    }
    else if (t == GLOBAL_VAR) {
      r = GlobalVar(b, 0);
    }
    else if (t == GLOBAL_VAR_LIST) {
      r = GlobalVarList(b, 0);
    }
    else if (t == GOTO_STATEMENT) {
      r = GotoStatement(b, 0);
    }
    else if (t == GROUP_CLAUSE) {
      r = GroupClause(b, 0);
    }
    else if (t == HALT_COMPILER_STATEMENT) {
      r = HaltCompilerStatement(b, 0);
    }
    else if (t == HERE_DOC_STRING) {
      r = HereDocString(b, 0);
    }
    else if (t == HTML_STATEMENT) {
      r = HtmlStatement(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = Identifier(b, 0);
    }
    else if (t == IDENTIFIER_TYPE) {
      r = IdentifierType(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IfStatement(b, 0);
    }
    else if (t == IMPLEMENTS) {
      r = Implements(b, 0);
    }
    else if (t == INCLUDE_EXPRESSION) {
      r = IncludeExpression(b, 0);
    }
    else if (t == INSTANCEOF_EXPRESSION) {
      r = InstanceofExpression(b, 0);
    }
    else if (t == INTERFACE_EXTENDS) {
      r = InterfaceExtends(b, 0);
    }
    else if (t == INTERFACE_STATEMENT) {
      r = InterfaceStatement(b, 0);
    }
    else if (t == ISSET_EXPRESSION) {
      r = IssetExpression(b, 0);
    }
    else if (t == JOIN_CLAUSE) {
      r = JoinClause(b, 0);
    }
    else if (t == JOIN_INTO_CLAUSE) {
      r = JoinIntoClause(b, 0);
    }
    else if (t == LABEL_STATEMENT) {
      r = LabelStatement(b, 0);
    }
    else if (t == LAMBDA_BODY) {
      r = LambdaBody(b, 0);
    }
    else if (t == LAMBDA_EXPRESSION) {
      r = LambdaExpression(b, 0);
    }
    else if (t == LAMBDA_FUNCTION) {
      r = LambdaFunction(b, 0);
    }
    else if (t == LAMBDA_USE_VARIABLES) {
      r = LambdaUseVariables(b, 0);
    }
    else if (t == LET_CLAUSE) {
      r = LetClause(b, 0);
    }
    else if (t == LEXICAL_VAR_LIST) {
      r = LexicalVarList(b, 0);
    }
    else if (t == LIST_ASSIGNMENT_EXPRESSION) {
      r = ListAssignmentExpression(b, 0);
    }
    else if (t == LIST_ASSIGNMENT_VARIABLES) {
      r = ListAssignmentVariables(b, 0);
    }
    else if (t == LITERAL_EXPRESSION) {
      r = LiteralExpression(b, 0);
    }
    else if (t == LITERAL_SCALAR_ATTRIBUTE) {
      r = LiteralScalarAttribute(b, 0);
    }
    else if (t == LOGICAL_EXPRESSION) {
      r = LogicalExpression(b, 0);
    }
    else if (t == LOGICAL_OPERATOR) {
      r = LogicalOperator(b, 0);
    }
    else if (t == MAP_ARRAY_LITERAL_EXPRESSION) {
      r = MapArrayLiteralExpression(b, 0);
    }
    else if (t == MEMBER_MODIFIER) {
      r = MemberModifier(b, 0);
    }
    else if (t == MEMBER_VARIABLE_EXPRESSION) {
      r = MemberVariableExpression(b, 0);
    }
    else if (t == METHOD_CALL_EXPRESSION) {
      r = MethodCallExpression(b, 0);
    }
    else if (t == METHOD_STATEMENT) {
      r = MethodStatement(b, 0);
    }
    else if (t == MULTIPLICATIVE_EXPRESSION) {
      r = MultiplicativeExpression(b, 0);
    }
    else if (t == MULTIPLICATIVE_OPERATOR) {
      r = MultiplicativeOperator(b, 0);
    }
    else if (t == NAME_HOLDER) {
      r = NameHolder(b, 0);
    }
    else if (t == NAMESPACE_DECLARATION) {
      r = NamespaceDeclaration(b, 0);
    }
    else if (t == NAMESPACE_NAME) {
      r = NamespaceName(b, 0);
    }
    else if (t == NAMESPACE_STATEMENT) {
      r = NamespaceStatement(b, 0);
    }
    else if (t == NAMESPACE_STRING) {
      r = NamespaceString(b, 0);
    }
    else if (t == NEW_ELSE_IF_STATEMENT) {
      r = NewElseIfStatement(b, 0);
    }
    else if (t == NEW_ELSE_STATEMENT) {
      r = NewElseStatement(b, 0);
    }
    else if (t == NEW_EXPRESSION) {
      r = NewExpression(b, 0);
    }
    else if (t == NEW_IF_STATEMENT) {
      r = NewIfStatement(b, 0);
    }
    else if (t == NEW_TYPE_STATEMENT) {
      r = NewTypeStatement(b, 0);
    }
    else if (t == NULLABLE_TYPE) {
      r = NullableType(b, 0);
    }
    else if (t == ORDER_BY_CLAUSE) {
      r = OrderByClause(b, 0);
    }
    else if (t == ORDERING) {
      r = Ordering(b, 0);
    }
    else if (t == PARAMETER) {
      r = Parameter(b, 0);
    }
    else if (t == PARAMETER_MODIFIER) {
      r = ParameterModifier(b, 0);
    }
    else if (t == PARENTHESIZED_EXPRESSION) {
      r = ParenthesizedExpression(b, 0);
    }
    else if (t == PREFIX_OPERATOR) {
      r = PrefixOperator(b, 0);
    }
    else if (t == PRINT_EXPRESSION) {
      r = PrintExpression(b, 0);
    }
    else if (t == QUERY_ASSIGN_EXPRESSION) {
      r = QueryAssignExpression(b, 0);
    }
    else if (t == QUERY_BODY) {
      r = QueryBody(b, 0);
    }
    else if (t == QUERY_CONTINUATION) {
      r = QueryContinuation(b, 0);
    }
    else if (t == QUERY_EXPRESSION) {
      r = QueryExpression(b, 0);
    }
    else if (t == QUERY_HEAD) {
      r = QueryHead(b, 0);
    }
    else if (t == REQUIRE_EXPRESSION) {
      r = RequireExpression(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = ReturnStatement(b, 0);
    }
    else if (t == RETURN_TYPE) {
      r = ReturnType(b, 0);
    }
    else if (t == SCALAR_EXPRESSION) {
      r = ScalarExpression(b, 0);
    }
    else if (t == SELECT_CLAUSE) {
      r = SelectClause(b, 0);
    }
    else if (t == SHAPE_KEY_NAME) {
      r = ShapeKeyName(b, 0);
    }
    else if (t == SHAPE_LITERAL_EXPRESSION) {
      r = ShapeLiteralExpression(b, 0);
    }
    else if (t == SHAPE_MEMBER_TYPE) {
      r = ShapeMemberType(b, 0);
    }
    else if (t == SHAPE_PAIR) {
      r = ShapePair(b, 0);
    }
    else if (t == SHAPE_TYPE) {
      r = ShapeType(b, 0);
    }
    else if (t == SHIFT_EXPRESSION) {
      r = ShiftExpression(b, 0);
    }
    else if (t == SHIFT_OPERATOR) {
      r = ShiftOperator(b, 0);
    }
    else if (t == SINGLE_QUOTES_STRING) {
      r = SingleQuotesString(b, 0);
    }
    else if (t == SOFT_TYPE) {
      r = SoftType(b, 0);
    }
    else if (t == STATIC_ARRAY_ITEM_ATTRIBUTE) {
      r = StaticArrayItemAttribute(b, 0);
    }
    else if (t == STATIC_ARRAY_PAIR_LIST_ATTRIBUTE) {
      r = StaticArrayPairListAttribute(b, 0);
    }
    else if (t == STATIC_ASSIGNMENT) {
      r = StaticAssignment(b, 0);
    }
    else if (t == STATIC_CLASS_NAME) {
      r = StaticClassName(b, 0);
    }
    else if (t == STATIC_CLASS_VARIABLE_EXPRESSION) {
      r = StaticClassVariableExpression(b, 0);
    }
    else if (t == STATIC_METHOD_CALL_EXPRESSION) {
      r = StaticMethodCallExpression(b, 0);
    }
    else if (t == STATIC_NUMERIC_SCALAR_ATTRIBUTE) {
      r = StaticNumericScalarAttribute(b, 0);
    }
    else if (t == STATIC_SCALAR_ATTRIBUTE) {
      r = StaticScalarAttribute(b, 0);
    }
    else if (t == STATIC_SHAPE_PAIR_ITEM) {
      r = StaticShapePairItem(b, 0);
    }
    else if (t == STATIC_SHAPE_PAIR_LIST_ATTRIBUTE) {
      r = StaticShapePairListAttribute(b, 0);
    }
    else if (t == STATIC_STATEMENT) {
      r = StaticStatement(b, 0);
    }
    else if (t == STATIC_VAR_LIST) {
      r = StaticVarList(b, 0);
    }
    else if (t == SUFFIX_OPERATOR) {
      r = SuffixOperator(b, 0);
    }
    else if (t == SWITCH_STATEMENT) {
      r = SwitchStatement(b, 0);
    }
    else if (t == TERNARY_EXPRESSION) {
      r = TernaryExpression(b, 0);
    }
    else if (t == THROW_STATEMENT) {
      r = ThrowStatement(b, 0);
    }
    else if (t == TOP_STATEMENT_LIST) {
      r = TopStatementList(b, 0);
    }
    else if (t == TRAIT_ALIAS_RULE) {
      r = TraitAliasRule(b, 0);
    }
    else if (t == TRAIT_ALIAS_RULE_METHOD) {
      r = TraitAliasRuleMethod(b, 0);
    }
    else if (t == TRAIT_LIST) {
      r = TraitList(b, 0);
    }
    else if (t == TRAIT_PRECEDENCE_RULE) {
      r = TraitPrecedenceRule(b, 0);
    }
    else if (t == TRAIT_REQUIRE_DECLARATION_STATEMENT) {
      r = TraitRequireDeclarationStatement(b, 0);
    }
    else if (t == TRAIT_STATEMENT) {
      r = TraitStatement(b, 0);
    }
    else if (t == TRAIT_USE_DECLARATION_STATEMENT) {
      r = TraitUseDeclarationStatement(b, 0);
    }
    else if (t == TRY_CATCH) {
      r = TryCatch(b, 0);
    }
    else if (t == TRY_FINALLY) {
      r = TryFinally(b, 0);
    }
    else if (t == TRY_STATEMENT) {
      r = TryStatement(b, 0);
    }
    else if (t == TUPLE_EXPRESSION) {
      r = TupleExpression(b, 0);
    }
    else if (t == TUPLE_TYPE) {
      r = TupleType(b, 0);
    }
    else if (t == TYPE_ARGS) {
      r = TypeArgs(b, 0);
    }
    else if (t == TYPE_STATEMENT) {
      r = TypeStatement(b, 0);
    }
    else if (t == TYPE_VAR) {
      r = TypeVar(b, 0);
    }
    else if (t == TYPE_VAR_DECLARATION) {
      r = TypeVarDeclaration(b, 0);
    }
    else if (t == UNSET_STATEMENT) {
      r = UnsetStatement(b, 0);
    }
    else if (t == USE_DECLARATION) {
      r = UseDeclaration(b, 0);
    }
    else if (t == USE_DECLARATIONS) {
      r = UseDeclarations(b, 0);
    }
    else if (t == USE_STATEMENT) {
      r = UseStatement(b, 0);
    }
    else if (t == V_ARRAY_LITERAL_EXPRESSION) {
      r = VArrayLiteralExpression(b, 0);
    }
    else if (t == VARIABLE_EXPRESSION) {
      r = VariableExpression(b, 0);
    }
    else if (t == VARIABLE_EXPRESSION_VARIABLE) {
      r = VariableExpressionVariable(b, 0);
    }
    else if (t == VARIABLE_IDENTIFIER) {
      r = VariableIdentifier(b, 0);
    }
    else if (t == VARIABLE_NAME_HOLDER) {
      r = VariableNameHolder(b, 0);
    }
    else if (t == WHERE_CLAUSE) {
      r = WhereClause(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = WhileStatement(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_DECLARATION) {
      r = XhpAttributeDeclaration(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_STATEMENT) {
      r = XhpAttributeStatement(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_TYPE) {
      r = XhpAttributeType(b, 0);
    }
    else if (t == XHP_BARE_WORD) {
      r = XhpBareWord(b, 0);
    }
    else if (t == XHP_CATEGORY_DECLARATION) {
      r = XhpCategoryDeclaration(b, 0);
    }
    else if (t == XHP_CATEGORY_STATEMENT) {
      r = XhpCategoryStatement(b, 0);
    }
    else if (t == XHP_CHILDREN_DECLARATION) {
      r = XhpChildrenDeclaration(b, 0);
    }
    else if (t == XHP_CHILDREN_EXPRESSION) {
      r = XhpChildrenExpression(b, 0);
    }
    else if (t == XHP_CHILDREN_PAREN_EXPRESSION) {
      r = XhpChildrenParenExpression(b, 0);
    }
    else if (t == XHP_CHILDREN_STATEMENT) {
      r = XhpChildrenStatement(b, 0);
    }
    else if (t == XHP_CHILDREN_TAG) {
      r = XhpChildrenTag(b, 0);
    }
    else if (t == XHP_EXPRESSION) {
      r = XhpExpression(b, 0);
    }
    else if (t == XHP_IDENTIFIER) {
      r = XhpIdentifier(b, 0);
    }
    else if (t == XHP_NAME_HOLDER) {
      r = XhpNameHolder(b, 0);
    }
    else if (t == XHP_TAG) {
      r = XhpTag(b, 0);
    }
    else if (t == XHP_TYPE) {
      r = XhpType(b, 0);
    }
    else if (t == YIELD_ASSIGN_EXPRESSION) {
      r = YieldAssignExpression(b, 0);
    }
    else if (t == YIELD_EXPRESSION) {
      r = YieldExpression(b, 0);
    }
    else if (t == YIELD_LIST_ASSIGN_EXPRESSION) {
      r = YieldListAssignExpression(b, 0);
    }
    else if (t == YIELD_STATEMENT) {
      r = YieldStatement(b, 0);
    }
    else if (t == XHP_ATTRIBUTE) {
      r = xhp_attribute(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_NAME) {
      r = xhp_attribute_name(b, 0);
    }
    else if (t == XHP_ATTRIBUTE_VALUE) {
      r = xhp_attribute_value(b, 0);
    }
    else if (t == XHP_ATTRIBUTES) {
      r = xhp_attributes(b, 0);
    }
    else if (t == XHP_CHILD) {
      r = xhp_child(b, 0);
    }
    else if (t == XHP_CHILDREN) {
      r = xhp_children(b, 0);
    }
    else if (t == XHP_OPT_END_LABEL) {
      r = xhp_opt_end_label(b, 0);
    }
    else if (t == XHP_TAG_BODY) {
      r = xhp_tag_body(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return HackFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(FUNCTION_STATEMENT, METHOD_STATEMENT),
    create_token_set_(ARRAY_TYPE, CALLABLE_TYPE, FUNCTION_TYPE, IDENTIFIER_TYPE,
      NULLABLE_TYPE, RETURN_TYPE, SHAPE_MEMBER_TYPE, SHAPE_TYPE,
      SOFT_TYPE, TUPLE_TYPE, XHP_ATTRIBUTE_TYPE, XHP_TYPE),
    create_token_set_(BLOCK_STATEMENT, BREAK_STATEMENT, CLASS_STATEMENT, CLASS_VARIABLE_STATEMENT,
      CONSTANT_STATEMENT, CONTINUE_STATEMENT, DECLARE_STATEMENT, DO_WHILE_STATEMENT,
      ECHO_STATEMENT, ELSE_IF_STATEMENT, ELSE_STATEMENT, ENUM_CONSTANT_STATEMENT,
      ENUM_STATEMENT, EXPRESSION_STATEMENT, FOREACH_STATEMENT, FOR_STATEMENT,
      FUNCTION_STATEMENT, GLOBAL_STATEMENT, GOTO_STATEMENT, HALT_COMPILER_STATEMENT,
      HTML_STATEMENT, IF_STATEMENT, INTERFACE_STATEMENT, LABEL_STATEMENT,
      METHOD_STATEMENT, NAMESPACE_STATEMENT, NEW_ELSE_IF_STATEMENT, NEW_ELSE_STATEMENT,
      NEW_IF_STATEMENT, NEW_TYPE_STATEMENT, RETURN_STATEMENT, STATIC_STATEMENT,
      SWITCH_STATEMENT, THROW_STATEMENT, TRAIT_REQUIRE_DECLARATION_STATEMENT, TRAIT_STATEMENT,
      TRAIT_USE_DECLARATION_STATEMENT, TRY_STATEMENT, TYPE_STATEMENT, UNSET_STATEMENT,
      USE_STATEMENT, WHILE_STATEMENT, XHP_ATTRIBUTE_STATEMENT, XHP_CATEGORY_STATEMENT,
      XHP_CHILDREN_STATEMENT, YIELD_STATEMENT),
  };

  /* ********************************************************** */
  // AdditiveConcatenationOperator MultiplicativeExpressionWrapper
  public static boolean AdditiveConcatenationExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdditiveConcatenationExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<additive concatenation expression>");
    r = AdditiveConcatenationOperator(b, l + 1);
    p = r; // pin = 1
    r = r && MultiplicativeExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, ADDITIVE_CONCATENATION_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '+'|'-'|'.'
  public static boolean AdditiveConcatenationOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdditiveConcatenationOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<additive concatenation operator>");
    r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    if (!r) r = consumeToken(b, T_DOT);
    exit_section_(b, l, m, ADDITIVE_CONCATENATION_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MultiplicativeExpressionWrapper AdditiveConcatenationExpression*
  static boolean AdditiveOrConcatenationExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdditiveOrConcatenationExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MultiplicativeExpressionWrapper(b, l + 1);
    r = r && AdditiveOrConcatenationExpressionWrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AdditiveConcatenationExpression*
  private static boolean AdditiveOrConcatenationExpressionWrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AdditiveOrConcatenationExpressionWrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AdditiveConcatenationExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AdditiveOrConcatenationExpressionWrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '[' AssignmentExpressionWrapper ']'
  public static boolean ArrayAccessExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayAccessExpression")) return false;
    if (!nextTokenIs(b, T_LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_LBRACKET);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    r = r && consumeToken(b, T_RBRACKET);
    exit_section_(b, l, m, ARRAY_ACCESS_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_ARRAY '(' ArrayPairList ')' | '[' ArrayPairList ']'
  public static boolean ArrayLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteralExpression")) return false;
    if (!nextTokenIs(b, "<array literal expression>", T_LBRACKET, T_ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array literal expression>");
    r = ArrayLiteralExpression_0(b, l + 1);
    if (!r) r = ArrayLiteralExpression_1(b, l + 1);
    exit_section_(b, l, m, ARRAY_LITERAL_EXPRESSION, r, false, null);
    return r;
  }

  // T_ARRAY '(' ArrayPairList ')'
  private static boolean ArrayLiteralExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteralExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY);
    r = r && consumeToken(b, T_LPAREN);
    r = r && ArrayPairList(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' ArrayPairList ']'
  private static boolean ArrayLiteralExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteralExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACKET);
    r = r && ArrayPairList(b, l + 1);
    r = r && consumeToken(b, T_RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AssignmentExpressionWrapper (T_DOUBLE_ARROW (AssignmentExpressionWrapper|(&MemberVariableWrapper)))?
  public static boolean ArrayPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayPair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array pair>");
    r = AssignmentExpressionWrapper(b, l + 1);
    r = r && ArrayPair_1(b, l + 1);
    exit_section_(b, l, m, ARRAY_PAIR, r, false, null);
    return r;
  }

  // (T_DOUBLE_ARROW (AssignmentExpressionWrapper|(&MemberVariableWrapper)))?
  private static boolean ArrayPair_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayPair_1")) return false;
    ArrayPair_1_0(b, l + 1);
    return true;
  }

  // T_DOUBLE_ARROW (AssignmentExpressionWrapper|(&MemberVariableWrapper))
  private static boolean ArrayPair_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayPair_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOUBLE_ARROW);
    r = r && ArrayPair_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AssignmentExpressionWrapper|(&MemberVariableWrapper)
  private static boolean ArrayPair_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayPair_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentExpressionWrapper(b, l + 1);
    if (!r) r = ArrayPair_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &MemberVariableWrapper
  private static boolean ArrayPair_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayPair_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_, null);
    r = MemberVariableWrapper(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ArrayPair (',' ArrayPair)* ','?)?
  static boolean ArrayPairList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayPairList")) return false;
    ArrayPairList_0(b, l + 1);
    return true;
  }

  // ArrayPair (',' ArrayPair)* ','?
  private static boolean ArrayPairList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayPairList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayPair(b, l + 1);
    r = r && ArrayPairList_0_1(b, l + 1);
    r = r && ArrayPairList_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ArrayPair)*
  private static boolean ArrayPairList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayPairList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ArrayPairList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayPairList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ArrayPair
  private static boolean ArrayPairList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayPairList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ArrayPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean ArrayPairList_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayPairList_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_ARRAY TypeArgs?
  public static boolean ArrayType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayType")) return false;
    if (!nextTokenIs(b, T_ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY);
    r = r && ArrayType_1(b, l + 1);
    exit_section_(b, m, ARRAY_TYPE, r);
    return r;
  }

  // TypeArgs?
  private static boolean ArrayType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayType_1")) return false;
    TypeArgs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AssignmentOperator AssignmentExpressionWrapper
  public static boolean AssignmentExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<assignment expression>");
    r = AssignmentOperator(b, l + 1);
    p = r; // pin = 1
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, ASSIGNMENT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (TryVariableNameFirst AssignmentOrListExpression+)|TernaryExpressionWrapper
  static boolean AssignmentExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentExpressionWrapper_0(b, l + 1);
    if (!r) r = TernaryExpressionWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TryVariableNameFirst AssignmentOrListExpression+
  private static boolean AssignmentExpressionWrapper_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentExpressionWrapper_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TryVariableNameFirst(b, l + 1);
    r = r && AssignmentExpressionWrapper_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AssignmentOrListExpression+
  private static boolean AssignmentExpressionWrapper_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentExpressionWrapper_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentOrListExpression(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!AssignmentOrListExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssignmentExpressionWrapper_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((TryVariableNameFirst | (ListAssignmentVariables)) (',' (VariableNameHolder|MemberVariableWrapper | ListAssignmentVariables))*)?
  public static boolean AssignmentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentList")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<assignment list>");
    AssignmentList_0(b, l + 1);
    exit_section_(b, l, m, ASSIGNMENT_LIST, true, false, null);
    return true;
  }

  // (TryVariableNameFirst | (ListAssignmentVariables)) (',' (VariableNameHolder|MemberVariableWrapper | ListAssignmentVariables))*
  private static boolean AssignmentList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentList_0_0(b, l + 1);
    r = r && AssignmentList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TryVariableNameFirst | (ListAssignmentVariables)
  private static boolean AssignmentList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TryVariableNameFirst(b, l + 1);
    if (!r) r = AssignmentList_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ListAssignmentVariables)
  private static boolean AssignmentList_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentList_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ListAssignmentVariables(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (VariableNameHolder|MemberVariableWrapper | ListAssignmentVariables))*
  private static boolean AssignmentList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AssignmentList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssignmentList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' (VariableNameHolder|MemberVariableWrapper | ListAssignmentVariables)
  private static boolean AssignmentList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && AssignmentList_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VariableNameHolder|MemberVariableWrapper | ListAssignmentVariables
  private static boolean AssignmentList_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentList_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableNameHolder(b, l + 1);
    if (!r) r = MemberVariableWrapper(b, l + 1);
    if (!r) r = ListAssignmentVariables(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('=' ('&' T_NEW)?) | T_PLUS_EQUAL | T_MINUS_EQUAL | T_MUL_EQUAL | T_DIV_EQUAL | T_CONCAT_EQUAL | T_MOD_EQUAL | T_AND_EQUAL | T_OR_EQUAL | T_XOR_EQUAL | T_SL_EQUAL | T_SR_EQUAL | T_POW_EQUAL
  static boolean AssignmentOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentOperator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentOperator_0(b, l + 1);
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
  private static boolean AssignmentOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentOperator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQUAL);
    r = r && AssignmentOperator_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('&' T_NEW)?
  private static boolean AssignmentOperator_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentOperator_0_1")) return false;
    AssignmentOperator_0_1_0(b, l + 1);
    return true;
  }

  // '&' T_NEW
  private static boolean AssignmentOperator_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentOperator_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AND);
    r = r && consumeToken(b, T_NEW);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AssignmentExpression | ListAssignmentExpression
  static boolean AssignmentOrListExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentOrListExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentExpression(b, l + 1);
    if (!r) r = ListAssignmentExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier AttributeStaticScalarList?
  public static boolean Attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attribute>");
    r = Identifier(b, l + 1);
    r = r && Attribute_1(b, l + 1);
    exit_section_(b, l, m, ATTRIBUTE, r, false, null);
    return r;
  }

  // AttributeStaticScalarList?
  private static boolean Attribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_1")) return false;
    AttributeStaticScalarList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' (StaticScalarAttribute (',' StaticScalarAttribute)* ','?)? ')'
  public static boolean AttributeStaticScalarList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeStaticScalarList")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && AttributeStaticScalarList_1(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, ATTRIBUTE_STATIC_SCALAR_LIST, r);
    return r;
  }

  // (StaticScalarAttribute (',' StaticScalarAttribute)* ','?)?
  private static boolean AttributeStaticScalarList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeStaticScalarList_1")) return false;
    AttributeStaticScalarList_1_0(b, l + 1);
    return true;
  }

  // StaticScalarAttribute (',' StaticScalarAttribute)* ','?
  private static boolean AttributeStaticScalarList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeStaticScalarList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StaticScalarAttribute(b, l + 1);
    r = r && AttributeStaticScalarList_1_0_1(b, l + 1);
    r = r && AttributeStaticScalarList_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' StaticScalarAttribute)*
  private static boolean AttributeStaticScalarList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeStaticScalarList_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AttributeStaticScalarList_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AttributeStaticScalarList_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' StaticScalarAttribute
  private static boolean AttributeStaticScalarList_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeStaticScalarList_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StaticScalarAttribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean AttributeStaticScalarList_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeStaticScalarList_1_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_SL (Attribute (',' Attribute)* ','?)? T_SR
  public static boolean Attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attributes")) return false;
    if (!nextTokenIs(b, T_SL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SL);
    r = r && Attributes_1(b, l + 1);
    r = r && consumeToken(b, T_SR);
    exit_section_(b, m, ATTRIBUTES, r);
    return r;
  }

  // (Attribute (',' Attribute)* ','?)?
  private static boolean Attributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attributes_1")) return false;
    Attributes_1_0(b, l + 1);
    return true;
  }

  // Attribute (',' Attribute)* ','?
  private static boolean Attributes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attributes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    r = r && Attributes_1_0_1(b, l + 1);
    r = r && Attributes_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Attribute)*
  private static boolean Attributes_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attributes_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Attributes_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Attributes_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Attribute
  private static boolean Attributes_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attributes_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean Attributes_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attributes_1_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // TryVariableNameFirst '=' AwaitExpression
  public static boolean AwaitAssignExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AwaitAssignExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<await assign expression>");
    r = TryVariableNameFirst(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && AwaitExpression(b, l + 1);
    exit_section_(b, l, m, AWAIT_ASSIGN_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_AWAIT AssignmentExpressionWrapper
  public static boolean AwaitExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AwaitExpression")) return false;
    if (!nextTokenIs(b, T_AWAIT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_AWAIT);
    p = r; // pin = 1
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, AWAIT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ListAssignmentVariables '=' AwaitExpression
  public static boolean AwaitListAssignExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AwaitListAssignExpression")) return false;
    if (!nextTokenIs(b, T_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ListAssignmentVariables(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && AwaitExpression(b, l + 1);
    exit_section_(b, m, AWAIT_LIST_ASSIGN_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // '`' (T_ENCAPSED_AND_WHITESPACE | EncapsList)* '`'
  public static boolean BackticksExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BackticksExpression")) return false;
    if (!nextTokenIs(b, T_BACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_BACK);
    r = r && BackticksExpression_1(b, l + 1);
    r = r && consumeToken(b, T_BACK);
    exit_section_(b, m, BACKTICKS_EXPRESSION, r);
    return r;
  }

  // (T_ENCAPSED_AND_WHITESPACE | EncapsList)*
  private static boolean BackticksExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BackticksExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BackticksExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BackticksExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // T_ENCAPSED_AND_WHITESPACE | EncapsList
  private static boolean BackticksExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BackticksExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ENCAPSED_AND_WHITESPACE);
    if (!r) r = EncapsList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BitwiseOperator ShiftExpressionWrapper
  public static boolean BitwiseExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitwiseExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<bitwise expression>");
    r = BitwiseOperator(b, l + 1);
    p = r; // pin = 1
    r = r && ShiftExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, BITWISE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ShiftExpressionWrapper BitwiseExpression*
  static boolean BitwiseExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitwiseExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShiftExpressionWrapper(b, l + 1);
    r = r && BitwiseExpressionWrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BitwiseExpression*
  private static boolean BitwiseExpressionWrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitwiseExpressionWrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BitwiseExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BitwiseExpressionWrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '|' | '&' | '^'
  public static boolean BitwiseOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitwiseOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<bitwise operator>");
    r = consumeToken(b, T_OR);
    if (!r) r = consumeToken(b, T_AND);
    if (!r) r = consumeToken(b, T_XOR);
    exit_section_(b, l, m, BITWISE_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' InnerStatements* '}'
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, Block_1(b, l + 1));
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, BLOCK, r, p, null);
    return r || p;
  }

  // InnerStatements*
  private static boolean Block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerStatements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // Block
  public static boolean BlockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStatement")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Block(b, l + 1);
    exit_section_(b, m, BLOCK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // T_BREAK AssignmentExpressionWrapper? ';'
  public static boolean BreakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakStatement")) return false;
    if (!nextTokenIs(b, T_BREAK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_BREAK);
    p = r; // pin = 1
    r = r && report_error_(b, BreakStatement_1(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, BREAK_STATEMENT, r, p, null);
    return r || p;
  }

  // AssignmentExpressionWrapper?
  private static boolean BreakStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakStatement_1")) return false;
    AssignmentExpressionWrapper(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "..."? '&'? AssignmentExpressionWrapper
  public static boolean CallParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<call parameter>");
    r = CallParameter_0(b, l + 1);
    r = r && CallParameter_1(b, l + 1);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, CALL_PARAMETER, r, false, null);
    return r;
  }

  // "..."?
  private static boolean CallParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameter_0")) return false;
    consumeToken(b, T_ELLIPSIS);
    return true;
  }

  // '&'?
  private static boolean CallParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameter_1")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  /* ********************************************************** */
  // (CallParameter (',' CallParameter)* ','?)?
  static boolean CallParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameterList")) return false;
    CallParameterList_0(b, l + 1);
    return true;
  }

  // CallParameter (',' CallParameter)* ','?
  private static boolean CallParameterList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameterList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallParameter(b, l + 1);
    r = r && CallParameterList_0_1(b, l + 1);
    r = r && CallParameterList_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' CallParameter)*
  private static boolean CallParameterList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameterList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CallParameterList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallParameterList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' CallParameter
  private static boolean CallParameterList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameterList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && CallParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean CallParameterList_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameterList_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // '(' CallParameterList ')'
  public static boolean CallableFunctionCallExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableFunctionCallExpression")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_LPAREN);
    r = r && CallParameterList(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, l, m, CALLABLE_FUNCTION_CALL_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_CALLABLE
  public static boolean CallableType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableType")) return false;
    if (!nextTokenIs(b, T_CALLABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CALLABLE);
    exit_section_(b, m, CALLABLE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // (T_DEFAULT | T_CASE AssignmentExpressionWrapper) CaseSeparator InnerStatements*
  public static boolean CaseBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseBlock")) return false;
    if (!nextTokenIs(b, "<case block>", T_CASE, T_DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<case block>");
    r = CaseBlock_0(b, l + 1);
    r = r && CaseSeparator(b, l + 1);
    r = r && CaseBlock_2(b, l + 1);
    exit_section_(b, l, m, CASE_BLOCK, r, false, null);
    return r;
  }

  // T_DEFAULT | T_CASE AssignmentExpressionWrapper
  private static boolean CaseBlock_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseBlock_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DEFAULT);
    if (!r) r = CaseBlock_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_CASE AssignmentExpressionWrapper
  private static boolean CaseBlock_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseBlock_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CASE);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InnerStatements*
  private static boolean CaseBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseBlock_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerStatements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseBlock_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // CaseBlock*
  public static boolean CaseList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseList")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<case list>");
    int c = current_position_(b);
    while (true) {
      if (!CaseBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, CASE_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ':' | ';'
  public static boolean CaseSeparator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseSeparator")) return false;
    if (!nextTokenIs(b, "<case separator>", T_COLON, T_SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<case separator>");
    r = consumeToken(b, T_COLON);
    if (!r) r = consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, CASE_SEPARATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CastOperator  PrefixExpressionWrapper
  public static boolean CastExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<cast expression>");
    r = CastOperator(b, l + 1);
    p = r; // pin = 1
    r = r && PrefixExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, CAST_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CastExpression+|PrefixExpressionWrapper
  static boolean CastExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CastExpressionWrapper_0(b, l + 1);
    if (!r) r = PrefixExpressionWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CastExpression+
  private static boolean CastExpressionWrapper_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpressionWrapper_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CastExpression(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!CastExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CastExpressionWrapper_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_INT_CAST | T_DOUBLE_CAST | T_STRING_CAST | T_ARRAY_CAST | T_OBJECT_CAST | T_BOOL_CAST | T_UNSET_CAST
  public static boolean CastOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastOperator")) return false;
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
  // '{' ClassStatements* '}'
  public static boolean ClassBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassBlock")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, ClassBlock_1(b, l + 1));
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, CLASS_BLOCK, r, p, null);
    return r || p;
  }

  // ClassStatements*
  private static boolean ClassBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassBlock_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ClassStatements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassBlock_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // StaticClassName T_DOUBLE_COLON (Identifier|T_CLASS)
  public static boolean ClassConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class constant>");
    r = StaticClassName(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && ClassConstant_2(b, l + 1);
    exit_section_(b, l, m, CLASS_CONSTANT, r, false, null);
    return r;
  }

  // Identifier|T_CLASS
  private static boolean ClassConstant_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassConstant_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = consumeToken(b, T_CLASS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Attributes? (T_CLASS | (T_ABSTRACT T_CLASS) | (T_FINAL T_CLASS)) (XhpNameHolder | NameHolder TypeVar? ) Extends? Implements? ClassBlock
  public static boolean ClassDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<class declaration>");
    r = ClassDeclaration_0(b, l + 1);
    r = r && ClassDeclaration_1(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, ClassDeclaration_2(b, l + 1));
    r = p && report_error_(b, ClassDeclaration_3(b, l + 1)) && r;
    r = p && report_error_(b, ClassDeclaration_4(b, l + 1)) && r;
    r = p && ClassBlock(b, l + 1) && r;
    exit_section_(b, l, m, CLASS_DECLARATION, r, p, null);
    return r || p;
  }

  // Attributes?
  private static boolean ClassDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_0")) return false;
    Attributes(b, l + 1);
    return true;
  }

  // T_CLASS | (T_ABSTRACT T_CLASS) | (T_FINAL T_CLASS)
  private static boolean ClassDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CLASS);
    if (!r) r = ClassDeclaration_1_1(b, l + 1);
    if (!r) r = ClassDeclaration_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_ABSTRACT T_CLASS
  private static boolean ClassDeclaration_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_ABSTRACT, T_CLASS);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_FINAL T_CLASS
  private static boolean ClassDeclaration_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_FINAL, T_CLASS);
    exit_section_(b, m, null, r);
    return r;
  }

  // XhpNameHolder | NameHolder TypeVar?
  private static boolean ClassDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XhpNameHolder(b, l + 1);
    if (!r) r = ClassDeclaration_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NameHolder TypeVar?
  private static boolean ClassDeclaration_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NameHolder(b, l + 1);
    r = r && ClassDeclaration_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeVar?
  private static boolean ClassDeclaration_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_2_1_1")) return false;
    TypeVar(b, l + 1);
    return true;
  }

  // Extends?
  private static boolean ClassDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_3")) return false;
    Extends(b, l + 1);
    return true;
  }

  // Implements?
  private static boolean ClassDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_4")) return false;
    Implements(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ClassDeclaration
  public static boolean ClassStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class statement>");
    r = ClassDeclaration(b, l + 1);
    exit_section_(b, l, m, CLASS_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ClassVariableStatement ';'
  //                             | ConstantDeclaration ';'
  //                             | MethodStatement ';'?
  //                             | XhpAttributeStatement
  //                             | XhpCategoryStatement
  //                             | XhpChildrenStatement
  //                             | TraitRequireDeclarationStatement
  //                             | TraitUseDeclarationStatement
  static boolean ClassStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassStatements")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassStatements_0(b, l + 1);
    if (!r) r = ClassStatements_1(b, l + 1);
    if (!r) r = ClassStatements_2(b, l + 1);
    if (!r) r = XhpAttributeStatement(b, l + 1);
    if (!r) r = XhpCategoryStatement(b, l + 1);
    if (!r) r = XhpChildrenStatement(b, l + 1);
    if (!r) r = TraitRequireDeclarationStatement(b, l + 1);
    if (!r) r = TraitUseDeclarationStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ClassVariableStatement ';'
  private static boolean ClassStatements_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassStatements_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassVariableStatement(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ConstantDeclaration ';'
  private static boolean ClassStatements_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassStatements_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConstantDeclaration(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // MethodStatement ';'?
  private static boolean ClassStatements_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassStatements_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodStatement(b, l + 1);
    r = r && ClassStatements_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean ClassStatements_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassStatements_2_1")) return false;
    consumeToken(b, T_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // (StaticAssignment|VariableNameHolder) (','  (StaticAssignment|VariableNameHolder))*
  public static boolean ClassVariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableDeclaration")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassVariableDeclaration_0(b, l + 1);
    r = r && ClassVariableDeclaration_1(b, l + 1);
    exit_section_(b, m, CLASS_VARIABLE_DECLARATION, r);
    return r;
  }

  // StaticAssignment|VariableNameHolder
  private static boolean ClassVariableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StaticAssignment(b, l + 1);
    if (!r) r = VariableNameHolder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','  (StaticAssignment|VariableNameHolder))*
  private static boolean ClassVariableDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableDeclaration_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ClassVariableDeclaration_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassVariableDeclaration_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','  (StaticAssignment|VariableNameHolder)
  private static boolean ClassVariableDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ClassVariableDeclaration_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StaticAssignment|VariableNameHolder
  private static boolean ClassVariableDeclaration_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableDeclaration_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StaticAssignment(b, l + 1);
    if (!r) r = VariableNameHolder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (MemberModifier+ | T_VAR|MemberModifier+ Types?)  ClassVariableDeclaration
  public static boolean ClassVariableStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class variable statement>");
    r = ClassVariableStatement_0(b, l + 1);
    r = r && ClassVariableDeclaration(b, l + 1);
    exit_section_(b, l, m, CLASS_VARIABLE_STATEMENT, r, false, null);
    return r;
  }

  // MemberModifier+ | T_VAR|MemberModifier+ Types?
  private static boolean ClassVariableStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassVariableStatement_0_0(b, l + 1);
    if (!r) r = consumeToken(b, T_VAR);
    if (!r) r = ClassVariableStatement_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberModifier+
  private static boolean ClassVariableStatement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableStatement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MemberModifier(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!MemberModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassVariableStatement_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberModifier+ Types?
  private static boolean ClassVariableStatement_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableStatement_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassVariableStatement_0_2_0(b, l + 1);
    r = r && ClassVariableStatement_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberModifier+
  private static boolean ClassVariableStatement_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableStatement_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MemberModifier(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!MemberModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassVariableStatement_0_2_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Types?
  private static boolean ClassVariableStatement_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassVariableStatement_0_2_1")) return false;
    Types(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_CLONE AssignmentExpressionWrapper
  public static boolean CloneExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CloneExpression")) return false;
    if (!nextTokenIs(b, T_CLONE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, null);
    r = consumeToken(b, T_CLONE);
    p = r; // pin = 1
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, CLONE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ClosureFunction
  public static boolean ClosureExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClosureExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<closure expression>");
    r = ClosureFunction(b, l + 1);
    exit_section_(b, l, m, CLOSURE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MemberModifier* T_FUNCTION '&'? '('  ParameterList ')' ReturnType? LambdaUseVariables? Block
  public static boolean ClosureFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClosureFunction")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<closure function>");
    r = ClosureFunction_0(b, l + 1);
    r = r && consumeToken(b, T_FUNCTION);
    r = r && ClosureFunction_2(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 4
    r = r && report_error_(b, ParameterList(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && report_error_(b, ClosureFunction_6(b, l + 1)) && r;
    r = p && report_error_(b, ClosureFunction_7(b, l + 1)) && r;
    r = p && Block(b, l + 1) && r;
    exit_section_(b, l, m, CLOSURE_FUNCTION, r, p, null);
    return r || p;
  }

  // MemberModifier*
  private static boolean ClosureFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClosureFunction_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MemberModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClosureFunction_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '&'?
  private static boolean ClosureFunction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClosureFunction_2")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  // ReturnType?
  private static boolean ClosureFunction_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClosureFunction_6")) return false;
    ReturnType(b, l + 1);
    return true;
  }

  // LambdaUseVariables?
  private static boolean ClosureFunction_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClosureFunction_7")) return false;
    LambdaUseVariables(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FullyQualifiedClassName '{' ArrayPairList '}'
  public static boolean CollectionLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CollectionLiteralExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<collection literal expression>");
    r = FullyQualifiedClassName(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && ArrayPairList(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, l, m, COLLECTION_LITERAL_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ComparativeOperator BitwiseExpressionWrapper
  public static boolean ComparativeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComparativeExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<comparative expression>");
    r = ComparativeOperator(b, l + 1);
    p = r; // pin = 1
    r = r && BitwiseExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, COMPARATIVE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BitwiseExpressionWrapper ComparativeExpression*
  static boolean ComparativeExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComparativeExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitwiseExpressionWrapper(b, l + 1);
    r = r && ComparativeExpressionWrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ComparativeExpression*
  private static boolean ComparativeExpressionWrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComparativeExpressionWrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ComparativeExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ComparativeExpressionWrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_IS_IDENTICAL | T_IS_NOT_IDENTICAL | T_IS_EQUAL | T_IS_NOT_EQUAL | '<' | T_IS_SMALLER_OR_EQUAL | '>' | T_IS_GREATER_OR_EQUAL
  public static boolean ComparativeOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComparativeOperator")) return false;
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
  // Types? NameHolder '=' AssignmentExpressionWrapper
  public static boolean ConstantAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantAssignment")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<constant assignment>");
    r = ConstantAssignment_0(b, l + 1);
    r = r && NameHolder(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, T_EQUAL));
    r = p && AssignmentExpressionWrapper(b, l + 1) && r;
    exit_section_(b, l, m, CONSTANT_ASSIGNMENT, r, p, null);
    return r || p;
  }

  // Types?
  private static boolean ConstantAssignment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantAssignment_0")) return false;
    Types(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_CONST ConstantAssignment (',' ConstantAssignment)*
  public static boolean ConstantDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantDeclaration")) return false;
    if (!nextTokenIs(b, T_CONST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_CONST);
    p = r; // pin = 1
    r = r && report_error_(b, ConstantAssignment(b, l + 1));
    r = p && ConstantDeclaration_2(b, l + 1) && r;
    exit_section_(b, l, m, CONSTANT_DECLARATION, r, p, null);
    return r || p;
  }

  // (',' ConstantAssignment)*
  private static boolean ConstantDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantDeclaration_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ConstantDeclaration_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConstantDeclaration_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ConstantAssignment
  private static boolean ConstantDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ConstantAssignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ConstantDeclaration ';'
  public static boolean ConstantStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantStatement")) return false;
    if (!nextTokenIs(b, T_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConstantDeclaration(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, CONSTANT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // T_CONTINUE AssignmentExpressionWrapper? ';'
  public static boolean ContinueStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueStatement")) return false;
    if (!nextTokenIs(b, T_CONTINUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_CONTINUE);
    p = r; // pin = 1
    r = r && report_error_(b, ContinueStatement_1(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, CONTINUE_STATEMENT, r, p, null);
    return r || p;
  }

  // AssignmentExpressionWrapper?
  private static boolean ContinueStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueStatement_1")) return false;
    AssignmentExpressionWrapper(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NameHolder '=' AssignmentExpressionWrapper
  public static boolean DeclareAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclareAssignment")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<declare assignment>");
    r = NameHolder(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    p = r; // pin = 2
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, DECLARE_ASSIGNMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (DeclareAssignment (',' DeclareAssignment )*)?
  public static boolean DeclareList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclareList")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<declare list>");
    DeclareList_0(b, l + 1);
    exit_section_(b, l, m, DECLARE_LIST, true, false, null);
    return true;
  }

  // DeclareAssignment (',' DeclareAssignment )*
  private static boolean DeclareList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclareList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclareAssignment(b, l + 1);
    r = r && DeclareList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' DeclareAssignment )*
  private static boolean DeclareList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclareList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DeclareList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DeclareList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' DeclareAssignment
  private static boolean DeclareList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclareList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && DeclareAssignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_DECLARE '(' DeclareList ')' (':' InnerStatements* T_ENDDECLARE ';' | NormalStatements)
  public static boolean DeclareStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclareStatement")) return false;
    if (!nextTokenIs(b, T_DECLARE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_DECLARE);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, DeclareList(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && DeclareStatement_4(b, l + 1) && r;
    exit_section_(b, l, m, DECLARE_STATEMENT, r, p, null);
    return r || p;
  }

  // ':' InnerStatements* T_ENDDECLARE ';' | NormalStatements
  private static boolean DeclareStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclareStatement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclareStatement_4_0(b, l + 1);
    if (!r) r = NormalStatements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' InnerStatements* T_ENDDECLARE ';'
  private static boolean DeclareStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclareStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    r = r && DeclareStatement_4_0_1(b, l + 1);
    r = r && consumeToken(b, T_ENDDECLARE);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // InnerStatements*
  private static boolean DeclareStatement_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclareStatement_4_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerStatements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DeclareStatement_4_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_DO  NormalStatements T_WHILE ParenthesizedExpression ';'
  public static boolean DoWhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileStatement")) return false;
    if (!nextTokenIs(b, T_DO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_DO);
    p = r; // pin = 1
    r = r && report_error_(b, NormalStatements(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_WHILE)) && r;
    r = p && report_error_(b, ParenthesizedExpression(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, DO_WHILE_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '"' EncapsList '"'
  public static boolean DoubleQuotesString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoubleQuotesString")) return false;
    if (!nextTokenIs(b, T_DOUBLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOUBLE_QUOTE);
    r = r && EncapsList(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_QUOTE);
    exit_section_(b, m, DOUBLE_QUOTES_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // VariableExpressionVariable | VariableIdentifier | ExpressionVariable
  public static boolean DynamicVariableExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DynamicVariableExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<dynamic variable expression>");
    r = VariableExpressionVariable(b, l + 1);
    if (!r) r = VariableIdentifier(b, l + 1);
    if (!r) r = ExpressionVariable(b, l + 1);
    exit_section_(b, l, m, DYNAMIC_VARIABLE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_ECHO ExpressionList ';'
  public static boolean EchoStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EchoStatement")) return false;
    if (!nextTokenIs(b, T_ECHO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ECHO);
    p = r; // pin = 1
    r = r && report_error_(b, ExpressionList(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, ECHO_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_ELSEIF ParenthesizedExpression NormalStatements
  public static boolean ElseIfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement")) return false;
    if (!nextTokenIs(b, T_ELSEIF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ELSEIF);
    p = r; // pin = 1
    r = r && report_error_(b, ParenthesizedExpression(b, l + 1));
    r = p && NormalStatements(b, l + 1) && r;
    exit_section_(b, l, m, ELSE_IF_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_ELSE NormalStatements
  public static boolean ElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement")) return false;
    if (!nextTokenIs(b, T_ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ELSE);
    p = r; // pin = 1
    r = r && NormalStatements(b, l + 1);
    exit_section_(b, l, m, ELSE_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_EMPTY '(' AssignmentExpressionWrapper ')'
  public static boolean EmptyExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmptyExpression")) return false;
    if (!nextTokenIs(b, T_EMPTY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_EMPTY);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, AssignmentExpressionWrapper(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, EMPTY_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_CURLY_OPEN MemberVariableWrapper '}'
  public static boolean EncapsBraceExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncapsBraceExpression")) return false;
    if (!nextTokenIs(b, T_CURLY_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_CURLY_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, MemberVariableWrapper(b, l + 1));
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, ENCAPS_BRACE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_DOLLAR_OPEN_CURLY_BRACES T_STRING_VARNAME '[' AssignmentExpressionWrapper ']' '}'
  public static boolean EncapsBraceIndexOffsetExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncapsBraceIndexOffsetExpression")) return false;
    if (!nextTokenIs(b, T_DOLLAR_OPEN_CURLY_BRACES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 2, T_DOLLAR_OPEN_CURLY_BRACES, T_STRING_VARNAME);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, T_LBRACKET));
    r = p && report_error_(b, AssignmentExpressionWrapper(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RBRACKET)) && r;
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, ENCAPS_BRACE_INDEX_OFFSET_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_DOLLAR_OPEN_CURLY_BRACES AssignmentExpressionWrapper '}'
  public static boolean EncapsExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncapsExpression")) return false;
    if (!nextTokenIs(b, T_DOLLAR_OPEN_CURLY_BRACES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_DOLLAR_OPEN_CURLY_BRACES);
    p = r; // pin = 1
    r = r && report_error_(b, AssignmentExpressionWrapper(b, l + 1));
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, ENCAPS_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // VariableIdentifier T_OBJECT_OPERATOR Identifier
  public static boolean EncapsFieldAccessExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncapsFieldAccessExpression")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableIdentifier(b, l + 1);
    r = r && consumeToken(b, T_OBJECT_OPERATOR);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, ENCAPS_FIELD_ACCESS_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // VariableIdentifier '[' EncapsVarOffset ']'
  public static boolean EncapsIndexOffsetExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncapsIndexOffsetExpression")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = VariableIdentifier(b, l + 1);
    r = r && consumeToken(b, T_LBRACKET);
    p = r; // pin = 2
    r = r && report_error_(b, EncapsVarOffset(b, l + 1));
    r = p && consumeToken(b, T_RBRACKET) && r;
    exit_section_(b, l, m, ENCAPS_INDEX_OFFSET_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (T_ENCAPSED_AND_WHITESPACE|EncapsVar)*
  public static boolean EncapsList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncapsList")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<encaps list>");
    int c = current_position_(b);
    while (true) {
      if (!EncapsList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EncapsList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, ENCAPS_LIST, true, false, null);
    return true;
  }

  // T_ENCAPSED_AND_WHITESPACE|EncapsVar
  private static boolean EncapsList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncapsList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ENCAPSED_AND_WHITESPACE);
    if (!r) r = EncapsVar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EncapsIndexOffsetExpression
  //                     | EncapsFieldAccessExpression
  //                     | VariableIdentifier
  //                     | EncapsExpression
  //                     | EncapsBraceIndexOffsetExpression
  //                     | EncapsBraceExpression
  public static boolean EncapsVar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncapsVar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<encaps var>");
    r = EncapsIndexOffsetExpression(b, l + 1);
    if (!r) r = EncapsFieldAccessExpression(b, l + 1);
    if (!r) r = VariableIdentifier(b, l + 1);
    if (!r) r = EncapsExpression(b, l + 1);
    if (!r) r = EncapsBraceIndexOffsetExpression(b, l + 1);
    if (!r) r = EncapsBraceExpression(b, l + 1);
    exit_section_(b, l, m, ENCAPS_VAR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Identifier | T_NUM_STRING | VariableIdentifier
  public static boolean EncapsVarOffset(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EncapsVarOffset")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<encaps var offset>");
    r = Identifier(b, l + 1);
    if (!r) r = consumeToken(b, T_NUM_STRING);
    if (!r) r = VariableIdentifier(b, l + 1);
    exit_section_(b, l, m, ENCAPS_VAR_OFFSET, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Types? NameHolder '=' AssignmentExpressionWrapper
  public static boolean EnumConstantDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumConstantDeclaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<enum constant declaration>");
    r = EnumConstantDeclaration_0(b, l + 1);
    r = r && NameHolder(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, T_EQUAL));
    r = p && AssignmentExpressionWrapper(b, l + 1) && r;
    exit_section_(b, l, m, ENUM_CONSTANT_DECLARATION, r, p, null);
    return r || p;
  }

  // Types?
  private static boolean EnumConstantDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumConstantDeclaration_0")) return false;
    Types(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // EnumConstantDeclaration ';'
  public static boolean EnumConstantStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumConstantStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum constant statement>");
    r = EnumConstantDeclaration(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, ENUM_CONSTANT_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Attributes? T_ENUM NameHolder  ':' Types (T_AS Types)? '{' EnumConstantStatement* '}'
  public static boolean EnumDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration")) return false;
    if (!nextTokenIs(b, "<enum declaration>", T_ENUM, T_SL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<enum declaration>");
    r = EnumDeclaration_0(b, l + 1);
    r = r && consumeToken(b, T_ENUM);
    p = r; // pin = 2
    r = r && report_error_(b, NameHolder(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COLON)) && r;
    r = p && report_error_(b, Types(b, l + 1)) && r;
    r = p && report_error_(b, EnumDeclaration_5(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_LBRACE)) && r;
    r = p && report_error_(b, EnumDeclaration_7(b, l + 1)) && r;
    r = p && consumeToken(b, T_RBRACE) && r;
    exit_section_(b, l, m, ENUM_DECLARATION, r, p, null);
    return r || p;
  }

  // Attributes?
  private static boolean EnumDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_0")) return false;
    Attributes(b, l + 1);
    return true;
  }

  // (T_AS Types)?
  private static boolean EnumDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_5")) return false;
    EnumDeclaration_5_0(b, l + 1);
    return true;
  }

  // T_AS Types
  private static boolean EnumDeclaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && Types(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EnumConstantStatement*
  private static boolean EnumDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EnumConstantStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumDeclaration_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EnumDeclaration
  public static boolean EnumStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumStatement")) return false;
    if (!nextTokenIs(b, "<enum statement>", T_ENUM, T_SL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum statement>");
    r = EnumDeclaration(b, l + 1);
    exit_section_(b, l, m, ENUM_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' ExpressionWithParentheses ')'
  public static boolean EspecialParenthesisedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EspecialParenthesisedExpression")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    r = r && ExpressionWithParentheses(b, l + 1);
    p = r; // pin = 2
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, l, m, ESPECIAL_PARENTHESISED_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_EVAL '(' AssignmentExpressionWrapper ')'
  public static boolean EvalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EvalExpression")) return false;
    if (!nextTokenIs(b, T_EVAL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_EVAL);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, AssignmentExpressionWrapper(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, EVAL_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_EXIT (('(' ')' ) | ParenthesizedExpression)
  public static boolean ExitExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExitExpression")) return false;
    if (!nextTokenIs(b, T_EXIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EXIT);
    r = r && ExitExpression_1(b, l + 1);
    exit_section_(b, m, EXIT_EXPRESSION, r);
    return r;
  }

  // ('(' ')' ) | ParenthesizedExpression
  private static boolean ExitExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExitExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExitExpression_1_0(b, l + 1);
    if (!r) r = ParenthesizedExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' ')'
  private static boolean ExitExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExitExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (AssignmentExpressionWrapper (',' AssignmentExpressionWrapper)*)?
  public static boolean ExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<expression list>");
    ExpressionList_0(b, l + 1);
    exit_section_(b, l, m, EXPRESSION_LIST, true, false, null);
    return true;
  }

  // AssignmentExpressionWrapper (',' AssignmentExpressionWrapper)*
  private static boolean ExpressionList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentExpressionWrapper(b, l + 1);
    r = r && ExpressionList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' AssignmentExpressionWrapper)*
  private static boolean ExpressionList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ExpressionList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExpressionList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' AssignmentExpressionWrapper
  private static boolean ExpressionList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (YieldExpression
  //                         |YieldAssignExpression
  //                         |YieldListAssignExpression
  //                         |AwaitExpression
  //                         |AwaitAssignExpression
  //                         |AwaitListAssignExpression
  //                         |QueryAssignExpression
  //                         |AssignmentExpressionWrapper) ';'
  public static boolean ExpressionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression statement>");
    r = ExpressionStatement_0(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, EXPRESSION_STATEMENT, r, false, null);
    return r;
  }

  // YieldExpression
  //                         |YieldAssignExpression
  //                         |YieldListAssignExpression
  //                         |AwaitExpression
  //                         |AwaitAssignExpression
  //                         |AwaitListAssignExpression
  //                         |QueryAssignExpression
  //                         |AssignmentExpressionWrapper
  private static boolean ExpressionStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = YieldExpression(b, l + 1);
    if (!r) r = YieldAssignExpression(b, l + 1);
    if (!r) r = YieldListAssignExpression(b, l + 1);
    if (!r) r = AwaitExpression(b, l + 1);
    if (!r) r = AwaitAssignExpression(b, l + 1);
    if (!r) r = AwaitListAssignExpression(b, l + 1);
    if (!r) r = QueryAssignExpression(b, l + 1);
    if (!r) r = AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '$' '{' AssignmentExpressionWrapper '}'
  public static boolean ExpressionVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionVariable")) return false;
    if (!nextTokenIs(b, T_DOLLAR_SIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOLLAR_SIGN);
    r = r && consumeToken(b, T_LBRACE);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, EXPRESSION_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // EspecialParenthesisedExpression
  //                             | NewExpression
  //                             | CloneExpression
  //                             | XhpExpression
  //                             | CollectionLiteralExpression
  static boolean ExpressionWithParentheses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionWithParentheses")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EspecialParenthesisedExpression(b, l + 1);
    if (!r) r = NewExpression(b, l + 1);
    if (!r) r = CloneExpression(b, l + 1);
    if (!r) r = XhpExpression(b, l + 1);
    if (!r) r = CollectionLiteralExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_EXTENDS FullyQualifiedClassName
  public static boolean Extends(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Extends")) return false;
    if (!nextTokenIs(b, T_EXTENDS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_EXTENDS);
    p = r; // pin = 1
    r = r && FullyQualifiedClassName(b, l + 1);
    exit_section_(b, l, m, EXTENDS, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_FOR '(' ExpressionList ';' ExpressionList ';' ExpressionList ')'  (':' InnerStatements* T_ENDFOR ';' | NormalStatements)
  public static boolean ForStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement")) return false;
    if (!nextTokenIs(b, T_FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_FOR);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, ExpressionList(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_SEMICOLON)) && r;
    r = p && report_error_(b, ExpressionList(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_SEMICOLON)) && r;
    r = p && report_error_(b, ExpressionList(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && ForStatement_8(b, l + 1) && r;
    exit_section_(b, l, m, FOR_STATEMENT, r, p, null);
    return r || p;
  }

  // ':' InnerStatements* T_ENDFOR ';' | NormalStatements
  private static boolean ForStatement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForStatement_8_0(b, l + 1);
    if (!r) r = NormalStatements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' InnerStatements* T_ENDFOR ';'
  private static boolean ForStatement_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    r = r && ForStatement_8_0_1(b, l + 1);
    r = r && consumeToken(b, T_ENDFOR);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // InnerStatements*
  private static boolean ForStatement_8_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_8_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerStatements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForStatement_8_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_DOUBLE_ARROW ForeachVariable
  public static boolean ForeachOptionalArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachOptionalArg")) return false;
    if (!nextTokenIs(b, T_DOUBLE_ARROW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_DOUBLE_ARROW);
    p = r; // pin = 1
    r = r && ForeachVariable(b, l + 1);
    exit_section_(b, l, m, FOREACH_OPTIONAL_ARG, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_FOREACH '(' AssignmentExpressionWrapper T_AWAIT? T_AS ForeachVariable ForeachOptionalArg? ')'  (':' InnerStatements* T_ENDFOREACH ';' | NormalStatements)
  public static boolean ForeachStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement")) return false;
    if (!nextTokenIs(b, T_FOREACH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, null);
    r = consumeToken(b, T_FOREACH);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, AssignmentExpressionWrapper(b, l + 1)) && r;
    r = p && report_error_(b, ForeachStatement_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_AS)) && r;
    r = p && report_error_(b, ForeachVariable(b, l + 1)) && r;
    r = p && report_error_(b, ForeachStatement_6(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && ForeachStatement_8(b, l + 1) && r;
    exit_section_(b, l, m, FOREACH_STATEMENT, r, p, null);
    return r || p;
  }

  // T_AWAIT?
  private static boolean ForeachStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_3")) return false;
    consumeToken(b, T_AWAIT);
    return true;
  }

  // ForeachOptionalArg?
  private static boolean ForeachStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_6")) return false;
    ForeachOptionalArg(b, l + 1);
    return true;
  }

  // ':' InnerStatements* T_ENDFOREACH ';' | NormalStatements
  private static boolean ForeachStatement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForeachStatement_8_0(b, l + 1);
    if (!r) r = NormalStatements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' InnerStatements* T_ENDFOREACH ';'
  private static boolean ForeachStatement_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    r = r && ForeachStatement_8_0_1(b, l + 1);
    r = r && consumeToken(b, T_ENDFOREACH);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // InnerStatements*
  private static boolean ForeachStatement_8_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_8_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerStatements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForeachStatement_8_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ('&'? MemberVariableWrapper) | ListAssignmentVariables
  public static boolean ForeachVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachVariable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach variable>");
    r = ForeachVariable_0(b, l + 1);
    if (!r) r = ListAssignmentVariables(b, l + 1);
    exit_section_(b, l, m, FOREACH_VARIABLE, r, false, null);
    return r;
  }

  // '&'? MemberVariableWrapper
  private static boolean ForeachVariable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachVariable_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForeachVariable_0_0(b, l + 1);
    r = r && MemberVariableWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&'?
  private static boolean ForeachVariable_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachVariable_0_0")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  /* ********************************************************** */
  // T_FROM VariableIdentifier T_IN AssignmentExpressionWrapper
  public static boolean FromClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FromClause")) return false;
    if (!nextTokenIs(b, T_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_FROM);
    r = r && VariableIdentifier(b, l + 1);
    r = r && consumeToken(b, T_IN);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, FROM_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // T_NAMESPACE? NamespaceName TypeArgs? | XhpIdentifier
  public static boolean FullyQualifiedClassName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullyQualifiedClassName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<fully qualified class name>");
    r = FullyQualifiedClassName_0(b, l + 1);
    if (!r) r = XhpIdentifier(b, l + 1);
    exit_section_(b, l, m, FULLY_QUALIFIED_CLASS_NAME, r, false, null);
    return r;
  }

  // T_NAMESPACE? NamespaceName TypeArgs?
  private static boolean FullyQualifiedClassName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullyQualifiedClassName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FullyQualifiedClassName_0_0(b, l + 1);
    r = r && NamespaceName(b, l + 1);
    r = r && FullyQualifiedClassName_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_NAMESPACE?
  private static boolean FullyQualifiedClassName_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullyQualifiedClassName_0_0")) return false;
    consumeToken(b, T_NAMESPACE);
    return true;
  }

  // TypeArgs?
  private static boolean FullyQualifiedClassName_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullyQualifiedClassName_0_2")) return false;
    TypeArgs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FullyQualifiedClassName T_DOUBLE_COLON Identifier
  public static boolean FullyQualifiedStaticIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullyQualifiedStaticIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<fully qualified static identifier>");
    r = FullyQualifiedClassName(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, FULLY_QUALIFIED_STATIC_IDENTIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FullyQualifiedClassName '(' CallParameterList ')'
  public static boolean FunctionCallExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<function call expression>");
    r = FullyQualifiedClassName(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, CallParameterList(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, FUNCTION_CALL_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Attributes? MemberModifier* T_FUNCTION '&'? NameHolder TypeVar?  '(' ParameterList ')' ReturnType? (Block | ';')
  public static boolean FunctionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDeclaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<function declaration>");
    r = FunctionDeclaration_0(b, l + 1);
    r = r && FunctionDeclaration_1(b, l + 1);
    r = r && consumeToken(b, T_FUNCTION);
    r = r && FunctionDeclaration_3(b, l + 1);
    r = r && NameHolder(b, l + 1);
    p = r; // pin = 5
    r = r && report_error_(b, FunctionDeclaration_5(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_LPAREN)) && r;
    r = p && report_error_(b, ParameterList(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && report_error_(b, FunctionDeclaration_9(b, l + 1)) && r;
    r = p && FunctionDeclaration_10(b, l + 1) && r;
    exit_section_(b, l, m, FUNCTION_DECLARATION, r, p, null);
    return r || p;
  }

  // Attributes?
  private static boolean FunctionDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDeclaration_0")) return false;
    Attributes(b, l + 1);
    return true;
  }

  // MemberModifier*
  private static boolean FunctionDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDeclaration_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MemberModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDeclaration_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '&'?
  private static boolean FunctionDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDeclaration_3")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  // TypeVar?
  private static boolean FunctionDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDeclaration_5")) return false;
    TypeVar(b, l + 1);
    return true;
  }

  // ReturnType?
  private static boolean FunctionDeclaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDeclaration_9")) return false;
    ReturnType(b, l + 1);
    return true;
  }

  // Block | ';'
  private static boolean FunctionDeclaration_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDeclaration_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Block(b, l + 1);
    if (!r) r = consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionDeclaration
  public static boolean FunctionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function statement>");
    r = FunctionDeclaration(b, l + 1);
    exit_section_(b, l, m, FUNCTION_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' T_FUNCTION '(' (Types (',' Types)* (','|"...")?)? ')' ReturnType ')'
  public static boolean FunctionType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionType")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    r = r && consumeToken(b, T_FUNCTION);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, FunctionType_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && report_error_(b, ReturnType(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, FUNCTION_TYPE, r, p, null);
    return r || p;
  }

  // (Types (',' Types)* (','|"...")?)?
  private static boolean FunctionType_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionType_3")) return false;
    FunctionType_3_0(b, l + 1);
    return true;
  }

  // Types (',' Types)* (','|"...")?
  private static boolean FunctionType_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionType_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Types(b, l + 1);
    r = r && FunctionType_3_0_1(b, l + 1);
    r = r && FunctionType_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Types)*
  private static boolean FunctionType_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionType_3_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionType_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionType_3_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Types
  private static boolean FunctionType_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionType_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && Types(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','|"...")?
  private static boolean FunctionType_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionType_3_0_2")) return false;
    FunctionType_3_0_2_0(b, l + 1);
    return true;
  }

  // ','|"..."
  private static boolean FunctionType_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionType_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    if (!r) r = consumeToken(b, T_ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_GLOBAL GlobalVarList ';'
  public static boolean GlobalStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalStatement")) return false;
    if (!nextTokenIs(b, T_GLOBAL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_GLOBAL);
    p = r; // pin = 1
    r = r && report_error_(b, GlobalVarList(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, GLOBAL_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // VariableNameHolder | ('$' MemberVariableWrapper) | (ExpressionVariable)
  public static boolean GlobalVar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVar")) return false;
    if (!nextTokenIs(b, "<global var>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global var>");
    r = VariableNameHolder(b, l + 1);
    if (!r) r = GlobalVar_1(b, l + 1);
    if (!r) r = GlobalVar_2(b, l + 1);
    exit_section_(b, l, m, GLOBAL_VAR, r, false, null);
    return r;
  }

  // '$' MemberVariableWrapper
  private static boolean GlobalVar_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVar_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOLLAR_SIGN);
    r = r && MemberVariableWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ExpressionVariable)
  private static boolean GlobalVar_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVar_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionVariable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (GlobalVar (',' GlobalVar)*)?
  public static boolean GlobalVarList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVarList")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<global var list>");
    GlobalVarList_0(b, l + 1);
    exit_section_(b, l, m, GLOBAL_VAR_LIST, true, false, null);
    return true;
  }

  // GlobalVar (',' GlobalVar)*
  private static boolean GlobalVarList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVarList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GlobalVar(b, l + 1);
    r = r && GlobalVarList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' GlobalVar)*
  private static boolean GlobalVarList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVarList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!GlobalVarList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GlobalVarList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' GlobalVar
  private static boolean GlobalVarList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GlobalVarList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && GlobalVar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_GOTO Identifier ';'
  public static boolean GotoStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement")) return false;
    if (!nextTokenIs(b, T_GOTO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_GOTO);
    p = r; // pin = 1
    r = r && report_error_(b, Identifier(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, GOTO_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_GROUP AssignmentExpressionWrapper T_BY AssignmentExpressionWrapper
  public static boolean GroupClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GroupClause")) return false;
    if (!nextTokenIs(b, T_GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_GROUP);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    r = r && consumeToken(b, T_BY);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, GROUP_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // T_INLINE_HTML? T_OPEN_TAG TopStatementList?
  static boolean HackFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HackFile")) return false;
    if (!nextTokenIs(b, "", T_INLINE_HTML, T_OPEN_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = HackFile_0(b, l + 1);
    r = r && consumeToken(b, T_OPEN_TAG);
    r = r && HackFile_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_INLINE_HTML?
  private static boolean HackFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HackFile_0")) return false;
    consumeToken(b, T_INLINE_HTML);
    return true;
  }

  // TopStatementList?
  private static boolean HackFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HackFile_2")) return false;
    TopStatementList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_HALT_COMPILER '(' ')' ';'
  public static boolean HaltCompilerStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HaltCompilerStatement")) return false;
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
  // T_START_HEREDOC EncapsList T_END_HEREDOC
  public static boolean HereDocString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HereDocString")) return false;
    if (!nextTokenIs(b, T_START_HEREDOC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_START_HEREDOC);
    r = r && EncapsList(b, l + 1);
    r = r && consumeToken(b, T_END_HEREDOC);
    exit_section_(b, m, HERE_DOC_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // T_CLOSE_TAG T_INLINE_HTML? T_OPEN_TAG?
  public static boolean HtmlStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HtmlStatement")) return false;
    if (!nextTokenIs(b, T_CLOSE_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CLOSE_TAG);
    r = r && HtmlStatement_1(b, l + 1);
    r = r && HtmlStatement_2(b, l + 1);
    exit_section_(b, m, HTML_STATEMENT, r);
    return r;
  }

  // T_INLINE_HTML?
  private static boolean HtmlStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HtmlStatement_1")) return false;
    consumeToken(b, T_INLINE_HTML);
    return true;
  }

  // T_OPEN_TAG?
  private static boolean HtmlStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HtmlStatement_2")) return false;
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
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
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
  // FullyQualifiedClassName
  public static boolean IdentifierType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<identifier type>");
    r = FullyQualifiedClassName(b, l + 1);
    exit_section_(b, l, m, IDENTIFIER_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_IF ParenthesizedExpression NormalStatements ElseIfStatement* ElseStatement?
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, T_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_IF);
    r = r && ParenthesizedExpression(b, l + 1);
    r = r && NormalStatements(b, l + 1);
    r = r && IfStatement_3(b, l + 1);
    r = r && IfStatement_4(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // ElseIfStatement*
  private static boolean IfStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ElseIfStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfStatement_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ElseStatement?
  private static boolean IfStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_4")) return false;
    ElseStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_IMPLEMENTS (FullyQualifiedClassName (',' FullyQualifiedClassName)*)?
  public static boolean Implements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Implements")) return false;
    if (!nextTokenIs(b, T_IMPLEMENTS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_IMPLEMENTS);
    p = r; // pin = 1
    r = r && Implements_1(b, l + 1);
    exit_section_(b, l, m, IMPLEMENTS, r, p, null);
    return r || p;
  }

  // (FullyQualifiedClassName (',' FullyQualifiedClassName)*)?
  private static boolean Implements_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Implements_1")) return false;
    Implements_1_0(b, l + 1);
    return true;
  }

  // FullyQualifiedClassName (',' FullyQualifiedClassName)*
  private static boolean Implements_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Implements_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FullyQualifiedClassName(b, l + 1);
    r = r && Implements_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' FullyQualifiedClassName)*
  private static boolean Implements_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Implements_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Implements_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Implements_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' FullyQualifiedClassName
  private static boolean Implements_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Implements_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && FullyQualifiedClassName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (T_INCLUDE|T_INCLUDE_ONCE) AssignmentExpressionWrapper
  public static boolean IncludeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncludeExpression")) return false;
    if (!nextTokenIs(b, "<include expression>", T_INCLUDE, T_INCLUDE_ONCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<include expression>");
    r = IncludeExpression_0(b, l + 1);
    p = r; // pin = 1
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, INCLUDE_EXPRESSION, r, p, null);
    return r || p;
  }

  // T_INCLUDE|T_INCLUDE_ONCE
  private static boolean IncludeExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncludeExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_INCLUDE);
    if (!r) r = consumeToken(b, T_INCLUDE_ONCE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NormalStatements
  //                     | FunctionStatement
  //                     | ClassStatement
  //                     | InterfaceStatement
  //                     | TraitStatement
  static boolean InnerStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InnerStatements")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NormalStatements(b, l + 1);
    if (!r) r = FunctionStatement(b, l + 1);
    if (!r) r = ClassStatement(b, l + 1);
    if (!r) r = InterfaceStatement(b, l + 1);
    if (!r) r = TraitStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_INSTANCEOF AssignmentExpressionWrapper
  public static boolean InstanceofExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InstanceofExpression")) return false;
    if (!nextTokenIs(b, T_INSTANCEOF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_INSTANCEOF);
    p = r; // pin = 1
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, INSTANCEOF_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CastExpressionWrapper InstanceofExpression*
  static boolean InstanceofExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InstanceofExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CastExpressionWrapper(b, l + 1);
    r = r && InstanceofExpressionWrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InstanceofExpression*
  private static boolean InstanceofExpressionWrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InstanceofExpressionWrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InstanceofExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InstanceofExpressionWrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_EXTENDS (FullyQualifiedClassName (',' FullyQualifiedClassName)*)?
  public static boolean InterfaceExtends(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends")) return false;
    if (!nextTokenIs(b, T_EXTENDS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_EXTENDS);
    p = r; // pin = 1
    r = r && InterfaceExtends_1(b, l + 1);
    exit_section_(b, l, m, INTERFACE_EXTENDS, r, p, null);
    return r || p;
  }

  // (FullyQualifiedClassName (',' FullyQualifiedClassName)*)?
  private static boolean InterfaceExtends_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1")) return false;
    InterfaceExtends_1_0(b, l + 1);
    return true;
  }

  // FullyQualifiedClassName (',' FullyQualifiedClassName)*
  private static boolean InterfaceExtends_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FullyQualifiedClassName(b, l + 1);
    r = r && InterfaceExtends_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' FullyQualifiedClassName)*
  private static boolean InterfaceExtends_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InterfaceExtends_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceExtends_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' FullyQualifiedClassName
  private static boolean InterfaceExtends_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && FullyQualifiedClassName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Attributes? T_INTERFACE NameHolder TypeVar?  InterfaceExtends? ClassBlock
  public static boolean InterfaceStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceStatement")) return false;
    if (!nextTokenIs(b, "<interface statement>", T_INTERFACE, T_SL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<interface statement>");
    r = InterfaceStatement_0(b, l + 1);
    r = r && consumeToken(b, T_INTERFACE);
    p = r; // pin = 2
    r = r && report_error_(b, NameHolder(b, l + 1));
    r = p && report_error_(b, InterfaceStatement_3(b, l + 1)) && r;
    r = p && report_error_(b, InterfaceStatement_4(b, l + 1)) && r;
    r = p && ClassBlock(b, l + 1) && r;
    exit_section_(b, l, m, INTERFACE_STATEMENT, r, p, null);
    return r || p;
  }

  // Attributes?
  private static boolean InterfaceStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceStatement_0")) return false;
    Attributes(b, l + 1);
    return true;
  }

  // TypeVar?
  private static boolean InterfaceStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceStatement_3")) return false;
    TypeVar(b, l + 1);
    return true;
  }

  // InterfaceExtends?
  private static boolean InterfaceStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceStatement_4")) return false;
    InterfaceExtends(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_ISSET '(' VariableList ')'
  public static boolean IssetExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IssetExpression")) return false;
    if (!nextTokenIs(b, T_ISSET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ISSET);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, VariableList(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, ISSET_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_JOIN VariableIdentifier T_IN AssignmentExpressionWrapper T_ON AssignmentExpressionWrapper T_EQUALS AssignmentExpressionWrapper
  public static boolean JoinClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinClause")) return false;
    if (!nextTokenIs(b, T_JOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_JOIN);
    r = r && VariableIdentifier(b, l + 1);
    r = r && consumeToken(b, T_IN);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    r = r && consumeToken(b, T_ON);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    r = r && consumeToken(b, T_EQUALS);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, JOIN_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // T_JOIN VariableIdentifier T_IN AssignmentExpressionWrapper T_ON AssignmentExpressionWrapper T_EQUALS AssignmentExpressionWrapper T_INTO VariableIdentifier
  public static boolean JoinIntoClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JoinIntoClause")) return false;
    if (!nextTokenIs(b, T_JOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_JOIN);
    r = r && VariableIdentifier(b, l + 1);
    r = r && consumeToken(b, T_IN);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    r = r && consumeToken(b, T_ON);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    r = r && consumeToken(b, T_EQUALS);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    r = r && consumeToken(b, T_INTO);
    r = r && VariableIdentifier(b, l + 1);
    exit_section_(b, m, JOIN_INTO_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // NameHolder ':'
  public static boolean LabelStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<label statement>");
    r = NameHolder(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    exit_section_(b, l, m, LABEL_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_LAMBDA_ARROW (AssignmentExpressionWrapper | AwaitExpression | Block)
  public static boolean LambdaBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaBody")) return false;
    if (!nextTokenIs(b, T_LAMBDA_ARROW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LAMBDA_ARROW);
    p = r; // pin = 1
    r = r && LambdaBody_1(b, l + 1);
    exit_section_(b, l, m, LAMBDA_BODY, r, p, null);
    return r || p;
  }

  // AssignmentExpressionWrapper | AwaitExpression | Block
  private static boolean LambdaBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentExpressionWrapper(b, l + 1);
    if (!r) r = AwaitExpression(b, l + 1);
    if (!r) r = Block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LambdaFunction
  public static boolean LambdaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lambda expression>");
    r = LambdaFunction(b, l + 1);
    exit_section_(b, l, m, LAMBDA_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_ASYNC? ((T_LAMBDA_OP  ParameterList T_LAMBDA_CP ReturnType?)|ParameterList) LambdaBody
  public static boolean LambdaFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lambda function>");
    r = LambdaFunction_0(b, l + 1);
    r = r && LambdaFunction_1(b, l + 1);
    r = r && LambdaBody(b, l + 1);
    exit_section_(b, l, m, LAMBDA_FUNCTION, r, false, null);
    return r;
  }

  // T_ASYNC?
  private static boolean LambdaFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction_0")) return false;
    consumeToken(b, T_ASYNC);
    return true;
  }

  // (T_LAMBDA_OP  ParameterList T_LAMBDA_CP ReturnType?)|ParameterList
  private static boolean LambdaFunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LambdaFunction_1_0(b, l + 1);
    if (!r) r = ParameterList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_LAMBDA_OP  ParameterList T_LAMBDA_CP ReturnType?
  private static boolean LambdaFunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LAMBDA_OP);
    r = r && ParameterList(b, l + 1);
    r = r && consumeToken(b, T_LAMBDA_CP);
    r = r && LambdaFunction_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ReturnType?
  private static boolean LambdaFunction_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction_1_0_3")) return false;
    ReturnType(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_USE '(' LexicalVarList ')'
  public static boolean LambdaUseVariables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaUseVariables")) return false;
    if (!nextTokenIs(b, T_USE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_USE);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, LexicalVarList(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, LAMBDA_USE_VARIABLES, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_LET VariableIdentifier '=' AssignmentExpressionWrapper
  public static boolean LetClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetClause")) return false;
    if (!nextTokenIs(b, T_LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LET);
    r = r && VariableIdentifier(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, LET_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // ('&'? VariableIdentifier (',' '&'? VariableIdentifier)* ','?)?
  public static boolean LexicalVarList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LexicalVarList")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<lexical var list>");
    LexicalVarList_0(b, l + 1);
    exit_section_(b, l, m, LEXICAL_VAR_LIST, true, false, null);
    return true;
  }

  // '&'? VariableIdentifier (',' '&'? VariableIdentifier)* ','?
  private static boolean LexicalVarList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LexicalVarList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LexicalVarList_0_0(b, l + 1);
    r = r && VariableIdentifier(b, l + 1);
    r = r && LexicalVarList_0_2(b, l + 1);
    r = r && LexicalVarList_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&'?
  private static boolean LexicalVarList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LexicalVarList_0_0")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  // (',' '&'? VariableIdentifier)*
  private static boolean LexicalVarList_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LexicalVarList_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LexicalVarList_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LexicalVarList_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' '&'? VariableIdentifier
  private static boolean LexicalVarList_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LexicalVarList_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && LexicalVarList_0_2_0_1(b, l + 1);
    r = r && VariableIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&'?
  private static boolean LexicalVarList_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LexicalVarList_0_2_0_1")) return false;
    consumeToken(b, T_AND);
    return true;
  }

  // ','?
  private static boolean LexicalVarList_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LexicalVarList_0_3")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // ListAssignmentVariables '=' AssignmentExpressionWrapper
  public static boolean ListAssignmentExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListAssignmentExpression")) return false;
    if (!nextTokenIs(b, T_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, null);
    r = ListAssignmentVariables(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_EQUAL));
    r = p && AssignmentExpressionWrapper(b, l + 1) && r;
    exit_section_(b, l, m, LIST_ASSIGNMENT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_LIST '(' AssignmentList ')'
  public static boolean ListAssignmentVariables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListAssignmentVariables")) return false;
    if (!nextTokenIs(b, T_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LIST);
    r = r && consumeToken(b, T_LPAREN);
    r = r && AssignmentList(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, LIST_ASSIGNMENT_VARIABLES, r);
    return r;
  }

  /* ********************************************************** */
  // T_LNUMBER
  //                         | T_DNUMBER
  //                         | T_ONUMBER
  //                         | T_CONSTANT_ENCAPSED_STRING
  //                         | T_LINE
  //                         | T_FILE
  //                         | T_DIR
  //                         | T_CLASS_C
  //                         | T_TRAIT_C
  //                         | T_METHOD_C
  //                         | T_FUNC_C
  //                         | T_NS_C
  //                         | T_COMPILER_HALT_OFFSET
  //                         | T_START_HEREDOC T_ENCAPSED_AND_WHITESPACE T_END_HEREDOC
  //                         | T_START_HEREDOC T_END_HEREDOC
  public static boolean LiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralExpression")) return false;
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
  public static boolean LiteralScalarAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralScalarAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal scalar attribute>");
    r = consumeToken(b, T_LNUMBER);
    if (!r) r = consumeToken(b, T_DNUMBER);
    if (!r) r = consumeToken(b, T_ONUMBER);
    if (!r) r = consumeToken(b, T_CONSTANT_ENCAPSED_STRING);
    if (!r) r = parseTokens(b, 0, T_START_HEREDOC, T_ENCAPSED_AND_WHITESPACE, T_END_HEREDOC);
    if (!r) r = parseTokens(b, 0, T_START_HEREDOC, T_END_HEREDOC);
    exit_section_(b, l, m, LITERAL_SCALAR_ATTRIBUTE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LogicalOperator ComparativeExpressionWrapper
  public static boolean LogicalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<logical expression>");
    r = LogicalOperator(b, l + 1);
    p = r; // pin = 1
    r = r && ComparativeExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, LOGICAL_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ComparativeExpressionWrapper LogicalExpression*
  static boolean LogicalExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ComparativeExpressionWrapper(b, l + 1);
    r = r && LogicalExpressionWrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LogicalExpression*
  private static boolean LogicalExpressionWrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpressionWrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LogicalExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LogicalExpressionWrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_BOOLEAN_OR | T_BOOLEAN_AND | T_LOGICAL_OR | T_LOGICAL_AND | T_LOGICAL_XOR
  public static boolean LogicalOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalOperator")) return false;
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
  // (T_MIARRAY|T_MSARRAY) '(' ArrayPairList ')'
  public static boolean MapArrayLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapArrayLiteralExpression")) return false;
    if (!nextTokenIs(b, "<map array literal expression>", T_MIARRAY, T_MSARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<map array literal expression>");
    r = MapArrayLiteralExpression_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, ArrayPairList(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, MAP_ARRAY_LITERAL_EXPRESSION, r, p, null);
    return r || p;
  }

  // T_MIARRAY|T_MSARRAY
  private static boolean MapArrayLiteralExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapArrayLiteralExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_MIARRAY);
    if (!r) r = consumeToken(b, T_MSARRAY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_PUBLIC
  //                        | T_PROTECTED
  //                        | T_PRIVATE
  //                        | T_STATIC
  //                        | T_ABSTRACT
  //                        | T_FINAL
  //                        | T_ASYNC
  public static boolean MemberModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberModifier")) return false;
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
  // T_OBJECT_OPERATOR (Identifier|'{' AssignmentExpressionWrapper '}' | VariableExpression)
  public static boolean MemberVariableExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberVariableExpression")) return false;
    if (!nextTokenIs(b, T_OBJECT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_OBJECT_OPERATOR);
    r = r && MemberVariableExpression_1(b, l + 1);
    exit_section_(b, l, m, MEMBER_VARIABLE_EXPRESSION, r, false, null);
    return r;
  }

  // Identifier|'{' AssignmentExpressionWrapper '}' | VariableExpression
  private static boolean MemberVariableExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberVariableExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = MemberVariableExpression_1_1(b, l + 1);
    if (!r) r = VariableExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' AssignmentExpressionWrapper '}'
  private static boolean MemberVariableExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberVariableExpression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (EspecialParenthesisedExpression|possible_variable)
  //                                     (DynamicVariableExpression|CallableFunctionCallExpression|MethodCallExpression|MemberVariableExpression|ArrayAccessExpression)*
  static boolean MemberVariableWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberVariableWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MemberVariableWrapper_0(b, l + 1);
    r = r && MemberVariableWrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EspecialParenthesisedExpression|possible_variable
  private static boolean MemberVariableWrapper_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberVariableWrapper_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EspecialParenthesisedExpression(b, l + 1);
    if (!r) r = possible_variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DynamicVariableExpression|CallableFunctionCallExpression|MethodCallExpression|MemberVariableExpression|ArrayAccessExpression)*
  private static boolean MemberVariableWrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberVariableWrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MemberVariableWrapper_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MemberVariableWrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DynamicVariableExpression|CallableFunctionCallExpression|MethodCallExpression|MemberVariableExpression|ArrayAccessExpression
  private static boolean MemberVariableWrapper_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberVariableWrapper_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DynamicVariableExpression(b, l + 1);
    if (!r) r = CallableFunctionCallExpression(b, l + 1);
    if (!r) r = MethodCallExpression(b, l + 1);
    if (!r) r = MemberVariableExpression(b, l + 1);
    if (!r) r = ArrayAccessExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_OBJECT_OPERATOR ((Identifier TypeArgs?)|VariableExpression|VariableExpressionVariable) '(' CallParameterList ')'
  public static boolean MethodCallExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCallExpression")) return false;
    if (!nextTokenIs(b, T_OBJECT_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_OBJECT_OPERATOR);
    r = r && MethodCallExpression_1(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 3
    r = r && report_error_(b, CallParameterList(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, METHOD_CALL_EXPRESSION, r, p, null);
    return r || p;
  }

  // (Identifier TypeArgs?)|VariableExpression|VariableExpressionVariable
  private static boolean MethodCallExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCallExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodCallExpression_1_0(b, l + 1);
    if (!r) r = VariableExpression(b, l + 1);
    if (!r) r = VariableExpressionVariable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier TypeArgs?
  private static boolean MethodCallExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCallExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && MethodCallExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeArgs?
  private static boolean MethodCallExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCallExpression_1_0_1")) return false;
    TypeArgs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FunctionDeclaration
  public static boolean MethodStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<method statement>");
    r = FunctionDeclaration(b, l + 1);
    exit_section_(b, l, m, METHOD_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MultiplicativeOperator InstanceofExpressionWrapper
  public static boolean MultiplicativeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplicativeExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<multiplicative expression>");
    r = MultiplicativeOperator(b, l + 1);
    p = r; // pin = 1
    r = r && InstanceofExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, MULTIPLICATIVE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // InstanceofExpressionWrapper MultiplicativeExpression*
  static boolean MultiplicativeExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplicativeExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InstanceofExpressionWrapper(b, l + 1);
    r = r && MultiplicativeExpressionWrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MultiplicativeExpression*
  private static boolean MultiplicativeExpressionWrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplicativeExpressionWrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MultiplicativeExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MultiplicativeExpressionWrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '*' | '/' | '%' | T_POW
  public static boolean MultiplicativeOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplicativeOperator")) return false;
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
  // Identifier
  public static boolean NameHolder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameHolder")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<name holder>");
    r = Identifier(b, l + 1);
    exit_section_(b, l, m, NAME_HOLDER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_NS_SEPARATOR? NameHolder (T_NS_SEPARATOR NameHolder)*
  public static boolean NamespaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<namespace declaration>");
    r = NamespaceDeclaration_0(b, l + 1);
    r = r && NameHolder(b, l + 1);
    r = r && NamespaceDeclaration_2(b, l + 1);
    exit_section_(b, l, m, NAMESPACE_DECLARATION, r, false, null);
    return r;
  }

  // T_NS_SEPARATOR?
  private static boolean NamespaceDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration_0")) return false;
    consumeToken(b, T_NS_SEPARATOR);
    return true;
  }

  // (T_NS_SEPARATOR NameHolder)*
  private static boolean NamespaceDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!NamespaceDeclaration_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NamespaceDeclaration_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // T_NS_SEPARATOR NameHolder
  private static boolean NamespaceDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NS_SEPARATOR);
    r = r && NameHolder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_NS_SEPARATOR? Identifier (T_NS_SEPARATOR Identifier)*
  public static boolean NamespaceName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceName")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<namespace name>");
    r = NamespaceName_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    p = r; // pin = 2
    r = r && NamespaceName_2(b, l + 1);
    exit_section_(b, l, m, NAMESPACE_NAME, r, p, null);
    return r || p;
  }

  // T_NS_SEPARATOR?
  private static boolean NamespaceName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceName_0")) return false;
    consumeToken(b, T_NS_SEPARATOR);
    return true;
  }

  // (T_NS_SEPARATOR Identifier)*
  private static boolean NamespaceName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceName_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!NamespaceName_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NamespaceName_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // T_NS_SEPARATOR Identifier
  private static boolean NamespaceName_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceName_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NS_SEPARATOR);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_NAMESPACE NamespaceDeclaration ';'
  //                      | T_NAMESPACE NamespaceDeclaration? '{'  TopStatementList '}'
  public static boolean NamespaceStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement")) return false;
    if (!nextTokenIs(b, T_NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NamespaceStatement_0(b, l + 1);
    if (!r) r = NamespaceStatement_1(b, l + 1);
    exit_section_(b, m, NAMESPACE_STATEMENT, r);
    return r;
  }

  // T_NAMESPACE NamespaceDeclaration ';'
  private static boolean NamespaceStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NAMESPACE);
    r = r && NamespaceDeclaration(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_NAMESPACE NamespaceDeclaration? '{'  TopStatementList '}'
  private static boolean NamespaceStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NAMESPACE);
    r = r && NamespaceStatement_1_1(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && TopStatementList(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // NamespaceDeclaration?
  private static boolean NamespaceStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement_1_1")) return false;
    NamespaceDeclaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (T_NAMESPACE NamespaceName) | NamespaceName
  public static boolean NamespaceString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceString")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<namespace string>");
    r = NamespaceString_0(b, l + 1);
    if (!r) r = NamespaceName(b, l + 1);
    exit_section_(b, l, m, NAMESPACE_STRING, r, false, null);
    return r;
  }

  // T_NAMESPACE NamespaceName
  private static boolean NamespaceString_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceString_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NAMESPACE);
    r = r && NamespaceName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_ELSEIF ParenthesizedExpression ':' InnerStatements*
  public static boolean NewElseIfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewElseIfStatement")) return false;
    if (!nextTokenIs(b, T_ELSEIF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ELSEIF);
    p = r; // pin = 1
    r = r && report_error_(b, ParenthesizedExpression(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COLON)) && r;
    r = p && NewElseIfStatement_3(b, l + 1) && r;
    exit_section_(b, l, m, NEW_ELSE_IF_STATEMENT, r, p, null);
    return r || p;
  }

  // InnerStatements*
  private static boolean NewElseIfStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewElseIfStatement_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerStatements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NewElseIfStatement_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_ELSE ':' InnerStatements*
  public static boolean NewElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewElseStatement")) return false;
    if (!nextTokenIs(b, T_ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_ELSE);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_COLON));
    r = p && NewElseStatement_2(b, l + 1) && r;
    exit_section_(b, l, m, NEW_ELSE_STATEMENT, r, p, null);
    return r || p;
  }

  // InnerStatements*
  private static boolean NewElseStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewElseStatement_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerStatements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NewElseStatement_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_NEW AssignmentExpressionWrapper ('(' CallParameterList  ')')?
  public static boolean NewExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression")) return false;
    if (!nextTokenIs(b, T_NEW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, null);
    r = consumeToken(b, T_NEW);
    p = r; // pin = 1
    r = r && report_error_(b, AssignmentExpressionWrapper(b, l + 1));
    r = p && NewExpression_2(b, l + 1) && r;
    exit_section_(b, l, m, NEW_EXPRESSION, r, p, null);
    return r || p;
  }

  // ('(' CallParameterList  ')')?
  private static boolean NewExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression_2")) return false;
    NewExpression_2_0(b, l + 1);
    return true;
  }

  // '(' CallParameterList  ')'
  private static boolean NewExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && CallParameterList(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_IF ParenthesizedExpression ':' InnerStatements* NewElseIfStatement* NewElseStatement? T_ENDIF ';'
  public static boolean NewIfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewIfStatement")) return false;
    if (!nextTokenIs(b, T_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_IF);
    r = r && ParenthesizedExpression(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && NewIfStatement_3(b, l + 1);
    r = r && NewIfStatement_4(b, l + 1);
    r = r && NewIfStatement_5(b, l + 1);
    r = r && consumeToken(b, T_ENDIF);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, NEW_IF_STATEMENT, r);
    return r;
  }

  // InnerStatements*
  private static boolean NewIfStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewIfStatement_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerStatements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NewIfStatement_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // NewElseIfStatement*
  private static boolean NewIfStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewIfStatement_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!NewElseIfStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NewIfStatement_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // NewElseStatement?
  private static boolean NewIfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewIfStatement_5")) return false;
    NewElseStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_NEWTYPE NameHolder TypeVar? (T_AS Types)? '=' Types ';'
  public static boolean NewTypeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewTypeStatement")) return false;
    if (!nextTokenIs(b, T_NEWTYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_NEWTYPE);
    p = r; // pin = 1
    r = r && report_error_(b, NameHolder(b, l + 1));
    r = p && report_error_(b, NewTypeStatement_2(b, l + 1)) && r;
    r = p && report_error_(b, NewTypeStatement_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_EQUAL)) && r;
    r = p && report_error_(b, Types(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, NEW_TYPE_STATEMENT, r, p, null);
    return r || p;
  }

  // TypeVar?
  private static boolean NewTypeStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewTypeStatement_2")) return false;
    TypeVar(b, l + 1);
    return true;
  }

  // (T_AS Types)?
  private static boolean NewTypeStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewTypeStatement_3")) return false;
    NewTypeStatement_3_0(b, l + 1);
    return true;
  }

  // T_AS Types
  private static boolean NewTypeStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewTypeStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && Types(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BlockStatement
  //                 | IfStatement
  //                 | NewIfStatement
  //                 | WhileStatement
  //                 | DoWhileStatement
  //                 | ForStatement
  //                 | SwitchStatement
  //                 | BreakStatement
  //                 | ContinueStatement
  //                 | ReturnStatement
  //                 | YieldStatement
  //                 | GlobalStatement
  //                 | EchoStatement
  //                 | UnsetStatement
  //                 | ';'
  //                 | HtmlStatement
  //                 | ForeachStatement
  //                 | DeclareStatement
  //                 | TryStatement
  //                 | ThrowStatement
  //                 | GotoStatement
  //                 | ExpressionStatement
  //                 | StaticStatement
  //                 | LabelStatement
  static boolean NormalStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NormalStatements")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BlockStatement(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = NewIfStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = DoWhileStatement(b, l + 1);
    if (!r) r = ForStatement(b, l + 1);
    if (!r) r = SwitchStatement(b, l + 1);
    if (!r) r = BreakStatement(b, l + 1);
    if (!r) r = ContinueStatement(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = YieldStatement(b, l + 1);
    if (!r) r = GlobalStatement(b, l + 1);
    if (!r) r = EchoStatement(b, l + 1);
    if (!r) r = UnsetStatement(b, l + 1);
    if (!r) r = consumeToken(b, T_SEMICOLON);
    if (!r) r = HtmlStatement(b, l + 1);
    if (!r) r = ForeachStatement(b, l + 1);
    if (!r) r = DeclareStatement(b, l + 1);
    if (!r) r = TryStatement(b, l + 1);
    if (!r) r = ThrowStatement(b, l + 1);
    if (!r) r = GotoStatement(b, l + 1);
    if (!r) r = ExpressionStatement(b, l + 1);
    if (!r) r = StaticStatement(b, l + 1);
    if (!r) r = LabelStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '?' Types
  public static boolean NullableType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NullableType")) return false;
    if (!nextTokenIs(b, T_QUEST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_QUEST);
    p = r; // pin = 1
    r = r && Types(b, l + 1);
    exit_section_(b, l, m, NULLABLE_TYPE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_ORDERBY Ordering (',' Ordering)*
  public static boolean OrderByClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrderByClause")) return false;
    if (!nextTokenIs(b, T_ORDERBY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ORDERBY);
    r = r && Ordering(b, l + 1);
    r = r && OrderByClause_2(b, l + 1);
    exit_section_(b, m, ORDER_BY_CLAUSE, r);
    return r;
  }

  // (',' Ordering)*
  private static boolean OrderByClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrderByClause_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OrderByClause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OrderByClause_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Ordering
  private static boolean OrderByClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrderByClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && Ordering(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AssignmentExpressionWrapper (T_ASCENDING | T_DESCENDING)?
  public static boolean Ordering(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ordering")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ordering>");
    r = AssignmentExpressionWrapper(b, l + 1);
    r = r && Ordering_1(b, l + 1);
    exit_section_(b, l, m, ORDERING, r, false, null);
    return r;
  }

  // (T_ASCENDING | T_DESCENDING)?
  private static boolean Ordering_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ordering_1")) return false;
    Ordering_1_0(b, l + 1);
    return true;
  }

  // T_ASCENDING | T_DESCENDING
  private static boolean Ordering_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ordering_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ASCENDING);
    if (!r) r = consumeToken(b, T_DESCENDING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Attributes? ParameterModifier* Types? ('&'|"...")? VariableNameHolder ('=' AssignmentExpressionWrapper)?
  public static boolean Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter>");
    r = Parameter_0(b, l + 1);
    r = r && Parameter_1(b, l + 1);
    r = r && Parameter_2(b, l + 1);
    r = r && Parameter_3(b, l + 1);
    r = r && VariableNameHolder(b, l + 1);
    r = r && Parameter_5(b, l + 1);
    exit_section_(b, l, m, PARAMETER, r, false, null);
    return r;
  }

  // Attributes?
  private static boolean Parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_0")) return false;
    Attributes(b, l + 1);
    return true;
  }

  // ParameterModifier*
  private static boolean Parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ParameterModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Parameter_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Types?
  private static boolean Parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_2")) return false;
    Types(b, l + 1);
    return true;
  }

  // ('&'|"...")?
  private static boolean Parameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_3")) return false;
    Parameter_3_0(b, l + 1);
    return true;
  }

  // '&'|"..."
  private static boolean Parameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AND);
    if (!r) r = consumeToken(b, T_ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' AssignmentExpressionWrapper)?
  private static boolean Parameter_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_5")) return false;
    Parameter_5_0(b, l + 1);
    return true;
  }

  // '=' AssignmentExpressionWrapper
  private static boolean Parameter_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQUAL);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Parameter (',' Parameter)*  ','?)?
  static boolean ParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList")) return false;
    ParameterList_0(b, l + 1);
    return true;
  }

  // Parameter (',' Parameter)*  ','?
  private static boolean ParameterList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter(b, l + 1);
    r = r && ParameterList_0_1(b, l + 1);
    r = r && ParameterList_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Parameter)*
  private static boolean ParameterList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ParameterList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParameterList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Parameter
  private static boolean ParameterList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean ParameterList_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_PUBLIC
  //                        | T_PROTECTED
  //                        | T_PRIVATE
  public static boolean ParameterModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterModifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter modifier>");
    r = consumeToken(b, T_PUBLIC);
    if (!r) r = consumeToken(b, T_PROTECTED);
    if (!r) r = consumeToken(b, T_PRIVATE);
    exit_section_(b, l, m, PARAMETER_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' AssignmentExpressionWrapper ')'
  public static boolean ParenthesizedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenthesizedExpression")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, AssignmentExpressionWrapper(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, PARENTHESIZED_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // PrefixOperator PrefixExpressionWrapper
  static boolean PrefixExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrefixExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = PrefixOperator(b, l + 1);
    p = r; // pin = 1
    r = r && PrefixExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // PrefixExpression  | PrimaryExpression
  static boolean PrefixExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrefixExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrefixExpression(b, l + 1);
    if (!r) r = PrimaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@' | '!' | '~' | '+' | '-' | T_INC | T_DEC
  public static boolean PrefixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrefixOperator")) return false;
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
  // SuffixExpression
  //                               | LambdaExpression
  //                               | ExpressionWithParentheses
  //                               | ParenthesizedExpression
  //                               | MemberVariableWrapper
  //                               | ScalarExpression
  //                               | ArrayLiteralExpression
  //                               | ShapeLiteralExpression
  //                               | MapArrayLiteralExpression
  //                               | VArrayLiteralExpression
  //                               | BackticksExpression
  //                               | ClosureExpression
  //                               | IssetExpression
  //                               | EmptyExpression
  //                               | IncludeExpression
  //                               | EvalExpression
  //                               | RequireExpression
  //                               | TupleExpression
  //                               | ExitExpression
  //                               | PrintExpression
  static boolean PrimaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SuffixExpression(b, l + 1);
    if (!r) r = LambdaExpression(b, l + 1);
    if (!r) r = ExpressionWithParentheses(b, l + 1);
    if (!r) r = ParenthesizedExpression(b, l + 1);
    if (!r) r = MemberVariableWrapper(b, l + 1);
    if (!r) r = ScalarExpression(b, l + 1);
    if (!r) r = ArrayLiteralExpression(b, l + 1);
    if (!r) r = ShapeLiteralExpression(b, l + 1);
    if (!r) r = MapArrayLiteralExpression(b, l + 1);
    if (!r) r = VArrayLiteralExpression(b, l + 1);
    if (!r) r = BackticksExpression(b, l + 1);
    if (!r) r = ClosureExpression(b, l + 1);
    if (!r) r = IssetExpression(b, l + 1);
    if (!r) r = EmptyExpression(b, l + 1);
    if (!r) r = IncludeExpression(b, l + 1);
    if (!r) r = EvalExpression(b, l + 1);
    if (!r) r = RequireExpression(b, l + 1);
    if (!r) r = TupleExpression(b, l + 1);
    if (!r) r = ExitExpression(b, l + 1);
    if (!r) r = PrintExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_PRINT AssignmentExpressionWrapper
  public static boolean PrintExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintExpression")) return false;
    if (!nextTokenIs(b, T_PRINT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, null);
    r = consumeToken(b, T_PRINT);
    p = r; // pin = 1
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, PRINT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TryVariableNameFirst '=' QueryExpression
  public static boolean QueryAssignExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryAssignExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query assign expression>");
    r = TryVariableNameFirst(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && QueryExpression(b, l + 1);
    exit_section_(b, l, m, QUERY_ASSIGN_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (FromClause | LetClause | WhereClause | JoinClause | JoinIntoClause | OrderByClause)* (SelectClause | GroupClause) QueryContinuation?
  public static boolean QueryBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query body>");
    r = QueryBody_0(b, l + 1);
    r = r && QueryBody_1(b, l + 1);
    r = r && QueryBody_2(b, l + 1);
    exit_section_(b, l, m, QUERY_BODY, r, false, null);
    return r;
  }

  // (FromClause | LetClause | WhereClause | JoinClause | JoinIntoClause | OrderByClause)*
  private static boolean QueryBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryBody_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!QueryBody_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QueryBody_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // FromClause | LetClause | WhereClause | JoinClause | JoinIntoClause | OrderByClause
  private static boolean QueryBody_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryBody_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FromClause(b, l + 1);
    if (!r) r = LetClause(b, l + 1);
    if (!r) r = WhereClause(b, l + 1);
    if (!r) r = JoinClause(b, l + 1);
    if (!r) r = JoinIntoClause(b, l + 1);
    if (!r) r = OrderByClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SelectClause | GroupClause
  private static boolean QueryBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SelectClause(b, l + 1);
    if (!r) r = GroupClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // QueryContinuation?
  private static boolean QueryBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryBody_2")) return false;
    QueryContinuation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_INTO VariableIdentifier QueryBody
  public static boolean QueryContinuation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryContinuation")) return false;
    if (!nextTokenIs(b, T_INTO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_INTO);
    r = r && VariableIdentifier(b, l + 1);
    r = r && QueryBody(b, l + 1);
    exit_section_(b, m, QUERY_CONTINUATION, r);
    return r;
  }

  /* ********************************************************** */
  // QueryHead QueryBody
  public static boolean QueryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryExpression")) return false;
    if (!nextTokenIs(b, T_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QueryHead(b, l + 1);
    r = r && QueryBody(b, l + 1);
    exit_section_(b, m, QUERY_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // T_FROM VariableIdentifier T_IN AssignmentExpressionWrapper
  public static boolean QueryHead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryHead")) return false;
    if (!nextTokenIs(b, T_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_FROM);
    r = r && VariableIdentifier(b, l + 1);
    r = r && consumeToken(b, T_IN);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, QUERY_HEAD, r);
    return r;
  }

  /* ********************************************************** */
  // (T_REQUIRE|T_REQUIRE_ONCE) AssignmentExpressionWrapper
  public static boolean RequireExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequireExpression")) return false;
    if (!nextTokenIs(b, "<require expression>", T_REQUIRE, T_REQUIRE_ONCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<require expression>");
    r = RequireExpression_0(b, l + 1);
    p = r; // pin = 1
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, REQUIRE_EXPRESSION, r, p, null);
    return r || p;
  }

  // T_REQUIRE|T_REQUIRE_ONCE
  private static boolean RequireExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RequireExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_REQUIRE);
    if (!r) r = consumeToken(b, T_REQUIRE_ONCE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_RETURN  (AssignmentExpressionWrapper|QueryExpression|AwaitExpression)? ';'
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, T_RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_RETURN);
    p = r; // pin = 1
    r = r && report_error_(b, ReturnStatement_1(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, RETURN_STATEMENT, r, p, null);
    return r || p;
  }

  // (AssignmentExpressionWrapper|QueryExpression|AwaitExpression)?
  private static boolean ReturnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1")) return false;
    ReturnStatement_1_0(b, l + 1);
    return true;
  }

  // AssignmentExpressionWrapper|QueryExpression|AwaitExpression
  private static boolean ReturnStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentExpressionWrapper(b, l + 1);
    if (!r) r = QueryExpression(b, l + 1);
    if (!r) r = AwaitExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' Types
  public static boolean ReturnType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnType")) return false;
    if (!nextTokenIs(b, T_COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_COLON);
    p = r; // pin = 1
    r = r && Types(b, l + 1);
    exit_section_(b, l, m, RETURN_TYPE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ClassConstant
  //                     | NamespaceString
  //                     | T_STRING_VARNAME
  //                     | LiteralExpression
  //                     | DoubleQuotesString
  //                     | SingleQuotesString
  //                     | HereDocString
  public static boolean ScalarExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScalarExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<scalar expression>");
    r = ClassConstant(b, l + 1);
    if (!r) r = NamespaceString(b, l + 1);
    if (!r) r = consumeToken(b, T_STRING_VARNAME);
    if (!r) r = LiteralExpression(b, l + 1);
    if (!r) r = DoubleQuotesString(b, l + 1);
    if (!r) r = SingleQuotesString(b, l + 1);
    if (!r) r = HereDocString(b, l + 1);
    exit_section_(b, l, m, SCALAR_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_SELECT AssignmentExpressionWrapper
  public static boolean SelectClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectClause")) return false;
    if (!nextTokenIs(b, T_SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SELECT);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, SELECT_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // T_CONSTANT_ENCAPSED_STRING | ClassConstant
  public static boolean ShapeKeyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeKeyName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<shape key name>");
    r = consumeToken(b, T_CONSTANT_ENCAPSED_STRING);
    if (!r) r = ClassConstant(b, l + 1);
    exit_section_(b, l, m, SHAPE_KEY_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_SHAPE '(' (ShapePair (',' ShapePair)* ','?)? ')'
  public static boolean ShapeLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeLiteralExpression")) return false;
    if (!nextTokenIs(b, T_SHAPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_SHAPE);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, ShapeLiteralExpression_2(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, SHAPE_LITERAL_EXPRESSION, r, p, null);
    return r || p;
  }

  // (ShapePair (',' ShapePair)* ','?)?
  private static boolean ShapeLiteralExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeLiteralExpression_2")) return false;
    ShapeLiteralExpression_2_0(b, l + 1);
    return true;
  }

  // ShapePair (',' ShapePair)* ','?
  private static boolean ShapeLiteralExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeLiteralExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShapePair(b, l + 1);
    r = r && ShapeLiteralExpression_2_0_1(b, l + 1);
    r = r && ShapeLiteralExpression_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ShapePair)*
  private static boolean ShapeLiteralExpression_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeLiteralExpression_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ShapeLiteralExpression_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ShapeLiteralExpression_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ShapePair
  private static boolean ShapeLiteralExpression_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeLiteralExpression_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ShapePair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean ShapeLiteralExpression_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeLiteralExpression_2_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // (T_CONSTANT_ENCAPSED_STRING | FullyQualifiedStaticIdentifier) T_DOUBLE_ARROW Types
  public static boolean ShapeMemberType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeMemberType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<shape member type>");
    r = ShapeMemberType_0(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_ARROW);
    r = r && Types(b, l + 1);
    exit_section_(b, l, m, SHAPE_MEMBER_TYPE, r, false, null);
    return r;
  }

  // T_CONSTANT_ENCAPSED_STRING | FullyQualifiedStaticIdentifier
  private static boolean ShapeMemberType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeMemberType_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CONSTANT_ENCAPSED_STRING);
    if (!r) r = FullyQualifiedStaticIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ShapeKeyName T_DOUBLE_ARROW AssignmentExpressionWrapper
  public static boolean ShapePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapePair")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<shape pair>");
    r = ShapeKeyName(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_ARROW);
    p = r; // pin = 2
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, SHAPE_PAIR, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_SHAPE '(' (ShapeMemberType (',' ShapeMemberType)* ','?)? ')'
  public static boolean ShapeType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeType")) return false;
    if (!nextTokenIs(b, T_SHAPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_SHAPE);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, ShapeType_2(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, SHAPE_TYPE, r, p, null);
    return r || p;
  }

  // (ShapeMemberType (',' ShapeMemberType)* ','?)?
  private static boolean ShapeType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeType_2")) return false;
    ShapeType_2_0(b, l + 1);
    return true;
  }

  // ShapeMemberType (',' ShapeMemberType)* ','?
  private static boolean ShapeType_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeType_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShapeMemberType(b, l + 1);
    r = r && ShapeType_2_0_1(b, l + 1);
    r = r && ShapeType_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ShapeMemberType)*
  private static boolean ShapeType_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeType_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ShapeType_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ShapeType_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ShapeMemberType
  private static boolean ShapeType_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeType_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ShapeMemberType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean ShapeType_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShapeType_2_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // ShiftOperator AdditiveOrConcatenationExpressionWrapper
  public static boolean ShiftExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpression")) return false;
    if (!nextTokenIs(b, "<shift expression>", T_SL, T_SR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, "<shift expression>");
    r = ShiftOperator(b, l + 1);
    p = r; // pin = 1
    r = r && AdditiveOrConcatenationExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, SHIFT_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AdditiveOrConcatenationExpressionWrapper ShiftExpression*
  static boolean ShiftExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AdditiveOrConcatenationExpressionWrapper(b, l + 1);
    r = r && ShiftExpressionWrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ShiftExpression*
  private static boolean ShiftExpressionWrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpressionWrapper_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ShiftExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ShiftExpressionWrapper_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // T_SL | T_SR
  public static boolean ShiftOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftOperator")) return false;
    if (!nextTokenIs(b, "<shift operator>", T_SL, T_SR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<shift operator>");
    r = consumeToken(b, T_SL);
    if (!r) r = consumeToken(b, T_SR);
    exit_section_(b, l, m, SHIFT_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "'" EncapsList "'"
  public static boolean SingleQuotesString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleQuotesString")) return false;
    if (!nextTokenIs(b, T_SINGLE_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SINGLE_QUOTE);
    r = r && EncapsList(b, l + 1);
    r = r && consumeToken(b, T_SINGLE_QUOTE);
    exit_section_(b, m, SINGLE_QUOTES_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // '@' Types
  public static boolean SoftType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SoftType")) return false;
    if (!nextTokenIs(b, T_SILENCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_SILENCE);
    p = r; // pin = 1
    r = r && Types(b, l + 1);
    exit_section_(b, l, m, SOFT_TYPE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // StaticScalarAttribute (T_DOUBLE_ARROW StaticScalarAttribute)?
  public static boolean StaticArrayItemAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticArrayItemAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static array item attribute>");
    r = StaticScalarAttribute(b, l + 1);
    r = r && StaticArrayItemAttribute_1(b, l + 1);
    exit_section_(b, l, m, STATIC_ARRAY_ITEM_ATTRIBUTE, r, false, null);
    return r;
  }

  // (T_DOUBLE_ARROW StaticScalarAttribute)?
  private static boolean StaticArrayItemAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticArrayItemAttribute_1")) return false;
    StaticArrayItemAttribute_1_0(b, l + 1);
    return true;
  }

  // T_DOUBLE_ARROW StaticScalarAttribute
  private static boolean StaticArrayItemAttribute_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticArrayItemAttribute_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOUBLE_ARROW);
    r = r && StaticScalarAttribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (StaticArrayItemAttribute (',' StaticArrayItemAttribute)* ','?)?
  public static boolean StaticArrayPairListAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticArrayPairListAttribute")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<static array pair list attribute>");
    StaticArrayPairListAttribute_0(b, l + 1);
    exit_section_(b, l, m, STATIC_ARRAY_PAIR_LIST_ATTRIBUTE, true, false, null);
    return true;
  }

  // StaticArrayItemAttribute (',' StaticArrayItemAttribute)* ','?
  private static boolean StaticArrayPairListAttribute_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticArrayPairListAttribute_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StaticArrayItemAttribute(b, l + 1);
    r = r && StaticArrayPairListAttribute_0_1(b, l + 1);
    r = r && StaticArrayPairListAttribute_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' StaticArrayItemAttribute)*
  private static boolean StaticArrayPairListAttribute_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticArrayPairListAttribute_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StaticArrayPairListAttribute_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StaticArrayPairListAttribute_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' StaticArrayItemAttribute
  private static boolean StaticArrayPairListAttribute_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticArrayPairListAttribute_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StaticArrayItemAttribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean StaticArrayPairListAttribute_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticArrayPairListAttribute_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // VariableNameHolder '=' AssignmentExpressionWrapper
  public static boolean StaticAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticAssignment")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = VariableNameHolder(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    p = r; // pin = 2
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, l, m, STATIC_ASSIGNMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FullyQualifiedClassName | T_STATIC | VariableExpression
  public static boolean StaticClassName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticClassName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static class name>");
    r = FullyQualifiedClassName(b, l + 1);
    if (!r) r = consumeToken(b, T_STATIC);
    if (!r) r = VariableExpression(b, l + 1);
    exit_section_(b, l, m, STATIC_CLASS_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StaticClassName T_DOUBLE_COLON VariableExpression
  public static boolean StaticClassVariableExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticClassVariableExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static class variable expression>");
    r = StaticClassName(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && VariableExpression(b, l + 1);
    exit_section_(b, l, m, STATIC_CLASS_VARIABLE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StaticClassName T_DOUBLE_COLON ((Identifier TypeArgs?)|VariableExpression|VariableExpressionVariable) '(' CallParameterList ')'
  public static boolean StaticMethodCallExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticMethodCallExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static method call expression>");
    r = StaticClassName(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_COLON);
    r = r && StaticMethodCallExpression_2(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    r = r && CallParameterList(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, l, m, STATIC_METHOD_CALL_EXPRESSION, r, false, null);
    return r;
  }

  // (Identifier TypeArgs?)|VariableExpression|VariableExpressionVariable
  private static boolean StaticMethodCallExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticMethodCallExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StaticMethodCallExpression_2_0(b, l + 1);
    if (!r) r = VariableExpression(b, l + 1);
    if (!r) r = VariableExpressionVariable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier TypeArgs?
  private static boolean StaticMethodCallExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticMethodCallExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && StaticMethodCallExpression_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeArgs?
  private static boolean StaticMethodCallExpression_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticMethodCallExpression_2_0_1")) return false;
    TypeArgs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('+'|'-')?( T_LNUMBER
  // | T_DNUMBER
  // | T_ONUMBER
  // | Identifier
  // )
  public static boolean StaticNumericScalarAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticNumericScalarAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static numeric scalar attribute>");
    r = StaticNumericScalarAttribute_0(b, l + 1);
    r = r && StaticNumericScalarAttribute_1(b, l + 1);
    exit_section_(b, l, m, STATIC_NUMERIC_SCALAR_ATTRIBUTE, r, false, null);
    return r;
  }

  // ('+'|'-')?
  private static boolean StaticNumericScalarAttribute_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticNumericScalarAttribute_0")) return false;
    StaticNumericScalarAttribute_0_0(b, l + 1);
    return true;
  }

  // '+'|'-'
  private static boolean StaticNumericScalarAttribute_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticNumericScalarAttribute_0_0")) return false;
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
  // | Identifier
  private static boolean StaticNumericScalarAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticNumericScalarAttribute_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LNUMBER);
    if (!r) r = consumeToken(b, T_DNUMBER);
    if (!r) r = consumeToken(b, T_ONUMBER);
    if (!r) r = Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LiteralScalarAttribute
  // | Identifier
  // | StaticNumericScalarAttribute
  // | T_ARRAY '(' StaticArrayPairListAttribute ')'
  // | '[' StaticArrayPairListAttribute ']'
  // | T_SHAPE '(' StaticShapePairListAttribute ')'
  public static boolean StaticScalarAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticScalarAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static scalar attribute>");
    r = LiteralScalarAttribute(b, l + 1);
    if (!r) r = Identifier(b, l + 1);
    if (!r) r = StaticNumericScalarAttribute(b, l + 1);
    if (!r) r = StaticScalarAttribute_3(b, l + 1);
    if (!r) r = StaticScalarAttribute_4(b, l + 1);
    if (!r) r = StaticScalarAttribute_5(b, l + 1);
    exit_section_(b, l, m, STATIC_SCALAR_ATTRIBUTE, r, false, null);
    return r;
  }

  // T_ARRAY '(' StaticArrayPairListAttribute ')'
  private static boolean StaticScalarAttribute_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticScalarAttribute_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY);
    r = r && consumeToken(b, T_LPAREN);
    r = r && StaticArrayPairListAttribute(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' StaticArrayPairListAttribute ']'
  private static boolean StaticScalarAttribute_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticScalarAttribute_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACKET);
    r = r && StaticArrayPairListAttribute(b, l + 1);
    r = r && consumeToken(b, T_RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_SHAPE '(' StaticShapePairListAttribute ')'
  private static boolean StaticScalarAttribute_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticScalarAttribute_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SHAPE);
    r = r && consumeToken(b, T_LPAREN);
    r = r && StaticShapePairListAttribute(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ShapeKeyName T_DOUBLE_ARROW StaticScalarAttribute
  public static boolean StaticShapePairItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticShapePairItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static shape pair item>");
    r = ShapeKeyName(b, l + 1);
    r = r && consumeToken(b, T_DOUBLE_ARROW);
    r = r && StaticScalarAttribute(b, l + 1);
    exit_section_(b, l, m, STATIC_SHAPE_PAIR_ITEM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (StaticShapePairItem (',' StaticShapePairItem)* ','?)?
  public static boolean StaticShapePairListAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticShapePairListAttribute")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<static shape pair list attribute>");
    StaticShapePairListAttribute_0(b, l + 1);
    exit_section_(b, l, m, STATIC_SHAPE_PAIR_LIST_ATTRIBUTE, true, false, null);
    return true;
  }

  // StaticShapePairItem (',' StaticShapePairItem)* ','?
  private static boolean StaticShapePairListAttribute_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticShapePairListAttribute_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StaticShapePairItem(b, l + 1);
    r = r && StaticShapePairListAttribute_0_1(b, l + 1);
    r = r && StaticShapePairListAttribute_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' StaticShapePairItem)*
  private static boolean StaticShapePairListAttribute_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticShapePairListAttribute_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StaticShapePairListAttribute_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StaticShapePairListAttribute_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' StaticShapePairItem
  private static boolean StaticShapePairListAttribute_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticShapePairListAttribute_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StaticShapePairItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean StaticShapePairListAttribute_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticShapePairListAttribute_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_STATIC StaticVarList ';'
  public static boolean StaticStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticStatement")) return false;
    if (!nextTokenIs(b, T_STATIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_STATIC);
    p = r; // pin = 1
    r = r && report_error_(b, StaticVarList(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, STATIC_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ((StaticAssignment|VariableNameHolder) (',' (StaticAssignment|VariableNameHolder))*)?
  public static boolean StaticVarList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticVarList")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<static var list>");
    StaticVarList_0(b, l + 1);
    exit_section_(b, l, m, STATIC_VAR_LIST, true, false, null);
    return true;
  }

  // (StaticAssignment|VariableNameHolder) (',' (StaticAssignment|VariableNameHolder))*
  private static boolean StaticVarList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticVarList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StaticVarList_0_0(b, l + 1);
    r = r && StaticVarList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StaticAssignment|VariableNameHolder
  private static boolean StaticVarList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticVarList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StaticAssignment(b, l + 1);
    if (!r) r = VariableNameHolder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (StaticAssignment|VariableNameHolder))*
  private static boolean StaticVarList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticVarList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StaticVarList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StaticVarList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' (StaticAssignment|VariableNameHolder)
  private static boolean StaticVarList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticVarList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StaticVarList_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StaticAssignment|VariableNameHolder
  private static boolean StaticVarList_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticVarList_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StaticAssignment(b, l + 1);
    if (!r) r = VariableNameHolder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MemberVariableWrapper SuffixOperator
  static boolean SuffixExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuffixExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MemberVariableWrapper(b, l + 1);
    r = r && SuffixOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_INC | T_DEC
  public static boolean SuffixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SuffixOperator")) return false;
    if (!nextTokenIs(b, "<suffix operator>", T_DEC, T_INC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<suffix operator>");
    r = consumeToken(b, T_INC);
    if (!r) r = consumeToken(b, T_DEC);
    exit_section_(b, l, m, SUFFIX_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_SWITCH ParenthesizedExpression  ('{' ';'? CaseList '}' | ':' ';'? CaseList T_ENDSWITCH ';')
  public static boolean SwitchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement")) return false;
    if (!nextTokenIs(b, T_SWITCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_SWITCH);
    p = r; // pin = 1
    r = r && report_error_(b, ParenthesizedExpression(b, l + 1));
    r = p && SwitchStatement_2(b, l + 1) && r;
    exit_section_(b, l, m, SWITCH_STATEMENT, r, p, null);
    return r || p;
  }

  // '{' ';'? CaseList '}' | ':' ';'? CaseList T_ENDSWITCH ';'
  private static boolean SwitchStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SwitchStatement_2_0(b, l + 1);
    if (!r) r = SwitchStatement_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' ';'? CaseList '}'
  private static boolean SwitchStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && SwitchStatement_2_0_1(b, l + 1);
    r = r && CaseList(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean SwitchStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement_2_0_1")) return false;
    consumeToken(b, T_SEMICOLON);
    return true;
  }

  // ':' ';'? CaseList T_ENDSWITCH ';'
  private static boolean SwitchStatement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    r = r && SwitchStatement_2_1_1(b, l + 1);
    r = r && CaseList(b, l + 1);
    r = r && consumeToken(b, T_ENDSWITCH);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean SwitchStatement_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement_2_1_1")) return false;
    consumeToken(b, T_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // '?' AssignmentExpressionWrapper? ':' TernaryExpressionWrapper
  public static boolean TernaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpression")) return false;
    if (!nextTokenIs(b, T_QUEST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, null);
    r = consumeToken(b, T_QUEST);
    p = r; // pin = 1
    r = r && report_error_(b, TernaryExpression_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COLON)) && r;
    r = p && TernaryExpressionWrapper(b, l + 1) && r;
    exit_section_(b, l, m, TERNARY_EXPRESSION, r, p, null);
    return r || p;
  }

  // AssignmentExpressionWrapper?
  private static boolean TernaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpression_1")) return false;
    AssignmentExpressionWrapper(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LogicalExpressionWrapper TernaryExpression?
  static boolean TernaryExpressionWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpressionWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LogicalExpressionWrapper(b, l + 1);
    r = r && TernaryExpressionWrapper_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TernaryExpression?
  private static boolean TernaryExpressionWrapper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpressionWrapper_1")) return false;
    TernaryExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_THROW AssignmentExpressionWrapper ';'
  public static boolean ThrowStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowStatement")) return false;
    if (!nextTokenIs(b, T_THROW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_THROW);
    p = r; // pin = 1
    r = r && report_error_(b, AssignmentExpressionWrapper(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, THROW_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (
  //                         NamespaceStatement //OK
  //                        | NormalStatements //ok
  //                        | FunctionStatement //OK
  //                        | ClassStatement
  //                        | InterfaceStatement //OK
  //                        | EnumStatement //OK
  //                        | TraitStatement //OK
  //                        | TypeStatement
  //                        | NewTypeStatement
  //                        | HaltCompilerStatement //OK
  //                        | UseStatement //OK
  //                        | ConstantStatement //OK
  //                        )* {
  //                         //recoverWhile="statement_recover"
  //                        }
  public static boolean TopStatementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopStatementList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<top statement list>");
    r = TopStatementList_0(b, l + 1);
    r = r && TopStatementList_1(b, l + 1);
    exit_section_(b, l, m, TOP_STATEMENT_LIST, r, false, null);
    return r;
  }

  // (
  //                         NamespaceStatement //OK
  //                        | NormalStatements //ok
  //                        | FunctionStatement //OK
  //                        | ClassStatement
  //                        | InterfaceStatement //OK
  //                        | EnumStatement //OK
  //                        | TraitStatement //OK
  //                        | TypeStatement
  //                        | NewTypeStatement
  //                        | HaltCompilerStatement //OK
  //                        | UseStatement //OK
  //                        | ConstantStatement //OK
  //                        )*
  private static boolean TopStatementList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopStatementList_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TopStatementList_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TopStatementList_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // NamespaceStatement //OK
  //                        | NormalStatements //ok
  //                        | FunctionStatement //OK
  //                        | ClassStatement
  //                        | InterfaceStatement //OK
  //                        | EnumStatement //OK
  //                        | TraitStatement //OK
  //                        | TypeStatement
  //                        | NewTypeStatement
  //                        | HaltCompilerStatement //OK
  //                        | UseStatement //OK
  //                        | ConstantStatement
  private static boolean TopStatementList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopStatementList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NamespaceStatement(b, l + 1);
    if (!r) r = NormalStatements(b, l + 1);
    if (!r) r = FunctionStatement(b, l + 1);
    if (!r) r = ClassStatement(b, l + 1);
    if (!r) r = InterfaceStatement(b, l + 1);
    if (!r) r = EnumStatement(b, l + 1);
    if (!r) r = TraitStatement(b, l + 1);
    if (!r) r = TypeStatement(b, l + 1);
    if (!r) r = NewTypeStatement(b, l + 1);
    if (!r) r = HaltCompilerStatement(b, l + 1);
    if (!r) r = UseStatement(b, l + 1);
    if (!r) r = ConstantStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  //                         //recoverWhile="statement_recover"
  //                        }
  private static boolean TopStatementList_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // TraitAliasRuleMethod T_AS (MemberModifier* Identifier | MemberModifier+) ';'
  public static boolean TraitAliasRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitAliasRule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<trait alias rule>");
    r = TraitAliasRuleMethod(b, l + 1);
    r = r && consumeToken(b, T_AS);
    r = r && TraitAliasRule_2(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, TRAIT_ALIAS_RULE, r, false, null);
    return r;
  }

  // MemberModifier* Identifier | MemberModifier+
  private static boolean TraitAliasRule_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitAliasRule_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TraitAliasRule_2_0(b, l + 1);
    if (!r) r = TraitAliasRule_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberModifier* Identifier
  private static boolean TraitAliasRule_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitAliasRule_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TraitAliasRule_2_0_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MemberModifier*
  private static boolean TraitAliasRule_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitAliasRule_2_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MemberModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TraitAliasRule_2_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // MemberModifier+
  private static boolean TraitAliasRule_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitAliasRule_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MemberModifier(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!MemberModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TraitAliasRule_2_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FullyQualifiedStaticIdentifier | Identifier
  public static boolean TraitAliasRuleMethod(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitAliasRuleMethod")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<trait alias rule method>");
    r = FullyQualifiedStaticIdentifier(b, l + 1);
    if (!r) r = Identifier(b, l + 1);
    exit_section_(b, l, m, TRAIT_ALIAS_RULE_METHOD, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (FullyQualifiedClassName (',' FullyQualifiedClassName)*)?
  public static boolean TraitList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitList")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<trait list>");
    TraitList_0(b, l + 1);
    exit_section_(b, l, m, TRAIT_LIST, true, false, null);
    return true;
  }

  // FullyQualifiedClassName (',' FullyQualifiedClassName)*
  private static boolean TraitList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FullyQualifiedClassName(b, l + 1);
    r = r && TraitList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' FullyQualifiedClassName)*
  private static boolean TraitList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TraitList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TraitList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' FullyQualifiedClassName
  private static boolean TraitList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && FullyQualifiedClassName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FullyQualifiedStaticIdentifier T_INSTEADOF TraitList ';'
  public static boolean TraitPrecedenceRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitPrecedenceRule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<trait precedence rule>");
    r = FullyQualifiedStaticIdentifier(b, l + 1);
    r = r && consumeToken(b, T_INSTEADOF);
    r = r && TraitList(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, TRAIT_PRECEDENCE_RULE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_REQUIRE (T_EXTENDS|T_IMPLEMENTS) FullyQualifiedClassName ';'
  public static boolean TraitRequireDeclarationStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitRequireDeclarationStatement")) return false;
    if (!nextTokenIs(b, T_REQUIRE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_REQUIRE);
    p = r; // pin = 1
    r = r && report_error_(b, TraitRequireDeclarationStatement_1(b, l + 1));
    r = p && report_error_(b, FullyQualifiedClassName(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, TRAIT_REQUIRE_DECLARATION_STATEMENT, r, p, null);
    return r || p;
  }

  // T_EXTENDS|T_IMPLEMENTS
  private static boolean TraitRequireDeclarationStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitRequireDeclarationStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EXTENDS);
    if (!r) r = consumeToken(b, T_IMPLEMENTS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Attributes? T_TRAIT NameHolder TypeVar?  Implements? ClassBlock
  public static boolean TraitStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitStatement")) return false;
    if (!nextTokenIs(b, "<trait statement>", T_SL, T_TRAIT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<trait statement>");
    r = TraitStatement_0(b, l + 1);
    r = r && consumeToken(b, T_TRAIT);
    p = r; // pin = 2
    r = r && report_error_(b, NameHolder(b, l + 1));
    r = p && report_error_(b, TraitStatement_3(b, l + 1)) && r;
    r = p && report_error_(b, TraitStatement_4(b, l + 1)) && r;
    r = p && ClassBlock(b, l + 1) && r;
    exit_section_(b, l, m, TRAIT_STATEMENT, r, p, null);
    return r || p;
  }

  // Attributes?
  private static boolean TraitStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitStatement_0")) return false;
    Attributes(b, l + 1);
    return true;
  }

  // TypeVar?
  private static boolean TraitStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitStatement_3")) return false;
    TypeVar(b, l + 1);
    return true;
  }

  // Implements?
  private static boolean TraitStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitStatement_4")) return false;
    Implements(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_USE TraitList (';'| '{' (TraitPrecedenceRule |  TraitAliasRule)* '}')
  public static boolean TraitUseDeclarationStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitUseDeclarationStatement")) return false;
    if (!nextTokenIs(b, T_USE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_USE);
    p = r; // pin = 1
    r = r && report_error_(b, TraitList(b, l + 1));
    r = p && TraitUseDeclarationStatement_2(b, l + 1) && r;
    exit_section_(b, l, m, TRAIT_USE_DECLARATION_STATEMENT, r, p, null);
    return r || p;
  }

  // ';'| '{' (TraitPrecedenceRule |  TraitAliasRule)* '}'
  private static boolean TraitUseDeclarationStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitUseDeclarationStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SEMICOLON);
    if (!r) r = TraitUseDeclarationStatement_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' (TraitPrecedenceRule |  TraitAliasRule)* '}'
  private static boolean TraitUseDeclarationStatement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitUseDeclarationStatement_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && TraitUseDeclarationStatement_2_1_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TraitPrecedenceRule |  TraitAliasRule)*
  private static boolean TraitUseDeclarationStatement_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitUseDeclarationStatement_2_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TraitUseDeclarationStatement_2_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TraitUseDeclarationStatement_2_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TraitPrecedenceRule |  TraitAliasRule
  private static boolean TraitUseDeclarationStatement_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitUseDeclarationStatement_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TraitPrecedenceRule(b, l + 1);
    if (!r) r = TraitAliasRule(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_CATCH '(' FullyQualifiedClassName VariableIdentifier ')' Block
  public static boolean TryCatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryCatch")) return false;
    if (!nextTokenIs(b, T_CATCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_CATCH);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, FullyQualifiedClassName(b, l + 1)) && r;
    r = p && report_error_(b, VariableIdentifier(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && Block(b, l + 1) && r;
    exit_section_(b, l, m, TRY_CATCH, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_FINALLY  Block
  public static boolean TryFinally(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryFinally")) return false;
    if (!nextTokenIs(b, T_FINALLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_FINALLY);
    p = r; // pin = 1
    r = r && Block(b, l + 1);
    exit_section_(b, l, m, TRY_FINALLY, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // T_TRY Block TryCatch* TryFinally?
  public static boolean TryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStatement")) return false;
    if (!nextTokenIs(b, T_TRY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_TRY);
    p = r; // pin = 1
    r = r && report_error_(b, Block(b, l + 1));
    r = p && report_error_(b, TryStatement_2(b, l + 1)) && r;
    r = p && TryStatement_3(b, l + 1) && r;
    exit_section_(b, l, m, TRY_STATEMENT, r, p, null);
    return r || p;
  }

  // TryCatch*
  private static boolean TryStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStatement_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TryCatch(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TryStatement_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TryFinally?
  private static boolean TryStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStatement_3")) return false;
    TryFinally(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // VariableNameHolder|MemberVariableWrapper
  static boolean TryVariableNameFirst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryVariableNameFirst")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableNameHolder(b, l + 1);
    if (!r) r = MemberVariableWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_TUPLE '(' CallParameterList ')'
  public static boolean TupleExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExpression")) return false;
    if (!nextTokenIs(b, T_TUPLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_TUPLE);
    r = r && consumeToken(b, T_LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, CallParameterList(b, l + 1));
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, TUPLE_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '(' Types ',' Types (',' Types)* ','? ')'
  public static boolean TupleType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, Types(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, Types(b, l + 1)) && r;
    r = p && report_error_(b, TupleType_4(b, l + 1)) && r;
    r = p && report_error_(b, TupleType_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, TUPLE_TYPE, r, p, null);
    return r || p;
  }

  // (',' Types)*
  private static boolean TupleType_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TupleType_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TupleType_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Types
  private static boolean TupleType_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && Types(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean TupleType_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType_5")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_TYPELIST_LT (Types (',' Types)* ','?)? T_TYPELIST_GT
  public static boolean TypeArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgs")) return false;
    if (!nextTokenIs(b, T_TYPELIST_LT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_TYPELIST_LT);
    p = r; // pin = 1
    r = r && report_error_(b, TypeArgs_1(b, l + 1));
    r = p && consumeToken(b, T_TYPELIST_GT) && r;
    exit_section_(b, l, m, TYPE_ARGS, r, p, null);
    return r || p;
  }

  // (Types (',' Types)* ','?)?
  private static boolean TypeArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgs_1")) return false;
    TypeArgs_1_0(b, l + 1);
    return true;
  }

  // Types (',' Types)* ','?
  private static boolean TypeArgs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Types(b, l + 1);
    r = r && TypeArgs_1_0_1(b, l + 1);
    r = r && TypeArgs_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' Types)*
  private static boolean TypeArgs_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgs_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TypeArgs_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeArgs_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' Types
  private static boolean TypeArgs_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgs_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && Types(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean TypeArgs_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgs_1_0_2")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // T_TYPE NameHolder TypeVar? '=' Types ';'
  public static boolean TypeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeStatement")) return false;
    if (!nextTokenIs(b, T_TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_TYPE);
    p = r; // pin = 1
    r = r && report_error_(b, NameHolder(b, l + 1));
    r = p && report_error_(b, TypeStatement_2(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_EQUAL)) && r;
    r = p && report_error_(b, Types(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, TYPE_STATEMENT, r, p, null);
    return r || p;
  }

  // TypeVar?
  private static boolean TypeStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeStatement_2")) return false;
    TypeVar(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_TYPELIST_LT (TypeVarDeclaration (',' TypeVarDeclaration)?)? T_TYPELIST_GT
  public static boolean TypeVar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVar")) return false;
    if (!nextTokenIs(b, T_TYPELIST_LT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_TYPELIST_LT);
    p = r; // pin = 1
    r = r && report_error_(b, TypeVar_1(b, l + 1));
    r = p && consumeToken(b, T_TYPELIST_GT) && r;
    exit_section_(b, l, m, TYPE_VAR, r, p, null);
    return r || p;
  }

  // (TypeVarDeclaration (',' TypeVarDeclaration)?)?
  private static boolean TypeVar_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVar_1")) return false;
    TypeVar_1_0(b, l + 1);
    return true;
  }

  // TypeVarDeclaration (',' TypeVarDeclaration)?
  private static boolean TypeVar_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVar_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeVarDeclaration(b, l + 1);
    r = r && TypeVar_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' TypeVarDeclaration)?
  private static boolean TypeVar_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVar_1_0_1")) return false;
    TypeVar_1_0_1_0(b, l + 1);
    return true;
  }

  // ',' TypeVarDeclaration
  private static boolean TypeVar_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVar_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && TypeVarDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('+' | '-')? NameHolder (T_AS Types)?
  public static boolean TypeVarDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVarDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type var declaration>");
    r = TypeVarDeclaration_0(b, l + 1);
    r = r && NameHolder(b, l + 1);
    r = r && TypeVarDeclaration_2(b, l + 1);
    exit_section_(b, l, m, TYPE_VAR_DECLARATION, r, false, null);
    return r;
  }

  // ('+' | '-')?
  private static boolean TypeVarDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVarDeclaration_0")) return false;
    TypeVarDeclaration_0_0(b, l + 1);
    return true;
  }

  // '+' | '-'
  private static boolean TypeVarDeclaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVarDeclaration_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_AS Types)?
  private static boolean TypeVarDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVarDeclaration_2")) return false;
    TypeVarDeclaration_2_0(b, l + 1);
    return true;
  }

  // T_AS Types
  private static boolean TypeVarDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeVarDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && Types(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NullableType
  //                 | SoftType
  //                 | IdentifierType
  //                 | ArrayType
  //                 | CallableType
  //                 | ShapeType
  //                 | XhpType
  //                 | FunctionType
  //                 | TupleType
  static boolean Types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Types")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NullableType(b, l + 1);
    if (!r) r = SoftType(b, l + 1);
    if (!r) r = IdentifierType(b, l + 1);
    if (!r) r = ArrayType(b, l + 1);
    if (!r) r = CallableType(b, l + 1);
    if (!r) r = ShapeType(b, l + 1);
    if (!r) r = XhpType(b, l + 1);
    if (!r) r = FunctionType(b, l + 1);
    if (!r) r = TupleType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_UNSET '(' VariableList ')' ';'
  public static boolean UnsetStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnsetStatement")) return false;
    if (!nextTokenIs(b, T_UNSET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_UNSET);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, VariableList(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, UNSET_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // NamespaceDeclaration (T_AS NameHolder)?
  public static boolean UseDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<use declaration>");
    r = NamespaceDeclaration(b, l + 1);
    r = r && UseDeclaration_1(b, l + 1);
    exit_section_(b, l, m, USE_DECLARATION, r, false, null);
    return r;
  }

  // (T_AS NameHolder)?
  private static boolean UseDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseDeclaration_1")) return false;
    UseDeclaration_1_0(b, l + 1);
    return true;
  }

  // T_AS NameHolder
  private static boolean UseDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AS);
    r = r && NameHolder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UseDeclaration (',' UseDeclaration)*
  public static boolean UseDeclarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseDeclarations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<use declarations>");
    r = UseDeclaration(b, l + 1);
    r = r && UseDeclarations_1(b, l + 1);
    exit_section_(b, l, m, USE_DECLARATIONS, r, false, null);
    return r;
  }

  // (',' UseDeclaration)*
  private static boolean UseDeclarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseDeclarations_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UseDeclarations_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UseDeclarations_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' UseDeclaration
  private static boolean UseDeclarations_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseDeclarations_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && UseDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_USE (T_FUNCTION | T_CONST)? UseDeclarations ';'
  public static boolean UseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement")) return false;
    if (!nextTokenIs(b, T_USE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_USE);
    p = r; // pin = 1
    r = r && report_error_(b, UseStatement_1(b, l + 1));
    r = p && report_error_(b, UseDeclarations(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, USE_STATEMENT, r, p, null);
    return r || p;
  }

  // (T_FUNCTION | T_CONST)?
  private static boolean UseStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1")) return false;
    UseStatement_1_0(b, l + 1);
    return true;
  }

  // T_FUNCTION | T_CONST
  private static boolean UseStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_FUNCTION);
    if (!r) r = consumeToken(b, T_CONST);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_VARRAY '(' ArrayPairList ')'
  public static boolean VArrayLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VArrayLiteralExpression")) return false;
    if (!nextTokenIs(b, T_VARRAY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_VARRAY);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, T_LPAREN));
    r = p && report_error_(b, ArrayPairList(b, l + 1)) && r;
    r = p && consumeToken(b, T_RPAREN) && r;
    exit_section_(b, l, m, V_ARRAY_LITERAL_EXPRESSION, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '$'+ | VariableIdentifier | ExpressionVariable
  public static boolean VariableExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableExpression")) return false;
    if (!nextTokenIs(b, "<variable expression>", T_DOLLAR_SIGN, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variable expression>");
    r = VariableExpression_0(b, l + 1);
    if (!r) r = VariableIdentifier(b, l + 1);
    if (!r) r = ExpressionVariable(b, l + 1);
    exit_section_(b, l, m, VARIABLE_EXPRESSION, r, false, null);
    return r;
  }

  // '$'+
  private static boolean VariableExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOLLAR_SIGN);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, T_DOLLAR_SIGN)) break;
      if (!empty_element_parsed_guard_(b, "VariableExpression_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' AssignmentExpressionWrapper '}'
  public static boolean VariableExpressionVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableExpressionVariable")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, VARIABLE_EXPRESSION_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // T_VARIABLE
  public static boolean VariableIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableIdentifier")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_VARIABLE);
    exit_section_(b, m, VARIABLE_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // (MemberVariableWrapper (',' MemberVariableWrapper)*)?
  static boolean VariableList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableList")) return false;
    VariableList_0(b, l + 1);
    return true;
  }

  // MemberVariableWrapper (',' MemberVariableWrapper)*
  private static boolean VariableList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MemberVariableWrapper(b, l + 1);
    r = r && VariableList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' MemberVariableWrapper)*
  private static boolean VariableList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!VariableList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' MemberVariableWrapper
  private static boolean VariableList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && MemberVariableWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableIdentifier
  public static boolean VariableNameHolder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableNameHolder")) return false;
    if (!nextTokenIs(b, T_VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableIdentifier(b, l + 1);
    exit_section_(b, m, VARIABLE_NAME_HOLDER, r);
    return r;
  }

  /* ********************************************************** */
  // T_WHERE AssignmentExpressionWrapper
  public static boolean WhereClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereClause")) return false;
    if (!nextTokenIs(b, T_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_WHERE);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, WHERE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // T_WHILE ParenthesizedExpression  (':' InnerStatements* T_ENDWHILE ';'   | NormalStatements)
  public static boolean WhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement")) return false;
    if (!nextTokenIs(b, T_WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_WHILE);
    p = r; // pin = 1
    r = r && report_error_(b, ParenthesizedExpression(b, l + 1));
    r = p && WhileStatement_2(b, l + 1) && r;
    exit_section_(b, l, m, WHILE_STATEMENT, r, p, null);
    return r || p;
  }

  // ':' InnerStatements* T_ENDWHILE ';'   | NormalStatements
  private static boolean WhileStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WhileStatement_2_0(b, l + 1);
    if (!r) r = NormalStatements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' InnerStatements* T_ENDWHILE ';'
  private static boolean WhileStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    r = r && WhileStatement_2_0_1(b, l + 1);
    r = r && consumeToken(b, T_ENDWHILE);
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // InnerStatements*
  private static boolean WhileStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerStatements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhileStatement_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // XhpAttributeType XhpBareWord ((':'|'-') XhpBareWord)* ('=' AssignmentExpressionWrapper)? ('@' T_XHP_REQUIRED)? | XhpIdentifier
  public static boolean XhpAttributeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp attribute declaration>");
    r = XhpAttributeDeclaration_0(b, l + 1);
    if (!r) r = XhpIdentifier(b, l + 1);
    exit_section_(b, l, m, XHP_ATTRIBUTE_DECLARATION, r, false, null);
    return r;
  }

  // XhpAttributeType XhpBareWord ((':'|'-') XhpBareWord)* ('=' AssignmentExpressionWrapper)? ('@' T_XHP_REQUIRED)?
  private static boolean XhpAttributeDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XhpAttributeType(b, l + 1);
    r = r && XhpBareWord(b, l + 1);
    r = r && XhpAttributeDeclaration_0_2(b, l + 1);
    r = r && XhpAttributeDeclaration_0_3(b, l + 1);
    r = r && XhpAttributeDeclaration_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((':'|'-') XhpBareWord)*
  private static boolean XhpAttributeDeclaration_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeDeclaration_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!XhpAttributeDeclaration_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XhpAttributeDeclaration_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (':'|'-') XhpBareWord
  private static boolean XhpAttributeDeclaration_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeDeclaration_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XhpAttributeDeclaration_0_2_0_0(b, l + 1);
    r = r && XhpBareWord(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':'|'-'
  private static boolean XhpAttributeDeclaration_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeDeclaration_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    if (!r) r = consumeToken(b, T_MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' AssignmentExpressionWrapper)?
  private static boolean XhpAttributeDeclaration_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeDeclaration_0_3")) return false;
    XhpAttributeDeclaration_0_3_0(b, l + 1);
    return true;
  }

  // '=' AssignmentExpressionWrapper
  private static boolean XhpAttributeDeclaration_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeDeclaration_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EQUAL);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('@' T_XHP_REQUIRED)?
  private static boolean XhpAttributeDeclaration_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeDeclaration_0_4")) return false;
    XhpAttributeDeclaration_0_4_0(b, l + 1);
    return true;
  }

  // '@' T_XHP_REQUIRED
  private static boolean XhpAttributeDeclaration_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeDeclaration_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SILENCE);
    r = r && consumeToken(b, T_XHP_REQUIRED);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_ATTRIBUTE XhpAttributeDeclaration (',' XhpAttributeDeclaration)* ';'
  public static boolean XhpAttributeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeStatement")) return false;
    if (!nextTokenIs(b, T_XHP_ATTRIBUTE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_XHP_ATTRIBUTE);
    p = r; // pin = 1
    r = r && report_error_(b, XhpAttributeDeclaration(b, l + 1));
    r = p && report_error_(b, XhpAttributeStatement_2(b, l + 1)) && r;
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, XHP_ATTRIBUTE_STATEMENT, r, p, null);
    return r || p;
  }

  // (',' XhpAttributeDeclaration)*
  private static boolean XhpAttributeStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeStatement_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!XhpAttributeStatement_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XhpAttributeStatement_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' XhpAttributeDeclaration
  private static boolean XhpAttributeStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && XhpAttributeDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_ARRAY
  //                                 | FullyQualifiedClassName
  //                                 | T_VAR
  //                                 | T_ENUM '{' (LiteralExpression (',' LiteralExpression)*)? '}'
  //                                 | T_CALLABLE
  public static boolean XhpAttributeType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp attribute type>");
    r = consumeToken(b, T_ARRAY);
    if (!r) r = FullyQualifiedClassName(b, l + 1);
    if (!r) r = consumeToken(b, T_VAR);
    if (!r) r = XhpAttributeType_3(b, l + 1);
    if (!r) r = consumeToken(b, T_CALLABLE);
    exit_section_(b, l, m, XHP_ATTRIBUTE_TYPE, r, false, null);
    return r;
  }

  // T_ENUM '{' (LiteralExpression (',' LiteralExpression)*)? '}'
  private static boolean XhpAttributeType_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeType_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ENUM);
    r = r && consumeToken(b, T_LBRACE);
    r = r && XhpAttributeType_3_2(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LiteralExpression (',' LiteralExpression)*)?
  private static boolean XhpAttributeType_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeType_3_2")) return false;
    XhpAttributeType_3_2_0(b, l + 1);
    return true;
  }

  // LiteralExpression (',' LiteralExpression)*
  private static boolean XhpAttributeType_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeType_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LiteralExpression(b, l + 1);
    r = r && XhpAttributeType_3_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' LiteralExpression)*
  private static boolean XhpAttributeType_3_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeType_3_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!XhpAttributeType_3_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XhpAttributeType_3_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' LiteralExpression
  private static boolean XhpAttributeType_3_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpAttributeType_3_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && LiteralExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier
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
  public static boolean XhpBareWord(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpBareWord")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp bare word>");
    r = Identifier(b, l + 1);
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
    exit_section_(b, l, m, XHP_BARE_WORD, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_CATEGORY_LABEL (',' T_XHP_CATEGORY_LABEL)*
  public static boolean XhpCategoryDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpCategoryDeclaration")) return false;
    if (!nextTokenIs(b, T_XHP_CATEGORY_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_XHP_CATEGORY_LABEL);
    r = r && XhpCategoryDeclaration_1(b, l + 1);
    exit_section_(b, m, XHP_CATEGORY_DECLARATION, r);
    return r;
  }

  // (',' T_XHP_CATEGORY_LABEL)*
  private static boolean XhpCategoryDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpCategoryDeclaration_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!XhpCategoryDeclaration_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XhpCategoryDeclaration_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' T_XHP_CATEGORY_LABEL
  private static boolean XhpCategoryDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpCategoryDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && consumeToken(b, T_XHP_CATEGORY_LABEL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_CATEGORY XhpCategoryDeclaration ';'
  public static boolean XhpCategoryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpCategoryStatement")) return false;
    if (!nextTokenIs(b, T_XHP_CATEGORY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_XHP_CATEGORY);
    p = r; // pin = 1
    r = r && report_error_(b, XhpCategoryDeclaration(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, XHP_CATEGORY_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // XhpChildrenParenExpression | Identifier | T_EMPTY
  public static boolean XhpChildrenDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp children declaration>");
    r = XhpChildrenParenExpression(b, l + 1);
    if (!r) r = Identifier(b, l + 1);
    if (!r) r = consumeToken(b, T_EMPTY);
    exit_section_(b, l, m, XHP_CHILDREN_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (XhpChildrenParenExpression | XhpChildrenTag) ((','|'|') (XhpChildrenParenExpression | XhpChildrenTag))*
  public static boolean XhpChildrenExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp children expression>");
    r = XhpChildrenExpression_0(b, l + 1);
    r = r && XhpChildrenExpression_1(b, l + 1);
    exit_section_(b, l, m, XHP_CHILDREN_EXPRESSION, r, false, null);
    return r;
  }

  // XhpChildrenParenExpression | XhpChildrenTag
  private static boolean XhpChildrenExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XhpChildrenParenExpression(b, l + 1);
    if (!r) r = XhpChildrenTag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((','|'|') (XhpChildrenParenExpression | XhpChildrenTag))*
  private static boolean XhpChildrenExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!XhpChildrenExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XhpChildrenExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (','|'|') (XhpChildrenParenExpression | XhpChildrenTag)
  private static boolean XhpChildrenExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XhpChildrenExpression_1_0_0(b, l + 1);
    r = r && XhpChildrenExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','|'|'
  private static boolean XhpChildrenExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenExpression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    if (!r) r = consumeToken(b, T_OR);
    exit_section_(b, m, null, r);
    return r;
  }

  // XhpChildrenParenExpression | XhpChildrenTag
  private static boolean XhpChildrenExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenExpression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XhpChildrenParenExpression(b, l + 1);
    if (!r) r = XhpChildrenTag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' XhpChildrenExpression ')' ('*'|'?'|'+')?
  public static boolean XhpChildrenParenExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenParenExpression")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, XhpChildrenExpression(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_RPAREN)) && r;
    r = p && XhpChildrenParenExpression_3(b, l + 1) && r;
    exit_section_(b, l, m, XHP_CHILDREN_PAREN_EXPRESSION, r, p, null);
    return r || p;
  }

  // ('*'|'?'|'+')?
  private static boolean XhpChildrenParenExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenParenExpression_3")) return false;
    XhpChildrenParenExpression_3_0(b, l + 1);
    return true;
  }

  // '*'|'?'|'+'
  private static boolean XhpChildrenParenExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenParenExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_MUL);
    if (!r) r = consumeToken(b, T_QUEST);
    if (!r) r = consumeToken(b, T_PLUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_CHILDREN XhpChildrenDeclaration ';'
  public static boolean XhpChildrenStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenStatement")) return false;
    if (!nextTokenIs(b, T_XHP_CHILDREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_XHP_CHILDREN);
    p = r; // pin = 1
    r = r && report_error_(b, XhpChildrenDeclaration(b, l + 1));
    r = p && consumeToken(b, T_SEMICOLON) && r;
    exit_section_(b, l, m, XHP_CHILDREN_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (Identifier | XhpIdentifier | T_XHP_CATEGORY_LABEL) ('*'|'?'|'+')?
  public static boolean XhpChildrenTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenTag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp children tag>");
    r = XhpChildrenTag_0(b, l + 1);
    r = r && XhpChildrenTag_1(b, l + 1);
    exit_section_(b, l, m, XHP_CHILDREN_TAG, r, false, null);
    return r;
  }

  // Identifier | XhpIdentifier | T_XHP_CATEGORY_LABEL
  private static boolean XhpChildrenTag_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenTag_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = XhpIdentifier(b, l + 1);
    if (!r) r = consumeToken(b, T_XHP_CATEGORY_LABEL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('*'|'?'|'+')?
  private static boolean XhpChildrenTag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenTag_1")) return false;
    XhpChildrenTag_1_0(b, l + 1);
    return true;
  }

  // '*'|'?'|'+'
  private static boolean XhpChildrenTag_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpChildrenTag_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_MUL);
    if (!r) r = consumeToken(b, T_QUEST);
    if (!r) r = consumeToken(b, T_PLUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // XhpTag
  public static boolean XhpExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpExpression")) return false;
    if (!nextTokenIs(b, T_XHP_TAG_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XhpTag(b, l + 1);
    exit_section_(b, m, XHP_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_LABEL
  public static boolean XhpIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpIdentifier")) return false;
    if (!nextTokenIs(b, T_XHP_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_XHP_LABEL);
    exit_section_(b, m, XHP_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // XhpIdentifier
  public static boolean XhpNameHolder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpNameHolder")) return false;
    if (!nextTokenIs(b, T_XHP_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XhpIdentifier(b, l + 1);
    exit_section_(b, m, XHP_NAME_HOLDER, r);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_TAG_LT XhpIdentifier xhp_tag_body T_XHP_TAG_GT
  public static boolean XhpTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpTag")) return false;
    if (!nextTokenIs(b, T_XHP_TAG_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_XHP_TAG_LT);
    r = r && XhpIdentifier(b, l + 1);
    r = r && xhp_tag_body(b, l + 1);
    r = r && consumeToken(b, T_XHP_TAG_GT);
    exit_section_(b, m, XHP_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // XhpIdentifier
  public static boolean XhpType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XhpType")) return false;
    if (!nextTokenIs(b, T_XHP_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XhpIdentifier(b, l + 1);
    exit_section_(b, m, XHP_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // TryVariableNameFirst '=' YieldExpression
  public static boolean YieldAssignExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldAssignExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<yield assign expression>");
    r = TryVariableNameFirst(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && YieldExpression(b, l + 1);
    exit_section_(b, l, m, YIELD_ASSIGN_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_YIELD AssignmentExpressionWrapper (T_DOUBLE_ARROW AssignmentExpressionWrapper)?
  public static boolean YieldExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldExpression")) return false;
    if (!nextTokenIs(b, T_YIELD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, T_YIELD);
    p = r; // pin = 1
    r = r && report_error_(b, AssignmentExpressionWrapper(b, l + 1));
    r = p && YieldExpression_2(b, l + 1) && r;
    exit_section_(b, l, m, YIELD_EXPRESSION, r, p, null);
    return r || p;
  }

  // (T_DOUBLE_ARROW AssignmentExpressionWrapper)?
  private static boolean YieldExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldExpression_2")) return false;
    YieldExpression_2_0(b, l + 1);
    return true;
  }

  // T_DOUBLE_ARROW AssignmentExpressionWrapper
  private static boolean YieldExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOUBLE_ARROW);
    r = r && AssignmentExpressionWrapper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ListAssignmentVariables '=' YieldExpression
  public static boolean YieldListAssignExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldListAssignExpression")) return false;
    if (!nextTokenIs(b, T_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ListAssignmentVariables(b, l + 1);
    r = r && consumeToken(b, T_EQUAL);
    r = r && YieldExpression(b, l + 1);
    exit_section_(b, m, YIELD_LIST_ASSIGN_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // T_YIELD T_BREAK ';'
  public static boolean YieldStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldStatement")) return false;
    if (!nextTokenIs(b, T_YIELD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 1, T_YIELD, T_BREAK);
    p = r; // pin = 1
    r = r && consumeToken(b, T_SEMICOLON);
    exit_section_(b, l, m, YIELD_STATEMENT, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '(' MemberVariableWrapper ')'
  static boolean parenthesized_variable_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesized_variable_expression")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && MemberVariableWrapper(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionCallExpression
  //                                  | CallableFunctionCallExpression
  //                                  | StaticMethodCallExpression
  //                                  //| dimmable_variable_access_expression
  //                                  | StaticClassVariableExpression
  //                                  | VariableExpression
  //                                  | parenthesized_variable_expression
  static boolean possible_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "possible_variable")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallExpression(b, l + 1);
    if (!r) r = CallableFunctionCallExpression(b, l + 1);
    if (!r) r = StaticMethodCallExpression(b, l + 1);
    if (!r) r = StaticClassVariableExpression(b, l + 1);
    if (!r) r = VariableExpression(b, l + 1);
    if (!r) r = parenthesized_variable_expression(b, l + 1);
    exit_section_(b, m, null, r);
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
  // XhpIdentifier
  public static boolean xhp_attribute_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_name")) return false;
    if (!nextTokenIs(b, T_XHP_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XhpIdentifier(b, l + 1);
    exit_section_(b, m, XHP_ATTRIBUTE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // T_XHP_TEXT | '{' AssignmentExpressionWrapper '}'
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

  // '{' AssignmentExpressionWrapper '}'
  private static boolean xhp_attribute_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_attribute_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && AssignmentExpressionWrapper(b, l + 1);
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
  // T_XHP_TEXT | VariableExpressionVariable | XhpTag
  public static boolean xhp_child(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_child")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xhp child>");
    r = consumeToken(b, T_XHP_TEXT);
    if (!r) r = VariableExpressionVariable(b, l + 1);
    if (!r) r = XhpTag(b, l + 1);
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
  // XhpIdentifier?
  public static boolean xhp_opt_end_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xhp_opt_end_label")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<xhp opt end label>");
    XhpIdentifier(b, l + 1);
    exit_section_(b, l, m, XHP_OPT_END_LABEL, true, false, null);
    return true;
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

}
