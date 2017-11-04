package org.patterns.structural.compose;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {

  private List<HtmlTag> childrenTag;

  public HtmlParentElement(String tagName) {
    this.tagName = tagName;
    this.startTag = "";
    this.endTag = "";
    this.childrenTag = new ArrayList<>();
  }


  @Override
  public void addChildTag(HtmlTag htmlTag) {
    childrenTag.add(htmlTag);
  }

  @Override
  public void removeChildTag(HtmlTag htmlTag) {
    childrenTag.remove(htmlTag);
  }

  @Override
  public List<HtmlTag> getChildren() {
    return childrenTag;
  }

  @Override
  public void generateHtml() {

    String spaces = new String();
    for (int i = 0; i < this.indent; ++i)
      spaces += " ";
    System.out.println(spaces + startTag);
    this.indent++;
    for (HtmlTag tag : childrenTag) {
      tag.generateHtml();
    }
    this.indent--;
    System.out.println(spaces + endTag);

  }
}
