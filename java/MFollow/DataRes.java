package MFollow;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.MFollow.MFollowResult;

public final class DataRes extends Message {
  public static final List<MFollowResult> DEFAULT_FOLLOW_RESULTS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<MFollowResult> follow_results;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      list = paramBuilder.follow_results;
      if (list == null) {
        this.follow_results = DEFAULT_FOLLOW_RESULTS;
      } else {
        this.follow_results = Message.immutableCopyOf(list);
      } 
    } else {
      this.follow_results = Message.immutableCopyOf(((Builder)list).follow_results);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(659238880, "Ltbclient/MFollow/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(659238880, "Ltbclient/MFollow/DataRes;");
          return;
        } 
      } 
    } 
  }
}
