package tbclient.AddMsgRecord;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MsgRecord extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TASK_IDS = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String task_ids;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  public MsgRecord(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.task_ids;
      if (str == null) {
        this.task_ids = "";
      } else {
        this.task_ids = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.task_ids = ((Builder)str).task_ids;
    } 
  }
  
  public MsgRecord(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(640015485, "Ltbclient/AddMsgRecord/MsgRecord;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(640015485, "Ltbclient/AddMsgRecord/MsgRecord;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<MsgRecord> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String task_ids;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(MsgRecord param1MsgRecord) {
      super(param1MsgRecord);
      if (param1MsgRecord == null)
        return; 
      this.type = param1MsgRecord.type;
      this.task_ids = param1MsgRecord.task_ids;
    }
    
    public MsgRecord build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (MsgRecord)interceptResult.objValue; 
      } 
      return new MsgRecord(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
