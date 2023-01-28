package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Promotion extends Message {
  public static final Long DEFAULT_APPEAR_TIME = Long.valueOf(0L);
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_LINK_TEXT = "";
  
  public static final String DEFAULT_SUB_TITLE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long appear_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String link_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sub_title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public Promotion(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.sub_title;
      if (str == null) {
        this.sub_title = "";
      } else {
        this.sub_title = str;
      } 
      str = paramBuilder.image;
      if (str == null) {
        this.image = "";
      } else {
        this.image = str;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
      str = paramBuilder.link_text;
      if (str == null) {
        this.link_text = "";
      } else {
        this.link_text = str;
      } 
      long_ = paramBuilder.appear_time;
      if (long_ == null) {
        this.appear_time = DEFAULT_APPEAR_TIME;
      } else {
        this.appear_time = long_;
      } 
    } else {
      this.title = ((Builder)long_).title;
      this.sub_title = ((Builder)long_).sub_title;
      this.image = ((Builder)long_).image;
      this.link = ((Builder)long_).link;
      this.link_text = ((Builder)long_).link_text;
      this.appear_time = ((Builder)long_).appear_time;
    } 
  }
  
  public Promotion(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Promotion> {
    public Long appear_time;
    
    public String image;
    
    public String link;
    
    public String link_text;
    
    public String sub_title;
    
    public String title;
    
    public Builder() {}
    
    public Builder(Promotion param1Promotion) {
      super(param1Promotion);
      if (param1Promotion == null)
        return; 
      this.title = param1Promotion.title;
      this.sub_title = param1Promotion.sub_title;
      this.image = param1Promotion.image;
      this.link = param1Promotion.link;
      this.link_text = param1Promotion.link_text;
      this.appear_time = param1Promotion.appear_time;
    }
    
    public Promotion build(boolean param1Boolean) {
      return new Promotion(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
