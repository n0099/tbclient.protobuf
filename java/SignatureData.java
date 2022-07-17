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

public final class SignatureData extends Message {
  public static Interceptable $ic;
  
  public static final List<SignatureContent> DEFAULT_CONTENT;
  
  public static final String DEFAULT_FONTCOLOR = "";
  
  public static final String DEFAULT_FONTKEYNAME = "";
  
  public static final Integer DEFAULT_SIGNATURE_ID = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<SignatureContent> content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String fontColor;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String fontKeyName;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer signature_id;
  
  static {
    DEFAULT_CONTENT = Collections.emptyList();
  }
  
  public SignatureData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SignatureContent> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.signature_id;
      if (integer == null) {
        this.signature_id = DEFAULT_SIGNATURE_ID;
      } else {
        this.signature_id = integer;
      } 
      String str = paramBuilder.fontKeyName;
      if (str == null) {
        this.fontKeyName = "";
      } else {
        this.fontKeyName = str;
      } 
      str = paramBuilder.fontColor;
      if (str == null) {
        this.fontColor = "";
      } else {
        this.fontColor = str;
      } 
      list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
    } else {
      this.signature_id = ((Builder)list).signature_id;
      this.fontKeyName = ((Builder)list).fontKeyName;
      this.fontColor = ((Builder)list).fontColor;
      this.content = Message.immutableCopyOf(((Builder)list).content);
    } 
  }
  
  public SignatureData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1699571555, "Ltbclient/SignatureData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1699571555, "Ltbclient/SignatureData;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<SignatureData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<SignatureContent> content;
    
    public String fontColor;
    
    public String fontKeyName;
    
    public Integer signature_id;
    
    public Builder() {}
    
    public Builder(SignatureData param1SignatureData) {
      super(param1SignatureData);
      if (param1SignatureData == null)
        return; 
      this.signature_id = param1SignatureData.signature_id;
      this.fontKeyName = param1SignatureData.fontKeyName;
      this.fontColor = param1SignatureData.fontColor;
      this.content = Message.copyOf(param1SignatureData.content);
    }
    
    public SignatureData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SignatureData)interceptResult.objValue; 
      } 
      return new SignatureData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
