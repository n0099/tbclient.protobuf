package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TaskInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BGIMG = "";
  
  public static final Long DEFAULT_END_TIME;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_OBJ_ID = "";
  
  public static final Long DEFAULT_START_TIME;
  
  public static final Long DEFAULT_TASK_ID;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_THREAD_IMG = "";
  
  public static final String DEFAULT_THREAD_IMG_SIZE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bgimg;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String obj_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long start_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long task_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String thread_img;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String thread_img_size;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(63767838, "Ltbclient/TaskInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(63767838, "Ltbclient/TaskInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TASK_ID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
    DEFAULT_FORUM_ID = long_;
  }
  
  public TaskInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.task_id;
      if (long_3 == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = long_3;
      } 
      long_3 = paramBuilder.thread_id;
      if (long_3 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_3;
      } 
      String str3 = paramBuilder.bgimg;
      if (str3 == null) {
        this.bgimg = "";
      } else {
        this.bgimg = str3;
      } 
      str3 = paramBuilder.thread_img;
      if (str3 == null) {
        this.thread_img = "";
      } else {
        this.thread_img = str3;
      } 
      Long long_2 = paramBuilder.start_time;
      if (long_2 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_2;
      } 
      long_2 = paramBuilder.end_time;
      if (long_2 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_2;
      } 
      String str2 = paramBuilder.thread_img_size;
      if (str2 == null) {
        this.thread_img_size = "";
      } else {
        this.thread_img_size = str2;
      } 
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str = paramBuilder.obj_id;
      if (str == null) {
        this.obj_id = "";
      } else {
        this.obj_id = str;
      } 
    } else {
      this.task_id = ((Builder)str).task_id;
      this.thread_id = ((Builder)str).thread_id;
      this.bgimg = ((Builder)str).bgimg;
      this.thread_img = ((Builder)str).thread_img;
      this.start_time = ((Builder)str).start_time;
      this.end_time = ((Builder)str).end_time;
      this.thread_img_size = ((Builder)str).thread_img_size;
      this.forum_id = ((Builder)str).forum_id;
      this.forum_name = ((Builder)str).forum_name;
      this.obj_id = ((Builder)str).obj_id;
    } 
  }
  
  public TaskInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TaskInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String bgimg;
    
    public Long end_time;
    
    public Long forum_id;
    
    public String forum_name;
    
    public String obj_id;
    
    public Long start_time;
    
    public Long task_id;
    
    public Long thread_id;
    
    public String thread_img;
    
    public String thread_img_size;
    
    public Builder() {}
    
    public Builder(TaskInfo param1TaskInfo) {
      super(param1TaskInfo);
      if (param1TaskInfo == null)
        return; 
      this.task_id = param1TaskInfo.task_id;
      this.thread_id = param1TaskInfo.thread_id;
      this.bgimg = param1TaskInfo.bgimg;
      this.thread_img = param1TaskInfo.thread_img;
      this.start_time = param1TaskInfo.start_time;
      this.end_time = param1TaskInfo.end_time;
      this.thread_img_size = param1TaskInfo.thread_img_size;
      this.forum_id = param1TaskInfo.forum_id;
      this.forum_name = param1TaskInfo.forum_name;
      this.obj_id = param1TaskInfo.obj_id;
    }
    
    public TaskInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TaskInfo)interceptResult.objValue; 
      } 
      return new TaskInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
