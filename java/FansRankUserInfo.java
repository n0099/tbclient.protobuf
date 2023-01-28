package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FansRankUserInfo extends Message {
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_PRESENT_NUM;
  
  public static final String DEFAULT_PRESENT_SCORES = "";
  
  public static final Integer DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer present_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String present_scores;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_ID = integer;
    DEFAULT_PRESENT_NUM = integer;
  }
  
  public FansRankUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.user_id;
      if (integer2 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = integer2;
      } 
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      Integer integer1 = paramBuilder.present_num;
      if (integer1 == null) {
        this.present_num = DEFAULT_PRESENT_NUM;
      } else {
        this.present_num = integer1;
      } 
      String str1 = paramBuilder.present_scores;
      if (str1 == null) {
        this.present_scores = "";
      } else {
        this.present_scores = str1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.user_name = ((Builder)str).user_name;
      this.present_num = ((Builder)str).present_num;
      this.present_scores = ((Builder)str).present_scores;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  public FansRankUserInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FansRankUserInfo> {
    public String portrait;
    
    public Integer present_num;
    
    public String present_scores;
    
    public Integer user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(FansRankUserInfo param1FansRankUserInfo) {
      super(param1FansRankUserInfo);
      if (param1FansRankUserInfo == null)
        return; 
      this.user_id = param1FansRankUserInfo.user_id;
      this.user_name = param1FansRankUserInfo.user_name;
      this.present_num = param1FansRankUserInfo.present_num;
      this.present_scores = param1FansRankUserInfo.present_scores;
      this.portrait = param1FansRankUserInfo.portrait;
    }
    
    public FansRankUserInfo build(boolean param1Boolean) {
      return new FansRankUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
