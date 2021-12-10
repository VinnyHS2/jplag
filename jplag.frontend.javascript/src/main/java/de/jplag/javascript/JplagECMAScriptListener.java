package de.jplag.javascript;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.jplag.javascript.grammar.ECMAScriptListener;
import de.jplag.javascript.grammar.ECMAScriptParser;

public class JplagECMAScriptListener implements ECMAScriptListener, ECMAScriptTokenConstants {

    private Parser jplagParser;

    public JplagECMAScriptListener(de.jplag.javascript.Parser jplag) {
        jplagParser = jplag;
    }

    @Override
	public void enterEof(ECMAScriptParser.EofContext ctx) {
	}

    @Override
	public void exitEof(ECMAScriptParser.EofContext ctx) {
	}

    @Override
    public void enterEos(ECMAScriptParser.EosContext ctx) {
    }

    @Override
    public void exitEos(ECMAScriptParser.EosContext ctx) {
    }

    @Override
    public void enterSetter(ECMAScriptParser.SetterContext ctx) {
    }

    @Override
    public void exitSetter(ECMAScriptParser.SetterContext ctx) {
    }

    @Override
    public void enterGetter(ECMAScriptParser.GetterContext ctx) {
    }

    @Override
    public void exitGetter(ECMAScriptParser.GetterContext ctx) {
    }

    @Override
    public void enterFutureReservedWord(ECMAScriptParser.FutureReservedWordContext ctx) {
    }

    @Override
    public void exitFutureReservedWord(ECMAScriptParser.FutureReservedWordContext ctx) {
    }

    @Override
    public void enterKeyword(ECMAScriptParser.KeywordContext ctx) {
    }

    @Override
    public void exitKeyword(ECMAScriptParser.KeywordContext ctx) {
    }

    @Override
    public void enterReservedWord(ECMAScriptParser.ReservedWordContext ctx) {
    }

    @Override
    public void exitReservedWord(ECMAScriptParser.ReservedWordContext ctx) {
    }

    @Override
    public void enterIdentifierName(ECMAScriptParser.IdentifierNameContext ctx) {
    }

    @Override
    public void exitIdentifierName(ECMAScriptParser.IdentifierNameContext ctx) {
    }

    @Override
    public void enterLiteral(ECMAScriptParser.LiteralContext ctx) {
    }

    @Override
    public void exitLiteral(ECMAScriptParser.LiteralContext ctx) {
    }

    @Override
    public void enterNumericLiteral(ECMAScriptParser.NumericLiteralContext ctx) {
    }

    @Override
    public void exitNumericLiteral(ECMAScriptParser.NumericLiteralContext ctx) {
    }

    @Override
    public void enterAssignmentOperator(ECMAScriptParser.AssignmentOperatorContext ctx) {
    }

    @Override
    public void exitAssignmentOperator(ECMAScriptParser.AssignmentOperatorContext ctx) {
    }

    @Override
    public void enterVoidExpression(ECMAScriptParser.VoidExpressionContext ctx) {
    }

    @Override
    public void exitVoidExpression(ECMAScriptParser.VoidExpressionContext ctx) {
    }

    @Override
    public void enterAssignmentOperatorExpression(ECMAScriptParser.AssignmentOperatorExpressionContext ctx) {
    }

    @Override
    public void exitAssignmentOperatorExpression(ECMAScriptParser.AssignmentOperatorExpressionContext ctx) {
    }

    @Override
    public void enterBitOrExpression(ECMAScriptParser.BitOrExpressionContext ctx) {
    }

    @Override
    public void exitBitOrExpression(ECMAScriptParser.BitOrExpressionContext ctx) {
    }

    @Override
    public void enterBitAndExpression(ECMAScriptParser.BitAndExpressionContext ctx) {
    }

    @Override
    public void exitBitAndExpression(ECMAScriptParser.BitAndExpressionContext ctx) {
    }

    @Override
    public void enterIdentifierExpression(ECMAScriptParser.IdentifierExpressionContext ctx) {
    }

    @Override
    public void exitIdentifierExpression(ECMAScriptParser.IdentifierExpressionContext ctx) {
    }

    @Override
    public void enterMemberIndexExpression(ECMAScriptParser.MemberIndexExpressionContext ctx) {
    }

    @Override
    public void exitMemberIndexExpression(ECMAScriptParser.MemberIndexExpressionContext ctx) {
    }

    @Override
    public void enterMemberDotExpression(ECMAScriptParser.MemberDotExpressionContext ctx) {
    }

    @Override
    public void exitMemberDotExpression(ECMAScriptParser.MemberDotExpressionContext ctx) {
    }

    @Override
    public void enterArrayLiteralExpression(ECMAScriptParser.ArrayLiteralExpressionContext ctx) {
    }

    @Override
    public void exitArrayLiteralExpression(ECMAScriptParser.ArrayLiteralExpressionContext ctx) {
    }

    @Override
    public void enterLiteralExpression(ECMAScriptParser.LiteralExpressionContext ctx) {
    }

    @Override
    public void exitLiteralExpression(ECMAScriptParser.LiteralExpressionContext ctx) {
    }

    @Override
    public void enterNewExpression(ECMAScriptParser.NewExpressionContext ctx) {
    }

    @Override
    public void exitNewExpression(ECMAScriptParser.NewExpressionContext ctx) {
    }

    @Override
    public void enterPostIncrementExpression(ECMAScriptParser.PostIncrementExpressionContext ctx) {
    }

    @Override
    public void exitPostIncrementExpression(ECMAScriptParser.PostIncrementExpressionContext ctx) {
    }

    @Override
    public void enterBitNotExpression(ECMAScriptParser.BitNotExpressionContext ctx) {
    }

    @Override
    public void exitBitNotExpression(ECMAScriptParser.BitNotExpressionContext ctx) {
    }

    @Override
    public void enterRelationalExpression(ECMAScriptParser.RelationalExpressionContext ctx) {
    }

    @Override
    public void exitRelationalExpression(ECMAScriptParser.RelationalExpressionContext ctx) {
    }

    @Override
    public void enterAdditiveExpression(ECMAScriptParser.AdditiveExpressionContext ctx) {
    }

    @Override
    public void exitAdditiveExpression(ECMAScriptParser.AdditiveExpressionContext ctx) {
    }

    @Override
    public void enterParenthesizedExpression(ECMAScriptParser.ParenthesizedExpressionContext ctx) {
    }

    @Override
    public void exitParenthesizedExpression(ECMAScriptParser.ParenthesizedExpressionContext ctx) {
    }

    @Override
    public void enterBitShiftExpression(ECMAScriptParser.BitShiftExpressionContext ctx) {
    }

    @Override
    public void exitBitShiftExpression(ECMAScriptParser.BitShiftExpressionContext ctx) {
    }

    @Override
    public void enterMultiplicativeExpression(ECMAScriptParser.MultiplicativeExpressionContext ctx) {
    }

    @Override
    public void exitMultiplicativeExpression(ECMAScriptParser.MultiplicativeExpressionContext ctx) {
    }

    @Override
    public void enterBitXOrExpression(ECMAScriptParser.BitXOrExpressionContext ctx) {
    }

    @Override
    public void exitBitXOrExpression(ECMAScriptParser.BitXOrExpressionContext ctx) {
    }

    @Override
    public void enterEqualityExpression(ECMAScriptParser.EqualityExpressionContext ctx) {
    }

    @Override
    public void exitEqualityExpression(ECMAScriptParser.EqualityExpressionContext ctx) {
    }

    @Override
    public void enterDeleteExpression(ECMAScriptParser.DeleteExpressionContext ctx) {
    }

    @Override
    public void exitDeleteExpression(ECMAScriptParser.DeleteExpressionContext ctx) {
    }

    @Override
    public void enterUnaryPlusExpression(ECMAScriptParser.UnaryPlusExpressionContext ctx) {
    }

    @Override
    public void exitUnaryPlusExpression(ECMAScriptParser.UnaryPlusExpressionContext ctx) {
    }

    @Override
    public void enterInstanceofExpression(ECMAScriptParser.InstanceofExpressionContext ctx) {
    }

    @Override
    public void exitInstanceofExpression(ECMAScriptParser.InstanceofExpressionContext ctx) {
    }

    @Override
    public void enterTypeofExpression(ECMAScriptParser.TypeofExpressionContext ctx) {
    }

    @Override
    public void exitTypeofExpression(ECMAScriptParser.TypeofExpressionContext ctx) {
    }

    @Override
    public void enterAssignmentExpression(ECMAScriptParser.AssignmentExpressionContext ctx) {
    }

    @Override
    public void exitAssignmentExpression(ECMAScriptParser.AssignmentExpressionContext ctx) {
    }

    @Override
    public void enterPostDecreaseExpression(ECMAScriptParser.PostDecreaseExpressionContext ctx) {
    }

    @Override
    public void exitPostDecreaseExpression(ECMAScriptParser.PostDecreaseExpressionContext ctx) {
    }

    @Override
    public void enterUnaryMinusExpression(ECMAScriptParser.UnaryMinusExpressionContext ctx) {
    }

    @Override
    public void exitUnaryMinusExpression(ECMAScriptParser.UnaryMinusExpressionContext ctx) {
    }

    @Override
    public void enterFunctionExpression(ECMAScriptParser.FunctionExpressionContext ctx) {
    }

    @Override
    public void exitFunctionExpression(ECMAScriptParser.FunctionExpressionContext ctx) {
    }

    @Override
    public void enterThisExpression(ECMAScriptParser.ThisExpressionContext ctx) {
    }

    @Override
    public void exitThisExpression(ECMAScriptParser.ThisExpressionContext ctx) {
    }

    @Override
    public void enterArgumentsExpression(ECMAScriptParser.ArgumentsExpressionContext ctx) {
    }

    @Override
    public void exitArgumentsExpression(ECMAScriptParser.ArgumentsExpressionContext ctx) {
    }

    @Override
    public void enterPreDecreaseExpression(ECMAScriptParser.PreDecreaseExpressionContext ctx) {
    }

    @Override
    public void exitPreDecreaseExpression(ECMAScriptParser.PreDecreaseExpressionContext ctx) {
    }

    @Override
    public void enterNotExpression(ECMAScriptParser.NotExpressionContext ctx) {
    }

    @Override
    public void exitNotExpression(ECMAScriptParser.NotExpressionContext ctx) {
    }

    @Override
    public void enterLogicalOrExpression(ECMAScriptParser.LogicalOrExpressionContext ctx) {
    }

    @Override
    public void exitLogicalOrExpression(ECMAScriptParser.LogicalOrExpressionContext ctx) {
    }

    @Override
    public void enterInExpression(ECMAScriptParser.InExpressionContext ctx) {
    }

    @Override
    public void exitInExpression(ECMAScriptParser.InExpressionContext ctx) {
    }

    @Override
    public void enterObjectLiteralExpression(ECMAScriptParser.ObjectLiteralExpressionContext ctx) {
    }

    @Override
    public void exitObjectLiteralExpression(ECMAScriptParser.ObjectLiteralExpressionContext ctx) {
    }

    @Override
    public void enterLogicalAndExpression(ECMAScriptParser.LogicalAndExpressionContext ctx) {
    }

    @Override
    public void exitLogicalAndExpression(ECMAScriptParser.LogicalAndExpressionContext ctx) {
    }

    @Override
    public void enterTernaryExpression(ECMAScriptParser.TernaryExpressionContext ctx) {
    }

    @Override
    public void exitTernaryExpression(ECMAScriptParser.TernaryExpressionContext ctx) {
    }

    @Override
    public void enterExpressionSequence(ECMAScriptParser.ExpressionSequenceContext ctx) {
    }

    @Override
    public void exitExpressionSequence(ECMAScriptParser.ExpressionSequenceContext ctx) {
    }

    @Override
    public void enterArgumentList(ECMAScriptParser.ArgumentListContext ctx) {
    }

    @Override
    public void exitArgumentList(ECMAScriptParser.ArgumentListContext ctx) {
    }

    @Override
    public void enterArguments(ECMAScriptParser.ArgumentsContext ctx) {
    }

    @Override
    public void exitArguments(ECMAScriptParser.ArgumentsContext ctx) {
    }

    @Override
    public void enterPropertySetParameterList(ECMAScriptParser.PropertySetParameterListContext ctx) {
    }

    @Override
    public void exitPropertySetParameterList(ECMAScriptParser.PropertySetParameterListContext ctx) {
    }













    
    @Override
    public void enterStatementList(ECMAScriptParser.StatementListContext ctx) {
    }

    @Override
    public void exitStatementList(ECMAScriptParser.StatementListContext ctx) {
    }
    
    @Override
    public void enterVariableStatement(ECMAScriptParser.VariableStatementContext ctx) {
    }

    @Override
    public void exitVariableStatement(ECMAScriptParser.VariableStatementContext ctx) {
    }
    
    @Override
    public void enterVariableDeclarationList(ECMAScriptParser.VariableDeclarationListContext ctx) {
    }

    @Override
    public void exitVariableDeclarationList(ECMAScriptParser.VariableDeclarationListContext ctx) {
    }
    
    @Override
    public void enterVariableDeclaration(ECMAScriptParser.VariableDeclarationContext ctx) {
    }

    @Override
    public void exitVariableDeclaration(ECMAScriptParser.VariableDeclarationContext ctx) {
    }
    
    @Override
    public void enterInitialiser(ECMAScriptParser.InitialiserContext ctx) {
    }

    @Override
    public void exitInitialiser(ECMAScriptParser.InitialiserContext ctx) {
    }
    
    @Override
    public void enterEmptyStatement(ECMAScriptParser.EmptyStatementContext ctx) {
    }

    @Override
    public void exitEmptyStatement(ECMAScriptParser.EmptyStatementContext ctx) {
    }
    
    @Override
    public void enterExpressionStatement(ECMAScriptParser.ExpressionStatementContext ctx) {
    }

    @Override
    public void exitExpressionStatement(ECMAScriptParser.ExpressionStatementContext ctx) {
    }
    
    @Override
    public void enterIfStatement(ECMAScriptParser.IfStatementContext ctx) {
    }

    @Override
    public void exitIfStatement(ECMAScriptParser.IfStatementContext ctx) {
    }
    
    @Override
    public void enterDoStatement(ECMAScriptParser.DoStatementContext ctx) {
    }

    @Override
    public void exitDoStatement(ECMAScriptParser.DoStatementContext ctx) {
    }
    
    @Override
    public void enterForVarStatement(ECMAScriptParser.ForVarStatementContext ctx) {
    }

    @Override
    public void exitForVarStatement(ECMAScriptParser.ForVarStatementContext ctx) {
    }
    
    @Override
    public void enterForVarInStatement(ECMAScriptParser.ForVarInStatementContext ctx) {
    }

    @Override
    public void exitForVarInStatement(ECMAScriptParser.ForVarInStatementContext ctx) {
    }
    
    @Override
    public void enterWhileStatement(ECMAScriptParser.WhileStatementContext ctx) {
    }

    @Override
    public void exitWhileStatement(ECMAScriptParser.WhileStatementContext ctx) {
    }
    
    @Override
    public void enterForStatement(ECMAScriptParser.ForStatementContext ctx) {
    }

    @Override
    public void exitForStatement(ECMAScriptParser.ForStatementContext ctx) {
    }
    
    @Override
    public void enterForInStatement(ECMAScriptParser.ForInStatementContext ctx) {
    }
    
    @Override
    public void enterBreakStatement(ECMAScriptParser.BreakStatementContext ctx) {
    }

    @Override
    public void exitBreakStatement(ECMAScriptParser.BreakStatementContext ctx) {
    }
    
    @Override
    public void enterReturnStatement(ECMAScriptParser.ReturnStatementContext ctx) {
    }

    @Override
    public void exitReturnStatement(ECMAScriptParser.ReturnStatementContext ctx) {
    }
    
    @Override
    public void enterWithStatement(ECMAScriptParser.WithStatementContext ctx) {
    }

    @Override
    public void exitWithStatement(ECMAScriptParser.WithStatementContext ctx) {
    }
    
    @Override
    public void enterSwitchStatement(ECMAScriptParser.SwitchStatementContext ctx) {
    }

    @Override
    public void exitSwitchStatement(ECMAScriptParser.SwitchStatementContext ctx) {
    }
    
    @Override
    public void enterCaseBlock(ECMAScriptParser.CaseBlockContext ctx) {
    }

    @Override
    public void exitCaseBlock(ECMAScriptParser.CaseBlockContext ctx) {
    }
    
    @Override
    public void enterCaseClauses(ECMAScriptParser.CaseClausesContext ctx) {
    }

    @Override
    public void exitCaseClauses(ECMAScriptParser.CaseClausesContext ctx) {
    }
    
    @Override
    public void enterCaseClause(ECMAScriptParser.CaseClauseContext ctx) {
    }

    @Override
    public void exitCaseClause(ECMAScriptParser.CaseClauseContext ctx) {
    }
    
    @Override
    public void enterDefaultClause(ECMAScriptParser.DefaultClauseContext ctx) {
    }

    @Override
    public void exitDefaultClause(ECMAScriptParser.DefaultClauseContext ctx) {
    }
    
    @Override
    public void enterLabelledStatement(ECMAScriptParser.LabelledStatementContext ctx) {
    }

    @Override
    public void exitLabelledStatement(ECMAScriptParser.LabelledStatementContext ctx) {
    }
    
    @Override
    public void enterThrowStatement(ECMAScriptParser.ThrowStatementContext ctx) {
    }

    @Override
    public void exitThrowStatement(ECMAScriptParser.ThrowStatementContext ctx) {
    }
    
    @Override
    public void enterTryStatement(ECMAScriptParser.TryStatementContext ctx) {
    }

    @Override
    public void exitTryStatement(ECMAScriptParser.TryStatementContext ctx) {
    }
    
    @Override
    public void enterCatchProduction(ECMAScriptParser.CatchProductionContext ctx) {
    }

    @Override
    public void exitCatchProduction(ECMAScriptParser.CatchProductionContext ctx) {
    }
    
    @Override
    public void enterFinallyProduction(ECMAScriptParser.FinallyProductionContext ctx) {
    }

    @Override
    public void exitFinallyProduction(ECMAScriptParser.FinallyProductionContext ctx) {
    }
    
    @Override
    public void enterDebuggerStatement(ECMAScriptParser.DebuggerStatementContext ctx) {
    }

    @Override
    public void exitDebuggerStatement(ECMAScriptParser.DebuggerStatementContext ctx) {
    }
    
    @Override
    public void enterFunctionDeclaration(ECMAScriptParser.FunctionDeclarationContext ctx) {
    }

    @Override
    public void exitFunctionDeclaration(ECMAScriptParser.FunctionDeclarationContext ctx) {
    }
    
    @Override
    public void enterFormalParameterList(ECMAScriptParser.FormalParameterListContext ctx) {
    }

    @Override
    public void exitFormalParameterList(ECMAScriptParser.FormalParameterListContext ctx) {
    }
    
    @Override
    public void enterFunctionBody(ECMAScriptParser.FunctionBodyContext ctx) {
    }

    @Override
    public void exitFunctionBody(ECMAScriptParser.FunctionBodyContext ctx) {
    }
    
    @Override
    public void enterPreIncrementExpression(ECMAScriptParser.PreIncrementExpressionContext ctx) {
    }

    @Override
    public void exitPreIncrementExpression(ECMAScriptParser.PreIncrementExpressionContext ctx) {
    }
    
    @Override
    public void enterArrayLiteral(ECMAScriptParser.ArrayLiteralContext ctx) {
    }

    @Override
    public void exitArrayLiteral(ECMAScriptParser.ArrayLiteralContext ctx) {
    }
    
    @Override
    public void enterElementList(ECMAScriptParser.ElementListContext ctx) {
    }

    @Override
    public void exitElementList(ECMAScriptParser.ElementListContext ctx) {
    }
    
    @Override
    public void enterElision(ECMAScriptParser.ElisionContext ctx) {
    }

    @Override
    public void exitElision(ECMAScriptParser.ElisionContext ctx) {
    }
    
    @Override
    public void enterObjectLiteral(ECMAScriptParser.ObjectLiteralContext ctx) {
    }

    @Override
    public void exitObjectLiteral(ECMAScriptParser.ObjectLiteralContext ctx) {
    }
    
    @Override
    public void enterPropertyNameAndValueList(ECMAScriptParser.PropertyNameAndValueListContext ctx) {
    }

    @Override
    public void exitPropertyNameAndValueList(ECMAScriptParser.PropertyNameAndValueListContext ctx) {
    }
        
    @Override
    public void enterPropertySetter(ECMAScriptParser.PropertySetterContext ctx) {
    }

    @Override
    public void exitPropertySetter(ECMAScriptParser.PropertySetterContext ctx) {
    }
    
    @Override
    public void enterPropertyGetter(ECMAScriptParser.PropertyGetterContext ctx) {
    }

    @Override
    public void exitPropertyGetter(ECMAScriptParser.PropertyGetterContext ctx) {
    }
    
    @Override
    public void enterPropertyName(ECMAScriptParser.PropertyNameContext ctx) {
    }

    @Override
    public void exitPropertyName(ECMAScriptParser.PropertyNameContext ctx) {
    }
    
    @Override
    public void enterPropertyExpressionAssignment(ECMAScriptParser.PropertyExpressionAssignmentContext ctx) {
    }

    @Override
    public void exitPropertyExpressionAssignment(ECMAScriptParser.PropertyExpressionAssignmentContext ctx) {
    }
    
    @Override
    public void enterContinueStatement(ECMAScriptParser.ContinueStatementContext ctx) {
    }

    @Override
    public void exitContinueStatement(ECMAScriptParser.ContinueStatementContext ctx) {
    }

    @Override
    public void exitForInStatement(ECMAScriptParser.ForInStatementContext ctx) {
    }

    @Override
    public void enterBlock(ECMAScriptParser.BlockContext ctx) {
    }

    @Override
    public void exitBlock(ECMAScriptParser.BlockContext ctx) {
    }

    @Override
    public void enterStatement(ECMAScriptParser.StatementContext ctx) {
    }

    @Override
    public void exitStatement(ECMAScriptParser.StatementContext ctx) {
    }

    @Override
    public void enterSourceElement(ECMAScriptParser.SourceElementContext ctx) {
    }

    @Override
    public void exitSourceElement(ECMAScriptParser.SourceElementContext ctx) {
    }

    @Override
    public void enterSourceElements(ECMAScriptParser.SourceElementsContext ctx) {
    }

    @Override
    public void exitSourceElements(ECMAScriptParser.SourceElementsContext ctx) {
    }

    @Override
    public void enterProgram(ECMAScriptParser.ProgramContext ctx) {
    }

    @Override
    public void exitProgram(ECMAScriptParser.ProgramContext ctx) {
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }
    
    @Override
    public void visitErrorNode(ErrorNode node) {
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
