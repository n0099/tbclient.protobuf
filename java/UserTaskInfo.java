package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserTaskInfo extends Message {
  public static final String DEFAULT_ACT_TYPE = "";
  
  public static final String DEFAULT_BRIEF = "";
  
  public static final Integer DEFAULT_CURR_NUM;
  
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Integer DEFAULT_TARGET_NUM;
  
  public static final String DEFAULT_TARGET_SCHEME = "";
  
  public static final String DEFAULT_TASK_ICON_URL = "";
  
  public static final Integer DEFAULT_TASK_TYPE;
  
  public static final Integer DEFAULT_WEIGHT;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String act_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String brief;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer curr_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer target_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String target_scheme;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String task_icon_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer task_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer weight;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_STATUS = integer;
    DEFAULT_TARGET_NUM = integer;
    DEFAULT_CURR_NUM = integer;
    DEFAULT_TASK_TYPE = integer;
    DEFAULT_WEIGHT = integer;
  }
  
  public UserTaskInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.brief;
      if (str2 == null) {
        this.brief = "";
      } else {
        this.brief = str2;
      } 
      str2 = paramBuilder.task_icon_url;
      if (str2 == null) {
        this.task_icon_url = "";
      } else {
        this.task_icon_url = str2;
      } 
      Integer integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
      integer = paramBuilder.target_num;
      if (integer == null) {
        this.target_num = DEFAULT_TARGET_NUM;
      } else {
        this.target_num = integer;
      } 
      integer = paramBuilder.curr_num;
      if (integer == null) {
        this.curr_num = DEFAULT_CURR_NUM;
      } else {
        this.curr_num = integer;
      } 
      integer = paramBuilder.task_type;
      if (integer == null) {
        this.task_type = DEFAULT_TASK_TYPE;
      } else {
        this.task_type = integer;
      } 
      integer = paramBuilder.weight;
      if (integer == null) {
        this.weight = DEFAULT_WEIGHT;
      } else {
        this.weight = integer;
      } 
      String str1 = paramBuilder.act_type;
      if (str1 == null) {
        this.act_type = "";
      } else {
        this.act_type = str1;
      } 
      str = paramBuilder.target_scheme;
      if (str == null) {
        this.target_scheme = "";
      } else {
        this.target_scheme = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.brief = ((Builder)str).brief;
      this.task_icon_url = ((Builder)str).task_icon_url;
      this.status = ((Builder)str).status;
      this.target_num = ((Builder)str).target_num;
      this.curr_num = ((Builder)str).curr_num;
      this.task_type = ((Builder)str).task_type;
      this.weight = ((Builder)str).weight;
      this.act_type = ((Builder)str).act_type;
      this.target_scheme = ((Builder)str).target_scheme;
    } 
  }
  
  public UserTaskInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserTaskInfo> {
    public String act_type;
    
    public String brief;
    
    public Integer curr_num;
    
    public Long id;
    
    public String name;
    
    public Integer status;
    
    public Integer target_num;
    
    public String target_scheme;
    
    public String task_icon_url;
    
    public Integer task_type;
    
    public Integer weight;
    
    public Builder() {}
    
    public Builder(UserTaskInfo param1UserTaskInfo) {
      super(param1UserTaskInfo);
      if (param1UserTaskInfo == null)
        return; 
      this.id = param1UserTaskInfo.id;
      this.name = param1UserTaskInfo.name;
      this.brief = param1UserTaskInfo.brief;
      this.task_icon_url = param1UserTaskInfo.task_icon_url;
      this.status = param1UserTaskInfo.status;
      this.target_num = param1UserTaskInfo.target_num;
      this.curr_num = param1UserTaskInfo.curr_num;
      this.task_type = param1UserTaskInfo.task_type;
      this.weight = param1UserTaskInfo.weight;
      this.act_type = param1UserTaskInfo.act_type;
      this.target_scheme = param1UserTaskInfo.target_scheme;
    }
    
    public UserTaskInfo build(boolean param1Boolean) {
      return new UserTaskInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
