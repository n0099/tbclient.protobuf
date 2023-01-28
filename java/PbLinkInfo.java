package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbLinkInfo extends Message {
  public static final String DEFAULT_CONTENT1 = "";
  
  public static final String DEFAULT_CONTENT2 = "";
  
  public static final String DEFAULT_EXT_TXT = "";
  
  public static final String DEFAULT_LINK_FROM = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Integer DEFAULT_SORT;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TO_URL = "";
  
  public static final Integer DEFAULT_URL_TYPE;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String content1;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String content2;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ext_txt;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link_from;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer sort;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String to_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer url_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SORT = integer;
    DEFAULT_URL_TYPE = integer;
  }
  
  public PbLinkInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.to_url;
      if (str2 == null) {
        this.to_url = "";
      } else {
        this.to_url = str2;
      } 
      str2 = paramBuilder.pic_url;
      if (str2 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str2;
      } 
      str2 = paramBuilder.link_from;
      if (str2 == null) {
        this.link_from = "";
      } else {
        this.link_from = str2;
      } 
      str2 = paramBuilder.ext_txt;
      if (str2 == null) {
        this.ext_txt = "";
      } else {
        this.ext_txt = str2;
      } 
      Integer integer = paramBuilder.sort;
      if (integer == null) {
        this.sort = DEFAULT_SORT;
      } else {
        this.sort = integer;
      } 
      integer = paramBuilder.url_type;
      if (integer == null) {
        this.url_type = DEFAULT_URL_TYPE;
      } else {
        this.url_type = integer;
      } 
      String str1 = paramBuilder.content1;
      if (str1 == null) {
        this.content1 = "";
      } else {
        this.content1 = str1;
      } 
      str = paramBuilder.content2;
      if (str == null) {
        this.content2 = "";
      } else {
        this.content2 = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.to_url = ((Builder)str).to_url;
      this.pic_url = ((Builder)str).pic_url;
      this.link_from = ((Builder)str).link_from;
      this.ext_txt = ((Builder)str).ext_txt;
      this.sort = ((Builder)str).sort;
      this.url_type = ((Builder)str).url_type;
      this.content1 = ((Builder)str).content1;
      this.content2 = ((Builder)str).content2;
    } 
  }
  
  public PbLinkInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbLinkInfo> {
    public String content1;
    
    public String content2;
    
    public String ext_txt;
    
    public String link_from;
    
    public String pic_url;
    
    public Integer sort;
    
    public String title;
    
    public String to_url;
    
    public Integer url_type;
    
    public Builder() {}
    
    public Builder(PbLinkInfo param1PbLinkInfo) {
      super(param1PbLinkInfo);
      if (param1PbLinkInfo == null)
        return; 
      this.title = param1PbLinkInfo.title;
      this.to_url = param1PbLinkInfo.to_url;
      this.pic_url = param1PbLinkInfo.pic_url;
      this.link_from = param1PbLinkInfo.link_from;
      this.ext_txt = param1PbLinkInfo.ext_txt;
      this.sort = param1PbLinkInfo.sort;
      this.url_type = param1PbLinkInfo.url_type;
      this.content1 = param1PbLinkInfo.content1;
      this.content2 = param1PbLinkInfo.content2;
    }
    
    public PbLinkInfo build(boolean param1Boolean) {
      return new PbLinkInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
