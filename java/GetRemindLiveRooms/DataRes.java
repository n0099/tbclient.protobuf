package tbclient.GetRemindLiveRooms;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_IS_END = "";
  
  public static final List<YyLiveInfoSimple> DEFAULT_LIVE_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String is_end;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<YyLiveInfoSimple> live_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<YyLiveInfoSimple> list;
    if (paramBoolean == true) {
      String str = paramBuilder.is_end;
      if (str == null) {
        this.is_end = "";
      } else {
        this.is_end = str;
      } 
      list = paramBuilder.live_list;
      if (list == null) {
        this.live_list = DEFAULT_LIVE_LIST;
      } else {
        this.live_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.is_end = ((Builder)list).is_end;
      this.live_list = Message.immutableCopyOf(((Builder)list).live_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2060728327, "Ltbclient/GetRemindLiveRooms/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2060728327, "Ltbclient/GetRemindLiveRooms/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String is_end;
    
    public List<YyLiveInfoSimple> live_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.is_end = param1DataRes.is_end;
      this.live_list = Message.copyOf(param1DataRes.live_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
