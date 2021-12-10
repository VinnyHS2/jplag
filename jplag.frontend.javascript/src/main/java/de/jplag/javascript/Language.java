package de.jplag.javascript;

import java.io.File;

import de.jplag.ErrorConsumer;
import de.jplag.TokenList;

public class Language implements de.jplag.Language {

    private Parser parser;

    public Language(ErrorConsumer program) {
        this.parser = new Parser();
        this.parser.setProgram(program);
    }

    @Override
    public String[] suffixes() {
        String[] res = {".js"};
        return res;
    }

    @Override
    public int errorCount() {
        return this.parser.errorsCount();
    }

    @Override
    public String getName() {
        return "ECMAScript AbstractParser";
    }

    @Override
    public String getShortName() {
        return "javascript";
    }

    @Override
    public int minimumTokenMatch() {
        return 12;
    }

    @Override
    public TokenList parse(File dir, String[] files) {
        return this.parser.parse(dir, files);
    }

    @Override
    public boolean hasErrors() {
        return this.parser.hasErrors();
    }

    @Override
    public boolean supportsColumns() {
        return true;
    }

    @Override
    public boolean isPreformatted() {
        return true;
    }

    @Override
    public boolean usesIndex() {
        return false;
    }

    @Override
    public int numberOfTokens() {
        return ECMAScriptTokenConstants.NUM_DIFF_TOKENS;
    }

    @Override
    public String type2string(int type) {
        return ECMAScriptToken.type2string(type);
    }
}
