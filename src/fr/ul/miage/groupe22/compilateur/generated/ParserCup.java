
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Mar 27 11:13:51 CET 2015
//----------------------------------------------------

package fr.ul.miage.groupe22.compilateur.generated;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Mar 27 11:13:51 CET 2015
  */
public class ParserCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\055\000\002\002\004\000\002\002\004\000\002\002" +
    "\002\000\002\003\003\000\002\003\003\000\002\003\003" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\004\005\000\002\011\010\000\002\011\005\000\002" +
    "\012\006\000\002\012\002\000\002\013\004\000\002\013" +
    "\002\000\002\010\003\000\002\010\003\000\002\007\007" +
    "\000\002\015\005\000\002\015\003\000\002\015\002\000" +
    "\002\016\004\000\002\016\003\000\002\005\006\000\002" +
    "\014\003\000\002\014\003\000\002\014\006\000\002\017" +
    "\005\000\002\017\003\000\002\017\007\000\002\017\005" +
    "\000\002\020\003\000\002\020\003\000\002\020\003\000" +
    "\002\020\003\000\002\006\005\000\002\021\011\000\002" +
    "\021\015\000\002\024\005\000\002\024\003\000\002\023" +
    "\003\000\002\023\003\000\002\023\004\000\002\022\011" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\020\002\uffff\013\022\014\012\015\004\023" +
    "\020\024\014\026\005\001\002\000\004\013\ufff0\001\002" +
    "\000\004\006\127\001\002\000\022\002\ufffa\005\ufffa\013" +
    "\ufffa\014\ufffa\015\ufffa\023\ufffa\024\ufffa\026\ufffa\001\002" +
    "\000\022\002\ufffe\005\ufffe\013\ufffe\014\ufffe\015\ufffe\023" +
    "\ufffe\024\ufffe\026\ufffe\001\002\000\022\002\ufffb\005\ufffb" +
    "\013\ufffb\014\ufffb\015\ufffb\023\ufffb\024\ufffb\026\ufffb\001" +
    "\002\000\022\002\uffff\005\uffff\013\022\014\012\015\004" +
    "\023\020\024\014\026\005\001\002\000\004\013\ufff1\001" +
    "\002\000\004\002\125\001\002\000\004\006\104\001\002" +
    "\000\022\002\ufffc\005\ufffc\013\ufffc\014\ufffc\015\ufffc\023" +
    "\ufffc\024\ufffc\026\ufffc\001\002\000\022\002\ufffd\005\ufffd" +
    "\013\ufffd\014\ufffd\015\ufffd\023\ufffd\024\ufffd\026\ufffd\001" +
    "\002\000\004\013\063\001\002\000\010\006\025\013\030" +
    "\016\026\001\002\000\022\002\ufff9\005\ufff9\013\ufff9\014" +
    "\ufff9\015\ufff9\023\ufff9\024\ufff9\026\ufff9\001\002\000\006" +
    "\006\023\012\024\001\002\000\016\006\025\007\uffec\013" +
    "\030\014\012\015\004\016\026\001\002\000\010\006\025" +
    "\013\030\016\026\001\002\000\010\006\025\013\030\016" +
    "\026\001\002\000\026\007\uffe8\010\uffe8\011\uffe8\012\uffe8" +
    "\017\uffe8\020\uffe8\021\uffe8\022\uffe8\027\uffe8\030\uffe8\001" +
    "\002\000\026\007\uffe4\010\uffe4\011\uffe4\012\uffe4\017\045" +
    "\020\047\021\050\022\046\027\uffe4\030\uffe4\001\002\000" +
    "\030\006\033\007\uffe7\010\uffe7\011\uffe7\012\uffe7\017\uffe7" +
    "\020\uffe7\021\uffe7\022\uffe7\027\uffe7\030\uffe7\001\002\000" +
    "\004\010\032\001\002\000\022\002\uffe9\005\uffe9\013\uffe9" +
    "\014\uffe9\015\uffe9\023\uffe9\024\uffe9\026\uffe9\001\002\000" +
    "\016\006\025\007\uffec\013\030\014\012\015\004\016\026" +
    "\001\002\000\004\007\043\001\002\000\006\007\uffea\011" +
    "\uffea\001\002\000\004\013\042\001\002\000\006\007\uffed" +
    "\011\040\001\002\000\016\006\025\007\uffec\013\030\014" +
    "\012\015\004\016\026\001\002\000\004\007\uffee\001\002" +
    "\000\006\007\uffeb\011\uffeb\001\002\000\026\007\uffe6\010" +
    "\uffe6\011\uffe6\012\uffe6\017\uffe6\020\uffe6\021\uffe6\022\uffe6" +
    "\027\uffe6\030\uffe6\001\002\000\010\006\025\013\030\016" +
    "\026\001\002\000\010\006\uffe1\013\uffe1\016\uffe1\001\002" +
    "\000\010\006\uffde\013\uffde\016\uffde\001\002\000\010\006" +
    "\uffe0\013\uffe0\016\uffe0\001\002\000\010\006\uffdf\013\uffdf" +
    "\016\uffdf\001\002\000\016\007\uffe5\010\uffe5\011\uffe5\012" +
    "\uffe5\027\uffe5\030\uffe5\001\002\000\004\007\053\001\002" +
    "\000\026\007\uffe2\010\uffe2\011\uffe2\012\uffe2\017\045\020" +
    "\047\021\050\022\046\027\uffe2\030\uffe2\001\002\000\010" +
    "\006\025\013\030\016\026\001\002\000\016\007\uffe3\010" +
    "\uffe3\011\uffe3\012\uffe3\027\uffe3\030\uffe3\001\002\000\004" +
    "\007\057\001\002\000\004\010\060\001\002\000\022\002" +
    "\uffef\005\uffef\013\uffef\014\uffef\015\uffef\023\uffef\024\uffef" +
    "\026\uffef\001\002\000\004\010\062\001\002\000\022\002" +
    "\uffdd\005\uffdd\013\uffdd\014\uffdd\015\uffdd\023\uffdd\024\uffdd" +
    "\026\uffdd\001\002\000\012\006\065\010\ufff2\011\ufff2\012" +
    "\067\001\002\000\022\002\ufff8\005\ufff8\013\ufff8\014\ufff8" +
    "\015\ufff8\023\ufff8\024\ufff8\026\ufff8\001\002\000\016\006" +
    "\025\007\uffec\013\030\014\012\015\004\016\026\001\002" +
    "\000\006\010\ufff4\011\071\001\002\000\004\016\070\001" +
    "\002\000\006\010\ufff3\011\ufff3\001\002\000\004\013\074" +
    "\001\002\000\004\010\073\001\002\000\022\002\ufff6\005" +
    "\ufff6\013\ufff6\014\ufff6\015\ufff6\023\ufff6\024\ufff6\026\ufff6" +
    "\001\002\000\010\010\ufff2\011\ufff2\012\067\001\002\000" +
    "\006\010\ufff4\011\071\001\002\000\004\010\ufff5\001\002" +
    "\000\004\007\100\001\002\000\004\004\101\001\002\000" +
    "\020\005\uffff\013\022\014\012\015\004\023\020\024\014" +
    "\026\005\001\002\000\004\005\103\001\002\000\022\002" +
    "\ufff7\005\ufff7\013\ufff7\014\ufff7\015\ufff7\023\ufff7\024\ufff7" +
    "\026\ufff7\001\002\000\010\006\025\013\030\016\026\001" +
    "\002\000\004\007\115\001\002\000\012\007\uffd9\012\112" +
    "\027\110\030\107\001\002\000\010\006\uffd7\013\uffd7\016" +
    "\uffd7\001\002\000\010\006\uffd8\013\uffd8\016\uffd8\001\002" +
    "\000\010\006\025\013\030\016\026\001\002\000\004\012" +
    "\113\001\002\000\010\006\uffd6\013\uffd6\016\uffd6\001\002" +
    "\000\004\007\uffda\001\002\000\004\004\116\001\002\000" +
    "\020\005\uffff\013\022\014\012\015\004\023\020\024\014" +
    "\026\005\001\002\000\004\005\120\001\002\000\024\002" +
    "\uffdc\005\uffdc\013\uffdc\014\uffdc\015\uffdc\023\uffdc\024\uffdc" +
    "\025\121\026\uffdc\001\002\000\004\004\122\001\002\000" +
    "\020\005\uffff\013\022\014\012\015\004\023\020\024\014" +
    "\026\005\001\002\000\004\005\124\001\002\000\022\002" +
    "\uffdb\005\uffdb\013\uffdb\014\uffdb\015\uffdb\023\uffdb\024\uffdb" +
    "\026\uffdb\001\002\000\004\002\001\001\002\000\006\002" +
    "\000\005\000\001\002\000\010\006\025\013\030\016\026" +
    "\001\002\000\004\007\131\001\002\000\004\004\132\001" +
    "\002\000\020\005\uffff\013\022\014\012\015\004\023\020" +
    "\024\014\026\005\001\002\000\004\005\134\001\002\000" +
    "\022\002\uffd5\005\uffd5\013\uffd5\014\uffd5\015\uffd5\023\uffd5" +
    "\024\uffd5\026\uffd5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\024\002\012\003\010\004\006\005\015\006" +
    "\014\007\020\010\016\021\007\022\005\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\024\002\125\003\010\004\006" +
    "\005\015\006\014\007\020\010\016\021\007\022\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\014\026\017\060\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\010\035\014\026\015\055\016\036\017" +
    "\034\001\001\000\006\014\026\017\030\001\001\000\006" +
    "\014\026\017\051\001\001\000\002\001\001\000\004\020" +
    "\043\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\010\035\014\026\015\033\016\036\017" +
    "\034\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\014\010\035\014\026\015" +
    "\040\016\036\017\034\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\014\026\017\050\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\020\053\001\001\000\006\014\026\017\054\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\011\063\013\065\001\001\000\002\001\001\000\014\010" +
    "\035\014\026\015\076\016\036\017\034\001\001\000\004" +
    "\012\071\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\013\074\001\001\000\004\012\075\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\024\002\101" +
    "\003\010\004\006\005\015\006\014\007\020\010\016\021" +
    "\007\022\005\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\014\026\017\105\024\104\001\001\000\002\001" +
    "\001\000\004\023\110\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\014\026\017\105\024\113\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\024\002\116\003\010\004\006\005\015\006" +
    "\014\007\020\010\016\021\007\022\005\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\024\002" +
    "\122\003\010\004\006\005\015\006\014\007\020\010\016" +
    "\021\007\022\005\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\014\026" +
    "\017\105\024\127\001\001\000\002\001\001\000\002\001" +
    "\001\000\024\002\132\003\010\004\006\005\015\006\014" +
    "\007\020\010\016\021\007\022\005\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserCup$actions {
  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // iteration ::= WHILE PO boolean_expression PF AO liste AF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("iteration",16, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // boolean_operator ::= E E 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("boolean_operator",17, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // boolean_operator ::= SUPERIEUR 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("boolean_operator",17, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // boolean_operator ::= INFERIEUR 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("boolean_operator",17, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // boolean_expression ::= expression 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("boolean_expression",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // boolean_expression ::= expression boolean_operator boolean_expression 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("boolean_expression",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // condition ::= IF PO boolean_expression PF AO liste AF ELSE AO liste AF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("condition",15, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-10)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // condition ::= IF PO boolean_expression PF AO liste AF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("condition",15, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // ret ::= RETURN expression PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("ret",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // operator ::= DIVISE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("operator",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // operator ::= FOIS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("operator",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // operator ::= MOINS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("operator",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // operator ::= PLUS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("operator",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expression ::= PO expression PF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",13, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expression ::= PO expression PF operator expression 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",13, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-4)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // expression ::= data 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",13, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // expression ::= data operator expression 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",13, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // data ::= NAME PO parametres PF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("data",10, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // data ::= NAME 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("data",10, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // data ::= VAL 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("data",10, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // affectation ::= NAME E expression PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("affectation",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // parametre ::= expression 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("parametre",12, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // parametre ::= type NAME 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("parametre",12, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // parametres ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("parametres",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // parametres ::= parametre 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("parametres",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // parametres ::= parametre V parametres 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("parametres",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // appel ::= NAME PO parametres PF PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("appel",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-4)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // type ::= INT 
            {
              Integer RESULT =null;
		 RESULT = new Integer(1); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("type",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // type ::= VOID 
            {
              Integer RESULT =null;
		 RESULT = new Integer(0); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("type",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // value ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("value",9, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // value ::= E VAL 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("value",9, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // vars ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("vars",8, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // vars ::= V NAME value vars 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("vars",8, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // cat ::= value vars PV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("cat",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // cat ::= PO parametres PF AO liste AF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("cat",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-5)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // declaration ::= type NAME cat 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("declaration",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // command ::= appel 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("command",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // command ::= iteration 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("command",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // command ::= condition 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("command",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // command ::= ret 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("command",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // command ::= affectation 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("command",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // command ::= declaration 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("command",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // liste ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("liste",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // liste ::= command liste 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("liste",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= liste EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

