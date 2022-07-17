package tbclient.GetForumBroadcastList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BroadcastInfo;
import tbclient.Page;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<BroadcastInfo> DEFAULT_BCAST_INFOS = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<BroadcastInfo> bcast_infos;
  
  @ProtoField(tag = 3)
  public final Page page;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<BroadcastInfo> list = paramBuilder.bcast_infos;
      if (list == null) {
        this.bcast_infos = DEFAULT_BCAST_INFOS;
      } else {
        this.bcast_infos = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
    } else {
      this.bcast_infos = Message.immutableCopyOf(paramBuilder.bcast_infos);
      this.page = paramBuilder.page;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2068175434, "Ltbclient/GetForumBroadcastList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2068175434, "Ltbclient/GetForumBroadcastList/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<BroadcastInfo> bcast_infos;
    
    public Page page;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.bcast_infos = Message.copyOf(param1DataRes.bcast_infos);
      this.page = param1DataRes.page;
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
