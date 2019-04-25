import net.sourceforge.pmd.lang.apex.ast.ASTUserClass;
import net.sourceforge.pmd.lang.apex.rule.AbstractApexRule;

public class ClassesCalledRichardAreNotAllowed extends AbstractApexRule {
    public Object visit(ASTUserClass node, Object data) {
        if(node.getImage().equalsIgnoreCase("Richard")) {
            addViolation(data, node);
        }

        return data;
    }
}
