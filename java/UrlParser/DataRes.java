package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CardLinkInfo;

public final class DataRes extends Message {
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final Integer DEFAULT_IS_RECOGNIZE;
  
  public static final String DEFAULT_LINK_FROM = "";
  
  public static final String DEFAULT_PRICE_TXT = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_URL_TYPE;
  
  @ProtoField(tag = 9)
  public final CardLinkInfo card_link_info;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer is_recognize;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link_from;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String price_txt;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer url_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_URL_TYPE = integer;
    DEFAULT_STATUS = integer;
    DEFAULT_IS_RECOGNIZE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.url_type;
      if (integer2 == null) {
        this.url_type = DEFAULT_URL_TYPE;
      } else {
        this.url_type = integer2;
      } 
      integer2 = paramBuilder.status;
      if (integer2 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer2;
      } 
      String str2 = paramBuilder.image;
      if (str2 == null) {
        this.image = "";
      } else {
        this.image = str2;
      } 
      str2 = paramBuilder.link_from;
      if (str2 == null) {
        this.link_from = "";
      } else {
        this.link_from = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.price_txt;
      if (str2 == null) {
        this.price_txt = "";
      } else {
        this.price_txt = str2;
      } 
      Integer integer1 = paramBuilder.is_recognize;
      if (integer1 == null) {
        this.is_recognize = DEFAULT_IS_RECOGNIZE;
      } else {
        this.is_recognize = integer1;
      } 
      String str1 = paramBuilder.description;
      if (str1 == null) {
        this.description = "";
      } else {
        this.description = str1;
      } 
      this.card_link_info = paramBuilder.card_link_info;
    } else {
      this.url_type = paramBuilder.url_type;
      this.status = paramBuilder.status;
      this.image = paramBuilder.image;
      this.link_from = paramBuilder.link_from;
      this.title = paramBuilder.title;
      this.price_txt = paramBuilder.price_txt;
      this.is_recognize = paramBuilder.is_recognize;
      this.description = paramBuilder.description;
      this.card_link_info = paramBuilder.card_link_info;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public CardLinkInfo card_link_info;
    
    public String description;
    
    public String image;
    
    public Integer is_recognize;
    
    public String link_from;
    
    public String price_txt;
    
    public Integer status;
    
    public String title;
    
    public Integer url_type;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.url_type = param1DataRes.url_type;
      this.status = param1DataRes.status;
      this.image = param1DataRes.image;
      this.link_from = param1DataRes.link_from;
      this.title = param1DataRes.title;
      this.price_txt = param1DataRes.price_txt;
      this.is_recognize = param1DataRes.is_recognize;
      this.description = param1DataRes.description;
      this.card_link_info = param1DataRes.card_link_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
