package tbclient.ForumTabList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Tab extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_SEQ = "";
  
  public static final Long DEFAULT_TAB_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String seq;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long tab_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tab_name;
  
  public Tab(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tab_id;
      if (long_ == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = long_;
      } 
      String str1 = paramBuilder.tab_name;
      if (str1 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str1;
      } 
      str = paramBuilder.seq;
      if (str == null) {
        this.seq = "";
      } else {
        this.seq = str;
      } 
    } else {
      this.tab_id = ((Builder)str).tab_id;
      this.tab_name = ((Builder)str).tab_name;
      this.seq = ((Builder)str).seq;
    } 
  }
  
  public Tab(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1957618233, "Ltbclient/ForumTabList/Tab;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1957618233, "Ltbclient/ForumTabList/Tab;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Tab> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String seq;
    
    public Long tab_id;
    
    public String tab_name;
    
    public Builder() {}
    
    public Builder(Tab param1Tab) {
      super(param1Tab);
      if (param1Tab == null)
        return; 
      this.tab_id = param1Tab.tab_id;
      this.tab_name = param1Tab.tab_name;
      this.seq = param1Tab.seq;
    }
    
    public Tab build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Tab)interceptResult.objValue; 
      } 
      return new Tab(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
