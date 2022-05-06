package GetBarrageList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetBarrageList.Barrage;

public final class BarrageItem extends Message {
  public static final List<Barrage> DEFAULT_LIST;
  
  public static final Double DEFAULT_TIME = Double.valueOf(0.0D);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Barrage> list;
  
  @ProtoField(tag = 1, type = Message.Datatype.DOUBLE)
  public final Double time;
  
  static {
    DEFAULT_LIST = Collections.emptyList();
  }
  
  public BarrageItem(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
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
}
