package l2.patternChainOfResponsibility;

import l2.ComplexNumber.ComplexNumber;

public interface Chain {
    void setNextChain(Chain nextChain);
    void method(ComplexNumber number);
}
