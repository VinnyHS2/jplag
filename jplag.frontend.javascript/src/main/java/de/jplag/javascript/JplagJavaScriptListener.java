package de.jplag.javascript;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.jplag.javascript.grammar.JavaScriptParser;
import de.jplag.javascript.grammar.JavaScriptParserListener;

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
    public void enterProgram(JavaScriptParser.ProgramContext ctx) {
        
        
    }

    @Override
    public void exitProgram(JavaScriptParser.ProgramContext ctx) {
        
        
    }

    @Override
    public void enterSourceElement(JavaScriptParser.SourceElementContext ctx) {
        
        
    }

    @Override
    public void exitSourceElement(JavaScriptParser.SourceElementContext ctx) {
        
        
    }

    @Override
    public void enterStatement(JavaScriptParser.StatementContext ctx) {
        
        
    }

    @Override
    public void exitStatement(JavaScriptParser.StatementContext ctx) {
        
        
    }

    @Override
    public void enterBlock(JavaScriptParser.BlockContext ctx) {
        
        
    }

    @Override
    public void exitBlock(JavaScriptParser.BlockContext ctx) {
        
        
    }

    @Override
    public void enterStatementList(JavaScriptParser.StatementListContext ctx) {
        
        
    }

    @Override
    public void exitStatementList(JavaScriptParser.StatementListContext ctx) {
        
        
    }

    @Override
    public void enterImportStatement(JavaScriptParser.ImportStatementContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
        
        
    }

    @Override
    public void exitImportStatement(JavaScriptParser.ImportStatementContext ctx) {
        
        
    }

    @Override
    public void enterImportFromBlock(JavaScriptParser.ImportFromBlockContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
        
    }

    @Override
    public void exitImportFromBlock(JavaScriptParser.ImportFromBlockContext ctx) {
        
        
    }

    @Override
    public void enterModuleItems(JavaScriptParser.ModuleItemsContext ctx) {
        
        
    }

    @Override
    public void exitModuleItems(JavaScriptParser.ModuleItemsContext ctx) {
        
        
    }

    @Override
    public void enterImportDefault(JavaScriptParser.ImportDefaultContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
        
    }

    @Override
    public void exitImportDefault(JavaScriptParser.ImportDefaultContext ctx) {
        
        
    }

    @Override
    public void enterImportNamespace(JavaScriptParser.ImportNamespaceContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
        
    }

    @Override
    public void exitImportNamespace(JavaScriptParser.ImportNamespaceContext ctx) {
        
        
    }

    @Override
    public void enterImportFrom(JavaScriptParser.ImportFromContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
        
        
    }

    @Override
    public void exitImportFrom(JavaScriptParser.ImportFromContext ctx) {
        
        
    }

    @Override
    public void enterAliasName(JavaScriptParser.AliasNameContext ctx) {
        
        
    }

    @Override
    public void exitAliasName(JavaScriptParser.AliasNameContext ctx) {
        
        
    }

    @Override
    public void enterExportDeclaration(JavaScriptParser.ExportDeclarationContext ctx) {
        jplagParser.add(EXPORT, ctx.getStart());
        
    }

    @Override
    public void exitExportDeclaration(JavaScriptParser.ExportDeclarationContext ctx) {
        
        
    }

    @Override
    public void enterExportDefaultDeclaration(JavaScriptParser.ExportDefaultDeclarationContext ctx) {
        jplagParser.add(EXPORT, ctx.getStart());
        
    }

    @Override
    public void exitExportDefaultDeclaration(JavaScriptParser.ExportDefaultDeclarationContext ctx) {
        
        
    }

    @Override
    public void enterExportFromBlock(JavaScriptParser.ExportFromBlockContext ctx) {
        
        
    }

    @Override
    public void exitExportFromBlock(JavaScriptParser.ExportFromBlockContext ctx) {
        
        
    }

    @Override
    public void enterDeclaration(JavaScriptParser.DeclarationContext ctx) {
        
        
    }

    @Override
    public void exitDeclaration(JavaScriptParser.DeclarationContext ctx) {
        
        
    }

    @Override
    public void enterVariableStatement(JavaScriptParser.VariableStatementContext ctx) {
        
        
    }

    @Override
    public void exitVariableStatement(JavaScriptParser.VariableStatementContext ctx) {
        
        
    }

    @Override
    public void enterVariableDeclarationList(JavaScriptParser.VariableDeclarationListContext ctx) {
        
        
    }

    @Override
    public void exitVariableDeclarationList(JavaScriptParser.VariableDeclarationListContext ctx) {
        
        
    }

    @Override
    public void enterVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx) {
        
        
    }

    @Override
    public void exitVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx) {
        
        
    }

    @Override
    public void enterEmptyStatement(JavaScriptParser.EmptyStatementContext ctx) {
        
        
    }

    @Override
    public void exitEmptyStatement(JavaScriptParser.EmptyStatementContext ctx) {
        
        
    }

    @Override
    public void enterExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx) {
        
        
    }

    @Override
    public void exitExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx) {
        
        
    }

    @Override
    public void enterIfStatement(JavaScriptParser.IfStatementContext ctx) {
        jplagParser.add(IF_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitIfStatement(JavaScriptParser.IfStatementContext ctx) {
        jplagParser.addEnd(IF_END, ctx.getStart());
        
    }

    @Override
    public void enterDoStatement(JavaScriptParser.DoStatementContext ctx) {
        jplagParser.addEnd(DO_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitDoStatement(JavaScriptParser.DoStatementContext ctx) {
        jplagParser.addEnd(DO_END, ctx.getStart());
        
    }

    @Override
    public void enterWhileStatement(JavaScriptParser.WhileStatementContext ctx) {
        jplagParser.add(WHILE_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitWhileStatement(JavaScriptParser.WhileStatementContext ctx) {
        jplagParser.addEnd(WHILE_END, ctx.getStart());
        
    }

    @Override
    public void enterForStatement(JavaScriptParser.ForStatementContext ctx) {
        jplagParser.add(FOR_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitForStatement(JavaScriptParser.ForStatementContext ctx) {
        jplagParser.addEnd(FOR_END, ctx.getStart());
        
    }

    @Override
    public void enterForInStatement(JavaScriptParser.ForInStatementContext ctx) {
        
        
    }

    @Override
    public void exitForInStatement(JavaScriptParser.ForInStatementContext ctx) {
        
        
    }

    @Override
    public void enterForOfStatement(JavaScriptParser.ForOfStatementContext ctx) {
        
        
    }

    @Override
    public void exitForOfStatement(JavaScriptParser.ForOfStatementContext ctx) {
        
        
    }

    @Override
    public void enterVarModifier(JavaScriptParser.VarModifierContext ctx) {
        
        
    }

    @Override
    public void exitVarModifier(JavaScriptParser.VarModifierContext ctx) {
        
        
    }

    @Override
    public void enterContinueStatement(JavaScriptParser.ContinueStatementContext ctx) {
        jplagParser.add(CONTINUE, ctx.getStart());
        
    }

    @Override
    public void exitContinueStatement(JavaScriptParser.ContinueStatementContext ctx) {
        
        
    }

    @Override
    public void enterBreakStatement(JavaScriptParser.BreakStatementContext ctx) {
        jplagParser.add(BREAK, ctx.getStart());
        
    }

    @Override
    public void exitBreakStatement(JavaScriptParser.BreakStatementContext ctx) {
        
        
    }

    @Override
    public void enterReturnStatement(JavaScriptParser.ReturnStatementContext ctx) {
        jplagParser.add(RETURN, ctx.getStart());
        
    }

    @Override
    public void exitReturnStatement(JavaScriptParser.ReturnStatementContext ctx) {
        
        
    }

    @Override
    public void enterYieldStatement(JavaScriptParser.YieldStatementContext ctx) {
        jplagParser.add(YIELD, ctx.getStart());
        
    }

    @Override
    public void exitYieldStatement(JavaScriptParser.YieldStatementContext ctx) {
        
        
    }

    @Override
    public void enterWithStatement(JavaScriptParser.WithStatementContext ctx) {
        jplagParser.add(WITH_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitWithStatement(JavaScriptParser.WithStatementContext ctx) {
        jplagParser.addEnd(WITH_END, ctx.getStart());
        
    }

    @Override
    public void enterSwitchStatement(JavaScriptParser.SwitchStatementContext ctx) {
        jplagParser.addEnd(SWITH_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitSwitchStatement(JavaScriptParser.SwitchStatementContext ctx) {
        jplagParser.addEnd(SWITH_END, ctx.getStart());
        
    }

    @Override
    public void enterCaseBlock(JavaScriptParser.CaseBlockContext ctx) {
        
        
    }

    @Override
    public void exitCaseBlock(JavaScriptParser.CaseBlockContext ctx) {
        
        
    }

    @Override
    public void enterCaseClauses(JavaScriptParser.CaseClausesContext ctx) {
        
        
    }

    @Override
    public void exitCaseClauses(JavaScriptParser.CaseClausesContext ctx) {
        
        
    }

    @Override
    public void enterCaseClause(JavaScriptParser.CaseClauseContext ctx) {
        
        
    }

    @Override
    public void exitCaseClause(JavaScriptParser.CaseClauseContext ctx) {
        
        
    }

    @Override
    public void enterDefaultClause(JavaScriptParser.DefaultClauseContext ctx) {
        jplagParser.add(DEFAULT, ctx.getStart());
        
    }

    @Override
    public void exitDefaultClause(JavaScriptParser.DefaultClauseContext ctx) {
        
        
    }

    @Override
    public void enterLabelledStatement(JavaScriptParser.LabelledStatementContext ctx) {
        
        
    }

    @Override
    public void exitLabelledStatement(JavaScriptParser.LabelledStatementContext ctx) {
        
        
    }

    @Override
    public void enterThrowStatement(JavaScriptParser.ThrowStatementContext ctx) {
        jplagParser.addEnd(THROW_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitThrowStatement(JavaScriptParser.ThrowStatementContext ctx) {
        jplagParser.addEnd(THROW_END, ctx.getStart());
        
    }

    @Override
    public void enterTryStatement(JavaScriptParser.TryStatementContext ctx) {
        jplagParser.add(TRY_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitTryStatement(JavaScriptParser.TryStatementContext ctx) {
        
        
    }

    @Override
    public void enterCatchProduction(JavaScriptParser.CatchProductionContext ctx) {
        
        
    }

    @Override
    public void exitCatchProduction(JavaScriptParser.CatchProductionContext ctx) {
        
        
    }

    @Override
    public void enterFinallyProduction(JavaScriptParser.FinallyProductionContext ctx) {
        
        
    }

    @Override
    public void exitFinallyProduction(JavaScriptParser.FinallyProductionContext ctx) {
        
        
    }

    @Override
    public void enterDebuggerStatement(JavaScriptParser.DebuggerStatementContext ctx) {
        
        
    }

    @Override
    public void exitDebuggerStatement(JavaScriptParser.DebuggerStatementContext ctx) {
        
        
    }

    @Override
    public void enterFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
        jplagParser.add(FUNCTION_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
        jplagParser.add(FUNCTION_END, ctx.getStart());
        
    }

    @Override
    public void enterClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx) {
        jplagParser.add(CLASS_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx) {
        jplagParser.addEnd(CLASS_END, ctx.getStart());
        
    }

    @Override
    public void enterClassTail(JavaScriptParser.ClassTailContext ctx) {
        jplagParser.add(CLASS_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitClassTail(JavaScriptParser.ClassTailContext ctx) {
        jplagParser.addEnd(CLASS_END, ctx.getStart());
        
    }

    @Override
    public void enterClassElement(JavaScriptParser.ClassElementContext ctx) {
        jplagParser.add(CLASS_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitClassElement(JavaScriptParser.ClassElementContext ctx) {
        jplagParser.addEnd(CLASS_END, ctx.getStart());
        
    }

    @Override
    public void enterMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx) {
        jplagParser.add(METHOD_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx) {
        jplagParser.addEnd(METHOD_END, ctx.getStart());
        
    }

    @Override
    public void enterFormalParameterList(JavaScriptParser.FormalParameterListContext ctx) {
        
        
    }

    @Override
    public void exitFormalParameterList(JavaScriptParser.FormalParameterListContext ctx) {
        
        
    }

    @Override
    public void enterFormalParameterArg(JavaScriptParser.FormalParameterArgContext ctx) {
        
        
    }

    @Override
    public void exitFormalParameterArg(JavaScriptParser.FormalParameterArgContext ctx) {
        
        
    }

    @Override
    public void enterLastFormalParameterArg(JavaScriptParser.LastFormalParameterArgContext ctx) {
        
        
    }

    @Override
    public void exitLastFormalParameterArg(JavaScriptParser.LastFormalParameterArgContext ctx) {
        
        
    }

    @Override
    public void enterFunctionBody(JavaScriptParser.FunctionBodyContext ctx) {
        
        
    }

    @Override
    public void exitFunctionBody(JavaScriptParser.FunctionBodyContext ctx) {
        
        
    }

    @Override
    public void enterSourceElements(JavaScriptParser.SourceElementsContext ctx) {
        
        
    }

    @Override
    public void exitSourceElements(JavaScriptParser.SourceElementsContext ctx) {
        
        
    }

    @Override
    public void enterArrayLiteral(JavaScriptParser.ArrayLiteralContext ctx) {
        
        
    }

    @Override
    public void exitArrayLiteral(JavaScriptParser.ArrayLiteralContext ctx) {
        
        
    }

    @Override
    public void enterElementList(JavaScriptParser.ElementListContext ctx) {
        if (ctx.getText().contains(",")) {
            jplagParser.add(ARRAY, ctx.getStart());
        }
        
    }

    @Override
    public void exitElementList(JavaScriptParser.ElementListContext ctx) {
        
        
    }

    @Override
    public void enterArrayElement(JavaScriptParser.ArrayElementContext ctx) {
        
        
    }

    @Override
    public void exitArrayElement(JavaScriptParser.ArrayElementContext ctx) {
        
        
    }

    @Override
    public void enterPropertyExpressionAssignment(JavaScriptParser.PropertyExpressionAssignmentContext ctx) {
        
        
    }

    @Override
    public void exitPropertyExpressionAssignment(JavaScriptParser.PropertyExpressionAssignmentContext ctx) {
        
        
    }

    @Override
    public void enterComputedPropertyExpressionAssignment(JavaScriptParser.ComputedPropertyExpressionAssignmentContext ctx) {
        
        
    }

    @Override
    public void exitComputedPropertyExpressionAssignment(JavaScriptParser.ComputedPropertyExpressionAssignmentContext ctx) {
        
        
    }

    @Override
    public void enterFunctionProperty(JavaScriptParser.FunctionPropertyContext ctx) {
        
        
    }

    @Override
    public void exitFunctionProperty(JavaScriptParser.FunctionPropertyContext ctx) {
        
        
    }

    @Override
    public void enterPropertyGetter(JavaScriptParser.PropertyGetterContext ctx) {
        
        
    }

    @Override
    public void exitPropertyGetter(JavaScriptParser.PropertyGetterContext ctx) {
        
        
    }

    @Override
    public void enterPropertySetter(JavaScriptParser.PropertySetterContext ctx) {
        
        
    }

    @Override
    public void exitPropertySetter(JavaScriptParser.PropertySetterContext ctx) {
        
        
    }

    @Override
    public void enterPropertyShorthand(JavaScriptParser.PropertyShorthandContext ctx) {
        
        
    }

    @Override
    public void exitPropertyShorthand(JavaScriptParser.PropertyShorthandContext ctx) {
        
        
    }

    @Override
    public void enterPropertyName(JavaScriptParser.PropertyNameContext ctx) {
        
        
    }

    @Override
    public void exitPropertyName(JavaScriptParser.PropertyNameContext ctx) {
        
        
    }

    @Override
    public void enterArguments(JavaScriptParser.ArgumentsContext ctx) {
        
        
    }

    @Override
    public void exitArguments(JavaScriptParser.ArgumentsContext ctx) {
        
        
    }

    @Override
    public void enterArgument(JavaScriptParser.ArgumentContext ctx) {
        
        
    }

    @Override
    public void exitArgument(JavaScriptParser.ArgumentContext ctx) {
        
        
    }

    @Override
    public void enterExpressionSequence(JavaScriptParser.ExpressionSequenceContext ctx) {
        
        
    }

    @Override
    public void exitExpressionSequence(JavaScriptParser.ExpressionSequenceContext ctx) {
        
        
    }

    @Override
    public void enterTemplateStringExpression(JavaScriptParser.TemplateStringExpressionContext ctx) {
        
        
    }

    @Override
    public void exitTemplateStringExpression(JavaScriptParser.TemplateStringExpressionContext ctx) {
        
        
    }

    @Override
    public void enterTernaryExpression(JavaScriptParser.TernaryExpressionContext ctx) {
        
        
    }

    @Override
    public void exitTernaryExpression(JavaScriptParser.TernaryExpressionContext ctx) {
        
        
    }

    @Override
    public void enterLogicalAndExpression(JavaScriptParser.LogicalAndExpressionContext ctx) {
        
        
    }

    @Override
    public void exitLogicalAndExpression(JavaScriptParser.LogicalAndExpressionContext ctx) {
        
        
    }

    @Override
    public void enterPowerExpression(JavaScriptParser.PowerExpressionContext ctx) {
        
        
    }

    @Override
    public void exitPowerExpression(JavaScriptParser.PowerExpressionContext ctx) {
        
        
    }

    @Override
    public void enterPreIncrementExpression(JavaScriptParser.PreIncrementExpressionContext ctx) {
        
        
    }

    @Override
    public void exitPreIncrementExpression(JavaScriptParser.PreIncrementExpressionContext ctx) {
        
        
    }

    @Override
    public void enterObjectLiteralExpression(JavaScriptParser.ObjectLiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void exitObjectLiteralExpression(JavaScriptParser.ObjectLiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void enterMetaExpression(JavaScriptParser.MetaExpressionContext ctx) {
        
        
    }

    @Override
    public void exitMetaExpression(JavaScriptParser.MetaExpressionContext ctx) {
        
        
    }

    @Override
    public void enterInExpression(JavaScriptParser.InExpressionContext ctx) {
        
        
    }

    @Override
    public void exitInExpression(JavaScriptParser.InExpressionContext ctx) {
        
        
    }

    @Override
    public void enterLogicalOrExpression(JavaScriptParser.LogicalOrExpressionContext ctx) {
        
        
    }

    @Override
    public void exitLogicalOrExpression(JavaScriptParser.LogicalOrExpressionContext ctx) {
        
        
    }

    @Override
    public void enterNotExpression(JavaScriptParser.NotExpressionContext ctx) {
        
        
    }

    @Override
    public void exitNotExpression(JavaScriptParser.NotExpressionContext ctx) {
        
        
    }

    @Override
    public void enterPreDecreaseExpression(JavaScriptParser.PreDecreaseExpressionContext ctx) {
        
        
    }

    @Override
    public void exitPreDecreaseExpression(JavaScriptParser.PreDecreaseExpressionContext ctx) {
        
        
    }

    @Override
    public void enterArgumentsExpression(JavaScriptParser.ArgumentsExpressionContext ctx) {
        
        
    }

    @Override
    public void exitArgumentsExpression(JavaScriptParser.ArgumentsExpressionContext ctx) {
        
        
    }

    @Override
    public void enterAwaitExpression(JavaScriptParser.AwaitExpressionContext ctx) {
        
        
    }

    @Override
    public void exitAwaitExpression(JavaScriptParser.AwaitExpressionContext ctx) {
        
        
    }

    @Override
    public void enterThisExpression(JavaScriptParser.ThisExpressionContext ctx) {
        
        
    }

    @Override
    public void exitThisExpression(JavaScriptParser.ThisExpressionContext ctx) {
        
        
    }

    @Override
    public void enterFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
        
        
    }

    @Override
    public void exitFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
        
        
    }

    @Override
    public void enterUnaryMinusExpression(JavaScriptParser.UnaryMinusExpressionContext ctx) {
        
        
    }

    @Override
    public void exitUnaryMinusExpression(JavaScriptParser.UnaryMinusExpressionContext ctx) {
        
        
    }

    @Override
    public void enterAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx) {
        
        
    }

    @Override
    public void exitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx) {
        
        
    }

    @Override
    public void enterPostDecreaseExpression(JavaScriptParser.PostDecreaseExpressionContext ctx) {
        
        
    }

    @Override
    public void exitPostDecreaseExpression(JavaScriptParser.PostDecreaseExpressionContext ctx) {
        
        
    }

    @Override
    public void enterTypeofExpression(JavaScriptParser.TypeofExpressionContext ctx) {
        
        
    }

    @Override
    public void exitTypeofExpression(JavaScriptParser.TypeofExpressionContext ctx) {
        
        
    }

    @Override
    public void enterInstanceofExpression(JavaScriptParser.InstanceofExpressionContext ctx) {
        
        
    }

    @Override
    public void exitInstanceofExpression(JavaScriptParser.InstanceofExpressionContext ctx) {
        
        
    }

    @Override
    public void enterUnaryPlusExpression(JavaScriptParser.UnaryPlusExpressionContext ctx) {
        
        
    }

    @Override
    public void exitUnaryPlusExpression(JavaScriptParser.UnaryPlusExpressionContext ctx) {
        
        
    }

    @Override
    public void enterDeleteExpression(JavaScriptParser.DeleteExpressionContext ctx) {
        
        
    }

    @Override
    public void exitDeleteExpression(JavaScriptParser.DeleteExpressionContext ctx) {
        
        
    }

    @Override
    public void enterImportExpression(JavaScriptParser.ImportExpressionContext ctx) {
        jplagParser.add(IMPORT, ctx.getStart());
        
        
    }

    @Override
    public void exitImportExpression(JavaScriptParser.ImportExpressionContext ctx) {
        
        
    }

    @Override
    public void enterEqualityExpression(JavaScriptParser.EqualityExpressionContext ctx) {
        
        
    }

    @Override
    public void exitEqualityExpression(JavaScriptParser.EqualityExpressionContext ctx) {
        
        
    }

    @Override
    public void enterBitXOrExpression(JavaScriptParser.BitXOrExpressionContext ctx) {
        
        
    }

    @Override
    public void exitBitXOrExpression(JavaScriptParser.BitXOrExpressionContext ctx) {
        
        
    }

    @Override
    public void enterSuperExpression(JavaScriptParser.SuperExpressionContext ctx) {
        
        
    }

    @Override
    public void exitSuperExpression(JavaScriptParser.SuperExpressionContext ctx) {
        
        
    }

    @Override
    public void enterMultiplicativeExpression(JavaScriptParser.MultiplicativeExpressionContext ctx) {
        
        
    }

    @Override
    public void exitMultiplicativeExpression(JavaScriptParser.MultiplicativeExpressionContext ctx) {
        
        
    }

    @Override
    public void enterBitShiftExpression(JavaScriptParser.BitShiftExpressionContext ctx) {
        
        
    }

    @Override
    public void exitBitShiftExpression(JavaScriptParser.BitShiftExpressionContext ctx) {
        
        
    }

    @Override
    public void enterParenthesizedExpression(JavaScriptParser.ParenthesizedExpressionContext ctx) {
        
        
    }

    @Override
    public void exitParenthesizedExpression(JavaScriptParser.ParenthesizedExpressionContext ctx) {
        
        
    }

    @Override
    public void enterAdditiveExpression(JavaScriptParser.AdditiveExpressionContext ctx) {
        
        
    }

    @Override
    public void exitAdditiveExpression(JavaScriptParser.AdditiveExpressionContext ctx) {
        
        
    }

    @Override
    public void enterRelationalExpression(JavaScriptParser.RelationalExpressionContext ctx) {
        
        
    }

    @Override
    public void exitRelationalExpression(JavaScriptParser.RelationalExpressionContext ctx) {
        
        
    }

    @Override
    public void enterPostIncrementExpression(JavaScriptParser.PostIncrementExpressionContext ctx) {
        
        
    }

    @Override
    public void exitPostIncrementExpression(JavaScriptParser.PostIncrementExpressionContext ctx) {
        
        
    }

    @Override
    public void enterYieldExpression(JavaScriptParser.YieldExpressionContext ctx) {
        
        
    }

    @Override
    public void exitYieldExpression(JavaScriptParser.YieldExpressionContext ctx) {
        
        
    }

    @Override
    public void enterBitNotExpression(JavaScriptParser.BitNotExpressionContext ctx) {
        
        
    }

    @Override
    public void exitBitNotExpression(JavaScriptParser.BitNotExpressionContext ctx) {
        
        
    }

    @Override
    public void enterNewExpression(JavaScriptParser.NewExpressionContext ctx) {
        
        
    }

    @Override
    public void exitNewExpression(JavaScriptParser.NewExpressionContext ctx) {
        
        
    }

    @Override
    public void enterLiteralExpression(JavaScriptParser.LiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void exitLiteralExpression(JavaScriptParser.LiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void enterArrayLiteralExpression(JavaScriptParser.ArrayLiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void exitArrayLiteralExpression(JavaScriptParser.ArrayLiteralExpressionContext ctx) {
        
        
    }

    @Override
    public void enterMemberDotExpression(JavaScriptParser.MemberDotExpressionContext ctx) {
        
        
    }

    @Override
    public void exitMemberDotExpression(JavaScriptParser.MemberDotExpressionContext ctx) {
        
        
    }

    @Override
    public void enterClassExpression(JavaScriptParser.ClassExpressionContext ctx) {
        jplagParser.add(CLASS_BEGIN, ctx.getStart());
        
    }

    @Override
    public void exitClassExpression(JavaScriptParser.ClassExpressionContext ctx) {
        jplagParser.add(CLASS_END, ctx.getStart());
        
    }

    @Override
    public void enterMemberIndexExpression(JavaScriptParser.MemberIndexExpressionContext ctx) {
        
        
    }

    @Override
    public void exitMemberIndexExpression(JavaScriptParser.MemberIndexExpressionContext ctx) {
        
        
    }

    @Override
    public void enterIdentifierExpression(JavaScriptParser.IdentifierExpressionContext ctx) {
        
        
    }

    @Override
    public void exitIdentifierExpression(JavaScriptParser.IdentifierExpressionContext ctx) {
        
        
    }

    @Override
    public void enterBitAndExpression(JavaScriptParser.BitAndExpressionContext ctx) {
        
        
    }

    @Override
    public void exitBitAndExpression(JavaScriptParser.BitAndExpressionContext ctx) {
        
        
    }

    @Override
    public void enterBitOrExpression(JavaScriptParser.BitOrExpressionContext ctx) {
        
        
    }

    @Override
    public void exitBitOrExpression(JavaScriptParser.BitOrExpressionContext ctx) {
        
        
    }

    @Override
    public void enterAssignmentOperatorExpression(JavaScriptParser.AssignmentOperatorExpressionContext ctx) {
        
        
    }

    @Override
    public void exitAssignmentOperatorExpression(JavaScriptParser.AssignmentOperatorExpressionContext ctx) {
        
        
    }

    @Override
    public void enterVoidExpression(JavaScriptParser.VoidExpressionContext ctx) {
        
        
    }

    @Override
    public void exitVoidExpression(JavaScriptParser.VoidExpressionContext ctx) {
        
        
    }

    @Override
    public void enterCoalesceExpression(JavaScriptParser.CoalesceExpressionContext ctx) {
        
        
    }

    @Override
    public void exitCoalesceExpression(JavaScriptParser.CoalesceExpressionContext ctx) {
        
        
    }

    @Override
    public void enterAssignable(JavaScriptParser.AssignableContext ctx) {
        
        
    }

    @Override
    public void exitAssignable(JavaScriptParser.AssignableContext ctx) {
        
        
    }

    @Override
    public void enterObjectLiteral(JavaScriptParser.ObjectLiteralContext ctx) {
        
        
    }

    @Override
    public void exitObjectLiteral(JavaScriptParser.ObjectLiteralContext ctx) {
        
        
    }

    @Override
    public void enterFunctionDecl(JavaScriptParser.FunctionDeclContext ctx) {
        
        
    }

    @Override
    public void exitFunctionDecl(JavaScriptParser.FunctionDeclContext ctx) {
        
        
    }

    @Override
    public void enterAnonymousFunctionDecl(JavaScriptParser.AnonymousFunctionDeclContext ctx) {
        
        
    }

    @Override
    public void exitAnonymousFunctionDecl(JavaScriptParser.AnonymousFunctionDeclContext ctx) {
        
        
    }

    @Override
    public void enterArrowFunction(JavaScriptParser.ArrowFunctionContext ctx) {
        
        
    }

    @Override
    public void exitArrowFunction(JavaScriptParser.ArrowFunctionContext ctx) {
        
        
    }

    @Override
    public void enterArrowFunctionParameters(JavaScriptParser.ArrowFunctionParametersContext ctx) {
        
        
    }

    @Override
    public void exitArrowFunctionParameters(JavaScriptParser.ArrowFunctionParametersContext ctx) {
        
        
    }

    @Override
    public void enterArrowFunctionBody(JavaScriptParser.ArrowFunctionBodyContext ctx) {
        
        
    }

    @Override
    public void exitArrowFunctionBody(JavaScriptParser.ArrowFunctionBodyContext ctx) {
        
        
    }

    @Override
    public void enterAssignmentOperator(JavaScriptParser.AssignmentOperatorContext ctx) {
        jplagParser.add(ASSIGN, ctx.getStart());
        
    }

    @Override
    public void exitAssignmentOperator(JavaScriptParser.AssignmentOperatorContext ctx) {
        
        
    }

    @Override
    public void enterLiteral(JavaScriptParser.LiteralContext ctx) {
        
        
    }

    @Override
    public void exitLiteral(JavaScriptParser.LiteralContext ctx) {
        
        
    }

    @Override
    public void enterTemplateStringLiteral(JavaScriptParser.TemplateStringLiteralContext ctx) {
        
        
    }

    @Override
    public void exitTemplateStringLiteral(JavaScriptParser.TemplateStringLiteralContext ctx) {
        
        
    }

    @Override
    public void enterTemplateStringAtom(JavaScriptParser.TemplateStringAtomContext ctx) {
        
        
    }

    @Override
    public void exitTemplateStringAtom(JavaScriptParser.TemplateStringAtomContext ctx) {
        
        
    }

    @Override
    public void enterNumericLiteral(JavaScriptParser.NumericLiteralContext ctx) {
        
        
    }

    @Override
    public void exitNumericLiteral(JavaScriptParser.NumericLiteralContext ctx) {
        
        
    }

    @Override
    public void enterBigintLiteral(JavaScriptParser.BigintLiteralContext ctx) {
        
        
    }

    @Override
    public void exitBigintLiteral(JavaScriptParser.BigintLiteralContext ctx) {
        
        
    }

    @Override
    public void enterGetter(JavaScriptParser.GetterContext ctx) {
        
        
    }

    @Override
    public void exitGetter(JavaScriptParser.GetterContext ctx) {
        
        
    }

    @Override
    public void enterSetter(JavaScriptParser.SetterContext ctx) {
        
        
    }

    @Override
    public void exitSetter(JavaScriptParser.SetterContext ctx) {
        
        
    }

    @Override
    public void enterIdentifierName(JavaScriptParser.IdentifierNameContext ctx) {
        
        
    }

    @Override
    public void exitIdentifierName(JavaScriptParser.IdentifierNameContext ctx) {
        
        
    }

    @Override
    public void enterIdentifier(JavaScriptParser.IdentifierContext ctx) {
        
        
    }

    @Override
    public void exitIdentifier(JavaScriptParser.IdentifierContext ctx) {
        
        
    }

    @Override
    public void enterReservedWord(JavaScriptParser.ReservedWordContext ctx) {
        
        
    }

    @Override
    public void exitReservedWord(JavaScriptParser.ReservedWordContext ctx) {
        
        
    }

    @Override
    public void enterKeyword(JavaScriptParser.KeywordContext ctx) {
        
        
    }

    @Override
    public void exitKeyword(JavaScriptParser.KeywordContext ctx) {
        
        
    }

    @Override
    public void enterLet_(JavaScriptParser.Let_Context ctx) {
        
        
    }

    @Override
    public void exitLet_(JavaScriptParser.Let_Context ctx) {
        
        
    }

    @Override
    public void enterEos(JavaScriptParser.EosContext ctx) {
        
        
    }

    @Override
    public void exitEos(JavaScriptParser.EosContext ctx) {
        
        
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
