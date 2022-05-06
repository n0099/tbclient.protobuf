import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Esport;
import tbclient.EsportRank;
import tbclient.EsportStatic;

public final class Esport extends Message {
  public static final List<EsportRank> DEFAULT_BILLBOARD;
  
  public static final Integer DEFAULT_FLOOR_NO = Integer.valueOf(0);
  
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
    super((Message.Builder)paramBuilder);
    List list;
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
}
