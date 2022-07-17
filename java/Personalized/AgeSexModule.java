package tbclient.Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AgeSexModule extends Message {
  public static Interceptable $ic;
  
  public static final List<TagStruct> DEFAULT_AGE_TAG;
  
  public static final List<TagStruct> DEFAULT_SEX_TAG = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<TagStruct> age_tag;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<TagStruct> sex_tag;
  
  static {
    DEFAULT_AGE_TAG = Collections.emptyList();
  }
  
  public AgeSexModule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<TagStruct> list;
    if (paramBoolean == true) {
      List<TagStruct> list1 = paramBuilder.sex_tag;
      if (list1 == null) {
        this.sex_tag = DEFAULT_SEX_TAG;
      } else {
        this.sex_tag = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.age_tag;
      if (list == null) {
        this.age_tag = DEFAULT_AGE_TAG;
      } else {
        this.age_tag = Message.immutableCopyOf(list);
      } 
    } else {
      this.sex_tag = Message.immutableCopyOf(((Builder)list).sex_tag);
      this.age_tag = Message.immutableCopyOf(((Builder)list).age_tag);
    } 
  }
  
  public AgeSexModule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2083909965, "Ltbclient/Personalized/AgeSexModule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2083909965, "Ltbclient/Personalized/AgeSexModule;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<AgeSexModule> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<TagStruct> age_tag;
    
    public List<TagStruct> sex_tag;
    
    public Builder() {}
    
    public Builder(AgeSexModule param1AgeSexModule) {
      super(param1AgeSexModule);
      if (param1AgeSexModule == null)
        return; 
      this.sex_tag = Message.copyOf(param1AgeSexModule.sex_tag);
      this.age_tag = Message.copyOf(param1AgeSexModule.age_tag);
    }
    
    public AgeSexModule build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AgeSexModule)interceptResult.objValue; 
      } 
      return new AgeSexModule(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
