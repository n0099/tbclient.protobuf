package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ExcContent extends Message {
  public static final Integer DEFAULT_ALIGN;
  
  public static final String DEFAULT_BIG_CDN_SRC = "";
  
  public static final String DEFAULT_BIG_SIZE = "";
  
  public static final String DEFAULT_BIG_SRC = "";
  
  public static final String DEFAULT_BSIZE = "";
  
  public static final String DEFAULT_C = "";
  
  public static final String DEFAULT_CDN_SRC = "";
  
  public static final String DEFAULT_COLOR = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_SIZE;
  
  public static final String DEFAULT_SRC = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final Long DEFAULT_TYPE = Long.valueOf(0L);
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer align;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String big_cdn_src;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String big_size;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String big_src;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String bsize;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String c;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String cdn_src;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer size;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String src;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ALIGN = integer;
    DEFAULT_SIZE = integer;
  }
  
  public ExcContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.type;
      if (long_ == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = long_;
      } 
      String str2 = paramBuilder.text;
      if (str2 == null) {
        this.text = "";
      } else {
        this.text = str2;
      } 
      str2 = paramBuilder.link;
      if (str2 == null) {
        this.link = "";
      } else {
        this.link = str2;
      } 
      str2 = paramBuilder.src;
      if (str2 == null) {
        this.src = "";
      } else {
        this.src = str2;
      } 
      str2 = paramBuilder.bsize;
      if (str2 == null) {
        this.bsize = "";
      } else {
        this.bsize = str2;
      } 
      str2 = paramBuilder.big_src;
      if (str2 == null) {
        this.big_src = "";
      } else {
        this.big_src = str2;
      } 
      str2 = paramBuilder.big_size;
      if (str2 == null) {
        this.big_size = "";
      } else {
        this.big_size = str2;
      } 
      str2 = paramBuilder.cdn_src;
      if (str2 == null) {
        this.cdn_src = "";
      } else {
        this.cdn_src = str2;
      } 
      str2 = paramBuilder.big_cdn_src;
      if (str2 == null) {
        this.big_cdn_src = "";
      } else {
        this.big_cdn_src = str2;
      } 
      str2 = paramBuilder.c;
      if (str2 == null) {
        this.c = "";
      } else {
        this.c = str2;
      } 
      Integer integer1 = paramBuilder.align;
      if (integer1 == null) {
        this.align = DEFAULT_ALIGN;
      } else {
        this.align = integer1;
      } 
      String str1 = paramBuilder.color;
      if (str1 == null) {
        this.color = "";
      } else {
        this.color = str1;
      } 
      integer = paramBuilder.size;
      if (integer == null) {
        this.size = DEFAULT_SIZE;
      } else {
        this.size = integer;
      } 
    } else {
      this.type = ((Builder)integer).type;
      this.text = ((Builder)integer).text;
      this.link = ((Builder)integer).link;
      this.src = ((Builder)integer).src;
      this.bsize = ((Builder)integer).bsize;
      this.big_src = ((Builder)integer).big_src;
      this.big_size = ((Builder)integer).big_size;
      this.cdn_src = ((Builder)integer).cdn_src;
      this.big_cdn_src = ((Builder)integer).big_cdn_src;
      this.c = ((Builder)integer).c;
      this.align = ((Builder)integer).align;
      this.color = ((Builder)integer).color;
      this.size = ((Builder)integer).size;
    } 
  }
  
  public ExcContent(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ExcContent> {
    public Integer align;
    
    public String big_cdn_src;
    
    public String big_size;
    
    public String big_src;
    
    public String bsize;
    
    public String c;
    
    public String cdn_src;
    
    public String color;
    
    public String link;
    
    public Integer size;
    
    public String src;
    
    public String text;
    
    public Long type;
    
    public Builder() {}
    
    public Builder(ExcContent param1ExcContent) {
      super(param1ExcContent);
      if (param1ExcContent == null)
        return; 
      this.type = param1ExcContent.type;
      this.text = param1ExcContent.text;
      this.link = param1ExcContent.link;
      this.src = param1ExcContent.src;
      this.bsize = param1ExcContent.bsize;
      this.big_src = param1ExcContent.big_src;
      this.big_size = param1ExcContent.big_size;
      this.cdn_src = param1ExcContent.cdn_src;
      this.big_cdn_src = param1ExcContent.big_cdn_src;
      this.c = param1ExcContent.c;
      this.align = param1ExcContent.align;
      this.color = param1ExcContent.color;
      this.size = param1ExcContent.size;
    }
    
    public ExcContent build(boolean param1Boolean) {
      return new ExcContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
