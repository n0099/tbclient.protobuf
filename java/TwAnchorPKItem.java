package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TwAnchorPKItem extends Message {
  public static final String DEFAULT_FANS_NUM = "";
  
  public static final String DEFAULT_HEAD_URL = "";
  
  public static final String DEFAULT_ORDER = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final Integer DEFAULT_USER_SEX = Integer.valueOf(0);
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String fans_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String head_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String order;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer user_sex;
  
  public TwAnchorPKItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.order;
      if (str2 == null) {
        this.order = "";
      } else {
        this.order = str2;
      } 
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str1 = paramBuilder.head_url;
      if (str1 == null) {
        this.head_url = "";
      } else {
        this.head_url = str1;
      } 
      str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      str1 = paramBuilder.fans_num;
      if (str1 == null) {
        this.fans_num = "";
      } else {
        this.fans_num = str1;
      } 
      integer = paramBuilder.user_sex;
      if (integer == null) {
        this.user_sex = DEFAULT_USER_SEX;
      } else {
        this.user_sex = integer;
      } 
    } else {
      this.order = ((Builder)integer).order;
      this.user_id = ((Builder)integer).user_id;
      this.head_url = ((Builder)integer).head_url;
      this.user_name = ((Builder)integer).user_name;
      this.fans_num = ((Builder)integer).fans_num;
      this.user_sex = ((Builder)integer).user_sex;
    } 
  }
  
  public TwAnchorPKItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TwAnchorPKItem> {
    public String fans_num;
    
    public String head_url;
    
    public String order;
    
    public Long user_id;
    
    public String user_name;
    
    public Integer user_sex;
    
    public Builder() {}
    
    public Builder(TwAnchorPKItem param1TwAnchorPKItem) {
      super(param1TwAnchorPKItem);
      if (param1TwAnchorPKItem == null)
        return; 
      this.order = param1TwAnchorPKItem.order;
      this.user_id = param1TwAnchorPKItem.user_id;
      this.head_url = param1TwAnchorPKItem.head_url;
      this.user_name = param1TwAnchorPKItem.user_name;
      this.fans_num = param1TwAnchorPKItem.fans_num;
      this.user_sex = param1TwAnchorPKItem.user_sex;
    }
    
    public TwAnchorPKItem build(boolean param1Boolean) {
      return new TwAnchorPKItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
