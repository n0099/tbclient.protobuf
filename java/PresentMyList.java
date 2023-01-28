package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PresentMyList extends Message {
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final String DEFAULT_CURRENCY_TYPE = "";
  
  public static final Integer DEFAULT_CURRENCY_UNIT;
  
  public static final Integer DEFAULT_GIFT_ID;
  
  public static final String DEFAULT_GIFT_NAME = "";
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final Integer DEFAULT_NUM;
  
  public static final Long DEFAULT_PAY_USERID;
  
  public static final String DEFAULT_PAY_USERNAME = "";
  
  public static final String DEFAULT_PLAY_URL = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_PRESENT_SCORES;
  
  public static final String DEFAULT_THUMBNAIL_URL = "";
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer create_time;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String currency_type;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer currency_unit;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer gift_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String gift_name;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer num;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long pay_userid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pay_username;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String play_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT64)
  public final Long present_scores;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String thumbnail_url;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_PAY_USERID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_GIFT_ID = integer;
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_NUM = integer;
    DEFAULT_CURRENCY_UNIT = integer;
    DEFAULT_PRESENT_SCORES = long_;
  }
  
  public PresentMyList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.pay_userid;
      if (long_2 == null) {
        this.pay_userid = DEFAULT_PAY_USERID;
      } else {
        this.pay_userid = long_2;
      } 
      String str3 = paramBuilder.pay_username;
      if (str3 == null) {
        this.pay_username = "";
      } else {
        this.pay_username = str3;
      } 
      str3 = paramBuilder.portrait;
      if (str3 == null) {
        this.portrait = "";
      } else {
        this.portrait = str3;
      } 
      Integer integer2 = paramBuilder.gift_id;
      if (integer2 == null) {
        this.gift_id = DEFAULT_GIFT_ID;
      } else {
        this.gift_id = integer2;
      } 
      String str2 = paramBuilder.gift_name;
      if (str2 == null) {
        this.gift_name = "";
      } else {
        this.gift_name = str2;
      } 
      str2 = paramBuilder.play_url;
      if (str2 == null) {
        this.play_url = "";
      } else {
        this.play_url = str2;
      } 
      str2 = paramBuilder.thumbnail_url;
      if (str2 == null) {
        this.thumbnail_url = "";
      } else {
        this.thumbnail_url = str2;
      } 
      Integer integer1 = paramBuilder.create_time;
      if (integer1 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer1;
      } 
      integer1 = paramBuilder.num;
      if (integer1 == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer1;
      } 
      integer1 = paramBuilder.currency_unit;
      if (integer1 == null) {
        this.currency_unit = DEFAULT_CURRENCY_UNIT;
      } else {
        this.currency_unit = integer1;
      } 
      String str1 = paramBuilder.currency_type;
      if (str1 == null) {
        this.currency_type = "";
      } else {
        this.currency_type = str1;
      } 
      Long long_1 = paramBuilder.present_scores;
      if (long_1 == null) {
        this.present_scores = DEFAULT_PRESENT_SCORES;
      } else {
        this.present_scores = long_1;
      } 
      str = paramBuilder.name_show;
      if (str == null) {
        this.name_show = "";
      } else {
        this.name_show = str;
      } 
    } else {
      this.pay_userid = ((Builder)str).pay_userid;
      this.pay_username = ((Builder)str).pay_username;
      this.portrait = ((Builder)str).portrait;
      this.gift_id = ((Builder)str).gift_id;
      this.gift_name = ((Builder)str).gift_name;
      this.play_url = ((Builder)str).play_url;
      this.thumbnail_url = ((Builder)str).thumbnail_url;
      this.create_time = ((Builder)str).create_time;
      this.num = ((Builder)str).num;
      this.currency_unit = ((Builder)str).currency_unit;
      this.currency_type = ((Builder)str).currency_type;
      this.present_scores = ((Builder)str).present_scores;
      this.name_show = ((Builder)str).name_show;
    } 
  }
  
  public PresentMyList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PresentMyList> {
    public Integer create_time;
    
    public String currency_type;
    
    public Integer currency_unit;
    
    public Integer gift_id;
    
    public String gift_name;
    
    public String name_show;
    
    public Integer num;
    
    public Long pay_userid;
    
    public String pay_username;
    
    public String play_url;
    
    public String portrait;
    
    public Long present_scores;
    
    public String thumbnail_url;
    
    public Builder() {}
    
    public Builder(PresentMyList param1PresentMyList) {
      super(param1PresentMyList);
      if (param1PresentMyList == null)
        return; 
      this.pay_userid = param1PresentMyList.pay_userid;
      this.pay_username = param1PresentMyList.pay_username;
      this.portrait = param1PresentMyList.portrait;
      this.gift_id = param1PresentMyList.gift_id;
      this.gift_name = param1PresentMyList.gift_name;
      this.play_url = param1PresentMyList.play_url;
      this.thumbnail_url = param1PresentMyList.thumbnail_url;
      this.create_time = param1PresentMyList.create_time;
      this.num = param1PresentMyList.num;
      this.currency_unit = param1PresentMyList.currency_unit;
      this.currency_type = param1PresentMyList.currency_type;
      this.present_scores = param1PresentMyList.present_scores;
      this.name_show = param1PresentMyList.name_show;
    }
    
    public PresentMyList build(boolean param1Boolean) {
      return new PresentMyList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
