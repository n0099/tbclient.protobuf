package GetSticker;

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
  public static final List<String> DEFAULT_PIC_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> pic_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      list = paramBuilder.pic_info;
      if (list == null) {
        this.pic_info = DEFAULT_PIC_INFO;
      } else {
        this.pic_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.pic_info = Message.immutableCopyOf(((Builder)list).pic_info);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1091441309, "Ltbclient/GetSticker/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1091441309, "Ltbclient/GetSticker/DataRes;");
          return;
        } 
      } 
    } 
  }
}
