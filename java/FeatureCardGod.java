package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeatureCardGod extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FLOOR;
  
  public static final List<User> DEFAULT_SUB_NODES = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> sub_nodes;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_FLOOR = integer;
  }
  
  public FeatureCardGod(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<User> list = paramBuilder.sub_nodes;
      if (list == null) {
        this.sub_nodes = DEFAULT_SUB_NODES;
      } else {
        this.sub_nodes = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      integer = paramBuilder.floor;
      if (integer == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.sub_nodes = Message.immutableCopyOf(((Builder)str).sub_nodes);
      this.type = ((Builder)str).type;
      this.floor = ((Builder)str).floor;
      this.title = ((Builder)str).title;
    } 
  }
  
  public FeatureCardGod(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1585142437, "Ltbclient/FeatureCardGod;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1585142437, "Ltbclient/FeatureCardGod;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<FeatureCardGod> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer floor;
    
    public List<User> sub_nodes;
    
    public String title;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FeatureCardGod param1FeatureCardGod) {
      super(param1FeatureCardGod);
      if (param1FeatureCardGod == null)
        return; 
      this.sub_nodes = Message.copyOf(param1FeatureCardGod.sub_nodes);
      this.type = param1FeatureCardGod.type;
      this.floor = param1FeatureCardGod.floor;
      this.title = param1FeatureCardGod.title;
    }
    
    public FeatureCardGod build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FeatureCardGod)interceptResult.objValue; 
      } 
      return new FeatureCardGod(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
