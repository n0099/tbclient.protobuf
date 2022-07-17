package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class EditInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_EDIT_ENABLE;
  
  public static final String DEFAULT_EDIT_ERROR_MSG = "";
  
  public static final Integer DEFAULT_EDIT_ERROR_NO;
  
  public static final Integer DEFAULT_EDIT_FROM;
  
  public static final Integer DEFAULT_EDIT_STATUS;
  
  public static final Integer DEFAULT_LAST_EDIT_TIME;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer edit_enable;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String edit_error_msg;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer edit_error_no;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer edit_from;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer edit_status;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer last_edit_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1983162439, "Ltbclient/EditInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1983162439, "Ltbclient/EditInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_EDIT_STATUS = integer;
    DEFAULT_EDIT_ENABLE = integer;
    DEFAULT_LAST_EDIT_TIME = integer;
    DEFAULT_EDIT_FROM = integer;
    DEFAULT_EDIT_ERROR_NO = integer;
  }
  
  public EditInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.edit_status;
      if (integer2 == null) {
        this.edit_status = DEFAULT_EDIT_STATUS;
      } else {
        this.edit_status = integer2;
      } 
      integer2 = paramBuilder.edit_enable;
      if (integer2 == null) {
        this.edit_enable = DEFAULT_EDIT_ENABLE;
      } else {
        this.edit_enable = integer2;
      } 
      String str = paramBuilder.edit_error_msg;
      if (str == null) {
        this.edit_error_msg = "";
      } else {
        this.edit_error_msg = str;
      } 
      Integer integer1 = paramBuilder.last_edit_time;
      if (integer1 == null) {
        this.last_edit_time = DEFAULT_LAST_EDIT_TIME;
      } else {
        this.last_edit_time = integer1;
      } 
      integer1 = paramBuilder.edit_from;
      if (integer1 == null) {
        this.edit_from = DEFAULT_EDIT_FROM;
      } else {
        this.edit_from = integer1;
      } 
      integer = paramBuilder.edit_error_no;
      if (integer == null) {
        this.edit_error_no = DEFAULT_EDIT_ERROR_NO;
      } else {
        this.edit_error_no = integer;
      } 
    } else {
      this.edit_status = ((Builder)integer).edit_status;
      this.edit_enable = ((Builder)integer).edit_enable;
      this.edit_error_msg = ((Builder)integer).edit_error_msg;
      this.last_edit_time = ((Builder)integer).last_edit_time;
      this.edit_from = ((Builder)integer).edit_from;
      this.edit_error_no = ((Builder)integer).edit_error_no;
    } 
  }
  
  public EditInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<EditInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer edit_enable;
    
    public String edit_error_msg;
    
    public Integer edit_error_no;
    
    public Integer edit_from;
    
    public Integer edit_status;
    
    public Integer last_edit_time;
    
    public Builder() {}
    
    public Builder(EditInfo param1EditInfo) {
      super(param1EditInfo);
      if (param1EditInfo == null)
        return; 
      this.edit_status = param1EditInfo.edit_status;
      this.edit_enable = param1EditInfo.edit_enable;
      this.edit_error_msg = param1EditInfo.edit_error_msg;
      this.last_edit_time = param1EditInfo.last_edit_time;
      this.edit_from = param1EditInfo.edit_from;
      this.edit_error_no = param1EditInfo.edit_error_no;
    }
    
    public EditInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (EditInfo)interceptResult.objValue; 
      } 
      return new EditInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
