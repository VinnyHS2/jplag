package de.jplag.javascript;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.jplag.javascript.grammar.JavaScriptParserListener;
import de.jplag.javascript.grammar.JavaScriptParser;
import de.jplag.javascript.grammar.JavaScriptParser.*;

public class JplagJavaScriptListener implements JavaScriptParserListener, JavaScriptTokenConstants {

    private Parser jplagParser;

    public JplagJavaScriptListener(de.jplag.javascript.Parser jplag) {
        jplagParser = jplag;
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        
        
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        
        
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        
        
    }

    @Override
    public void enterProgram(ProgramContext ctx) {
        
        
    }

    @Override
    public void exitProgram(ProgramContext ctx) {
        
        
    }

    @Override
    public void enterSourceElement(SourceElementContext ctx) {
        
        
    }

    @Override
    public void exitSourceElement(SourceElementContext ctx) {
        
        
    }

    @Override
    public void enterStatement(StatementContext ctx) {
        
        
    }

    @Override
    public void exitStatement(StatementContext ctx) {
        
        
    }

    @Override
    public void enterBlock(BlockContext ctx) {
        
        
    }

    @Override
    public void exitBlock(BlockContext ctx) {
        
        
    }

    @Override
    public void enterStatementList(StatementListContext ctx) {
        
        
    }

    @Override
    public void exitStatementList(StatementListContext ctx) {
        
        
    }

    @Override
    public void enterImportStatement(ImportStatementContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
        
        
    }

    @Override
    public void exitImportStatement(ImportStatementContext ctx) {
        
        
    }

    @Override
    public void enterImportFromBlock(ImportFromBlockContext ctx) {
        
        
    }

    @Override
    public void exitImportFromBlock(ImportFromBlockContext ctx) {
        
        
    }

    @Override
    public void enterModuleItems(ModuleItemsContext ctx) {
        
        
    }

    @Override
    public void exitModuleItems(ModuleItemsContext ctx) {
        
        
    }

    @Override
    public void enterImportDefault(ImportDefaultContext ctx) {
        
        
    }

    @Override
    public void exitImportDefault(ImportDefaultContext ctx) {
        
        
    }

    @Override
    public void enterImportNamespace(ImportNamespaceContext ctx) {
        
        
    }

    @Override
    public void exitImportNamespace(ImportNamespaceContext ctx) {
        
        
    }

    @Override
    public void enterImportFrom(ImportFromContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
        
        
    }

    @Override
    public void exitImportFrom(ImportFromContext ctx) {
        
        
    }

    @Override
    public void enterAliasName(AliasNameContext ctx) {
        
        
    }

    @Override
    public void exitAliasName(AliasNameContext ctx) {
        
        
    }

    @Override
    public void enterExportDeclaration(ExportDeclarationContext ctx) {
        
        
    }

    @Override
    public void exitExportDeclaration(ExportDeclarationContext ctx) {
        
        
    }

    @Override
    public void enterExportDefaultDeclaration(ExportDefaultDeclarationContext ctx) {
        
        
    }

    @Override
    public void exitExportDefaultDeclaration(ExportDefaultDeclarationContext ctx) {
        
        
    }

    @Override
    public void enterExportFromBlock(ExportFromBlockContext ctx) {
        
        
    }

    @Override
    public void exitExportFromBlock(ExportFromBlockContext ctx) {
        
        
    }

    @Override
    public void enterDeclaration(DeclarationContext ctx) {
        
        
    }

    @Override
    public void exitDeclaration(DeclarationContext ctx) {
        
        
    }

    @Override
    public void enterVariableStatement(VariableStatementContext ctx) {
        
        
    }

    @Override
    public void exitVariableStatement(VariableStatementContext ctx) {
        
        
    }

    @Override
    public void enterVariableDeclarationList(VariableDeclarationListContext ctx) {
        
        
    }

    @Override
    public void exitVariableDeclarationList(VariableDeclarationListContext ctx) {
        
        
    }

    @Override
    public void enterVariableDeclaration(VariableDeclarationContext ctx) {
        
        
    }

    @Override
    public void exitVariableDeclaration(VariableDeclarationContext ctx) {
        
        
    }

    @Override
    public void enterEmptyStatement(EmptyStatementContext ctx) {
        
        
    }

    @Override
    public void exitEmptyStatement(EmptyStatementContext ctx) {
        
        
    }

    @Override
    public void enterExpressionStatement(ExpressionStatementContext ctx) {
        
        
    }

    @Override
    public void exitExpressionStatement(ExpressionStatementContext ctx) {
        
        
    }

    @Override
    public void enterIfStatement(IfStatementContext ctx) {
        jplagParser.add(IF_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitIfStatement(IfStatementContext ctx) {
        jplagParser.addEnd(IF_END, ctx.getStart());
        
    }

    @Override
    public void enterDoStatement(DoStatementContext ctx) {
        jplagParser.addEnd(DO_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitDoStatement(DoStatementContext ctx) {
        jplagParser.addEnd(DO_END, ctx.getStart());
        
    }

    @Override
    public void enterWhileStatement(WhileStatementContext ctx) {
        jplagParser.add(WHILE_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitWhileStatement(WhileStatementContext ctx) {
        jplagParser.addEnd(WHILE_END, ctx.getStart());
        
    }

    @Override
    public void enterForStatement(ForStatementContext ctx) {
        jplagParser.add(FOR_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitForStatement(ForStatementContext ctx) {
        jplagParser.addEnd(FOR_END, ctx.getStart());
        
    }

    @Override
    public void enterForInStatement(ForInStatementContext ctx) {
        
        
    }

    @Override
    public void exitForInStatement(ForInStatementContext ctx) {
        
        
    }

    @Override
    public void enterForOfStatement(ForOfStatementContext ctx) {
        
        
    }

    @Override
    public void exitForOfStatement(ForOfStatementContext ctx) {
        
        
    }

    @Override
    public void enterVarModifier(VarModifierContext ctx) {
        
        
    }

    @Override
    public void exitVarModifier(VarModifierContext ctx) {
        
        
    }

    @Override
    public void enterContinueStatement(ContinueStatementContext ctx) {
        jplagParser.add(CONTINUE, ctx.getStart());
        
    }

    @Override
    public void exitContinueStatement(ContinueStatementContext ctx) {
        
        
    }

    @Override
    public void enterBreakStatement(BreakStatementContext ctx) {
        jplagParser.add(BREAK, ctx.getStart());
        
    }

    @Override
    public void exitBreakStatement(BreakStatementContext ctx) {
        
        
    }

    @Override
    public void enterReturnStatement(ReturnStatementContext ctx) {
        jplagParser.add(RETURN, ctx.getStart());
        
    }

    @Override
    public void exitReturnStatement(ReturnStatementContext ctx) {
        
        
    }

    @Override
    public void enterYieldStatement(YieldStatementContext ctx) {
        jplagParser.add(YIELD, ctx.getStart());
        
    }

    @Override
    public void exitYieldStatement(YieldStatementContext ctx) {
        
        
    }

    @Override
    public void enterWithStatement(WithStatementContext ctx) {
        jplagParser.add(WITH_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitWithStatement(WithStatementContext ctx) {
        jplagParser.addEnd(WITH_END, ctx.getStart());
        
    }

    @Override
    public void enterSwitchStatement(SwitchStatementContext ctx) {
        jplagParser.addEnd(SWITH_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitSwitchStatement(SwitchStatementContext ctx) {
        jplagParser.addEnd(SWITH_END, ctx.getStart());
        
    }

    @Override
    public void enterCaseBlock(CaseBlockContext ctx) {
        
        
    }

    @Override
    public void exitCaseBlock(CaseBlockContext ctx) {
        
        
    }

    @Override
    public void enterCaseClauses(CaseClausesContext ctx) {
        
        
    }

    @Override
    public void exitCaseClauses(CaseClausesContext ctx) {
        
        
    }

    @Override
    public void enterCaseClause(CaseClauseContext ctx) {
        
        
    }

    @Override
    public void exitCaseClause(CaseClauseContext ctx) {
        
        
    }

    @Override
    public void enterDefaultClause(DefaultClauseContext ctx) {
        jplagParser.add(DEFAULT, ctx.getStart());
        
    }

    @Override
    public void exitDefaultClause(DefaultClauseContext ctx) {
        
        
    }

    @Override
    public void enterLabelledStatement(LabelledStatementContext ctx) {
        
        
    }

    @Override
    public void exitLabelledStatement(LabelledStatementContext ctx) {
        
        
    }

    @Override
    public void enterThrowStatement(ThrowStatementContext ctx) {
        jplagParser.addEnd(THROW_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitThrowStatement(ThrowStatementContext ctx) {
        jplagParser.addEnd(THROW_END, ctx.getStart());
        
    }

    @Override
    public void enterTryStatement(TryStatementContext ctx) {
        jplagParser.add(TRY_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitTryStatement(TryStatementContext ctx) {
        
        
    }

    @Override
    public void enterCatchProduction(CatchProductionContext ctx) {
        
        
    }

    @Override
    public void exitCatchProduction(CatchProductionContext ctx) {
        
        
    }

    @Override
    public void enterFinallyProduction(FinallyProductionContext ctx) {
        
        
    }

    @Override
    public void exitFinallyProduction(FinallyProductionContext ctx) {
        
        
    }

    @Override
    public void enterDebuggerStatement(DebuggerStatementContext ctx) {
        
        
    }

    @Override
    public void exitDebuggerStatement(DebuggerStatementContext ctx) {
        
        
    }

    @Override
    public void enterFunctionDeclaration(FunctionDeclarationContext ctx) {
        jplagParser.add(FUNCTION_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitFunctionDeclaration(FunctionDeclarationContext ctx) {
        jplagParser.add(FUNCTION_END, ctx.getStart());
        
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        jplagParser.add(CLASS_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        jplagParser.addEnd(CLASS_END, ctx.getStart());
        
    }

    @Override
    public void enterClassTail(ClassTailContext ctx) {
        
        
    }

    @Override
    public void exitClassTail(ClassTailContext ctx) {
        
        
    }

    @Override
    public void enterClassElement(ClassElementContext ctx) {
        
        
    }

    @Override
    public void exitClassElement(ClassElementContext ctx) {
        
        
    }

    @Override
    public void enterMethodDefinition(MethodDefinitionContext ctx) {
        jplagParser.add(METHOD_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitMethodDefinition(MethodDefinitionContext ctx) {
        jplagParser.addEnd(METHOD_END, ctx.getStart());
        
    }

    @Override
    public void enterFormalParameterList(FormalParameterListContext ctx) {
        
        
    }

    @Override
    public void exitFormalParameterList(FormalParameterListContext ctx) {
        
        
    }

    @Override
    public void enterFormalParameterArg(FormalParameterArgContext ctx) {
        
        
    }

    @Override
    public void exitFormalParameterArg(FormalParameterArgContext ctx) {
        
        
    }

    @Override
    public void enterLastFormalParameterArg(LastFormalParameterArgContext ctx) {
        
        
    }

    @Override
    public void exitLastFormalParameterArg(LastFormalParameterArgContext ctx) {
        
        
    }

    @Override
    public void enterFunctionBody(FunctionBodyContext ctx) {
        
        
    }

    @Override
    public void exitFunctionBody(FunctionBodyContext ctx) {
        
        
    }

    @Override
    public void enterSourceElements(SourceElementsContext ctx) {
        
        
    }

    @Override
    public void exitSourceElements(SourceElementsContext ctx) {
        
        
    }

    @Override
    public void enterArrayLiteral(ArrayLiteralContext ctx) {
        
        
    }

    @Override
    public void exitArrayLiteral(ArrayLiteralContext ctx) {
        
        
    }

    @Override
    public void enterElementList(ElementListContext ctx) {
        if (ctx.getText().contains(",")) {
            jplagParser.add(ARRAY, ctx.getStart());
        }
        
    }

    @Override
    public void exitElementList(ElementListContext ctx) {
        
        
    }

    @Override
    public void enterArrayElement(ArrayElementContext ctx) {
        
        
    }

    @Override
    public void exitArrayElement(ArrayElementContext ctx) {
        
        
    }

    @Override
    public void enterPropertyExpressionAssignment(PropertyExpressionAssignmentContext ctx) {
        
        
    }

    @Override
    public void exitPropertyExpressionAssignment(PropertyExpressionAssignmentContext ctx) {
        
        
    }

    @Override
    public void enterComputedPropertyExpressionAssignment(ComputedPropertyExpressionAssignmentContext ctx) {
        
        
    }

    @Override
    public void exitComputedPropertyExpressionAssignment(ComputedPropertyExpressionAssignmentContext ctx) {
        
        
    }

    @Override
    public void enterFunctionProperty(FunctionPropertyContext ctx) {
        
        
    }

    @Override
    public void exitFunctionProperty(FunctionPropertyContext ctx) {
        
        
    }

    @Override
    public void enterPropertyGetter(PropertyGetterContext ctx) {
        
        
    }

    @Override
    public void exitPropertyGetter(PropertyGetterContext ctx) {
        
        
    }

    @Override
    public void enterPropertySetter(PropertySetterContext ctx) {
        
        
    }

    @Override
    public void exitPropertySetter(PropertySetterContext ctx) {
        
        
    }

    @Override
    public void enterPropertyShorthand(PropertyShorthandContext ctx) {
        
        
    }

    @Override
    public void exitPropertyShorthand(PropertyShorthandContext ctx) {
        
        
    }

    @Override
    public void enterPropertyName(PropertyNameContext ctx) {
        
        
    }

    @Override
    public void exitPropertyName(PropertyNameContext ctx) {
        
        
    }

    @Override
    public void enterArguments(ArgumentsContext ctx) {
        
        
    }

    @Override
    public void exitArguments(ArgumentsContext ctx) {
        
        
    }

    @Override
    public void enterArgument(ArgumentContext ctx) {
        
        
    }

    @Override
    public void exitArgument(ArgumentContext ctx) {
        
        
    }

    @Override
    public void enterExpressionSequence(ExpressionSequenceContext ctx) {
        
        
    }

    @Override
    public void exitExpressionSequence(ExpressionSequenceContext ctx) {
        
        
    }

    @Override
    public void enterTemplateStringExpression(TemplateStringExpressionContext ctx) {
        
        
    }

    @Override
    public void exitTemplateStringExpression(TemplateStringExpressionContext ctx) {
        
        
    }

    @Override
    public void enterTernaryExpression(TernaryExpressionContext ctx) {
        
        
    }

    @Override
    public void exitTernaryExpression(TernaryExpressionContext ctx) {
        
        
    }

    @Override
    public void enterLogicalAndExpression(LogicalAndExpressionContext ctx) {
        
        
    }

    @Override
    public void exitLogicalAndExpression(LogicalAndExpressionContext ctx) {
        
        
    }

    @Override
    public void enterPowerExpression(PowerExpressionContext ctx) {
        
        
    }

    @Override
    public void exitPowerExpression(PowerExpressionContext ctx) {
        
        
    }

    @Override
    public void enterPreIncrementExpression(PreIncrementExpressionContext ctx) {
        
        
    }

    @Override
    public void exitPreIncrementExpression(PreIncrementExpressionContext ctx) {
        
        
    }

    @Override
    public void enterObjectLiteralExpression(ObjectLiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void exitObjectLiteralExpression(ObjectLiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void enterMetaExpression(MetaExpressionContext ctx) {
        
        
    }

    @Override
    public void exitMetaExpression(MetaExpressionContext ctx) {
        
        
    }

    @Override
    public void enterInExpression(InExpressionContext ctx) {
        
        
    }

    @Override
    public void exitInExpression(InExpressionContext ctx) {
        
        
    }

    @Override
    public void enterLogicalOrExpression(LogicalOrExpressionContext ctx) {
        
        
    }

    @Override
    public void exitLogicalOrExpression(LogicalOrExpressionContext ctx) {
        
        
    }

    @Override
    public void enterNotExpression(NotExpressionContext ctx) {
        
        
    }

    @Override
    public void exitNotExpression(NotExpressionContext ctx) {
        
        
    }

    @Override
    public void enterPreDecreaseExpression(PreDecreaseExpressionContext ctx) {
        
        
    }

    @Override
    public void exitPreDecreaseExpression(PreDecreaseExpressionContext ctx) {
        
        
    }

    @Override
    public void enterArgumentsExpression(ArgumentsExpressionContext ctx) {
        
        
    }

    @Override
    public void exitArgumentsExpression(ArgumentsExpressionContext ctx) {
        
        
    }

    @Override
    public void enterAwaitExpression(AwaitExpressionContext ctx) {
        
        
    }

    @Override
    public void exitAwaitExpression(AwaitExpressionContext ctx) {
        
        
    }

    @Override
    public void enterThisExpression(ThisExpressionContext ctx) {
        
        
    }

    @Override
    public void exitThisExpression(ThisExpressionContext ctx) {
        
        
    }

    @Override
    public void enterFunctionExpression(FunctionExpressionContext ctx) {
        
        
    }

    @Override
    public void exitFunctionExpression(FunctionExpressionContext ctx) {
        
        
    }

    @Override
    public void enterUnaryMinusExpression(UnaryMinusExpressionContext ctx) {
        
        
    }

    @Override
    public void exitUnaryMinusExpression(UnaryMinusExpressionContext ctx) {
        
        
    }

    @Override
    public void enterAssignmentExpression(AssignmentExpressionContext ctx) {
        
        
    }

    @Override
    public void exitAssignmentExpression(AssignmentExpressionContext ctx) {
        
        
    }

    @Override
    public void enterPostDecreaseExpression(PostDecreaseExpressionContext ctx) {
        
        
    }

    @Override
    public void exitPostDecreaseExpression(PostDecreaseExpressionContext ctx) {
        
        
    }

    @Override
    public void enterTypeofExpression(TypeofExpressionContext ctx) {
        
        
    }

    @Override
    public void exitTypeofExpression(TypeofExpressionContext ctx) {
        
        
    }

    @Override
    public void enterInstanceofExpression(InstanceofExpressionContext ctx) {
        
        
    }

    @Override
    public void exitInstanceofExpression(InstanceofExpressionContext ctx) {
        
        
    }

    @Override
    public void enterUnaryPlusExpression(UnaryPlusExpressionContext ctx) {
        
        
    }

    @Override
    public void exitUnaryPlusExpression(UnaryPlusExpressionContext ctx) {
        
        
    }

    @Override
    public void enterDeleteExpression(DeleteExpressionContext ctx) {
        
        
    }

    @Override
    public void exitDeleteExpression(DeleteExpressionContext ctx) {
        
        
    }

    @Override
    public void enterImportExpression(ImportExpressionContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
        
        
    }

    @Override
    public void exitImportExpression(ImportExpressionContext ctx) {
        
        
    }

    @Override
    public void enterEqualityExpression(EqualityExpressionContext ctx) {
        
        
    }

    @Override
    public void exitEqualityExpression(EqualityExpressionContext ctx) {
        
        
    }

    @Override
    public void enterBitXOrExpression(BitXOrExpressionContext ctx) {
        
        
    }

    @Override
    public void exitBitXOrExpression(BitXOrExpressionContext ctx) {
        
        
    }

    @Override
    public void enterSuperExpression(SuperExpressionContext ctx) {
        
        
    }

    @Override
    public void exitSuperExpression(SuperExpressionContext ctx) {
        
        
    }

    @Override
    public void enterMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        
        
    }

    @Override
    public void exitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        
        
    }

    @Override
    public void enterBitShiftExpression(BitShiftExpressionContext ctx) {
        
        
    }

    @Override
    public void exitBitShiftExpression(BitShiftExpressionContext ctx) {
        
        
    }

    @Override
    public void enterParenthesizedExpression(ParenthesizedExpressionContext ctx) {
        
        
    }

    @Override
    public void exitParenthesizedExpression(ParenthesizedExpressionContext ctx) {
        
        
    }

    @Override
    public void enterAdditiveExpression(AdditiveExpressionContext ctx) {
        
        
    }

    @Override
    public void exitAdditiveExpression(AdditiveExpressionContext ctx) {
        
        
    }

    @Override
    public void enterRelationalExpression(RelationalExpressionContext ctx) {
        
        
    }

    @Override
    public void exitRelationalExpression(RelationalExpressionContext ctx) {
        
        
    }

    @Override
    public void enterPostIncrementExpression(PostIncrementExpressionContext ctx) {
        
        
    }

    @Override
    public void exitPostIncrementExpression(PostIncrementExpressionContext ctx) {
        
        
    }

    @Override
    public void enterYieldExpression(YieldExpressionContext ctx) {
        
        
    }

    @Override
    public void exitYieldExpression(YieldExpressionContext ctx) {
        
        
    }

    @Override
    public void enterBitNotExpression(BitNotExpressionContext ctx) {
        
        
    }

    @Override
    public void exitBitNotExpression(BitNotExpressionContext ctx) {
        
        
    }

    @Override
    public void enterNewExpression(NewExpressionContext ctx) {
        
        
    }

    @Override
    public void exitNewExpression(NewExpressionContext ctx) {
        
        
    }

    @Override
    public void enterLiteralExpression(LiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void exitLiteralExpression(LiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void enterArrayLiteralExpression(ArrayLiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void exitArrayLiteralExpression(ArrayLiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void enterMemberDotExpression(MemberDotExpressionContext ctx) {
        
        
    }

    @Override
    public void exitMemberDotExpression(MemberDotExpressionContext ctx) {
        
        
    }

    @Override
    public void enterClassExpression(ClassExpressionContext ctx) {
        
        
    }

    @Override
    public void exitClassExpression(ClassExpressionContext ctx) {
        
        
    }

    @Override
    public void enterMemberIndexExpression(MemberIndexExpressionContext ctx) {
        
        
    }

    @Override
    public void exitMemberIndexExpression(MemberIndexExpressionContext ctx) {
        
        
    }

    @Override
    public void enterIdentifierExpression(IdentifierExpressionContext ctx) {
        
        
    }

    @Override
    public void exitIdentifierExpression(IdentifierExpressionContext ctx) {
        
        
    }

    @Override
    public void enterBitAndExpression(BitAndExpressionContext ctx) {
        
        
    }

    @Override
    public void exitBitAndExpression(BitAndExpressionContext ctx) {
        
        
    }

    @Override
    public void enterBitOrExpression(BitOrExpressionContext ctx) {
        
        
    }

    @Override
    public void exitBitOrExpression(BitOrExpressionContext ctx) {
        
        
    }

    @Override
    public void enterAssignmentOperatorExpression(AssignmentOperatorExpressionContext ctx) {
        
        
    }

    @Override
    public void exitAssignmentOperatorExpression(AssignmentOperatorExpressionContext ctx) {
        
        
    }

    @Override
    public void enterVoidExpression(VoidExpressionContext ctx) {
        
        
    }

    @Override
    public void exitVoidExpression(VoidExpressionContext ctx) {
        
        
    }

    @Override
    public void enterCoalesceExpression(CoalesceExpressionContext ctx) {
        
        
    }

    @Override
    public void exitCoalesceExpression(CoalesceExpressionContext ctx) {
        
        
    }

    @Override
    public void enterAssignable(AssignableContext ctx) {
        
        
    }

    @Override
    public void exitAssignable(AssignableContext ctx) {
        
        
    }

    @Override
    public void enterObjectLiteral(ObjectLiteralContext ctx) {
        
        
    }

    @Override
    public void exitObjectLiteral(ObjectLiteralContext ctx) {
        
        
    }

    @Override
    public void enterFunctionDecl(FunctionDeclContext ctx) {
        
        
    }

    @Override
    public void exitFunctionDecl(FunctionDeclContext ctx) {
        
        
    }

    @Override
    public void enterAnonymousFunctionDecl(AnonymousFunctionDeclContext ctx) {
        
        
    }

    @Override
    public void exitAnonymousFunctionDecl(AnonymousFunctionDeclContext ctx) {
        
        
    }

    @Override
    public void enterArrowFunction(ArrowFunctionContext ctx) {
        
        
    }

    @Override
    public void exitArrowFunction(ArrowFunctionContext ctx) {
        
        
    }

    @Override
    public void enterArrowFunctionParameters(ArrowFunctionParametersContext ctx) {
        
        
    }

    @Override
    public void exitArrowFunctionParameters(ArrowFunctionParametersContext ctx) {
        
        
    }

    @Override
    public void enterArrowFunctionBody(ArrowFunctionBodyContext ctx) {
        
        
    }

    @Override
    public void exitArrowFunctionBody(ArrowFunctionBodyContext ctx) {
        
        
    }

    @Override
    public void enterAssignmentOperator(AssignmentOperatorContext ctx) {
        jplagParser.add(ASSIGN, ctx.getStart());
        
    }

    @Override
    public void exitAssignmentOperator(AssignmentOperatorContext ctx) {
        
        
    }

    @Override
    public void enterLiteral(LiteralContext ctx) {
        
        
    }

    @Override
    public void exitLiteral(LiteralContext ctx) {
        
        
    }

    @Override
    public void enterTemplateStringLiteral(TemplateStringLiteralContext ctx) {
        
        
    }

    @Override
    public void exitTemplateStringLiteral(TemplateStringLiteralContext ctx) {
        
        
    }

    @Override
    public void enterTemplateStringAtom(TemplateStringAtomContext ctx) {
        
        
    }

    @Override
    public void exitTemplateStringAtom(TemplateStringAtomContext ctx) {
        
        
    }

    @Override
    public void enterNumericLiteral(NumericLiteralContext ctx) {
        
        
    }

    @Override
    public void exitNumericLiteral(NumericLiteralContext ctx) {
        
        
    }

    @Override
    public void enterBigintLiteral(BigintLiteralContext ctx) {
        
        
    }

    @Override
    public void exitBigintLiteral(BigintLiteralContext ctx) {
        
        
    }

    @Override
    public void enterGetter(GetterContext ctx) {
        
        
    }

    @Override
    public void exitGetter(GetterContext ctx) {
        
        
    }

    @Override
    public void enterSetter(SetterContext ctx) {
        
        
    }

    @Override
    public void exitSetter(SetterContext ctx) {
        
        
    }

    @Override
    public void enterIdentifierName(IdentifierNameContext ctx) {
        
        
    }

    @Override
    public void exitIdentifierName(IdentifierNameContext ctx) {
        
        
    }

    @Override
    public void enterIdentifier(IdentifierContext ctx) {
        
        
    }

    @Override
    public void exitIdentifier(IdentifierContext ctx) {
        
        
    }

    @Override
    public void enterReservedWord(ReservedWordContext ctx) {
        
        
    }

    @Override
    public void exitReservedWord(ReservedWordContext ctx) {
        
        
    }

    @Override
    public void enterKeyword(KeywordContext ctx) {
        
        
    }

    @Override
    public void exitKeyword(KeywordContext ctx) {
        
        
    }

    @Override
    public void enterLet_(Let_Context ctx) {
        
        
    }

    @Override
    public void exitLet_(Let_Context ctx) {
        
        
    }

    @Override
    public void enterEos(EosContext ctx) {
        
        
    }

    @Override
    public void exitEos(EosContext ctx) {
        
        
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (node.getText().equals("=")) {
            jplagParser.add(ASSIGN, node.getSymbol());
        } else if (node.getText().equals("finally")) {
            jplagParser.add(FINALLY, node.getSymbol());
        }
    }
}
