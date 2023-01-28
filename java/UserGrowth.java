package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class UserGrowth extends Message {
  public static final Integer DEFAULT_LEVEL_ID = Integer.valueOf(0);
  
  public static final Long DEFAULT_SCORE;
  
  public static final Long DEFAULT_TARGET_SCORE;
  
  public static final List<UserTaskInfo> DEFAULT_TASK_INFO;
  
  public static final Double DEFAULT_TMONEY = Double.valueOf(0.0D);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer level_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long score;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long target_score;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<UserTaskInfo> task_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
  public final Double tmoney;
  
  static {
    DEFAULT_TASK_INFO = Collections.emptyList();
  }
  
  public UserGrowth(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<UserTaskInfo> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.level_id;
      if (integer == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer;
      } 
      Long long_ = paramBuilder.score;
      if (long_ == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = long_;
      } 
      long_ = paramBuilder.target_score;
      if (long_ == null) {
        this.target_score = DEFAULT_TARGET_SCORE;
      } else {
        this.target_score = long_;
      } 
      Double double_ = paramBuilder.tmoney;
      if (double_ == null) {
        this.tmoney = DEFAULT_TMONEY;
      } else {
        this.tmoney = double_;
      } 
      list = paramBuilder.task_info;
      if (list == null) {
        this.task_info = DEFAULT_TASK_INFO;
      } else {
        this.task_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.level_id = ((Builder)list).level_id;
      this.score = ((Builder)list).score;
      this.target_score = ((Builder)list).target_score;
      this.tmoney = ((Builder)list).tmoney;
      this.task_info = Message.immutableCopyOf(((Builder)list).task_info);
    } 
  }
  
  public UserGrowth(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_SCORE = long_;
    DEFAULT_TARGET_SCORE = long_;
  }
  
  public static final class Builder extends Message.Builder<UserGrowth> {
    public Integer level_id;
    
    public Long score;
    
    public Long target_score;
    
    public List<UserTaskInfo> task_info;
    
    public Double tmoney;
    
    public Builder() {}
    
    public Builder(UserGrowth param1UserGrowth) {
      super(param1UserGrowth);
      if (param1UserGrowth == null)
        return; 
      this.level_id = param1UserGrowth.level_id;
      this.score = param1UserGrowth.score;
      this.target_score = param1UserGrowth.target_score;
      this.tmoney = param1UserGrowth.tmoney;
      this.task_info = Message.copyOf(param1UserGrowth.task_info);
    }
    
    public UserGrowth build(boolean param1Boolean) {
      return new UserGrowth(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
