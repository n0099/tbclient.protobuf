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

public final class DiscoverHotForum extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FLOOR;
  
  public static final List<DiscoverTabCard> DEFAULT_TAB_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<DiscoverTabCard> tab_list;
  
  static {
    DEFAULT_FLOOR = Integer.valueOf(0);
  }
  
  public DiscoverHotForum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<DiscoverTabCard> list = paramBuilder.tab_list;
      if (list == null) {
        this.tab_list = DEFAULT_TAB_LIST;
      } else {
        this.tab_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.floor;
      if (integer == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer;
      } 
    } else {
      this.tab_list = Message.immutableCopyOf(((Builder)integer).tab_list);
      this.floor = ((Builder)integer).floor;
    } 
  }
  
  public DiscoverHotForum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2060746668, "Ltbclient/DiscoverHotForum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2060746668, "Ltbclient/DiscoverHotForum;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DiscoverHotForum> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer floor;
    
    public List<DiscoverTabCard> tab_list;
    
    public Builder() {}
    
    public Builder(DiscoverHotForum param1DiscoverHotForum) {
      super(param1DiscoverHotForum);
      if (param1DiscoverHotForum == null)
        return; 
      this.tab_list = Message.copyOf(param1DiscoverHotForum.tab_list);
      this.floor = param1DiscoverHotForum.floor;
    }
    
    public DiscoverHotForum build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DiscoverHotForum)interceptResult.objValue; 
      } 
      return new DiscoverHotForum(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
