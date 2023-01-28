package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StarTaskInfo extends Message {
  public static final String DEFAULT_TASK_DESC = "";
  
  public static final String DEFAULT_TASK_SCORE_DESC = "";
  
  public static final Integer DEFAULT_TASK_STATUS = Integer.valueOf(0);
  
  public static final String DEFAULT_TASK_TITLE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String task_desc;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String task_score_desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer task_status;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String task_title;
  
  public StarTaskInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.task_title;
      if (str == null) {
        this.task_title = "";
      } else {
        this.task_title = str;
      } 
      str = paramBuilder.task_desc;
      if (str == null) {
        this.task_desc = "";
      } else {
        this.task_desc = str;
      } 
      str = paramBuilder.task_score_desc;
      if (str == null) {
        this.task_score_desc = "";
      } else {
        this.task_score_desc = str;
      } 
      integer = paramBuilder.task_status;
      if (integer == null) {
        this.task_status = DEFAULT_TASK_STATUS;
      } else {
        this.task_status = integer;
      } 
    } else {
      this.task_title = ((Builder)integer).task_title;
      this.task_desc = ((Builder)integer).task_desc;
      this.task_score_desc = ((Builder)integer).task_score_desc;
      this.task_status = ((Builder)integer).task_status;
    } 
  }
  
  public StarTaskInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StarTaskInfo> {
    public String task_desc;
    
    public String task_score_desc;
    
    public Integer task_status;
    
    public String task_title;
    
    public Builder() {}
    
    public Builder(StarTaskInfo param1StarTaskInfo) {
      super(param1StarTaskInfo);
      if (param1StarTaskInfo == null)
        return; 
      this.task_title = param1StarTaskInfo.task_title;
      this.task_desc = param1StarTaskInfo.task_desc;
      this.task_score_desc = param1StarTaskInfo.task_score_desc;
      this.task_status = param1StarTaskInfo.task_status;
    }
    
    public StarTaskInfo build(boolean param1Boolean) {
      return new StarTaskInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
