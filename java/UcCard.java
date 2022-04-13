import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.UcCard;
import tbclient.UcCardInfo;

public final class UcCard extends Message {
  public static final String DEFAULT_DOC = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_JMP = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final List<UcCardInfo> DEFAULT_UC_CARDS = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String doc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jmp;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<UcCardInfo> uc_cards;
  
  public UcCard(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
      str = paramBuilder.doc;
      if (str == null) {
        this.doc = "";
      } else {
        this.doc = str;
      } 
      str = paramBuilder.jmp;
      if (str == null) {
        this.jmp = "";
      } else {
        this.jmp = str;
      } 
      list = paramBuilder.uc_cards;
      if (list == null) {
        this.uc_cards = DEFAULT_UC_CARDS;
      } else {
        this.uc_cards = Message.immutableCopyOf(list);
      } 
    } else {
      this.name = ((Builder)list).name;
      this.icon = ((Builder)list).icon;
      this.doc = ((Builder)list).doc;
      this.jmp = ((Builder)list).jmp;
      this.uc_cards = Message.immutableCopyOf(((Builder)list).uc_cards);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-489702125, "Ltbclient/UcCard;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-489702125, "Ltbclient/UcCard;");
          return;
        } 
      } 
    } 
  }
}
