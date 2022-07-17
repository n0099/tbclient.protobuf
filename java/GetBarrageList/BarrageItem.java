package tbclient.GetBarrageList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BarrageItem extends Message {
  public static Interceptable $ic;
  
  public static final List<Barrage> DEFAULT_LIST;
  
  public static final Double DEFAULT_TIME = Double.valueOf(0.0D);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Barrage> list;
  
  @ProtoField(tag = 1, type = Message.Datatype.DOUBLE)
  public final Double time;
  
  static {
    DEFAULT_LIST = Collections.emptyList();
  }
  
  public BarrageItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Barrage> list;
    if (paramBoolean == true) {
      Double double_ = paramBuilder.time;
      if (double_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = double_;
      } 
      list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
    } else {
      this.time = ((Builder)list).time;
      this.list = Message.immutableCopyOf(((Builder)list).list);
    } 
  }
  
  public BarrageItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1558851643, "Ltbclient/GetBarrageList/BarrageItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1558851643, "Ltbclient/GetBarrageList/BarrageItem;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BarrageItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<Barrage> list;
    
    public Double time;
    
    public Builder() {}
    
    public Builder(BarrageItem param1BarrageItem) {
      super(param1BarrageItem);
      if (param1BarrageItem == null)
        return; 
      this.time = param1BarrageItem.time;
      this.list = Message.copyOf(param1BarrageItem.list);
    }
    
    public BarrageItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BarrageItem)interceptResult.objValue; 
      } 
      return new BarrageItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
