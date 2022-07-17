package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GradePoint extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CURRENT_POINT;
  
  public static final Integer DEFAULT_NEXT_POINT;
  
  public static final String DEFAULT_POINT_NAME = "";
  
  public static final Integer DEFAULT_POINT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer current_point;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer next_point;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String point_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer point_type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1080400952, "Ltbclient/GradePoint;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1080400952, "Ltbclient/GradePoint;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_POINT_TYPE = integer;
    DEFAULT_CURRENT_POINT = integer;
    DEFAULT_NEXT_POINT = integer;
  }
  
  public GradePoint(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.point_name;
      if (str == null) {
        this.point_name = "";
      } else {
        this.point_name = str;
      } 
      Integer integer1 = paramBuilder.point_type;
      if (integer1 == null) {
        this.point_type = DEFAULT_POINT_TYPE;
      } else {
        this.point_type = integer1;
      } 
      integer1 = paramBuilder.current_point;
      if (integer1 == null) {
        this.current_point = DEFAULT_CURRENT_POINT;
      } else {
        this.current_point = integer1;
      } 
      integer = paramBuilder.next_point;
      if (integer == null) {
        this.next_point = DEFAULT_NEXT_POINT;
      } else {
        this.next_point = integer;
      } 
    } else {
      this.point_name = ((Builder)integer).point_name;
      this.point_type = ((Builder)integer).point_type;
      this.current_point = ((Builder)integer).current_point;
      this.next_point = ((Builder)integer).next_point;
    } 
  }
  
  public GradePoint(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GradePoint> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer current_point;
    
    public Integer next_point;
    
    public String point_name;
    
    public Integer point_type;
    
    public Builder() {}
    
    public Builder(GradePoint param1GradePoint) {
      super(param1GradePoint);
      if (param1GradePoint == null)
        return; 
      this.point_name = param1GradePoint.point_name;
      this.point_type = param1GradePoint.point_type;
      this.current_point = param1GradePoint.current_point;
      this.next_point = param1GradePoint.next_point;
    }
    
    public GradePoint build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GradePoint)interceptResult.objValue; 
      } 
      return new GradePoint(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
