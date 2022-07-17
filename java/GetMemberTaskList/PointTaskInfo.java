package tbclient.GetMemberTaskList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PointTaskInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_FINISH;
  
  public static final Integer DEFAULT_POINTS_ADD;
  
  public static final Long DEFAULT_TASK_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TASK_INTRO = "";
  
  public static final String DEFAULT_TASK_NAME = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_finish;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer points_add;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long task_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String task_intro;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String task_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_FINISH = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_POINTS_ADD = integer;
  }
  
  public PointTaskInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.task_id;
      if (long_ == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = long_;
      } 
      String str = paramBuilder.task_name;
      if (str == null) {
        this.task_name = "";
      } else {
        this.task_name = str;
      } 
      str = paramBuilder.task_intro;
      if (str == null) {
        this.task_intro = "";
      } else {
        this.task_intro = str;
      } 
      Integer integer1 = paramBuilder.is_finish;
      if (integer1 == null) {
        this.is_finish = DEFAULT_IS_FINISH;
      } else {
        this.is_finish = integer1;
      } 
      integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      integer = paramBuilder.points_add;
      if (integer == null) {
        this.points_add = DEFAULT_POINTS_ADD;
      } else {
        this.points_add = integer;
      } 
    } else {
      this.task_id = ((Builder)integer).task_id;
      this.task_name = ((Builder)integer).task_name;
      this.task_intro = ((Builder)integer).task_intro;
      this.is_finish = ((Builder)integer).is_finish;
      this.type = ((Builder)integer).type;
      this.points_add = ((Builder)integer).points_add;
    } 
  }
  
  public PointTaskInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-141165506, "Ltbclient/GetMemberTaskList/PointTaskInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-141165506, "Ltbclient/GetMemberTaskList/PointTaskInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<PointTaskInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer is_finish;
    
    public Integer points_add;
    
    public Long task_id;
    
    public String task_intro;
    
    public String task_name;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(PointTaskInfo param1PointTaskInfo) {
      super(param1PointTaskInfo);
      if (param1PointTaskInfo == null)
        return; 
      this.task_id = param1PointTaskInfo.task_id;
      this.task_name = param1PointTaskInfo.task_name;
      this.task_intro = param1PointTaskInfo.task_intro;
      this.is_finish = param1PointTaskInfo.is_finish;
      this.type = param1PointTaskInfo.type;
      this.points_add = param1PointTaskInfo.points_add;
    }
    
    public PointTaskInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PointTaskInfo)interceptResult.objValue; 
      } 
      return new PointTaskInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
