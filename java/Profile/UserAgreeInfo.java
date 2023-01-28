package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserAgreeInfo extends Message {
  public static final Long DEFAULT_ALA_AGREE_NUM;
  
  public static final Integer DEFAULT_HAS_USER_AGREE;
  
  public static final Long DEFAULT_NORMAL_AGREE_NUM;
  
  public static final Long DEFAULT_TOTAL_AGREE_NUM;
  
  public static final Long DEFAULT_USER_AGREE_NUM;
  
  public static final Long DEFAULT_VIDEO_AGREE_NUM;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long ala_agree_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer has_user_agree;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long normal_agree_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long total_agree_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long user_agree_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long video_agree_num;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOTAL_AGREE_NUM = long_;
    DEFAULT_NORMAL_AGREE_NUM = long_;
    DEFAULT_USER_AGREE_NUM = long_;
    DEFAULT_VIDEO_AGREE_NUM = long_;
    DEFAULT_ALA_AGREE_NUM = long_;
    DEFAULT_HAS_USER_AGREE = Integer.valueOf(0);
  }
  
  public UserAgreeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.total_agree_num;
      if (long_ == null) {
        this.total_agree_num = DEFAULT_TOTAL_AGREE_NUM;
      } else {
        this.total_agree_num = long_;
      } 
      long_ = paramBuilder.normal_agree_num;
      if (long_ == null) {
        this.normal_agree_num = DEFAULT_NORMAL_AGREE_NUM;
      } else {
        this.normal_agree_num = long_;
      } 
      long_ = paramBuilder.user_agree_num;
      if (long_ == null) {
        this.user_agree_num = DEFAULT_USER_AGREE_NUM;
      } else {
        this.user_agree_num = long_;
      } 
      long_ = paramBuilder.video_agree_num;
      if (long_ == null) {
        this.video_agree_num = DEFAULT_VIDEO_AGREE_NUM;
      } else {
        this.video_agree_num = long_;
      } 
      long_ = paramBuilder.ala_agree_num;
      if (long_ == null) {
        this.ala_agree_num = DEFAULT_ALA_AGREE_NUM;
      } else {
        this.ala_agree_num = long_;
      } 
      integer = paramBuilder.has_user_agree;
      if (integer == null) {
        this.has_user_agree = DEFAULT_HAS_USER_AGREE;
      } else {
        this.has_user_agree = integer;
      } 
    } else {
      this.total_agree_num = ((Builder)integer).total_agree_num;
      this.normal_agree_num = ((Builder)integer).normal_agree_num;
      this.user_agree_num = ((Builder)integer).user_agree_num;
      this.video_agree_num = ((Builder)integer).video_agree_num;
      this.ala_agree_num = ((Builder)integer).ala_agree_num;
      this.has_user_agree = ((Builder)integer).has_user_agree;
    } 
  }
  
  public UserAgreeInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserAgreeInfo> {
    public Long ala_agree_num;
    
    public Integer has_user_agree;
    
    public Long normal_agree_num;
    
    public Long total_agree_num;
    
    public Long user_agree_num;
    
    public Long video_agree_num;
    
    public Builder() {}
    
    public Builder(UserAgreeInfo param1UserAgreeInfo) {
      super(param1UserAgreeInfo);
      if (param1UserAgreeInfo == null)
        return; 
      this.total_agree_num = param1UserAgreeInfo.total_agree_num;
      this.normal_agree_num = param1UserAgreeInfo.normal_agree_num;
      this.user_agree_num = param1UserAgreeInfo.user_agree_num;
      this.video_agree_num = param1UserAgreeInfo.video_agree_num;
      this.ala_agree_num = param1UserAgreeInfo.ala_agree_num;
      this.has_user_agree = param1UserAgreeInfo.has_user_agree;
    }
    
    public UserAgreeInfo build(boolean param1Boolean) {
      return new UserAgreeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
