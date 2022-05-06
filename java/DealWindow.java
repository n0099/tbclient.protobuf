import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DealWindow;
import tbclient.DisplayWindowInfo;

public final class DealWindow extends Message {
  public static final List<DisplayWindowInfo> DEFAULT_LIST = Collections.emptyList();
  
  public static final Long DEFAULT_TOTAL = Long.valueOf(0L);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<DisplayWindowInfo> list;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long total;
  
  public DealWindow(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      List list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.total;
      if (long_ == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = long_;
      } 
    } else {
      this.list = Message.immutableCopyOf(((Builder)long_).list);
      this.total = ((Builder)long_).total;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1626882795, "Ltbclient/DealWindow;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1626882795, "Ltbclient/DealWindow;");
          return;
        } 
      } 
    } 
  }
}
