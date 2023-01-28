package tbclient.Personalized;

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
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.card_title;
      if (str == null) {
        this.card_title = "";
      } else {
        this.card_title = str;
      } 
      List<User> list = paramBuilder.gods;
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
  
  public CardGod(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CardGod> {
    public String card_title;
    
    public List<User> gods;
    
    public Integer position;
    
    public Builder() {}
    
    public Builder(CardGod param1CardGod) {
      super(param1CardGod);
      if (param1CardGod == null)
        return; 
      this.card_title = param1CardGod.card_title;
      this.gods = Message.copyOf(param1CardGod.gods);
      this.position = param1CardGod.position;
    }
    
    public CardGod build(boolean param1Boolean) {
      return new CardGod(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
