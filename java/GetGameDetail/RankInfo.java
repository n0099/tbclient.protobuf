package tbclient.GetGameDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RankInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<RankItem> DEFAULT_RANK_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RankItem> rank_list;
  
  public RankInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<RankItem> list;
    if (paramBoolean == true) {
      list = paramBuilder.rank_list;
      if (list == null) {
        this.rank_list = DEFAULT_RANK_LIST;
      } else {
        this.rank_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.rank_list = Message.immutableCopyOf(((Builder)list).rank_list);
    } 
  }
  
  public RankInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1617880193, "Ltbclient/GetGameDetail/RankInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1617880193, "Ltbclient/GetGameDetail/RankInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<RankInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<RankItem> rank_list;
    
    public Builder() {}
    
    public Builder(RankInfo param1RankInfo) {
      super(param1RankInfo);
      if (param1RankInfo == null)
        return; 
      this.rank_list = Message.copyOf(param1RankInfo.rank_list);
    }
    
    public RankInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RankInfo)interceptResult.objValue; 
      } 
      return new RankInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
