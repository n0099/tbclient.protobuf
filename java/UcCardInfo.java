package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UcCardInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_JMP = "";
  
  public static final String DEFAULT_PIC = "";
  
  public static final Integer DEFAULT_ST = Integer.valueOf(0);
  
  public static final String DEFAULT_TIP = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jmp;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer st;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tip;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public UcCardInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
      str = paramBuilder.jmp;
      if (str == null) {
        this.jmp = "";
      } else {
        this.jmp = str;
      } 
      str = paramBuilder.tip;
      if (str == null) {
        this.tip = "";
      } else {
        this.tip = str;
      } 
      integer = paramBuilder.st;
      if (integer == null) {
        this.st = DEFAULT_ST;
      } else {
        this.st = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.pic = ((Builder)integer).pic;
      this.jmp = ((Builder)integer).jmp;
      this.tip = ((Builder)integer).tip;
      this.st = ((Builder)integer).st;
    } 
  }
  
  public UcCardInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1286459909, "Ltbclient/UcCardInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1286459909, "Ltbclient/UcCardInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<UcCardInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String jmp;
    
    public String pic;
    
    public Integer st;
    
    public String tip;
    
    public String title;
    
    public Builder() {}
    
    public Builder(UcCardInfo param1UcCardInfo) {
      super(param1UcCardInfo);
      if (param1UcCardInfo == null)
        return; 
      this.title = param1UcCardInfo.title;
      this.pic = param1UcCardInfo.pic;
      this.jmp = param1UcCardInfo.jmp;
      this.tip = param1UcCardInfo.tip;
      this.st = param1UcCardInfo.st;
    }
    
    public UcCardInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UcCardInfo)interceptResult.objValue; 
      } 
      return new UcCardInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
