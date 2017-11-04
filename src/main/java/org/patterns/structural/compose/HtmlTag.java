package org.patterns.structural.compose;

import java.util.List;

public abstract class HtmlTag {
  protected String tagName;
  protected String startTag;
  protected String endTag;

  protected int indent = 0;

  public final String getTagName() {
    return tagName;
  }

  public final void setStartTag(String tag) {
    this.startTag = tag;
  }

  public final void setEndTag(String tag) {
    this.endTag = tag;
  }

  public void setTagBody(String tagBody) {
    throw new UnsupportedOperationException("Current operation is not support for this object");
  }

  public void addChildTag(HtmlTag htmlTag) {
    throw new UnsupportedOperationException("Current operation is not support for this object");
  }

  public void removeChildTag(HtmlTag htmlTag) {
    throw new UnsupportedOperationException("Current operation is not support for this object");
  }

  public List<HtmlTag> getChildren() {
    throw new UnsupportedOperationException("Current operation is not support for this object");
  }

  public abstract void generateHtml();

}
