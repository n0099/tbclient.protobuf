package tbclient.DoDailyTask;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TaskInfoItem extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_FINISH;
  
  public static final Integer DEFAULT_SCORES;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_finish;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer scores;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1099832433, "Ltbclient/DoDailyTask/TaskInfoItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1099832433, "Ltbclient/DoDailyTask/TaskInfoItem;");
          return;
        } 
      } 
    } 
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
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
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
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TaskInfoItem)interceptResult.objValue; 
      } 
      return new TaskInfoItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
