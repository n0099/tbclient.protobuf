package NewHottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.NewHottopic.TimeLineInfo;

public final class TimeLine extends Message {
  public static final List<TimeLineInfo> DEFAULT_TIMELINE_INFO = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<TimeLineInfo> timeline_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public TimeLine(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.timeline_info;
      if (list == null) {
        this.timeline_info = DEFAULT_TIMELINE_INFO;
      } else {
        this.timeline_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.timeline_info = Message.immutableCopyOf(((Builder)list).timeline_info);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2138150365, "Ltbclient/NewHottopic/TimeLine;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2138150365, "Ltbclient/NewHottopic/TimeLine;");
          return;
        } 
      } 
    } 
  }
}
