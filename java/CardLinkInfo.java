package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CardLinkInfo extends Message {
  public static final String DEFAULT_BTN_STYLE = "";
  
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final String DEFAULT_CONTENT1 = "";
  
  public static final String DEFAULT_CONTENT2 = "";
  
  public static final String DEFAULT_IMAGE_URL = "";
  
  public static final String DEFAULT_TAG_COLOR = "";
  
  public static final String DEFAULT_TAG_TEXT = "";
  
  public static final String DEFAULT_TEXT_BTN_STATUS = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TYPE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String btn_style;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String content1;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String content2;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String image_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tag_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tag_text;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String text_btn_status;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String url;
  
  public CardLinkInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.type;
      if (str1 == null) {
        this.type = "";
      } else {
        this.type = str1;
      } 
      str1 = paramBuilder.image_url;
      if (str1 == null) {
        this.image_url = "";
      } else {
        this.image_url = str1;
      } 
      str1 = paramBuilder.tag_text;
      if (str1 == null) {
        this.tag_text = "";
      } else {
        this.tag_text = str1;
      } 
      str1 = paramBuilder.tag_color;
      if (str1 == null) {
        this.tag_color = "";
      } else {
        this.tag_color = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.content1;
      if (str1 == null) {
        this.content1 = "";
      } else {
        this.content1 = str1;
      } 
      str1 = paramBuilder.content2;
      if (str1 == null) {
        this.content2 = "";
      } else {
        this.content2 = str1;
      } 
      str1 = paramBuilder.btn_style;
      if (str1 == null) {
        this.btn_style = "";
      } else {
        this.btn_style = str1;
      } 
      str1 = paramBuilder.btn_text;
      if (str1 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str1;
      } 
      str1 = paramBuilder.text_btn_status;
      if (str1 == null) {
        this.text_btn_status = "";
      } else {
        this.text_btn_status = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.image_url = ((Builder)str).image_url;
      this.tag_text = ((Builder)str).tag_text;
      this.tag_color = ((Builder)str).tag_color;
      this.title = ((Builder)str).title;
      this.content1 = ((Builder)str).content1;
      this.content2 = ((Builder)str).content2;
      this.btn_style = ((Builder)str).btn_style;
      this.btn_text = ((Builder)str).btn_text;
      this.text_btn_status = ((Builder)str).text_btn_status;
      this.url = ((Builder)str).url;
    } 
  }
  
  public CardLinkInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CardLinkInfo> {
    public String btn_style;
    
    public String btn_text;
    
    public String content1;
    
    public String content2;
    
    public String image_url;
    
    public String tag_color;
    
    public String tag_text;
    
    public String text_btn_status;
    
    public String title;
    
    public String type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(CardLinkInfo param1CardLinkInfo) {
      super(param1CardLinkInfo);
      if (param1CardLinkInfo == null)
        return; 
      this.type = param1CardLinkInfo.type;
      this.image_url = param1CardLinkInfo.image_url;
      this.tag_text = param1CardLinkInfo.tag_text;
      this.tag_color = param1CardLinkInfo.tag_color;
      this.title = param1CardLinkInfo.title;
      this.content1 = param1CardLinkInfo.content1;
      this.content2 = param1CardLinkInfo.content2;
      this.btn_style = param1CardLinkInfo.btn_style;
      this.btn_text = param1CardLinkInfo.btn_text;
      this.text_btn_status = param1CardLinkInfo.text_btn_status;
      this.url = param1CardLinkInfo.url;
    }
    
    public CardLinkInfo build(boolean param1Boolean) {
      return new CardLinkInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
