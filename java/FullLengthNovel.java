package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FullLengthNovel extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_BUTTON_HEIGH = Integer.valueOf(0);
  
  public static final String DEFAULT_HAS_TRUNCATE = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer button_heigh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String has_truncate;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String schema;
  
  public FullLengthNovel(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      str = paramBuilder.has_truncate;
      if (str == null) {
        this.has_truncate = "";
      } else {
        this.has_truncate = str;
      } 
      integer = paramBuilder.button_heigh;
      if (integer == null) {
        this.button_heigh = DEFAULT_BUTTON_HEIGH;
      } else {
        this.button_heigh = integer;
      } 
    } else {
      this.schema = ((Builder)integer).schema;
      this.has_truncate = ((Builder)integer).has_truncate;
      this.button_heigh = ((Builder)integer).button_heigh;
    } 
  }
  
  public FullLengthNovel(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1816235746, "Ltbclient/FullLengthNovel;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1816235746, "Ltbclient/FullLengthNovel;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<FullLengthNovel> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer button_heigh;
    
    public String has_truncate;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FullLengthNovel param1FullLengthNovel) {
      super(param1FullLengthNovel);
      if (param1FullLengthNovel == null)
        return; 
      this.schema = param1FullLengthNovel.schema;
      this.has_truncate = param1FullLengthNovel.has_truncate;
      this.button_heigh = param1FullLengthNovel.button_heigh;
    }
    
    public FullLengthNovel build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FullLengthNovel)interceptResult.objValue; 
      } 
      return new FullLengthNovel(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
