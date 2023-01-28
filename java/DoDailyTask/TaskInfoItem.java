package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TaskInfoItem extends Message {
  public static final Integer DEFAULT_IS_FINISH;
  
  public static final Integer DEFAULT_SCORES;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_finish;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer scores;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_FINISH = integer;
    DEFAULT_SCORES = integer;
  }
  
  public TaskInfoItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_finish;
      if (integer1 == null) {
        this.is_finish = DEFAULT_IS_FINISH;
      } else {
        this.is_finish = integer1;
      } 
      integer = paramBuilder.scores;
      if (integer == null) {
        this.scores = DEFAULT_SCORES;
      } else {
        this.scores = integer;
      } 
    } else {
      this.is_finish = ((Builder)integer).is_finish;
      this.scores = ((Builder)integer).scores;
    } 
  }
  
  public TaskInfoItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TaskInfoItem> {
    public Integer is_finish;
    
    public Integer scores;
    
    public Builder() {}
    
    public Builder(TaskInfoItem param1TaskInfoItem) {
      super(param1TaskInfoItem);
      if (param1TaskInfoItem == null)
        return; 
      this.is_finish = param1TaskInfoItem.is_finish;
      this.scores = param1TaskInfoItem.scores;
    }
    
    public TaskInfoItem build(boolean param1Boolean) {
      return new TaskInfoItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
