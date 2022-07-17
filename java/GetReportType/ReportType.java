package tbclient.GetReportType;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReportType extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_TYPE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TYPE_TEXT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String type_text;
  
  public ReportType(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type_id;
      if (integer == null) {
        this.type_id = DEFAULT_TYPE_ID;
      } else {
        this.type_id = integer;
      } 
      str = paramBuilder.type_text;
      if (str == null) {
        this.type_text = "";
      } else {
        this.type_text = str;
      } 
    } else {
      this.type_id = ((Builder)str).type_id;
      this.type_text = ((Builder)str).type_text;
    } 
  }
  
  public ReportType(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1018443112, "Ltbclient/GetReportType/ReportType;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1018443112, "Ltbclient/GetReportType/ReportType;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ReportType> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer type_id;
    
    public String type_text;
    
    public Builder() {}
    
    public Builder(ReportType param1ReportType) {
      super(param1ReportType);
      if (param1ReportType == null)
        return; 
      this.type_id = param1ReportType.type_id;
      this.type_text = param1ReportType.type_text;
    }
    
    public ReportType build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ReportType)interceptResult.objValue; 
      } 
      return new ReportType(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
