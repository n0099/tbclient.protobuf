package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserPointInfo extends Message {
  public static final Long DEFAULT_POINTS_TOTAL = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long points_total;
  
  public UserPointInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      long_ = paramBuilder.points_total;
      if (long_ == null) {
        this.points_total = DEFAULT_POINTS_TOTAL;
      } else {
        this.points_total = long_;
      } 
    } else {
      this.points_total = ((Builder)long_).points_total;
    } 
  }
  
  public UserPointInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserPointInfo> {
    public Long points_total;
    
    public Builder() {}
    
    public Builder(UserPointInfo param1UserPointInfo) {
      super(param1UserPointInfo);
      if (param1UserPointInfo == null)
        return; 
      this.points_total = param1UserPointInfo.points_total;
    }
    
    public UserPointInfo build(boolean param1Boolean) {
      return new UserPointInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
