package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Quote extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_IP = "";
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ip;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long post_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_POST_ID = long_;
    DEFAULT_USER_ID = long_;
  }
  
  public Quote(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.post_id;
      if (long_2 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_2;
      } 
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      Long long_1 = paramBuilder.user_id;
      if (long_1 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_1;
      } 
      String str1 = paramBuilder.ip;
      if (str1 == null) {
        this.ip = "";
      } else {
        this.ip = str1;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.post_id = ((Builder)str).post_id;
      this.user_name = ((Builder)str).user_name;
      this.user_id = ((Builder)str).user_id;
      this.ip = ((Builder)str).ip;
      this.content = ((Builder)str).content;
    } 
  }
  
  public Quote(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Quote> {
    public String content;
    
    public String ip;
    
    public Long post_id;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(Quote param1Quote) {
      super(param1Quote);
      if (param1Quote == null)
        return; 
      this.post_id = param1Quote.post_id;
      this.user_name = param1Quote.user_name;
      this.user_id = param1Quote.user_id;
      this.ip = param1Quote.ip;
      this.content = param1Quote.content;
    }
    
    public Quote build(boolean param1Boolean) {
      return new Quote(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
