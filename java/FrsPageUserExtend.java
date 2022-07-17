package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FrsPageUserExtend extends Message {
  public static Interceptable $ic;
  
  public static final List<User> DEFAULT_DATA;
  
  public static final String DEFAULT_TIPS = "";
  
  public static final Integer DEFAULT_USER_EXTEND_STOREY = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<User> data;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tips;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer user_extend_storey;
  
  static {
    DEFAULT_DATA = Collections.emptyList();
  }
  
  public FrsPageUserExtend(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<User> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.user_extend_storey;
      if (integer == null) {
        this.user_extend_storey = DEFAULT_USER_EXTEND_STOREY;
      } else {
        this.user_extend_storey = integer;
      } 
      String str = paramBuilder.tips;
      if (str == null) {
        this.tips = "";
      } else {
        this.tips = str;
      } 
      list = paramBuilder.data;
      if (list == null) {
        this.data = DEFAULT_DATA;
      } else {
        this.data = Message.immutableCopyOf(list);
      } 
    } else {
      this.user_extend_storey = ((Builder)list).user_extend_storey;
      this.tips = ((Builder)list).tips;
      this.data = Message.immutableCopyOf(((Builder)list).data);
    } 
  }
  
  public FrsPageUserExtend(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-355256758, "Ltbclient/FrsPageUserExtend;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-355256758, "Ltbclient/FrsPageUserExtend;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<FrsPageUserExtend> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<User> data;
    
    public String tips;
    
    public Integer user_extend_storey;
    
    public Builder() {}
    
    public Builder(FrsPageUserExtend param1FrsPageUserExtend) {
      super(param1FrsPageUserExtend);
      if (param1FrsPageUserExtend == null)
        return; 
      this.user_extend_storey = param1FrsPageUserExtend.user_extend_storey;
      this.tips = param1FrsPageUserExtend.tips;
      this.data = Message.copyOf(param1FrsPageUserExtend.data);
    }
    
    public FrsPageUserExtend build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FrsPageUserExtend)interceptResult.objValue; 
      } 
      return new FrsPageUserExtend(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
