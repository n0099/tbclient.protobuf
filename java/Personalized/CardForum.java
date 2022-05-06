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
import tbclient.Personalized.PersonalForum;

public final class CardForum extends Message {
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final Integer DEFAULT_CARD_TYPE;
  
  public static final List<PersonalForum> DEFAULT_FORUM_LIST = Collections.emptyList();
  
  public static final Long DEFAULT_POSITION = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer card_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PersonalForum> forum_list;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long position;
  
  static {
    DEFAULT_CARD_TYPE = Integer.valueOf(0);
  }
  
  public CardForum(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.card_title;
      if (str == null) {
        this.card_title = "";
      } else {
        this.card_title = str;
      } 
      List list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
      Long long_ = paramBuilder.position;
      if (long_ == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = long_;
      } 
      integer = paramBuilder.card_type;
      if (integer == null) {
        this.card_type = DEFAULT_CARD_TYPE;
      } else {
        this.card_type = integer;
      } 
    } else {
      this.card_title = ((Builder)integer).card_title;
      this.forum_list = Message.immutableCopyOf(((Builder)integer).forum_list);
      this.position = ((Builder)integer).position;
      this.card_type = ((Builder)integer).card_type;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-600603137, "Ltbclient/Personalized/CardForum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-600603137, "Ltbclient/Personalized/CardForum;");
          return;
        } 
      } 
    } 
  }
}
