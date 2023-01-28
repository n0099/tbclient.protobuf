package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumDataCenter extends Message {
  public static final Integer DEFAULT_HOMEPAGE_THREAD_CNT;
  
  public static final Integer DEFAULT_HOMEPAGE_THREAD_CNT_DIFF;
  
  public static final Integer DEFAULT_NEW_FOLLOW_CNT;
  
  public static final Integer DEFAULT_NEW_FOLLOW_CNT_DIFF;
  
  public static final Integer DEFAULT_NEW_PV_CNT;
  
  public static final Integer DEFAULT_NEW_PV_CNT_DIFF;
  
  public static final Integer DEFAULT_NEW_THREAD_CNT;
  
  public static final Integer DEFAULT_NEW_THREAD_CNT_DIFF;
  
  public static final Integer DEFAULT_USER_DURATION_AVG;
  
  public static final Double DEFAULT_USER_DURATION_AVG_DIFF;
  
  public static final Double DEFAULT_USER_SIGN_RATE;
  
  public static final Double DEFAULT_USER_SIGN_RATE_DIFF;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer homepage_thread_cnt;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer homepage_thread_cnt_diff;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer new_follow_cnt;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer new_follow_cnt_diff;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer new_pv_cnt;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer new_pv_cnt_diff;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer new_thread_cnt;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer new_thread_cnt_diff;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer user_duration_avg;
  
  @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
  public final Double user_duration_avg_diff;
  
  @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
  public final Double user_sign_rate;
  
  @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
  public final Double user_sign_rate_diff;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_NEW_PV_CNT = integer;
    DEFAULT_NEW_PV_CNT_DIFF = integer;
    DEFAULT_NEW_THREAD_CNT = integer;
    DEFAULT_NEW_THREAD_CNT_DIFF = integer;
    DEFAULT_NEW_FOLLOW_CNT = integer;
    DEFAULT_NEW_FOLLOW_CNT_DIFF = integer;
    DEFAULT_USER_DURATION_AVG = integer;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_USER_DURATION_AVG_DIFF = double_;
    DEFAULT_USER_SIGN_RATE = double_;
    DEFAULT_USER_SIGN_RATE_DIFF = double_;
    DEFAULT_HOMEPAGE_THREAD_CNT = integer;
    DEFAULT_HOMEPAGE_THREAD_CNT_DIFF = integer;
  }
  
  public ForumDataCenter(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.new_pv_cnt;
      if (integer2 == null) {
        this.new_pv_cnt = DEFAULT_NEW_PV_CNT;
      } else {
        this.new_pv_cnt = integer2;
      } 
      integer2 = paramBuilder.new_pv_cnt_diff;
      if (integer2 == null) {
        this.new_pv_cnt_diff = DEFAULT_NEW_PV_CNT_DIFF;
      } else {
        this.new_pv_cnt_diff = integer2;
      } 
      integer2 = paramBuilder.new_thread_cnt;
      if (integer2 == null) {
        this.new_thread_cnt = DEFAULT_NEW_THREAD_CNT;
      } else {
        this.new_thread_cnt = integer2;
      } 
      integer2 = paramBuilder.new_thread_cnt_diff;
      if (integer2 == null) {
        this.new_thread_cnt_diff = DEFAULT_NEW_THREAD_CNT_DIFF;
      } else {
        this.new_thread_cnt_diff = integer2;
      } 
      integer2 = paramBuilder.new_follow_cnt;
      if (integer2 == null) {
        this.new_follow_cnt = DEFAULT_NEW_FOLLOW_CNT;
      } else {
        this.new_follow_cnt = integer2;
      } 
      integer2 = paramBuilder.new_follow_cnt_diff;
      if (integer2 == null) {
        this.new_follow_cnt_diff = DEFAULT_NEW_FOLLOW_CNT_DIFF;
      } else {
        this.new_follow_cnt_diff = integer2;
      } 
      integer2 = paramBuilder.user_duration_avg;
      if (integer2 == null) {
        this.user_duration_avg = DEFAULT_USER_DURATION_AVG;
      } else {
        this.user_duration_avg = integer2;
      } 
      Double double_ = paramBuilder.user_duration_avg_diff;
      if (double_ == null) {
        this.user_duration_avg_diff = DEFAULT_USER_DURATION_AVG_DIFF;
      } else {
        this.user_duration_avg_diff = double_;
      } 
      double_ = paramBuilder.user_sign_rate;
      if (double_ == null) {
        this.user_sign_rate = DEFAULT_USER_SIGN_RATE;
      } else {
        this.user_sign_rate = double_;
      } 
      double_ = paramBuilder.user_sign_rate_diff;
      if (double_ == null) {
        this.user_sign_rate_diff = DEFAULT_USER_SIGN_RATE_DIFF;
      } else {
        this.user_sign_rate_diff = double_;
      } 
      Integer integer1 = paramBuilder.homepage_thread_cnt;
      if (integer1 == null) {
        this.homepage_thread_cnt = DEFAULT_HOMEPAGE_THREAD_CNT;
      } else {
        this.homepage_thread_cnt = integer1;
      } 
      integer = paramBuilder.homepage_thread_cnt_diff;
      if (integer == null) {
        this.homepage_thread_cnt_diff = DEFAULT_HOMEPAGE_THREAD_CNT_DIFF;
      } else {
        this.homepage_thread_cnt_diff = integer;
      } 
    } else {
      this.new_pv_cnt = ((Builder)integer).new_pv_cnt;
      this.new_pv_cnt_diff = ((Builder)integer).new_pv_cnt_diff;
      this.new_thread_cnt = ((Builder)integer).new_thread_cnt;
      this.new_thread_cnt_diff = ((Builder)integer).new_thread_cnt_diff;
      this.new_follow_cnt = ((Builder)integer).new_follow_cnt;
      this.new_follow_cnt_diff = ((Builder)integer).new_follow_cnt_diff;
      this.user_duration_avg = ((Builder)integer).user_duration_avg;
      this.user_duration_avg_diff = ((Builder)integer).user_duration_avg_diff;
      this.user_sign_rate = ((Builder)integer).user_sign_rate;
      this.user_sign_rate_diff = ((Builder)integer).user_sign_rate_diff;
      this.homepage_thread_cnt = ((Builder)integer).homepage_thread_cnt;
      this.homepage_thread_cnt_diff = ((Builder)integer).homepage_thread_cnt_diff;
    } 
  }
  
  public ForumDataCenter(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumDataCenter> {
    public Integer homepage_thread_cnt;
    
    public Integer homepage_thread_cnt_diff;
    
    public Integer new_follow_cnt;
    
    public Integer new_follow_cnt_diff;
    
    public Integer new_pv_cnt;
    
    public Integer new_pv_cnt_diff;
    
    public Integer new_thread_cnt;
    
    public Integer new_thread_cnt_diff;
    
    public Integer user_duration_avg;
    
    public Double user_duration_avg_diff;
    
    public Double user_sign_rate;
    
    public Double user_sign_rate_diff;
    
    public Builder() {}
    
    public Builder(ForumDataCenter param1ForumDataCenter) {
      super(param1ForumDataCenter);
      if (param1ForumDataCenter == null)
        return; 
      this.new_pv_cnt = param1ForumDataCenter.new_pv_cnt;
      this.new_pv_cnt_diff = param1ForumDataCenter.new_pv_cnt_diff;
      this.new_thread_cnt = param1ForumDataCenter.new_thread_cnt;
      this.new_thread_cnt_diff = param1ForumDataCenter.new_thread_cnt_diff;
      this.new_follow_cnt = param1ForumDataCenter.new_follow_cnt;
      this.new_follow_cnt_diff = param1ForumDataCenter.new_follow_cnt_diff;
      this.user_duration_avg = param1ForumDataCenter.user_duration_avg;
      this.user_duration_avg_diff = param1ForumDataCenter.user_duration_avg_diff;
      this.user_sign_rate = param1ForumDataCenter.user_sign_rate;
      this.user_sign_rate_diff = param1ForumDataCenter.user_sign_rate_diff;
      this.homepage_thread_cnt = param1ForumDataCenter.homepage_thread_cnt;
      this.homepage_thread_cnt_diff = param1ForumDataCenter.homepage_thread_cnt_diff;
    }
    
    public ForumDataCenter build(boolean param1Boolean) {
      return new ForumDataCenter(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
