package tbclient.FrsPage;

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
  public static Interceptable $ic;
  
  public static final List<FrsTabInfo> DEFAULT_HEAD;
  
  public static final List<FrsTabInfo> DEFAULT_MENU;
  
  public static final List<FrsTabInfo> DEFAULT_TAB = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
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
    super(paramBuilder);
    List<FrsTabInfo> list;
    if (paramBoolean == true) {
      List<FrsTabInfo> list1 = paramBuilder.tab;
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
  
  public NavTabInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<NavTabInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<FrsTabInfo> head;
    
    public List<FrsTabInfo> menu;
    
    public List<FrsTabInfo> tab;
    
    public Builder() {}
    
    public Builder(NavTabInfo param1NavTabInfo) {
      super(param1NavTabInfo);
      if (param1NavTabInfo == null)
        return; 
      this.tab = Message.copyOf(param1NavTabInfo.tab);
      this.menu = Message.copyOf(param1NavTabInfo.menu);
      this.head = Message.copyOf(param1NavTabInfo.head);
    }
    
    public NavTabInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NavTabInfo)interceptResult.objValue; 
      } 
      return new NavTabInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
