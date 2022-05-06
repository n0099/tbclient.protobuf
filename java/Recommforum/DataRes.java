package Recommforum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Recommforum.RecommForum;
import tbclient.Recommforum.TestInfo;

public final class DataRes extends Message {
  public static final List<RecommForum> DEFAULT_RECOMM_FORUM;
  
  public static final List<TestInfo> DEFAULT_TEST_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecommForum> recomm_forum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<TestInfo> test_info;
  
  static {
    DEFAULT_RECOMM_FORUM = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list1 = paramBuilder.test_info;
      if (list1 == null) {
        this.test_info = DEFAULT_TEST_INFO;
      } else {
        this.test_info = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.recomm_forum;
      if (list == null) {
        this.recomm_forum = DEFAULT_RECOMM_FORUM;
      } else {
        this.recomm_forum = Message.immutableCopyOf(list);
      } 
    } else {
      this.test_info = Message.immutableCopyOf(((Builder)list).test_info);
      this.recomm_forum = Message.immutableCopyOf(((Builder)list).recomm_forum);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(112736540, "Ltbclient/Recommforum/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(112736540, "Ltbclient/Recommforum/DataRes;");
          return;
        } 
      } 
    } 
  }
}
