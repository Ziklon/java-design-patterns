package org.patterns.structural.compose;

public class HtmlElement extends HtmlTag {


  private String tagBody;

  /**
   * creates a HTMLElement.
   * 
   * @param tagName <tagName/>
   */
  public HtmlElement(String tagName) {
    this.tagName = tagName;
    this.tagBody = "";
    this.startTag = "";
    this.endTag = "";
  }



  @Override
  public void setTagBody(String tagBody) {
    this.tagBody = tagBody;
  }

  @Override
  public void generateHtml() {
    String spaces = new String();
    for (int i = 0; i < this.indent; ++i) {
      spaces += " ";
    }

    System.out.println(spaces + startTag + "" + tagBody + "" + endTag);
  }


}
