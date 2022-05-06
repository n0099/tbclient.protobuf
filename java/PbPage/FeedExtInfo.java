package PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeedExtInfo extends Message {
  public static final List<String> DEFAULT_FEED_BAR;
  
  public static final List<String> DEFAULT_FEED_TAB = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> feed_bar;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> feed_tab;
  
  static {
    DEFAULT_FEED_BAR = Collections.emptyList();
  }
  
  public FeedExtInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list1 = paramBuilder.feed_tab;
      if (list1 == null) {
        this.feed_tab = DEFAULT_FEED_TAB;
      } else {
        this.feed_tab = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.feed_bar;
      if (list == null) {
        this.feed_bar = DEFAULT_FEED_BAR;
      } else {
        this.feed_bar = Message.immutableCopyOf(list);
      } 
    } else {
      this.feed_tab = Message.immutableCopyOf(((Builder)list).feed_tab);
      this.feed_bar = Message.immutableCopyOf(((Builder)list).feed_bar);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1965433358, "Ltbclient/PbPage/FeedExtInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1965433358, "Ltbclient/PbPage/FeedExtInfo;");
          return;
        } 
      } 
    } 
  }
}
