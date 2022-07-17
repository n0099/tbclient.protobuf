package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Manager extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_SHOW_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String show_name;
  
  public Manager(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.show_name;
      if (str1 == null) {
        this.show_name = "";
      } else {
        this.show_name = str1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
      this.show_name = ((Builder)str).show_name;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  public Manager(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1391212753, "Ltbclient/FrsPage/Manager;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1391212753, "Ltbclient/FrsPage/Manager;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Manager> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long id;
    
    public String name;
    
    public String portrait;
    
    public String show_name;
    
    public Builder() {}
    
    public Builder(Manager param1Manager) {
      super(param1Manager);
      if (param1Manager == null)
        return; 
      this.id = param1Manager.id;
      this.name = param1Manager.name;
      this.show_name = param1Manager.show_name;
      this.portrait = param1Manager.portrait;
    }
    
    public Manager build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Manager)interceptResult.objValue; 
      } 
      return new Manager(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
