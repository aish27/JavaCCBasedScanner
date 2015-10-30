/* Generated By:JavaCC: Do not edit this line. HelloWorldConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface HelloWorldConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int IGNORE = 1;
  /** RegularExpression Id. */
  int SINGLELINECOMMENT = 2;
  /** RegularExpression Id. */
  int NEWLINE = 3;
  /** RegularExpression Id. */
  int STRING = 7;
  /** RegularExpression Id. */
  int CHAR = 8;
  /** RegularExpression Id. */
  int RESERVEDWORDABSTRACT = 9;
  /** RegularExpression Id. */
  int RESERVEDWORDDEFAULT = 10;
  /** RegularExpression Id. */
  int RESERVEDWORDRESERVEDWORDGOTO = 11;
  /** RegularExpression Id. */
  int RESERVEDWORDPACKAGE = 12;
  /** RegularExpression Id. */
  int RESERVEDWORDSYNCHRONIZED = 13;
  /** RegularExpression Id. */
  int RESERVEDWORDASSERT = 14;
  /** RegularExpression Id. */
  int RESERVEDWORDDO = 15;
  /** RegularExpression Id. */
  int RESERVEDWORDIF = 16;
  /** RegularExpression Id. */
  int RESERVEDWORDPRIVATE = 17;
  /** RegularExpression Id. */
  int RESERVEDWORDTHIS = 18;
  /** RegularExpression Id. */
  int RESERVEDWORDBOOLEAN = 19;
  /** RegularExpression Id. */
  int RESERVEDWORDDOUBLE = 20;
  /** RegularExpression Id. */
  int RESERVEDWORDIMPLEMENTS = 21;
  /** RegularExpression Id. */
  int RESERVEDWORDPROTECTED = 22;
  /** RegularExpression Id. */
  int RESERVEDWORDTHROW = 23;
  /** RegularExpression Id. */
  int RESERVEDWORDBREAK = 24;
  /** RegularExpression Id. */
  int RESERVEDWORDELSE = 25;
  /** RegularExpression Id. */
  int RESERVEDWORDIMPORT = 26;
  /** RegularExpression Id. */
  int RESERVEDWORDPUBLIC = 27;
  /** RegularExpression Id. */
  int RESERVEDWORDTHROWS = 28;
  /** RegularExpression Id. */
  int RESERVEDWORDBYTE = 29;
  /** RegularExpression Id. */
  int RESERVEDWORDENUM = 30;
  /** RegularExpression Id. */
  int RESERVEDWORDINSTANCEOF = 31;
  /** RegularExpression Id. */
  int RESERVEDWORDRETURN = 32;
  /** RegularExpression Id. */
  int RESERVEDWORDTRANSIENT = 33;
  /** RegularExpression Id. */
  int RESERVEDWORDCASE = 34;
  /** RegularExpression Id. */
  int RESERVEDWORDEXTENDS = 35;
  /** RegularExpression Id. */
  int RESERVEDWORDINT = 36;
  /** RegularExpression Id. */
  int RESERVEDWORDSHORT = 37;
  /** RegularExpression Id. */
  int RESERVEDWORDTRUE = 38;
  /** RegularExpression Id. */
  int RESERVEDWORDCATCH = 39;
  /** RegularExpression Id. */
  int RESERVEDWORDFALSE = 40;
  /** RegularExpression Id. */
  int RESERVEDWORDINTERFACE = 41;
  /** RegularExpression Id. */
  int RESERVEDWORDSTATIC = 42;
  /** RegularExpression Id. */
  int RESERVEDWORDTRY = 43;
  /** RegularExpression Id. */
  int RESERVEDWORDCHAR = 44;
  /** RegularExpression Id. */
  int RESERVEDWORDFINAL = 45;
  /** RegularExpression Id. */
  int RESERVEDWORDLONG = 46;
  /** RegularExpression Id. */
  int RESERVEDWORDSTRICTFP = 47;
  /** RegularExpression Id. */
  int RESERVEDWORDVOID = 48;
  /** RegularExpression Id. */
  int RESERVEDWORDCLASS = 49;
  /** RegularExpression Id. */
  int RESERVEDWORDFINALLY = 50;
  /** RegularExpression Id. */
  int RESERVEDWORDNATIVE = 51;
  /** RegularExpression Id. */
  int RESERVEDWORDSUPER = 52;
  /** RegularExpression Id. */
  int RESERVEDWORDVOLATILE = 53;
  /** RegularExpression Id. */
  int RESERVEDWORDCONST = 54;
  /** RegularExpression Id. */
  int RESERVEDWORDFLOAT = 55;
  /** RegularExpression Id. */
  int RESERVEDWORDNEW = 56;
  /** RegularExpression Id. */
  int RESERVEDWORDSWITCH = 57;
  /** RegularExpression Id. */
  int RESERVEDWORDWHILE = 58;
  /** RegularExpression Id. */
  int RESERVEDWORDCONTINUE = 59;
  /** RegularExpression Id. */
  int RESERVEDWORDFOR = 60;
  /** RegularExpression Id. */
  int SPECIALSYMBOL = 61;
  /** RegularExpression Id. */
  int IDENTIFIER = 62;
  /** RegularExpression Id. */
  int DECIMALINTEGER = 63;
  /** RegularExpression Id. */
  int OCTALINTEGER = 64;
  /** RegularExpression Id. */
  int HEXINTEGER = 65;
  /** RegularExpression Id. */
  int REALNUMBER = 66;
  /** RegularExpression Id. */
  int REAL_NUMBER = 67;
  /** RegularExpression Id. */
  int HEXLETTERS = 68;
  /** RegularExpression Id. */
  int DIGIT = 69;
  /** RegularExpression Id. */
  int NONZERO = 70;
  /** RegularExpression Id. */
  int LETTER = 71;
  /** RegularExpression Id. */
  int OCTALS = 72;
  /** RegularExpression Id. */
  int ZERO = 73;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int WithinComment = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<IGNORE>",
    "<SINGLELINECOMMENT>",
    "<NEWLINE>",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 6>",
    "<STRING>",
    "<CHAR>",
    "\"abstract\"",
    "\"default\"",
    "\"goto\"",
    "\"package\"",
    "\"synchronized\"",
    "\"assert\"",
    "\"do\"",
    "\"if\"",
    "\"private\"",
    "\"this\"",
    "\"boolean\"",
    "\"double\"",
    "\"implements\"",
    "\"protected\"",
    "\"throw\"",
    "\"break\"",
    "\"else\"",
    "\"import\"",
    "\"public\"",
    "\"throws\"",
    "\"byte\"",
    "\"enum\"",
    "\"instanceof\"",
    "\"return\"",
    "\"transient\"",
    "\"case\"",
    "\"extends\"",
    "\"int\"",
    "\"short\"",
    "\"true\"",
    "\"catch\"",
    "\"false\"",
    "\"interface\"",
    "\"static\"",
    "\"try\"",
    "\"char\"",
    "\"final\"",
    "\"long\"",
    "\"strictfp\"",
    "\"void\"",
    "\"class\"",
    "\"finally\"",
    "\"native\"",
    "\"super\"",
    "\"volatile\"",
    "\"const\"",
    "\"float\"",
    "\"new\"",
    "\"switch\"",
    "\"while\"",
    "\"continue\"",
    "\"for\"",
    "<SPECIALSYMBOL>",
    "<IDENTIFIER>",
    "<DECIMALINTEGER>",
    "<OCTALINTEGER>",
    "<HEXINTEGER>",
    "<REALNUMBER>",
    "<REAL_NUMBER>",
    "<HEXLETTERS>",
    "<DIGIT>",
    "<NONZERO>",
    "<LETTER>",
    "<OCTALS>",
    "<ZERO>",
  };

}
