package tbclient.PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbSortType extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_SORT_NAME = "";
  
  public static final Integer DEFAULT_SORT_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sort_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  public PbSortType(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.sort_type;
      if (integer == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer;
      } 
      str = paramBuilder.sort_name;
      if (str == null) {
        this.sort_name = "";
      } else {
        this.sort_name = str;
      } 
    } else {
      this.sort_type = ((Builder)str).sort_type;
      this.sort_name = ((Builder)str).sort_name;
    } 
  }
  
  public PbSortType(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-77819827, "Ltbclient/PbPage/PbSortType;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-77819827, "Ltbclient/PbPage/PbSortType;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<PbSortType> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String sort_name;
    
    public Integer sort_type;
    
    public Builder() {}
    
    public Builder(PbSortType param1PbSortType) {
      super(param1PbSortType);
      if (param1PbSortType == null)
        return; 
      this.sort_type = param1PbSortType.sort_type;
      this.sort_name = param1PbSortType.sort_name;
    }
    
    public PbSortType build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PbSortType)interceptResult.objValue; 
      } 
      return new PbSortType(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
