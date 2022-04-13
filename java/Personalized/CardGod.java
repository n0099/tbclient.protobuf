package Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;

public final class CardGod extends Message {
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final List<User> DEFAULT_GODS = Collections.emptyList();
  
  public static final Integer DEFAULT_POSITION = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<User> gods;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer position;
  
  public CardGod(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.card_title;
      if (str == null) {
        this.card_title = "";
      } else {
        this.card_title = str;
      } 
      List list = paramBuilder.gods;
      if (list == null) {
        this.gods = DEFAULT_GODS;
      } else {
        this.gods = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.position;
      if (integer == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = integer;
      } 
    } else {
      this.card_title = ((Builder)integer).card_title;
      this.gods = Message.immutableCopyOf(((Builder)integer).gods);
      this.position = ((Builder)integer).position;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2099960644, "Ltbclient/Personalized/CardGod;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2099960644, "Ltbclient/Personalized/CardGod;");
          return;
        } 
      } 
    } 
  }
}
