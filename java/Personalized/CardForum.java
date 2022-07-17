package tbclient.Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class CardForum extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final Integer DEFAULT_CARD_TYPE;
  
  public static final List<PersonalForum> DEFAULT_FORUM_LIST = Collections.emptyList();
  
  public static final Long DEFAULT_POSITION = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
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
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.card_title;
      if (str == null) {
        this.card_title = "";
      } else {
        this.card_title = str;
      } 
      List<PersonalForum> list = paramBuilder.forum_list;
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
  
  public CardForum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<CardForum> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String card_title;
    
    public Integer card_type;
    
    public List<PersonalForum> forum_list;
    
    public Long position;
    
    public Builder() {}
    
    public Builder(CardForum param1CardForum) {
      super(param1CardForum);
      if (param1CardForum == null)
        return; 
      this.card_title = param1CardForum.card_title;
      this.forum_list = Message.copyOf(param1CardForum.forum_list);
      this.position = param1CardForum.position;
      this.card_type = param1CardForum.card_type;
    }
    
    public CardForum build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CardForum)interceptResult.objValue; 
      } 
      return new CardForum(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
