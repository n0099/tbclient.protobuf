package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class AlaLiveInsert extends Message {
  public static Interceptable $ic;
  
  public static final List<ThreadInfo> DEFAULT_ALA_LIVE_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> ala_live_list;
  
  public AlaLiveInsert(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThreadInfo> list;
    if (paramBoolean == true) {
      list = paramBuilder.ala_live_list;
      if (list == null) {
        this.ala_live_list = DEFAULT_ALA_LIVE_LIST;
      } else {
        this.ala_live_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.ala_live_list = Message.immutableCopyOf(((Builder)list).ala_live_list);
    } 
  }
  
  public AlaLiveInsert(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(785111811, "Ltbclient/FrsPage/AlaLiveInsert;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(785111811, "Ltbclient/FrsPage/AlaLiveInsert;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<AlaLiveInsert> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ThreadInfo> ala_live_list;
    
    public Builder() {}
    
    public Builder(AlaLiveInsert param1AlaLiveInsert) {
      super(param1AlaLiveInsert);
      if (param1AlaLiveInsert == null)
        return; 
      this.ala_live_list = Message.copyOf(param1AlaLiveInsert.ala_live_list);
    }
    
    public AlaLiveInsert build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AlaLiveInsert)interceptResult.objValue; 
      } 
      return new AlaLiveInsert(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
