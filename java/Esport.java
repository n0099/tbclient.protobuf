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

public final class Esport extends Message {
  public static Interceptable $ic;
  
  public static final List<EsportRank> DEFAULT_BILLBOARD;
  
  public static final Integer DEFAULT_FLOOR_NO = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final EsportStatic _static;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<EsportRank> billboard;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer floor_no;
  
  static {
    DEFAULT_BILLBOARD = Collections.emptyList();
  }
  
  public Esport(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<EsportRank> list;
    if (paramBoolean == true) {
      this._static = paramBuilder._static;
      Integer integer = paramBuilder.floor_no;
      if (integer == null) {
        this.floor_no = DEFAULT_FLOOR_NO;
      } else {
        this.floor_no = integer;
      } 
      list = paramBuilder.billboard;
      if (list == null) {
        this.billboard = DEFAULT_BILLBOARD;
      } else {
        this.billboard = Message.immutableCopyOf(list);
      } 
    } else {
      this._static = ((Builder)list)._static;
      this.floor_no = ((Builder)list).floor_no;
      this.billboard = Message.immutableCopyOf(((Builder)list).billboard);
    } 
  }
  
  public Esport(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1304816702, "Ltbclient/Esport;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1304816702, "Ltbclient/Esport;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Esport> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public EsportStatic _static;
    
    public List<EsportRank> billboard;
    
    public Integer floor_no;
    
    public Builder() {}
    
    public Builder(Esport param1Esport) {
      super(param1Esport);
      if (param1Esport == null)
        return; 
      this._static = param1Esport._static;
      this.floor_no = param1Esport.floor_no;
      this.billboard = Message.copyOf(param1Esport.billboard);
    }
    
    public Esport build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Esport)interceptResult.objValue; 
      } 
      return new Esport(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
