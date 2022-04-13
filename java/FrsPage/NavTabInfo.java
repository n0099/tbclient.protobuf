package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;

public final class NavTabInfo extends Message {
  public static final List<FrsTabInfo> DEFAULT_HEAD;
  
  public static final List<FrsTabInfo> DEFAULT_MENU;
  
  public static final List<FrsTabInfo> DEFAULT_TAB = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FrsTabInfo> head;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FrsTabInfo> menu;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FrsTabInfo> tab;
  
  static {
    DEFAULT_MENU = Collections.emptyList();
    DEFAULT_HEAD = Collections.emptyList();
  }
  
  public NavTabInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list1 = paramBuilder.tab;
      if (list1 == null) {
        this.tab = DEFAULT_TAB;
      } else {
        this.tab = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.menu;
      if (list1 == null) {
        this.menu = DEFAULT_MENU;
      } else {
        this.menu = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.head;
      if (list == null) {
        this.head = DEFAULT_HEAD;
      } else {
        this.head = Message.immutableCopyOf(list);
      } 
    } else {
      this.tab = Message.immutableCopyOf(((Builder)list).tab);
      this.menu = Message.immutableCopyOf(((Builder)list).menu);
      this.head = Message.immutableCopyOf(((Builder)list).head);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2069084024, "Ltbclient/FrsPage/NavTabInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2069084024, "Ltbclient/FrsPage/NavTabInfo;");
          return;
        } 
      } 
    } 
  }
}
