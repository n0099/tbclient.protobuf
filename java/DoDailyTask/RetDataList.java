package tbclient.DoDailyTask;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RetDataList extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_NEED_DIALOG = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final DialogItem dialog;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer need_dialog;
  
  @ProtoField(tag = 2)
  public final TaskInfoItem task_info;
  
  public RetDataList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.dialog = paramBuilder.dialog;
      this.task_info = paramBuilder.task_info;
      integer = paramBuilder.need_dialog;
      if (integer == null) {
        this.need_dialog = DEFAULT_NEED_DIALOG;
      } else {
        this.need_dialog = integer;
      } 
    } else {
      this.dialog = ((Builder)integer).dialog;
      this.task_info = ((Builder)integer).task_info;
      this.need_dialog = ((Builder)integer).need_dialog;
    } 
  }
  
  public RetDataList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1862343384, "Ltbclient/DoDailyTask/RetDataList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1862343384, "Ltbclient/DoDailyTask/RetDataList;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<RetDataList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public DialogItem dialog;
    
    public Integer need_dialog;
    
    public TaskInfoItem task_info;
    
    public Builder() {}
    
    public Builder(RetDataList param1RetDataList) {
      super(param1RetDataList);
      if (param1RetDataList == null)
        return; 
      this.dialog = param1RetDataList.dialog;
      this.task_info = param1RetDataList.task_info;
      this.need_dialog = param1RetDataList.need_dialog;
    }
    
    public RetDataList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RetDataList)interceptResult.objValue; 
      } 
      return new RetDataList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
